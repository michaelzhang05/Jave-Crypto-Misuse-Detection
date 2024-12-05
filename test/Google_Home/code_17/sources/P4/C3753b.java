package p4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3435g;
import n4.C3477b;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import p4.AbstractC3762i;
import p4.G;
import p4.Q;
import u2.AbstractC4058e;
import u4.C4061a;

/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3753b extends n0 {

    /* renamed from: b, reason: collision with root package name */
    private Map f37384b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3762i f37385c;

    /* renamed from: d, reason: collision with root package name */
    private final I f37386d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37387e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f37388f;

    /* renamed from: g, reason: collision with root package name */
    private final B2.b f37389g;

    /* renamed from: h, reason: collision with root package name */
    private final C3773u f37390h;

    /* renamed from: i, reason: collision with root package name */
    private final q0 f37391i;

    /* renamed from: j, reason: collision with root package name */
    private final C3760g f37392j;

    /* renamed from: k, reason: collision with root package name */
    private final S f37393k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f37394l;

    /* renamed from: m, reason: collision with root package name */
    private final C3758e f37395m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3698L f37396n;

    /* renamed from: o, reason: collision with root package name */
    private Boolean f37397o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3698L f37398p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f37399q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3698L f37400r;

    /* renamed from: s, reason: collision with root package name */
    private final C3751a f37401s;

    /* renamed from: p4.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1670p {
        a() {
            super(4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
        
            if (((p4.AbstractC3762i.b) r6.f37402a.f37385c).a(r7, r6.f37402a.f37386d) != false) goto L22;
         */
        @Override // a6.InterfaceC1670p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List invoke(java.lang.String r7, java.util.List r8, O5.I r9, O5.I r10) {
            /*
                r6 = this;
                r9 = 2
                r10 = 1
                r0 = 0
                java.lang.String r1 = "otherFields"
                kotlin.jvm.internal.AbstractC3255y.i(r8, r1)
                p4.b r1 = p4.C3753b.this
                p4.q0 r1 = p4.C3753b.o(r1)
                p4.b r2 = p4.C3753b.this
                p4.u r2 = r2.t()
                p4.b r3 = p4.C3753b.this
                boolean r3 = p4.C3753b.m(r3)
                r4 = 0
                if (r3 != 0) goto L1e
                goto L1f
            L1e:
                r2 = r4
            L1f:
                p4.b r3 = p4.C3753b.this
                p4.g r3 = p4.C3753b.i(r3)
                r5 = 3
                p4.o0[] r5 = new p4.o0[r5]
                r5[r0] = r1
                r5[r10] = r2
                r5[r9] = r3
                java.util.List r1 = P5.AbstractC1378t.r(r5)
                p4.b r2 = p4.C3753b.this
                p4.q0 r2 = p4.C3753b.o(r2)
                p4.b r3 = p4.C3753b.this
                p4.u r3 = r3.t()
                p4.b r5 = p4.C3753b.this
                boolean r5 = p4.C3753b.m(r5)
                if (r5 != 0) goto L47
                goto L48
            L47:
                r3 = r4
            L48:
                p4.o0[] r9 = new p4.o0[r9]
                r9[r0] = r2
                r9[r10] = r3
                java.util.List r9 = P5.AbstractC1378t.r(r9)
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.List r9 = P5.AbstractC1378t.G0(r9, r8)
                p4.b r10 = p4.C3753b.this
                p4.i r10 = p4.C3753b.j(r10)
                boolean r0 = r10 instanceof p4.AbstractC3762i.b
                if (r0 == 0) goto L79
                p4.b r8 = p4.C3753b.this
                p4.i r8 = p4.C3753b.j(r8)
                p4.i$b r8 = (p4.AbstractC3762i.b) r8
                p4.b r10 = p4.C3753b.this
                p4.I r10 = p4.C3753b.q(r10)
                boolean r7 = r8.a(r7, r10)
                if (r7 == 0) goto L7d
                goto L98
            L79:
                boolean r7 = r10 instanceof p4.AbstractC3762i.c
                if (r7 == 0) goto L7f
            L7d:
                r1 = r9
                goto L98
            L7f:
                p4.b r7 = p4.C3753b.this
                p4.u r7 = r7.t()
                p4.b r9 = p4.C3753b.this
                boolean r9 = p4.C3753b.m(r9)
                if (r9 != 0) goto L8e
                r4 = r7
            L8e:
                java.util.List r7 = P5.AbstractC1378t.q(r4)
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.List r1 = P5.AbstractC1378t.G0(r7, r8)
            L98:
                p4.b r7 = p4.C3753b.this
                p4.i r7 = p4.C3753b.j(r7)
                p4.W r7 = r7.i()
                p4.W r8 = p4.W.f37316b
                if (r7 == r8) goto Lb2
                java.util.Collection r1 = (java.util.Collection) r1
                p4.b r7 = p4.C3753b.this
                p4.S r7 = r7.u()
                java.util.List r1 = P5.AbstractC1378t.H0(r1, r7)
            Lb2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.C3753b.a.invoke(java.lang.String, java.util.List, O5.I, O5.I):java.util.List");
        }
    }

    /* renamed from: p4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0836b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0836b f37403a = new C0836b();

        /* renamed from: p4.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37404a;

            /* renamed from: p4.b$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0837a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f[] f37405a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0837a(InterfaceC3706f[] interfaceC3706fArr) {
                    super(0);
                    this.f37405a = interfaceC3706fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f37405a.length];
                }
            }

            /* renamed from: p4.b$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0838b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                int f37406a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f37407b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f37408c;

                public C0838b(S5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f37406a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37407b;
                        List z8 = AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f37408c)));
                        this.f37406a = 1;
                        if (interfaceC3707g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1669o
                public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                    C0838b c0838b = new C0838b(dVar);
                    c0838b.f37407b = interfaceC3707g;
                    c0838b.f37408c = objArr;
                    return c0838b.invokeSuspend(O5.I.f8278a);
                }
            }

            public a(InterfaceC3706f[] interfaceC3706fArr) {
                this.f37404a = interfaceC3706fArr;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                InterfaceC3706f[] interfaceC3706fArr = this.f37404a;
                Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0837a(interfaceC3706fArr), new C0838b(null), dVar);
                if (a8 == T5.b.e()) {
                    return a8;
                }
                return O5.I.f8278a;
            }
        }

        /* renamed from: p4.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0839b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f37409a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0839b(List list) {
                super(0);
                this.f37409a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f37409a;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3698L) it.next()).getValue());
                }
                return AbstractC1378t.z(AbstractC1378t.W0(arrayList));
            }
        }

        C0836b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(List fieldElements) {
            InterfaceC3706f aVar;
            AbstractC3255y.i(fieldElements, "fieldElements");
            List list = fieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = y4.g.n(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m())));
            } else {
                aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
            }
            return new y4.e(aVar, new C0839b(arrayList));
        }
    }

    /* renamed from: p4.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f37411b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f37412c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e0 e0Var, Map map) {
            super(2);
            this.f37411b = e0Var;
            this.f37412c = map;
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.I invoke(String str, List values) {
            String str2;
            AbstractC3255y.i(values, "values");
            if (str != null) {
                C3753b.this.f37394l.put(G.Companion.l(), str);
            }
            Map map = C3753b.this.f37394l;
            List<O5.r> list = values;
            LinkedHashMap linkedHashMap = new LinkedHashMap(g6.m.d(P5.Q.d(AbstractC1378t.x(list, 10)), 16));
            for (O5.r rVar : list) {
                O5.r rVar2 = new O5.r(rVar.c(), ((C4061a) rVar.d()).c());
                linkedHashMap.put(rVar2.c(), rVar2.d());
            }
            map.putAll(linkedHashMap);
            Map map2 = C3753b.this.f37394l;
            Map map3 = this.f37412c;
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
                    if (!AbstractC3255y.d(str2, entry.getValue())) {
                        z8 = false;
                        break;
                    }
                }
            }
            C3753b.this.f37397o = Boolean.valueOf(z8);
            e0 e0Var = this.f37411b;
            if (e0Var != null) {
                e0Var.h(P5.Q.e(O5.x.a(e0Var.a(), String.valueOf(z8))));
                return O5.I.f8278a;
            }
            return null;
        }
    }

    /* renamed from: p4.b$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f37413a = new d();

        /* renamed from: p4.b$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37414a;

            /* renamed from: p4.b$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0840a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f[] f37415a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0840a(InterfaceC3706f[] interfaceC3706fArr) {
                    super(0);
                    this.f37415a = interfaceC3706fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f37415a.length];
                }
            }

            /* renamed from: p4.b$d$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0841b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                int f37416a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f37417b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f37418c;

                public C0841b(S5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f37416a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37417b;
                        List z8 = AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f37418c)));
                        this.f37416a = 1;
                        if (interfaceC3707g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1669o
                public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                    C0841b c0841b = new C0841b(dVar);
                    c0841b.f37417b = interfaceC3707g;
                    c0841b.f37418c = objArr;
                    return c0841b.invokeSuspend(O5.I.f8278a);
                }
            }

            public a(InterfaceC3706f[] interfaceC3706fArr) {
                this.f37414a = interfaceC3706fArr;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                InterfaceC3706f[] interfaceC3706fArr = this.f37414a;
                Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0840a(interfaceC3706fArr), new C0841b(null), dVar);
                if (a8 == T5.b.e()) {
                    return a8;
                }
                return O5.I.f8278a;
            }
        }

        /* renamed from: p4.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0842b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f37419a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0842b(List list) {
                super(0);
                this.f37419a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f37419a;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3698L) it.next()).getValue());
                }
                return AbstractC1378t.z(AbstractC1378t.W0(arrayList));
            }
        }

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(List fieldElements) {
            InterfaceC3706f aVar;
            AbstractC3255y.i(fieldElements, "fieldElements");
            List list = fieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = y4.g.n(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m())));
            } else {
                aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
            }
            return new y4.e(aVar, new C0842b(arrayList));
        }
    }

    /* renamed from: p4.b$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f37420a = new e();

        /* renamed from: p4.b$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37421a;

            /* renamed from: p4.b$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0843a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f[] f37422a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0843a(InterfaceC3706f[] interfaceC3706fArr) {
                    super(0);
                    this.f37422a = interfaceC3706fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f37422a.length];
                }
            }

            /* renamed from: p4.b$e$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0844b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                int f37423a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f37424b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f37425c;

                public C0844b(S5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f37423a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37424b;
                        List z8 = AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f37425c)));
                        this.f37423a = 1;
                        if (interfaceC3707g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1669o
                public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                    C0844b c0844b = new C0844b(dVar);
                    c0844b.f37424b = interfaceC3707g;
                    c0844b.f37425c = objArr;
                    return c0844b.invokeSuspend(O5.I.f8278a);
                }
            }

            public a(InterfaceC3706f[] interfaceC3706fArr) {
                this.f37421a = interfaceC3706fArr;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                InterfaceC3706f[] interfaceC3706fArr = this.f37421a;
                Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0843a(interfaceC3706fArr), new C0844b(null), dVar);
                if (a8 == T5.b.e()) {
                    return a8;
                }
                return O5.I.f8278a;
            }
        }

        /* renamed from: p4.b$e$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0845b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f37426a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0845b(List list) {
                super(0);
                this.f37426a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f37426a;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3698L) it.next()).getValue());
                }
                return AbstractC1378t.z(AbstractC1378t.W0(arrayList));
            }
        }

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(List it) {
            InterfaceC3706f aVar;
            AbstractC3255y.i(it, "it");
            List list = it;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((k0) it2.next()).e());
            }
            if (arrayList.isEmpty()) {
                aVar = y4.g.n(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m())));
            } else {
                aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
            }
            return new y4.e(aVar, new C0845b(arrayList));
        }
    }

    /* renamed from: p4.b$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function1 {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(String str) {
            if (str != null) {
                C3753b.this.u().i().y().r(str);
            }
            List a8 = C3753b.this.f37395m.a(str);
            if (a8 == null) {
                a8 = AbstractC1378t.m();
            }
            List<k0> list = a8;
            C3753b c3753b = C3753b.this;
            for (k0 k0Var : list) {
                AbstractC3755c.b(k0Var, str, c3753b.f37385c, c3753b.f37386d);
                k0Var.h(c3753b.f37384b);
            }
            return list;
        }
    }

    /* renamed from: p4.b$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f37429b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Map map) {
            super(2);
            this.f37429b = map;
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.I invoke(List fields, Boolean bool) {
            String str;
            AbstractC3255y.i(fields, "fields");
            if (!AbstractC3255y.d(bool, C3753b.this.f37397o)) {
                C3753b.this.f37397o = bool;
            } else {
                bool = null;
            }
            C3773u t8 = C3753b.this.t();
            if (C3753b.this.f37387e) {
                t8 = null;
            }
            List G02 = AbstractC1378t.G0(AbstractC1378t.q(t8), fields);
            if (bool == null) {
                return null;
            }
            Map map = this.f37429b;
            C3753b c3753b = C3753b.this;
            if (!bool.booleanValue()) {
                Map map2 = c3753b.f37394l;
                map = new LinkedHashMap(P5.Q.d(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    if (AbstractC3255y.d(entry.getKey(), G.Companion.l())) {
                        str = (String) entry.getValue();
                    } else {
                        str = (String) c3753b.f37384b.get(entry.getKey());
                        if (str == null) {
                            str = "";
                        }
                    }
                    map.put(key, str);
                }
            } else if (map == null) {
                map = P5.Q.h();
            }
            Iterator it = G02.iterator();
            while (it.hasNext()) {
                ((k0) it.next()).h(map);
            }
            return O5.I.f8278a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C3753b(p4.G r16, java.util.Map r17, p4.AbstractC3762i r18, java.util.Set r19, p4.C3777y r20, p4.e0 r21, java.util.Map r22, p4.I r23, boolean r24, int r25, kotlin.jvm.internal.AbstractC3247p r26) {
        /*
            r15 = this;
            r0 = r25
            r1 = r0 & 2
            if (r1 == 0) goto Lc
            java.util.Map r1 = P5.Q.h()
            r4 = r1
            goto Le
        Lc:
            r4 = r17
        Le:
            r1 = r0 & 4
            if (r1 == 0) goto L1b
            p4.i$a r1 = new p4.i$a
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
            java.util.Set r1 = P5.a0.f()
            goto L28
        L26:
            r1 = r19
        L28:
            r2 = r0 & 16
            if (r2 == 0) goto L4e
            p4.y r2 = new p4.y
            p4.t r3 = new p4.t
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
            p4.G$b r6 = p4.G.Companion
            p4.G r6 = r6.l()
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
            p4.w r2 = new p4.w
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
        throw new UnsupportedOperationException("Method not decompiled: p4.C3753b.<init>(p4.G, java.util.Map, p4.i, java.util.Set, p4.y, p4.e0, java.util.Map, p4.I, boolean, int, kotlin.jvm.internal.p):void");
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f37389g;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f37388f;
    }

    @Override // p4.k0
    public InterfaceC3698L d() {
        return y4.g.l(this.f37400r, d.f37413a);
    }

    @Override // p4.k0
    public InterfaceC3698L e() {
        return y4.g.l(this.f37400r, e.f37420a);
    }

    @Override // p4.k0
    public m0 f() {
        return this.f37401s;
    }

    @Override // p4.k0
    public void h(Map rawValuesMap) {
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
        this.f37384b = rawValuesMap;
    }

    public final C3751a s() {
        return this.f37401s;
    }

    public final C3773u t() {
        return this.f37390h;
    }

    public final S u() {
        return this.f37393k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3753b(G _identifier, Map rawValuesMap, AbstractC3762i addressType, Set countryCodes, C3777y countryDropdownFieldController, e0 e0Var, Map map, I isPlacesAvailable, boolean z8) {
        super(_identifier);
        d0 i8;
        InterfaceC3698L w8;
        AbstractC3255y.i(_identifier, "_identifier");
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
        AbstractC3255y.i(addressType, "addressType");
        AbstractC3255y.i(countryCodes, "countryCodes");
        AbstractC3255y.i(countryDropdownFieldController, "countryDropdownFieldController");
        AbstractC3255y.i(isPlacesAvailable, "isPlacesAvailable");
        this.f37384b = rawValuesMap;
        this.f37385c = addressType;
        this.f37386d = isPlacesAvailable;
        this.f37387e = z8;
        this.f37388f = true;
        G.b bVar = G.Companion;
        C3773u c3773u = new C3773u(bVar.l(), countryDropdownFieldController);
        this.f37390h = c3773u;
        this.f37391i = new q0(bVar.r(), new s0(new r0(Integer.valueOf(AbstractC4058e.f39958e), 0, 0, null, 14, null), false, (String) this.f37384b.get(bVar.r()), 2, null));
        G s8 = bVar.s();
        r0 r0Var = new r0(Integer.valueOf(AbstractC3435g.f35164a), 0, 0, null, 14, null);
        AbstractC3762i.b bVar2 = addressType instanceof AbstractC3762i.b ? (AbstractC3762i.b) addressType : null;
        this.f37392j = new C3760g(s8, r0Var, bVar2 != null ? bVar2.g() : null);
        G t8 = bVar.t();
        Q.a aVar = Q.f37220r;
        String str = (String) this.f37384b.get(bVar.t());
        this.f37393k = new S(t8, Q.a.b(aVar, str == null ? "" : str, null, null, addressType.i() == W.f37317c, true, 6, null));
        this.f37394l = new LinkedHashMap();
        this.f37395m = new C3758e(C3477b.f35444a);
        InterfaceC3698L m8 = y4.g.m(c3773u.i().y(), new f());
        this.f37396n = m8;
        InterfaceC3698L d8 = y4.g.d(m8, (e0Var == null || (i8 = e0Var.i()) == null || (w8 = i8.w()) == null) ? y4.g.n(null) : w8, new g(map));
        this.f37398p = d8;
        InterfaceC3698L d9 = y4.g.d(c3773u.i().y(), y4.g.l(m8, C0836b.f37403a), new c(e0Var, map));
        this.f37399q = d9;
        InterfaceC3698L f8 = y4.g.f(c3773u.i().y(), m8, d8, d9, new a());
        this.f37400r = f8;
        this.f37401s = new C3751a(f8);
    }
}
