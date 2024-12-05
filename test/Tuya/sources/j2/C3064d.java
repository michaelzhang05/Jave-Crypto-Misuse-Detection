package j2;

import com.stripe.android.model.c;
import com.stripe.android.model.m;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3064d extends AbstractC3065e {

    /* renamed from: b, reason: collision with root package name */
    private final String f32969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3064d(String clientSecret) {
        super(null);
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f32969b = clientSecret;
    }

    @Override // j2.AbstractC3065e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.c b(com.stripe.android.model.p createParams, com.stripe.android.model.r rVar) {
        AbstractC3159y.i(createParams, "createParams");
        return c.a.c(com.stripe.android.model.c.f24241h, createParams, this.f32969b, null, null, 12, null);
    }

    @Override // j2.AbstractC3065e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.c c(String paymentMethodId, o.p pVar, com.stripe.android.model.r rVar) {
        com.stripe.android.model.m mVar;
        AbstractC3159y.i(paymentMethodId, "paymentMethodId");
        c.a aVar = com.stripe.android.model.c.f24241h;
        String str = this.f32969b;
        if (pVar != null) {
            mVar = new com.stripe.android.model.m(m.c.a.f24320e.a());
        } else {
            mVar = null;
        }
        return c.a.d(aVar, paymentMethodId, str, mVar, null, 8, null);
    }
}
