package z1;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f9928a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f9929b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f9930c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f9931d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9931d == null) {
            boolean z5 = false;
            if (i.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z5 = true;
            }
            f9931d = Boolean.valueOf(z5);
        }
        return f9931d.booleanValue();
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9928a == null) {
            boolean z5 = false;
            if (i.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z5 = true;
            }
            f9928a = Boolean.valueOf(z5);
        }
        return f9928a.booleanValue();
    }

    public static boolean c(Context context) {
        if (b(context) && !i.f()) {
            return true;
        }
        if (d(context)) {
            return !i.g() || i.j();
        }
        return false;
    }

    public static boolean d(Context context) {
        if (f9929b == null) {
            boolean z5 = false;
            if (i.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z5 = true;
            }
            f9929b = Boolean.valueOf(z5);
        }
        return f9929b.booleanValue();
    }

    public static boolean e(Context context) {
        if (f9930c == null) {
            boolean z5 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z5 = false;
            }
            f9930c = Boolean.valueOf(z5);
        }
        return f9930c.booleanValue();
    }
}
