package androidx.compose.foundation.text;

import L5.I;
import X5.n;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$5 extends AbstractC3160z implements n {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(TextDragObserver textDragObserver) {
        super(2);
        this.$observer = textDragObserver;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m894invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m2745unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m894invokeUv8p0NA(PointerInputChange pointerInputChange, long j8) {
        AbstractC3159y.i(pointerInputChange, "<anonymous parameter 0>");
        this.$observer.mo926onDragk4lQ0M(j8);
    }
}
