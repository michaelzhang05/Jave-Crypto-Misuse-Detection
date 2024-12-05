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
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.P;

@f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TransformableStateKt$animateRotateBy$2 extends l implements InterfaceC1668n {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ float $degrees;
    final /* synthetic */ P $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2$1, reason: invalid class name */
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
            d.a(this.$$this$transform, 0.0f, 0L, animateTo.getValue().floatValue() - this.$previous.f34159a, 3, null);
            this.$previous.f34159a = animateTo.getValue().floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateRotateBy$2(P p8, float f8, AnimationSpec<Float> animationSpec, S5.d dVar) {
        super(2, dVar);
        this.$previous = p8;
        this.$degrees = f8;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        TransformableStateKt$animateRotateBy$2 transformableStateKt$animateRotateBy$2 = new TransformableStateKt$animateRotateBy$2(this.$previous, this.$degrees, this.$animationSpec, dVar);
        transformableStateKt$animateRotateBy$2.L$0 = obj;
        return transformableStateKt$animateRotateBy$2;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(TransformScope transformScope, S5.d dVar) {
        return ((TransformableStateKt$animateRotateBy$2) create(transformScope, dVar)).invokeSuspend(I.f8278a);
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
            Float b8 = kotlin.coroutines.jvm.internal.b.b(this.$degrees);
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
