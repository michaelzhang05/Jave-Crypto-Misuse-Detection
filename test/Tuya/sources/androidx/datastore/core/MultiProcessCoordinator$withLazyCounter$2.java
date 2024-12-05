package androidx.datastore.core;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator$withLazyCounter$2 extends l implements n {
    final /* synthetic */ n $block;
    int label;
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$withLazyCounter$2(n nVar, MultiProcessCoordinator multiProcessCoordinator, d dVar) {
        super(2, dVar);
        this.$block = nVar;
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new MultiProcessCoordinator$withLazyCounter$2(this.$block, this.this$0, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((MultiProcessCoordinator$withLazyCounter$2) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SharedCounter sharedCounter;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            n nVar = this.$block;
            sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            obj = nVar.invoke(sharedCounter, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        SharedCounter sharedCounter;
        n nVar = this.$block;
        sharedCounter = this.this$0.getSharedCounter();
        return nVar.invoke(sharedCounter, this);
    }
}
