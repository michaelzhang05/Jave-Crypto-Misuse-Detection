package androidx.compose.foundation.pager;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerWrapperFlingBehavior$performFling$2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ PagerWrapperFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$2$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior) {
        super(1);
        this.this$0 = pagerWrapperFlingBehavior;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f6487a;
    }

    public final void invoke(float f8) {
        this.this$0.getPagerState().setSnapRemainingScrollOffset$foundation_release(f8);
    }
}
