package x3;

import B3.f;
import H3.d;
import O5.I;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4188b implements InterfaceC4187a {
    private final boolean d(u.l lVar) {
        u.l.a aVar;
        u.m b8;
        if (lVar instanceof u.l.a) {
            aVar = (u.l.a) lVar;
        } else {
            aVar = null;
        }
        if (aVar == null || (b8 = aVar.b()) == null || !b8.h()) {
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
        if (nVar == null || !nVar.l()) {
            return false;
        }
        return true;
    }

    private final boolean f(f fVar) {
        if ((fVar instanceof f.C0009f) && ((f.C0009f) fVar).r().f25467e == o.p.f25587i) {
            return true;
        }
        return false;
    }

    @Override // x3.InterfaceC4187a
    public void a(f fVar, Function1 launch) {
        f.C0009f c0009f;
        o.g gVar;
        o r8;
        AbstractC3255y.i(launch, "launch");
        I i8 = null;
        if (fVar instanceof f.C0009f) {
            c0009f = (f.C0009f) fVar;
        } else {
            c0009f = null;
        }
        if (c0009f != null && (r8 = c0009f.r()) != null) {
            gVar = r8.f25470h;
        } else {
            gVar = null;
        }
        d a8 = d.f3533c.a(gVar);
        if (a8 != null) {
            launch.invoke(a8);
            i8 = I.f8278a;
        }
        if (i8 != null) {
        } else {
            throw new IllegalStateException("unable to create CvcRecollectionData");
        }
    }

    @Override // x3.InterfaceC4187a
    public boolean b(StripeIntent stripeIntent, f fVar, u.l lVar, Function0 extraRequirements) {
        AbstractC3255y.i(extraRequirements, "extraRequirements");
        if (f(fVar) && c(stripeIntent, lVar) && ((Boolean) extraRequirements.invoke()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // x3.InterfaceC4187a
    public boolean c(StripeIntent stripeIntent, u.l lVar) {
        if (!d(lVar) && !e(stripeIntent)) {
            return false;
        }
        return true;
    }
}
