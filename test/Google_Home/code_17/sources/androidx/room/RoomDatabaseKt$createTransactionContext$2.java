package androidx.room;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import l6.InterfaceC3337A;
import l6.InterfaceC3390x0;

/* loaded from: classes3.dex */
final class RoomDatabaseKt$createTransactionContext$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ InterfaceC3337A $controlJob;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$createTransactionContext$2(InterfaceC3337A interfaceC3337A) {
        super(1);
        this.$controlJob = interfaceC3337A;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8278a;
    }

    public final void invoke(Throwable th) {
        InterfaceC3390x0.a.a(this.$controlJob, null, 1, null);
    }
}
