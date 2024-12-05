package r1;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f9095a;

    /* renamed from: b, reason: collision with root package name */
    private final h f9096b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f9095a = new Messenger(iBinder);
            this.f9096b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f9096b = new h(iBinder);
            this.f9095a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f9095a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        h hVar = this.f9096b;
        if (hVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        hVar.b(message);
    }
}
