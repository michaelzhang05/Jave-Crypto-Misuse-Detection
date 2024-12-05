package androidx.compose.foundation.gestures;

import O5.I;
import O5.t;
import a6.InterfaceC1669o;
import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TapGestureDetectorKt$NoPressGesture$1 extends l implements InterfaceC1669o {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapGestureDetectorKt$NoPressGesture$1(S5.d dVar) {
        super(3, dVar);
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m478invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m2750unboximpl(), (S5.d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m478invoked4ec7I(PressGestureScope pressGestureScope, long j8, S5.d dVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(dVar).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        T5.b.e();
        if (this.label == 0) {
            t.b(obj);
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
