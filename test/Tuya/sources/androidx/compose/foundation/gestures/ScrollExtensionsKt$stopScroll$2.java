package androidx.compose.foundation.gestures;

import L5.I;
import L5.t;
import X5.n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollExtensionsKt$stopScroll$2 extends l implements n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollExtensionsKt$stopScroll$2(P5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new ScrollExtensionsKt$stopScroll$2(dVar);
    }

    @Override // X5.n
    public final Object invoke(ScrollScope scrollScope, P5.d dVar) {
        return ((ScrollExtensionsKt$stopScroll$2) create(scrollScope, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q5.b.e();
        if (this.label == 0) {
            t.b(obj);
            return I.f6487a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
