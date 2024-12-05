package androidx.compose.ui.input.pointer;

import a6.InterfaceC1668n;
import androidx.compose.ui.node.PointerInputModifierNode;

/* loaded from: classes.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    InterfaceC1668n getPointerInputHandler();

    void resetPointerInputHandler();

    void setPointerInputHandler(InterfaceC1668n interfaceC1668n);
}
