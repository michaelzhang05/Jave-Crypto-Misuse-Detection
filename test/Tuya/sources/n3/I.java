package n3;

import L5.s;
import kotlin.jvm.internal.AbstractC3159y;
import l3.AbstractC3176f;
import l3.C3184n;

/* loaded from: classes4.dex */
public final class I {
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC3176f a(C3184n unsupportedNextActionHandler) {
        C3184n c3184n;
        AbstractC3159y.i(unsupportedNextActionHandler, "unsupportedNextActionHandler");
        try {
            s.a aVar = L5.s.f6511b;
            Object newInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayNextActionHandler").getConstructor(null).newInstance(null);
            AbstractC3159y.g(newInstance, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>");
            c3184n = L5.s.b((AbstractC3176f) newInstance);
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            c3184n = L5.s.b(L5.t.a(th));
        }
        if (!L5.s.g(c3184n)) {
            unsupportedNextActionHandler = c3184n;
        }
        return unsupportedNextActionHandler;
    }
}
