package v1;

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

/* loaded from: classes.dex */
final class c1 implements ServiceConnection, g1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9535a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f9536b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9537c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f9538d;

    /* renamed from: e, reason: collision with root package name */
    private final a1 f9539e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f9540f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f1 f9541g;

    public c1(f1 f1Var, a1 a1Var) {
        this.f9541g = f1Var;
        this.f9539e = a1Var;
    }

    public final int a() {
        return this.f9536b;
    }

    public final ComponentName b() {
        return this.f9540f;
    }

    public final IBinder c() {
        return this.f9538d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f9535a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        y1.b bVar;
        Context context;
        Context context2;
        y1.b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j6;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f9536b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (z1.i.k()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            f1 f1Var = this.f9541g;
            bVar = f1Var.f9587j;
            context = f1Var.f9584g;
            a1 a1Var = this.f9539e;
            context2 = f1Var.f9584g;
            boolean d6 = bVar.d(context, str, a1Var.c(context2), this, this.f9539e.a(), executor);
            this.f9537c = d6;
            if (d6) {
                handler = this.f9541g.f9585h;
                Message obtainMessage = handler.obtainMessage(1, this.f9539e);
                handler2 = this.f9541g.f9585h;
                j6 = this.f9541g.f9589l;
                handler2.sendMessageDelayed(obtainMessage, j6);
            } else {
                this.f9536b = 2;
                try {
                    f1 f1Var2 = this.f9541g;
                    bVar2 = f1Var2.f9587j;
                    context3 = f1Var2.f9584g;
                    bVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f9535a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        y1.b bVar;
        Context context;
        handler = this.f9541g.f9585h;
        handler.removeMessages(1, this.f9539e);
        f1 f1Var = this.f9541g;
        bVar = f1Var.f9587j;
        context = f1Var.f9584g;
        bVar.c(context, this);
        this.f9537c = false;
        this.f9536b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f9535a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f9535a.isEmpty();
    }

    public final boolean j() {
        return this.f9537c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f9541g.f9583f;
        synchronized (hashMap) {
            handler = this.f9541g.f9585h;
            handler.removeMessages(1, this.f9539e);
            this.f9538d = iBinder;
            this.f9540f = componentName;
            Iterator it = this.f9535a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f9536b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f9541g.f9583f;
        synchronized (hashMap) {
            handler = this.f9541g.f9585h;
            handler.removeMessages(1, this.f9539e);
            this.f9538d = null;
            this.f9540f = componentName;
            Iterator it = this.f9535a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f9536b = 2;
        }
    }
}
