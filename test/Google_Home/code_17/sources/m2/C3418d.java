package m2;

import com.stripe.android.model.c;
import com.stripe.android.model.m;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3418d extends AbstractC3419e {

    /* renamed from: b, reason: collision with root package name */
    private final String f34945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3418d(String clientSecret) {
        super(null);
        AbstractC3255y.i(clientSecret, "clientSecret");
        this.f34945b = clientSecret;
    }

    @Override // m2.AbstractC3419e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.c b(com.stripe.android.model.p createParams, com.stripe.android.model.r rVar) {
        AbstractC3255y.i(createParams, "createParams");
        return c.a.c(com.stripe.android.model.c.f25296h, createParams, this.f34945b, null, null, 12, null);
    }

    @Override // m2.AbstractC3419e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.c c(String paymentMethodId, o.p pVar, com.stripe.android.model.r rVar) {
        com.stripe.android.model.m mVar;
        AbstractC3255y.i(paymentMethodId, "paymentMethodId");
        c.a aVar = com.stripe.android.model.c.f25296h;
        String str = this.f34945b;
        if (pVar != null) {
            mVar = new com.stripe.android.model.m(m.c.a.f25375e.a());
        } else {
            mVar = null;
        }
        return c.a.d(aVar, paymentMethodId, str, mVar, null, 8, null);
    }
}
