package androidx.compose.material;

import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import g6.InterfaceC2885e;
import g6.m;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.P;
import l6.AbstractC3364k;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$gestureEndAction$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ M $scope;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ InterfaceC2885e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", l = {361}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC1668n {
        final /* synthetic */ float $current;
        final /* synthetic */ boolean $isStart;
        final /* synthetic */ P $maxPx;
        final /* synthetic */ P $minPx;
        final /* synthetic */ Function0 $onValueChangeFinished;
        final /* synthetic */ State<Function1> $onValueChangeState;
        final /* synthetic */ MutableFloatState $rawOffsetEnd;
        final /* synthetic */ MutableFloatState $rawOffsetStart;
        final /* synthetic */ float $target;
        final /* synthetic */ InterfaceC2885e $valueRange;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03211 extends AbstractC3256z implements Function1 {
            final /* synthetic */ boolean $isStart;
            final /* synthetic */ P $maxPx;
            final /* synthetic */ P $minPx;
            final /* synthetic */ State<Function1> $onValueChangeState;
            final /* synthetic */ MutableFloatState $rawOffsetEnd;
            final /* synthetic */ MutableFloatState $rawOffsetStart;
            final /* synthetic */ InterfaceC2885e $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03211(boolean z8, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1> state, P p8, P p9, InterfaceC2885e interfaceC2885e) {
                super(1);
                this.$isStart = z8;
                this.$rawOffsetStart = mutableFloatState;
                this.$rawOffsetEnd = mutableFloatState2;
                this.$onValueChangeState = state;
                this.$minPx = p8;
                this.$maxPx = p9;
                this.$valueRange = interfaceC2885e;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Animatable<Float, AnimationVector1D>) obj);
                return I.f8278a;
            }

            public final void invoke(Animatable<Float, AnimationVector1D> animateTo) {
                InterfaceC2885e invoke$scaleToUserValue;
                AbstractC3255y.i(animateTo, "$this$animateTo");
                (this.$isStart ? this.$rawOffsetStart : this.$rawOffsetEnd).setFloatValue(animateTo.getValue().floatValue());
                Function1 value = this.$onValueChangeState.getValue();
                invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, m.b(this.$rawOffsetStart.getFloatValue(), this.$rawOffsetEnd.getFloatValue()));
                value.invoke(invoke$scaleToUserValue);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f8, float f9, Function0 function0, boolean z8, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1> state, P p8, P p9, InterfaceC2885e interfaceC2885e, d dVar) {
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
            this.$valueRange = interfaceC2885e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TweenSpec tweenSpec;
            Object e8 = T5.b.e();
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
                C03211 c03211 = new C03211(this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange);
                this.label = 1;
                if (Animatable$default.animateTo(b8, tweenSpec, b9, c03211, this) == e8) {
                    return e8;
                }
            }
            Function0 function0 = this.$onValueChangeFinished;
            if (function0 != null) {
                function0.invoke();
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$gestureEndAction$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, List<Float> list, P p8, P p9, Function0 function0, M m8, State<? extends Function1> state, InterfaceC2885e interfaceC2885e) {
        super(1);
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$tickFractions = list;
        this.$minPx = p8;
        this.$maxPx = p9;
        this.$onValueChangeFinished = function0;
        this.$scope = m8;
        this.$onValueChangeState = state;
        this.$valueRange = interfaceC2885e;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return I.f8278a;
    }

    public final void invoke(boolean z8) {
        float snapValueToTick;
        float floatValue = (z8 ? this.$rawOffsetStart : this.$rawOffsetEnd).getFloatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.f34159a, this.$maxPx.f34159a);
        if (floatValue != snapValueToTick) {
            AbstractC3364k.d(this.$scope, null, null, new AnonymousClass1(floatValue, snapValueToTick, this.$onValueChangeFinished, z8, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, null), 3, null);
            return;
        }
        Function0 function0 = this.$onValueChangeFinished;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
