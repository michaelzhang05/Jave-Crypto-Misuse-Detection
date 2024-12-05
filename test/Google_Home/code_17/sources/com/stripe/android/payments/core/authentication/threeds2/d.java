package com.stripe.android.payments.core.authentication.threeds2;

import A2.InterfaceC0945c;
import A2.j;
import O5.I;
import O5.s;
import O5.t;
import S5.g;
import a4.n;
import a4.p;
import a6.InterfaceC1668n;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.x;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.a;
import com.stripe.android.stripe3ds2.transaction.h;
import e3.C2782F;
import e3.C2783G;
import h3.m;
import i3.C2980c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;
import l6.X;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: n, reason: collision with root package name */
    private static final a f26268n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f26269o = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Stripe3ds2TransactionContract.a f26270a;

    /* renamed from: b, reason: collision with root package name */
    private final m f26271b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0945c f26272c;

    /* renamed from: d, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f26273d;

    /* renamed from: e, reason: collision with root package name */
    private final Z3.a f26274e;

    /* renamed from: f, reason: collision with root package name */
    private final p f26275f;

    /* renamed from: g, reason: collision with root package name */
    private final p3.d f26276g;

    /* renamed from: h, reason: collision with root package name */
    private final n f26277h;

    /* renamed from: i, reason: collision with root package name */
    private final g f26278i;

    /* renamed from: j, reason: collision with root package name */
    private final SavedStateHandle f26279j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f26280k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26281l;

    /* renamed from: m, reason: collision with root package name */
    private final j.c f26282m;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26283a;

        /* renamed from: b, reason: collision with root package name */
        Object f26284b;

        /* renamed from: c, reason: collision with root package name */
        Object f26285c;

        /* renamed from: d, reason: collision with root package name */
        int f26286d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f26287e;

        /* renamed from: g, reason: collision with root package name */
        int f26289g;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26287e = obj;
            this.f26289g |= Integer.MIN_VALUE;
            return d.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26290a;

        /* renamed from: c, reason: collision with root package name */
        int f26292c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26290a = obj;
            this.f26292c |= Integer.MIN_VALUE;
            Object k8 = d.this.k(null, null, null, 0, this);
            return k8 == T5.b.e() ? k8 : s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0547d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a4.s f26294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f26295c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26296d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f26297e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j.c f26298f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0547d(a4.s sVar, x xVar, int i8, d dVar, j.c cVar, S5.d dVar2) {
            super(2, dVar2);
            this.f26294b = sVar;
            this.f26295c = xVar;
            this.f26296d = i8;
            this.f26297e = dVar;
            this.f26298f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0547d(this.f26294b, this.f26295c, this.f26296d, this.f26297e, this.f26298f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object s8;
            Object e8 = T5.b.e();
            int i8 = this.f26293a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        s8 = ((s) obj).j();
                        return s.a(s8);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                a4.s sVar = this.f26294b;
                this.f26293a = 1;
                obj = sVar.a(this);
                if (obj == e8) {
                    return e8;
                }
            }
            a4.c cVar = (a4.c) obj;
            C2782F c2782f = new C2782F(this.f26295c.g(), cVar.g(), cVar.i(), cVar.l().a(), cVar.a(), cVar.h(), cVar.b(), this.f26296d, null);
            m mVar = this.f26297e.f26271b;
            j.c cVar2 = this.f26298f;
            this.f26293a = 2;
            s8 = mVar.s(c2782f, cVar2, this);
            if (s8 == e8) {
                return e8;
            }
            return s.a(s8);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0547d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26299a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26300b;

        /* renamed from: d, reason: collision with root package name */
        int f26302d;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26300b = obj;
            this.f26302d |= Integer.MIN_VALUE;
            return d.this.m(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2783G.a f26304b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a4.s f26305c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26306d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f26307e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f26308f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C2783G.a aVar, a4.s sVar, int i8, d dVar, String str, S5.d dVar2) {
            super(2, dVar2);
            this.f26304b = aVar;
            this.f26305c = sVar;
            this.f26306d = i8;
            this.f26307e = dVar;
            this.f26308f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f26304b, this.f26305c, this.f26306d, this.f26307e, this.f26308f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26303a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                long a8 = com.stripe.android.b.f24521q.a();
                this.f26303a = 1;
                if (X.b(a8, this) == e8) {
                    return e8;
                }
            }
            a4.e eVar = new a4.e(this.f26304b.g(), this.f26304b.b(), null, this.f26304b.a(), null, 20, null);
            a4.s sVar = this.f26305c;
            int i9 = this.f26306d;
            String d8 = this.f26307e.f26270a.v().d();
            if (d8 == null) {
                d8 = "";
            }
            return new a.b(sVar.b(eVar, i9, new com.stripe.android.stripe3ds2.transaction.n(d8, this.f26308f, this.f26307e.g().g(), this.f26307e.g().l())));
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public d(Stripe3ds2TransactionContract.a args, m stripeRepository, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Z3.a threeDs2Service, p messageVersionRegistry, p3.d challengeResultProcessor, n initChallengeRepository, g workContext, SavedStateHandle savedStateHandle, boolean z8) {
        j.c p8;
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(threeDs2Service, "threeDs2Service");
        AbstractC3255y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3255y.i(challengeResultProcessor, "challengeResultProcessor");
        AbstractC3255y.i(initChallengeRepository, "initChallengeRepository");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        this.f26270a = args;
        this.f26271b = stripeRepository;
        this.f26272c = analyticsRequestExecutor;
        this.f26273d = paymentAnalyticsRequestFactory;
        this.f26274e = threeDs2Service;
        this.f26275f = messageVersionRegistry;
        this.f26276g = challengeResultProcessor;
        this.f26277h = initChallengeRepository;
        this.f26278i = workContext;
        this.f26279j = savedStateHandle;
        this.f26280k = z8;
        this.f26281l = savedStateHandle.contains("key_next_step");
        String b8 = args.h().b();
        if (b8 != null) {
            String str = b8.length() <= 0 ? null : b8;
            if (str != null) {
                p8 = new j.c(str, null, null, 6, null);
                this.f26282m = p8;
            }
        }
        p8 = args.p();
        this.f26282m = p8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.stripe.android.model.x r25, S5.d r26) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.e(com.stripe.android.model.x, S5.d):java.lang.Object");
    }

    private final com.stripe.android.payments.core.authentication.threeds2.a i(String str) {
        String str2;
        String str3;
        this.f26272c.a(PaymentAnalyticsRequestFactory.v(this.f26273d, PaymentAnalyticsEvent.f25910q0, null, null, null, null, null, 62, null));
        String id = this.f26270a.v().getId();
        if (id == null) {
            str2 = "";
        } else {
            str2 = id;
        }
        int b8 = com.stripe.android.b.f24521q.b(this.f26270a.v());
        String d8 = this.f26270a.v().d();
        if (d8 == null) {
            str3 = "";
        } else {
            str3 = d8;
        }
        return new a.c(new PaymentBrowserAuthContract.a(str2, b8, str3, str, null, this.f26270a.b(), null, this.f26270a.p().l(), true, false, this.f26270a.u(), this.f26282m.g(), this.f26280k, null, false, 25152, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(a4.s r14, com.stripe.android.model.x r15, A2.j.c r16, int r17, S5.d r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof com.stripe.android.payments.core.authentication.threeds2.d.c
            if (r1 == 0) goto L17
            r1 = r0
            com.stripe.android.payments.core.authentication.threeds2.d$c r1 = (com.stripe.android.payments.core.authentication.threeds2.d.c) r1
            int r2 = r1.f26292c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f26292c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            com.stripe.android.payments.core.authentication.threeds2.d$c r1 = new com.stripe.android.payments.core.authentication.threeds2.d$c
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f26290a
            java.lang.Object r9 = T5.b.e()
            int r1 = r8.f26292c
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
            S5.g r11 = r7.f26278i
            com.stripe.android.payments.core.authentication.threeds2.d$d r12 = new com.stripe.android.payments.core.authentication.threeds2.d$d
            r6 = 0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f26292c = r10
            java.lang.Object r0 = l6.AbstractC3360i.g(r11, r12, r8)
            if (r0 != r9) goto L52
            return r9
        L52:
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.k(a4.s, com.stripe.android.model.x, A2.j$c, int, S5.d):java.lang.Object");
    }

    private final com.stripe.android.payments.core.authentication.threeds2.a o() {
        this.f26272c.a(PaymentAnalyticsRequestFactory.v(this.f26273d, PaymentAnalyticsEvent.f25888V, null, null, null, null, null, 62, null));
        return new a.C0546a(new C2980c(this.f26270a.v().d(), 0, null, false, null, null, this.f26270a.p().l(), 62, null));
    }

    public final boolean f() {
        return this.f26281l;
    }

    public final j.c g() {
        return this.f26282m;
    }

    public final Object h(a4.m mVar, S5.d dVar) {
        return this.f26277h.a(mVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r11 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(e3.C2783G r11, a4.s r12, java.lang.String r13, int r14, S5.d r15) {
        /*
            r10 = this;
            e3.G$a r1 = r11.a()
            if (r1 == 0) goto L26
            boolean r11 = r1.h()
            if (r11 == 0) goto L20
            r0 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            java.lang.Object r11 = r0.n(r1, r2, r3, r4, r5)
            java.lang.Object r12 = T5.b.e()
            if (r11 != r12) goto L1c
            return r11
        L1c:
            com.stripe.android.payments.core.authentication.threeds2.a r11 = (com.stripe.android.payments.core.authentication.threeds2.a) r11
            goto Lde
        L20:
            com.stripe.android.payments.core.authentication.threeds2.a r11 = r10.o()
            goto Lde
        L26:
            java.lang.String r12 = r11.g()
            if (r12 == 0) goto L36
            java.lang.String r11 = r11.g()
            com.stripe.android.payments.core.authentication.threeds2.a r11 = r10.i(r11)
            goto Lde
        L36:
            e3.G$d r11 = r11.b()
            if (r11 == 0) goto Lab
            java.lang.String r12 = r11.a()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Code: "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = r11.h()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Detail: "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = r11.g()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Description: "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            java.lang.String r11 = r11.b()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Component: "
            r15.append(r0)
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            java.lang.String[] r11 = new java.lang.String[]{r12, r13, r14, r11}
            java.util.List r11 = P5.AbstractC1378t.p(r11)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 62
            r8 = 0
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r11 = P5.AbstractC1378t.w0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != 0) goto Lad
        Lab:
            java.lang.String r11 = "Invalid 3DS2 authentication response"
        Lad:
            com.stripe.android.payments.core.authentication.threeds2.a$a r12 = new com.stripe.android.payments.core.authentication.threeds2.a$a
            i3.c r13 = new i3.c
            w2.k$a r14 = w2.AbstractC4144k.f40356e
            java.lang.RuntimeException r15 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error encountered during 3DS2 authentication request. "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r15.<init>(r11)
            w2.k r3 = r14.b(r15)
            r8 = 123(0x7b, float:1.72E-43)
            r9 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.<init>(r13)
            r11 = r12
        Lde:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.j(e3.G, a4.s, java.lang.String, int, S5.d):java.lang.Object");
    }

    public final Object l(h hVar, S5.d dVar) {
        return this.f26276g.a(hVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(S5.d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.stripe.android.payments.core.authentication.threeds2.d.e
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.payments.core.authentication.threeds2.d$e r0 = (com.stripe.android.payments.core.authentication.threeds2.d.e) r0
            int r1 = r0.f26302d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26302d = r1
            goto L18
        L13:
            com.stripe.android.payments.core.authentication.threeds2.d$e r0 = new com.stripe.android.payments.core.authentication.threeds2.d$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26300b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26302d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f26299a
            com.stripe.android.payments.core.authentication.threeds2.d r0 = (com.stripe.android.payments.core.authentication.threeds2.d) r0
            O5.t.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto L68
        L2d:
            r15 = move-exception
            goto L71
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            O5.t.b(r15)
            A2.c r15 = r14.f26272c
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r4 = r14.f26273d
            com.stripe.android.networking.PaymentAnalyticsEvent r5 = com.stripe.android.networking.PaymentAnalyticsEvent.f25886T
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            A2.b r2 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.a(r2)
            O5.s$a r15 = O5.s.f8302b     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.model.x r15 = new com.stripe.android.model.x     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a r2 = r14.f26270a     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.model.StripeIntent$a$j$b r2 = r2.h()     // Catch: java.lang.Throwable -> L6f
            r15.<init>(r2)     // Catch: java.lang.Throwable -> L6f
            r0.f26299a = r14     // Catch: java.lang.Throwable -> L6f
            r0.f26302d = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r15 = r14.e(r15, r0)     // Catch: java.lang.Throwable -> L6f
            if (r15 != r1) goto L67
            return r1
        L67:
            r0 = r14
        L68:
            com.stripe.android.payments.core.authentication.threeds2.a r15 = (com.stripe.android.payments.core.authentication.threeds2.a) r15     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r15 = O5.s.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto L7b
        L6f:
            r15 = move-exception
            r0 = r14
        L71:
            O5.s$a r1 = O5.s.f8302b
            java.lang.Object r15 = O5.t.a(r15)
            java.lang.Object r15 = O5.s.b(r15)
        L7b:
            java.lang.Throwable r1 = O5.s.e(r15)
            if (r1 != 0) goto L82
            goto Laf
        L82:
            A2.c r15 = r0.f26272c
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r4 = r0.f26273d
            com.stripe.android.networking.PaymentAnalyticsEvent r5 = com.stripe.android.networking.PaymentAnalyticsEvent.f25885S
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            A2.b r2 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.a(r2)
            com.stripe.android.payments.core.authentication.threeds2.a$a r15 = new com.stripe.android.payments.core.authentication.threeds2.a$a
            i3.c r2 = new i3.c
            w2.k$a r4 = w2.AbstractC4144k.f40356e
            w2.k r7 = r4.b(r1)
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r11 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.<init>(r2)
        Laf:
            r1 = r15
            com.stripe.android.payments.core.authentication.threeds2.a r1 = (com.stripe.android.payments.core.authentication.threeds2.a) r1
            androidx.lifecycle.SavedStateHandle r1 = r0.f26279j
            java.lang.String r2 = "key_next_step"
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            r1.set(r2, r4)
            r0.f26281l = r3
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.m(S5.d):java.lang.Object");
    }

    public final Object n(C2783G.a aVar, a4.s sVar, String str, int i8, S5.d dVar) {
        return AbstractC3360i.g(this.f26278i, new f(aVar, sVar, i8, this, str, null), dVar);
    }
}
