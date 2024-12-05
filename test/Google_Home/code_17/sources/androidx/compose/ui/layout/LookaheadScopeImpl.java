package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LookaheadScopeImpl implements LookaheadScope {
    public static final int $stable = 8;
    private Function0 scopeCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        Function0 function0 = this.scopeCoordinates;
        AbstractC3255y.f(function0);
        return (LayoutCoordinates) function0.invoke();
    }

    public final Function0 getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-dBAh8RU */
    public /* synthetic */ long mo4140localLookaheadPositionOfdBAh8RU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return f.a(this, layoutCoordinates, layoutCoordinates2);
    }

    public final void setScopeCoordinates(Function0 function0) {
        this.scopeCoordinates = function0;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates2;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) layoutCoordinates;
        } else {
            lookaheadLayoutCoordinates = null;
        }
        if (lookaheadLayoutCoordinates == null) {
            AbstractC3255y.g(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
            LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
            if (lookaheadDelegate == null || (lookaheadLayoutCoordinates2 = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) {
                return nodeCoordinator;
            }
            return lookaheadLayoutCoordinates2;
        }
        return lookaheadLayoutCoordinates;
    }

    public LookaheadScopeImpl(Function0 function0) {
        this.scopeCoordinates = function0;
    }

    public /* synthetic */ LookaheadScopeImpl(Function0 function0, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : function0);
    }
}
