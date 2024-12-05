package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public interface LayoutAwareModifierNode extends DelegatableNode {
    void onPlaced(LayoutCoordinates layoutCoordinates);

    /* renamed from: onRemeasured-ozmzZPI */
    void mo337onRemeasuredozmzZPI(long j8);
}
