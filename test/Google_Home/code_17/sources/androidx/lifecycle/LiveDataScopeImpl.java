package androidx.lifecycle;

import O5.I;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.C3347b0;

/* loaded from: classes3.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final S5.g coroutineContext;
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(CoroutineLiveData<T> target, S5.g context) {
        AbstractC3255y.i(target, "target");
        AbstractC3255y.i(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(C3347b0.c().G());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t8, S5.d dVar) {
        Object g8 = AbstractC3360i.g(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, t8, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, S5.d dVar) {
        return AbstractC3360i.g(this.coroutineContext, new LiveDataScopeImpl$emitSource$2(this, liveData, null), dVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        AbstractC3255y.i(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
