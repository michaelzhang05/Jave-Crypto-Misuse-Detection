package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.runtime.MutableFloatState;
import i6.AbstractC2829k;
import i6.M;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
final class SliderKt$Slider$3$gestureEndAction$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ MutableFloatState $rawOffset;
    final /* synthetic */ M $scope;
    final /* synthetic */ List<Float> $tickFractions;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", l = {213}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ float $current;
        final /* synthetic */ SliderDraggableState $draggableState;
        final /* synthetic */ Function0 $onValueChangeFinished;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SliderDraggableState sliderDraggableState, float f8, float f9, float f10, Function0 function0, d dVar) {
            super(2, dVar);
            this.$draggableState = sliderDraggableState;
            this.$current = f8;
            this.$target = f9;
            this.$velocity = f10;
            this.$onValueChangeFinished = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object animateToTarget;
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
                SliderDraggableState sliderDraggableState = this.$draggableState;
                float f8 = this.$current;
                float f9 = this.$target;
                float f10 = this.$velocity;
                this.label = 1;
                animateToTarget = SliderKt.animateToTarget(sliderDraggableState, f8, f9, f10, this);
                if (animateToTarget == e8) {
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
    public SliderKt$Slider$3$gestureEndAction$1(MutableFloatState mutableFloatState, List<Float> list, P p8, P p9, M m8, SliderDraggableState sliderDraggableState, Function0 function0) {
        super(1);
        this.$rawOffset = mutableFloatState;
        this.$tickFractions = list;
        this.$minPx = p8;
        this.$maxPx = p9;
        this.$scope = m8;
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f6487a;
    }

    public final void invoke(float f8) {
        float snapValueToTick;
        Function0 function0;
        float floatValue = this.$rawOffset.getFloatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.f33758a, this.$maxPx.f33758a);
        if (floatValue != snapValueToTick) {
            AbstractC2829k.d(this.$scope, null, null, new AnonymousClass1(this.$draggableState, floatValue, snapValueToTick, f8, this.$onValueChangeFinished, null), 3, null);
        } else {
            if (this.$draggableState.isDragging() || (function0 = this.$onValueChangeFinished) == null) {
                return;
            }
            function0.invoke();
        }
    }
}
