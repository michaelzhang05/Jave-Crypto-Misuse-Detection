package androidx.lifecycle;

import L5.I;
import android.annotation.SuppressLint;
import i6.AbstractC2825i;
import i6.C2812b0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final P5.g coroutineContext;
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(CoroutineLiveData<T> target, P5.g context) {
        AbstractC3159y.i(target, "target");
        AbstractC3159y.i(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(C2812b0.c().G());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t8, P5.d dVar) {
        Object g8 = AbstractC2825i.g(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, t8, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, P5.d dVar) {
        return AbstractC2825i.g(this.coroutineContext, new LiveDataScopeImpl$emitSource$2(this, liveData, null), dVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        AbstractC3159y.i(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
