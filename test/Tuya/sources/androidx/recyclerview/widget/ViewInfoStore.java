package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ViewInfoStore {
    private static final boolean DEBUG = false;

    @VisibleForTesting
    final SimpleArrayMap<RecyclerView.ViewHolder, InfoRecord> mLayoutHolderMap = new SimpleArrayMap<>();

    @VisibleForTesting
    final LongSparseArray<RecyclerView.ViewHolder> mOldChangedHolders = new LongSparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class InfoRecord {
        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        static Pools.Pool<InfoRecord> sPool = new Pools.SimplePool(20);
        int flags;

        @Nullable
        RecyclerView.ItemAnimator.ItemHolderInfo postInfo;

        @Nullable
        RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        static void drainCache() {
            do {
            } while (sPool.acquire() != null);
        }

        static InfoRecord obtain() {
            InfoRecord acquire = sPool.acquire();
            if (acquire == null) {
                return new InfoRecord();
            }
            return acquire;
        }

        static void recycle(InfoRecord infoRecord) {
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.release(infoRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface ProcessCallback {
        void processAppeared(RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processDisappeared(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processPersistent(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void unused(RecyclerView.ViewHolder viewHolder);
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewHolder, int i8) {
        InfoRecord valueAt;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int indexOfKey = this.mLayoutHolderMap.indexOfKey(viewHolder);
        if (indexOfKey >= 0 && (valueAt = this.mLayoutHolderMap.valueAt(indexOfKey)) != null) {
            int i9 = valueAt.flags;
            if ((i9 & i8) != 0) {
                int i10 = (~i8) & i9;
                valueAt.flags = i10;
                if (i8 == 4) {
                    itemHolderInfo = valueAt.preInfo;
                } else if (i8 == 8) {
                    itemHolderInfo = valueAt.postInfo;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i10 & 12) == 0) {
                    this.mLayoutHolderMap.removeAt(indexOfKey);
                    InfoRecord.recycle(valueAt);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.flags |= 2;
        infoRecord.preInfo = itemHolderInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addToDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.flags |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addToOldChangeHolders(long j8, RecyclerView.ViewHolder viewHolder) {
        this.mOldChangedHolders.put(j8, viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addToPostLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.postInfo = itemHolderInfo;
        infoRecord.flags |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addToPreLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.preInfo = itemHolderInfo;
        infoRecord.flags |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.ViewHolder getFromOldChangeHolders(long j8) {
        return this.mOldChangedHolders.get(j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isDisappearing(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord != null && (infoRecord.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isInPreLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord != null && (infoRecord.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDetach() {
        InfoRecord.drainCache();
    }

    public void onViewDetached(RecyclerView.ViewHolder viewHolder) {
        removeFromDisappearedInLayout(viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void process(ProcessCallback processCallback) {
        for (int size = this.mLayoutHolderMap.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder keyAt = this.mLayoutHolderMap.keyAt(size);
            InfoRecord removeAt = this.mLayoutHolderMap.removeAt(size);
            int i8 = removeAt.flags;
            if ((i8 & 3) == 3) {
                processCallback.unused(keyAt);
            } else if ((i8 & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = removeAt.preInfo;
                if (itemHolderInfo == null) {
                    processCallback.unused(keyAt);
                } else {
                    processCallback.processDisappeared(keyAt, itemHolderInfo, removeAt.postInfo);
                }
            } else if ((i8 & 14) == 14) {
                processCallback.processAppeared(keyAt, removeAt.preInfo, removeAt.postInfo);
            } else if ((i8 & 12) == 12) {
                processCallback.processPersistent(keyAt, removeAt.preInfo, removeAt.postInfo);
            } else if ((i8 & 4) != 0) {
                processCallback.processDisappeared(keyAt, removeAt.preInfo, null);
            } else if ((i8 & 8) != 0) {
                processCallback.processAppeared(keyAt, removeAt.preInfo, removeAt.postInfo);
            }
            InfoRecord.recycle(removeAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.flags &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeViewHolder(RecyclerView.ViewHolder viewHolder) {
        int size = this.mOldChangedHolders.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (viewHolder == this.mOldChangedHolders.valueAt(size)) {
                this.mOldChangedHolders.removeAt(size);
                break;
            }
            size--;
        }
        InfoRecord remove = this.mLayoutHolderMap.remove(viewHolder);
        if (remove != null) {
            InfoRecord.recycle(remove);
        }
    }
}