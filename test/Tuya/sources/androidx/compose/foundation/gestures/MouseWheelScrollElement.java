package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MouseWheelScrollElement extends ModifierNodeElement<MouseWheelScrollNode> {
    private final ScrollConfig mouseWheelScrollConfig;
    private final State<ScrollingLogic> scrollingLogicState;

    public MouseWheelScrollElement(State<ScrollingLogic> scrollingLogicState, ScrollConfig mouseWheelScrollConfig) {
        AbstractC3159y.i(scrollingLogicState, "scrollingLogicState");
        AbstractC3159y.i(mouseWheelScrollConfig, "mouseWheelScrollConfig");
        this.scrollingLogicState = scrollingLogicState;
        this.mouseWheelScrollConfig = mouseWheelScrollConfig;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MouseWheelScrollElement)) {
            return false;
        }
        MouseWheelScrollElement mouseWheelScrollElement = (MouseWheelScrollElement) obj;
        if (AbstractC3159y.d(this.scrollingLogicState, mouseWheelScrollElement.scrollingLogicState) && AbstractC3159y.d(this.mouseWheelScrollConfig, mouseWheelScrollElement.mouseWheelScrollConfig)) {
            return true;
        }
        return false;
    }

    public final ScrollConfig getMouseWheelScrollConfig() {
        return this.mouseWheelScrollConfig;
    }

    public final State<ScrollingLogic> getScrollingLogicState() {
        return this.scrollingLogicState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.scrollingLogicState.hashCode() * 31) + this.mouseWheelScrollConfig.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "<this>");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MouseWheelScrollNode create() {
        return new MouseWheelScrollNode(this.scrollingLogicState, this.mouseWheelScrollConfig);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MouseWheelScrollNode node) {
        AbstractC3159y.i(node, "node");
        node.setScrollingLogicState(this.scrollingLogicState);
        node.setMouseWheelScrollConfig(this.mouseWheelScrollConfig);
    }
}
