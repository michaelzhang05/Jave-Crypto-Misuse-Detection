package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m2648searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i8, Function1 function1) {
        Modifier.Node node;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int m4117getBeforehoxUOeE;
        NodeChain nodes$ui_release;
        int m4343constructorimpl = NodeKind.m4343constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4343constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                node = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((node.getKindSet$ui_release() & m4343constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                        int i9 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    node = delegate$ui_release;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui_release();
                    if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                        parent$ui_release = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release = null;
                    }
                } else {
                    node = null;
                    break;
                }
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
            if ((focusTargetNode2 != null && AbstractC3159y.d(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
                return null;
            }
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m2652equalsimpl0(i8, companion.m2665getUpdhqQ8s())) {
                m4117getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4115getAbovehoxUOeE();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2658getDowndhqQ8s())) {
                m4117getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4118getBelowhoxUOeE();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2661getLeftdhqQ8s())) {
                m4117getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4119getLefthoxUOeE();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2664getRightdhqQ8s())) {
                m4117getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4120getRighthoxUOeE();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2662getNextdhqQ8s())) {
                m4117getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4116getAfterhoxUOeE();
            } else if (FocusDirection.m2652equalsimpl0(i8, companion.m2663getPreviousdhqQ8s())) {
                m4117getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m4117getBeforehoxUOeE();
            } else {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            return (T) beyondBoundsLayoutParent.mo752layouto7g1Pn8(m4117getBeforehoxUOeE, function1);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
