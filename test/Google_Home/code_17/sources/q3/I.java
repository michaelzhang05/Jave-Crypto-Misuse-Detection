package q3;

import O5.s;
import kotlin.jvm.internal.AbstractC3255y;
import o3.AbstractC3524f;
import o3.C3532n;

/* loaded from: classes4.dex */
public final class I {
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC3524f a(C3532n unsupportedNextActionHandler) {
        C3532n c3532n;
        AbstractC3255y.i(unsupportedNextActionHandler, "unsupportedNextActionHandler");
        try {
            s.a aVar = O5.s.f8302b;
            Object newInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayNextActionHandler").getConstructor(null).newInstance(null);
            AbstractC3255y.g(newInstance, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>");
            c3532n = O5.s.b((AbstractC3524f) newInstance);
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            c3532n = O5.s.b(O5.t.a(th));
        }
        if (!O5.s.g(c3532n)) {
            unsupportedNextActionHandler = c3532n;
        }
        return unsupportedNextActionHandler;
    }
}
