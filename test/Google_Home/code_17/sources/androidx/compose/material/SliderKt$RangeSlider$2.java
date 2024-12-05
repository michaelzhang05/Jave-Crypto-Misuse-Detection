package androidx.compose.material;

import O5.I;
import S5.h;
import a6.InterfaceC1669o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g6.InterfaceC2885e;
import g6.m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.P;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ InterfaceC2885e $value;
    final /* synthetic */ InterfaceC2885e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends C3252v implements Function1 {
        final /* synthetic */ P $maxPx;
        final /* synthetic */ P $minPx;
        final /* synthetic */ InterfaceC2885e $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC2885e interfaceC2885e, P p8, P p9) {
            super(1, AbstractC3255y.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = interfaceC2885e;
            this.$minPx = p8;
            this.$maxPx = p9;
        }

        public final Float invoke(float f8) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f8));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass3 extends C3252v implements Function1 {
        final /* synthetic */ P $maxPx;
        final /* synthetic */ P $minPx;
        final /* synthetic */ InterfaceC2885e $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InterfaceC2885e interfaceC2885e, P p8, P p9) {
            super(1, AbstractC3255y.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = interfaceC2885e;
            this.$minPx = p8;
            this.$maxPx = p9;
        }

        public final Float invoke(float f8) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f8));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(InterfaceC2885e interfaceC2885e, InterfaceC2885e interfaceC2885e2, int i8, State<? extends Function1> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z8, int i9, Function0 function0, List<Float> list, SliderColors sliderColors) {
        super(3);
        this.$valueRange = interfaceC2885e;
        this.$value = interfaceC2885e2;
        this.$$dirty = i8;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z8;
        this.$steps = i9;
        this.$onValueChangeFinished = function0;
        this.$tickFractions = list;
        this.$colors = sliderColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(InterfaceC2885e interfaceC2885e, P p8, P p9, float f8) {
        float scale;
        scale = SliderKt.scale(((Number) interfaceC2885e.getStart()).floatValue(), ((Number) interfaceC2885e.getEndInclusive()).floatValue(), f8, p8.f34159a, p9.f34159a);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2885e invoke$scaleToUserValue(P p8, P p9, InterfaceC2885e interfaceC2885e, InterfaceC2885e interfaceC2885e2) {
        InterfaceC2885e scale;
        scale = SliderKt.scale(p8.f34159a, p9.f34159a, interfaceC2885e2, ((Number) interfaceC2885e.getStart()).floatValue(), ((Number) interfaceC2885e.getEndInclusive()).floatValue());
        return scale;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
        Modifier rangeSliderPressDragModifier;
        float calcFraction;
        float calcFraction2;
        Modifier sliderSemantics;
        Modifier sliderSemantics2;
        AbstractC3255y.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((((i8 & 14) == 0 ? (composer.changed(BoxWithConstraints) ? 4 : 2) | i8 : i8) & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(652589923, i8, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:314)");
        }
        boolean z8 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(BoxWithConstraints.mo543getConstraintsmsEJaDk());
        P p8 = new P();
        P p9 = new P();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        p8.f34159a = m5151getMaxWidthimpl - density.mo453toPx0680j_4(SliderKt.getThumbRadius());
        p9.f34159a = density.mo453toPx0680j_4(SliderKt.getThumbRadius());
        InterfaceC2885e interfaceC2885e = this.$value;
        InterfaceC2885e interfaceC2885e2 = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(interfaceC2885e2, p9, p8, ((Number) interfaceC2885e.getStart()).floatValue()));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
        InterfaceC2885e interfaceC2885e3 = this.$value;
        InterfaceC2885e interfaceC2885e4 = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(interfaceC2885e4, p9, p8, ((Number) interfaceC2885e3.getEndInclusive()).floatValue()));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
        SliderKt.CorrectValueSideEffect(new AnonymousClass2(this.$valueRange, p9, p8), this.$valueRange, m.b(p9.f34159a, p8.f34159a), mutableFloatState, ((Number) this.$value.getStart()).floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
        SliderKt.CorrectValueSideEffect(new AnonymousClass3(this.$valueRange, p9, p8), this.$valueRange, m.b(p9.f34159a, p8.f34159a), mutableFloatState2, ((Number) this.$value.getEndInclusive()).floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f9825a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue3 = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
        composer.endReplaceableGroup();
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSlider$2$gestureEndAction$1(mutableFloatState, mutableFloatState2, this.$tickFractions, p9, p8, this.$onValueChangeFinished, coroutineScope, this.$onValueChangeState, this.$valueRange), composer, 0);
        Object obj = this.$valueRange;
        Object valueOf = Float.valueOf(p9.f34159a);
        Object valueOf2 = Float.valueOf(p8.f34159a);
        InterfaceC2885e interfaceC2885e5 = this.$value;
        State<Function1> state = this.$onValueChangeState;
        Object[] objArr = {mutableFloatState, mutableFloatState2, obj, valueOf, valueOf2, interfaceC2885e5, state};
        InterfaceC2885e interfaceC2885e6 = this.$valueRange;
        composer.startReplaceableGroup(-568225417);
        boolean z9 = false;
        for (int i9 = 0; i9 < 7; i9++) {
            z9 |= composer.changed(objArr[i9]);
        }
        Object rememberedValue4 = composer.rememberedValue();
        if (z9 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new SliderKt$RangeSlider$2$onDrag$1$1(mutableFloatState, mutableFloatState2, interfaceC2885e5, p9, p8, state, interfaceC2885e6);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rememberedValue4, composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableFloatState, mutableFloatState2, this.$enabled, z8, m5151getMaxWidthimpl, this.$valueRange, rememberUpdatedState, rememberUpdatedState2);
        float j8 = m.j(((Number) this.$value.getStart()).floatValue(), ((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$value.getEndInclusive()).floatValue());
        float j9 = m.j(((Number) this.$value.getEndInclusive()).floatValue(), ((Number) this.$value.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue());
        calcFraction = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), j8);
        calcFraction2 = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), j9);
        int floor = (int) Math.floor(this.$steps * calcFraction2);
        int floor2 = (int) Math.floor(this.$steps * (1.0f - calcFraction));
        boolean z10 = this.$enabled;
        Object obj2 = this.$onValueChangeState;
        Object valueOf3 = Float.valueOf(j9);
        State<Function1> state2 = this.$onValueChangeState;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj2) | composer.changed(valueOf3);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == Composer.Companion.getEmpty()) {
            rememberedValue5 = new SliderKt$RangeSlider$2$startThumbSemantics$1$1(state2, j9);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        sliderSemantics = SliderKt.sliderSemantics(companion2, j8, z10, (Function1) rememberedValue5, this.$onValueChangeFinished, m.b(((Number) this.$valueRange.getStart()).floatValue(), j9), floor);
        boolean z11 = this.$enabled;
        Object obj3 = this.$onValueChangeState;
        Object valueOf4 = Float.valueOf(j8);
        State<Function1> state3 = this.$onValueChangeState;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(obj3) | composer.changed(valueOf4);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed2 || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = new SliderKt$RangeSlider$2$endThumbSemantics$1$1(state3, j8);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        sliderSemantics2 = SliderKt.sliderSemantics(companion2, j9, z11, (Function1) rememberedValue6, this.$onValueChangeFinished, m.b(j8, ((Number) this.$valueRange.getEndInclusive()).floatValue()), floor2);
        boolean z12 = this.$enabled;
        List<Float> list = this.$tickFractions;
        SliderColors sliderColors = this.$colors;
        float f8 = p8.f34159a - p9.f34159a;
        MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
        MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
        int i10 = this.$$dirty;
        SliderKt.RangeSliderImpl(z12, calcFraction, calcFraction2, list, sliderColors, f8, mutableInteractionSource, mutableInteractionSource2, rangeSliderPressDragModifier, sliderSemantics, sliderSemantics2, composer, ((i10 >> 9) & 14) | 14159872 | ((i10 >> 9) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
