package B6;

import A6.E;
import C6.Q;
import C6.S;
import O5.C1352h;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final y6.f f1047a = E.a("kotlinx.serialization.json.JsonUnquotedLiteral", AbstractC4193a.E(Y.f34167a));

    public static final x a(String str) {
        if (str == null) {
            return t.INSTANCE;
        }
        return new p(str, true, null, 4, null);
    }

    private static final Void b(i iVar, String str) {
        throw new IllegalArgumentException("Element " + U.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean c(x xVar) {
        AbstractC3255y.i(xVar, "<this>");
        return S.d(xVar.c());
    }

    public static final String d(x xVar) {
        AbstractC3255y.i(xVar, "<this>");
        if (xVar instanceof t) {
            return null;
        }
        return xVar.c();
    }

    public static final double e(x xVar) {
        AbstractC3255y.i(xVar, "<this>");
        return Double.parseDouble(xVar.c());
    }

    public static final float f(x xVar) {
        AbstractC3255y.i(xVar, "<this>");
        return Float.parseFloat(xVar.c());
    }

    public static final int g(x xVar) {
        AbstractC3255y.i(xVar, "<this>");
        try {
            long m8 = new Q(xVar.c()).m();
            if (-2147483648L <= m8 && m8 <= 2147483647L) {
                return (int) m8;
            }
            throw new NumberFormatException(xVar.c() + " is not an Int");
        } catch (C6.x e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }

    public static final v h(i iVar) {
        v vVar;
        AbstractC3255y.i(iVar, "<this>");
        if (iVar instanceof v) {
            vVar = (v) iVar;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar;
        }
        b(iVar, "JsonObject");
        throw new C1352h();
    }

    public static final x i(i iVar) {
        x xVar;
        AbstractC3255y.i(iVar, "<this>");
        if (iVar instanceof x) {
            xVar = (x) iVar;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        b(iVar, "JsonPrimitive");
        throw new C1352h();
    }

    public static final y6.f j() {
        return f1047a;
    }

    public static final long k(x xVar) {
        AbstractC3255y.i(xVar, "<this>");
        try {
            return new Q(xVar.c()).m();
        } catch (C6.x e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }
}
