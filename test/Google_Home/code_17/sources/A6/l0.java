package A6;

import h6.InterfaceC2963c;
import j6.AbstractC3202a;
import java.util.Iterator;
import java.util.Map;
import k6.C3225a;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3240i;
import kotlin.jvm.internal.C3241j;
import kotlin.jvm.internal.C3243l;
import kotlin.jvm.internal.C3248q;
import kotlin.jvm.internal.C3254x;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f578a = P5.Q.k(O5.x.a(kotlin.jvm.internal.U.b(String.class), AbstractC4193a.E(kotlin.jvm.internal.Y.f34167a)), O5.x.a(kotlin.jvm.internal.U.b(Character.TYPE), AbstractC4193a.y(C3243l.f34181a)), O5.x.a(kotlin.jvm.internal.U.b(char[].class), AbstractC4193a.c()), O5.x.a(kotlin.jvm.internal.U.b(Double.TYPE), AbstractC4193a.z(C3248q.f34190a)), O5.x.a(kotlin.jvm.internal.U.b(double[].class), AbstractC4193a.d()), O5.x.a(kotlin.jvm.internal.U.b(Float.TYPE), AbstractC4193a.A(kotlin.jvm.internal.r.f34191a)), O5.x.a(kotlin.jvm.internal.U.b(float[].class), AbstractC4193a.e()), O5.x.a(kotlin.jvm.internal.U.b(Long.TYPE), AbstractC4193a.C(kotlin.jvm.internal.A.f34155a)), O5.x.a(kotlin.jvm.internal.U.b(long[].class), AbstractC4193a.h()), O5.x.a(kotlin.jvm.internal.U.b(O5.C.class), AbstractC4193a.s(O5.C.f8267b)), O5.x.a(kotlin.jvm.internal.U.b(O5.D.class), AbstractC4193a.n()), O5.x.a(kotlin.jvm.internal.U.b(Integer.TYPE), AbstractC4193a.B(C3254x.f34192a)), O5.x.a(kotlin.jvm.internal.U.b(int[].class), AbstractC4193a.f()), O5.x.a(kotlin.jvm.internal.U.b(O5.A.class), AbstractC4193a.r(O5.A.f8262b)), O5.x.a(kotlin.jvm.internal.U.b(O5.B.class), AbstractC4193a.m()), O5.x.a(kotlin.jvm.internal.U.b(Short.TYPE), AbstractC4193a.D(kotlin.jvm.internal.W.f34165a)), O5.x.a(kotlin.jvm.internal.U.b(short[].class), AbstractC4193a.k()), O5.x.a(kotlin.jvm.internal.U.b(O5.F.class), AbstractC4193a.t(O5.F.f8273b)), O5.x.a(kotlin.jvm.internal.U.b(O5.G.class), AbstractC4193a.o()), O5.x.a(kotlin.jvm.internal.U.b(Byte.TYPE), AbstractC4193a.x(C3241j.f34179a)), O5.x.a(kotlin.jvm.internal.U.b(byte[].class), AbstractC4193a.b()), O5.x.a(kotlin.jvm.internal.U.b(O5.y.class), AbstractC4193a.q(O5.y.f8316b)), O5.x.a(kotlin.jvm.internal.U.b(O5.z.class), AbstractC4193a.l()), O5.x.a(kotlin.jvm.internal.U.b(Boolean.TYPE), AbstractC4193a.w(C3240i.f34178a)), O5.x.a(kotlin.jvm.internal.U.b(boolean[].class), AbstractC4193a.a()), O5.x.a(kotlin.jvm.internal.U.b(O5.I.class), AbstractC4193a.u(O5.I.f8278a)), O5.x.a(kotlin.jvm.internal.U.b(Void.class), AbstractC4193a.j()), O5.x.a(kotlin.jvm.internal.U.b(C3225a.class), AbstractC4193a.v(C3225a.f34131b)));

    public static final y6.f a(String serialName, y6.e kind) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(kind, "kind");
        d(serialName);
        return new k0(serialName, kind);
    }

    public static final w6.b b(InterfaceC2963c interfaceC2963c) {
        AbstractC3255y.i(interfaceC2963c, "<this>");
        return (w6.b) f578a.get(interfaceC2963c);
    }

    private static final String c(String str) {
        String valueOf;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = AbstractC3202a.i(charAt);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = str.substring(1);
            AbstractC3255y.h(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    private static final void d(String str) {
        Iterator it = f578a.keySet().iterator();
        while (it.hasNext()) {
            String b8 = ((InterfaceC2963c) it.next()).b();
            AbstractC3255y.f(b8);
            String c8 = c(b8);
            if (j6.n.s(str, "kotlin." + c8, true) || j6.n.s(str, c8, true)) {
                throw new IllegalArgumentException(j6.n.e("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(c8) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
