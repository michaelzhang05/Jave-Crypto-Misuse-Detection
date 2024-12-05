package o3;

import A2.InterfaceC0945c;
import O5.I;
import a6.InterfaceC1668n;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2658p;
import i3.C2978a;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;

/* renamed from: o3.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3537s extends AbstractC3524f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f35956a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0945c f35957b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f35958c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35959d;

    /* renamed from: e, reason: collision with root package name */
    private final S5.g f35960e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f35961f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f35962g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f35963h;

    /* renamed from: i, reason: collision with root package name */
    private final C2978a f35964i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3529k f35965j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o3.s$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35966a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2658p f35968c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StripeIntent f35969d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35970e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f35971f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f35972g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f35973h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f35974i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f35975j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f35976k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f35977l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f35978m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2658p interfaceC2658p, StripeIntent stripeIntent, int i8, String str, String str2, String str3, String str4, boolean z8, boolean z9, String str5, boolean z10, S5.d dVar) {
            super(2, dVar);
            this.f35968c = interfaceC2658p;
            this.f35969d = stripeIntent;
            this.f35970e = i8;
            this.f35971f = str;
            this.f35972g = str2;
            this.f35973h = str3;
            this.f35974i = str4;
            this.f35975j = z8;
            this.f35976k = z9;
            this.f35977l = str5;
            this.f35978m = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f35968c, this.f35969d, this.f35970e, this.f35971f, this.f35972g, this.f35973h, this.f35974i, this.f35975j, this.f35976k, this.f35977l, this.f35978m, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f35966a == 0) {
                O5.t.b(obj);
                m2.q qVar = (m2.q) C3537s.this.f35956a.invoke(this.f35968c);
                String id = this.f35969d.getId();
                if (id == null) {
                    id = "";
                }
                qVar.a(new PaymentBrowserAuthContract.a(id, this.f35970e, this.f35971f, this.f35972g, this.f35973h, C3537s.this.f35959d, null, this.f35974i, this.f35975j, this.f35976k, this.f35968c.a(), (String) C3537s.this.f35962g.invoke(), C3537s.this.f35963h, this.f35977l, this.f35978m, 64, null));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o3.s$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35979a;

        /* renamed from: b, reason: collision with root package name */
        Object f35980b;

        /* renamed from: c, reason: collision with root package name */
        Object f35981c;

        /* renamed from: d, reason: collision with root package name */
        Object f35982d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35983e;

        /* renamed from: g, reason: collision with root package name */
        int f35985g;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35983e = obj;
            this.f35985g |= Integer.MIN_VALUE;
            return C3537s.this.e(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o3.s$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35986a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35987b;

        /* renamed from: d, reason: collision with root package name */
        int f35989d;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35987b = obj;
            this.f35989d |= Integer.MIN_VALUE;
            return C3537s.this.m(null, null, this);
        }
    }

    public C3537s(Function1 paymentBrowserAuthStarterFactory, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, S5.g uiContext, Map threeDs1IntentReturnUrlMap, Function0 publishableKeyProvider, boolean z9, C2978a defaultReturnUrl, InterfaceC3529k redirectResolver) {
        AbstractC3255y.i(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(uiContext, "uiContext");
        AbstractC3255y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(defaultReturnUrl, "defaultReturnUrl");
        AbstractC3255y.i(redirectResolver, "redirectResolver");
        this.f35956a = paymentBrowserAuthStarterFactory;
        this.f35957b = analyticsRequestExecutor;
        this.f35958c = paymentAnalyticsRequestFactory;
        this.f35959d = z8;
        this.f35960e = uiContext;
        this.f35961f = threeDs1IntentReturnUrlMap;
        this.f35962g = publishableKeyProvider;
        this.f35963h = z9;
        this.f35964i = defaultReturnUrl;
        this.f35965j = redirectResolver;
    }

    private final Object k(InterfaceC2658p interfaceC2658p, StripeIntent stripeIntent, int i8, String str, String str2, String str3, String str4, boolean z8, boolean z9, String str5, boolean z10, S5.d dVar) {
        Object g8 = AbstractC3360i.g(this.f35960e, new a(interfaceC2658p, stripeIntent, i8, str, str2, str4, str3, z8, z9, str5, z10, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.stripe.android.model.StripeIntent.a.i r22, com.stripe.android.model.StripeIntent r23, S5.d r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof o3.C3537s.c
            if (r2 == 0) goto L17
            r2 = r1
            o3.s$c r2 = (o3.C3537s.c) r2
            int r3 = r2.f35989d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f35989d = r3
            goto L1c
        L17:
            o3.s$c r2 = new o3.s$c
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f35987b
            java.lang.Object r3 = T5.b.e()
            int r4 = r2.f35989d
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.f35986a
            com.stripe.android.model.StripeIntent$a$i r2 = (com.stripe.android.model.StripeIntent.a.i) r2
            O5.t.b(r1)
            goto L82
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            O5.t.b(r1)
            A2.c r1 = r0.f35957b
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r6 = r0.f35958c
            com.stripe.android.networking.PaymentAnalyticsEvent r7 = com.stripe.android.networking.PaymentAnalyticsEvent.f25912r0
            r13 = 62
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            A2.b r4 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.a(r4)
            com.stripe.android.model.o r1 = r23.r()
            if (r1 == 0) goto L5a
            java.lang.String r1 = r1.f25466d
            goto L5b
        L5a:
            r1 = 0
        L5b:
            com.stripe.android.model.o$p r4 = com.stripe.android.model.o.p.f25565C
            java.lang.String r4 = r4.f25605a
            boolean r1 = kotlin.jvm.internal.AbstractC3255y.d(r1, r4)
            java.lang.String r4 = "toString(...)"
            if (r1 == 0) goto L9d
            o3.k r1 = r0.f35965j
            android.net.Uri r6 = r22.b()
            java.lang.String r6 = r6.toString()
            kotlin.jvm.internal.AbstractC3255y.h(r6, r4)
            r7 = r22
            r2.f35986a = r7
            r2.f35989d = r5
            java.lang.Object r1 = r1.a(r6, r2)
            if (r1 != r3) goto L81
            return r3
        L81:
            r2 = r7
        L82:
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r2.A()
            android.net.Uri r1 = r2.b()
            java.lang.String r8 = r1.toString()
            o3.r r1 = new o3.r
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
            o3.r r1 = new o3.r
            android.net.Uri r2 = r22.b()
            java.lang.String r13 = r2.toString()
            kotlin.jvm.internal.AbstractC3255y.h(r13, r4)
            java.lang.String r14 = r22.A()
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
        throw new UnsupportedOperationException("Method not decompiled: o3.C3537s.m(com.stripe.android.model.StripeIntent$a$i, com.stripe.android.model.StripeIntent, S5.d):java.lang.Object");
    }

    private final C3536r n(StripeIntent.a.C0476a c0476a) {
        this.f35957b.a(PaymentAnalyticsRequestFactory.v(this.f35958c, PaymentAnalyticsEvent.f25912r0, null, null, null, null, null, 62, null));
        String uri = c0476a.b().toString();
        AbstractC3255y.h(uri, "toString(...)");
        return new C3536r(uri, c0476a.A(), false, false, null, false, 60, null);
    }

    private final C3536r o(StripeIntent.a.c cVar) {
        return new C3536r(cVar.b(), this.f35964i.a(), false, false, null, false, 52, null);
    }

    private final C3536r p(StripeIntent.a.h hVar, StripeIntent stripeIntent) {
        String str;
        String a8 = hVar.a();
        AbstractC3255y.f(a8);
        String str2 = null;
        if (a8.length() > 0) {
            str = a8;
        } else {
            str = null;
        }
        if (str == null) {
            StripeIntent.NextActionType k8 = stripeIntent.k();
            if (k8 != null) {
                str2 = k8.b();
            }
            throw new IllegalArgumentException("null hostedVoucherUrl for " + str2);
        }
        return new C3536r(str, null, false, false, null, false, 52, null);
    }

    private final C3536r q(StripeIntent.a.j.C0485a c0485a, StripeIntent stripeIntent) {
        String str;
        this.f35957b.a(PaymentAnalyticsRequestFactory.v(this.f35958c, PaymentAnalyticsEvent.f25873G, null, null, null, null, null, 62, null));
        String b8 = c0485a.b();
        String id = stripeIntent.getId();
        if (id != null) {
            str = (String) this.f35961f.remove(id);
        } else {
            str = null;
        }
        return new C3536r(b8, str, true, false, null, false, 56, null);
    }

    private final C3536r r(StripeIntent.a.k kVar) {
        return new C3536r(kVar.b(), this.f35964i.a(), false, false, null, false, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // o3.AbstractC3524f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.stripe.android.view.InterfaceC2658p r19, com.stripe.android.model.StripeIntent r20, A2.j.c r21, S5.d r22) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C3537s.e(com.stripe.android.view.p, com.stripe.android.model.StripeIntent, A2.j$c, S5.d):java.lang.Object");
    }
}
