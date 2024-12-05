package m4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import j4.AbstractC3081g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.C3122b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m4.AbstractC3419i;
import m4.G;
import m4.Q;
import r2.AbstractC3685e;
import r4.C3688a;
import y2.InterfaceC3983b;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3410b extends n0 {

    /* renamed from: b, reason: collision with root package name */
    private Map f35358b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3419i f35359c;

    /* renamed from: d, reason: collision with root package name */
    private final I f35360d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f35361e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35362f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3983b f35363g;

    /* renamed from: h, reason: collision with root package name */
    private final C3430u f35364h;

    /* renamed from: i, reason: collision with root package name */
    private final q0 f35365i;

    /* renamed from: j, reason: collision with root package name */
    private final C3417g f35366j;

    /* renamed from: k, reason: collision with root package name */
    private final S f35367k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f35368l;

    /* renamed from: m, reason: collision with root package name */
    private final C3415e f35369m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f35370n;

    /* renamed from: o, reason: collision with root package name */
    private Boolean f35371o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3349K f35372p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f35373q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f35374r;

    /* renamed from: s, reason: collision with root package name */
    private final C3408a f35375s;

    /* renamed from: m4.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.p {
        a() {
            super(4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
        
            if (((m4.AbstractC3419i.b) r6.f35376a.f35359c).b(r7, r6.f35376a.f35360d) != false) goto L22;
         */
        @Override // X5.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List invoke(java.lang.String r7, java.util.List r8, L5.I r9, L5.I r10) {
            /*
                r6 = this;
                r9 = 2
                r10 = 1
                r0 = 0
                java.lang.String r1 = "otherFields"
                kotlin.jvm.internal.AbstractC3159y.i(r8, r1)
                m4.b r1 = m4.C3410b.this
                m4.q0 r1 = m4.C3410b.o(r1)
                m4.b r2 = m4.C3410b.this
                m4.u r2 = r2.t()
                m4.b r3 = m4.C3410b.this
                boolean r3 = m4.C3410b.m(r3)
                r4 = 0
                if (r3 != 0) goto L1e
                goto L1f
            L1e:
                r2 = r4
            L1f:
                m4.b r3 = m4.C3410b.this
                m4.g r3 = m4.C3410b.i(r3)
                r5 = 3
                m4.o0[] r5 = new m4.o0[r5]
                r5[r0] = r1
                r5[r10] = r2
                r5[r9] = r3
                java.util.List r1 = M5.AbstractC1246t.r(r5)
                m4.b r2 = m4.C3410b.this
                m4.q0 r2 = m4.C3410b.o(r2)
                m4.b r3 = m4.C3410b.this
                m4.u r3 = r3.t()
                m4.b r5 = m4.C3410b.this
                boolean r5 = m4.C3410b.m(r5)
                if (r5 != 0) goto L47
                goto L48
            L47:
                r3 = r4
            L48:
                m4.o0[] r9 = new m4.o0[r9]
                r9[r0] = r2
                r9[r10] = r3
                java.util.List r9 = M5.AbstractC1246t.r(r9)
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.List r9 = M5.AbstractC1246t.G0(r9, r8)
                m4.b r10 = m4.C3410b.this
                m4.i r10 = m4.C3410b.j(r10)
                boolean r0 = r10 instanceof m4.AbstractC3419i.b
                if (r0 == 0) goto L79
                m4.b r8 = m4.C3410b.this
                m4.i r8 = m4.C3410b.j(r8)
                m4.i$b r8 = (m4.AbstractC3419i.b) r8
                m4.b r10 = m4.C3410b.this
                m4.I r10 = m4.C3410b.q(r10)
                boolean r7 = r8.b(r7, r10)
                if (r7 == 0) goto L7d
                goto L98
            L79:
                boolean r7 = r10 instanceof m4.AbstractC3419i.c
                if (r7 == 0) goto L7f
            L7d:
                r1 = r9
                goto L98
            L7f:
                m4.b r7 = m4.C3410b.this
                m4.u r7 = r7.t()
                m4.b r9 = m4.C3410b.this
                boolean r9 = m4.C3410b.m(r9)
                if (r9 != 0) goto L8e
                r4 = r7
            L8e:
                java.util.List r7 = M5.AbstractC1246t.q(r4)
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.List r1 = M5.AbstractC1246t.G0(r7, r8)
            L98:
                m4.b r7 = m4.C3410b.this
                m4.i r7 = m4.C3410b.j(r7)
                m4.W r7 = r7.i()
                m4.W r8 = m4.W.f35290b
                if (r7 == r8) goto Lb2
                java.util.Collection r1 = (java.util.Collection) r1
                m4.b r7 = m4.C3410b.this
                m4.S r7 = r7.u()
                java.util.List r1 = M5.AbstractC1246t.H0(r1, r7)
            Lb2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.C3410b.a.invoke(java.lang.String, java.util.List, L5.I, L5.I):java.util.List");
        }
    }

    /* renamed from: m4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0806b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0806b f35377a = new C0806b();

        /* renamed from: m4.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35378a;

            /* renamed from: m4.b$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0807a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f[] f35379a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0807a(InterfaceC3358f[] interfaceC3358fArr) {
                    super(0);
                    this.f35379a = interfaceC3358fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f35379a.length];
                }
            }

            /* renamed from: m4.b$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0808b extends kotlin.coroutines.jvm.internal.l implements X5.o {

                /* renamed from: a, reason: collision with root package name */
                int f35380a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f35381b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f35382c;

                public C0808b(P5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f35380a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35381b;
                        List z8 = AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f35382c)));
                        this.f35380a = 1;
                        if (interfaceC3359g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6487a;
                }

                @Override // X5.o
                public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                    C0808b c0808b = new C0808b(dVar);
                    c0808b.f35381b = interfaceC3359g;
                    c0808b.f35382c = objArr;
                    return c0808b.invokeSuspend(L5.I.f6487a);
                }
            }

            public a(InterfaceC3358f[] interfaceC3358fArr) {
                this.f35378a = interfaceC3358fArr;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                InterfaceC3358f[] interfaceC3358fArr = this.f35378a;
                Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0807a(interfaceC3358fArr), new C0808b(null), dVar);
                if (a8 == Q5.b.e()) {
                    return a8;
                }
                return L5.I.f6487a;
            }
        }

        /* renamed from: m4.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0809b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f35383a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0809b(List list) {
                super(0);
                this.f35383a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f35383a;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3349K) it.next()).getValue());
                }
                return AbstractC1246t.z(AbstractC1246t.W0(arrayList));
            }
        }

        C0806b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(List fieldElements) {
            InterfaceC3358f aVar;
            AbstractC3159y.i(fieldElements, "fieldElements");
            List list = fieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = v4.g.n(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m())));
            } else {
                aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
            }
            return new v4.e(aVar, new C0809b(arrayList));
        }
    }

    /* renamed from: m4.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f35385b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f35386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e0 e0Var, Map map) {
            super(2);
            this.f35385b = e0Var;
            this.f35386c = map;
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.I invoke(String str, List values) {
            String str2;
            AbstractC3159y.i(values, "values");
            if (str != null) {
                C3410b.this.f35368l.put(G.Companion.l(), str);
            }
            Map map = C3410b.this.f35368l;
            List<L5.r> list = values;
            LinkedHashMap linkedHashMap = new LinkedHashMap(d6.m.d(M5.Q.d(AbstractC1246t.x(list, 10)), 16));
            for (L5.r rVar : list) {
                L5.r rVar2 = new L5.r(rVar.c(), ((C3688a) rVar.d()).c());
                linkedHashMap.put(rVar2.c(), rVar2.d());
            }
            map.putAll(linkedHashMap);
            Map map2 = C3410b.this.f35368l;
            Map map3 = this.f35386c;
            boolean z8 = true;
            if (!map2.isEmpty()) {
                Iterator it = map2.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (map3 == null || (str2 = (String) map3.get(entry.getKey())) == null) {
                        str2 = "";
                    }
                    if (!AbstractC3159y.d(str2, entry.getValue())) {
                        z8 = false;
                        break;
                    }
                }
            }
            C3410b.this.f35371o = Boolean.valueOf(z8);
            e0 e0Var = this.f35385b;
            if (e0Var != null) {
                e0Var.h(M5.Q.e(L5.x.a(e0Var.a(), String.valueOf(z8))));
                return L5.I.f6487a;
            }
            return null;
        }
    }

    /* renamed from: m4.b$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f35387a = new d();

        /* renamed from: m4.b$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35388a;

            /* renamed from: m4.b$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0810a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f[] f35389a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0810a(InterfaceC3358f[] interfaceC3358fArr) {
                    super(0);
                    this.f35389a = interfaceC3358fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f35389a.length];
                }
            }

            /* renamed from: m4.b$d$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0811b extends kotlin.coroutines.jvm.internal.l implements X5.o {

                /* renamed from: a, reason: collision with root package name */
                int f35390a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f35391b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f35392c;

                public C0811b(P5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f35390a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35391b;
                        List z8 = AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f35392c)));
                        this.f35390a = 1;
                        if (interfaceC3359g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6487a;
                }

                @Override // X5.o
                public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                    C0811b c0811b = new C0811b(dVar);
                    c0811b.f35391b = interfaceC3359g;
                    c0811b.f35392c = objArr;
                    return c0811b.invokeSuspend(L5.I.f6487a);
                }
            }

            public a(InterfaceC3358f[] interfaceC3358fArr) {
                this.f35388a = interfaceC3358fArr;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                InterfaceC3358f[] interfaceC3358fArr = this.f35388a;
                Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0810a(interfaceC3358fArr), new C0811b(null), dVar);
                if (a8 == Q5.b.e()) {
                    return a8;
                }
                return L5.I.f6487a;
            }
        }

        /* renamed from: m4.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0812b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f35393a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0812b(List list) {
                super(0);
                this.f35393a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f35393a;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3349K) it.next()).getValue());
                }
                return AbstractC1246t.z(AbstractC1246t.W0(arrayList));
            }
        }

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(List fieldElements) {
            InterfaceC3358f aVar;
            AbstractC3159y.i(fieldElements, "fieldElements");
            List list = fieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = v4.g.n(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m())));
            } else {
                aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
            }
            return new v4.e(aVar, new C0812b(arrayList));
        }
    }

    /* renamed from: m4.b$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f35394a = new e();

        /* renamed from: m4.b$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35395a;

            /* renamed from: m4.b$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0813a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f[] f35396a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0813a(InterfaceC3358f[] interfaceC3358fArr) {
                    super(0);
                    this.f35396a = interfaceC3358fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f35396a.length];
                }
            }

            /* renamed from: m4.b$e$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0814b extends kotlin.coroutines.jvm.internal.l implements X5.o {

                /* renamed from: a, reason: collision with root package name */
                int f35397a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f35398b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f35399c;

                public C0814b(P5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f35397a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35398b;
                        List z8 = AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f35399c)));
                        this.f35397a = 1;
                        if (interfaceC3359g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6487a;
                }

                @Override // X5.o
                public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                    C0814b c0814b = new C0814b(dVar);
                    c0814b.f35398b = interfaceC3359g;
                    c0814b.f35399c = objArr;
                    return c0814b.invokeSuspend(L5.I.f6487a);
                }
            }

            public a(InterfaceC3358f[] interfaceC3358fArr) {
                this.f35395a = interfaceC3358fArr;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                InterfaceC3358f[] interfaceC3358fArr = this.f35395a;
                Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0813a(interfaceC3358fArr), new C0814b(null), dVar);
                if (a8 == Q5.b.e()) {
                    return a8;
                }
                return L5.I.f6487a;
            }
        }

        /* renamed from: m4.b$e$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0815b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f35400a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0815b(List list) {
                super(0);
                this.f35400a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f35400a;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3349K) it.next()).getValue());
                }
                return AbstractC1246t.z(AbstractC1246t.W0(arrayList));
            }
        }

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(List it) {
            InterfaceC3358f aVar;
            AbstractC3159y.i(it, "it");
            List list = it;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((k0) it2.next()).e());
            }
            if (arrayList.isEmpty()) {
                aVar = v4.g.n(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m())));
            } else {
                aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
            }
            return new v4.e(aVar, new C0815b(arrayList));
        }
    }

    /* renamed from: m4.b$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function1 {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(String str) {
            if (str != null) {
                C3410b.this.u().i().y().r(str);
            }
            List a8 = C3410b.this.f35369m.a(str);
            if (a8 == null) {
                a8 = AbstractC1246t.m();
            }
            List<k0> list = a8;
            C3410b c3410b = C3410b.this;
            for (k0 k0Var : list) {
                AbstractC3412c.b(k0Var, str, c3410b.f35359c, c3410b.f35360d);
                k0Var.h(c3410b.f35358b);
            }
            return list;
        }
    }

    /* renamed from: m4.b$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f35403b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Map map) {
            super(2);
            this.f35403b = map;
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.I invoke(List fields, Boolean bool) {
            String str;
            AbstractC3159y.i(fields, "fields");
            if (!AbstractC3159y.d(bool, C3410b.this.f35371o)) {
                C3410b.this.f35371o = bool;
            } else {
                bool = null;
            }
            C3430u t8 = C3410b.this.t();
            if (C3410b.this.f35361e) {
                t8 = null;
            }
            List G02 = AbstractC1246t.G0(AbstractC1246t.q(t8), fields);
            if (bool == null) {
                return null;
            }
            Map map = this.f35403b;
            C3410b c3410b = C3410b.this;
            if (!bool.booleanValue()) {
                Map map2 = c3410b.f35368l;
                map = new LinkedHashMap(M5.Q.d(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    if (AbstractC3159y.d(entry.getKey(), G.Companion.l())) {
                        str = (String) entry.getValue();
                    } else {
                        str = (String) c3410b.f35358b.get(entry.getKey());
                        if (str == null) {
                            str = "";
                        }
                    }
                    map.put(key, str);
                }
            } else if (map == null) {
                map = M5.Q.h();
            }
            Iterator it = G02.iterator();
            while (it.hasNext()) {
                ((k0) it.next()).h(map);
            }
            return L5.I.f6487a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C3410b(m4.G r16, java.util.Map r17, m4.AbstractC3419i r18, java.util.Set r19, m4.C3434y r20, m4.e0 r21, java.util.Map r22, m4.I r23, boolean r24, int r25, kotlin.jvm.internal.AbstractC3151p r26) {
        /*
            r15 = this;
            r0 = r25
            r1 = r0 & 2
            if (r1 == 0) goto Lc
            java.util.Map r1 = M5.Q.h()
            r4 = r1
            goto Le
        Lc:
            r4 = r17
        Le:
            r1 = r0 & 4
            if (r1 == 0) goto L1b
            m4.i$a r1 = new m4.i$a
            r2 = 1
            r3 = 0
            r1.<init>(r3, r2, r3)
            r5 = r1
            goto L1d
        L1b:
            r5 = r18
        L1d:
            r1 = r0 & 8
            if (r1 == 0) goto L26
            java.util.Set r1 = M5.a0.f()
            goto L28
        L26:
            r1 = r19
        L28:
            r2 = r0 & 16
            if (r2 == 0) goto L4e
            m4.y r2 = new m4.y
            m4.t r3 = new m4.t
            r13 = 62
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r6 = r3
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            m4.G$b r6 = m4.G.Companion
            m4.G r6 = r6.l()
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.<init>(r3, r6)
            r7 = r2
            goto L50
        L4e:
            r7 = r20
        L50:
            r2 = r0 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L5b
            m4.w r2 = new m4.w
            r2.<init>()
            r10 = r2
            goto L5d
        L5b:
            r10 = r23
        L5d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L64
            r0 = 0
            r11 = 0
            goto L66
        L64:
            r11 = r24
        L66:
            r2 = r15
            r3 = r16
            r6 = r1
            r8 = r21
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C3410b.<init>(m4.G, java.util.Map, m4.i, java.util.Set, m4.y, m4.e0, java.util.Map, m4.I, boolean, int, kotlin.jvm.internal.p):void");
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35363g;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35362f;
    }

    @Override // m4.k0
    public InterfaceC3349K d() {
        return v4.g.l(this.f35374r, d.f35387a);
    }

    @Override // m4.k0
    public InterfaceC3349K e() {
        return v4.g.l(this.f35374r, e.f35394a);
    }

    @Override // m4.k0
    public m0 f() {
        return this.f35375s;
    }

    @Override // m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
        this.f35358b = rawValuesMap;
    }

    public final C3408a s() {
        return this.f35375s;
    }

    public final C3430u t() {
        return this.f35364h;
    }

    public final S u() {
        return this.f35367k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3410b(G _identifier, Map rawValuesMap, AbstractC3419i addressType, Set countryCodes, C3434y countryDropdownFieldController, e0 e0Var, Map map, I isPlacesAvailable, boolean z8) {
        super(_identifier);
        d0 i8;
        InterfaceC3349K w8;
        AbstractC3159y.i(_identifier, "_identifier");
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
        AbstractC3159y.i(addressType, "addressType");
        AbstractC3159y.i(countryCodes, "countryCodes");
        AbstractC3159y.i(countryDropdownFieldController, "countryDropdownFieldController");
        AbstractC3159y.i(isPlacesAvailable, "isPlacesAvailable");
        this.f35358b = rawValuesMap;
        this.f35359c = addressType;
        this.f35360d = isPlacesAvailable;
        this.f35361e = z8;
        this.f35362f = true;
        G.b bVar = G.Companion;
        C3430u c3430u = new C3430u(bVar.l(), countryDropdownFieldController);
        this.f35364h = c3430u;
        this.f35365i = new q0(bVar.r(), new s0(new r0(Integer.valueOf(AbstractC3685e.f37578e), 0, 0, null, 14, null), false, (String) this.f35358b.get(bVar.r()), 2, null));
        G s8 = bVar.s();
        r0 r0Var = new r0(Integer.valueOf(AbstractC3081g.f33188a), 0, 0, null, 14, null);
        AbstractC3419i.b bVar2 = addressType instanceof AbstractC3419i.b ? (AbstractC3419i.b) addressType : null;
        this.f35366j = new C3417g(s8, r0Var, bVar2 != null ? bVar2.e() : null);
        G t8 = bVar.t();
        Q.a aVar = Q.f35194r;
        String str = (String) this.f35358b.get(bVar.t());
        this.f35367k = new S(t8, Q.a.b(aVar, str == null ? "" : str, null, null, addressType.i() == W.f35291c, true, 6, null));
        this.f35368l = new LinkedHashMap();
        this.f35369m = new C3415e(C3122b.f33452a);
        InterfaceC3349K m8 = v4.g.m(c3430u.i().y(), new f());
        this.f35370n = m8;
        InterfaceC3349K d8 = v4.g.d(m8, (e0Var == null || (i8 = e0Var.i()) == null || (w8 = i8.w()) == null) ? v4.g.n(null) : w8, new g(map));
        this.f35372p = d8;
        InterfaceC3349K d9 = v4.g.d(c3430u.i().y(), v4.g.l(m8, C0806b.f35377a), new c(e0Var, map));
        this.f35373q = d9;
        InterfaceC3349K f8 = v4.g.f(c3430u.i().y(), m8, d8, d9, new a());
        this.f35374r = f8;
        this.f35375s = new C3408a(f8);
    }
}
