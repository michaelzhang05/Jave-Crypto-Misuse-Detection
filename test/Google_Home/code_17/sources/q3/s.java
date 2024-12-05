package q3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import i3.C2978a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import o3.C3519a;
import o3.InterfaceC3526h;
import v0.AbstractC4085a;

/* loaded from: classes4.dex */
public final class s {
    public final C2978a a(Context context) {
        AbstractC3255y.i(context, "context");
        return C2978a.f32872b.a(context);
    }

    public final boolean b(Context context) {
        AbstractC3255y.i(context, "context");
        return AbstractC4085a.c(context);
    }

    public final InterfaceC3526h c(Context context, boolean z8, S5.g workContext, S5.g uiContext, Map threeDs1IntentReturnUrlMap, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0 publishableKeyProvider, Set productUsage, boolean z9, boolean z10) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(uiContext, "uiContext");
        AbstractC3255y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(productUsage, "productUsage");
        return C3519a.f35882h.a(context, paymentAnalyticsRequestFactory, z8, workContext, uiContext, threeDs1IntentReturnUrlMap, publishableKeyProvider, productUsage, z9, z10);
    }

    public final Map d() {
        return new LinkedHashMap();
    }
}
