package l3;

import L5.I;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2464p;
import f3.C2660a;
import i6.AbstractC2825i;
import i6.M;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import x2.InterfaceC3873c;

/* renamed from: l3.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3189s extends AbstractC3176f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f33955a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3873c f33956b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f33957c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33958d;

    /* renamed from: e, reason: collision with root package name */
    private final P5.g f33959e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f33960f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f33961g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f33962h;

    /* renamed from: i, reason: collision with root package name */
    private final C2660a f33963i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3181k f33964j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.s$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f33965a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2464p f33967c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StripeIntent f33968d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33969e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f33970f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f33971g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f33972h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f33973i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f33974j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f33975k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f33976l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f33977m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2464p interfaceC2464p, StripeIntent stripeIntent, int i8, String str, String str2, String str3, String str4, boolean z8, boolean z9, String str5, boolean z10, P5.d dVar) {
            super(2, dVar);
            this.f33967c = interfaceC2464p;
            this.f33968d = stripeIntent;
            this.f33969e = i8;
            this.f33970f = str;
            this.f33971g = str2;
            this.f33972h = str3;
            this.f33973i = str4;
            this.f33974j = z8;
            this.f33975k = z9;
            this.f33976l = str5;
            this.f33977m = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f33967c, this.f33968d, this.f33969e, this.f33970f, this.f33971g, this.f33972h, this.f33973i, this.f33974j, this.f33975k, this.f33976l, this.f33977m, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f33965a == 0) {
                L5.t.b(obj);
                j2.q qVar = (j2.q) C3189s.this.f33955a.invoke(this.f33967c);
                String id = this.f33968d.getId();
                if (id == null) {
                    id = "";
                }
                qVar.a(new PaymentBrowserAuthContract.a(id, this.f33969e, this.f33970f, this.f33971g, this.f33972h, C3189s.this.f33958d, null, this.f33973i, this.f33974j, this.f33975k, this.f33967c.b(), (String) C3189s.this.f33961g.invoke(), C3189s.this.f33962h, this.f33976l, this.f33977m, 64, null));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.s$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33978a;

        /* renamed from: b, reason: collision with root package name */
        Object f33979b;

        /* renamed from: c, reason: collision with root package name */
        Object f33980c;

        /* renamed from: d, reason: collision with root package name */
        Object f33981d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f33982e;

        /* renamed from: g, reason: collision with root package name */
        int f33984g;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33982e = obj;
            this.f33984g |= Integer.MIN_VALUE;
            return C3189s.this.e(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.s$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33985a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f33986b;

        /* renamed from: d, reason: collision with root package name */
        int f33988d;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33986b = obj;
            this.f33988d |= Integer.MIN_VALUE;
            return C3189s.this.m(null, null, this);
        }
    }

    public C3189s(Function1 paymentBrowserAuthStarterFactory, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, P5.g uiContext, Map threeDs1IntentReturnUrlMap, Function0 publishableKeyProvider, boolean z9, C2660a defaultReturnUrl, InterfaceC3181k redirectResolver) {
        AbstractC3159y.i(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(uiContext, "uiContext");
        AbstractC3159y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(defaultReturnUrl, "defaultReturnUrl");
        AbstractC3159y.i(redirectResolver, "redirectResolver");
        this.f33955a = paymentBrowserAuthStarterFactory;
        this.f33956b = analyticsRequestExecutor;
        this.f33957c = paymentAnalyticsRequestFactory;
        this.f33958d = z8;
        this.f33959e = uiContext;
        this.f33960f = threeDs1IntentReturnUrlMap;
        this.f33961g = publishableKeyProvider;
        this.f33962h = z9;
        this.f33963i = defaultReturnUrl;
        this.f33964j = redirectResolver;
    }

    private final Object k(InterfaceC2464p interfaceC2464p, StripeIntent stripeIntent, int i8, String str, String str2, String str3, String str4, boolean z8, boolean z9, String str5, boolean z10, P5.d dVar) {
        Object g8 = AbstractC2825i.g(this.f33959e, new a(interfaceC2464p, stripeIntent, i8, str, str2, str4, str3, z8, z9, str5, z10, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.stripe.android.model.StripeIntent.a.i r22, com.stripe.android.model.StripeIntent r23, P5.d r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof l3.C3189s.c
            if (r2 == 0) goto L17
            r2 = r1
            l3.s$c r2 = (l3.C3189s.c) r2
            int r3 = r2.f33988d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f33988d = r3
            goto L1c
        L17:
            l3.s$c r2 = new l3.s$c
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f33986b
            java.lang.Object r3 = Q5.b.e()
            int r4 = r2.f33988d
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.f33985a
            com.stripe.android.model.StripeIntent$a$i r2 = (com.stripe.android.model.StripeIntent.a.i) r2
            L5.t.b(r1)
            goto L82
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            L5.t.b(r1)
            x2.c r1 = r0.f33956b
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r6 = r0.f33957c
            com.stripe.android.networking.PaymentAnalyticsEvent r7 = com.stripe.android.networking.PaymentAnalyticsEvent.f24857r0
            r13 = 62
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            x2.b r4 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.a(r4)
            com.stripe.android.model.o r1 = r23.v()
            if (r1 == 0) goto L5a
            java.lang.String r1 = r1.f24411d
            goto L5b
        L5a:
            r1 = 0
        L5b:
            com.stripe.android.model.o$p r4 = com.stripe.android.model.o.p.f24510C
            java.lang.String r4 = r4.f24550a
            boolean r1 = kotlin.jvm.internal.AbstractC3159y.d(r1, r4)
            java.lang.String r4 = "toString(...)"
            if (r1 == 0) goto L9d
            l3.k r1 = r0.f33964j
            android.net.Uri r6 = r22.c()
            java.lang.String r6 = r6.toString()
            kotlin.jvm.internal.AbstractC3159y.h(r6, r4)
            r7 = r22
            r2.f33985a = r7
            r2.f33988d = r5
            java.lang.Object r1 = r1.a(r6, r2)
            if (r1 != r3) goto L81
            return r3
        L81:
            r2 = r7
        L82:
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r2.x()
            android.net.Uri r1 = r2.c()
            java.lang.String r8 = r1.toString()
            l3.r r1 = new l3.r
            r7 = 0
            r9 = 1
            r6 = 0
            r10 = 4
            r11 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lbf
        L9d:
            r7 = r22
            l3.r r1 = new l3.r
            android.net.Uri r2 = r22.c()
            java.lang.String r13 = r2.toString()
            kotlin.jvm.internal.AbstractC3159y.h(r13, r4)
            java.lang.String r14 = r22.x()
            r19 = 60
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C3189s.m(com.stripe.android.model.StripeIntent$a$i, com.stripe.android.model.StripeIntent, P5.d):java.lang.Object");
    }

    private final C3188r n(StripeIntent.a.C0480a c0480a) {
        this.f33956b.a(PaymentAnalyticsRequestFactory.v(this.f33957c, PaymentAnalyticsEvent.f24857r0, null, null, null, null, null, 62, null));
        String uri = c0480a.c().toString();
        AbstractC3159y.h(uri, "toString(...)");
        return new C3188r(uri, c0480a.x(), false, false, null, false, 60, null);
    }

    private final C3188r o(StripeIntent.a.c cVar) {
        return new C3188r(cVar.c(), this.f33963i.a(), false, false, null, false, 52, null);
    }

    private final C3188r p(StripeIntent.a.h hVar, StripeIntent stripeIntent) {
        String str;
        String b8 = hVar.b();
        AbstractC3159y.f(b8);
        String str2 = null;
        if (b8.length() > 0) {
            str = b8;
        } else {
            str = null;
        }
        if (str == null) {
            StripeIntent.NextActionType m8 = stripeIntent.m();
            if (m8 != null) {
                str2 = m8.b();
            }
            throw new IllegalArgumentException("null hostedVoucherUrl for " + str2);
        }
        return new C3188r(str, null, false, false, null, false, 52, null);
    }

    private final C3188r q(StripeIntent.a.j.C0489a c0489a, StripeIntent stripeIntent) {
        String str;
        this.f33956b.a(PaymentAnalyticsRequestFactory.v(this.f33957c, PaymentAnalyticsEvent.f24818G, null, null, null, null, null, 62, null));
        String c8 = c0489a.c();
        String id = stripeIntent.getId();
        if (id != null) {
            str = (String) this.f33960f.remove(id);
        } else {
            str = null;
        }
        return new C3188r(c8, str, true, false, null, false, 56, null);
    }

    private final C3188r r(StripeIntent.a.k kVar) {
        return new C3188r(kVar.c(), this.f33963i.a(), false, false, null, false, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // l3.AbstractC3176f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.stripe.android.view.InterfaceC2464p r19, com.stripe.android.model.StripeIntent r20, x2.j.c r21, P5.d r22) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C3189s.e(com.stripe.android.view.p, com.stripe.android.model.StripeIntent, x2.j$c, P5.d):java.lang.Object");
    }
}
