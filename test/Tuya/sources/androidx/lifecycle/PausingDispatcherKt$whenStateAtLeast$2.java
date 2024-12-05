package androidx.lifecycle;

import L5.I;
import L5.t;
import androidx.lifecycle.Lifecycle;
import i6.AbstractC2825i;
import i6.InterfaceC2855x0;
import i6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ X5.n $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, X5.n nVar, P5.d dVar) {
        super(2, dVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, dVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    t.b(obj);
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) ((M) this.L$0).getCoroutineContext().get(InterfaceC2855x0.f31809n0);
            if (interfaceC2855x0 != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC2855x0);
                try {
                    X5.n nVar = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = AbstractC2825i.g(pausingDispatcher, nVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        }
        lifecycleController.finish();
        return obj;
    }
}
