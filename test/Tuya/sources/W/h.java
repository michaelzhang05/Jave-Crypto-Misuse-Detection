package W;

import O.AbstractC1268l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f11952a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f11953b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f11954c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f11955d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11955d == null) {
            boolean z8 = false;
            if (k.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z8 = true;
            }
            f11955d = Boolean.valueOf(z8);
        }
        return f11955d.booleanValue();
    }

    public static boolean b() {
        int i8 = AbstractC1268l.f7671a;
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
        if (f11953b == null) {
            boolean z8 = false;
            if (k.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z8 = true;
            }
            f11953b = Boolean.valueOf(z8);
        }
        return f11953b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f11954c == null) {
            boolean z8 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z8 = false;
            }
            f11954c = Boolean.valueOf(z8);
        }
        return f11954c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f11952a == null) {
            boolean z8 = false;
            if (k.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z8 = true;
            }
            f11952a = Boolean.valueOf(z8);
        }
        return f11952a.booleanValue();
    }
}
