package com.stripe.android;

import L5.I;
import L5.p;
import L5.t;
import M5.AbstractC1246t;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import b3.InterfaceC1874i;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.a;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2464p;
import e3.InterfaceC2579a;
import e3.m;
import f3.C2660a;
import f3.C2661b;
import f3.C2666g;
import f3.j;
import i6.AbstractC2825i;
import i6.M;
import j2.s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l3.C3171a;
import l3.InterfaceC3178h;
import r2.InterfaceC3684d;
import t2.AbstractC3790k;
import w0.AbstractC3839a;
import x2.InterfaceC3873c;
import x2.j;

/* loaded from: classes4.dex */
public final class b implements s {

    /* renamed from: q, reason: collision with root package name */
    public static final a f23466q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f23467r = 8;

    /* renamed from: s, reason: collision with root package name */
    private static final List f23468s = AbstractC1246t.e("payment_method");

    /* renamed from: t, reason: collision with root package name */
    private static final long f23469t = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f23470a;

    /* renamed from: b, reason: collision with root package name */
    private final m f23471b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23472c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3873c f23473d;

    /* renamed from: e, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f23474e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2579a f23475f;

    /* renamed from: g, reason: collision with root package name */
    private final P5.g f23476g;

    /* renamed from: h, reason: collision with root package name */
    private final C2661b f23477h;

    /* renamed from: i, reason: collision with root package name */
    private final C2666g f23478i;

    /* renamed from: j, reason: collision with root package name */
    private final j f23479j;

    /* renamed from: k, reason: collision with root package name */
    private final C2660a f23480k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f23481l;

    /* renamed from: m, reason: collision with root package name */
    private ActivityResultLauncher f23482m;

    /* renamed from: n, reason: collision with root package name */
    private final Function1 f23483n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f23484o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3178h f23485p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final long a() {
            return b.f23469t;
        }

        public final /* synthetic */ int b(InterfaceC1874i params) {
            AbstractC3159y.i(params, "params");
            if (params instanceof com.stripe.android.model.b) {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }
            if (params instanceof com.stripe.android.model.c) {
                return 50001;
            }
            throw new p();
        }

        public final /* synthetic */ int c(StripeIntent intent) {
            AbstractC3159y.i(intent, "intent");
            if (intent instanceof n) {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }
            return 50001;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0452b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23486a;

        /* renamed from: c, reason: collision with root package name */
        int f23488c;

        C0452b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23486a = obj;
            this.f23488c |= Integer.MIN_VALUE;
            Object m8 = b.this.m(null, null, this);
            return m8 == Q5.b.e() ? m8 : L5.s.a(m8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23489a;

        /* renamed from: c, reason: collision with root package name */
        int f23491c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23489a = obj;
            this.f23491c |= Integer.MIN_VALUE;
            Object n8 = b.this.n(null, null, this);
            return n8 == Q5.b.e() ? n8 : L5.s.a(n8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23492a;

        /* renamed from: c, reason: collision with root package name */
        int f23494c;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23492a = obj;
            this.f23494c |= Integer.MIN_VALUE;
            Object d8 = b.this.d(null, this);
            return d8 == Q5.b.e() ? d8 : L5.s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23495a;

        /* renamed from: c, reason: collision with root package name */
        int f23497c;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23495a = obj;
            this.f23497c |= Integer.MIN_VALUE;
            Object e8 = b.this.e(null, this);
            return e8 == Q5.b.e() ? e8 : L5.s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23498a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2464p f23500c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f23501d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f23502e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC2464p interfaceC2464p, Throwable th, int i8, P5.d dVar) {
            super(2, dVar);
            this.f23500c = interfaceC2464p;
            this.f23501d = th;
            this.f23502e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f23500c, this.f23501d, this.f23502e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f23498a == 0) {
                t.b(obj);
                ((com.stripe.android.a) b.this.f23483n.invoke(this.f23500c)).a(new a.AbstractC0444a.b(AbstractC3790k.f38229e.b(this.f23501d), this.f23502e));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.a invoke(InterfaceC2464p host) {
            AbstractC3159y.i(host, "host");
            ActivityResultLauncher activityResultLauncher = b.this.f23482m;
            if (activityResultLauncher != null) {
                return new a.c(activityResultLauncher);
            }
            return new a.b(host);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23504a;

        /* renamed from: b, reason: collision with root package name */
        Object f23505b;

        /* renamed from: c, reason: collision with root package name */
        Object f23506c;

        /* renamed from: d, reason: collision with root package name */
        Object f23507d;

        /* renamed from: e, reason: collision with root package name */
        Object f23508e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23509f;

        /* renamed from: h, reason: collision with root package name */
        int f23511h;

        h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23509f = obj;
            this.f23511h |= Integer.MIN_VALUE;
            return b.this.c(null, null, null, this);
        }
    }

    public b(Context context, Function0 publishableKeyProvider, m stripeRepository, boolean z8, P5.g workContext, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC2579a alipayRepository, P5.g uiContext) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(alipayRepository, "alipayRepository");
        AbstractC3159y.i(uiContext, "uiContext");
        this.f23470a = publishableKeyProvider;
        this.f23471b = stripeRepository;
        this.f23472c = z8;
        this.f23473d = analyticsRequestExecutor;
        this.f23474e = paymentAnalyticsRequestFactory;
        this.f23475f = alipayRepository;
        this.f23476g = uiContext;
        this.f23477h = new C2661b(context);
        InterfaceC3684d.a aVar = InterfaceC3684d.f37570a;
        this.f23478i = new C2666g(context, publishableKeyProvider, stripeRepository, aVar.a(z8), workContext);
        this.f23479j = new j(context, publishableKeyProvider, stripeRepository, aVar.a(z8), workContext);
        this.f23480k = C2660a.f31009b.a(context);
        boolean c8 = AbstractC3839a.c(context);
        this.f23481l = c8;
        this.f23483n = new g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f23484o = linkedHashMap;
        this.f23485p = C3171a.f33881h.a(context, paymentAnalyticsRequestFactory, z8, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.y(), c8, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(Function0 tmp0) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.stripe.android.model.b r5, x2.j.c r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.b.C0452b
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.b$b r0 = (com.stripe.android.b.C0452b) r0
            int r1 = r0.f23488c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23488c = r1
            goto L18
        L13:
            com.stripe.android.b$b r0 = new com.stripe.android.b$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23486a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23488c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r5 = r7.k()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r7)
            e3.m r7 = r4.f23471b
            com.stripe.android.model.b r5 = r5.C(r3)
            java.util.List r2 = com.stripe.android.b.f23468s
            r0.f23488c = r3
            java.lang.Object r5 = r7.s(r5, r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.m(com.stripe.android.model.b, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.stripe.android.model.c r5, x2.j.c r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.b.c
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.b$c r0 = (com.stripe.android.b.c) r0
            int r1 = r0.f23491c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23491c = r1
            goto L18
        L13:
            com.stripe.android.b$c r0 = new com.stripe.android.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23489a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23491c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r5 = r7.k()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r7)
            e3.m r7 = r4.f23471b
            com.stripe.android.model.c r5 = r5.C(r3)
            java.util.List r2 = com.stripe.android.b.f23468s
            r0.f23491c = r3
            java.lang.Object r5 = r7.e(r5, r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.n(com.stripe.android.model.c, x2.j$c, P5.d):java.lang.Object");
    }

    private final Object o(InterfaceC2464p interfaceC2464p, int i8, Throwable th, P5.d dVar) {
        Object g8 = AbstractC2825i.g(this.f23476g, new f(interfaceC2464p, th, i8, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final void q(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (AbstractC3159y.d(str, this.f23480k.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24826O;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24825N;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24827P;
        }
        this.f23473d.a(PaymentAnalyticsRequestFactory.v(this.f23474e, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    @Override // j2.s
    public boolean a(int i8, Intent intent) {
        return i8 == 50001 && intent != null;
    }

    @Override // j2.s
    public boolean b(int i8, Intent intent) {
        return i8 == 50000 && intent != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // j2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(com.stripe.android.view.InterfaceC2464p r10, b3.InterfaceC1874i r11, x2.j.c r12, P5.d r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.c(com.stripe.android.view.p, b3.i, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(android.content.Intent r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.b.d
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.b$d r0 = (com.stripe.android.b.d) r0
            int r1 = r0.f23494c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23494c = r1
            goto L18
        L13:
            com.stripe.android.b$d r0 = new com.stripe.android.b$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23492a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23494c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r6)
            L5.s r6 = (L5.s) r6
            java.lang.Object r5 = r6.k()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r6)
            f3.g r6 = r4.f23478i
            f3.c$a r2 = f3.C2662c.f31012h
            f3.c r5 = r2.b(r5)
            r0.f23494c = r3
            java.lang.Object r5 = r6.p(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.d(android.content.Intent, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(android.content.Intent r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.b.e
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.b$e r0 = (com.stripe.android.b.e) r0
            int r1 = r0.f23497c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23497c = r1
            goto L18
        L13:
            com.stripe.android.b$e r0 = new com.stripe.android.b$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23495a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23497c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r6)
            L5.s r6 = (L5.s) r6
            java.lang.Object r5 = r6.k()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r6)
            f3.j r6 = r4.f23479j
            f3.c$a r2 = f3.C2662c.f31012h
            f3.c r5 = r2.b(r5)
            r0.f23497c = r3
            java.lang.Object r5 = r6.p(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.e(android.content.Intent, P5.d):java.lang.Object");
    }

    public Object p(InterfaceC2464p interfaceC2464p, StripeIntent stripeIntent, j.c cVar, P5.d dVar) {
        Object d8 = this.f23485p.a(stripeIntent).d(interfaceC2464p, stripeIntent, cVar, dVar);
        if (d8 == Q5.b.e()) {
            return d8;
        }
        return I.f6487a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ b(android.content.Context r13, final kotlin.jvm.functions.Function0 r14, e3.m r15, boolean r16, P5.g r17, x2.InterfaceC3873c r18, com.stripe.android.networking.PaymentAnalyticsRequestFactory r19, e3.InterfaceC2579a r20, P5.g r21, int r22, kotlin.jvm.internal.AbstractC3151p r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 0
            r6 = 0
            goto Lb
        L9:
            r6 = r16
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L15
            i6.I r1 = i6.C2812b0.b()
            r7 = r1
            goto L17
        L15:
            r7 = r17
        L17:
            r1 = r0 & 32
            if (r1 == 0) goto L28
            x2.m r1 = new x2.m
            r2.d$a r2 = r2.InterfaceC3684d.f37570a
            r2.d r2 = r2.a(r6)
            r1.<init>(r2, r7)
            r8 = r1
            goto L2a
        L28:
            r8 = r18
        L2a:
            r1 = r0 & 64
            if (r1 == 0) goto L44
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r1 = new com.stripe.android.networking.PaymentAnalyticsRequestFactory
            android.content.Context r2 = r13.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
            j2.L r3 = new j2.L
            r4 = r14
            r3.<init>()
            r1.<init>(r2, r3)
            r9 = r1
            goto L47
        L44:
            r4 = r14
            r9 = r19
        L47:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L53
            e3.b r1 = new e3.b
            r5 = r15
            r1.<init>(r15)
            r10 = r1
            goto L56
        L53:
            r5 = r15
            r10 = r20
        L56:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L60
            i6.J0 r0 = i6.C2812b0.c()
            r11 = r0
            goto L62
        L60:
            r11 = r21
        L62:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.<init>(android.content.Context, kotlin.jvm.functions.Function0, e3.m, boolean, P5.g, x2.c, com.stripe.android.networking.PaymentAnalyticsRequestFactory, e3.a, P5.g, int, kotlin.jvm.internal.p):void");
    }
}
