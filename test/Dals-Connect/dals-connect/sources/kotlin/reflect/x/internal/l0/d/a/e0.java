package kotlin.reflect.x.internal.l0.d.a;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.m.u.a;
import kotlin.text.u;
import kotlin.text.v;

/* compiled from: propertiesConventionUtil.kt */
/* loaded from: classes2.dex */
public final class e0 {
    public static final List<f> a(f fVar) {
        List<f> m;
        l.f(fVar, "name");
        String f2 = fVar.f();
        l.e(f2, "name.asString()");
        if (z.c(f2)) {
            m = t.m(b(fVar));
            return m;
        }
        if (z.d(f2)) {
            return f(fVar);
        }
        return g.a.b(fVar);
    }

    public static final f b(f fVar) {
        l.f(fVar, "methodName");
        f e2 = e(fVar, "get", false, null, 12, null);
        return e2 == null ? e(fVar, "is", false, null, 8, null) : e2;
    }

    public static final f c(f fVar, boolean z) {
        l.f(fVar, "methodName");
        return e(fVar, "set", false, z ? "is" : null, 4, null);
    }

    private static final f d(f fVar, String str, boolean z, String str2) {
        boolean A;
        String g0;
        String g02;
        if (fVar.x()) {
            return null;
        }
        String n = fVar.n();
        l.e(n, "methodName.identifier");
        boolean z2 = false;
        A = u.A(n, str, false, 2, null);
        if (!A || n.length() == str.length()) {
            return null;
        }
        char charAt = n.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            g02 = v.g0(n, str);
            sb.append(g02);
            return f.r(sb.toString());
        }
        if (!z) {
            return fVar;
        }
        g0 = v.g0(n, str);
        String c2 = a.c(g0, true);
        if (f.B(c2)) {
            return f.r(c2);
        }
        return null;
    }

    static /* synthetic */ f e(f fVar, String str, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z, str2);
    }

    public static final List<f> f(f fVar) {
        List<f> n;
        l.f(fVar, "methodName");
        n = t.n(c(fVar, false), c(fVar, true));
        return n;
    }
}
