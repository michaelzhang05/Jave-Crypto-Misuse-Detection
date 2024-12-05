package kotlin.reflect.x.internal.l0.d.a.j0;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.o0;
import kotlin.collections.u;
import kotlin.collections.u0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.n;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.d.a.n0.b;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.r.g;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.u1.j;
import kotlin.s;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final d a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, EnumSet<n>> f19926b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, m> f19927c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<g0, e0> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f19928f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(g0 g0Var) {
            l.f(g0Var, "module");
            i1 b2 = kotlin.reflect.x.internal.l0.d.a.j0.a.b(c.a.d(), g0Var.o().o(k.a.H));
            e0 type = b2 != null ? b2.getType() : null;
            return type == null ? kotlin.reflect.x.internal.l0.l.u1.k.d(j.G0, new String[0]) : type;
        }
    }

    static {
        Map<String, EnumSet<n>> l;
        Map<String, m> l2;
        l = o0.l(s.a("PACKAGE", EnumSet.noneOf(n.class)), s.a("TYPE", EnumSet.of(n.w, n.J)), s.a("ANNOTATION_TYPE", EnumSet.of(n.x)), s.a("TYPE_PARAMETER", EnumSet.of(n.y)), s.a("FIELD", EnumSet.of(n.A)), s.a("LOCAL_VARIABLE", EnumSet.of(n.B)), s.a("PARAMETER", EnumSet.of(n.C)), s.a("CONSTRUCTOR", EnumSet.of(n.D)), s.a("METHOD", EnumSet.of(n.E, n.F, n.G)), s.a("TYPE_USE", EnumSet.of(n.H)));
        f19926b = l;
        l2 = o0.l(s.a("RUNTIME", m.RUNTIME), s.a("CLASS", m.BINARY), s.a("SOURCE", m.SOURCE));
        f19927c = l2;
    }

    private d() {
    }

    public final g<?> a(b bVar) {
        kotlin.reflect.x.internal.l0.d.a.n0.m mVar = bVar instanceof kotlin.reflect.x.internal.l0.d.a.n0.m ? (kotlin.reflect.x.internal.l0.d.a.n0.m) bVar : null;
        if (mVar == null) {
            return null;
        }
        Map<String, m> map = f19927c;
        f d2 = mVar.d();
        m mVar2 = map.get(d2 != null ? d2.f() : null);
        if (mVar2 == null) {
            return null;
        }
        kotlin.reflect.x.internal.l0.f.b m = kotlin.reflect.x.internal.l0.f.b.m(k.a.K);
        l.e(m, "topLevel(StandardNames.F…ames.annotationRetention)");
        f r = f.r(mVar2.name());
        l.e(r, "identifier(retention.name)");
        return new kotlin.reflect.x.internal.l0.i.r.j(m, r);
    }

    public final Set<n> b(String str) {
        Set<n> d2;
        EnumSet<n> enumSet = f19926b.get(str);
        if (enumSet != null) {
            return enumSet;
        }
        d2 = u0.d();
        return d2;
    }

    public final g<?> c(List<? extends b> list) {
        int t;
        l.f(list, "arguments");
        ArrayList<kotlin.reflect.x.internal.l0.d.a.n0.m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof kotlin.reflect.x.internal.l0.d.a.n0.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        for (kotlin.reflect.x.internal.l0.d.a.n0.m mVar : arrayList) {
            d dVar = a;
            f d2 = mVar.d();
            y.y(arrayList2, dVar.b(d2 != null ? d2.f() : null));
        }
        t = u.t(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(t);
        for (n nVar : arrayList2) {
            kotlin.reflect.x.internal.l0.f.b m = kotlin.reflect.x.internal.l0.f.b.m(k.a.J);
            l.e(m, "topLevel(StandardNames.FqNames.annotationTarget)");
            f r = f.r(nVar.name());
            l.e(r, "identifier(kotlinTarget.name)");
            arrayList3.add(new kotlin.reflect.x.internal.l0.i.r.j(m, r));
        }
        return new kotlin.reflect.x.internal.l0.i.r.b(arrayList3, a.f19928f);
    }
}
