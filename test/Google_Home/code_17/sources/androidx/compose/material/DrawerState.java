package androidx.compose.material;

import O5.I;
import S5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

@Stable
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private Density density;

    /* renamed from: androidx.compose.material.DrawerState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DrawerValue it) {
            AbstractC3255y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<DrawerState, DrawerValue> Saver(Function1 confirmStateChange) {
            AbstractC3255y.i(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(confirmStateChange));
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public DrawerState(DrawerValue initialValue, Function1 confirmStateChange) {
        AbstractC3255y.i(initialValue, "initialValue");
        AbstractC3255y.i(confirmStateChange, "confirmStateChange");
        this.anchoredDraggableState = new AnchoredDraggableState<>(initialValue, new DrawerState$anchoredDraggableState$1(this), new DrawerState$anchoredDraggableState$2(this), DrawerKt.access$getAnimationSpec$p(), confirmStateChange);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    @ExperimentalMaterialApi
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, d dVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, drawerValue, 0.0f, dVar, 2, null);
        if (animateTo$default == T5.b.e()) {
            return animateTo$default;
        }
        return I.f8278a;
    }

    public final Object close(d dVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Closed, 0.0f, dVar, 2, null);
        if (animateTo$default == T5.b.e()) {
            return animateTo$default;
        }
        return I.f8278a;
    }

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material_release() {
        return this.density;
    }

    @ExperimentalMaterialApi
    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @ExperimentalMaterialApi
    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        if (getCurrentValue() == DrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (getCurrentValue() == DrawerValue.Open) {
            return true;
        }
        return false;
    }

    public final Object open(d dVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Open, 0.0f, dVar, 2, null);
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

    public final Object snapTo(DrawerValue drawerValue, d dVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, dVar);
        if (snapTo == T5.b.e()) {
            return snapTo;
        }
        return I.f8278a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i8, AbstractC3247p abstractC3247p) {
        this(drawerValue, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
