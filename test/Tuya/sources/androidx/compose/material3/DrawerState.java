package androidx.compose.material3;

import L5.I;
import P5.d;
import Q5.b;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class DrawerState {
    public static final Companion Companion = new Companion(null);
    private final SwipeableState<DrawerValue> swipeableState;

    /* renamed from: androidx.compose.material3.DrawerState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DrawerValue it) {
            AbstractC3159y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<DrawerState, DrawerValue> Saver(Function1 confirmStateChange) {
            AbstractC3159y.i(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(confirmStateChange));
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public DrawerState(DrawerValue initialValue, Function1 confirmStateChange) {
        AbstractC3159y.i(initialValue, "initialValue");
        AbstractC3159y.i(confirmStateChange, "confirmStateChange");
        this.swipeableState = new SwipeableState<>(initialValue, NavigationDrawerKt.access$getAnimationSpec$p(), confirmStateChange);
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    @ExperimentalMaterial3Api
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, d dVar) {
        Object animateTo$material3_release = this.swipeableState.animateTo$material3_release(drawerValue, animationSpec, dVar);
        if (animateTo$material3_release == b.e()) {
            return animateTo$material3_release;
        }
        return I.f6487a;
    }

    public final Object close(d dVar) {
        Object animateTo = animateTo(DrawerValue.Closed, NavigationDrawerKt.access$getAnimationSpec$p(), dVar);
        if (animateTo == b.e()) {
            return animateTo;
        }
        return I.f6487a;
    }

    public final DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    @ExperimentalMaterial3Api
    public final State<Float> getOffset() {
        return this.swipeableState.getOffset();
    }

    public final SwipeableState<DrawerValue> getSwipeableState$material3_release() {
        return this.swipeableState;
    }

    @ExperimentalMaterial3Api
    public final DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue$material3_release();
    }

    public final boolean isAnimationRunning() {
        return this.swipeableState.isAnimationRunning();
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
        Object animateTo = animateTo(DrawerValue.Open, NavigationDrawerKt.access$getAnimationSpec$p(), dVar);
        if (animateTo == b.e()) {
            return animateTo;
        }
        return I.f6487a;
    }

    @ExperimentalMaterial3Api
    public final Object snapTo(DrawerValue drawerValue, d dVar) {
        Object snapTo$material3_release = this.swipeableState.snapTo$material3_release(drawerValue, dVar);
        if (snapTo$material3_release == b.e()) {
            return snapTo$material3_release;
        }
        return I.f6487a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i8, AbstractC3151p abstractC3151p) {
        this(drawerValue, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
