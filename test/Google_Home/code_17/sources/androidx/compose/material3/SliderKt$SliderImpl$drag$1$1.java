package androidx.compose.material3;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1669o;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import l6.M;

@f(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SliderKt$SliderImpl$drag$1$1 extends l implements InterfaceC1669o {
    final /* synthetic */ State<Function0> $gestureEndAction;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$SliderImpl$drag$1$1(State<? extends Function0> state, d dVar) {
        super(3, dVar);
        this.$gestureEndAction = state;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((M) obj, ((Number) obj2).floatValue(), (d) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label == 0) {
            t.b(obj);
            this.$gestureEndAction.getValue().invoke();
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(M m8, float f8, d dVar) {
        return new SliderKt$SliderImpl$drag$1$1(this.$gestureEndAction, dVar).invokeSuspend(I.f8278a);
    }
}