package y6;

import L5.C1224h;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import u6.AbstractC3808a;
import x6.E;
import z6.Q;
import z6.S;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final v6.f f40003a = E.a("kotlinx.serialization.json.JsonUnquotedLiteral", AbstractC3808a.E(Y.f33766a));

    public static final x a(String str) {
        if (str == null) {
            return t.INSTANCE;
        }
        return new p(str, true, null, 4, null);
    }

    private static final Void b(AbstractC4007i abstractC4007i, String str) {
        throw new IllegalArgumentException("Element " + U.b(abstractC4007i.getClass()) + " is not a " + str);
    }

    public static final Boolean c(x xVar) {
        AbstractC3159y.i(xVar, "<this>");
        return S.d(xVar.a());
    }

    public static final String d(x xVar) {
        AbstractC3159y.i(xVar, "<this>");
        if (xVar instanceof t) {
            return null;
        }
        return xVar.a();
    }

    public static final double e(x xVar) {
        AbstractC3159y.i(xVar, "<this>");
        return Double.parseDouble(xVar.a());
    }

    public static final float f(x xVar) {
        AbstractC3159y.i(xVar, "<this>");
        return Float.parseFloat(xVar.a());
    }

    public static final int g(x xVar) {
        AbstractC3159y.i(xVar, "<this>");
        try {
            long m8 = new Q(xVar.a()).m();
            if (-2147483648L <= m8 && m8 <= 2147483647L) {
                return (int) m8;
            }
            throw new NumberFormatException(xVar.a() + " is not an Int");
        } catch (z6.x e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }

    public static final v h(AbstractC4007i abstractC4007i) {
        v vVar;
        AbstractC3159y.i(abstractC4007i, "<this>");
        if (abstractC4007i instanceof v) {
            vVar = (v) abstractC4007i;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar;
        }
        b(abstractC4007i, "JsonObject");
        throw new C1224h();
    }

    public static final x i(AbstractC4007i abstractC4007i) {
        x xVar;
        AbstractC3159y.i(abstractC4007i, "<this>");
        if (abstractC4007i instanceof x) {
            xVar = (x) abstractC4007i;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        b(abstractC4007i, "JsonPrimitive");
        throw new C1224h();
    }

    public static final v6.f j() {
        return f40003a;
    }

    public static final long k(x xVar) {
        AbstractC3159y.i(xVar, "<this>");
        try {
            return new Q(xVar.a()).m();
        } catch (z6.x e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }
}
