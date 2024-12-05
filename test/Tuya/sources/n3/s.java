package n3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f3.C2660a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import l3.C3171a;
import l3.InterfaceC3178h;
import w0.AbstractC3839a;

/* loaded from: classes4.dex */
public final class s {
    public final C2660a a(Context context) {
        AbstractC3159y.i(context, "context");
        return C2660a.f31009b.a(context);
    }

    public final boolean b(Context context) {
        AbstractC3159y.i(context, "context");
        return AbstractC3839a.c(context);
    }

    public final InterfaceC3178h c(Context context, boolean z8, P5.g workContext, P5.g uiContext, Map threeDs1IntentReturnUrlMap, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0 publishableKeyProvider, Set productUsage, boolean z9, boolean z10) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(uiContext, "uiContext");
        AbstractC3159y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(productUsage, "productUsage");
        return C3171a.f33881h.a(context, paymentAnalyticsRequestFactory, z8, workContext, uiContext, threeDs1IntentReturnUrlMap, publishableKeyProvider, productUsage, z9, z10);
    }

    public final Map d() {
        return new LinkedHashMap();
    }
}
