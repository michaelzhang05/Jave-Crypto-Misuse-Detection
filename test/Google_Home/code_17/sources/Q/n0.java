package Q;

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
    private final Map f9054a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f9055b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9056c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f9057d;

    /* renamed from: e, reason: collision with root package name */
    private final l0 f9058e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f9059f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ q0 f9060g;

    public n0(q0 q0Var, l0 l0Var) {
        this.f9060g = q0Var;
        this.f9058e = l0Var;
    }

    public final int a() {
        return this.f9055b;
    }

    public final ComponentName b() {
        return this.f9059f;
    }

    public final IBinder c() {
        return this.f9057d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f9054a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        U.b bVar;
        Context context;
        Context context2;
        U.b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j8;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f9055b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (V.k.l()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            q0 q0Var = this.f9060g;
            bVar = q0Var.f9070j;
            context = q0Var.f9067g;
            l0 l0Var = this.f9058e;
            context2 = q0Var.f9067g;
            boolean d8 = bVar.d(context, str, l0Var.b(context2), this, 4225, executor);
            this.f9056c = d8;
            if (d8) {
                handler = this.f9060g.f9068h;
                Message obtainMessage = handler.obtainMessage(1, this.f9058e);
                handler2 = this.f9060g.f9068h;
                j8 = this.f9060g.f9072l;
                handler2.sendMessageDelayed(obtainMessage, j8);
            } else {
                this.f9055b = 2;
                try {
                    q0 q0Var2 = this.f9060g;
                    bVar2 = q0Var2.f9070j;
                    context3 = q0Var2.f9067g;
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
        this.f9054a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        U.b bVar;
        Context context;
        l0 l0Var = this.f9058e;
        handler = this.f9060g.f9068h;
        handler.removeMessages(1, l0Var);
        q0 q0Var = this.f9060g;
        bVar = q0Var.f9070j;
        context = q0Var.f9067g;
        bVar.c(context, this);
        this.f9056c = false;
        this.f9055b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f9054a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f9054a.isEmpty();
    }

    public final boolean j() {
        return this.f9056c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f9060g.f9066f;
        synchronized (hashMap) {
            try {
                handler = this.f9060g.f9068h;
                handler.removeMessages(1, this.f9058e);
                this.f9057d = iBinder;
                this.f9059f = componentName;
                Iterator it = this.f9054a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f9055b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f9060g.f9066f;
        synchronized (hashMap) {
            try {
                handler = this.f9060g.f9068h;
                handler.removeMessages(1, this.f9058e);
                this.f9057d = null;
                this.f9059f = componentName;
                Iterator it = this.f9054a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f9055b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
