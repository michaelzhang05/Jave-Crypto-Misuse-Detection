package androidx.lifecycle.viewmodel.internal;

import P5.g;
import i6.D0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScope implements AutoCloseable, M {
    private final g coroutineContext;

    public CloseableCoroutineScope(g coroutineContext) {
        AbstractC3159y.i(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        D0.e(getCoroutineContext(), null, 1, null);
    }

    @Override // i6.M
    public g getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(M coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        AbstractC3159y.i(coroutineScope, "coroutineScope");
    }
}
