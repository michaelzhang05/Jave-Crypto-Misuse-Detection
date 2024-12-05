package androidx.compose.material;

import L5.I;
import P5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomSheetState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<BottomSheetValue> anchoredDraggableState;
    private Density density;

    /* renamed from: androidx.compose.material.BottomSheetState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BottomSheetValue it) {
            AbstractC3159y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<BottomSheetState, ?> Saver(AnimationSpec<Float> animationSpec, Function1 confirmStateChange, Density density) {
            AbstractC3159y.i(animationSpec, "animationSpec");
            AbstractC3159y.i(confirmStateChange, "confirmStateChange");
            AbstractC3159y.i(density, "density");
            return SaverKt.Saver(BottomSheetState$Companion$Saver$1.INSTANCE, new BottomSheetState$Companion$Saver$2(density, animationSpec, confirmStateChange));
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }

        public final Saver<BottomSheetState, ?> Saver(AnimationSpec<Float> animationSpec, Function1 confirmStateChange) {
            AbstractC3159y.i(animationSpec, "animationSpec");
            AbstractC3159y.i(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(BottomSheetState$Companion$Saver$3.INSTANCE, new BottomSheetState$Companion$Saver$4(animationSpec, confirmStateChange));
        }
    }

    public BottomSheetState(BottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1 confirmValueChange) {
        AbstractC3159y.i(initialValue, "initialValue");
        AbstractC3159y.i(animationSpec, "animationSpec");
        AbstractC3159y.i(confirmValueChange, "confirmValueChange");
        this.anchoredDraggableState = new AnchoredDraggableState<>(initialValue, new BottomSheetState$anchoredDraggableState$1(this), new BottomSheetState$anchoredDraggableState$2(this), animationSpec, confirmValueChange);
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f8, d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = bottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return bottomSheetState.animateTo$material_release(bottomSheetValue, f8, dVar);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BottomSheetState (" + this + ") was not set. Did you use BottomSheetState with the BottomSheetScaffold composable?").toString());
    }

    public final Object animateTo$material_release(BottomSheetValue bottomSheetValue, float f8, d dVar) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomSheetValue, f8, dVar);
        if (animateTo == Q5.b.e()) {
            return animateTo;
        }
        return I.f6487a;
    }

    public final Object collapse(d dVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomSheetValue.Collapsed, 0.0f, dVar, 2, null);
        if (animateTo$default == Q5.b.e()) {
            return animateTo$default;
        }
        return I.f6487a;
    }

    public final Object expand(d dVar) {
        AnchoredDraggableState<BottomSheetValue> anchoredDraggableState = this.anchoredDraggableState;
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!anchoredDraggableState.hasAnchorForValue(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, bottomSheetValue, 0.0f, dVar, 2, null);
        if (animateTo$default == Q5.b.e()) {
            return animateTo$default;
        }
        return I.f6487a;
    }

    public final AnchoredDraggableState<BottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    public final BottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material_release() {
        return this.density;
    }

    public final float getLastVelocity$material_release() {
        return this.anchoredDraggableState.getLastVelocity();
    }

    public final float getOffset() {
        throw new IllegalStateException("Use requireOffset() to access the offset.".toString());
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final BottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning$material_release() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isCollapsed() {
        if (this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Collapsed) {
            return true;
        }
        return false;
    }

    public final boolean isExpanded() {
        if (this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Expanded) {
            return true;
        }
        return false;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(Density density) {
        this.density = density;
    }

    public final Object snapTo$material_release(BottomSheetValue bottomSheetValue, d dVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomSheetValue, dVar);
        if (snapTo == Q5.b.e()) {
            return snapTo;
        }
        return I.f6487a;
    }

    public final boolean trySnapTo$material_release(BottomSheetValue target) {
        AbstractC3159y.i(target, "target");
        return this.anchoredDraggableState.trySnapTo$material_release(target);
    }

    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i8, AbstractC3151p abstractC3151p) {
        this(bottomSheetValue, (i8 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i8 & 4) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
