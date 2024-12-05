package androidx.compose.ui.focus;

import L5.p;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode != null) {
                return findActiveFocusNode;
            }
            throw new IllegalStateException(NoActiveChild.toString());
        }
        throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m2694beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i8) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i8, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i8, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i8, rect)) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (!FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s()) && !FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s()) && beamBeats_I7lrPNg$majorAxisDistance$6(rect2, i8, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i8, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i8, Rect rect2) {
        boolean m2652equalsimpl0;
        boolean m2652equalsimpl02;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
            m2652equalsimpl0 = true;
        } else {
            m2652equalsimpl0 = FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s());
        }
        if (m2652equalsimpl0) {
            if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
                return true;
            }
        } else {
            if (FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
                m2652equalsimpl02 = true;
            } else {
                m2652equalsimpl02 = FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s());
            }
            if (m2652equalsimpl02) {
                if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                    return true;
                }
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i8, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
            if (rect2.getLeft() < rect.getRight()) {
                return false;
            }
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s())) {
            if (rect2.getRight() > rect.getLeft()) {
                return false;
            }
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
            if (rect2.getTop() < rect.getBottom()) {
                return false;
            }
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s())) {
            if (rect2.getBottom() > rect.getTop()) {
                return false;
            }
        } else {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        }
        return true;
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(Rect rect, int i8, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f8;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f8 = top - bottom;
            return Math.max(0.0f, f8);
        }
        f8 = top2 - bottom2;
        return Math.max(0.0f, f8);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i8, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f8;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
            top = rect2.getLeft();
            top2 = rect.getLeft();
        } else {
            if (FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s())) {
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f8 = bottom - bottom2;
            return Math.max(1.0f, f8);
        }
        f8 = top - top2;
        return Math.max(1.0f, f8);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        int m4343constructorimpl = NodeKind.m4343constructorimpl(1024);
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m4343constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                                    if (focusTargetNode.isAttached()) {
                                        if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                            mutableVector.add(focusTargetNode);
                                        } else {
                                            collectAccessibleChildren(focusTargetNode, mutableVector);
                                        }
                                    }
                                } else if ((node.getKindSet$ui_release() & m4343constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i8 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector3.add(node);
                                                    node = null;
                                                }
                                                mutableVector3.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector3);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m2695findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i8) {
        Rect translate;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
            translate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s())) {
            translate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
            translate = rect.translate(0.0f, rect.getHeight() + 1);
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s())) {
            translate = rect.translate(0.0f, -(rect.getHeight() + 1));
        } else {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        }
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] content = mutableVector.getContent();
            int i9 = 0;
            do {
                FocusTargetNode focusTargetNode2 = content[i9];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                    Rect focusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                    if (m2698isBetterCandidateI7lrPNg(focusRect, translate, rect, i8)) {
                        focusTargetNode = focusTargetNode2;
                        translate = focusRect;
                    }
                }
                i9++;
            } while (i9 < size);
        }
        return focusTargetNode;
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m2696findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i8, Function1 function1) {
        boolean m2652equalsimpl0;
        Rect bottomRight;
        Object obj;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        boolean z8 = true;
        if (mutableVector.getSize() <= 1) {
            if (mutableVector.isEmpty()) {
                obj = null;
            } else {
                obj = mutableVector.getContent()[0];
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj;
            if (focusTargetNode2 == null) {
                return false;
            }
            return ((Boolean) function1.invoke(focusTargetNode2)).booleanValue();
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2659getEnterdhqQ8s())) {
            i8 = companion.m2664getRightdhqQ8s();
        }
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s())) {
            m2652equalsimpl0 = true;
        } else {
            m2652equalsimpl0 = FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s());
        }
        if (m2652equalsimpl0) {
            bottomRight = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
        } else {
            if (!FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
                z8 = FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s());
            }
            if (z8) {
                bottomRight = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
        }
        FocusTargetNode m2695findBestCandidate4WY_MpI = m2695findBestCandidate4WY_MpI(mutableVector, bottomRight, i8);
        if (m2695findBestCandidate4WY_MpI == null) {
            return false;
        }
        return ((Boolean) function1.invoke(m2695findBestCandidate4WY_MpI)).booleanValue();
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m2697generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Function1 function1) {
        if (m2699searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i8, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2648searchBeyondBoundsOMvw8(focusTargetNode, i8, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetNode, focusTargetNode2, i8, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m2698isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i8) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i8, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i8, rect3) && !m2694beamBeatsI7lrPNg(rect3, rect, rect2, i8) && (m2694beamBeatsI7lrPNg(rect3, rect2, rect, i8) || isBetterCandidate_I7lrPNg$weightedDistance(i8, rect3, rect) >= isBetterCandidate_I7lrPNg$weightedDistance(i8, rect3, rect2))) {
            return false;
        }
        return true;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i8, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
            if ((rect2.getRight() <= rect.getRight() && rect2.getLeft() < rect.getRight()) || rect2.getLeft() <= rect.getLeft()) {
                return false;
            }
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s())) {
            if ((rect2.getLeft() >= rect.getLeft() && rect2.getRight() > rect.getLeft()) || rect2.getRight() >= rect.getRight()) {
                return false;
            }
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
            if ((rect2.getBottom() <= rect.getBottom() && rect2.getTop() < rect.getBottom()) || rect2.getTop() <= rect.getTop()) {
                return false;
            }
        } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s())) {
            if ((rect2.getTop() >= rect.getTop() && rect2.getBottom() > rect.getTop()) || rect2.getBottom() >= rect.getBottom()) {
                return false;
            }
        } else {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        }
        return true;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i8, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f8;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f8 = top - bottom;
            return Math.max(0.0f, f8);
        }
        f8 = top2 - bottom2;
        return Math.max(0.0f, f8);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i8, Rect rect2) {
        boolean m2652equalsimpl0;
        float f8;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.Companion;
        boolean z8 = true;
        if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
            m2652equalsimpl0 = true;
        } else {
            m2652equalsimpl0 = FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s());
        }
        if (m2652equalsimpl0) {
            f8 = 2;
            left = rect2.getTop() + (rect2.getHeight() / f8);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
                z8 = FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s());
            }
            if (z8) {
                f8 = 2;
                left = rect2.getLeft() + (rect2.getWidth() / f8);
                left2 = rect.getLeft();
                width = rect.getWidth();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
        }
        return left - (left2 + (width / f8));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i8, Rect rect, Rect rect2) {
        long abs = Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i8, rect));
        long abs2 = Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i8, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m2699searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Function1 function1) {
        FocusTargetNode m2695findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m4343constructorimpl = NodeKind.m4343constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m4343constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui_release() & m4343constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i9 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector3.add(node);
                                                    node = null;
                                                }
                                                mutableVector3.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector3);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            while (mutableVector.isNotEmpty() && (m2695findBestCandidate4WY_MpI = m2695findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusTargetNode2), i8)) != null) {
                if (m2695findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                    return ((Boolean) function1.invoke(m2695findBestCandidate4WY_MpI)).booleanValue();
                }
                if (m2697generateAndSearchChildren4C6V_qg(m2695findBestCandidate4WY_MpI, focusTargetNode2, i8, function1)) {
                    return true;
                }
                mutableVector.remove(m2695findBestCandidate4WY_MpI);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    /* renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final Boolean m2700twoDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i8, Function1 function1) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i9 = iArr[focusState.ordinal()];
        if (i9 != 1) {
            if (i9 != 2 && i9 != 3) {
                if (i9 == 4) {
                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                        return (Boolean) function1.invoke(focusTargetNode);
                    }
                    return Boolean.FALSE;
                }
                throw new p();
            }
            return Boolean.valueOf(m2696findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i8, function1));
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            int i10 = iArr[activeChild.getFocusState().ordinal()];
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 != 4) {
                        throw new p();
                    }
                    throw new IllegalStateException(NoActiveChild.toString());
                }
                return Boolean.valueOf(m2697generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, i8, function1));
            }
            Boolean m2700twoDimensionalFocusSearchOMvw8 = m2700twoDimensionalFocusSearchOMvw8(activeChild, i8, function1);
            if (!AbstractC3159y.d(m2700twoDimensionalFocusSearchOMvw8, Boolean.FALSE)) {
                return m2700twoDimensionalFocusSearchOMvw8;
            }
            return Boolean.valueOf(m2697generateAndSearchChildren4C6V_qg(focusTargetNode, activeNode(activeChild), i8, function1));
        }
        throw new IllegalStateException(NoActiveChild.toString());
    }
}
