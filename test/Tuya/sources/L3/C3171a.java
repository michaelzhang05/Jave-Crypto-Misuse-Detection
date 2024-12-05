package l3;

import L5.InterfaceC1227k;
import M5.Q;
import M5.a0;
import android.content.Context;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import n3.AbstractC3456b;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3171a implements InterfaceC3178h {

    /* renamed from: h, reason: collision with root package name */
    public static final C0780a f33881h = new C0780a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f33882i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f33883a;

    /* renamed from: b, reason: collision with root package name */
    private final C3182l f33884b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f33885c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33886d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1227k f33887e;

    /* renamed from: f, reason: collision with root package name */
    private ActivityResultLauncher f33888f;

    /* renamed from: g, reason: collision with root package name */
    private ActivityResultLauncher f33889g;

    /* renamed from: l3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0780a {
        private C0780a() {
        }

        public final InterfaceC3178h a(Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, P5.g workContext, P5.g uiContext, Map threeDs1IntentReturnUrlMap, Function0 publishableKeyProvider, Set productUsage, boolean z9, boolean z10) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
            AbstractC3159y.i(workContext, "workContext");
            AbstractC3159y.i(uiContext, "uiContext");
            AbstractC3159y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
            AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
            AbstractC3159y.i(productUsage, "productUsage");
            return AbstractC3456b.a().a(context).g(paymentAnalyticsRequestFactory).d(z8).h(workContext).i(uiContext).f(threeDs1IntentReturnUrlMap).c(publishableKeyProvider).b(productUsage).e(z9).j(z10).build().a();
        }

        public /* synthetic */ C0780a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: l3.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f33891b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f33891b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return AbstractC3172b.a(C3171a.this.f33886d, this.f33891b);
        }
    }

    public C3171a(C3174d noOpIntentNextActionHandler, C3182l sourceNextActionHandler, Map paymentNextActionHandlers, boolean z8, Context applicationContext) {
        AbstractC3159y.i(noOpIntentNextActionHandler, "noOpIntentNextActionHandler");
        AbstractC3159y.i(sourceNextActionHandler, "sourceNextActionHandler");
        AbstractC3159y.i(paymentNextActionHandlers, "paymentNextActionHandlers");
        AbstractC3159y.i(applicationContext, "applicationContext");
        this.f33883a = noOpIntentNextActionHandler;
        this.f33884b = sourceNextActionHandler;
        this.f33885c = paymentNextActionHandlers;
        this.f33886d = z8;
        this.f33887e = L5.l.b(new b(applicationContext));
    }

    private final Map h() {
        return (Map) this.f33887e.getValue();
    }

    @Override // l3.InterfaceC3178h
    public AbstractC3176f a(Object obj) {
        AbstractC3176f abstractC3176f;
        if (obj instanceof StripeIntent) {
            StripeIntent stripeIntent = (StripeIntent) obj;
            if (!stripeIntent.w()) {
                C3174d c3174d = this.f33883a;
                AbstractC3159y.g(c3174d, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
                return c3174d;
            }
            Map q8 = Q.q(this.f33885c, h());
            StripeIntent.a l8 = stripeIntent.l();
            if (l8 == null || (abstractC3176f = (AbstractC3176f) q8.get(l8.getClass())) == null) {
                abstractC3176f = this.f33883a;
            }
            AbstractC3159y.g(abstractC3176f, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return abstractC3176f;
        }
        if (obj instanceof Source) {
            C3182l c3182l = this.f33884b;
            AbstractC3159y.g(c3182l, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return c3182l;
        }
        throw new IllegalStateException(("No suitable PaymentNextActionHandler for " + obj).toString());
    }

    @Override // j3.InterfaceC3074a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        AbstractC3159y.i(activityResultCallback, "activityResultCallback");
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((AbstractC3176f) it.next()).b(activityResultCaller, activityResultCallback);
        }
        this.f33888f = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.f33889g = activityResultCaller.registerForActivityResult(new PaymentBrowserAuthContract(), activityResultCallback);
    }

    @Override // j3.InterfaceC3074a
    public void c() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((AbstractC3176f) it.next()).c();
        }
        ActivityResultLauncher activityResultLauncher = this.f33888f;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher activityResultLauncher2 = this.f33889g;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        this.f33888f = null;
        this.f33889g = null;
    }

    public final Set e() {
        Set b8 = a0.b();
        b8.add(this.f33883a);
        b8.add(this.f33884b);
        b8.addAll(this.f33885c.values());
        b8.addAll(h().values());
        return a0.a(b8);
    }

    public final ActivityResultLauncher f() {
        return this.f33889g;
    }

    public final ActivityResultLauncher g() {
        return this.f33888f;
    }
}
