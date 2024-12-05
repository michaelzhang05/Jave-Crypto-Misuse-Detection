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
    public static final /* synthetic */ boolean m2622access$containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j8) {
        return m2623containsUv8p0NA(dragAndDropModifierNode, j8);
    }

    /* renamed from: contains-Uv8p0NA */
    public static final boolean m2623containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j8) {
        if (!dragAndDropModifierNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropModifierNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long mo4138getSizeYbymL2g = coordinates.mo4138getSizeYbymL2g();
        int m5344getWidthimpl = IntSize.m5344getWidthimpl(mo4138getSizeYbymL2g);
        int m5343getHeightimpl = IntSize.m5343getHeightimpl(mo4138getSizeYbymL2g);
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        float m2725component1impl = Offset.m2725component1impl(positionInRoot);
        float m2726component2impl = Offset.m2726component2impl(positionInRoot);
        float f8 = m5344getWidthimpl + m2725component1impl;
        float f9 = m5343getHeightimpl + m2726component2impl;
        float m2735getXimpl = Offset.m2735getXimpl(j8);
        if (m2725component1impl > m2735getXimpl || m2735getXimpl > f8) {
            return false;
        }
        float m2736getYimpl = Offset.m2736getYimpl(j8);
        if (m2726component2impl > m2736getYimpl || m2736getYimpl > f9) {
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
