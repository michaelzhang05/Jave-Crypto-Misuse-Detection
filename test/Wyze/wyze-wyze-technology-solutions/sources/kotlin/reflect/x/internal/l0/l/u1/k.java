package kotlin.reflect.x.internal.l0.l.u1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.g1;

/* compiled from: ErrorUtils.kt */
/* loaded from: classes2.dex */
public final class k {
    public static final k a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final g0 f21362b = d.f21334f;

    /* renamed from: c, reason: collision with root package name */
    private static final a f21363c;

    /* renamed from: d, reason: collision with root package name */
    private static final e0 f21364d;

    /* renamed from: e, reason: collision with root package name */
    private static final e0 f21365e;

    /* renamed from: f, reason: collision with root package name */
    private static final t0 f21366f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<t0> f21367g;

    static {
        Set<t0> c2;
        String format = String.format(b.ERROR_CLASS.f(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        l.e(format, "format(this, *args)");
        f C = f.C(format);
        l.e(C, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f21363c = new a(C);
        f21364d = d(j.y, new String[0]);
        f21365e = d(j.v0, new String[0]);
        e eVar = new e();
        f21366f = eVar;
        c2 = kotlin.collections.t0.c(eVar);
        f21367g = c2;
    }

    private k() {
    }

    public static final f a(g gVar, boolean z, String... strArr) {
        l.f(gVar, "kind");
        l.f(strArr, "formatParams");
        return z ? new l(gVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new f(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final f b(g gVar, String... strArr) {
        l.f(gVar, "kind");
        l.f(strArr, "formatParams");
        return a(gVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final h d(j jVar, String... strArr) {
        List<? extends g1> i2;
        l.f(jVar, "kind");
        l.f(strArr, "formatParams");
        k kVar = a;
        i2 = t.i();
        return kVar.g(jVar, i2, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean m(m mVar) {
        if (mVar != null) {
            k kVar = a;
            if (kVar.n(mVar) || kVar.n(mVar.b()) || mVar == f21362b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(m mVar) {
        return mVar instanceof a;
    }

    public static final boolean o(e0 e0Var) {
        if (e0Var == null) {
            return false;
        }
        e1 O0 = e0Var.O0();
        return (O0 instanceof i) && ((i) O0).g() == j.B;
    }

    public final h c(j jVar, e1 e1Var, String... strArr) {
        List<? extends g1> i2;
        l.f(jVar, "kind");
        l.f(e1Var, "typeConstructor");
        l.f(strArr, "formatParams");
        i2 = t.i();
        return f(jVar, i2, e1Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final i e(j jVar, String... strArr) {
        l.f(jVar, "kind");
        l.f(strArr, "formatParams");
        return new i(jVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final h f(j jVar, List<? extends g1> list, e1 e1Var, String... strArr) {
        l.f(jVar, "kind");
        l.f(list, "arguments");
        l.f(e1Var, "typeConstructor");
        l.f(strArr, "formatParams");
        return new h(e1Var, b(g.ERROR_TYPE_SCOPE, e1Var.toString()), jVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final h g(j jVar, List<? extends g1> list, String... strArr) {
        l.f(jVar, "kind");
        l.f(list, "arguments");
        l.f(strArr, "formatParams");
        return f(jVar, list, e(jVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final a h() {
        return f21363c;
    }

    public final g0 i() {
        return f21362b;
    }

    public final Set<t0> j() {
        return f21367g;
    }

    public final e0 k() {
        return f21365e;
    }

    public final e0 l() {
        return f21364d;
    }
}
