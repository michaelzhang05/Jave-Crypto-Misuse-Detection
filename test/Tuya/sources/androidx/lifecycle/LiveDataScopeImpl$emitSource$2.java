package androidx.lifecycle;

import L5.I;
import L5.t;
import i6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LiveDataScopeImpl$emitSource$2 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ LiveData<T> $source;
    int label;
    final /* synthetic */ LiveDataScopeImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emitSource$2(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, P5.d dVar) {
        super(2, dVar);
        this.this$0 = liveDataScopeImpl;
        this.$source = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new LiveDataScopeImpl$emitSource$2(this.this$0, this.$source, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((LiveDataScopeImpl$emitSource$2) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            CoroutineLiveData target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            Object obj2 = this.$source;
            this.label = 1;
            obj = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(obj2, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
