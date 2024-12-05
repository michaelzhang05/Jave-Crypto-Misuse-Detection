package com.stripe.android;

import A2.InterfaceC0945c;
import A2.j;
import O5.I;
import O5.p;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.a;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2658p;
import e3.InterfaceC2795i;
import h3.InterfaceC2899a;
import h3.m;
import i3.C2978a;
import i3.C2979b;
import i3.C2984g;
import i3.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.M;
import m2.s;
import o3.C3519a;
import o3.InterfaceC3526h;
import u2.InterfaceC4057d;
import v0.AbstractC4085a;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public final class b implements s {

    /* renamed from: q, reason: collision with root package name */
    public static final a f24521q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f24522r = 8;

    /* renamed from: s, reason: collision with root package name */
    private static final List f24523s = AbstractC1378t.e("payment_method");

    /* renamed from: t, reason: collision with root package name */
    private static final long f24524t = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f24525a;

    /* renamed from: b, reason: collision with root package name */
    private final m f24526b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24527c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0945c f24528d;

    /* renamed from: e, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f24529e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2899a f24530f;

    /* renamed from: g, reason: collision with root package name */
    private final S5.g f24531g;

    /* renamed from: h, reason: collision with root package name */
    private final C2979b f24532h;

    /* renamed from: i, reason: collision with root package name */
    private final C2984g f24533i;

    /* renamed from: j, reason: collision with root package name */
    private final j f24534j;

    /* renamed from: k, reason: collision with root package name */
    private final C2978a f24535k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f24536l;

    /* renamed from: m, reason: collision with root package name */
    private ActivityResultLauncher f24537m;

    /* renamed from: n, reason: collision with root package name */
    private final Function1 f24538n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f24539o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3526h f24540p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final long a() {
            return b.f24524t;
        }

        public final /* synthetic */ int b(StripeIntent intent) {
            AbstractC3255y.i(intent, "intent");
            if (intent instanceof n) {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }
            return 50001;
        }

        public final /* synthetic */ int c(InterfaceC2795i params) {
            AbstractC3255y.i(params, "params");
            if (params instanceof com.stripe.android.model.b) {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }
            if (params instanceof com.stripe.android.model.c) {
                return 50001;
            }
            throw new p();
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0448b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24541a;

        /* renamed from: c, reason: collision with root package name */
        int f24543c;

        C0448b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24541a = obj;
            this.f24543c |= Integer.MIN_VALUE;
            Object m8 = b.this.m(null, null, this);
            return m8 == T5.b.e() ? m8 : O5.s.a(m8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24544a;

        /* renamed from: c, reason: collision with root package name */
        int f24546c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24544a = obj;
            this.f24546c |= Integer.MIN_VALUE;
            Object n8 = b.this.n(null, null, this);
            return n8 == T5.b.e() ? n8 : O5.s.a(n8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24547a;

        /* renamed from: c, reason: collision with root package name */
        int f24549c;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24547a = obj;
            this.f24549c |= Integer.MIN_VALUE;
            Object d8 = b.this.d(null, this);
            return d8 == T5.b.e() ? d8 : O5.s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24550a;

        /* renamed from: c, reason: collision with root package name */
        int f24552c;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24550a = obj;
            this.f24552c |= Integer.MIN_VALUE;
            Object b8 = b.this.b(null, this);
            return b8 == T5.b.e() ? b8 : O5.s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24553a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2658p f24555c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f24556d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f24557e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC2658p interfaceC2658p, Throwable th, int i8, S5.d dVar) {
            super(2, dVar);
            this.f24555c = interfaceC2658p;
            this.f24556d = th;
            this.f24557e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f24555c, this.f24556d, this.f24557e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f24553a == 0) {
                t.b(obj);
                ((com.stripe.android.a) b.this.f24538n.invoke(this.f24555c)).a(new a.AbstractC0440a.b(AbstractC4144k.f40356e.b(this.f24556d), this.f24557e));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.a invoke(InterfaceC2658p host) {
            AbstractC3255y.i(host, "host");
            ActivityResultLauncher activityResultLauncher = b.this.f24537m;
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
        Object f24559a;

        /* renamed from: b, reason: collision with root package name */
        Object f24560b;

        /* renamed from: c, reason: collision with root package name */
        Object f24561c;

        /* renamed from: d, reason: collision with root package name */
        Object f24562d;

        /* renamed from: e, reason: collision with root package name */
        Object f24563e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f24564f;

        /* renamed from: h, reason: collision with root package name */
        int f24566h;

        h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24564f = obj;
            this.f24566h |= Integer.MIN_VALUE;
            return b.this.e(null, null, null, this);
        }
    }

    public b(Context context, Function0 publishableKeyProvider, m stripeRepository, boolean z8, S5.g workContext, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC2899a alipayRepository, S5.g uiContext) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(alipayRepository, "alipayRepository");
        AbstractC3255y.i(uiContext, "uiContext");
        this.f24525a = publishableKeyProvider;
        this.f24526b = stripeRepository;
        this.f24527c = z8;
        this.f24528d = analyticsRequestExecutor;
        this.f24529e = paymentAnalyticsRequestFactory;
        this.f24530f = alipayRepository;
        this.f24531g = uiContext;
        this.f24532h = new C2979b(context);
        InterfaceC4057d.a aVar = InterfaceC4057d.f39950a;
        this.f24533i = new C2984g(context, publishableKeyProvider, stripeRepository, aVar.a(z8), workContext);
        this.f24534j = new j(context, publishableKeyProvider, stripeRepository, aVar.a(z8), workContext);
        this.f24535k = C2978a.f32872b.a(context);
        boolean c8 = AbstractC4085a.c(context);
        this.f24536l = c8;
        this.f24538n = new g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f24539o = linkedHashMap;
        this.f24540p = C3519a.f35882h.a(context, paymentAnalyticsRequestFactory, z8, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.y(), c8, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(Function0 tmp0) {
        AbstractC3255y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.stripe.android.model.b r5, A2.j.c r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.b.C0448b
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.b$b r0 = (com.stripe.android.b.C0448b) r0
            int r1 = r0.f24543c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24543c = r1
            goto L18
        L13:
            com.stripe.android.b$b r0 = new com.stripe.android.b$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24541a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24543c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r5 = r7.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r7)
            h3.m r7 = r4.f24526b
            com.stripe.android.model.b r5 = r5.E(r3)
            java.util.List r2 = com.stripe.android.b.f24523s
            r0.f24543c = r3
            java.lang.Object r5 = r7.v(r5, r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.m(com.stripe.android.model.b, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.stripe.android.model.c r5, A2.j.c r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.b.c
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.b$c r0 = (com.stripe.android.b.c) r0
            int r1 = r0.f24546c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24546c = r1
            goto L18
        L13:
            com.stripe.android.b$c r0 = new com.stripe.android.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24544a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24546c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r5 = r7.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r7)
            h3.m r7 = r4.f24526b
            com.stripe.android.model.c r5 = r5.E(r3)
            java.util.List r2 = com.stripe.android.b.f24523s
            r0.f24546c = r3
            java.lang.Object r5 = r7.A(r5, r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.n(com.stripe.android.model.c, A2.j$c, S5.d):java.lang.Object");
    }

    private final Object o(InterfaceC2658p interfaceC2658p, int i8, Throwable th, S5.d dVar) {
        Object g8 = AbstractC3360i.g(this.f24531g, new f(interfaceC2658p, th, i8, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final void q(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (AbstractC3255y.d(str, this.f24535k.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25881O;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25880N;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25882P;
        }
        this.f24528d.a(PaymentAnalyticsRequestFactory.v(this.f24529e, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    @Override // m2.s
    public boolean a(int i8, Intent intent) {
        return i8 == 50001 && intent != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // m2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.content.Intent r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.b.e
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.b$e r0 = (com.stripe.android.b.e) r0
            int r1 = r0.f24552c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24552c = r1
            goto L18
        L13:
            com.stripe.android.b$e r0 = new com.stripe.android.b$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24550a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24552c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r6)
            O5.s r6 = (O5.s) r6
            java.lang.Object r5 = r6.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r6)
            i3.j r6 = r4.f24534j
            i3.c$a r2 = i3.C2980c.f32875h
            i3.c r5 = r2.b(r5)
            r0.f24552c = r3
            java.lang.Object r5 = r6.p(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.b(android.content.Intent, S5.d):java.lang.Object");
    }

    @Override // m2.s
    public boolean c(int i8, Intent intent) {
        return i8 == 50000 && intent != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // m2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(android.content.Intent r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.b.d
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.b$d r0 = (com.stripe.android.b.d) r0
            int r1 = r0.f24549c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24549c = r1
            goto L18
        L13:
            com.stripe.android.b$d r0 = new com.stripe.android.b$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24547a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24549c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r6)
            O5.s r6 = (O5.s) r6
            java.lang.Object r5 = r6.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r6)
            i3.g r6 = r4.f24533i
            i3.c$a r2 = i3.C2980c.f32875h
            i3.c r5 = r2.b(r5)
            r0.f24549c = r3
            java.lang.Object r5 = r6.p(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.d(android.content.Intent, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // m2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.stripe.android.view.InterfaceC2658p r10, e3.InterfaceC2795i r11, A2.j.c r12, S5.d r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.e(com.stripe.android.view.p, e3.i, A2.j$c, S5.d):java.lang.Object");
    }

    public Object p(InterfaceC2658p interfaceC2658p, StripeIntent stripeIntent, j.c cVar, S5.d dVar) {
        Object d8 = this.f24540p.a(stripeIntent).d(interfaceC2658p, stripeIntent, cVar, dVar);
        if (d8 == T5.b.e()) {
            return d8;
        }
        return I.f8278a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ b(android.content.Context r13, final kotlin.jvm.functions.Function0 r14, h3.m r15, boolean r16, S5.g r17, A2.InterfaceC0945c r18, com.stripe.android.networking.PaymentAnalyticsRequestFactory r19, h3.InterfaceC2899a r20, S5.g r21, int r22, kotlin.jvm.internal.AbstractC3247p r23) {
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
            l6.I r1 = l6.C3347b0.b()
            r7 = r1
            goto L17
        L15:
            r7 = r17
        L17:
            r1 = r0 & 32
            if (r1 == 0) goto L28
            A2.m r1 = new A2.m
            u2.d$a r2 = u2.InterfaceC4057d.f39950a
            u2.d r2 = r2.a(r6)
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
            kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
            m2.L r3 = new m2.L
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
            h3.b r1 = new h3.b
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
            l6.J0 r0 = l6.C3347b0.c()
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.<init>(android.content.Context, kotlin.jvm.functions.Function0, h3.m, boolean, S5.g, A2.c, com.stripe.android.networking.PaymentAnalyticsRequestFactory, h3.a, S5.g, int, kotlin.jvm.internal.p):void");
    }
}
