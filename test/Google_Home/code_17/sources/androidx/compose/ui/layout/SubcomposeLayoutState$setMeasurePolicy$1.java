package androidx.compose.ui.layout;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setMeasurePolicy$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (InterfaceC1668n) obj2);
        return I.f8278a;
    }

    public final void invoke(LayoutNode layoutNode, InterfaceC1668n interfaceC1668n) {
        LayoutNodeSubcompositionsState state;
        state = this.this$0.getState();
        layoutNode.setMeasurePolicy(state.createMeasurePolicy(interfaceC1668n));
    }
}
