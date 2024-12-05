package androidx.compose.foundation.text;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$5 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(TextDragObserver textDragObserver) {
        super(2);
        this.$observer = textDragObserver;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m899invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m2750unboximpl());
        return I.f8278a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m899invokeUv8p0NA(PointerInputChange pointerInputChange, long j8) {
        AbstractC3255y.i(pointerInputChange, "<anonymous parameter 0>");
        this.$observer.mo931onDragk4lQ0M(j8);
    }
}
