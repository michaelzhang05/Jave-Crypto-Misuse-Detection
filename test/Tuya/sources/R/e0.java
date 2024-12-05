package R;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f8540a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1306c f8541b;

    public e0(AbstractC1306c abstractC1306c, int i8) {
        this.f8541b = abstractC1306c;
        this.f8540a = i8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC1315l u8;
        AbstractC1306c abstractC1306c = this.f8541b;
        if (iBinder != null) {
            obj = abstractC1306c.f8500n;
            synchronized (obj) {
                try {
                    AbstractC1306c abstractC1306c2 = this.f8541b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1315l)) {
                        u8 = (InterfaceC1315l) queryLocalInterface;
                    } else {
                        u8 = new U(iBinder);
                    }
                    abstractC1306c2.f8501o = u8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f8541b.e0(0, null, this.f8540a);
            return;
        }
        AbstractC1306c.d0(abstractC1306c, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f8541b.f8500n;
        synchronized (obj) {
            this.f8541b.f8501o = null;
        }
        AbstractC1306c abstractC1306c = this.f8541b;
        int i8 = this.f8540a;
        Handler handler = abstractC1306c.f8498l;
        handler.sendMessage(handler.obtainMessage(6, i8, 1));
    }
}
