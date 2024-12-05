package V;

import R.AbstractC1319p;
import R.r0;
import W.k;
import Y.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f11819b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f11820c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11821a = new ConcurrentHashMap();

    private b() {
    }

    public static b b() {
        if (f11820c == null) {
            synchronized (f11819b) {
                try {
                    if (f11820c == null) {
                        f11820c = new b();
                    }
                } finally {
                }
            }
        }
        b bVar = f11820c;
        AbstractC1319p.l(bVar);
        return bVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, boolean z8, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f11821a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean h8 = h(context, intent, serviceConnection, i8, executor);
                if (!h8) {
                    return false;
                }
                return h8;
            } finally {
                this.f11821a.remove(serviceConnection, serviceConnection);
            }
        }
        return h(context, intent, serviceConnection, i8, executor);
    }

    private static boolean g(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof r0)) {
            return true;
        }
        return false;
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        boolean bindService;
        if (executor == null) {
            executor = null;
        }
        if (k.j() && executor != null) {
            bindService = context.bindService(intent, i8, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i8);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i8) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i8, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (g(serviceConnection) && this.f11821a.containsKey(serviceConnection)) {
            try {
                e(context, (ServiceConnection) this.f11821a.get(serviceConnection));
                return;
            } finally {
                this.f11821a.remove(serviceConnection);
            }
        }
        e(context, serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
