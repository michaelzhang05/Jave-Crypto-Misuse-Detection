package m3;

import L5.I;
import L5.p;
import L5.t;
import P5.g;
import X5.n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.stripe3ds2.transaction.h;
import e3.m;
import f3.C2662c;
import i6.AbstractC2825i;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;
import x2.InterfaceC3864B;
import x2.InterfaceC3873c;
import x2.j;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3396a implements m3.d {

    /* renamed from: g, reason: collision with root package name */
    private static final C0794a f34894g = new C0794a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f34895h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m f34896a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3873c f34897b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f34898c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3864B f34899d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3684d f34900e;

    /* renamed from: f, reason: collision with root package name */
    private final g f34901f;

    /* renamed from: m3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0794a {
        private C0794a() {
        }

        public /* synthetic */ C0794a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34902a;

        /* renamed from: b, reason: collision with root package name */
        Object f34903b;

        /* renamed from: c, reason: collision with root package name */
        Object f34904c;

        /* renamed from: d, reason: collision with root package name */
        int f34905d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f34906e;

        /* renamed from: g, reason: collision with root package name */
        int f34908g;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34906e = obj;
            this.f34908g |= Integer.MIN_VALUE;
            return C3396a.this.f(null, null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34909a;

        /* renamed from: b, reason: collision with root package name */
        Object f34910b;

        /* renamed from: c, reason: collision with root package name */
        Object f34911c;

        /* renamed from: d, reason: collision with root package name */
        int f34912d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f34913e;

        /* renamed from: g, reason: collision with root package name */
        int f34915g;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34913e = obj;
            this.f34915g |= Integer.MIN_VALUE;
            return C3396a.this.h(null, null, 0, null, this);
        }
    }

    /* renamed from: m3.a$d */
    /* loaded from: classes4.dex */
    static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f34916a;

        /* renamed from: b, reason: collision with root package name */
        int f34917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f34918c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3396a f34919d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar, C3396a c3396a, P5.d dVar) {
            super(2, dVar);
            this.f34918c = hVar;
            this.f34919d = c3396a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f34918c, this.f34919d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            j.c cVar;
            Object e8 = Q5.b.e();
            int i8 = this.f34917b;
            int i9 = 1;
            if (i8 != 0) {
                if (i8 == 1) {
                    cVar = (j.c) this.f34916a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                h hVar = this.f34918c;
                if (hVar instanceof h.f) {
                    this.f34919d.f34897b.a(this.f34919d.f34898c.p(PaymentAnalyticsEvent.f24836Y, ((h.f) this.f34918c).f()));
                } else if (hVar instanceof h.c) {
                    this.f34919d.f34897b.a(this.f34919d.f34898c.p(PaymentAnalyticsEvent.f24836Y, ((h.c) this.f34918c).f()));
                } else if (hVar instanceof h.a) {
                    this.f34919d.f34897b.a(this.f34919d.f34898c.p(PaymentAnalyticsEvent.f24835X, ((h.a) this.f34918c).f()));
                } else if (hVar instanceof h.d) {
                    this.f34919d.f34897b.a(PaymentAnalyticsRequestFactory.v(this.f34919d.f34898c, PaymentAnalyticsEvent.f24837Z, null, null, null, null, null, 62, null));
                } else if (hVar instanceof h.e) {
                    this.f34919d.f34897b.a(PaymentAnalyticsRequestFactory.v(this.f34919d.f34898c, PaymentAnalyticsEvent.f24837Z, null, null, null, null, null, 62, null));
                } else if (hVar instanceof h.g) {
                    this.f34919d.f34897b.a(this.f34919d.f34898c.p(PaymentAnalyticsEvent.f24853p0, ((h.g) this.f34918c).f()));
                }
                InterfaceC3873c interfaceC3873c = this.f34919d.f34897b;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = this.f34919d.f34898c;
                PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.f24834W;
                Y3.g b8 = this.f34918c.b();
                if (b8 != null) {
                    str = b8.b();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                interfaceC3873c.a(paymentAnalyticsRequestFactory.p(paymentAnalyticsEvent, str));
                j.c cVar2 = new j.c(this.f34918c.c().e(), this.f34918c.c().c(), null, 4, null);
                C3396a c3396a = this.f34919d;
                h hVar2 = this.f34918c;
                this.f34916a = cVar2;
                this.f34917b = 1;
                Object g8 = C3396a.g(c3396a, hVar2, cVar2, 0, this, 4, null);
                if (g8 == e8) {
                    return e8;
                }
                cVar = cVar2;
                obj = g8;
            }
            if (((Boolean) obj).booleanValue()) {
                h hVar3 = this.f34918c;
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
                return new C2662c(this.f34918c.c().d(), i9, null, false, null, null, cVar.j(), 60, null);
            }
            i9 = 2;
            return new C2662c(this.f34918c.c().d(), i9, null, false, null, null, cVar.j(), 60, null);
        }
    }

    public C3396a(m stripeRepository, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC3864B retryDelaySupplier, InterfaceC3684d logger, g workContext) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(retryDelaySupplier, "retryDelaySupplier");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(workContext, "workContext");
        this.f34896a = stripeRepository;
        this.f34897b = analyticsRequestExecutor;
        this.f34898c = paymentAnalyticsRequestFactory;
        this.f34899d = retryDelaySupplier;
        this.f34900e = logger;
        this.f34901f = workContext;
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
    public final java.lang.Object f(com.stripe.android.stripe3ds2.transaction.h r8, x2.j.c r9, int r10, P5.d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof m3.C3396a.b
            if (r0 == 0) goto L14
            r0 = r11
            m3.a$b r0 = (m3.C3396a.b) r0
            int r1 = r0.f34908g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f34908g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            m3.a$b r0 = new m3.a$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f34906e
            java.lang.Object r0 = Q5.b.e()
            int r1 = r6.f34908g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L51
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            L5.t.b(r11)
            goto Lad
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r10 = r6.f34905d
            java.lang.Object r8 = r6.f34904c
            r9 = r8
            x2.j$c r9 = (x2.j.c) r9
            java.lang.Object r8 = r6.f34903b
            com.stripe.android.stripe3ds2.transaction.h r8 = (com.stripe.android.stripe3ds2.transaction.h) r8
            java.lang.Object r1 = r6.f34902a
            m3.a r1 = (m3.C3396a) r1
            L5.t.b(r11)
            L5.s r11 = (L5.s) r11
            java.lang.Object r11 = r11.k()
        L4f:
            r4 = r10
            goto L71
        L51:
            L5.t.b(r11)
            e3.m r11 = r7.f34896a
            com.stripe.android.stripe3ds2.transaction.n r1 = r8.c()
            java.lang.String r1 = r1.f()
            r6.f34902a = r7
            r6.f34903b = r8
            r6.f34904c = r9
            r6.f34905d = r10
            r6.f34908g = r3
            java.lang.Object r11 = r11.d(r1, r9, r6)
            if (r11 != r0) goto L6f
            return r0
        L6f:
            r1 = r7
            goto L4f
        L71:
            java.lang.Throwable r5 = L5.s.e(r11)
            if (r5 != 0) goto L9b
            b3.G r11 = (b3.C1862G) r11
            int r8 = 3 - r4
            r2.d r9 = r1.f34900e
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
            r6.f34902a = r10
            r6.f34903b = r10
            r6.f34904c = r10
            r6.f34908g = r2
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
        throw new UnsupportedOperationException("Method not decompiled: m3.C3396a.f(com.stripe.android.stripe3ds2.transaction.h, x2.j$c, int, P5.d):java.lang.Object");
    }

    static /* synthetic */ Object g(C3396a c3396a, h hVar, j.c cVar, int i8, P5.d dVar, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = 3;
        }
        return c3396a.f(hVar, cVar, i8, dVar);
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
    public final java.lang.Object h(com.stripe.android.stripe3ds2.transaction.h r7, x2.j.c r8, int r9, java.lang.Throwable r10, P5.d r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof m3.C3396a.c
            if (r0 == 0) goto L13
            r0 = r11
            m3.a$c r0 = (m3.C3396a.c) r0
            int r1 = r0.f34915g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34915g = r1
            goto L18
        L13:
            m3.a$c r0 = new m3.a$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f34913e
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34915g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r11)
            goto L9b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r9 = r0.f34912d
            java.lang.Object r7 = r0.f34911c
            r8 = r7
            x2.j$c r8 = (x2.j.c) r8
            java.lang.Object r7 = r0.f34910b
            com.stripe.android.stripe3ds2.transaction.h r7 = (com.stripe.android.stripe3ds2.transaction.h) r7
            java.lang.Object r10 = r0.f34909a
            m3.a r10 = (m3.C3396a) r10
            L5.t.b(r11)
            goto L8a
        L47:
            L5.t.b(r11)
            r2.d r11 = r6.f34900e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "3DS2 challenge completion request failed. Remaining retries: "
            r2.append(r5)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r11.a(r2, r10)
            boolean r11 = r10 instanceof t2.AbstractC3790k
            r2 = 0
            if (r11 == 0) goto L6c
            t2.k r10 = (t2.AbstractC3790k) r10
            boolean r10 = r10.e()
            goto L6d
        L6c:
            r10 = 0
        L6d:
            if (r9 <= 0) goto L9c
            if (r10 == 0) goto L9c
            x2.B r10 = r6.f34899d
            r11 = 3
            long r10 = r10.a(r11, r9)
            r0.f34909a = r6
            r0.f34910b = r7
            r0.f34911c = r8
            r0.f34912d = r9
            r0.f34915g = r4
            java.lang.Object r10 = i6.X.c(r10, r0)
            if (r10 != r1) goto L89
            return r1
        L89:
            r10 = r6
        L8a:
            int r9 = r9 - r4
            r11 = 0
            r0.f34909a = r11
            r0.f34910b = r11
            r0.f34911c = r11
            r0.f34915g = r3
            java.lang.Object r11 = r10.f(r7, r8, r9, r0)
            if (r11 != r1) goto L9b
            return r1
        L9b:
            return r11
        L9c:
            r2.d r7 = r6.f34900e
            java.lang.String r8 = "Did not make a successful 3DS2 challenge completion request after retrying."
            r7.b(r8)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C3396a.h(com.stripe.android.stripe3ds2.transaction.h, x2.j$c, int, java.lang.Throwable, P5.d):java.lang.Object");
    }

    @Override // m3.d
    public Object a(h hVar, P5.d dVar) {
        return AbstractC2825i.g(this.f34901f, new d(hVar, this, null), dVar);
    }
}
