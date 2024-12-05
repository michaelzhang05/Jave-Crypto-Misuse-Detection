package androidx.compose.foundation.lazy.layout;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.IntOffset;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$cancelAnimation$1", f = "LazyLayoutAnimateItemModifierNode.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemModifierNode$cancelAnimation$1 extends l implements n {
    int label;
    final /* synthetic */ LazyLayoutAnimateItemModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimateItemModifierNode$cancelAnimation$1(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, d dVar) {
        super(2, dVar);
        this.this$0 = lazyLayoutAnimateItemModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new LazyLayoutAnimateItemModifierNode$cancelAnimation$1(this.this$0, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((LazyLayoutAnimateItemModifierNode$cancelAnimation$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
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
            animatable = this.this$0.placementDeltaAnimation;
            IntOffset m5293boximpl = IntOffset.m5293boximpl(IntOffset.Companion.m5312getZeronOccac());
            this.label = 1;
            if (animatable.snapTo(m5293boximpl, this) == e8) {
                return e8;
            }
        }
        this.this$0.m741setPlacementDeltagyyYBs(IntOffset.Companion.m5312getZeronOccac());
        this.this$0.setAnimationInProgress(false);
        return I.f6487a;
    }
}
