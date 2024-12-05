package u3;

import E3.d;
import L5.I;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3803b implements InterfaceC3802a {
    private final boolean d(u.l lVar) {
        u.l.a aVar;
        u.m c8;
        if (lVar instanceof u.l.a) {
            aVar = (u.l.a) lVar;
        } else {
            aVar = null;
        }
        if (aVar == null || (c8 = aVar.c()) == null || !c8.f()) {
            return false;
        }
        return true;
    }

    private final boolean e(StripeIntent stripeIntent) {
        n nVar;
        if (stripeIntent instanceof n) {
            nVar = (n) stripeIntent;
        } else {
            nVar = null;
        }
        if (nVar == null || !nVar.j()) {
            return false;
        }
        return true;
    }

    private final boolean f(AbstractC3991f abstractC3991f) {
        if ((abstractC3991f instanceof AbstractC3991f.C0916f) && ((AbstractC3991f.C0916f) abstractC3991f).v().f24412e == o.p.f24532i) {
            return true;
        }
        return false;
    }

    @Override // u3.InterfaceC3802a
    public boolean a(StripeIntent stripeIntent, AbstractC3991f abstractC3991f, u.l lVar, Function0 extraRequirements) {
        AbstractC3159y.i(extraRequirements, "extraRequirements");
        if (f(abstractC3991f) && c(stripeIntent, lVar) && ((Boolean) extraRequirements.invoke()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // u3.InterfaceC3802a
    public void b(AbstractC3991f abstractC3991f, Function1 launch) {
        AbstractC3991f.C0916f c0916f;
        o.g gVar;
        o v8;
        AbstractC3159y.i(launch, "launch");
        I i8 = null;
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            c0916f = (AbstractC3991f.C0916f) abstractC3991f;
        } else {
            c0916f = null;
        }
        if (c0916f != null && (v8 = c0916f.v()) != null) {
            gVar = v8.f24415h;
        } else {
            gVar = null;
        }
        d a8 = d.f1983c.a(gVar);
        if (a8 != null) {
            launch.invoke(a8);
            i8 = I.f6487a;
        }
        if (i8 != null) {
        } else {
            throw new IllegalStateException("unable to create CvcRecollectionData");
        }
    }

    @Override // u3.InterfaceC3802a
    public boolean c(StripeIntent stripeIntent, u.l lVar) {
        if (!d(lVar) && !e(stripeIntent)) {
            return false;
        }
        return true;
    }
}
