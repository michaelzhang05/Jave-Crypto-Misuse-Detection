package o3;

import O5.InterfaceC1355k;
import P5.Q;
import P5.a0;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import q3.AbstractC3835b;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3519a implements InterfaceC3526h {

    /* renamed from: h, reason: collision with root package name */
    public static final C0809a f35882h = new C0809a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f35883i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3522d f35884a;

    /* renamed from: b, reason: collision with root package name */
    private final C3530l f35885b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f35886c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35887d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1355k f35888e;

    /* renamed from: f, reason: collision with root package name */
    private ActivityResultLauncher f35889f;

    /* renamed from: g, reason: collision with root package name */
    private ActivityResultLauncher f35890g;

    /* renamed from: o3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0809a {
        private C0809a() {
        }

        public final InterfaceC3526h a(Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, S5.g workContext, S5.g uiContext, Map threeDs1IntentReturnUrlMap, Function0 publishableKeyProvider, Set productUsage, boolean z9, boolean z10) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
            AbstractC3255y.i(workContext, "workContext");
            AbstractC3255y.i(uiContext, "uiContext");
            AbstractC3255y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
            AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
            AbstractC3255y.i(productUsage, "productUsage");
            return AbstractC3835b.a().a(context).i(paymentAnalyticsRequestFactory).d(z8).h(workContext).f(uiContext).g(threeDs1IntentReturnUrlMap).c(publishableKeyProvider).b(productUsage).e(z9).j(z10).build().a();
        }

        public /* synthetic */ C0809a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: o3.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f35892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f35892b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return AbstractC3520b.a(C3519a.this.f35887d, this.f35892b);
        }
    }

    public C3519a(C3522d noOpIntentNextActionHandler, C3530l sourceNextActionHandler, Map paymentNextActionHandlers, boolean z8, Context applicationContext) {
        AbstractC3255y.i(noOpIntentNextActionHandler, "noOpIntentNextActionHandler");
        AbstractC3255y.i(sourceNextActionHandler, "sourceNextActionHandler");
        AbstractC3255y.i(paymentNextActionHandlers, "paymentNextActionHandlers");
        AbstractC3255y.i(applicationContext, "applicationContext");
        this.f35884a = noOpIntentNextActionHandler;
        this.f35885b = sourceNextActionHandler;
        this.f35886c = paymentNextActionHandlers;
        this.f35887d = z8;
        this.f35888e = O5.l.b(new b(applicationContext));
    }

    private final Map h() {
        return (Map) this.f35888e.getValue();
    }

    @Override // o3.InterfaceC3526h
    public AbstractC3524f a(Object obj) {
        AbstractC3524f abstractC3524f;
        if (obj instanceof StripeIntent) {
            StripeIntent stripeIntent = (StripeIntent) obj;
            if (!stripeIntent.t()) {
                C3522d c3522d = this.f35884a;
                AbstractC3255y.g(c3522d, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
                return c3522d;
            }
            Map q8 = Q.q(this.f35886c, h());
            StripeIntent.a j8 = stripeIntent.j();
            if (j8 == null || (abstractC3524f = (AbstractC3524f) q8.get(j8.getClass())) == null) {
                abstractC3524f = this.f35884a;
            }
            AbstractC3255y.g(abstractC3524f, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return abstractC3524f;
        }
        if (obj instanceof Source) {
            C3530l c3530l = this.f35885b;
            AbstractC3255y.g(c3530l, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return c3530l;
        }
        throw new IllegalStateException(("No suitable PaymentNextActionHandler for " + obj).toString());
    }

    @Override // m3.InterfaceC3428a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        AbstractC3255y.i(activityResultCallback, "activityResultCallback");
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((AbstractC3524f) it.next()).b(activityResultCaller, activityResultCallback);
        }
        this.f35889f = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.f35890g = activityResultCaller.registerForActivityResult(new PaymentBrowserAuthContract(), activityResultCallback);
    }

    @Override // m3.InterfaceC3428a
    public void c() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((AbstractC3524f) it.next()).c();
        }
        ActivityResultLauncher activityResultLauncher = this.f35889f;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher activityResultLauncher2 = this.f35890g;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        this.f35889f = null;
        this.f35890g = null;
    }

    public final Set e() {
        Set b8 = a0.b();
        b8.add(this.f35884a);
        b8.add(this.f35885b);
        b8.addAll(this.f35886c.values());
        b8.addAll(h().values());
        return a0.a(b8);
    }

    public final ActivityResultLauncher f() {
        return this.f35890g;
    }

    public final ActivityResultLauncher g() {
        return this.f35889f;
    }
}
