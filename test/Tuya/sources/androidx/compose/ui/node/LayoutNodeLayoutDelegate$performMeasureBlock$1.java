package androidx.compose.ui.node;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$performMeasureBlock$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$performMeasureBlock$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4283invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4283invoke() {
        long j8;
        NodeCoordinator outerCoordinator = this.this$0.getOuterCoordinator();
        j8 = this.this$0.performMeasureConstraints;
        outerCoordinator.mo4131measureBRTryo0(j8);
    }
}
