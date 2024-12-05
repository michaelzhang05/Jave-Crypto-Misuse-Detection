package androidx.datastore.core;

import O5.I;
import a6.InterfaceC1668n;
import androidx.datastore.core.Message;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.InterfaceC3389x;

/* loaded from: classes3.dex */
final class DataStoreImpl$writeActor$2 extends AbstractC3256z implements InterfaceC1668n {
    public static final DataStoreImpl$writeActor$2 INSTANCE = new DataStoreImpl$writeActor$2();

    DataStoreImpl$writeActor$2() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Message.Update) obj, (Throwable) obj2);
        return I.f8278a;
    }

    public final void invoke(Message.Update<T> msg, Throwable th) {
        AbstractC3255y.i(msg, "msg");
        InterfaceC3389x ack = msg.getAck();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ack.a(th);
    }
}
