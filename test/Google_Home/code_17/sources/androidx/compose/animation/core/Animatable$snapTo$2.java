package androidx.compose.animation.core;

import O5.I;
import O5.t;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Animatable$snapTo$2 extends l implements Function1 {
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable<T, V> animatable, T t8, S5.d dVar) {
        super(1, dVar);
        this.this$0 = animatable;
        this.$targetValue = t8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(S5.d dVar) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(S5.d dVar) {
        return ((Animatable$snapTo$2) create(dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object clampToBounds;
        T5.b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.endAnimation();
            clampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
            this.this$0.setTargetValue(clampToBounds);
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
