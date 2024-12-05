package l2;

import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.v;
import x2.InterfaceC3873c;
import x2.j;

/* loaded from: classes4.dex */
public final class n implements InterfaceC3169d {

    /* renamed from: a, reason: collision with root package name */
    private final e3.m f33865a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f33866b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3170e f33867c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3873c f33868d;

    /* renamed from: e, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f33869e;

    /* renamed from: f, reason: collision with root package name */
    private final v f33870f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f33871g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33872a;

        /* renamed from: b, reason: collision with root package name */
        Object f33873b;

        /* renamed from: c, reason: collision with root package name */
        Object f33874c;

        /* renamed from: d, reason: collision with root package name */
        Object f33875d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f33876e;

        /* renamed from: g, reason: collision with root package name */
        int f33878g;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33876e = obj;
            this.f33878g |= Integer.MIN_VALUE;
            return n.this.b(null, this);
        }
    }

    public n(e3.m stripeRepository, j.c requestOptions, InterfaceC3170e cardAccountRangeStore, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(requestOptions, "requestOptions");
        AbstractC3159y.i(cardAccountRangeStore, "cardAccountRangeStore");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.f33865a = stripeRepository;
        this.f33866b = requestOptions;
        this.f33867c = cardAccountRangeStore;
        this.f33868d = analyticsRequestExecutor;
        this.f33869e = paymentAnalyticsRequestFactory;
        v a8 = AbstractC3351M.a(Boolean.FALSE);
        this.f33870f = a8;
        this.f33871g = AbstractC3360h.b(a8);
    }

    private final void c() {
        this.f33868d.a(PaymentAnalyticsRequestFactory.v(this.f33869e, PaymentAnalyticsEvent.f24813D0, null, null, null, null, null, 62, null));
    }

    @Override // l2.InterfaceC3169d
    public InterfaceC3349K a() {
        return this.f33871g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // l2.InterfaceC3169d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(l2.f.b r7, P5.d r8) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.n.b(l2.f$b, P5.d):java.lang.Object");
    }
}
