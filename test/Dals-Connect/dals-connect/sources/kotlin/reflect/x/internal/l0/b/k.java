package kotlin.reflect.x.internal.l0.b;

import cm.aptoide.pt.root.execution.Command;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: StandardNames.kt */
/* loaded from: classes2.dex */
public final class k {
    public static final k a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final f f19700b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f19701c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f19702d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f19703e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f19704f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f19705g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f19706h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f19707i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f19708j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f19709k;
    public static final c l;
    public static final c m;
    public static final c n;
    public static final c o;
    public static final List<String> p;
    public static final f q;
    public static final c r;
    public static final c s;
    public static final c t;
    public static final c u;
    public static final c v;
    private static final c w;
    public static final Set<c> x;

    /* compiled from: StandardNames.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final c A;
        public static final b A0;
        public static final c B;
        public static final b B0;
        public static final c C;
        public static final c C0;
        public static final c D;
        public static final c D0;
        public static final c E;
        public static final c E0;
        public static final b F;
        public static final c F0;
        public static final c G;
        public static final Set<f> G0;
        public static final c H;
        public static final Set<f> H0;
        public static final b I;
        public static final Map<d, i> I0;
        public static final c J;
        public static final Map<d, i> J0;
        public static final c K;
        public static final c L;
        public static final b M;
        public static final c N;
        public static final b O;
        public static final c P;
        public static final c Q;
        public static final c R;
        public static final c S;
        public static final c T;
        public static final c U;
        public static final c V;
        public static final c W;
        public static final c X;
        public static final c Y;
        public static final c Z;
        public static final a a;
        public static final c a0;

        /* renamed from: b, reason: collision with root package name */
        public static final d f19710b;
        public static final c b0;

        /* renamed from: c, reason: collision with root package name */
        public static final d f19711c;
        public static final c c0;

        /* renamed from: d, reason: collision with root package name */
        public static final d f19712d;
        public static final c d0;

        /* renamed from: e, reason: collision with root package name */
        public static final c f19713e;
        public static final c e0;

        /* renamed from: f, reason: collision with root package name */
        public static final d f19714f;
        public static final c f0;

        /* renamed from: g, reason: collision with root package name */
        public static final d f19715g;
        public static final c g0;

        /* renamed from: h, reason: collision with root package name */
        public static final d f19716h;
        public static final c h0;

        /* renamed from: i, reason: collision with root package name */
        public static final d f19717i;
        public static final d i0;

        /* renamed from: j, reason: collision with root package name */
        public static final d f19718j;
        public static final d j0;

        /* renamed from: k, reason: collision with root package name */
        public static final d f19719k;
        public static final d k0;
        public static final d l;
        public static final d l0;
        public static final d m;
        public static final d m0;
        public static final d n;
        public static final d n0;
        public static final d o;
        public static final d o0;
        public static final d p;
        public static final d p0;
        public static final d q;
        public static final d q0;
        public static final d r;
        public static final d r0;
        public static final d s;
        public static final b s0;
        public static final d t;
        public static final d t0;
        public static final c u;
        public static final c u0;
        public static final c v;
        public static final c v0;
        public static final d w;
        public static final c w0;
        public static final d x;
        public static final c x0;
        public static final c y;
        public static final b y0;
        public static final c z;
        public static final b z0;

        static {
            a aVar = new a();
            a = aVar;
            f19710b = aVar.d("Any");
            f19711c = aVar.d("Nothing");
            f19712d = aVar.d("Cloneable");
            f19713e = aVar.c("Suppress");
            f19714f = aVar.d("Unit");
            f19715g = aVar.d("CharSequence");
            f19716h = aVar.d("String");
            f19717i = aVar.d("Array");
            f19718j = aVar.d("Boolean");
            f19719k = aVar.d("Char");
            l = aVar.d("Byte");
            m = aVar.d("Short");
            n = aVar.d("Int");
            o = aVar.d("Long");
            p = aVar.d("Float");
            q = aVar.d("Double");
            r = aVar.d("Number");
            s = aVar.d("Enum");
            t = aVar.d("Function");
            u = aVar.c("Throwable");
            v = aVar.c("Comparable");
            w = aVar.e("IntRange");
            x = aVar.e("LongRange");
            y = aVar.c("Deprecated");
            z = aVar.c("DeprecatedSinceKotlin");
            A = aVar.c("DeprecationLevel");
            B = aVar.c("ReplaceWith");
            C = aVar.c("ExtensionFunctionType");
            D = aVar.c("ContextFunctionTypeParams");
            c c2 = aVar.c("ParameterName");
            E = c2;
            b m2 = b.m(c2);
            l.e(m2, "topLevel(parameterName)");
            F = m2;
            G = aVar.c("Annotation");
            c a2 = aVar.a("Target");
            H = a2;
            b m3 = b.m(a2);
            l.e(m3, "topLevel(target)");
            I = m3;
            J = aVar.a("AnnotationTarget");
            K = aVar.a("AnnotationRetention");
            c a3 = aVar.a("Retention");
            L = a3;
            b m4 = b.m(a3);
            l.e(m4, "topLevel(retention)");
            M = m4;
            c a4 = aVar.a("Repeatable");
            N = a4;
            b m5 = b.m(a4);
            l.e(m5, "topLevel(repeatable)");
            O = m5;
            P = aVar.a("MustBeDocumented");
            Q = aVar.c("UnsafeVariance");
            R = aVar.c("PublishedApi");
            S = aVar.b("Iterator");
            T = aVar.b("Iterable");
            U = aVar.b("Collection");
            V = aVar.b("List");
            W = aVar.b("ListIterator");
            X = aVar.b("Set");
            c b2 = aVar.b("Map");
            Y = b2;
            c c3 = b2.c(f.r("Entry"));
            l.e(c3, "map.child(Name.identifier(\"Entry\"))");
            Z = c3;
            a aVar2 = a;
            a0 = aVar2.b("MutableIterator");
            b0 = aVar2.b("MutableIterable");
            c0 = aVar2.b("MutableCollection");
            d0 = aVar2.b("MutableList");
            e0 = aVar2.b("MutableListIterator");
            f0 = aVar2.b("MutableSet");
            c b3 = aVar2.b("MutableMap");
            g0 = b3;
            c c4 = b3.c(f.r("MutableEntry"));
            l.e(c4, "mutableMap.child(Name.identifier(\"MutableEntry\"))");
            h0 = c4;
            i0 = f("KClass");
            j0 = f("KCallable");
            k0 = f("KProperty0");
            l0 = f("KProperty1");
            m0 = f("KProperty2");
            n0 = f("KMutableProperty0");
            o0 = f("KMutableProperty1");
            p0 = f("KMutableProperty2");
            d f2 = f("KProperty");
            q0 = f2;
            r0 = f("KMutableProperty");
            b m6 = b.m(f2.l());
            l.e(m6, "topLevel(kPropertyFqName.toSafe())");
            s0 = m6;
            t0 = f("KDeclarationContainer");
            c c5 = aVar2.c("UByte");
            u0 = c5;
            c c6 = aVar2.c("UShort");
            v0 = c6;
            c c7 = aVar2.c("UInt");
            w0 = c7;
            c c8 = aVar2.c("ULong");
            x0 = c8;
            b m7 = b.m(c5);
            l.e(m7, "topLevel(uByteFqName)");
            y0 = m7;
            b m8 = b.m(c6);
            l.e(m8, "topLevel(uShortFqName)");
            z0 = m8;
            b m9 = b.m(c7);
            l.e(m9, "topLevel(uIntFqName)");
            A0 = m9;
            b m10 = b.m(c8);
            l.e(m10, "topLevel(uLongFqName)");
            B0 = m10;
            C0 = aVar2.c("UByteArray");
            D0 = aVar2.c("UShortArray");
            E0 = aVar2.c("UIntArray");
            F0 = aVar2.c("ULongArray");
            HashSet f3 = kotlin.reflect.jvm.internal.impl.utils.a.f(i.values().length);
            for (i iVar : i.values()) {
                f3.add(iVar.o());
            }
            G0 = f3;
            HashSet f4 = kotlin.reflect.jvm.internal.impl.utils.a.f(i.values().length);
            for (i iVar2 : i.values()) {
                f4.add(iVar2.i());
            }
            H0 = f4;
            HashMap e2 = kotlin.reflect.jvm.internal.impl.utils.a.e(i.values().length);
            for (i iVar3 : i.values()) {
                a aVar3 = a;
                String f5 = iVar3.o().f();
                l.e(f5, "primitiveType.typeName.asString()");
                e2.put(aVar3.d(f5), iVar3);
            }
            I0 = e2;
            HashMap e3 = kotlin.reflect.jvm.internal.impl.utils.a.e(i.values().length);
            for (i iVar4 : i.values()) {
                a aVar4 = a;
                String f6 = iVar4.i().f();
                l.e(f6, "primitiveType.arrayTypeName.asString()");
                e3.put(aVar4.d(f6), iVar4);
            }
            J0 = e3;
        }

        private a() {
        }

        private final c a(String str) {
            c c2 = k.s.c(f.r(str));
            l.e(c2, "ANNOTATION_PACKAGE_FQ_NA…e.identifier(simpleName))");
            return c2;
        }

        private final c b(String str) {
            c c2 = k.t.c(f.r(str));
            l.e(c2, "COLLECTIONS_PACKAGE_FQ_N…e.identifier(simpleName))");
            return c2;
        }

        private final c c(String str) {
            c c2 = k.r.c(f.r(str));
            l.e(c2, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(simpleName))");
            return c2;
        }

        private final d d(String str) {
            d j2 = c(str).j();
            l.e(j2, "fqName(simpleName).toUnsafe()");
            return j2;
        }

        private final d e(String str) {
            d j2 = k.u.c(f.r(str)).j();
            l.e(j2, "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return j2;
        }

        public static final d f(String str) {
            l.f(str, "simpleName");
            d j2 = k.o.c(f.r(str)).j();
            l.e(j2, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return j2;
        }
    }

    static {
        List<String> l2;
        Set<c> g2;
        f r2 = f.r("field");
        l.e(r2, "identifier(\"field\")");
        f19700b = r2;
        f r3 = f.r("value");
        l.e(r3, "identifier(\"value\")");
        f19701c = r3;
        f r4 = f.r("values");
        l.e(r4, "identifier(\"values\")");
        f19702d = r4;
        f r5 = f.r("valueOf");
        l.e(r5, "identifier(\"valueOf\")");
        f19703e = r5;
        f r6 = f.r("copy");
        l.e(r6, "identifier(\"copy\")");
        f19704f = r6;
        f r7 = f.r("hashCode");
        l.e(r7, "identifier(\"hashCode\")");
        f19705g = r7;
        f r8 = f.r("code");
        l.e(r8, "identifier(\"code\")");
        f19706h = r8;
        f r9 = f.r("count");
        l.e(r9, "identifier(\"count\")");
        f19707i = r9;
        c cVar = new c("kotlin.coroutines");
        f19708j = cVar;
        f19709k = new c("kotlin.coroutines.jvm.internal");
        l = new c("kotlin.coroutines.intrinsics");
        c c2 = cVar.c(f.r("Continuation"));
        l.e(c2, "COROUTINES_PACKAGE_FQ_NA…entifier(\"Continuation\"))");
        m = c2;
        n = new c("kotlin.Result");
        c cVar2 = new c("kotlin.reflect");
        o = cVar2;
        l2 = t.l("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        p = l2;
        f r10 = f.r("kotlin");
        l.e(r10, "identifier(\"kotlin\")");
        q = r10;
        c k2 = c.k(r10);
        l.e(k2, "topLevel(BUILT_INS_PACKAGE_NAME)");
        r = k2;
        c c3 = k2.c(f.r("annotation"));
        l.e(c3, "BUILT_INS_PACKAGE_FQ_NAM…identifier(\"annotation\"))");
        s = c3;
        c c4 = k2.c(f.r("collections"));
        l.e(c4, "BUILT_INS_PACKAGE_FQ_NAM…dentifier(\"collections\"))");
        t = c4;
        c c5 = k2.c(f.r("ranges"));
        l.e(c5, "BUILT_INS_PACKAGE_FQ_NAM…ame.identifier(\"ranges\"))");
        u = c5;
        c c6 = k2.c(f.r(Command.CommandHandler.TEXT));
        l.e(c6, "BUILT_INS_PACKAGE_FQ_NAM…(Name.identifier(\"text\"))");
        v = c6;
        c c7 = k2.c(f.r("internal"));
        l.e(c7, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(\"internal\"))");
        w = c7;
        g2 = u0.g(k2, c4, c5, c3, cVar2, c7, cVar);
        x = g2;
    }

    private k() {
    }

    public static final b a(int i2) {
        return new b(r, f.r(b(i2)));
    }

    public static final String b(int i2) {
        return "Function" + i2;
    }

    public static final c c(i iVar) {
        l.f(iVar, "primitiveType");
        c c2 = r.c(iVar.o());
        l.e(c2, "BUILT_INS_PACKAGE_FQ_NAM…d(primitiveType.typeName)");
        return c2;
    }

    public static final String d(int i2) {
        return kotlin.reflect.x.internal.l0.b.p.c.f19743h.f() + i2;
    }

    public static final boolean e(d dVar) {
        l.f(dVar, "arrayFqName");
        return a.J0.get(dVar) != null;
    }
}
