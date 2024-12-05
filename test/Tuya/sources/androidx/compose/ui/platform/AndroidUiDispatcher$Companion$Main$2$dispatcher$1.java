package androidx.compose.ui.platform;

import android.view.Choreographer;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(P5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(dVar);
    }

    @Override // X5.n
    public final Object invoke(i6.M m8, P5.d dVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q5.b.e();
        if (this.label == 0) {
            L5.t.b(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
