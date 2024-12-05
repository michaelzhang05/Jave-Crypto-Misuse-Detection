package androidx.compose.material;

import L5.I;
import P5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BackdropScaffoldState extends SwipeableState<BackdropValue> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final NestedScrollConnection nestedScrollConnection;
    private final SnackbarHostState snackbarHostState;

    /* renamed from: androidx.compose.material.BackdropScaffoldState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BackdropValue it) {
            AbstractC3159y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<BackdropScaffoldState, ?> Saver(AnimationSpec<Float> animationSpec, Function1 confirmStateChange, SnackbarHostState snackbarHostState) {
            AbstractC3159y.i(animationSpec, "animationSpec");
            AbstractC3159y.i(confirmStateChange, "confirmStateChange");
            AbstractC3159y.i(snackbarHostState, "snackbarHostState");
            return SaverKt.Saver(BackdropScaffoldState$Companion$Saver$1.INSTANCE, new BackdropScaffoldState$Companion$Saver$2(animationSpec, confirmStateChange, snackbarHostState));
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState, int i8, AbstractC3151p abstractC3151p) {
        this(backdropValue, (i8 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i8 & 4) != 0 ? AnonymousClass1.INSTANCE : function1, (i8 & 8) != 0 ? new SnackbarHostState() : snackbarHostState);
    }

    public final Object conceal(d dVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Concealed, null, dVar, 2, null);
        if (animateTo$default == Q5.b.e()) {
            return animateTo$default;
        }
        return I.f6487a;
    }

    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public final boolean isConcealed() {
        if (getCurrentValue() == BackdropValue.Concealed) {
            return true;
        }
        return false;
    }

    public final boolean isRevealed() {
        if (getCurrentValue() == BackdropValue.Revealed) {
            return true;
        }
        return false;
    }

    public final Object reveal(d dVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Revealed, null, dVar, 2, null);
        if (animateTo$default == Q5.b.e()) {
            return animateTo$default;
        }
        return I.f6487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState(BackdropValue initialValue, AnimationSpec<Float> animationSpec, Function1 confirmStateChange, SnackbarHostState snackbarHostState) {
        super(initialValue, animationSpec, confirmStateChange);
        AbstractC3159y.i(initialValue, "initialValue");
        AbstractC3159y.i(animationSpec, "animationSpec");
        AbstractC3159y.i(confirmStateChange, "confirmStateChange");
        AbstractC3159y.i(snackbarHostState, "snackbarHostState");
        this.snackbarHostState = snackbarHostState;
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }
}
