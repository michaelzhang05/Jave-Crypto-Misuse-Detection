package kotlin.reflect.x.internal.l0.d.a;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.m.u.a;
import kotlin.text.u;

/* compiled from: JvmAbi.kt */
/* loaded from: classes2.dex */
public final class z {
    public static final z a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final c f20214b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f20215c;

    /* renamed from: d, reason: collision with root package name */
    private static final b f20216d;

    /* renamed from: e, reason: collision with root package name */
    private static final b f20217e;

    static {
        c cVar = new c("kotlin.jvm.JvmField");
        f20214b = cVar;
        b m = b.m(cVar);
        l.e(m, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f20215c = m;
        b m2 = b.m(new c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        l.e(m2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f20216d = m2;
        b e2 = b.e("kotlin/jvm/internal/RepeatableContainer");
        l.e(e2, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f20217e = e2;
    }

    private z() {
    }

    public static final String b(String str) {
        l.f(str, "propertyName");
        if (f(str)) {
            return str;
        }
        return "get" + a.a(str);
    }

    public static final boolean c(String str) {
        boolean A;
        boolean A2;
        l.f(str, "name");
        A = u.A(str, "get", false, 2, null);
        if (!A) {
            A2 = u.A(str, "is", false, 2, null);
            if (!A2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(String str) {
        boolean A;
        l.f(str, "name");
        A = u.A(str, "set", false, 2, null);
        return A;
    }

    public static final String e(String str) {
        String a2;
        l.f(str, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (f(str)) {
            a2 = str.substring(2);
            l.e(a2, "this as java.lang.String).substring(startIndex)");
        } else {
            a2 = a.a(str);
        }
        sb.append(a2);
        return sb.toString();
    }

    public static final boolean f(String str) {
        boolean A;
        l.f(str, "name");
        A = u.A(str, "is", false, 2, null);
        if (!A || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return l.h(97, charAt) > 0 || l.h(charAt, 122) > 0;
    }

    public final b a() {
        return f20217e;
    }
}
