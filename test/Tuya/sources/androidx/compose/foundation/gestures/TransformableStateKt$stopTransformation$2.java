package androidx.compose.foundation.gestures;

import L5.I;
import L5.t;
import X5.n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TransformableStateKt$stopTransformation$2 extends l implements n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransformableStateKt$stopTransformation$2(P5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new TransformableStateKt$stopTransformation$2(dVar);
    }

    @Override // X5.n
    public final Object invoke(TransformScope transformScope, P5.d dVar) {
        return ((TransformableStateKt$stopTransformation$2) create(transformScope, dVar)).invokeSuspend(I.f6487a);
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
