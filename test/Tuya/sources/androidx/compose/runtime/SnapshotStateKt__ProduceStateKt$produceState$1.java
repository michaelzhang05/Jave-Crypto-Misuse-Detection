package androidx.compose.runtime;

import L5.I;
import L5.t;
import X5.n;
import i6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1", f = "ProduceState.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$1 extends kotlin.coroutines.jvm.internal.l implements n {
    final /* synthetic */ n $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$1(n nVar, MutableState<T> mutableState, P5.d dVar) {
        super(2, dVar);
        this.$producer = nVar;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        SnapshotStateKt__ProduceStateKt$produceState$1 snapshotStateKt__ProduceStateKt$produceState$1 = new SnapshotStateKt__ProduceStateKt$produceState$1(this.$producer, this.$result, dVar);
        snapshotStateKt__ProduceStateKt$produceState$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$1;
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$1) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            M m8 = (M) this.L$0;
            n nVar = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, m8.getCoroutineContext());
            this.label = 1;
            if (nVar.invoke(produceStateScopeImpl, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
