package Y;

import W.k;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f12752a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f12753b;

    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f12752a;
            if (context2 != null && (bool = f12753b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f12753b = null;
            if (k.h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f12753b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f12753b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f12753b = Boolean.FALSE;
                }
            }
            f12752a = applicationContext;
            return f12753b.booleanValue();
        }
    }
}
