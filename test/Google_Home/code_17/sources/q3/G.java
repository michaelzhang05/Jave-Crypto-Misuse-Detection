package q3;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class G {
    public final a4.n a(Application application, Stripe3ds2TransactionContract.a args, S5.g workContext) {
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(workContext, "workContext");
        return new com.stripe.android.stripe3ds2.transaction.l(application, args.v().c(), args.s(), args.a().g().a(), args.g().a().i(), args.b(), workContext).a();
    }
}
