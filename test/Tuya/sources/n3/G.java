package n3;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class G {
    public final X3.n a(Application application, Stripe3ds2TransactionContract.a args, P5.g workContext) {
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(workContext, "workContext");
        return new com.stripe.android.stripe3ds2.transaction.l(application, args.s().a(), args.n(), args.b().e().b(), args.e().b().i(), args.c(), workContext).a();
    }
}
