package x6;

import e6.InterfaceC2643c;
import g6.AbstractC2725a;
import h6.C2758a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3144i;
import kotlin.jvm.internal.C3145j;
import kotlin.jvm.internal.C3147l;
import kotlin.jvm.internal.C3152q;
import kotlin.jvm.internal.C3158x;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f39583a = M5.Q.k(L5.x.a(kotlin.jvm.internal.U.b(String.class), AbstractC3808a.E(kotlin.jvm.internal.Y.f33766a)), L5.x.a(kotlin.jvm.internal.U.b(Character.TYPE), AbstractC3808a.y(C3147l.f33780a)), L5.x.a(kotlin.jvm.internal.U.b(char[].class), AbstractC3808a.c()), L5.x.a(kotlin.jvm.internal.U.b(Double.TYPE), AbstractC3808a.z(C3152q.f33789a)), L5.x.a(kotlin.jvm.internal.U.b(double[].class), AbstractC3808a.d()), L5.x.a(kotlin.jvm.internal.U.b(Float.TYPE), AbstractC3808a.A(kotlin.jvm.internal.r.f33790a)), L5.x.a(kotlin.jvm.internal.U.b(float[].class), AbstractC3808a.e()), L5.x.a(kotlin.jvm.internal.U.b(Long.TYPE), AbstractC3808a.C(kotlin.jvm.internal.A.f33754a)), L5.x.a(kotlin.jvm.internal.U.b(long[].class), AbstractC3808a.h()), L5.x.a(kotlin.jvm.internal.U.b(L5.C.class), AbstractC3808a.s(L5.C.f6476b)), L5.x.a(kotlin.jvm.internal.U.b(L5.D.class), AbstractC3808a.n()), L5.x.a(kotlin.jvm.internal.U.b(Integer.TYPE), AbstractC3808a.B(C3158x.f33791a)), L5.x.a(kotlin.jvm.internal.U.b(int[].class), AbstractC3808a.f()), L5.x.a(kotlin.jvm.internal.U.b(L5.A.class), AbstractC3808a.r(L5.A.f6471b)), L5.x.a(kotlin.jvm.internal.U.b(L5.B.class), AbstractC3808a.m()), L5.x.a(kotlin.jvm.internal.U.b(Short.TYPE), AbstractC3808a.D(kotlin.jvm.internal.W.f33764a)), L5.x.a(kotlin.jvm.internal.U.b(short[].class), AbstractC3808a.k()), L5.x.a(kotlin.jvm.internal.U.b(L5.F.class), AbstractC3808a.t(L5.F.f6482b)), L5.x.a(kotlin.jvm.internal.U.b(L5.G.class), AbstractC3808a.o()), L5.x.a(kotlin.jvm.internal.U.b(Byte.TYPE), AbstractC3808a.x(C3145j.f33778a)), L5.x.a(kotlin.jvm.internal.U.b(byte[].class), AbstractC3808a.b()), L5.x.a(kotlin.jvm.internal.U.b(L5.y.class), AbstractC3808a.q(L5.y.f6525b)), L5.x.a(kotlin.jvm.internal.U.b(L5.z.class), AbstractC3808a.l()), L5.x.a(kotlin.jvm.internal.U.b(Boolean.TYPE), AbstractC3808a.w(C3144i.f33777a)), L5.x.a(kotlin.jvm.internal.U.b(boolean[].class), AbstractC3808a.a()), L5.x.a(kotlin.jvm.internal.U.b(L5.I.class), AbstractC3808a.u(L5.I.f6487a)), L5.x.a(kotlin.jvm.internal.U.b(Void.class), AbstractC3808a.j()), L5.x.a(kotlin.jvm.internal.U.b(C2758a.class), AbstractC3808a.v(C2758a.f31409b)));

    public static final v6.f a(String serialName, v6.e kind) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(kind, "kind");
        d(serialName);
        return new k0(serialName, kind);
    }

    public static final t6.b b(InterfaceC2643c interfaceC2643c) {
        AbstractC3159y.i(interfaceC2643c, "<this>");
        return (t6.b) f39583a.get(interfaceC2643c);
    }

    private static final String c(String str) {
        String valueOf;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = AbstractC2725a.i(charAt);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = str.substring(1);
            AbstractC3159y.h(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    private static final void d(String str) {
        Iterator it = f39583a.keySet().iterator();
        while (it.hasNext()) {
            String b8 = ((InterfaceC2643c) it.next()).b();
            AbstractC3159y.f(b8);
            String c8 = c(b8);
            if (g6.n.s(str, "kotlin." + c8, true) || g6.n.s(str, c8, true)) {
                throw new IllegalArgumentException(g6.n.e("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(c8) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
