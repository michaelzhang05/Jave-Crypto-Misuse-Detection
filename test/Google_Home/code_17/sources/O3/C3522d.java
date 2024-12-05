package o3;

import A2.j;
import O5.I;
import com.stripe.android.a;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.InterfaceC2658p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3522d extends AbstractC3524f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f35898a;

    public C3522d(Function1 paymentRelayStarterFactory) {
        AbstractC3255y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.f35898a = paymentRelayStarterFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o3.AbstractC3524f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2658p interfaceC2658p, StripeIntent stripeIntent, j.c cVar, S5.d dVar) {
        ((com.stripe.android.a) this.f35898a.invoke(interfaceC2658p)).a(a.AbstractC0440a.f24491a.a(stripeIntent, cVar.l()));
        return I.f8278a;
    }
}
