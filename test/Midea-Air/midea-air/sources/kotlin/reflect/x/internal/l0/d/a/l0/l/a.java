package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.d.a.n0.g;
import kotlin.reflect.x.internal.l0.d.a.n0.n;
import kotlin.reflect.x.internal.l0.d.a.n0.p;
import kotlin.reflect.x.internal.l0.d.a.n0.q;
import kotlin.reflect.x.internal.l0.d.a.n0.r;
import kotlin.reflect.x.internal.l0.d.a.n0.w;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.sequences.Sequence;

/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes2.dex */
public class a implements b {
    private final g a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<q, Boolean> f19985b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<r, Boolean> f19986c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<f, List<r>> f19987d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<f, n> f19988e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<f, w> f19989f;

    /* compiled from: DeclaredMemberIndex.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.a.l0.l.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0290a extends Lambda implements Function1<r, Boolean> {
        C0290a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r rVar) {
            l.f(rVar, "m");
            return Boolean.valueOf(((Boolean) a.this.f19985b.invoke(rVar)).booleanValue() && !p.c(rVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(g gVar, Function1<? super q, Boolean> function1) {
        Sequence I;
        Sequence l;
        Sequence I2;
        Sequence l2;
        int t;
        int e2;
        int b2;
        l.f(gVar, "jClass");
        l.f(function1, "memberFilter");
        this.a = gVar;
        this.f19985b = function1;
        C0290a c0290a = new C0290a();
        this.f19986c = c0290a;
        I = b0.I(gVar.M());
        l = kotlin.sequences.n.l(I, c0290a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : l) {
            f name = ((r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f19987d = linkedHashMap;
        I2 = b0.I(this.a.D());
        l2 = kotlin.sequences.n.l(I2, this.f19985b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : l2) {
            linkedHashMap2.put(((n) obj3).getName(), obj3);
        }
        this.f19988e = linkedHashMap2;
        Collection<w> j2 = this.a.j();
        Function1<q, Boolean> function12 = this.f19985b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : j2) {
            if (((Boolean) function12.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        t = u.t(arrayList, 10);
        e2 = n0.e(t);
        b2 = kotlin.ranges.f.b(e2, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(b2);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((w) obj5).getName(), obj5);
        }
        this.f19989f = linkedHashMap3;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.b
    public Set<f> a() {
        Sequence I;
        Sequence l;
        I = b0.I(this.a.M());
        l = kotlin.sequences.n.l(I, this.f19986c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.b
    public w b(f fVar) {
        l.f(fVar, "name");
        return this.f19989f.get(fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.b
    public n c(f fVar) {
        l.f(fVar, "name");
        return this.f19988e.get(fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.b
    public Set<f> d() {
        return this.f19989f.keySet();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.b
    public Set<f> e() {
        Sequence I;
        Sequence l;
        I = b0.I(this.a.D());
        l = kotlin.sequences.n.l(I, this.f19985b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.b
    public Collection<r> f(f fVar) {
        List i2;
        l.f(fVar, "name");
        List<r> list = this.f19987d.get(fVar);
        if (list != null) {
            return list;
        }
        i2 = t.i();
        return i2;
    }
}
