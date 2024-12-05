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
            return new Rect(0.0f, 0.0f, IntSize.m5349getWidthimpl(layoutCoordinates.mo4143getSizeYbymL2g()), IntSize.m5348getHeightimpl(layoutCoordinates.mo4143getSizeYbymL2g()));
        }
        return c8;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return c.c(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float m5349getWidthimpl = IntSize.m5349getWidthimpl(findRootCoordinates.mo4143getSizeYbymL2g());
        float m5348getHeightimpl = IntSize.m5348getHeightimpl(findRootCoordinates.mo4143getSizeYbymL2g());
        float j8 = g6.m.j(boundsInRoot.getLeft(), 0.0f, m5349getWidthimpl);
        float j9 = g6.m.j(boundsInRoot.getTop(), 0.0f, m5348getHeightimpl);
        float j10 = g6.m.j(boundsInRoot.getRight(), 0.0f, m5349getWidthimpl);
        float j11 = g6.m.j(boundsInRoot.getBottom(), 0.0f, m5348getHeightimpl);
        if (j8 == j10 || j9 == j11) {
            return Rect.Companion.getZero();
        }
        long mo4146localToWindowMKHz9U = findRootCoordinates.mo4146localToWindowMKHz9U(OffsetKt.Offset(j8, j9));
        long mo4146localToWindowMKHz9U2 = findRootCoordinates.mo4146localToWindowMKHz9U(OffsetKt.Offset(j10, j9));
        long mo4146localToWindowMKHz9U3 = findRootCoordinates.mo4146localToWindowMKHz9U(OffsetKt.Offset(j10, j11));
        long mo4146localToWindowMKHz9U4 = findRootCoordinates.mo4146localToWindowMKHz9U(OffsetKt.Offset(j8, j11));
        return new Rect(R5.a.d(Offset.m2740getXimpl(mo4146localToWindowMKHz9U), Offset.m2740getXimpl(mo4146localToWindowMKHz9U2), Offset.m2740getXimpl(mo4146localToWindowMKHz9U4), Offset.m2740getXimpl(mo4146localToWindowMKHz9U3)), R5.a.d(Offset.m2741getYimpl(mo4146localToWindowMKHz9U), Offset.m2741getYimpl(mo4146localToWindowMKHz9U2), Offset.m2741getYimpl(mo4146localToWindowMKHz9U4), Offset.m2741getYimpl(mo4146localToWindowMKHz9U3)), R5.a.b(Offset.m2740getXimpl(mo4146localToWindowMKHz9U), Offset.m2740getXimpl(mo4146localToWindowMKHz9U2), Offset.m2740getXimpl(mo4146localToWindowMKHz9U4), Offset.m2740getXimpl(mo4146localToWindowMKHz9U3)), R5.a.b(Offset.m2741getYimpl(mo4146localToWindowMKHz9U), Offset.m2741getYimpl(mo4146localToWindowMKHz9U2), Offset.m2741getYimpl(mo4146localToWindowMKHz9U4), Offset.m2741getYimpl(mo4146localToWindowMKHz9U3)));
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
            return parentLayoutCoordinates.mo4144localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2756getZeroF1C5BW0());
        }
        return Offset.Companion.m2756getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo4145localToRootMKHz9U(Offset.Companion.m2756getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo4146localToWindowMKHz9U(Offset.Companion.m2756getZeroF1C5BW0());
    }
}
