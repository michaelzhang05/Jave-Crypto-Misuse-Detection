package p4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import h4.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8883a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f8884b;

    /* renamed from: c, reason: collision with root package name */
    private final c f8885c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8886d;

    public a(Context context, String str, c cVar) {
        Context a6 = a(context);
        this.f8883a = a6;
        this.f8884b = a6.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f8885c = cVar;
        this.f8886d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f8884b.contains("firebase_data_collection_default_enabled") ? this.f8884b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f8883a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f8883a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f8886d;
    }
}
