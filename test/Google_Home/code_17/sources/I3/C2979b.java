package i3;

import O5.p;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2979b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32874a;

    public C2979b(Context context) {
        AbstractC3255y.i(context, "context");
        this.f32874a = context;
    }

    private final String b(n nVar) {
        String str;
        n.g.c cVar;
        o r8;
        o.p pVar;
        if (nVar.getStatus() != StripeIntent.Status.f25206e || ((r8 = nVar.r()) != null && (pVar = r8.f25467e) != null && pVar.f25607c)) {
            n.g i8 = nVar.i();
            if (i8 != null) {
                str = i8.o();
            } else {
                str = null;
            }
            if (!AbstractC3255y.d(str, "payment_intent_authentication_failure")) {
                n.g i9 = nVar.i();
                if (i9 != null) {
                    cVar = i9.h();
                } else {
                    cVar = null;
                }
                if (cVar != n.g.c.f25448f) {
                    return null;
                }
                return h3.l.c(nVar.i(), this.f32874a).g();
            }
        }
        return this.f32874a.getResources().getString(AbstractC3407E.f34871n0);
    }

    private final String c(u uVar) {
        String str;
        u.e.c cVar;
        u.e g8 = uVar.g();
        if (g8 != null) {
            str = g8.o();
        } else {
            str = null;
        }
        if (AbstractC3255y.d(str, "setup_intent_authentication_failure")) {
            return this.f32874a.getResources().getString(AbstractC3407E.f34871n0);
        }
        u.e g9 = uVar.g();
        if (g9 != null) {
            cVar = g9.h();
        } else {
            cVar = null;
        }
        if (cVar != u.e.c.f25786f) {
            return null;
        }
        return h3.l.d(uVar.g(), this.f32874a).g();
    }

    private final boolean d(StripeIntent stripeIntent) {
        o.p pVar;
        o r8 = stripeIntent.r();
        if (r8 != null) {
            pVar = r8.f25467e;
        } else {
            pVar = null;
        }
        if (pVar == o.p.f25587i && (stripeIntent.j() instanceof StripeIntent.a.j.b)) {
            return true;
        }
        return false;
    }

    public final String a(StripeIntent intent, int i8) {
        AbstractC3255y.i(intent, "intent");
        if (i8 == 4) {
            return this.f32874a.getResources().getString(AbstractC3407E.f34873o0);
        }
        if (d(intent) || (intent.getStatus() != StripeIntent.Status.f25208g && intent.getStatus() != StripeIntent.Status.f25206e)) {
            return null;
        }
        if (intent instanceof n) {
            return b((n) intent);
        }
        if (intent instanceof u) {
            return c((u) intent);
        }
        throw new p();
    }
}
