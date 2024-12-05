package V;

import N.AbstractC1341l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f10568a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f10569b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f10570c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f10571d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f10571d == null) {
            boolean z8 = false;
            if (k.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z8 = true;
            }
            f10571d = Boolean.valueOf(z8);
        }
        return f10571d.booleanValue();
    }

    public static boolean b() {
        int i8 = AbstractC1341l.f7472a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (!c(context) || k.g()) {
            if (e(context)) {
                if (!k.h() || k.k()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        if (f10569b == null) {
            boolean z8 = false;
            if (k.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z8 = true;
            }
            f10569b = Boolean.valueOf(z8);
        }
        return f10569b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f10570c == null) {
            boolean z8 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z8 = false;
            }
            f10570c = Boolean.valueOf(z8);
        }
        return f10570c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f10568a == null) {
            boolean z8 = false;
            if (k.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z8 = true;
            }
            f10568a = Boolean.valueOf(z8);
        }
        return f10568a.booleanValue();
    }
}
