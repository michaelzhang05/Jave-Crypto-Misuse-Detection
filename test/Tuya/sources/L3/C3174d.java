package l3;

import L5.I;
import com.stripe.android.a;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.InterfaceC2464p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import x2.j;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3174d extends AbstractC3176f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f33897a;

    public C3174d(Function1 paymentRelayStarterFactory) {
        AbstractC3159y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.f33897a = paymentRelayStarterFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l3.AbstractC3176f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2464p interfaceC2464p, StripeIntent stripeIntent, j.c cVar, P5.d dVar) {
        ((com.stripe.android.a) this.f33897a.invoke(interfaceC2464p)).a(a.AbstractC0444a.f23436a.a(stripeIntent, cVar.j()));
        return I.f6487a;
    }
}
