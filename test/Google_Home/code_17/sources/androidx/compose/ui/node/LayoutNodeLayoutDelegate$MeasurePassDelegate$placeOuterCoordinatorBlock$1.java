package androidx.compose.ui.node;

import O5.I;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;
    final /* synthetic */ LayoutNodeLayoutDelegate.MeasurePassDelegate this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.this$1 = measurePassDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4286invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4286invoke() {
        Placeable.PlacementScope placementScope;
        Function1 function1;
        long j8;
        float f8;
        long j9;
        float f9;
        NodeCoordinator wrappedBy$ui_release = this.this$0.getOuterCoordinator().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this.this$0.layoutNode).getPlacementScope();
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.this$1;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
        if (function1 == null) {
            NodeCoordinator outerCoordinator = layoutNodeLayoutDelegate.getOuterCoordinator();
            j9 = measurePassDelegate.placeOuterCoordinatorPosition;
            f9 = measurePassDelegate.placeOuterCoordinatorZIndex;
            placementScope2.m4178place70tqf50(outerCoordinator, j9, f9);
            return;
        }
        NodeCoordinator outerCoordinator2 = layoutNodeLayoutDelegate.getOuterCoordinator();
        j8 = measurePassDelegate.placeOuterCoordinatorPosition;
        f8 = measurePassDelegate.placeOuterCoordinatorZIndex;
        placementScope2.m4183placeWithLayeraW9wM(outerCoordinator2, j8, f8, function1);
    }
}
