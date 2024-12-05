package androidx.lifecycle;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.lifecycle.Lifecycle;
import l6.AbstractC3360i;
import l6.InterfaceC3390x0;
import l6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    final /* synthetic */ InterfaceC1668n $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        super(2, dVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = interfaceC1668n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, dVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        Object e8 = T5.b.e();
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
            InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) ((M) this.L$0).getCoroutineContext().get(InterfaceC3390x0.f34661n0);
            if (interfaceC3390x0 != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC3390x0);
                try {
                    InterfaceC1668n interfaceC1668n = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = AbstractC3360i.g(pausingDispatcher, interfaceC1668n, this);
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

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, S5.d dVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
