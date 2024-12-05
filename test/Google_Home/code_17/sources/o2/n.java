package o2;

import A2.InterfaceC0945c;
import A2.j;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.w;

/* loaded from: classes4.dex */
public final class n implements InterfaceC3517d {

    /* renamed from: a, reason: collision with root package name */
    private final h3.m f35866a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f35867b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3518e f35868c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0945c f35869d;

    /* renamed from: e, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f35870e;

    /* renamed from: f, reason: collision with root package name */
    private final w f35871f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f35872g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35873a;

        /* renamed from: b, reason: collision with root package name */
        Object f35874b;

        /* renamed from: c, reason: collision with root package name */
        Object f35875c;

        /* renamed from: d, reason: collision with root package name */
        Object f35876d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35877e;

        /* renamed from: g, reason: collision with root package name */
        int f35879g;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35877e = obj;
            this.f35879g |= Integer.MIN_VALUE;
            return n.this.b(null, this);
        }
    }

    public n(h3.m stripeRepository, j.c requestOptions, InterfaceC3518e cardAccountRangeStore, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(requestOptions, "requestOptions");
        AbstractC3255y.i(cardAccountRangeStore, "cardAccountRangeStore");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.f35866a = stripeRepository;
        this.f35867b = requestOptions;
        this.f35868c = cardAccountRangeStore;
        this.f35869d = analyticsRequestExecutor;
        this.f35870e = paymentAnalyticsRequestFactory;
        w a8 = AbstractC3700N.a(Boolean.FALSE);
        this.f35871f = a8;
        this.f35872g = AbstractC3708h.b(a8);
    }

    private final void c() {
        this.f35869d.a(PaymentAnalyticsRequestFactory.v(this.f35870e, PaymentAnalyticsEvent.f25868D0, null, null, null, null, null, 62, null));
    }

    @Override // o2.InterfaceC3517d
    public InterfaceC3698L a() {
        return this.f35872g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // o2.InterfaceC3517d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(o2.f.b r7, S5.d r8) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.n.b(o2.f$b, S5.d):java.lang.Object");
    }
}
