package androidx.room;

import L5.I;
import i6.InterfaceC2802A;
import i6.InterfaceC2855x0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class RoomDatabaseKt$createTransactionContext$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ InterfaceC2802A $controlJob;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$createTransactionContext$2(InterfaceC2802A interfaceC2802A) {
        super(1);
        this.$controlJob = interfaceC2802A;
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
