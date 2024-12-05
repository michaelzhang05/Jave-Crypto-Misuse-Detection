package E1;

import android.text.TextUtils;
import x1.AbstractC3858a;
import y1.C3981n;
import y1.EnumC3973f;
import y1.EnumC3976i;
import y1.EnumC3978k;

/* loaded from: classes3.dex */
public abstract class g {
    public static void a() {
        if (AbstractC3858a.b()) {
        } else {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, int i8, String str2) {
        if (str.length() <= i8) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(EnumC3978k enumC3978k, EnumC3973f enumC3973f, EnumC3976i enumC3976i) {
        if (enumC3978k != EnumC3978k.NONE) {
            if (enumC3973f == EnumC3973f.DEFINED_BY_JAVASCRIPT && enumC3978k == EnumC3978k.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (enumC3976i == EnumC3976i.DEFINED_BY_JAVASCRIPT && enumC3978k == EnumC3978k.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return;
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public static void f(C3981n c3981n) {
        i(c3981n);
        g(c3981n);
    }

    public static void g(C3981n c3981n) {
        if (!c3981n.u()) {
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void h(C3981n c3981n) {
        if (!c3981n.z()) {
        } else {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void i(C3981n c3981n) {
        if (c3981n.z()) {
        } else {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void j(C3981n c3981n) {
        if (c3981n.x()) {
        } else {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void k(C3981n c3981n) {
        if (c3981n.y()) {
        } else {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void l(C3981n c3981n) {
        if (c3981n.w().q() == null) {
        } else {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void m(C3981n c3981n) {
        if (c3981n.w().r() == null) {
        } else {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
