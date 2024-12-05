package androidx.datastore.core;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1 extends l implements n {
    int label;
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(MultiProcessCoordinator multiProcessCoordinator, d dVar) {
        super(2, dVar);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this.this$0, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SharedCounter sharedCounter;
        b.e();
        if (this.label == 0) {
            t.b(obj);
            sharedCounter = this.this$0.getSharedCounter();
            return kotlin.coroutines.jvm.internal.b.c(sharedCounter.getValue());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
