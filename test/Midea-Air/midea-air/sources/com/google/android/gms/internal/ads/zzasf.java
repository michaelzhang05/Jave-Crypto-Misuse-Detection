package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzasf {
    private int A;
    private String B;
    private boolean C;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12955b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12956c;

    /* renamed from: d, reason: collision with root package name */
    private int f12957d;

    /* renamed from: e, reason: collision with root package name */
    private int f12958e;

    /* renamed from: f, reason: collision with root package name */
    private int f12959f;

    /* renamed from: g, reason: collision with root package name */
    private String f12960g;

    /* renamed from: h, reason: collision with root package name */
    private int f12961h;

    /* renamed from: i, reason: collision with root package name */
    private int f12962i;

    /* renamed from: j, reason: collision with root package name */
    private int f12963j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12964k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private final boolean u;
    private boolean v;
    private String w;
    private String x;
    private float y;
    private int z;

    public zzasf(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        c(context);
        d(context);
        e(context);
        Locale locale = Locale.getDefault();
        this.q = a(packageManager, "geo:0,0?q=donuts") != null;
        this.r = a(packageManager, "http://www.google.com") != null;
        this.s = locale.getCountry();
        zzyt.a();
        this.t = zzazt.v();
        this.u = DeviceProperties.a(context);
        this.v = DeviceProperties.b(context);
        this.w = locale.getLanguage();
        this.x = b(context, packageManager);
        this.B = f(context);
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.y = displayMetrics.density;
        this.z = displayMetrics.widthPixels;
        this.A = displayMetrics.heightPixels;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzk.zzlk().e(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static String b(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null || (activityInfo = a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo e2 = Wrappers.a(context).e(activityInfo.packageName, 0);
            if (e2 != null) {
                int i2 = e2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.a = audioManager.getMode();
                this.f12955b = audioManager.isMusicActive();
                this.f12956c = audioManager.isSpeakerphoneOn();
                this.f12957d = audioManager.getStreamVolume(3);
                this.f12958e = audioManager.getRingerMode();
                this.f12959f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzk.zzlk().e(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.a = -2;
        this.f12955b = false;
        this.f12956c = false;
        this.f12957d = 0;
        this.f12958e = 2;
        this.f12959f = 0;
    }

    @TargetApi(16)
    private final void d(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f12960g = telephonyManager.getNetworkOperator();
        this.f12962i = telephonyManager.getNetworkType();
        this.f12963j = telephonyManager.getPhoneType();
        this.f12961h = -2;
        this.f12964k = false;
        this.l = -1;
        zzk.zzlg();
        if (zzaxi.f0(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f12961h = activeNetworkInfo.getType();
                this.l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f12961h = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.f12964k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private final void e(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            this.n = intExtra == 2 || intExtra == 5;
        } else {
            this.m = -1.0d;
            this.n = false;
        }
    }

    private static String f(Context context) {
        try {
            PackageInfo e2 = Wrappers.a(context).e("com.android.vending", 128);
            if (e2 != null) {
                int i2 = e2.versionCode;
                String str = e2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final zzase g() {
        return new zzase(this.a, this.q, this.r, this.f12960g, this.s, this.t, this.u, this.v, this.f12955b, this.f12956c, this.w, this.x, this.B, this.f12957d, this.f12961h, this.f12962i, this.f12963j, this.f12958e, this.f12959f, this.y, this.z, this.A, this.m, this.n, this.f12964k, this.l, this.o, this.C, this.p);
    }

    public zzasf(Context context, zzase zzaseVar) {
        c(context);
        d(context);
        e(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.C = PlatformVersion.b() && zzads.a(context);
        this.q = zzaseVar.f12945b;
        this.r = zzaseVar.f12946c;
        this.s = zzaseVar.f12948e;
        this.t = zzaseVar.f12949f;
        this.u = zzaseVar.f12950g;
        this.v = zzaseVar.f12951h;
        this.w = zzaseVar.f12954k;
        this.x = zzaseVar.l;
        this.B = zzaseVar.m;
        this.y = zzaseVar.t;
        this.z = zzaseVar.u;
        this.A = zzaseVar.v;
    }
}
