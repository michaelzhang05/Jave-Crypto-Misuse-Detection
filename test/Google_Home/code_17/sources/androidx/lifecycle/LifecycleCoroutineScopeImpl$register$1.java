package androidx.lifecycle;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.lifecycle.Lifecycle;
import l6.D0;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LifecycleCoroutineScopeImpl$register$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, S5.d dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, dVar);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        T5.b.e();
        if (this.label == 0) {
            t.b(obj);
            M m8 = (M) this.L$0;
            if (this.this$0.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) < 0) {
                D0.e(m8.getCoroutineContext(), null, 1, null);
            } else {
                this.this$0.getLifecycle$lifecycle_common().addObserver(this.this$0);
            }
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, S5.d dVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
