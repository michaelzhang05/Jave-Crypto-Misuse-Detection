package androidx.compose.foundation.gestures;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitAllPointersUp$2 extends k implements InterfaceC1668n {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ForEachGestureKt$awaitAllPointersUp$2(S5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(dVar);
        forEachGestureKt$awaitAllPointersUp$2.L$0 = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, S5.d dVar) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8278a);
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
            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.label = 1;
            if (ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
