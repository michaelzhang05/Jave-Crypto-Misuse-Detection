package cm.aptoide.pt.search.view;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c0;
import androidx.recyclerview.widget.f;
import cm.aptoide.pt.search.view.DiffUtilAdapter;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: DiffUtilAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u001e\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0016\u0010\u001b\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcm/aptoide/pt/search/view/DiffUtilAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "diffUtilThread", "Ljava/lang/Thread;", "getDiffUtilThread", "()Ljava/lang/Thread;", "setDiffUtilThread", "(Ljava/lang/Thread;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "pendingUpdates", "Ljava/util/Queue;", "Lcm/aptoide/pt/search/view/DiffUtilAdapter$DiffRequest;", "applyDiffUtil", HttpUrl.FRAGMENT_ENCODE_SET, "diffRequest", "dispatchUpdates", "newItems", HttpUrl.FRAGMENT_ENCODE_SET, "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "internalApplyDiffUtil", "DiffRequest", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DiffUtilAdapter<T, VH extends RecyclerView.c0> extends RecyclerView.g<VH> {
    private final Queue<DiffRequest<T>> pendingUpdates = new ArrayDeque();
    private Thread diffUtilThread = new Thread();
    private final Handler handler = new Handler();

    /* compiled from: DiffUtilAdapter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcm/aptoide/pt/search/view/DiffUtilAdapter$DiffRequest;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "newItems", HttpUrl.FRAGMENT_ENCODE_SET, "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "(Ljava/util/List;Landroidx/recyclerview/widget/DiffUtil$Callback;)V", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$Callback;", "getNewItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class DiffRequest<T> {
        private final f.b diffCallback;
        private final List<T> newItems;

        /* JADX WARN: Multi-variable type inference failed */
        public DiffRequest(List<? extends T> list, f.b bVar) {
            kotlin.jvm.internal.l.f(list, "newItems");
            kotlin.jvm.internal.l.f(bVar, "diffCallback");
            this.newItems = list;
            this.diffCallback = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DiffRequest copy$default(DiffRequest diffRequest, List list, f.b bVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = diffRequest.newItems;
            }
            if ((i2 & 2) != 0) {
                bVar = diffRequest.diffCallback;
            }
            return diffRequest.copy(list, bVar);
        }

        public final List<T> component1() {
            return this.newItems;
        }

        /* renamed from: component2, reason: from getter */
        public final f.b getDiffCallback() {
            return this.diffCallback;
        }

        public final DiffRequest<T> copy(List<? extends T> list, f.b bVar) {
            kotlin.jvm.internal.l.f(list, "newItems");
            kotlin.jvm.internal.l.f(bVar, "diffCallback");
            return new DiffRequest<>(list, bVar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DiffRequest)) {
                return false;
            }
            DiffRequest diffRequest = (DiffRequest) other;
            return kotlin.jvm.internal.l.a(this.newItems, diffRequest.newItems) && kotlin.jvm.internal.l.a(this.diffCallback, diffRequest.diffCallback);
        }

        public final f.b getDiffCallback() {
            return this.diffCallback;
        }

        public final List<T> getNewItems() {
            return this.newItems;
        }

        public int hashCode() {
            return (this.newItems.hashCode() * 31) + this.diffCallback.hashCode();
        }

        public String toString() {
            return "DiffRequest(newItems=" + this.newItems + ", diffCallback=" + this.diffCallback + ')';
        }
    }

    private final void internalApplyDiffUtil(final DiffRequest<T> diffRequest) {
        Thread thread = new Thread(new Runnable() { // from class: cm.aptoide.pt.search.view.u
            @Override // java.lang.Runnable
            public final void run() {
                DiffUtilAdapter.m308internalApplyDiffUtil$lambda1(DiffUtilAdapter.DiffRequest.this, this);
            }
        });
        this.diffUtilThread = thread;
        if (thread != null) {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: internalApplyDiffUtil$lambda-1, reason: not valid java name */
    public static final void m308internalApplyDiffUtil$lambda1(final DiffRequest diffRequest, final DiffUtilAdapter diffUtilAdapter) {
        kotlin.jvm.internal.l.f(diffRequest, "$diffRequest");
        kotlin.jvm.internal.l.f(diffUtilAdapter, "this$0");
        final f.c a = androidx.recyclerview.widget.f.a(diffRequest.getDiffCallback());
        kotlin.jvm.internal.l.e(a, "calculateDiff(diffRequest.diffCallback)");
        diffUtilAdapter.handler.post(new Runnable() { // from class: cm.aptoide.pt.search.view.t
            @Override // java.lang.Runnable
            public final void run() {
                DiffUtilAdapter.m309internalApplyDiffUtil$lambda1$lambda0(DiffUtilAdapter.this, diffRequest, a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: internalApplyDiffUtil$lambda-1$lambda-0, reason: not valid java name */
    public static final void m309internalApplyDiffUtil$lambda1$lambda0(DiffUtilAdapter diffUtilAdapter, DiffRequest diffRequest, f.c cVar) {
        kotlin.jvm.internal.l.f(diffUtilAdapter, "this$0");
        kotlin.jvm.internal.l.f(diffRequest, "$diffRequest");
        kotlin.jvm.internal.l.f(cVar, "$result");
        diffUtilAdapter.pendingUpdates.remove();
        diffUtilAdapter.dispatchUpdates(diffRequest.getNewItems(), cVar);
        if (diffUtilAdapter.pendingUpdates.size() > 0) {
            DiffRequest<T> peek = diffUtilAdapter.pendingUpdates.peek();
            kotlin.jvm.internal.l.e(peek, "pendingUpdates.peek()");
            diffUtilAdapter.internalApplyDiffUtil(peek);
        }
    }

    public final void applyDiffUtil(DiffRequest<T> diffRequest) {
        kotlin.jvm.internal.l.f(diffRequest, "diffRequest");
        this.pendingUpdates.add(diffRequest);
        if (this.pendingUpdates.size() > 1) {
            return;
        }
        internalApplyDiffUtil(diffRequest);
    }

    public abstract void dispatchUpdates(List<? extends T> list, f.c cVar);

    public final Thread getDiffUtilThread() {
        return this.diffUtilThread;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void setDiffUtilThread(Thread thread) {
        this.diffUtilThread = thread;
    }
}
