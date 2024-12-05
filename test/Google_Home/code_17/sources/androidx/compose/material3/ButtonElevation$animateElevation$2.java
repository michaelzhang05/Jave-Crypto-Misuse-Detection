package androidx.compose.material3;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.unit.Dp;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.M;

@f(c = "androidx.compose.material3.ButtonElevation$animateElevation$2", f = "Button.kt", l = {855}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ButtonElevation$animateElevation$2 extends l implements InterfaceC1668n {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ float $target;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2(Animatable<Dp, AnimationVector1D> animatable, float f8, d dVar) {
        super(2, dVar);
        this.$animatable = animatable;
        this.$target = f8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new ButtonElevation$animateElevation$2(this.$animatable, this.$target, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
            Dp m5181boximpl = Dp.m5181boximpl(this.$target);
            this.label = 1;
            if (animatable.snapTo(m5181boximpl, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((ButtonElevation$animateElevation$2) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
