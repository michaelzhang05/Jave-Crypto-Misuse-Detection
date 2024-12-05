package androidx.compose.foundation.lazy.staggeredgrid;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.C1238k;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {
    public static final Companion Companion = new Companion(null);
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;
    private int[] lanes = new int[16];
    private final C1238k spannedItems = new C1238k();

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int i8, int[] gaps) {
            AbstractC3159y.i(gaps, "gaps");
            this.index = i8;
            this.gaps = gaps;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] iArr) {
            AbstractC3159y.i(iArr, "<set-?>");
            this.gaps = iArr;
        }
    }

    private final void ensureCapacity(int i8, int i9) {
        if (i8 <= 131072) {
            int[] iArr = this.lanes;
            if (iArr.length < i8) {
                int length = iArr.length;
                while (length < i8) {
                    length *= 2;
                }
                this.lanes = AbstractC1239l.l(this.lanes, new int[length], i9, 0, 0, 12, null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Requested item capacity " + i8 + " is larger than max supported: 131072!").toString());
    }

    static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i8, i9);
    }

    public final boolean assignedToLane(int i8, int i9) {
        int lane = getLane(i8);
        if (lane != i9 && lane != -1 && lane != -2) {
            return false;
        }
        return true;
    }

    public final void ensureValidIndex(int i8) {
        int i9 = this.anchor;
        int i10 = i8 - i9;
        if (i10 >= 0 && i10 < 131072) {
            ensureCapacity$default(this, i10 + 1, 0, 2, null);
        } else {
            int max = Math.max(i8 - (this.lanes.length / 2), 0);
            this.anchor = max;
            int i11 = max - i9;
            if (i11 >= 0) {
                int[] iArr = this.lanes;
                if (i11 < iArr.length) {
                    AbstractC1239l.g(iArr, iArr, 0, i11, iArr.length);
                }
                int[] iArr2 = this.lanes;
                AbstractC1239l.r(iArr2, 0, Math.max(0, iArr2.length - i11), this.lanes.length);
            } else {
                int i12 = -i11;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i12 < 131072) {
                    ensureCapacity(iArr3.length + i12 + 1, i12);
                } else {
                    if (i12 < iArr3.length) {
                        AbstractC1239l.g(iArr3, iArr3, i12, 0, iArr3.length - i12);
                    }
                    int[] iArr4 = this.lanes;
                    AbstractC1239l.r(iArr4, 0, 0, Math.min(iArr4.length, i12));
                }
            }
        }
        while ((!this.spannedItems.isEmpty()) && ((SpannedItem) this.spannedItems.first()).getIndex() < lowerBound()) {
            this.spannedItems.w();
        }
        while ((!this.spannedItems.isEmpty()) && ((SpannedItem) this.spannedItems.last()).getIndex() > upperBound()) {
            this.spannedItems.y();
        }
    }

    public final int findNextItemIndex(int i8, int i9) {
        int upperBound = upperBound();
        for (int i10 = i8 + 1; i10 < upperBound; i10++) {
            if (assignedToLane(i10, i9)) {
                return i10;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int i8, int i9) {
        do {
            i8--;
            if (-1 >= i8) {
                return -1;
            }
        } while (!assignedToLane(i8, i9));
        return i8;
    }

    public final int[] getGaps(int i8) {
        C1238k c1238k = this.spannedItems;
        SpannedItem spannedItem = (SpannedItem) AbstractC1246t.p0(this.spannedItems, AbstractC1246t.i(c1238k, 0, c1238k.size(), new LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(Integer.valueOf(i8))));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int getLane(int i8) {
        if (i8 >= lowerBound() && i8 < upperBound()) {
            return this.lanes[i8 - this.anchor] - 1;
        }
        return -1;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        AbstractC1239l.v(this.lanes, 0, 0, 0, 6, null);
        this.spannedItems.clear();
    }

    public final void setGaps(int i8, int[] iArr) {
        C1238k c1238k = this.spannedItems;
        int i9 = AbstractC1246t.i(c1238k, 0, c1238k.size(), new LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1(Integer.valueOf(i8)));
        if (i9 < 0) {
            if (iArr == null) {
                return;
            }
            this.spannedItems.add(-(i9 + 1), new SpannedItem(i8, iArr));
            return;
        }
        if (iArr == null) {
            this.spannedItems.remove(i9);
        } else {
            ((SpannedItem) this.spannedItems.get(i9)).setGaps(iArr);
        }
    }

    public final void setLane(int i8, int i9) {
        if (i8 >= 0) {
            ensureValidIndex(i8);
            this.lanes[i8 - this.anchor] = i9 + 1;
            return;
        }
        throw new IllegalArgumentException("Negative lanes are not supported".toString());
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }
}
