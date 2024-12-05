package kotlin.reflect.x.internal.l0.d.a.l0.m;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.collections.r;
import kotlin.collections.t0;
import kotlin.collections.u;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.k.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f1;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.l.u1.h;
import kotlin.reflect.x.internal.l0.l.u1.j;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.s;

/* compiled from: TypeParameterUpperBoundEraser.kt */
/* loaded from: classes2.dex */
public final class g {
    private final f a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f20097b;

    /* renamed from: c, reason: collision with root package name */
    private final e f20098c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.g<a, e0> f20099d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private final e1 a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f20100b;

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.d.a.l0.m.a f20101c;

        public a(e1 e1Var, boolean z, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
            l.f(e1Var, "typeParameter");
            l.f(aVar, "typeAttr");
            this.a = e1Var;
            this.f20100b = z;
            this.f20101c = aVar;
        }

        public final kotlin.reflect.x.internal.l0.d.a.l0.m.a a() {
            return this.f20101c;
        }

        public final e1 b() {
            return this.a;
        }

        public final boolean c() {
            return this.f20100b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(aVar.a, this.a) && aVar.f20100b == this.f20100b && aVar.f20101c.d() == this.f20101c.d() && aVar.f20101c.e() == this.f20101c.e() && aVar.f20101c.g() == this.f20101c.g() && l.a(aVar.f20101c.c(), this.f20101c.c());
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int i2 = hashCode + (hashCode * 31) + (this.f20100b ? 1 : 0);
            int hashCode2 = i2 + (i2 * 31) + this.f20101c.d().hashCode();
            int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f20101c.e().hashCode();
            int i3 = hashCode3 + (hashCode3 * 31) + (this.f20101c.g() ? 1 : 0);
            int i4 = i3 * 31;
            m0 c2 = this.f20101c.c();
            return i3 + i4 + (c2 != null ? c2.hashCode() : 0);
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.a + ", isRaw=" + this.f20100b + ", typeAttr=" + this.f20101c + ')';
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<h> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return k.d(j.z0, g.this.toString());
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<a, e0> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(a aVar) {
            return g.this.d(aVar.b(), aVar.c(), aVar.a());
        }
    }

    public g(e eVar) {
        Lazy b2;
        f fVar = new f("Type parameter upper bound erasion results");
        this.a = fVar;
        b2 = i.b(new b());
        this.f20097b = b2;
        this.f20098c = eVar == null ? new e(this) : eVar;
        kotlin.reflect.x.internal.l0.k.g<a, e0> h2 = fVar.h(new c());
        l.e(h2, "storage.createMemoizedFu… isRaw, typeAttr) }\n    }");
        this.f20099d = h2;
    }

    private final e0 b(kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
        e0 w;
        m0 c2 = aVar.c();
        return (c2 == null || (w = kotlin.reflect.x.internal.l0.l.x1.a.w(c2)) == null) ? e() : w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 d(e1 e1Var, boolean z, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
        int t;
        int e2;
        int b2;
        g1 j2;
        Set<e1> f2 = aVar.f();
        if (f2 != null && f2.contains(e1Var.L0())) {
            return b(aVar);
        }
        m0 s = e1Var.s();
        l.e(s, "typeParameter.defaultType");
        Set<e1> f3 = kotlin.reflect.x.internal.l0.l.x1.a.f(s, f2);
        t = u.t(f3, 10);
        e2 = n0.e(t);
        b2 = kotlin.ranges.f.b(e2, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
        for (e1 e1Var2 : f3) {
            if (f2 != null && f2.contains(e1Var2)) {
                j2 = d.b(e1Var2, aVar);
            } else {
                e eVar = this.f20098c;
                kotlin.reflect.x.internal.l0.d.a.l0.m.a i2 = z ? aVar : aVar.i(kotlin.reflect.x.internal.l0.d.a.l0.m.b.INFLEXIBLE);
                e0 c2 = c(e1Var2, z, aVar.j(e1Var));
                l.e(c2, "getErasedUpperBound(it, …Parameter(typeParameter))");
                j2 = eVar.j(e1Var2, i2, c2);
            }
            Pair a2 = s.a(e1Var2.g(), j2);
            linkedHashMap.put(a2.c(), a2.d());
        }
        l1 g2 = l1.g(f1.a.e(f1.f21236c, linkedHashMap, false, 2, null));
        l.e(g2, "create(TypeConstructorSu…rsMap(erasedUpperBounds))");
        List<e0> upperBounds = e1Var.getUpperBounds();
        l.e(upperBounds, "typeParameter.upperBounds");
        e0 e0Var = (e0) r.R(upperBounds);
        if (e0Var.O0().w() instanceof e) {
            l.e(e0Var, "firstUpperBound");
            return kotlin.reflect.x.internal.l0.l.x1.a.v(e0Var, g2, linkedHashMap, r1.OUT_VARIANCE, aVar.f());
        }
        Set<e1> f4 = aVar.f();
        if (f4 == null) {
            f4 = t0.c(this);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h w = e0Var.O0().w();
        l.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            e1 e1Var3 = (e1) w;
            if (!f4.contains(e1Var3)) {
                List<e0> upperBounds2 = e1Var3.getUpperBounds();
                l.e(upperBounds2, "current.upperBounds");
                e0 e0Var2 = (e0) r.R(upperBounds2);
                if (e0Var2.O0().w() instanceof e) {
                    l.e(e0Var2, "nextUpperBound");
                    return kotlin.reflect.x.internal.l0.l.x1.a.v(e0Var2, g2, linkedHashMap, r1.OUT_VARIANCE, aVar.f());
                }
                w = e0Var2.O0().w();
                l.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            } else {
                return b(aVar);
            }
        }
    }

    private final h e() {
        return (h) this.f20097b.getValue();
    }

    public final e0 c(e1 e1Var, boolean z, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
        l.f(e1Var, "typeParameter");
        l.f(aVar, "typeAttr");
        return this.f20099d.invoke(new a(e1Var, z, aVar));
    }

    public /* synthetic */ g(e eVar, int i2, kotlin.jvm.internal.g gVar) {
        this((i2 & 1) != 0 ? null : eVar);
    }
}
