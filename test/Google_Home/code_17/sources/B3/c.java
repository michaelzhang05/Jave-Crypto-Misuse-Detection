package B3;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class c {
    public static final String a(StripeIntent stripeIntent) {
        AbstractC3255y.i(stripeIntent, "<this>");
        if (stripeIntent instanceof n) {
            return ((n) stripeIntent).M();
        }
        return null;
    }
}
