package o3;

import P5.Q;
import android.content.Context;
import com.stripe.android.paymentsheet.PaymentSheetNextActionHandlers;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;
import w2.AbstractC4144k;

/* renamed from: o3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC3520b {
    public static final /* synthetic */ Map a(boolean z8, Context context) {
        return b(z8, context);
    }

    public static final Map b(boolean z8, Context context) {
        try {
            if (z8) {
                PaymentSheetNextActionHandlers paymentSheetNextActionHandlers = PaymentSheetNextActionHandlers.INSTANCE;
                Object obj = PaymentSheetNextActionHandlers.class.getDeclaredField("INSTANCE").get(null);
                Object invoke = obj.getClass().getDeclaredMethod("get", null).invoke(obj, null);
                AbstractC3255y.g(invoke, "null cannot be cast to non-null type kotlin.collections.Map<java.lang.Class<out com.stripe.android.model.StripeIntent.NextActionData>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandlerKey }, @[JvmSuppressWildcards(suppress = <null>)] com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandler }>");
                return (Map) invoke;
            }
            return Q.h();
        } catch (Exception e8) {
            i.b.a(i.a.b(n3.i.f35386a, context, null, 2, null), i.f.f35428l, AbstractC4144k.f40356e.b(e8), null, 4, null);
            return Q.h();
        }
    }
}
