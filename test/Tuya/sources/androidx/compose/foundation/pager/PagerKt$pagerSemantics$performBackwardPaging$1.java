package androidx.compose.foundation.pager;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {859}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PagerKt$pagerSemantics$performBackwardPaging$1 extends l implements n {
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$performBackwardPaging$1(PagerState pagerState, d dVar) {
        super(2, dVar);
        this.$state = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new PagerKt$pagerSemantics$performBackwardPaging$1(this.$state, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((PagerKt$pagerSemantics$performBackwardPaging$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            PagerState pagerState = this.$state;
            this.label = 1;
            if (PagerStateKt.animateToPreviousPage(pagerState, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
