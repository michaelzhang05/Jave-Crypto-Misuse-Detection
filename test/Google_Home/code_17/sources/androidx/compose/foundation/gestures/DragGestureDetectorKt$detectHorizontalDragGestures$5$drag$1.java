package androidx.compose.foundation.gestures;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ P $overSlop;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1(P p8) {
        super(2);
        this.$overSlop = p8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PointerInputChange) obj, ((Number) obj2).floatValue());
        return I.f8278a;
    }

    public final void invoke(PointerInputChange change, float f8) {
        AbstractC3255y.i(change, "change");
        change.consume();
        this.$overSlop.f34159a = f8;
    }
}