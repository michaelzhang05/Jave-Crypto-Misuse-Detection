package androidx.compose.ui.input.pointer;

import X5.n;
import androidx.compose.ui.node.PointerInputModifierNode;

/* loaded from: classes.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    n getPointerInputHandler();

    void resetPointerInputHandler();

    void setPointerInputHandler(n nVar);
}
