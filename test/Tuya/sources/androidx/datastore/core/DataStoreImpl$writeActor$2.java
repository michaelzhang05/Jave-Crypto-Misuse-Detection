package androidx.datastore.core;

import L5.I;
import X5.n;
import androidx.datastore.core.Message;
import i6.InterfaceC2854x;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class DataStoreImpl$writeActor$2 extends AbstractC3160z implements n {
    public static final DataStoreImpl$writeActor$2 INSTANCE = new DataStoreImpl$writeActor$2();

    DataStoreImpl$writeActor$2() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Message.Update) obj, (Throwable) obj2);
        return I.f6487a;
    }

    public final void invoke(Message.Update<T> msg, Throwable th) {
        AbstractC3159y.i(msg, "msg");
        InterfaceC2854x ack = msg.getAck();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ack.a(th);
    }
}
