package Q;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f9002a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1387c f9003b;

    public e0(AbstractC1387c abstractC1387c, int i8) {
        this.f9003b = abstractC1387c;
        this.f9002a = i8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC1396l u8;
        AbstractC1387c abstractC1387c = this.f9003b;
        if (iBinder != null) {
            obj = abstractC1387c.f8962n;
            synchronized (obj) {
                try {
                    AbstractC1387c abstractC1387c2 = this.f9003b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1396l)) {
                        u8 = (InterfaceC1396l) queryLocalInterface;
                    } else {
                        u8 = new U(iBinder);
                    }
                    abstractC1387c2.f8963o = u8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f9003b.e0(0, null, this.f9002a);
            return;
        }
        AbstractC1387c.d0(abstractC1387c, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f9003b.f8962n;
        synchronized (obj) {
            this.f9003b.f8963o = null;
        }
        AbstractC1387c abstractC1387c = this.f9003b;
        int i8 = this.f9002a;
        Handler handler = abstractC1387c.f8960l;
        handler.sendMessage(handler.obtainMessage(6, i8, 1));
    }
}
