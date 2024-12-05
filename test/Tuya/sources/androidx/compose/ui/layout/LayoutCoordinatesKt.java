package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect c8;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || (c8 = c.c(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) {
            return new Rect(0.0f, 0.0f, IntSize.m5344getWidthimpl(layoutCoordinates.mo4138getSizeYbymL2g()), IntSize.m5343getHeightimpl(layoutCoordinates.mo4138getSizeYbymL2g()));
        }
        return c8;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return c.c(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float m5344getWidthimpl = IntSize.m5344getWidthimpl(findRootCoordinates.mo4138getSizeYbymL2g());
        float m5343getHeightimpl = IntSize.m5343getHeightimpl(findRootCoordinates.mo4138getSizeYbymL2g());
        float j8 = d6.m.j(boundsInRoot.getLeft(), 0.0f, m5344getWidthimpl);
        float j9 = d6.m.j(boundsInRoot.getTop(), 0.0f, m5343getHeightimpl);
        float j10 = d6.m.j(boundsInRoot.getRight(), 0.0f, m5344getWidthimpl);
        float j11 = d6.m.j(boundsInRoot.getBottom(), 0.0f, m5343getHeightimpl);
        if (j8 == j10 || j9 == j11) {
            return Rect.Companion.getZero();
        }
        long mo4141localToWindowMKHz9U = findRootCoordinates.mo4141localToWindowMKHz9U(OffsetKt.Offset(j8, j9));
        long mo4141localToWindowMKHz9U2 = findRootCoordinates.mo4141localToWindowMKHz9U(OffsetKt.Offset(j10, j9));
        long mo4141localToWindowMKHz9U3 = findRootCoordinates.mo4141localToWindowMKHz9U(OffsetKt.Offset(j10, j11));
        long mo4141localToWindowMKHz9U4 = findRootCoordinates.mo4141localToWindowMKHz9U(OffsetKt.Offset(j8, j11));
        return new Rect(O5.a.d(Offset.m2735getXimpl(mo4141localToWindowMKHz9U), Offset.m2735getXimpl(mo4141localToWindowMKHz9U2), Offset.m2735getXimpl(mo4141localToWindowMKHz9U4), Offset.m2735getXimpl(mo4141localToWindowMKHz9U3)), O5.a.d(Offset.m2736getYimpl(mo4141localToWindowMKHz9U), Offset.m2736getYimpl(mo4141localToWindowMKHz9U2), Offset.m2736getYimpl(mo4141localToWindowMKHz9U4), Offset.m2736getYimpl(mo4141localToWindowMKHz9U3)), O5.a.b(Offset.m2735getXimpl(mo4141localToWindowMKHz9U), Offset.m2735getXimpl(mo4141localToWindowMKHz9U2), Offset.m2735getXimpl(mo4141localToWindowMKHz9U4), Offset.m2735getXimpl(mo4141localToWindowMKHz9U3)), O5.a.b(Offset.m2736getYimpl(mo4141localToWindowMKHz9U), Offset.m2736getYimpl(mo4141localToWindowMKHz9U2), Offset.m2736getYimpl(mo4141localToWindowMKHz9U4), Offset.m2736getYimpl(mo4141localToWindowMKHz9U3)));
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        NodeCoordinator nodeCoordinator;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        if (layoutCoordinates2 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) layoutCoordinates2;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui_release;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
            } else {
                return nodeCoordinator3;
            }
        }
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            return parentLayoutCoordinates.mo4139localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2751getZeroF1C5BW0());
        }
        return Offset.Companion.m2751getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo4140localToRootMKHz9U(Offset.Companion.m2751getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo4141localToWindowMKHz9U(Offset.Companion.m2751getZeroF1C5BW0());
    }
}
