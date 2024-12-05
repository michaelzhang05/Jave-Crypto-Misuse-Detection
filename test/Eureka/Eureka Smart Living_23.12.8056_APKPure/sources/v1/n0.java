package v1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f9625a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9626b;

    /* renamed from: c, reason: collision with root package name */
    private static String f9627c;

    /* renamed from: d, reason: collision with root package name */
    private static int f9628d;

    public static int a(Context context) {
        b(context);
        return f9628d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f9625a) {
            if (f9626b) {
                return;
            }
            f9626b = true;
            try {
                bundle = b2.d.a(context).b(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e6) {
                Log.wtf("MetadataValueReader", "This should never happen.", e6);
            }
            if (bundle == null) {
                return;
            }
            f9627c = bundle.getString("com.google.app.id");
            f9628d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
