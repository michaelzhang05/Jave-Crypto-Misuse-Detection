package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;
    private Prefetcher prefetcher;

    /* loaded from: classes.dex */
    public interface PrefetchHandle {
        void cancel();
    }

    /* loaded from: classes.dex */
    public interface Prefetcher {
        /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
        PrefetchHandle mo758schedulePrefetch0kLqBqw(int i8, long j8);
    }

    public final Prefetcher getPrefetcher$foundation_release() {
        return this.prefetcher;
    }

    /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
    public final PrefetchHandle m757schedulePrefetch0kLqBqw(int i8, long j8) {
        PrefetchHandle mo758schedulePrefetch0kLqBqw;
        Prefetcher prefetcher = this.prefetcher;
        if (prefetcher == null || (mo758schedulePrefetch0kLqBqw = prefetcher.mo758schedulePrefetch0kLqBqw(i8, j8)) == null) {
            return DummyHandle.INSTANCE;
        }
        return mo758schedulePrefetch0kLqBqw;
    }

    public final void setPrefetcher$foundation_release(Prefetcher prefetcher) {
        this.prefetcher = prefetcher;
    }
}
