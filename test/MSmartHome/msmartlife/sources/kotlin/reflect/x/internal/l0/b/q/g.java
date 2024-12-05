package kotlin.reflect.x.internal.l0.b.q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.z;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.x.internal.l0.b.q.f;
import kotlin.reflect.x.internal.l0.d.b.u;
import kotlin.reflect.x.internal.l0.i.j;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.h0;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes2.dex */
public final class g implements kotlin.reflect.jvm.internal.impl.descriptors.o1.a, kotlin.reflect.jvm.internal.impl.descriptors.o1.c {
    static final /* synthetic */ KProperty<Object>[] a = {b0.g(new v(b0.b(g.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), b0.g(new v(b0.b(g.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), b0.g(new v(b0.b(g.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: b, reason: collision with root package name */
    private final g0 f19788b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.b.q.d f19789c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f19790d;

    /* renamed from: e, reason: collision with root package name */
    private final e0 f19791e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f19792f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.a<kotlin.reflect.x.internal.l0.f.c, kotlin.reflect.jvm.internal.impl.descriptors.e> f19793g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f19794h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public enum a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.HIDDEN.ordinal()] = 1;
            iArr[a.NOT_CONSIDERED.ordinal()] = 2;
            iArr[a.DROP.ordinal()] = 3;
            iArr[a.VISIBLE.ordinal()] = 4;
            a = iArr;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<m0> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f19801g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f19801g = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            return x.c(g.this.s().a(), kotlin.reflect.x.internal.l0.b.q.e.a.a(), new j0(this.f19801g, g.this.s().a())).s();
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public static final class d extends z {
        d(g0 g0Var, kotlin.reflect.x.internal.l0.f.c cVar) {
            super(g0Var, cVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public h.b q() {
            return h.b.f20931b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function0<e0> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            m0 i2 = g.this.f19788b.o().i();
            kotlin.jvm.internal.l.e(i2, "moduleDescriptor.builtIns.anyType");
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements Function0<kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.d.a.l0.l.f f19803f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f19804g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.reflect.x.internal.l0.d.a.l0.l.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            super(0);
            this.f19803f = fVar;
            this.f19804g = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke() {
            kotlin.reflect.x.internal.l0.d.a.l0.l.f fVar = this.f19803f;
            kotlin.reflect.x.internal.l0.d.a.j0.g gVar = kotlin.reflect.x.internal.l0.d.a.j0.g.a;
            kotlin.jvm.internal.l.e(gVar, "EMPTY");
            return fVar.O0(gVar, this.f19804g);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.x.e.l0.b.q.g$g, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0284g extends Lambda implements Function1<kotlin.reflect.x.internal.l0.i.w.h, Collection<? extends y0>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.f.f f19805f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0284g(kotlin.reflect.x.internal.l0.f.f fVar) {
            super(1);
            this.f19805f = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.i.w.h hVar) {
            kotlin.jvm.internal.l.f(hVar, "it");
            return hVar.a(this.f19805f, kotlin.reflect.x.internal.l0.c.b.d.FROM_BUILTINS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public static final class h<N> implements b.c {
        h() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.e> a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            Collection<e0> a = eVar.g().a();
            kotlin.jvm.internal.l.e(a, "it.typeConstructor.supertypes");
            g gVar = g.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.h w = ((e0) it.next()).O0().w();
                kotlin.reflect.jvm.internal.impl.descriptors.h L0 = w != null ? w.L0() : null;
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = L0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) L0 : null;
                kotlin.reflect.x.internal.l0.d.a.l0.l.f p = eVar2 != null ? gVar.p(eVar2) : null;
                if (p != null) {
                    arrayList.add(p);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public static final class i extends b.AbstractC0376b<kotlin.reflect.jvm.internal.impl.descriptors.e, a> {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0<a> f19806b;

        i(String str, a0<a> a0Var) {
            this.a = str;
            this.f19806b = a0Var;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.f0.x.e.l0.b.q.g$a] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.f0.x.e.l0.b.q.g$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.f0.x.e.l0.b.q.g$a] */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            kotlin.jvm.internal.l.f(eVar, "javaClassDescriptor");
            String a = u.a(kotlin.reflect.x.internal.l0.d.b.x.a, eVar, this.a);
            kotlin.reflect.x.internal.l0.b.q.i iVar = kotlin.reflect.x.internal.l0.b.q.i.a;
            if (iVar.e().contains(a)) {
                this.f19806b.f19460f = a.HIDDEN;
            } else if (iVar.h().contains(a)) {
                this.f19806b.f19460f = a.VISIBLE;
            } else if (iVar.c().contains(a)) {
                this.f19806b.f19460f = a.DROP;
            }
            return this.f19806b.f19460f == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = this.f19806b.f19460f;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public static final class j<N> implements b.c {
        public static final j<N> a = new j<>();

        j() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.b> a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar.L0().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public static final class k extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {
        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            boolean z;
            if (bVar.i() == b.a.DECLARATION) {
                kotlin.reflect.x.internal.l0.b.q.d dVar = g.this.f19789c;
                m b2 = bVar.b();
                kotlin.jvm.internal.l.d(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (dVar.c((kotlin.reflect.jvm.internal.impl.descriptors.e) b2)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    static final class l extends Lambda implements Function0<kotlin.reflect.jvm.internal.impl.descriptors.n1.g> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.n1.g invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> e2;
            kotlin.reflect.jvm.internal.impl.descriptors.n1.c b2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.f.b(g.this.f19788b.o(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null);
            g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c;
            e2 = s.e(b2);
            return aVar.a(e2);
        }
    }

    public g(g0 g0Var, n nVar, Function0<f.b> function0) {
        kotlin.jvm.internal.l.f(g0Var, "moduleDescriptor");
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(function0, "settingsComputation");
        this.f19788b = g0Var;
        this.f19789c = kotlin.reflect.x.internal.l0.b.q.d.a;
        this.f19790d = nVar.d(function0);
        this.f19791e = k(nVar);
        this.f19792f = nVar.d(new c(nVar));
        this.f19793g = nVar.b();
        this.f19794h = nVar.d(new l());
    }

    private final y0 j(kotlin.reflect.x.internal.l0.j.b.g0.d dVar, y0 y0Var) {
        y.a<? extends y0> u = y0Var.u();
        u.p(dVar);
        u.o(t.f21863e);
        u.g(dVar.s());
        u.e(dVar.K0());
        y0 a2 = u.a();
        kotlin.jvm.internal.l.c(a2);
        return a2;
    }

    private final e0 k(n nVar) {
        List e2;
        Set<kotlin.reflect.jvm.internal.impl.descriptors.d> d2;
        d dVar = new d(this.f19788b, new kotlin.reflect.x.internal.l0.f.c("java.io"));
        e2 = s.e(new h0(nVar, new e()));
        kotlin.reflect.jvm.internal.impl.descriptors.p1.h hVar = new kotlin.reflect.jvm.internal.impl.descriptors.p1.h(dVar, kotlin.reflect.x.internal.l0.f.f.r("Serializable"), d0.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE, e2, z0.a, false, nVar);
        h.b bVar = h.b.f20931b;
        d2 = u0.d();
        hVar.L0(bVar, d2, null);
        m0 s = hVar.s();
        kotlin.jvm.internal.l.e(s, "mockSerializableClass.defaultType");
        return s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        if (t(r3, r10) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y0> l(kotlin.reflect.jvm.internal.impl.descriptors.e r10, kotlin.jvm.functions.Function1<? super kotlin.reflect.x.internal.l0.i.w.h, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.y0>> r11) {
        /*
            r9 = this;
            kotlin.f0.x.e.l0.d.a.l0.l.f r0 = r9.p(r10)
            if (r0 != 0) goto Lb
            java.util.List r10 = kotlin.collections.r.i()
            return r10
        Lb:
            kotlin.f0.x.e.l0.b.q.d r1 = r9.f19789c
            kotlin.f0.x.e.l0.f.c r2 = kotlin.reflect.x.internal.l0.i.t.a.h(r0)
            kotlin.f0.x.e.l0.b.q.b$a r3 = kotlin.reflect.x.internal.l0.b.q.b.f19750h
            kotlin.f0.x.e.l0.b.h r3 = r3.a()
            java.util.Collection r1 = r1.g(r2, r3)
            java.lang.Object r2 = kotlin.collections.r.e0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r2
            if (r2 != 0) goto L28
            java.util.List r10 = kotlin.collections.r.i()
            return r10
        L28:
            kotlin.reflect.jvm.internal.impl.utils.f$b r3 = kotlin.reflect.jvm.internal.impl.utils.f.f22019f
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.r.t(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r5
            kotlin.f0.x.e.l0.f.c r5 = kotlin.reflect.x.internal.l0.i.t.a.h(r5)
            r4.add(r5)
            goto L39
        L4d:
            kotlin.reflect.jvm.internal.impl.utils.f r1 = r3.b(r4)
            kotlin.f0.x.e.l0.b.q.d r3 = r9.f19789c
            boolean r10 = r3.c(r10)
            kotlin.f0.x.e.l0.k.a<kotlin.f0.x.e.l0.f.c, kotlin.reflect.jvm.internal.impl.descriptors.e> r3 = r9.f19793g
            kotlin.f0.x.e.l0.f.c r4 = kotlin.reflect.x.internal.l0.i.t.a.h(r0)
            kotlin.f0.x.e.l0.b.q.g$f r5 = new kotlin.f0.x.e.l0.b.q.g$f
            r5.<init>(r0, r2)
            java.lang.Object r0 = r3.b(r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r0
            kotlin.f0.x.e.l0.i.w.h r0 = r0.D0()
            java.lang.String r2 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            kotlin.jvm.internal.l.e(r0, r2)
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L80:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r11.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.y0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r4 = r3.i()
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r5 = kotlin.reflect.jvm.internal.impl.descriptors.b.a.DECLARATION
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L99
        L97:
            r6 = 0
            goto Led
        L99:
            kotlin.reflect.jvm.internal.impl.descriptors.u r4 = r3.getVisibility()
            boolean r4 = r4.d()
            if (r4 != 0) goto La4
            goto L97
        La4:
            boolean r4 = kotlin.reflect.x.internal.l0.b.h.j0(r3)
            if (r4 == 0) goto Lab
            goto L97
        Lab:
            java.util.Collection r4 = r3.e()
            java.lang.String r5 = "analogueMember.overriddenDescriptors"
            kotlin.jvm.internal.l.e(r4, r5)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto Lc0
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto Lc0
        Lbe:
            r4 = 0
            goto Le4
        Lc0:
            java.util.Iterator r4 = r4.iterator()
        Lc4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbe
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r5 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r5
            kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r5.b()
            java.lang.String r8 = "it.containingDeclaration"
            kotlin.jvm.internal.l.e(r5, r8)
            kotlin.f0.x.e.l0.f.c r5 = kotlin.reflect.x.internal.l0.i.t.a.h(r5)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto Lc4
            r4 = 1
        Le4:
            if (r4 == 0) goto Le7
            goto L97
        Le7:
            boolean r3 = r9.t(r3, r10)
            if (r3 != 0) goto L97
        Led:
            if (r6 == 0) goto L80
            r0.add(r2)
            goto L80
        Lf3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.b.q.g.l(kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.a0.c.l):java.util.Collection");
    }

    private final m0 m() {
        return (m0) kotlin.reflect.x.internal.l0.k.m.a(this.f19792f, this, a[1]);
    }

    private static final boolean n(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, l1 l1Var, kotlin.reflect.jvm.internal.impl.descriptors.l lVar2) {
        return kotlin.reflect.x.internal.l0.i.j.x(lVar, lVar2.c(l1Var)) == j.i.a.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.x.internal.l0.d.a.l0.l.f p(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.x.internal.l0.f.b n;
        kotlin.reflect.x.internal.l0.f.c b2;
        if (kotlin.reflect.x.internal.l0.b.h.a0(eVar) || !kotlin.reflect.x.internal.l0.b.h.A0(eVar)) {
            return null;
        }
        kotlin.reflect.x.internal.l0.f.d i2 = kotlin.reflect.x.internal.l0.i.t.a.i(eVar);
        if (!i2.f() || (n = kotlin.reflect.x.internal.l0.b.q.c.a.n(i2)) == null || (b2 = n.b()) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e c2 = kotlin.reflect.jvm.internal.impl.descriptors.s.c(s().a(), b2, kotlin.reflect.x.internal.l0.c.b.d.FROM_BUILTINS);
        if (c2 instanceof kotlin.reflect.x.internal.l0.d.a.l0.l.f) {
            return (kotlin.reflect.x.internal.l0.d.a.l0.l.f) c2;
        }
        return null;
    }

    private final a q(y yVar) {
        List e2;
        m b2 = yVar.b();
        kotlin.jvm.internal.l.d(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c2 = kotlin.reflect.x.internal.l0.d.b.v.c(yVar, false, false, 3, null);
        a0 a0Var = new a0();
        e2 = s.e((kotlin.reflect.jvm.internal.impl.descriptors.e) b2);
        Object b3 = kotlin.reflect.jvm.internal.impl.utils.b.b(e2, new h(), new i(c2, a0Var));
        kotlin.jvm.internal.l.e(b3, "private fun FunctionDesc…ERED\n            })\n    }");
        return (a) b3;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.n1.g r() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.n1.g) kotlin.reflect.x.internal.l0.k.m.a(this.f19794h, this, a[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.b s() {
        return (f.b) kotlin.reflect.x.internal.l0.k.m.a(this.f19790d, this, a[0]);
    }

    private final boolean t(y0 y0Var, boolean z) {
        List e2;
        m b2 = y0Var.b();
        kotlin.jvm.internal.l.d(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c2 = kotlin.reflect.x.internal.l0.d.b.v.c(y0Var, false, false, 3, null);
        if (z ^ kotlin.reflect.x.internal.l0.b.q.i.a.f().contains(u.a(kotlin.reflect.x.internal.l0.d.b.x.a, (kotlin.reflect.jvm.internal.impl.descriptors.e) b2, c2))) {
            return true;
        }
        e2 = s.e(y0Var);
        Boolean e3 = kotlin.reflect.jvm.internal.impl.utils.b.e(e2, j.a, new k());
        kotlin.jvm.internal.l.e(e3, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return e3.booleanValue();
    }

    private final boolean u(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (lVar.h().size() == 1) {
            List<i1> h2 = lVar.h();
            kotlin.jvm.internal.l.e(h2, "valueParameters");
            kotlin.reflect.jvm.internal.impl.descriptors.h w = ((i1) r.n0(h2)).getType().O0().w();
            if (kotlin.jvm.internal.l.a(w != null ? kotlin.reflect.x.internal.l0.i.t.a.i(w) : null, kotlin.reflect.x.internal.l0.i.t.a.i(eVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.a
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        List i2;
        int t;
        boolean z;
        List i3;
        List i4;
        kotlin.jvm.internal.l.f(eVar, "classDescriptor");
        if (eVar.i() == kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS && s().b()) {
            kotlin.reflect.x.internal.l0.d.a.l0.l.f p = p(eVar);
            if (p == null) {
                i4 = kotlin.collections.t.i();
                return i4;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e f2 = kotlin.reflect.x.internal.l0.b.q.d.f(this.f19789c, kotlin.reflect.x.internal.l0.i.t.a.h(p), kotlin.reflect.x.internal.l0.b.q.b.f19750h.a(), null, 4, null);
            if (f2 == null) {
                i3 = kotlin.collections.t.i();
                return i3;
            }
            l1 c2 = kotlin.reflect.x.internal.l0.b.q.j.a(f2, p).c();
            List<kotlin.reflect.jvm.internal.impl.descriptors.d> k2 = p.k();
            ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.d> arrayList = new ArrayList();
            Iterator<T> it = k2.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) next;
                if (dVar.getVisibility().d()) {
                    Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> k3 = f2.k();
                    kotlin.jvm.internal.l.e(k3, "defaultKotlinVersion.constructors");
                    if (!(k3 instanceof Collection) || !k3.isEmpty()) {
                        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 : k3) {
                            kotlin.jvm.internal.l.e(dVar2, "it");
                            if (n(dVar2, c2, dVar)) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z && !u(dVar, eVar) && !kotlin.reflect.x.internal.l0.b.h.j0(dVar) && !kotlin.reflect.x.internal.l0.b.q.i.a.d().contains(u.a(kotlin.reflect.x.internal.l0.d.b.x.a, p, kotlin.reflect.x.internal.l0.d.b.v.c(dVar, false, false, 3, null)))) {
                        z2 = true;
                    }
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            t = kotlin.collections.u.t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t);
            for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar3 : arrayList) {
                y.a<? extends y> u = dVar3.u();
                u.p(eVar);
                u.g(eVar.s());
                u.f();
                u.l(c2.j());
                if (!kotlin.reflect.x.internal.l0.b.q.i.a.g().contains(u.a(kotlin.reflect.x.internal.l0.d.b.x.a, p, kotlin.reflect.x.internal.l0.d.b.v.c(dVar3, false, false, 3, null)))) {
                    u.s(r());
                }
                y a2 = u.a();
                kotlin.jvm.internal.l.d(a2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((kotlin.reflect.jvm.internal.impl.descriptors.d) a2);
            }
            return arrayList2;
        }
        i2 = kotlin.collections.t.i();
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
    
        if (r2 != 3) goto L42;
     */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y0> b(kotlin.reflect.x.internal.l0.f.f r7, kotlin.reflect.jvm.internal.impl.descriptors.e r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.b.q.g.b(kotlin.f0.x.e.l0.f.f, kotlin.reflect.jvm.internal.impl.descriptors.e):java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.c
    public boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, y0 y0Var) {
        kotlin.jvm.internal.l.f(eVar, "classDescriptor");
        kotlin.jvm.internal.l.f(y0Var, "functionDescriptor");
        kotlin.reflect.x.internal.l0.d.a.l0.l.f p = p(eVar);
        if (p == null || !y0Var.getAnnotations().A(kotlin.reflect.jvm.internal.impl.descriptors.o1.d.a())) {
            return true;
        }
        if (!s().b()) {
            return false;
        }
        String c2 = kotlin.reflect.x.internal.l0.d.b.v.c(y0Var, false, false, 3, null);
        kotlin.reflect.x.internal.l0.d.a.l0.l.g D0 = p.D0();
        kotlin.reflect.x.internal.l0.f.f name = y0Var.getName();
        kotlin.jvm.internal.l.e(name, "functionDescriptor.name");
        Collection<y0> a2 = D0.a(name, kotlin.reflect.x.internal.l0.c.b.d.FROM_BUILTINS);
        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.l.a(kotlin.reflect.x.internal.l0.d.b.v.c((y0) it.next(), false, false, 3, null), c2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.a
    public Collection<e0> d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        List i2;
        List e2;
        List l2;
        kotlin.jvm.internal.l.f(eVar, "classDescriptor");
        kotlin.reflect.x.internal.l0.f.d i3 = kotlin.reflect.x.internal.l0.i.t.a.i(eVar);
        kotlin.reflect.x.internal.l0.b.q.i iVar = kotlin.reflect.x.internal.l0.b.q.i.a;
        if (iVar.i(i3)) {
            m0 m = m();
            kotlin.jvm.internal.l.e(m, "cloneableType");
            l2 = kotlin.collections.t.l(m, this.f19791e);
            return l2;
        }
        if (iVar.j(i3)) {
            e2 = s.e(this.f19791e);
            return e2;
        }
        i2 = kotlin.collections.t.i();
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.x.internal.l0.f.f> e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Set<kotlin.reflect.x.internal.l0.f.f> d2;
        kotlin.reflect.x.internal.l0.d.a.l0.l.g D0;
        Set<kotlin.reflect.x.internal.l0.f.f> b2;
        Set<kotlin.reflect.x.internal.l0.f.f> d3;
        kotlin.jvm.internal.l.f(eVar, "classDescriptor");
        if (!s().b()) {
            d3 = u0.d();
            return d3;
        }
        kotlin.reflect.x.internal.l0.d.a.l0.l.f p = p(eVar);
        if (p != null && (D0 = p.D0()) != null && (b2 = D0.b()) != null) {
            return b2;
        }
        d2 = u0.d();
        return d2;
    }
}
