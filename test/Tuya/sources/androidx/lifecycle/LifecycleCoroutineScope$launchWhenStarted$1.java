package androidx.lifecycle;

import L5.I;
import L5.t;
import i6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LifecycleCoroutineScope$launchWhenStarted$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ X5.n $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenStarted$1(LifecycleCoroutineScope lifecycleCoroutineScope, X5.n nVar, P5.d dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.this$0, this.$block, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((LifecycleCoroutineScope$launchWhenStarted$1) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            Lifecycle lifecycle$lifecycle_common = this.this$0.getLifecycle$lifecycle_common();
            X5.n nVar = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, nVar, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
