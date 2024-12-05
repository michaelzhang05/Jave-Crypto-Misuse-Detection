package androidx.room;

import L5.I;
import i6.InterfaceC2855x0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class RoomDatabaseKt$acquireTransactionThread$2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ InterfaceC2855x0 $controlJob;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$acquireTransactionThread$2$1(InterfaceC2855x0 interfaceC2855x0) {
        super(1);
        this.$controlJob = interfaceC2855x0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f6487a;
    }

    public final void invoke(Throwable th) {
        InterfaceC2855x0.a.a(this.$controlJob, null, 1, null);
    }
}
