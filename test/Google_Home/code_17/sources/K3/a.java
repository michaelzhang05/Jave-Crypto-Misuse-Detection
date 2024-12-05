package K3;

import A2.j;
import K3.c;
import K3.d;
import O5.I;
import O5.s;
import O5.t;
import P5.AbstractC1378t;
import P5.a0;
import a6.InterfaceC1668n;
import com.stripe.android.model.o;
import e3.EnumC2791e;
import g3.AbstractC2878a;
import h3.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3354f;
import l6.AbstractC3364k;
import l6.M;
import l6.U;
import m2.r;
import n3.i;
import u2.InterfaceC4057d;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public final class a implements K3.c {

    /* renamed from: a, reason: collision with root package name */
    private final m f5047a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f5048b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4057d f5049c;

    /* renamed from: d, reason: collision with root package name */
    private final i f5050d;

    /* renamed from: e, reason: collision with root package name */
    private final S5.g f5051e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f5052f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0077a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5053a;

        /* renamed from: b, reason: collision with root package name */
        Object f5054b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f5055c;

        /* renamed from: e, reason: collision with root package name */
        int f5057e;

        C0077a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5055c = obj;
            this.f5057e |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, null, false, this);
            if (c8 == T5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5058a;

        /* renamed from: b, reason: collision with root package name */
        Object f5059b;

        /* renamed from: c, reason: collision with root package name */
        Object f5060c;

        /* renamed from: d, reason: collision with root package name */
        Object f5061d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f5062e;

        /* renamed from: g, reason: collision with root package name */
        int f5064g;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5062e = obj;
            this.f5064g |= Integer.MIN_VALUE;
            Object l8 = a.this.l(null, null, null, this);
            if (l8 == T5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f5065a;

        /* renamed from: b, reason: collision with root package name */
        Object f5066b;

        /* renamed from: c, reason: collision with root package name */
        int f5067c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f5068d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ K3.c f5069e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.a f5070f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f5071g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, K3.c cVar, c.a aVar, List list, S5.d dVar) {
            super(2, dVar);
            this.f5068d = oVar;
            this.f5069e = cVar;
            this.f5070f = aVar;
            this.f5071g = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f5068d, this.f5069e, this.f5070f, this.f5071g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            List list;
            Object e8 = T5.b.e();
            int i8 = this.f5067c;
            if (i8 != 0) {
                if (i8 == 1) {
                    str = (String) this.f5066b;
                    list = (List) this.f5065a;
                    t.b(obj);
                    obj2 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                String str2 = this.f5068d.f25463a;
                if (str2 != null) {
                    K3.c cVar = this.f5069e;
                    c.a aVar = this.f5070f;
                    List list2 = this.f5071g;
                    this.f5065a = list2;
                    this.f5066b = str2;
                    this.f5067c = 1;
                    Object c8 = cVar.c(aVar, str2, false, this);
                    if (c8 == e8) {
                        return e8;
                    }
                    str = str2;
                    obj2 = c8;
                    list = list2;
                } else {
                    return null;
                }
            }
            Throwable e9 = s.e(obj2);
            if (e9 != null) {
                list.add(new d.a(str, e9));
            }
            return s.a(obj2);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5072a;

        /* renamed from: c, reason: collision with root package name */
        int f5074c;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5072a = obj;
            this.f5074c |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, null, false, this);
            if (d8 == T5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f5075a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f5076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f5077c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f5078d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c.a f5079e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5080f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0078a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f5081a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f5082b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c.a f5083c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ o.p f5084d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0078a(a aVar, c.a aVar2, o.p pVar, S5.d dVar) {
                super(2, dVar);
                this.f5082b = aVar;
                this.f5083c = aVar2;
                this.f5084d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0078a(this.f5082b, this.f5083c, this.f5084d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object o8;
                Object e8 = T5.b.e();
                int i8 = this.f5081a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        o8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    m mVar = this.f5082b.f5047a;
                    com.stripe.android.model.l lVar = new com.stripe.android.model.l(this.f5083c.b(), this.f5084d, kotlin.coroutines.jvm.internal.b.c(100), null, null, 24, null);
                    Set set = this.f5082b.f5052f;
                    j.c cVar = new j.c(this.f5083c.a(), ((r) this.f5082b.f5048b.get()).h(), null, 4, null);
                    this.f5081a = 1;
                    o8 = mVar.o(lVar, set, cVar, this);
                    if (o8 == e8) {
                        return e8;
                    }
                }
                a aVar = this.f5082b;
                Throwable e9 = s.e(o8);
                if (e9 != null) {
                    aVar.f5049c.a("Failed to retrieve payment methods.", e9);
                    i.b.a(aVar.f5050d, i.d.f35390d, AbstractC4144k.f40356e.b(e9), null, 4, null);
                }
                a aVar2 = this.f5082b;
                if (s.h(o8)) {
                    i.b.a(aVar2.f5050d, i.e.f35409b, null, null, 6, null);
                }
                return s.a(o8);
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0078a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, a aVar, c.a aVar2, boolean z8, S5.d dVar) {
            super(2, dVar);
            this.f5077c = list;
            this.f5078d = aVar;
            this.f5079e = aVar2;
            this.f5080f = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            e eVar = new e(this.f5077c, this.f5078d, this.f5079e, this.f5080f, dVar);
            eVar.f5076b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            U b8;
            Object e8 = T5.b.e();
            int i8 = this.f5075a;
            if (i8 != 0) {
                if (i8 == 1) {
                    list = (List) this.f5076b;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f5076b;
                List list2 = this.f5077c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (a0.i(o.p.f25587i, o.p.f25577O, o.p.f25591m).contains((o.p) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                a aVar = this.f5078d;
                c.a aVar2 = this.f5079e;
                ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b8 = AbstractC3364k.b(m8, null, null, new C0078a(aVar, aVar2, (o.p) it.next(), null), 3, null);
                    arrayList2.add(b8);
                }
                ArrayList arrayList3 = new ArrayList();
                this.f5076b = arrayList3;
                this.f5075a = 1;
                Object a8 = AbstractC3354f.a(arrayList2, this);
                if (a8 == e8) {
                    return e8;
                }
                list = arrayList3;
                obj = a8;
            }
            a aVar3 = this.f5078d;
            boolean z8 = this.f5080f;
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                Object j8 = ((s) it2.next()).j();
                Throwable e9 = s.e(j8);
                if (e9 == null) {
                    list.addAll(aVar3.m((List) j8));
                } else if (!z8) {
                    return s.a(s.b(t.a(e9)));
                }
            }
            return s.a(s.b(list));
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5085a;

        /* renamed from: c, reason: collision with root package name */
        int f5087c;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5085a = obj;
            this.f5087c |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5088a;

        /* renamed from: b, reason: collision with root package name */
        Object f5089b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f5090c;

        /* renamed from: e, reason: collision with root package name */
        int f5092e;

        g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5090c = obj;
            this.f5092e |= Integer.MIN_VALUE;
            Object a8 = a.this.a(null, null, null, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    public a(m stripeRepository, L5.a lazyPaymentConfig, InterfaceC4057d logger, i errorReporter, S5.g workContext, Set productUsageTokens) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(lazyPaymentConfig, "lazyPaymentConfig");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(productUsageTokens, "productUsageTokens");
        this.f5047a = stripeRepository;
        this.f5048b = lazyPaymentConfig;
        this.f5049c = logger;
        this.f5050d = errorReporter;
        this.f5051e = workContext;
        this.f5052f = productUsageTokens;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(K3.c r21, K3.c.a r22, java.lang.String r23, S5.d r24) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.a.l(K3.c, K3.c$a, java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m(java.util.List r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r9.n(r10)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r1 = 4
            g3.a$g[] r1 = new g3.AbstractC2878a.g[r1]
            g3.a$g r2 = g3.AbstractC2878a.g.f32041d
            r3 = 0
            r1[r3] = r2
            g3.a$g r2 = g3.AbstractC2878a.g.f32042e
            r4 = 1
            r1[r4] = r2
            g3.a$g r2 = g3.AbstractC2878a.g.f32044g
            r5 = 2
            r1[r5] = r2
            g3.a$g r2 = g3.AbstractC2878a.g.f32046i
            r5 = 3
            r1[r5] = r2
            java.util.Set r1 = P5.a0.i(r1)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L34:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r10.next()
            r6 = r5
            com.stripe.android.model.o r6 = (com.stripe.android.model.o) r6
            com.stripe.android.model.o$p r7 = r6.f25467e
            com.stripe.android.model.o$p r8 = com.stripe.android.model.o.p.f25587i
            if (r7 != r8) goto L60
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.stripe.android.model.o$g r6 = r6.f25470h
            if (r6 == 0) goto L57
            g3.a r6 = r6.f25539j
            if (r6 == 0) goto L57
            g3.a$g r6 = r6.a()
            goto L58
        L57:
            r6 = 0
        L58:
            boolean r6 = P5.AbstractC1378t.d0(r7, r6)
            if (r6 == 0) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = 0
        L61:
            r6 = r6 ^ r4
            if (r6 == 0) goto L34
            r2.add(r5)
            goto L34
        L68:
            r0.addAll(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.a.m(java.util.List):java.util.List");
    }

    private final List n(List list) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        EnumC2791e enumC2791e;
        AbstractC2878a abstractC2878a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            AbstractC2878a.g gVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            o oVar = (o) next;
            if (oVar.f25467e == o.p.f25587i) {
                o.g gVar2 = oVar.f25470h;
                if (gVar2 != null && (abstractC2878a = gVar2.f25539j) != null) {
                    gVar = abstractC2878a.a();
                }
                if (gVar == AbstractC2878a.g.f32046i) {
                    arrayList.add(next);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            o.g gVar3 = ((o) obj).f25470h;
            if (gVar3 != null) {
                str = gVar3.f25537h;
            } else {
                str = null;
            }
            if (gVar3 != null) {
                num = gVar3.f25533d;
            } else {
                num = null;
            }
            if (gVar3 != null) {
                num2 = gVar3.f25534e;
            } else {
                num2 = null;
            }
            if (gVar3 != null && (enumC2791e = gVar3.f25530a) != null) {
                str2 = enumC2791e.f();
            } else {
                str2 = null;
            }
            if (hashSet.add(str + "-" + num + "-" + num2 + "-" + str2)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // K3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(K3.c.a r11, java.lang.String r12, com.stripe.android.model.t r13, S5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof K3.a.g
            if (r0 == 0) goto L13
            r0 = r14
            K3.a$g r0 = (K3.a.g) r0
            int r1 = r0.f5092e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5092e = r1
            goto L18
        L13:
            K3.a$g r0 = new K3.a$g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f5090c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5092e
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r11 = r0.f5089b
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f5088a
            K3.a r11 = (K3.a) r11
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r13 = r14.j()
            goto L6c
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            O5.t.b(r14)
            h3.m r14 = r10.f5047a
            A2.j$c r2 = new A2.j$c
            java.lang.String r5 = r11.a()
            L5.a r11 = r10.f5048b
            java.lang.Object r11 = r11.get()
            m2.r r11 = (m2.r) r11
            java.lang.String r6 = r11.h()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f5088a = r10
            r0.f5089b = r12
            r0.f5092e = r3
            java.lang.Object r13 = r14.e(r12, r13, r2, r0)
            if (r13 != r1) goto L6b
            return r1
        L6b:
            r11 = r10
        L6c:
            java.lang.Throwable r14 = O5.s.e(r13)
            if (r14 == 0) goto L8d
            u2.d r11 = r11.f5049c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to update payment method "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.a(r12, r14)
        L8d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.a.a(K3.c$a, java.lang.String, com.stripe.android.model.t, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // K3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(K3.c.a r13, S5.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof K3.a.f
            if (r0 == 0) goto L13
            r0 = r14
            K3.a$f r0 = (K3.a.f) r0
            int r1 = r0.f5087c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5087c = r1
            goto L18
        L13:
            K3.a$f r0 = new K3.a$f
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f5085a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5087c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r13 = r14.j()
            goto L64
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            O5.t.b(r14)
            h3.m r14 = r12.f5047a
            java.lang.String r2 = r13.b()
            java.util.Set r4 = r12.f5052f
            A2.j$c r11 = new A2.j$c
            java.lang.String r6 = r13.a()
            L5.a r13 = r12.f5048b
            java.lang.Object r13 = r13.get()
            m2.r r13 = (m2.r) r13
            java.lang.String r7 = r13.h()
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f5087c = r3
            java.lang.Object r13 = r14.r(r2, r4, r11, r0)
            if (r13 != r1) goto L64
            return r1
        L64:
            boolean r14 = O5.s.g(r13)
            if (r14 == 0) goto L6b
            r13 = 0
        L6b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.a.b(K3.c$a, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // K3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(K3.c.a r11, java.lang.String r12, boolean r13, S5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof K3.a.C0077a
            if (r0 == 0) goto L13
            r0 = r14
            K3.a$a r0 = (K3.a.C0077a) r0
            int r1 = r0.f5057e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5057e = r1
            goto L18
        L13:
            K3.a$a r0 = new K3.a$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f5055c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5057e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L28
            if (r2 != r3) goto L3b
        L28:
            java.lang.Object r11 = r0.f5054b
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f5053a
            K3.a r11 = (K3.a) r11
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r13 = r14.j()
            goto L82
        L3b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L43:
            O5.t.b(r14)
            if (r13 == 0) goto L57
            r0.f5053a = r10
            r0.f5054b = r12
            r0.f5057e = r4
            java.lang.Object r11 = r10.l(r10, r11, r12, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r13 = r11
            goto L81
        L57:
            h3.m r13 = r10.f5047a
            java.util.Set r14 = r10.f5052f
            A2.j$c r2 = new A2.j$c
            java.lang.String r5 = r11.a()
            L5.a r11 = r10.f5048b
            java.lang.Object r11 = r11.get()
            m2.r r11 = (m2.r) r11
            java.lang.String r6 = r11.h()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f5053a = r10
            r0.f5054b = r12
            r0.f5057e = r3
            java.lang.Object r13 = r13.u(r14, r12, r2, r0)
            if (r13 != r1) goto L81
            return r1
        L81:
            r11 = r10
        L82:
            java.lang.Throwable r14 = O5.s.e(r13)
            if (r14 == 0) goto La3
            u2.d r11 = r11.f5049c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to detach payment method "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.a(r12, r14)
        La3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.a.c(K3.c$a, java.lang.String, boolean, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // K3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(K3.c.a r11, java.util.List r12, boolean r13, S5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof K3.a.d
            if (r0 == 0) goto L13
            r0 = r14
            K3.a$d r0 = (K3.a.d) r0
            int r1 = r0.f5074c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5074c = r1
            goto L18
        L13:
            K3.a$d r0 = new K3.a$d
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f5072a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5074c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r14)
            goto L4a
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            O5.t.b(r14)
            S5.g r14 = r10.f5051e
            K3.a$e r2 = new K3.a$e
            r9 = 0
            r4 = r2
            r5 = r12
            r6 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f5074c = r3
            java.lang.Object r14 = l6.AbstractC3360i.g(r14, r2, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            O5.s r14 = (O5.s) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.a.d(K3.c$a, java.util.List, boolean, S5.d):java.lang.Object");
    }
}
