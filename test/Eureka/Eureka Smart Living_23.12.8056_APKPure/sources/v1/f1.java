package v1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 extends h {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f9583f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Context f9584g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Handler f9585h;

    /* renamed from: i, reason: collision with root package name */
    private final e1 f9586i;

    /* renamed from: j, reason: collision with root package name */
    private final y1.b f9587j;

    /* renamed from: k, reason: collision with root package name */
    private final long f9588k;

    /* renamed from: l, reason: collision with root package name */
    private final long f9589l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(Context context, Looper looper) {
        e1 e1Var = new e1(this, null);
        this.f9586i = e1Var;
        this.f9584g = context.getApplicationContext();
        this.f9585h = new f2.e(looper, e1Var);
        this.f9587j = y1.b.b();
        this.f9588k = 5000L;
        this.f9589l = 300000L;
    }

    @Override // v1.h
    protected final void d(a1 a1Var, ServiceConnection serviceConnection, String str) {
        n.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9583f) {
            c1 c1Var = (c1) this.f9583f.get(a1Var);
            if (c1Var == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + a1Var.toString());
            }
            if (!c1Var.h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + a1Var.toString());
            }
            c1Var.f(serviceConnection, str);
            if (c1Var.i()) {
                this.f9585h.sendMessageDelayed(this.f9585h.obtainMessage(0, a1Var), this.f9588k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.h
    public final boolean f(a1 a1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j6;
        n.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9583f) {
            c1 c1Var = (c1) this.f9583f.get(a1Var);
            if (c1Var == null) {
                c1Var = new c1(this, a1Var);
                c1Var.d(serviceConnection, serviceConnection, str);
                c1Var.e(str, executor);
                this.f9583f.put(a1Var, c1Var);
            } else {
                this.f9585h.removeMessages(0, a1Var);
                if (c1Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + a1Var.toString());
                }
                c1Var.d(serviceConnection, serviceConnection, str);
                int a6 = c1Var.a();
                if (a6 == 1) {
                    serviceConnection.onServiceConnected(c1Var.b(), c1Var.c());
                } else if (a6 == 2) {
                    c1Var.e(str, executor);
                }
            }
            j6 = c1Var.j();
        }
        return j6;
    }
}
