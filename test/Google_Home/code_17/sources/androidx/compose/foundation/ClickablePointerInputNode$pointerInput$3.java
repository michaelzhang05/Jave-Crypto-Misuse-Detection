package androidx.compose.foundation;

import O5.I;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ClickablePointerInputNode$pointerInput$3 extends AbstractC3256z implements Function1 {
    final /* synthetic */ ClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode$pointerInput$3(ClickablePointerInputNode clickablePointerInputNode) {
        super(1);
        this.this$0 = clickablePointerInputNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m331invokek4lQ0M(((Offset) obj).m2750unboximpl());
        return I.f8278a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m331invokek4lQ0M(long j8) {
        if (this.this$0.getEnabled()) {
            this.this$0.getOnClick().invoke();
        }
    }
}
