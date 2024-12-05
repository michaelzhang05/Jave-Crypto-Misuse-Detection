package g1;

import Y0.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2860a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31973a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f31974b;

    /* renamed from: c, reason: collision with root package name */
    private final c f31975c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31976d;

    public C2860a(Context context, String str, c cVar) {
        Context a8 = a(context);
        this.f31973a = a8;
        this.f31974b = a8.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f31975c = cVar;
        this.f31976d = c();
    }

    private static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        if (this.f31974b.contains("firebase_data_collection_default_enabled")) {
            return this.f31974b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f31973a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f31973a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f31976d;
    }
}
