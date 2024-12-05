package l3;

import L5.I;
import L5.x;
import M5.Q;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.InterfaceC2464p;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;
import x2.j;

/* renamed from: l3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3186p extends AbstractC3176f {

    /* renamed from: a, reason: collision with root package name */
    private final C3189s f33943a;

    /* renamed from: b, reason: collision with root package name */
    private final C3174d f33944b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f33945c;

    public C3186p(C3189s webIntentAuthenticator, C3174d noOpIntentAuthenticator, Context context) {
        AbstractC3159y.i(webIntentAuthenticator, "webIntentAuthenticator");
        AbstractC3159y.i(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        AbstractC3159y.i(context, "context");
        this.f33943a = webIntentAuthenticator;
        this.f33944b = noOpIntentAuthenticator;
        this.f33945c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l3.AbstractC3176f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2464p interfaceC2464p, StripeIntent stripeIntent, j.c cVar, P5.d dVar) {
        String str;
        v2.f l8 = stripeIntent.l();
        AbstractC3159y.g(l8, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails");
        if (((StripeIntent.a.h) l8).b() == null) {
            k3.i b8 = i.a.b(k3.i.f33394a, this.f33945c, null, 2, null);
            i.f fVar = i.f.f33428d;
            StripeIntent.NextActionType m8 = stripeIntent.m();
            if (m8 == null || (str = m8.b()) == null) {
                str = "";
            }
            i.b.a(b8, fVar, null, Q.e(x.a("next_action_type", str)), 2, null);
            Object d8 = this.f33944b.d(interfaceC2464p, stripeIntent, cVar, dVar);
            if (d8 == Q5.b.e()) {
                return d8;
            }
            return I.f6487a;
        }
        Object d9 = this.f33943a.d(interfaceC2464p, stripeIntent, cVar, dVar);
        if (d9 == Q5.b.e()) {
            return d9;
        }
        return I.f6487a;
    }
}
