package m2;

import com.stripe.android.model.b;
import com.stripe.android.model.m;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3417c extends AbstractC3419e {

    /* renamed from: b, reason: collision with root package name */
    private final String f34943b;

    /* renamed from: c, reason: collision with root package name */
    private final b.d f34944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3417c(String clientSecret, b.d dVar) {
        super(null);
        AbstractC3255y.i(clientSecret, "clientSecret");
        this.f34943b = clientSecret;
        this.f34944c = dVar;
    }

    @Override // m2.AbstractC3419e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.b b(com.stripe.android.model.p createParams, com.stripe.android.model.r rVar) {
        AbstractC3255y.i(createParams, "createParams");
        return b.a.c(com.stripe.android.model.b.f25268o, createParams, this.f34943b, null, null, null, null, this.f34944c, rVar, 60, null);
    }

    @Override // m2.AbstractC3419e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.b c(String paymentMethodId, o.p pVar, com.stripe.android.model.r rVar) {
        com.stripe.android.model.m mVar;
        AbstractC3255y.i(paymentMethodId, "paymentMethodId");
        b.a aVar = com.stripe.android.model.b.f25268o;
        String str = this.f34943b;
        com.stripe.android.model.m mVar2 = new com.stripe.android.model.m(m.c.a.f25375e.a());
        if (pVar != null && pVar.f25608d) {
            mVar = mVar2;
        } else {
            mVar = null;
        }
        return b.a.e(aVar, paymentMethodId, str, null, rVar, null, mVar, null, this.f34944c, 84, null);
    }
}
