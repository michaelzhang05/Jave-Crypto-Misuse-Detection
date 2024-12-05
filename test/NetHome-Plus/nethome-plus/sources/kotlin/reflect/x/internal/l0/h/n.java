package kotlin.reflect.x.internal.l0.h;

import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: RenderingUtils.kt */
/* loaded from: classes2.dex */
public final class n {
    public static final String a(d dVar) {
        l.f(dVar, "<this>");
        List<f> h2 = dVar.h();
        l.e(h2, "pathSegments()");
        return c(h2);
    }

    public static final String b(f fVar) {
        l.f(fVar, "<this>");
        if (!d(fVar)) {
            String f2 = fVar.f();
            l.e(f2, "asString()");
            return f2;
        }
        StringBuilder sb = new StringBuilder();
        String f3 = fVar.f();
        l.e(f3, "asString()");
        sb.append('`' + f3);
        sb.append('`');
        return sb.toString();
    }

    public static final String c(List<f> list) {
        l.f(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (f fVar : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(b(fVar));
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final boolean d(f fVar) {
        boolean z;
        String f2 = fVar.f();
        l.e(f2, "asString()");
        if (!i.a.contains(f2)) {
            int i2 = 0;
            while (true) {
                if (i2 >= f2.length()) {
                    z = false;
                    break;
                }
                char charAt = f2.charAt(i2);
                if ((Character.isLetterOrDigit(charAt) || charAt == '_') ? false : true) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
