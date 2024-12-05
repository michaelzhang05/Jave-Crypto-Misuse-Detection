package S2;

import A2.j;
import N2.f;
import O5.I;
import O5.s;
import O5.t;
import O5.x;
import P5.Q;
import a6.InterfaceC1668n;
import com.stripe.android.model.p;
import e3.C2797k;
import e3.InterfaceC2798l;
import e3.r;
import h3.m;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.M;
import n3.i;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public final class a implements S2.c {

    /* renamed from: h, reason: collision with root package name */
    private static final C0195a f9694h = new C0195a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f9695i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f9696a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f9697b;

    /* renamed from: c, reason: collision with root package name */
    private final m f9698c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.a f9699d;

    /* renamed from: e, reason: collision with root package name */
    private final S5.g f9700e;

    /* renamed from: f, reason: collision with root package name */
    private final Locale f9701f;

    /* renamed from: g, reason: collision with root package name */
    private final n3.i f9702g;

    /* renamed from: S2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0195a {
        private C0195a() {
        }

        public /* synthetic */ C0195a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9703a;

        /* renamed from: c, reason: collision with root package name */
        int f9705c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9703a = obj;
            this.f9705c |= Integer.MIN_VALUE;
            Object e8 = a.this.e(null, null, null, null, null, this);
            if (e8 == T5.b.e()) {
                return e8;
            }
            return s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9706a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9708c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f9709d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9710e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9711f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f9712g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, String str3, String str4, r rVar, S5.d dVar) {
            super(2, dVar);
            this.f9708c = str;
            this.f9709d = str2;
            this.f9710e = str3;
            this.f9711f = str4;
            this.f9712g = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f9708c, this.f9709d, this.f9710e, this.f9711f, this.f9712g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = T5.b.e();
            int i8 = this.f9706a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a8 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                R3.a aVar = a.this.f9699d;
                Locale locale = a.this.f9701f;
                j.c l8 = a.l(a.this, null, 1, null);
                String str = this.f9708c;
                String str2 = this.f9709d;
                String str3 = this.f9710e;
                String str4 = this.f9711f;
                r rVar = this.f9712g;
                this.f9706a = 1;
                a8 = aVar.a(str, str2, str3, str4, locale, "android_payment_element", rVar, l8, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            return s.a(a8);
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
        /* synthetic */ Object f9713a;

        /* renamed from: c, reason: collision with root package name */
        int f9715c;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9713a = obj;
            this.f9715c |= Integer.MIN_VALUE;
            Object a8 = a.this.a(null, null, null, null, null, false, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9716a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9718c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f9719d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9720e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9721f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9722g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, p pVar, String str2, boolean z8, String str3, S5.d dVar) {
            super(2, dVar);
            this.f9718c = str;
            this.f9719d = pVar;
            this.f9720e = str2;
            this.f9721f = z8;
            this.f9722g = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f9718c, this.f9719d, this.f9720e, this.f9721f, this.f9722g, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r9.f9716a
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                O5.t.b(r10)
                O5.s r10 = (O5.s) r10
                java.lang.Object r10 = r10.j()
                goto L4b
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                O5.t.b(r10)
                S2.a r10 = S2.a.this
                R3.a r3 = S2.a.g(r10)
                java.lang.String r4 = r9.f9718c
                e3.l$a r5 = new e3.l$a
                com.stripe.android.model.p r10 = r9.f9719d
                java.util.Map r10 = r10.B()
                java.lang.String r1 = r9.f9720e
                boolean r6 = r9.f9721f
                r5.<init>(r10, r1, r6)
                S2.a r10 = S2.a.this
                java.lang.String r1 = r9.f9722g
                A2.j$c r7 = S2.a.f(r10, r1)
                r9.f9716a = r2
                java.lang.String r6 = "android_payment_element"
                r8 = r9
                java.lang.Object r10 = r3.b(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L4b
                return r0
            L4b:
                com.stripe.android.model.p r0 = r9.f9719d
                java.lang.String r1 = r9.f9718c
                boolean r2 = O5.s.h(r10)
                if (r2 == 0) goto L86
                e3.k r10 = (e3.C2797k) r10     // Catch: java.lang.Throwable -> L7f
                java.util.List r10 = r10.a()     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r10 = P5.AbstractC1378t.m0(r10)     // Catch: java.lang.Throwable -> L7f
                e3.k$e r10 = (e3.C2797k.e) r10     // Catch: java.lang.Throwable -> L7f
                e3.l$a$a r2 = e3.InterfaceC2798l.a.f31499d     // Catch: java.lang.Throwable -> L7f
                java.util.Map r3 = r0.B()     // Catch: java.lang.Throwable -> L7f
                java.util.Map r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L7f
                com.stripe.android.model.p$e r3 = com.stripe.android.model.p.f25636u     // Catch: java.lang.Throwable -> L7f
                java.lang.String r4 = r10.getId()     // Catch: java.lang.Throwable -> L7f
                com.stripe.android.model.p r1 = r3.l(r4, r1, r2)     // Catch: java.lang.Throwable -> L7f
                N2.f$a r2 = new N2.f$a     // Catch: java.lang.Throwable -> L7f
                r2.<init>(r10, r1, r0)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r10 = O5.s.b(r2)     // Catch: java.lang.Throwable -> L7f
                goto L8a
            L7f:
                r10 = move-exception
                O5.s$a r0 = O5.s.f8302b
                java.lang.Object r10 = O5.t.a(r10)
            L86:
                java.lang.Object r10 = O5.s.b(r10)
            L8a:
                S2.a r0 = S2.a.this
                java.lang.Throwable r1 = O5.s.e(r10)
                if (r1 == 0) goto La4
                n3.i r2 = S2.a.h(r0)
                n3.i$d r3 = n3.i.d.f35396j
                w2.k$a r0 = w2.AbstractC4144k.f40356e
                w2.k r4 = r0.b(r1)
                r6 = 4
                r7 = 0
                r5 = 0
                n3.i.b.a(r2, r3, r4, r5, r6, r7)
            La4:
                O5.s r10 = O5.s.a(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: S2.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
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
        /* synthetic */ Object f9723a;

        /* renamed from: c, reason: collision with root package name */
        int f9725c;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9723a = obj;
            this.f9725c |= Integer.MIN_VALUE;
            Object b8 = a.this.b(null, null, this);
            if (b8 == T5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9726a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9728c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f9729d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, S5.d dVar) {
            super(2, dVar);
            this.f9728c = str;
            this.f9729d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f9728c, this.f9729d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object t8;
            Object e8 = T5.b.e();
            int i8 = this.f9726a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    t8 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                m mVar = a.this.f9698c;
                String str = this.f9728c;
                String str2 = this.f9729d;
                j.c k8 = a.this.k(str2);
                this.f9726a = 1;
                t8 = mVar.t(str, str2, k8, this);
                if (t8 == e8) {
                    return e8;
                }
            }
            return s.a(t8);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9730a;

        /* renamed from: c, reason: collision with root package name */
        int f9732c;

        h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9730a = obj;
            this.f9732c |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, this);
            if (d8 == T5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9733a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9734b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f9736d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, S5.d dVar) {
            super(2, dVar);
            this.f9736d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            i iVar = new i(this.f9736d, dVar);
            iVar.f9734b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f9733a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    a aVar = a.this;
                    String str = this.f9736d;
                    s.a aVar2 = s.f8302b;
                    R3.a aVar3 = aVar.f9699d;
                    j.c l8 = a.l(aVar, null, 1, null);
                    this.f9733a = 1;
                    obj = aVar3.c(str, "android_payment_element", l8, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
            } catch (Throwable th) {
                s.a aVar4 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            if (obj != null) {
                b8 = s.b((e3.p) obj);
                return s.a(b8);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9737a;

        /* renamed from: c, reason: collision with root package name */
        int f9739c;

        j(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9737a = obj;
            this.f9739c |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, null, null, null, this);
            if (c8 == T5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9740a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9742c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f9743d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f9744e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9745f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, p pVar, String str3, S5.d dVar) {
            super(2, dVar);
            this.f9742c = str;
            this.f9743d = str2;
            this.f9744e = pVar;
            this.f9745f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(this.f9742c, this.f9743d, this.f9744e, this.f9745f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object m8;
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f9740a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    m8 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                m mVar = a.this.f9698c;
                String str = this.f9742c;
                String str2 = this.f9743d;
                Map e9 = Q.e(x.a("payment_method_options", InterfaceC2798l.a.f31499d.a(this.f9744e.B())));
                j.c l8 = a.l(a.this, null, 1, null);
                this.f9740a = 1;
                m8 = mVar.m(str, str2, e9, l8, this);
                if (m8 == e8) {
                    return e8;
                }
            }
            a aVar = a.this;
            Throwable e10 = s.e(m8);
            if (e10 != null) {
                i.b.a(aVar.f9702g, i.d.f35397k, AbstractC4144k.f40356e.b(e10), null, 4, null);
            }
            String str3 = this.f9745f;
            String str4 = this.f9742c;
            p pVar = this.f9744e;
            if (s.h(m8)) {
                String str5 = (String) m8;
                b8 = s.b(new f.b(new C2797k.d(str5, str3), p.f25636u.l(str5, str4, InterfaceC2798l.a.f31499d.a(pVar.B()))));
            } else {
                b8 = s.b(m8);
            }
            return s.a(b8);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public a(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, m stripeRepository, R3.a consumersApiService, S5.g workContext, Locale locale, n3.i errorReporter) {
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(consumersApiService, "consumersApiService");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f9696a = publishableKeyProvider;
        this.f9697b = stripeAccountIdProvider;
        this.f9698c = stripeRepository;
        this.f9699d = consumersApiService;
        this.f9700e = workContext;
        this.f9701f = locale;
        this.f9702g = errorReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.c k(String str) {
        String str2;
        if (str == null) {
            str2 = (String) this.f9696a.invoke();
        } else {
            str2 = str;
        }
        Object invoke = this.f9697b.invoke();
        if (str != null) {
            invoke = null;
        }
        return new j.c(str2, (String) invoke, null, 4, null);
    }

    static /* synthetic */ j.c l(a aVar, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        return aVar.k(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // S2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.stripe.android.model.p r15, java.lang.String r16, com.stripe.android.model.StripeIntent r17, java.lang.String r18, java.lang.String r19, boolean r20, S5.d r21) {
        /*
            r14 = this;
            r8 = r14
            r0 = r21
            boolean r1 = r0 instanceof S2.a.d
            if (r1 == 0) goto L17
            r1 = r0
            S2.a$d r1 = (S2.a.d) r1
            int r2 = r1.f9715c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f9715c = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            S2.a$d r1 = new S2.a$d
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.f9713a
            java.lang.Object r10 = T5.b.e()
            int r1 = r9.f9715c
            r11 = 1
            if (r1 == 0) goto L36
            if (r1 != r11) goto L2e
            O5.t.b(r0)
            goto L55
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            O5.t.b(r0)
            S5.g r12 = r8.f9700e
            S2.a$e r13 = new S2.a$e
            r7 = 0
            r0 = r13
            r1 = r14
            r2 = r18
            r3 = r15
            r4 = r16
            r5 = r20
            r6 = r19
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.f9715c = r11
            java.lang.Object r0 = l6.AbstractC3360i.g(r12, r13, r9)
            if (r0 != r10) goto L55
            return r10
        L55:
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.a.a(com.stripe.android.model.p, java.lang.String, com.stripe.android.model.StripeIntent, java.lang.String, java.lang.String, boolean, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // S2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r6, java.lang.String r7, S5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof S2.a.f
            if (r0 == 0) goto L13
            r0 = r8
            S2.a$f r0 = (S2.a.f) r0
            int r1 = r0.f9725c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9725c = r1
            goto L18
        L13:
            S2.a$f r0 = new S2.a$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9723a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f9725c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            O5.t.b(r8)
            S5.g r8 = r5.f9700e
            S2.a$g r2 = new S2.a$g
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f9725c = r3
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            O5.s r8 = (O5.s) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.a.b(java.lang.String, java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // S2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(com.stripe.android.model.p r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, S5.d r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof S2.a.j
            if (r1 == 0) goto L17
            r1 = r0
            S2.a$j r1 = (S2.a.j) r1
            int r2 = r1.f9739c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f9739c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            S2.a$j r1 = new S2.a$j
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f9737a
            java.lang.Object r9 = T5.b.e()
            int r1 = r8.f9739c
            r10 = 1
            if (r1 == 0) goto L36
            if (r1 != r10) goto L2e
            O5.t.b(r0)
            goto L52
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            O5.t.b(r0)
            S5.g r11 = r7.f9700e
            S2.a$k r12 = new S2.a$k
            r6 = 0
            r0 = r12
            r1 = r13
            r2 = r17
            r3 = r15
            r4 = r14
            r5 = r16
            r0.<init>(r2, r3, r4, r5, r6)
            r8.f9739c = r10
            java.lang.Object r0 = l6.AbstractC3360i.g(r11, r12, r8)
            if (r0 != r9) goto L52
            return r9
        L52:
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.a.c(com.stripe.android.model.p, java.lang.String, java.lang.String, java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // S2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r6, S5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof S2.a.h
            if (r0 == 0) goto L13
            r0 = r7
            S2.a$h r0 = (S2.a.h) r0
            int r1 = r0.f9732c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9732c = r1
            goto L18
        L13:
            S2.a$h r0 = new S2.a$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9730a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f9732c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            O5.t.b(r7)
            S5.g r7 = r5.f9700e
            S2.a$i r2 = new S2.a$i
            r4 = 0
            r2.<init>(r6, r4)
            r0.f9732c = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            O5.s r7 = (O5.s) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.a.d(java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // S2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, e3.r r19, S5.d r20) {
        /*
            r14 = this;
            r8 = r14
            r0 = r20
            boolean r1 = r0 instanceof S2.a.b
            if (r1 == 0) goto L17
            r1 = r0
            S2.a$b r1 = (S2.a.b) r1
            int r2 = r1.f9705c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f9705c = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            S2.a$b r1 = new S2.a$b
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.f9703a
            java.lang.Object r10 = T5.b.e()
            int r1 = r9.f9705c
            r11 = 1
            if (r1 == 0) goto L36
            if (r1 != r11) goto L2e
            O5.t.b(r0)
            goto L55
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            O5.t.b(r0)
            S5.g r12 = r8.f9700e
            S2.a$c r13 = new S2.a$c
            r7 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.f9705c = r11
            java.lang.Object r0 = l6.AbstractC3360i.g(r12, r13, r9)
            if (r0 != r10) goto L55
            return r10
        L55:
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.a.e(java.lang.String, java.lang.String, java.lang.String, java.lang.String, e3.r, S5.d):java.lang.Object");
    }
}
