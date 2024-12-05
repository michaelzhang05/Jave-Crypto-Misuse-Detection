package Q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8939a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f8940b;

    /* renamed from: c, reason: collision with root package name */
    private static String f8941c;

    /* renamed from: d, reason: collision with root package name */
    private static int f8942d;

    public static int a(Context context) {
        b(context);
        return f8942d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f8939a) {
            try {
                if (f8940b) {
                    return;
                }
                f8940b = true;
                try {
                    bundle = X.e.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e8);
                }
                if (bundle == null) {
                    return;
                }
                f8941c = bundle.getString("com.google.app.id");
                f8942d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
