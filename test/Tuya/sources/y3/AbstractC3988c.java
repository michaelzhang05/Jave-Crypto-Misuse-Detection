package y3;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3988c {
    public static final String a(StripeIntent stripeIntent) {
        AbstractC3159y.i(stripeIntent, "<this>");
        if (stripeIntent instanceof n) {
            return ((n) stripeIntent).K();
        }
        return null;
    }
}
