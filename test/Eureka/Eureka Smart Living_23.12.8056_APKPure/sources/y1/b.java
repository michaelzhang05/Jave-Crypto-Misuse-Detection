package y1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import b2.d;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import v1.g1;
import v1.n;
import z1.i;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9892b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f9893c;

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f9894a = new ConcurrentHashMap();

    private b() {
    }

    public static b b() {
        if (f9893c == null) {
            synchronized (f9892b) {
                if (f9893c == null) {
                    f9893c = new b();
                }
            }
        }
        b bVar = f9893c;
        n.h(bVar);
        return bVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i6, boolean z5, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((d.a(context).b(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i6, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f9894a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean h6 = h(context, intent, serviceConnection, i6, executor);
            if (h6) {
                return h6;
            }
            return false;
        } finally {
            this.f9894a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof g1);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i6, Executor executor) {
        boolean bindService;
        if (!i.i() || executor == null) {
            return context.bindService(intent, serviceConnection, i6);
        }
        bindService = context.bindService(intent, i6, executor, serviceConnection);
        return bindService;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i6) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i6, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f9894a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f9894a.get(serviceConnection));
        } finally {
            this.f9894a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i6, Executor executor) {
        return f(context, str, intent, serviceConnection, i6, true, executor);
    }
}
