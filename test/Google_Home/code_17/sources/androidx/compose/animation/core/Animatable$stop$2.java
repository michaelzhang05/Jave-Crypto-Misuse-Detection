package androidx.compose.animation.core;

import O5.I;
import O5.t;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Animatable$stop$2 extends l implements Function1 {
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$stop$2(Animatable<T, V> animatable, S5.d dVar) {
        super(1, dVar);
        this.this$0 = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(S5.d dVar) {
        return new Animatable$stop$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(S5.d dVar) {
        return ((Animatable$stop$2) create(dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        T5.b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.endAnimation();
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
