package R;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8477a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f8478b;

    /* renamed from: c, reason: collision with root package name */
    private static String f8479c;

    /* renamed from: d, reason: collision with root package name */
    private static int f8480d;

    public static int a(Context context) {
        b(context);
        return f8480d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f8477a) {
            try {
                if (f8478b) {
                    return;
                }
                f8478b = true;
                try {
                    bundle = Y.e.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e8);
                }
                if (bundle == null) {
                    return;
                }
                f8479c = bundle.getString("com.google.app.id");
                f8480d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
