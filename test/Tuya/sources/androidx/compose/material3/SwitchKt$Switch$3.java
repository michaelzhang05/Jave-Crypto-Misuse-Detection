package androidx.compose.material3;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import i6.AbstractC2829k;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwitchKt$Switch$3 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;
    final /* synthetic */ M $scope;
    final /* synthetic */ float $targetValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material3.SwitchKt$Switch$3$1", f = "Switch.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;
        final /* synthetic */ float $targetValue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, float f8, d dVar) {
            super(2, dVar);
            this.$offset = animatable;
            this.$targetValue = f8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$offset, this.$targetValue, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TweenSpec tweenSpec;
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$offset;
                Float b8 = kotlin.coroutines.jvm.internal.b.b(this.$targetValue);
                tweenSpec = SwitchKt.AnimationSpec;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, b8, tweenSpec, null, null, this, 12, null) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$3(Animatable<Float, AnimationVector1D> animatable, float f8, M m8) {
        super(1);
        this.$offset = animatable;
        this.$targetValue = f8;
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        AbstractC3159y.i(DisposableEffect, "$this$DisposableEffect");
        float floatValue = this.$offset.getTargetValue().floatValue();
        float f8 = this.$targetValue;
        if (floatValue != f8) {
            AbstractC2829k.d(this.$scope, null, null, new AnonymousClass1(this.$offset, f8, null), 3, null);
        }
        return new DisposableEffectResult() { // from class: androidx.compose.material3.SwitchKt$Switch$3$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
