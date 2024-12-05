package androidx.compose.runtime;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import android.view.Choreographer;
import l6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock$choreographer$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultChoreographerFrameClock$choreographer$1(S5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new DefaultChoreographerFrameClock$choreographer$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        T5.b.e();
        if (this.label == 0) {
            t.b(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, S5.d dVar) {
        return ((DefaultChoreographerFrameClock$choreographer$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
