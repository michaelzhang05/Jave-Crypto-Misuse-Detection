package b2;

import android.content.Context;
import z1.i;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f3820a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f3821b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        boolean isInstantApp;
        Boolean bool2;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f3820a;
            if (context2 != null && (bool2 = f3821b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f3821b = null;
            if (!i.g()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f3821b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f3820a = applicationContext;
                return f3821b.booleanValue();
            }
            isInstantApp = applicationContext.getPackageManager().isInstantApp();
            bool = Boolean.valueOf(isInstantApp);
            f3821b = bool;
            f3820a = applicationContext;
            return f3821b.booleanValue();
        }
    }
}
