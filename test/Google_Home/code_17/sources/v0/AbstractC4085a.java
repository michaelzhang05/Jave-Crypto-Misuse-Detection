package v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4085a {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f40103a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f40104b;

    /* renamed from: c, reason: collision with root package name */
    private static C0907a f40105c;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0907a {

        /* renamed from: b, reason: collision with root package name */
        private static Method f40106b;

        /* renamed from: a, reason: collision with root package name */
        private final PackageManager f40107a;

        C0907a(PackageManager packageManager) {
            this.f40107a = packageManager;
        }

        Boolean a() {
            if (!AbstractC4085a.a()) {
                return null;
            }
            if (f40106b == null) {
                try {
                    f40106b = PackageManager.class.getDeclaredMethod("isInstantApp", null);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return (Boolean) f40106b.invoke(this.f40107a, null);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return null;
            }
        }
    }

    static /* synthetic */ boolean a() {
        return b();
    }

    private static boolean b() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                if (f40103a != null && applicationContext.equals(f40104b)) {
                    return f40103a.booleanValue();
                }
                Boolean bool = null;
                f40103a = null;
                if (b()) {
                    if (f40105c == null || !applicationContext.equals(f40104b)) {
                        f40105c = new C0907a(applicationContext.getPackageManager());
                    }
                    bool = f40105c.a();
                }
                f40104b = applicationContext;
                if (bool != null) {
                    f40103a = bool;
                } else {
                    try {
                        applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f40103a = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        f40103a = Boolean.FALSE;
                    }
                }
                return f40103a.booleanValue();
            }
            throw new IllegalStateException("Application context is null!");
        }
        throw new IllegalArgumentException("Context must be non-null");
    }
}
