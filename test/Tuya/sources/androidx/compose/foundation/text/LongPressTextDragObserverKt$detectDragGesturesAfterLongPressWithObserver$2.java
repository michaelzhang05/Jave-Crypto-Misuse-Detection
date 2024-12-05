package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2(TextDragObserver textDragObserver) {
        super(1);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m887invokek4lQ0M(((Offset) obj).m2745unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m887invokek4lQ0M(long j8) {
        this.$observer.mo927onStartk4lQ0M(j8);
    }
}
