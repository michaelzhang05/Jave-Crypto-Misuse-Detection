package androidx.compose.foundation.gestures;

import L5.I;
import L5.t;
import X5.o;
import androidx.compose.ui.geometry.Offset;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.ScrollableKt$NoOpOnDragStarted$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollableKt$NoOpOnDragStarted$1 extends l implements o {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollableKt$NoOpOnDragStarted$1(P5.d dVar) {
        super(3, dVar);
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m453invoked4ec7I((M) obj, ((Offset) obj2).m2745unboximpl(), (P5.d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m453invoked4ec7I(M m8, long j8, P5.d dVar) {
        return new ScrollableKt$NoOpOnDragStarted$1(dVar).invokeSuspend(I.f6487a);
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
