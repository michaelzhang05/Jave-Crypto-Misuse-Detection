package o3;

import A2.j;
import O5.I;
import O5.x;
import P5.Q;
import android.content.Context;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.InterfaceC2658p;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;

/* renamed from: o3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3534p extends AbstractC3524f {

    /* renamed from: a, reason: collision with root package name */
    private final C3537s f35944a;

    /* renamed from: b, reason: collision with root package name */
    private final C3522d f35945b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f35946c;

    public C3534p(C3537s webIntentAuthenticator, C3522d noOpIntentAuthenticator, Context context) {
        AbstractC3255y.i(webIntentAuthenticator, "webIntentAuthenticator");
        AbstractC3255y.i(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        AbstractC3255y.i(context, "context");
        this.f35944a = webIntentAuthenticator;
        this.f35945b = noOpIntentAuthenticator;
        this.f35946c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o3.AbstractC3524f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2658p interfaceC2658p, StripeIntent stripeIntent, j.c cVar, S5.d dVar) {
        String str;
        Parcelable j8 = stripeIntent.j();
        AbstractC3255y.g(j8, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails");
        if (((StripeIntent.a.h) j8).a() == null) {
            n3.i b8 = i.a.b(n3.i.f35386a, this.f35946c, null, 2, null);
            i.f fVar = i.f.f35420d;
            StripeIntent.NextActionType k8 = stripeIntent.k();
            if (k8 == null || (str = k8.b()) == null) {
                str = "";
            }
            i.b.a(b8, fVar, null, Q.e(x.a("next_action_type", str)), 2, null);
            Object d8 = this.f35945b.d(interfaceC2658p, stripeIntent, cVar, dVar);
            if (d8 == T5.b.e()) {
                return d8;
            }
            return I.f8278a;
        }
        Object d9 = this.f35944a.d(interfaceC2658p, stripeIntent, cVar, dVar);
        if (d9 == T5.b.e()) {
            return d9;
        }
        return I.f8278a;
    }
}
