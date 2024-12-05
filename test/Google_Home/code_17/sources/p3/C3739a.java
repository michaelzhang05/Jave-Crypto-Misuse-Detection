package p3;

import A2.B;
import A2.InterfaceC0945c;
import A2.j;
import O5.I;
import O5.p;
import O5.t;
import S5.g;
import a6.InterfaceC1668n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.stripe3ds2.transaction.h;
import h3.m;
import i3.C2980c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;
import u2.InterfaceC4057d;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3739a implements p3.d {

    /* renamed from: g, reason: collision with root package name */
    private static final C0824a f36920g = new C0824a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f36921h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m f36922a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0945c f36923b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f36924c;

    /* renamed from: d, reason: collision with root package name */
    private final B f36925d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4057d f36926e;

    /* renamed from: f, reason: collision with root package name */
    private final g f36927f;

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0824a {
        private C0824a() {
        }

        public /* synthetic */ C0824a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36928a;

        /* renamed from: b, reason: collision with root package name */
        Object f36929b;

        /* renamed from: c, reason: collision with root package name */
        Object f36930c;

        /* renamed from: d, reason: collision with root package name */
        int f36931d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f36932e;

        /* renamed from: g, reason: collision with root package name */
        int f36934g;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36932e = obj;
            this.f36934g |= Integer.MIN_VALUE;
            return C3739a.this.f(null, null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36935a;

        /* renamed from: b, reason: collision with root package name */
        Object f36936b;

        /* renamed from: c, reason: collision with root package name */
        Object f36937c;

        /* renamed from: d, reason: collision with root package name */
        int f36938d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f36939e;

        /* renamed from: g, reason: collision with root package name */
        int f36941g;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36939e = obj;
            this.f36941g |= Integer.MIN_VALUE;
            return C3739a.this.h(null, null, 0, null, this);
        }
    }

    /* renamed from: p3.a$d */
    /* loaded from: classes4.dex */
    static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f36942a;

        /* renamed from: b, reason: collision with root package name */
        int f36943b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f36944c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3739a f36945d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar, C3739a c3739a, S5.d dVar) {
            super(2, dVar);
            this.f36944c = hVar;
            this.f36945d = c3739a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f36944c, this.f36945d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            j.c cVar;
            Object e8 = T5.b.e();
            int i8 = this.f36943b;
            int i9 = 1;
            if (i8 != 0) {
                if (i8 == 1) {
                    cVar = (j.c) this.f36942a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                h hVar = this.f36944c;
                if (hVar instanceof h.f) {
                    this.f36945d.f36923b.a(this.f36945d.f36924c.p(PaymentAnalyticsEvent.f25891Y, ((h.f) this.f36944c).h()));
                } else if (hVar instanceof h.c) {
                    this.f36945d.f36923b.a(this.f36945d.f36924c.p(PaymentAnalyticsEvent.f25891Y, ((h.c) this.f36944c).h()));
                } else if (hVar instanceof h.a) {
                    this.f36945d.f36923b.a(this.f36945d.f36924c.p(PaymentAnalyticsEvent.f25890X, ((h.a) this.f36944c).h()));
                } else if (hVar instanceof h.d) {
                    this.f36945d.f36923b.a(PaymentAnalyticsRequestFactory.v(this.f36945d.f36924c, PaymentAnalyticsEvent.f25892Z, null, null, null, null, null, 62, null));
                } else if (hVar instanceof h.e) {
                    this.f36945d.f36923b.a(PaymentAnalyticsRequestFactory.v(this.f36945d.f36924c, PaymentAnalyticsEvent.f25892Z, null, null, null, null, null, 62, null));
                } else if (hVar instanceof h.g) {
                    this.f36945d.f36923b.a(this.f36945d.f36924c.p(PaymentAnalyticsEvent.f25908p0, ((h.g) this.f36944c).h()));
                }
                InterfaceC0945c interfaceC0945c = this.f36945d.f36923b;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = this.f36945d.f36924c;
                PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.f25889W;
                b4.g a8 = this.f36944c.a();
                if (a8 != null) {
                    str = a8.b();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                interfaceC0945c.a(paymentAnalyticsRequestFactory.p(paymentAnalyticsEvent, str));
                j.c cVar2 = new j.c(this.f36944c.b().g(), this.f36944c.b().b(), null, 4, null);
                C3739a c3739a = this.f36945d;
                h hVar2 = this.f36944c;
                this.f36942a = cVar2;
                this.f36943b = 1;
                Object g8 = C3739a.g(c3739a, hVar2, cVar2, 0, this, 4, null);
                if (g8 == e8) {
                    return e8;
                }
                cVar = cVar2;
                obj = g8;
            }
            if (((Boolean) obj).booleanValue()) {
                h hVar3 = this.f36944c;
                if (!(hVar3 instanceof h.f)) {
                    if (!(hVar3 instanceof h.c)) {
                        if (hVar3 instanceof h.a) {
                            i9 = 3;
                        } else if (!(hVar3 instanceof h.d) && !(hVar3 instanceof h.e)) {
                            if (hVar3 instanceof h.g) {
                                i9 = 4;
                            } else {
                                throw new p();
                            }
                        }
                    }
                }
                return new C2980c(this.f36944c.b().d(), i9, null, false, null, null, cVar.l(), 60, null);
            }
            i9 = 2;
            return new C2980c(this.f36944c.b().d(), i9, null, false, null, null, cVar.l(), 60, null);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C3739a(m stripeRepository, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, B retryDelaySupplier, InterfaceC4057d logger, g workContext) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(retryDelaySupplier, "retryDelaySupplier");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(workContext, "workContext");
        this.f36922a = stripeRepository;
        this.f36923b = analyticsRequestExecutor;
        this.f36924c = paymentAnalyticsRequestFactory;
        this.f36925d = retryDelaySupplier;
        this.f36926e = logger;
        this.f36927f = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.stripe.android.stripe3ds2.transaction.h r8, A2.j.c r9, int r10, S5.d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof p3.C3739a.b
            if (r0 == 0) goto L14
            r0 = r11
            p3.a$b r0 = (p3.C3739a.b) r0
            int r1 = r0.f36934g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f36934g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p3.a$b r0 = new p3.a$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f36932e
            java.lang.Object r0 = T5.b.e()
            int r1 = r6.f36934g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L51
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            O5.t.b(r11)
            goto Lad
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r10 = r6.f36931d
            java.lang.Object r8 = r6.f36930c
            r9 = r8
            A2.j$c r9 = (A2.j.c) r9
            java.lang.Object r8 = r6.f36929b
            com.stripe.android.stripe3ds2.transaction.h r8 = (com.stripe.android.stripe3ds2.transaction.h) r8
            java.lang.Object r1 = r6.f36928a
            p3.a r1 = (p3.C3739a) r1
            O5.t.b(r11)
            O5.s r11 = (O5.s) r11
            java.lang.Object r11 = r11.j()
        L4f:
            r4 = r10
            goto L71
        L51:
            O5.t.b(r11)
            h3.m r11 = r7.f36922a
            com.stripe.android.stripe3ds2.transaction.n r1 = r8.b()
            java.lang.String r1 = r1.h()
            r6.f36928a = r7
            r6.f36929b = r8
            r6.f36930c = r9
            r6.f36931d = r10
            r6.f36934g = r3
            java.lang.Object r11 = r11.z(r1, r9, r6)
            if (r11 != r0) goto L6f
            return r0
        L6f:
            r1 = r7
            goto L4f
        L71:
            java.lang.Throwable r5 = O5.s.e(r11)
            if (r5 != 0) goto L9b
            e3.G r11 = (e3.C2783G) r11
            int r8 = 3 - r4
            u2.d r9 = r1.f36926e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "3DS2 challenge completion request was successful. "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = " retries attempted."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.b(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r3)
            goto Lb7
        L9b:
            r10 = 0
            r6.f36928a = r10
            r6.f36929b = r10
            r6.f36930c = r10
            r6.f36934g = r2
            r2 = r8
            r3 = r9
            java.lang.Object r11 = r1.h(r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
        Lb7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C3739a.f(com.stripe.android.stripe3ds2.transaction.h, A2.j$c, int, S5.d):java.lang.Object");
    }

    static /* synthetic */ Object g(C3739a c3739a, h hVar, j.c cVar, int i8, S5.d dVar, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = 3;
        }
        return c3739a.f(hVar, cVar, i8, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009b A[PHI: r11
      0x009b: PHI (r11v7 java.lang.Object) = (r11v6 java.lang.Object), (r11v1 java.lang.Object) binds: [B:17:0x0098, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.stripe.android.stripe3ds2.transaction.h r7, A2.j.c r8, int r9, java.lang.Throwable r10, S5.d r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof p3.C3739a.c
            if (r0 == 0) goto L13
            r0 = r11
            p3.a$c r0 = (p3.C3739a.c) r0
            int r1 = r0.f36941g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36941g = r1
            goto L18
        L13:
            p3.a$c r0 = new p3.a$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f36939e
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36941g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r11)
            goto L9b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r9 = r0.f36938d
            java.lang.Object r7 = r0.f36937c
            r8 = r7
            A2.j$c r8 = (A2.j.c) r8
            java.lang.Object r7 = r0.f36936b
            com.stripe.android.stripe3ds2.transaction.h r7 = (com.stripe.android.stripe3ds2.transaction.h) r7
            java.lang.Object r10 = r0.f36935a
            p3.a r10 = (p3.C3739a) r10
            O5.t.b(r11)
            goto L8a
        L47:
            O5.t.b(r11)
            u2.d r11 = r6.f36926e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "3DS2 challenge completion request failed. Remaining retries: "
            r2.append(r5)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r11.a(r2, r10)
            boolean r11 = r10 instanceof w2.AbstractC4144k
            r2 = 0
            if (r11 == 0) goto L6c
            w2.k r10 = (w2.AbstractC4144k) r10
            boolean r10 = r10.e()
            goto L6d
        L6c:
            r10 = 0
        L6d:
            if (r9 <= 0) goto L9c
            if (r10 == 0) goto L9c
            A2.B r10 = r6.f36925d
            r11 = 3
            long r10 = r10.a(r11, r9)
            r0.f36935a = r6
            r0.f36936b = r7
            r0.f36937c = r8
            r0.f36938d = r9
            r0.f36941g = r4
            java.lang.Object r10 = l6.X.c(r10, r0)
            if (r10 != r1) goto L89
            return r1
        L89:
            r10 = r6
        L8a:
            int r9 = r9 - r4
            r11 = 0
            r0.f36935a = r11
            r0.f36936b = r11
            r0.f36937c = r11
            r0.f36941g = r3
            java.lang.Object r11 = r10.f(r7, r8, r9, r0)
            if (r11 != r1) goto L9b
            return r1
        L9b:
            return r11
        L9c:
            u2.d r7 = r6.f36926e
            java.lang.String r8 = "Did not make a successful 3DS2 challenge completion request after retrying."
            r7.b(r8)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C3739a.h(com.stripe.android.stripe3ds2.transaction.h, A2.j$c, int, java.lang.Throwable, S5.d):java.lang.Object");
    }

    @Override // p3.d
    public Object a(h hVar, S5.d dVar) {
        return AbstractC3360i.g(this.f36927f, new d(hVar, this, null), dVar);
    }
}
