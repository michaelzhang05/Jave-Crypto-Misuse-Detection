package androidx.compose.foundation;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import X5.o;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import i6.M;
import k6.EnumC3132a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.S;
import l6.AbstractC3340B;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4 extends AbstractC3160z implements o {
    final /* synthetic */ Function1 $magnifierCenter;
    final /* synthetic */ Function1 $onSizeChanged;
    final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
    final /* synthetic */ Function1 $sourceCenter;
    final /* synthetic */ MagnifierStyle $style;
    final /* synthetic */ float $zoom;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {363}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
        final /* synthetic */ Density $density;
        final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
        final /* synthetic */ u $onNeedsUpdate;
        final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
        final /* synthetic */ MagnifierStyle $style;
        final /* synthetic */ State<Function1> $updatedMagnifierCenter$delegate;
        final /* synthetic */ State<Function1> $updatedOnSizeChanged$delegate;
        final /* synthetic */ State<Float> $updatedZoom$delegate;
        final /* synthetic */ View $view;
        final /* synthetic */ float $zoom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C02851 extends l implements n {
            final /* synthetic */ PlatformMagnifier $magnifier;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02851(PlatformMagnifier platformMagnifier, d dVar) {
                super(2, dVar);
                this.$magnifier = platformMagnifier;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C02851(this.$magnifier, dVar);
            }

            @Override // X5.n
            public final Object invoke(I i8, d dVar) {
                return ((C02851) create(i8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.label == 0) {
                    t.b(obj);
                    this.$magnifier.updateContent();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC3160z implements Function0 {
            final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
            final /* synthetic */ Density $density;
            final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
            final /* synthetic */ PlatformMagnifier $magnifier;
            final /* synthetic */ S $previousSize;
            final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
            final /* synthetic */ State<Function1> $updatedMagnifierCenter$delegate;
            final /* synthetic */ State<Function1> $updatedOnSizeChanged$delegate;
            final /* synthetic */ State<Float> $updatedZoom$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(PlatformMagnifier platformMagnifier, Density density, State<Boolean> state, State<Offset> state2, State<? extends Function1> state3, MutableState<Offset> mutableState, State<Float> state4, S s8, State<? extends Function1> state5) {
                super(0);
                this.$magnifier = platformMagnifier;
                this.$density = density;
                this.$isMagnifierShown$delegate = state;
                this.$sourceCenterInRoot$delegate = state2;
                this.$updatedMagnifierCenter$delegate = state3;
                this.$anchorPositionInRoot$delegate = mutableState;
                this.$updatedZoom$delegate = state4;
                this.$previousSize = s8;
                this.$updatedOnSizeChanged$delegate = state5;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m341invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m341invoke() {
                long m2750getUnspecifiedF1C5BW0;
                if (MagnifierKt$magnifier$4.invoke$lambda$10(this.$isMagnifierShown$delegate)) {
                    PlatformMagnifier platformMagnifier = this.$magnifier;
                    long invoke$lambda$8 = MagnifierKt$magnifier$4.invoke$lambda$8(this.$sourceCenterInRoot$delegate);
                    Object invoke = MagnifierKt$magnifier$4.invoke$lambda$4(this.$updatedMagnifierCenter$delegate).invoke(this.$density);
                    MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                    long m2745unboximpl = ((Offset) invoke).m2745unboximpl();
                    if (OffsetKt.m2754isSpecifiedk4lQ0M(m2745unboximpl)) {
                        m2750getUnspecifiedF1C5BW0 = Offset.m2740plusMKHz9U(MagnifierKt$magnifier$4.invoke$lambda$1(mutableState), m2745unboximpl);
                    } else {
                        m2750getUnspecifiedF1C5BW0 = Offset.Companion.m2750getUnspecifiedF1C5BW0();
                    }
                    platformMagnifier.mo368updateWko1d7g(invoke$lambda$8, m2750getUnspecifiedF1C5BW0, MagnifierKt$magnifier$4.invoke$lambda$5(this.$updatedZoom$delegate));
                    long mo367getSizeYbymL2g = this.$magnifier.mo367getSizeYbymL2g();
                    S s8 = this.$previousSize;
                    Density density = this.$density;
                    State<Function1> state = this.$updatedOnSizeChanged$delegate;
                    if (IntSize.m5342equalsimpl0(mo367getSizeYbymL2g, s8.f33760a)) {
                        return;
                    }
                    s8.f33760a = mo367getSizeYbymL2g;
                    Function1 invoke$lambda$6 = MagnifierKt$magnifier$4.invoke$lambda$6(state);
                    if (invoke$lambda$6 != null) {
                        invoke$lambda$6.invoke(DpSize.m5264boximpl(density.mo446toDpSizekrfVVM(IntSizeKt.m5354toSizeozmzZPI(mo367getSizeYbymL2g))));
                        return;
                    }
                    return;
                }
                this.$magnifier.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f8, u uVar, State<? extends Function1> state, State<Boolean> state2, State<Offset> state3, State<? extends Function1> state4, MutableState<Offset> mutableState, State<Float> state5, d dVar) {
            super(2, dVar);
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
            this.$view = view;
            this.$density = density;
            this.$zoom = f8;
            this.$onNeedsUpdate = uVar;
            this.$updatedOnSizeChanged$delegate = state;
            this.$isMagnifierShown$delegate = state2;
            this.$sourceCenterInRoot$delegate = state3;
            this.$updatedMagnifierCenter$delegate = state4;
            this.$anchorPositionInRoot$delegate = mutableState;
            this.$updatedZoom$delegate = state5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedOnSizeChanged$delegate, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PlatformMagnifier platformMagnifier;
            Object e8 = Q5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    platformMagnifier = (PlatformMagnifier) this.L$0;
                    try {
                        t.b(obj);
                    } catch (Throwable th) {
                        th = th;
                        platformMagnifier.dismiss();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.L$0;
                PlatformMagnifier create = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                S s8 = new S();
                long mo367getSizeYbymL2g = create.mo367getSizeYbymL2g();
                Density density = this.$density;
                Function1 invoke$lambda$6 = MagnifierKt$magnifier$4.invoke$lambda$6(this.$updatedOnSizeChanged$delegate);
                if (invoke$lambda$6 != null) {
                    invoke$lambda$6.invoke(DpSize.m5264boximpl(density.mo446toDpSizekrfVVM(IntSizeKt.m5354toSizeozmzZPI(mo367getSizeYbymL2g))));
                }
                s8.f33760a = mo367getSizeYbymL2g;
                AbstractC3360h.B(AbstractC3360h.E(this.$onNeedsUpdate, new C02851(create, null)), m8);
                try {
                    InterfaceC3358f snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass2(create, this.$density, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, s8, this.$updatedOnSizeChanged$delegate));
                    this.L$0 = create;
                    this.label = 1;
                    if (AbstractC3360h.g(snapshotFlow, this) == e8) {
                        return e8;
                    }
                    platformMagnifier = create;
                } catch (Throwable th2) {
                    th = th2;
                    platformMagnifier = create;
                    platformMagnifier.dismiss();
                    throw th;
                }
            }
            platformMagnifier.dismiss();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3160z implements Function1 {
        final /* synthetic */ u $onNeedsUpdate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(u uVar) {
            super(1);
            this.$onNeedsUpdate = uVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return I.f6487a;
        }

        public final void invoke(DrawScope drawBehind) {
            AbstractC3159y.i(drawBehind, "$this$drawBehind");
            this.$onNeedsUpdate.d(I.f6487a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4(Function1 function1, Function1 function12, float f8, Function1 function13, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
        super(3);
        this.$sourceCenter = function1;
        this.$magnifierCenter = function12;
        this.$zoom = f8;
        this.$onSizeChanged = function13;
        this.$platformMagnifierFactory = platformMagnifierFactory;
        this.$style = magnifierStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<Offset> mutableState) {
        return mutableState.getValue().m2745unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Offset> mutableState, long j8) {
        mutableState.setValue(Offset.m2724boximpl(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 invoke$lambda$3(State<? extends Function1> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 invoke$lambda$4(State<? extends Function1> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 invoke$lambda$6(State<? extends Function1> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$8(State<Offset> state) {
        return state.getValue().m2745unboximpl();
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3159y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-454877003);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-454877003, i8, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:270)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2724boximpl(Offset.Companion.m2750getUnspecifiedF1C5BW0()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
        State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
        State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.$onSizeChanged, composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(density, rememberUpdatedState, mutableState));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new MagnifierKt$magnifier$4$isMagnifierShown$2$1(state));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        State state2 = (State) rememberedValue3;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = AbstractC3340B.b(1, 0, EnumC3132a.DROP_OLDEST, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        u uVar = (u) rememberedValue4;
        Float valueOf = Float.valueOf(this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom);
        MagnifierStyle magnifierStyle = this.$style;
        EffectsKt.LaunchedEffect(new Object[]{view, density, valueOf, magnifierStyle, Boolean.valueOf(AbstractC3159y.d(magnifierStyle, MagnifierStyle.Companion.getTextDefault()))}, (n) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, uVar, rememberUpdatedState4, state2, state, rememberUpdatedState2, mutableState, rememberUpdatedState3, null), composer, 72);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(mutableState);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new MagnifierKt$magnifier$4$2$1(mutableState);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier drawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(composed, (Function1) rememberedValue5), new AnonymousClass3(uVar));
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(state);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed2 || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new MagnifierKt$magnifier$4$4$1(state);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(drawBehind, false, (Function1) rememberedValue6, 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return semantics$default;
    }
}
