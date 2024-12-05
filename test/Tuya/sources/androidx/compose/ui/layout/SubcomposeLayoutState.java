package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private LayoutNodeSubcompositionsState _state;
    private final X5.n setCompositionContext;
    private final X5.n setMeasurePolicy;
    private final X5.n setRoot;
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    /* loaded from: classes.dex */
    public interface PrecomposedSlotHandle {
        void dispose();

        int getPlaceablesCount();

        /* renamed from: premeasure-0kLqBqw */
        void mo4147premeasure0kLqBqw(int i8, long j8);
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new SubcomposeLayoutState$setRoot$1(this);
        this.setCompositionContext = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.setMeasurePolicy = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }

    public final X5.n getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    public final X5.n getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    public final X5.n getSetRoot$ui_release() {
        return this.setRoot;
    }

    public final PrecomposedSlotHandle precompose(Object obj, X5.n nVar) {
        return getState().precompose(obj, nVar);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    public SubcomposeLayoutState(int i8) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i8));
    }
}
