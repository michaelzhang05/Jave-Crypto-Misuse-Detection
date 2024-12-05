package R;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class n0 implements ServiceConnection, r0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8592a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f8593b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8594c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f8595d;

    /* renamed from: e, reason: collision with root package name */
    private final l0 f8596e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f8597f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ q0 f8598g;

    public n0(q0 q0Var, l0 l0Var) {
        this.f8598g = q0Var;
        this.f8596e = l0Var;
    }

    public final int a() {
        return this.f8593b;
    }

    public final ComponentName b() {
        return this.f8597f;
    }

    public final IBinder c() {
        return this.f8595d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f8592a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        V.b bVar;
        Context context;
        Context context2;
        V.b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j8;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f8593b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (W.k.l()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            q0 q0Var = this.f8598g;
            bVar = q0Var.f8608j;
            context = q0Var.f8605g;
            l0 l0Var = this.f8596e;
            context2 = q0Var.f8605g;
            boolean d8 = bVar.d(context, str, l0Var.b(context2), this, 4225, executor);
            this.f8594c = d8;
            if (d8) {
                handler = this.f8598g.f8606h;
                Message obtainMessage = handler.obtainMessage(1, this.f8596e);
                handler2 = this.f8598g.f8606h;
                j8 = this.f8598g.f8610l;
                handler2.sendMessageDelayed(obtainMessage, j8);
            } else {
                this.f8593b = 2;
                try {
                    q0 q0Var2 = this.f8598g;
                    bVar2 = q0Var2.f8608j;
                    context3 = q0Var2.f8605g;
                    bVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f8592a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        V.b bVar;
        Context context;
        l0 l0Var = this.f8596e;
        handler = this.f8598g.f8606h;
        handler.removeMessages(1, l0Var);
        q0 q0Var = this.f8598g;
        bVar = q0Var.f8608j;
        context = q0Var.f8605g;
        bVar.c(context, this);
        this.f8594c = false;
        this.f8593b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f8592a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f8592a.isEmpty();
    }

    public final boolean j() {
        return this.f8594c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f8598g.f8604f;
        synchronized (hashMap) {
            try {
                handler = this.f8598g.f8606h;
                handler.removeMessages(1, this.f8596e);
                this.f8595d = iBinder;
                this.f8597f = componentName;
                Iterator it = this.f8592a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f8593b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f8598g.f8604f;
        synchronized (hashMap) {
            try {
                handler = this.f8598g.f8606h;
                handler.removeMessages(1, this.f8596e);
                this.f8595d = null;
                this.f8597f = componentName;
                Iterator it = this.f8592a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f8593b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
