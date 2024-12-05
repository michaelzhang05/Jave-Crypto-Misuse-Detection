package v1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class t0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f9647a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f9648b;

    public t0(c cVar, int i6) {
        this.f9648b = cVar;
        this.f9647a = i6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        c cVar = this.f9648b;
        if (iBinder == null) {
            c.b0(cVar, 16);
            return;
        }
        obj = cVar.f9520n;
        synchronized (obj) {
            c cVar2 = this.f9648b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f9521o = (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new m0(iBinder) : (k) queryLocalInterface;
        }
        this.f9648b.c0(0, null, this.f9647a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f9648b.f9520n;
        synchronized (obj) {
            this.f9648b.f9521o = null;
        }
        Handler handler = this.f9648b.f9518l;
        handler.sendMessage(handler.obtainMessage(6, this.f9647a, 1));
    }
}
