package X;

import V.k;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f12706a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f12707b;

    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f12706a;
            if (context2 != null && (bool = f12707b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f12707b = null;
            if (k.h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f12707b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f12707b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f12707b = Boolean.FALSE;
                }
            }
            f12706a = applicationContext;
            return f12707b.booleanValue();
        }
    }
}
