package y3;

import L5.s;
import L5.t;
import M5.AbstractC1246t;
import M5.a0;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(n nVar) {
        return AbstractC1246t.d0(a0.i(StripeIntent.Status.f24149c, StripeIntent.Status.f24154h, StripeIntent.Status.f24155i), nVar.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(u uVar) {
        return AbstractC1246t.d0(a0.i(StripeIntent.Status.f24149c, StripeIntent.Status.f24154h), uVar.getStatus());
    }

    public static final I3.j e(StripeIntent stripeIntent) {
        Object b8;
        AbstractC3159y.i(stripeIntent, "<this>");
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(l.f39837a.a(stripeIntent));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            return I3.k.a(e8);
        }
        return null;
    }
}
