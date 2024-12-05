package androidx.compose.ui.layout;

import L5.I;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setMeasurePolicy$1 extends AbstractC3160z implements X5.n {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (X5.n) obj2);
        return I.f6487a;
    }

    public final void invoke(LayoutNode layoutNode, X5.n nVar) {
        LayoutNodeSubcompositionsState state;
        state = this.this$0.getState();
        layoutNode.setMeasurePolicy(state.createMeasurePolicy(nVar));
    }
}
