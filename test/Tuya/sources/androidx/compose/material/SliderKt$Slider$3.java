package androidx.compose.material;

import L5.I;
import P5.h;
import X5.o;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
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
import d6.InterfaceC2561e;
import d6.m;
import i6.M;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Slider$3 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2561e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends C3156v implements Function1 {
        final /* synthetic */ P $maxPx;
        final /* synthetic */ P $minPx;
        final /* synthetic */ InterfaceC2561e $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC2561e interfaceC2561e, P p8, P p9) {
            super(1, AbstractC3159y.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = interfaceC2561e;
            this.$minPx = p8;
            this.$maxPx = p9;
        }

        public final Float invoke(float f8) {
            return Float.valueOf(SliderKt$Slider$3.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f8));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3(InterfaceC2561e interfaceC2561e, int i8, float f8, MutableInteractionSource mutableInteractionSource, boolean z8, List<Float> list, SliderColors sliderColors, State<? extends Function1> state, Function0 function0) {
        super(3);
        this.$valueRange = interfaceC2561e;
        this.$$dirty = i8;
        this.$value = f8;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z8;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
        this.$onValueChangeFinished = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(InterfaceC2561e interfaceC2561e, P p8, P p9, float f8) {
        float scale;
        scale = SliderKt.scale(((Number) interfaceC2561e.getStart()).floatValue(), ((Number) interfaceC2561e.getEndInclusive()).floatValue(), f8, p8.f33758a, p9.f33758a);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(P p8, P p9, InterfaceC2561e interfaceC2561e, float f8) {
        float scale;
        scale = SliderKt.scale(p8.f33758a, p9.f33758a, f8, ((Number) interfaceC2561e.getStart()).floatValue(), ((Number) interfaceC2561e.getEndInclusive()).floatValue());
        return scale;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
        int i9;
        Modifier sliderTapModifier;
        float calcFraction;
        AbstractC3159y.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2085116814, i8, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:175)");
        }
        boolean z8 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(BoxWithConstraints.mo538getConstraintsmsEJaDk());
        P p8 = new P();
        P p9 = new P();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        p8.f33758a = Math.max(m5146getMaxWidthimpl - density.mo448toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
        p9.f33758a = Math.min(density.mo448toPx0680j_4(SliderKt.getThumbRadius()), p8.f33758a);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f7994a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        float f8 = this.$value;
        InterfaceC2561e interfaceC2561e = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(interfaceC2561e, p9, p8, f8));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
        Object valueOf = Float.valueOf(p9.f33758a);
        Object valueOf2 = Float.valueOf(p8.f33758a);
        InterfaceC2561e interfaceC2561e2 = this.$valueRange;
        State<Function1> state = this.$onValueChangeState;
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(interfaceC2561e2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == companion.getEmpty()) {
            Object sliderDraggableState = new SliderDraggableState(new SliderKt$Slider$3$draggableState$1$1(mutableFloatState, mutableFloatState2, p9, p8, state, interfaceC2561e2));
            composer.updateRememberedValue(sliderDraggableState);
            rememberedValue4 = sliderDraggableState;
        }
        composer.endReplaceableGroup();
        SliderDraggableState sliderDraggableState2 = (SliderDraggableState) rememberedValue4;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$valueRange, p9, p8);
        InterfaceC2561e interfaceC2561e3 = this.$valueRange;
        InterfaceC2561e b8 = m.b(p9.f33758a, p8.f33758a);
        float f9 = this.$value;
        int i10 = this.$$dirty;
        SliderKt.CorrectValueSideEffect(anonymousClass2, interfaceC2561e3, b8, mutableFloatState, f9, composer, ((i10 >> 9) & 112) | 3072 | ((i10 << 12) & 57344));
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$Slider$3$gestureEndAction$1(mutableFloatState, this.$tickFractions, p9, p8, coroutineScope, sliderDraggableState2, this.$onValueChangeFinished), composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        sliderTapModifier = SliderKt.sliderTapModifier(companion2, sliderDraggableState2, this.$interactionSource, m5146getMaxWidthimpl, z8, mutableFloatState, rememberUpdatedState, mutableFloatState2, this.$enabled);
        Orientation orientation = Orientation.Horizontal;
        boolean isDragging = sliderDraggableState2.isDragging();
        boolean z9 = this.$enabled;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(rememberUpdatedState);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed2 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new SliderKt$Slider$3$drag$1$1(rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier draggable$default = DraggableKt.draggable$default(companion2, sliderDraggableState2, orientation, z9, mutableInteractionSource, isDragging, null, (o) rememberedValue5, z8, 32, null);
        calcFraction = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), m.j(this.$value, ((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue()));
        boolean z10 = this.$enabled;
        List<Float> list = this.$tickFractions;
        SliderColors sliderColors = this.$colors;
        float f10 = p8.f33758a - p9.f33758a;
        MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
        Modifier then = sliderTapModifier.then(draggable$default);
        int i11 = this.$$dirty;
        SliderKt.SliderImpl(z10, calcFraction, list, sliderColors, f10, mutableInteractionSource2, then, composer, ((i11 >> 9) & 14) | 512 | ((i11 >> 15) & 7168) | ((i11 >> 6) & 458752));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
