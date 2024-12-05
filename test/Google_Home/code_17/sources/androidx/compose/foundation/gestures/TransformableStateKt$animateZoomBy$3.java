package androidx.compose.foundation.gestures;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.P;

@f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TransformableStateKt$animateZoomBy$3 extends l implements InterfaceC1668n {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ P $previous;
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        final /* synthetic */ TransformScope $$this$transform;
        final /* synthetic */ P $previous;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(P p8, TransformScope transformScope) {
            super(1);
            this.$previous = p8;
            this.$$this$transform = transformScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnimationScope<Float, AnimationVector1D>) obj);
            return I.f8278a;
        }

        public final void invoke(AnimationScope<Float, AnimationVector1D> animateTo) {
            AbstractC3255y.i(animateTo, "$this$animateTo");
            d.a(this.$$this$transform, this.$previous.f34159a == 0.0f ? 1.0f : animateTo.getValue().floatValue() / this.$previous.f34159a, 0L, 0.0f, 6, null);
            this.$previous.f34159a = animateTo.getValue().floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateZoomBy$3(P p8, float f8, AnimationSpec<Float> animationSpec, S5.d dVar) {
        super(2, dVar);
        this.$previous = p8;
        this.$zoomFactor = f8;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        TransformableStateKt$animateZoomBy$3 transformableStateKt$animateZoomBy$3 = new TransformableStateKt$animateZoomBy$3(this.$previous, this.$zoomFactor, this.$animationSpec, dVar);
        transformableStateKt$animateZoomBy$3.L$0 = obj;
        return transformableStateKt$animateZoomBy$3;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(TransformScope transformScope, S5.d dVar) {
        return ((TransformableStateKt$animateZoomBy$3) create(transformScope, dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f34159a, 0.0f, 0L, 0L, false, 30, null);
            Float b8 = kotlin.coroutines.jvm.internal.b.b(this.$zoomFactor);
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$previous, transformScope);
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, b8, animationSpec, false, anonymousClass1, this, 4, null) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
