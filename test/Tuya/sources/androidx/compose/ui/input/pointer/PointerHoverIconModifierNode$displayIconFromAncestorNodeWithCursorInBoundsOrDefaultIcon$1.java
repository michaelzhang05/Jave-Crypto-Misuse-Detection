package androidx.compose.ui.input.pointer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ T $pointerHoverIconModifierNode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(T t8) {
        super(1);
        this.$pointerHoverIconModifierNode = t8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        boolean z8;
        boolean z9;
        if (this.$pointerHoverIconModifierNode.f33761a == null) {
            z9 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
            if (z9) {
                this.$pointerHoverIconModifierNode.f33761a = pointerHoverIconModifierNode;
                return Boolean.TRUE;
            }
        }
        if (this.$pointerHoverIconModifierNode.f33761a != null && pointerHoverIconModifierNode.getOverrideDescendants()) {
            z8 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
            if (z8) {
                this.$pointerHoverIconModifierNode.f33761a = pointerHoverIconModifierNode;
            }
        }
        return Boolean.TRUE;
    }
}
