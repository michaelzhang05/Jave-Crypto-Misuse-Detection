package kotlin.reflect.x.internal.l0.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.s;

/* compiled from: UnsignedType.kt */
/* loaded from: classes2.dex */
public final class o {
    public static final o a = new o();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<f> f19732b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<f> f19733c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<b, b> f19734d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<b, b> f19735e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<m, f> f19736f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<f> f19737g;

    static {
        Set<f> C0;
        Set<f> C02;
        HashMap<m, f> k2;
        n[] values = n.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (n nVar : values) {
            arrayList.add(nVar.n());
        }
        C0 = b0.C0(arrayList);
        f19732b = C0;
        m[] values2 = m.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (m mVar : values2) {
            arrayList2.add(mVar.f());
        }
        C02 = b0.C0(arrayList2);
        f19733c = C02;
        f19734d = new HashMap<>();
        f19735e = new HashMap<>();
        k2 = o0.k(s.a(m.f19720f, f.r("ubyteArrayOf")), s.a(m.f19721g, f.r("ushortArrayOf")), s.a(m.f19722h, f.r("uintArrayOf")), s.a(m.f19723i, f.r("ulongArrayOf")));
        f19736f = k2;
        n[] values3 = n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar2 : values3) {
            linkedHashSet.add(nVar2.f().j());
        }
        f19737g = linkedHashSet;
        for (n nVar3 : n.values()) {
            f19734d.put(nVar3.f(), nVar3.i());
            f19735e.put(nVar3.i(), nVar3.f());
        }
    }

    private o() {
    }

    public static final boolean d(e0 e0Var) {
        h w;
        l.f(e0Var, "type");
        if (n1.v(e0Var) || (w = e0Var.O0().w()) == null) {
            return false;
        }
        return a.c(w);
    }

    public final b a(b bVar) {
        l.f(bVar, "arrayClassId");
        return f19734d.get(bVar);
    }

    public final boolean b(f fVar) {
        l.f(fVar, "name");
        return f19737g.contains(fVar);
    }

    public final boolean c(m mVar) {
        l.f(mVar, "descriptor");
        m b2 = mVar.b();
        return (b2 instanceof k0) && l.a(((k0) b2).d(), k.r) && f19732b.contains(mVar.getName());
    }
}
