package m0;

import N.AbstractC1341l;
import N.C1337h;
import N.C1338i;
import Q.AbstractC1400p;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3400a {

    /* renamed from: a, reason: collision with root package name */
    private static final C1337h f34691a = C1337h.f();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f34692b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Method f34693c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f34694d = null;

    public static void a(Context context) {
        Context context2;
        AbstractC1400p.m(context, "Context must not be null");
        f34691a.k(context, 11925000);
        synchronized (f34692b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f16014f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e8) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e8.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context d8 = AbstractC1341l.d(context);
            if (d8 != null) {
                try {
                    if (f34694d == null) {
                        Class cls = Long.TYPE;
                        f34694d = b(d8, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f34694d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e9) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e9.getMessage())));
                }
            }
            if (d8 != null) {
                c(d8, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C1338i(8);
            }
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, Context context2, String str) {
        String message;
        try {
            if (f34693c == null) {
                f34693c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f34693c.invoke(null, context);
        } catch (Exception e8) {
            Throwable cause = e8.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    message = e8.getMessage();
                } else {
                    message = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(message)));
            }
            throw new C1338i(8);
        }
    }
}
