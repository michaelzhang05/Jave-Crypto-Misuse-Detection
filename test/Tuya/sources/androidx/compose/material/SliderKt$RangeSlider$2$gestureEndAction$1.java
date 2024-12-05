package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import d6.InterfaceC2561e;
import d6.m;
import i6.AbstractC2829k;
import i6.M;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$gestureEndAction$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ M $scope;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ InterfaceC2561e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", l = {361}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ float $current;
        final /* synthetic */ boolean $isStart;
        final /* synthetic */ P $maxPx;
        final /* synthetic */ P $minPx;
        final /* synthetic */ Function0 $onValueChangeFinished;
        final /* synthetic */ State<Function1> $onValueChangeState;
        final /* synthetic */ MutableFloatState $rawOffsetEnd;
        final /* synthetic */ MutableFloatState $rawOffsetStart;
        final /* synthetic */ float $target;
        final /* synthetic */ InterfaceC2561e $valueRange;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03161 extends AbstractC3160z implements Function1 {
            final /* synthetic */ boolean $isStart;
            final /* synthetic */ P $maxPx;
            final /* synthetic */ P $minPx;
            final /* synthetic */ State<Function1> $onValueChangeState;
            final /* synthetic */ MutableFloatState $rawOffsetEnd;
            final /* synthetic */ MutableFloatState $rawOffsetStart;
            final /* synthetic */ InterfaceC2561e $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03161(boolean z8, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1> state, P p8, P p9, InterfaceC2561e interfaceC2561e) {
                super(1);
                this.$isStart = z8;
                this.$rawOffsetStart = mutableFloatState;
                this.$rawOffsetEnd = mutableFloatState2;
                this.$onValueChangeState = state;
                this.$minPx = p8;
                this.$maxPx = p9;
                this.$valueRange = interfaceC2561e;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Animatable<Float, AnimationVector1D>) obj);
                return I.f6487a;
            }

            public final void invoke(Animatable<Float, AnimationVector1D> animateTo) {
                InterfaceC2561e invoke$scaleToUserValue;
                AbstractC3159y.i(animateTo, "$this$animateTo");
                (this.$isStart ? this.$rawOffsetStart : this.$rawOffsetEnd).setFloatValue(animateTo.getValue().floatValue());
                Function1 value = this.$onValueChangeState.getValue();
                invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, m.b(this.$rawOffsetStart.getFloatValue(), this.$rawOffsetEnd.getFloatValue()));
                value.invoke(invoke$scaleToUserValue);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f8, float f9, Function0 function0, boolean z8, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1> state, P p8, P p9, InterfaceC2561e interfaceC2561e, d dVar) {
            super(2, dVar);
            this.$current = f8;
            this.$target = f9;
            this.$onValueChangeFinished = function0;
            this.$isStart = z8;
            this.$rawOffsetStart = mutableFloatState;
            this.$rawOffsetEnd = mutableFloatState2;
            this.$onValueChangeState = state;
            this.$minPx = p8;
            this.$maxPx = p9;
            this.$valueRange = interfaceC2561e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TweenSpec tweenSpec;
            Object e8 = Q5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float b8 = kotlin.coroutines.jvm.internal.b.b(this.$target);
                tweenSpec = SliderKt.SliderToTickAnimation;
                Float b9 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                C03161 c03161 = new C03161(this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange);
                this.label = 1;
                if (Animatable$default.animateTo(b8, tweenSpec, b9, c03161, this) == e8) {
                    return e8;
                }
            }
            Function0 function0 = this.$onValueChangeFinished;
            if (function0 != null) {
                function0.invoke();
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$gestureEndAction$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, List<Float> list, P p8, P p9, Function0 function0, M m8, State<? extends Function1> state, InterfaceC2561e interfaceC2561e) {
        super(1);
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$tickFractions = list;
        this.$minPx = p8;
        this.$maxPx = p9;
        this.$onValueChangeFinished = function0;
        this.$scope = m8;
        this.$onValueChangeState = state;
        this.$valueRange = interfaceC2561e;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return I.f6487a;
    }

    public final void invoke(boolean z8) {
        float snapValueToTick;
        float floatValue = (z8 ? this.$rawOffsetStart : this.$rawOffsetEnd).getFloatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.f33758a, this.$maxPx.f33758a);
        if (floatValue != snapValueToTick) {
            AbstractC2829k.d(this.$scope, null, null, new AnonymousClass1(floatValue, snapValueToTick, this.$onValueChangeFinished, z8, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, null), 3, null);
            return;
        }
        Function0 function0 = this.$onValueChangeFinished;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
