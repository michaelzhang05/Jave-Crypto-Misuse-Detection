package com.stripe.android.paymentsheet;

import M5.Q;
import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import l3.AbstractC3176f;

@StabilityInferred(parameters = 1)
@Keep
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class PaymentSheetNextActionHandlers {
    public static final int $stable = 0;
    public static final PaymentSheetNextActionHandlers INSTANCE = new PaymentSheetNextActionHandlers();

    private PaymentSheetNextActionHandlers() {
    }

    public final Map<Class<? extends StripeIntent.a>, AbstractC3176f> get() {
        return Q.k(L5.x.a(StripeIntent.a.l.class, new com.stripe.android.paymentsheet.paymentdatacollection.polling.a()), L5.x.a(StripeIntent.a.b.class, new com.stripe.android.paymentsheet.paymentdatacollection.polling.a()));
    }
}
