package androidx.compose.material;

import O5.I;
import S5.d;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomDrawerState {
    private final AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState;
    private Density density;
    private final NestedScrollConnection nestedScrollConnection;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: androidx.compose.material.BottomDrawerState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BottomDrawerValue it) {
            AbstractC3255y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(Density density, Function1 confirmStateChange) {
            AbstractC3255y.i(density, "density");
            AbstractC3255y.i(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(BottomDrawerState$Companion$Saver$1.INSTANCE, new BottomDrawerState$Companion$Saver$2(density, confirmStateChange));
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }

        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(Function1 confirmStateChange) {
            AbstractC3255y.i(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(BottomDrawerState$Companion$Saver$3.INSTANCE, new BottomDrawerState$Companion$Saver$4(confirmStateChange));
        }
    }

    public BottomDrawerState(BottomDrawerValue initialValue, Function1 confirmStateChange) {
        TweenSpec tweenSpec;
        NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection;
        AbstractC3255y.i(initialValue, "initialValue");
        AbstractC3255y.i(confirmStateChange, "confirmStateChange");
        tweenSpec = DrawerKt.AnimationSpec;
        AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState = new AnchoredDraggableState<>(initialValue, new BottomDrawerState$anchoredDraggableState$1(this), new BottomDrawerState$anchoredDraggableState$2(this), tweenSpec, confirmStateChange);
        this.anchoredDraggableState = anchoredDraggableState;
        ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection = DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(anchoredDraggableState);
        this.nestedScrollConnection = ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection;
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, float f8, d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = bottomDrawerState.anchoredDraggableState.getLastVelocity();
        }
        return bottomDrawerState.animateTo$material_release(bottomDrawerValue, f8, dVar);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    private final boolean isOpenEnabled() {
        return this.anchoredDraggableState.hasAnchorForValue(BottomDrawerValue.Open);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BottomDrawerState (" + this + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
    }

    public final Object animateTo$material_release(BottomDrawerValue bottomDrawerValue, float f8, d dVar) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomDrawerValue, f8, dVar);
        if (animateTo == T5.b.e()) {
            return animateTo;
        }
        return I.f8278a;
    }

    public final Object close(d dVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Closed, 0.0f, dVar, 2, null);
        if (animateTo$default == T5.b.e()) {
            return animateTo$default;
        }
        return I.f8278a;
    }

    public final boolean confirmStateChange$material_release(BottomDrawerValue value) {
        AbstractC3255y.i(value, "value");
        return ((Boolean) this.anchoredDraggableState.getConfirmValueChange$material_release().invoke(value)).booleanValue();
    }

    public final Object expand(d dVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Expanded, 0.0f, dVar, 2, null);
        if (animateTo$default == T5.b.e()) {
            return animateTo$default;
        }
        return I.f8278a;
    }

    public final AnchoredDraggableState<BottomDrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    public final BottomDrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material_release() {
        return this.density;
    }

    public final float getLastVelocity$material_release() {
        return this.anchoredDraggableState.getLastVelocity();
    }

    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final BottomDrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning$material_release() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        if (this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final boolean isExpanded() {
        if (this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Expanded) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (this.anchoredDraggableState.getCurrentValue() != BottomDrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final Object open(d dVar) {
        BottomDrawerValue bottomDrawerValue;
        if (isOpenEnabled()) {
            bottomDrawerValue = BottomDrawerValue.Open;
        } else {
            bottomDrawerValue = BottomDrawerValue.Expanded;
        }
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, bottomDrawerValue, 0.0f, dVar, 2, null);
        if (animateTo$default == T5.b.e()) {
            return animateTo$default;
        }
        return I.f8278a;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(Density density) {
        this.density = density;
    }

    public final Object snapTo$material_release(BottomDrawerValue bottomDrawerValue, d dVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomDrawerValue, dVar);
        if (snapTo == T5.b.e()) {
            return snapTo;
        }
        return I.f8278a;
    }

    public final boolean trySnapTo$material_release(BottomDrawerValue target) {
        AbstractC3255y.i(target, "target");
        return this.anchoredDraggableState.trySnapTo$material_release(target);
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, Function1 function1, int i8, AbstractC3247p abstractC3247p) {
        this(bottomDrawerValue, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
