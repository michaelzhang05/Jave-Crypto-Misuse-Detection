package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class DragAndDropNodeKt {
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(DragAndDropNodeKt$DragAndDropModifierNode$1.INSTANCE);
    }

    /* renamed from: access$contains-Uv8p0NA */
    public static final /* synthetic */ boolean m2627access$containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j8) {
        return m2628containsUv8p0NA(dragAndDropModifierNode, j8);
    }

    /* renamed from: contains-Uv8p0NA */
    public static final boolean m2628containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j8) {
        if (!dragAndDropModifierNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropModifierNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long mo4143getSizeYbymL2g = coordinates.mo4143getSizeYbymL2g();
        int m5349getWidthimpl = IntSize.m5349getWidthimpl(mo4143getSizeYbymL2g);
        int m5348getHeightimpl = IntSize.m5348getHeightimpl(mo4143getSizeYbymL2g);
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        float m2730component1impl = Offset.m2730component1impl(positionInRoot);
        float m2731component2impl = Offset.m2731component2impl(positionInRoot);
        float f8 = m5349getWidthimpl + m2730component1impl;
        float f9 = m5348getHeightimpl + m2731component2impl;
        float m2740getXimpl = Offset.m2740getXimpl(j8);
        if (m2730component1impl > m2740getXimpl || m2740getXimpl > f8) {
            return false;
        }
        float m2741getYimpl = Offset.m2741getYimpl(j8);
        if (m2731component2impl > m2741getYimpl || m2741getYimpl > f9) {
            return false;
        }
        return true;
    }

    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    public static final DragAndDropModifierNode DragAndDropModifierNode(Function1 function1, DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(new DragAndDropNodeKt$DragAndDropModifierNode$2(function1, dragAndDropTarget));
    }
}
