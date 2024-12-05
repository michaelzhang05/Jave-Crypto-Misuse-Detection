package com.capacitorjs.plugins.device;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f4201a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f4201a = context;
    }

    private PackageInfo k() {
        return this.f4201a.getPackageManager().getPackageInfo(Build.VERSION.SDK_INT >= 24 ? "com.android.chrome" : "com.google.android.webview", 0);
    }

    public float a() {
        int i6;
        Intent registerReceiver = this.f4201a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i7 = -1;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            i6 = registerReceiver.getIntExtra("scale", -1);
            i7 = intExtra;
        } else {
            i6 = -1;
        }
        return i7 / i6;
    }

    public long b() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public long c() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    public long d() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public String e() {
        if (Build.VERSION.SDK_INT >= 25) {
            return Settings.Global.getString(this.f4201a.getContentResolver(), "device_name");
        }
        return null;
    }

    public String f() {
        return "android";
    }

    public long g() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public long h() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    public String i() {
        return Settings.Secure.getString(this.f4201a.getContentResolver(), "android_id");
    }

    public String j() {
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = k();
            } catch (PackageManager.NameNotFoundException e6) {
                e6.printStackTrace();
                packageInfo = null;
            }
        }
        return packageInfo != null ? packageInfo.versionName : Build.VERSION.RELEASE;
    }

    public boolean l() {
        Intent registerReceiver = this.f4201a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public boolean m() {
        return Build.FINGERPRINT.contains("generic") || Build.PRODUCT.contains("sdk");
    }
}
