package androidx.room;

import O5.I;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import l6.InterfaceC3390x0;

/* loaded from: classes3.dex */
final class CoroutinesRoom$Companion$execute$4$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ InterfaceC3390x0 $job;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, InterfaceC3390x0 interfaceC3390x0) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = interfaceC3390x0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8278a;
    }

    public final void invoke(Throwable th) {
        SupportSQLiteCompat.Api16Impl.cancel(this.$cancellationSignal);
        InterfaceC3390x0.a.a(this.$job, null, 1, null);
    }
}
