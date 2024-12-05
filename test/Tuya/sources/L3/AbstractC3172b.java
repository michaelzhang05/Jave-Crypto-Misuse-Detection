package l3;

import M5.Q;
import android.content.Context;
import com.stripe.android.paymentsheet.PaymentSheetNextActionHandlers;
import java.util.Map;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;

/* renamed from: l3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC3172b {
    public static final /* synthetic */ Map a(boolean z8, Context context) {
        return b(z8, context);
    }

    public static final Map b(boolean z8, Context context) {
        try {
            if (z8) {
                PaymentSheetNextActionHandlers paymentSheetNextActionHandlers = PaymentSheetNextActionHandlers.INSTANCE;
                Object obj = PaymentSheetNextActionHandlers.class.getDeclaredField("INSTANCE").get(null);
                Object invoke = obj.getClass().getDeclaredMethod("get", null).invoke(obj, null);
                AbstractC3159y.g(invoke, "null cannot be cast to non-null type kotlin.collections.Map<java.lang.Class<out com.stripe.android.model.StripeIntent.NextActionData>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandlerKey }, @[JvmSuppressWildcards(suppress = <null>)] com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandler }>");
                return (Map) invoke;
            }
            return Q.h();
        } catch (Exception e8) {
            i.b.a(i.a.b(k3.i.f33394a, context, null, 2, null), i.f.f33436l, AbstractC3790k.f38229e.b(e8), null, 4, null);
            return Q.h();
        }
    }
}
