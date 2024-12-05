package t3;

import L5.p;
import L5.x;
import M5.Q;
import com.stripe.android.model.o;
import h6.C2758a;
import h6.EnumC2761d;
import java.util.Map;
import w4.AbstractC3849b;
import y3.AbstractC3991f;

/* renamed from: t3.c */
/* loaded from: classes4.dex */
public abstract class AbstractC3793c {
    public static final /* synthetic */ float a(long j8) {
        return d(j8);
    }

    public static final /* synthetic */ Map b(AbstractC3991f abstractC3991f) {
        return f(abstractC3991f);
    }

    public static final String c(AbstractC3991f abstractC3991f) {
        if (abstractC3991f instanceof AbstractC3991f.c) {
            return "google_pay";
        }
        if (abstractC3991f instanceof AbstractC3991f.d) {
            return "link";
        }
        if (abstractC3991f instanceof AbstractC3991f.e) {
            return ((AbstractC3991f.e) abstractC3991f).f().o();
        }
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            o.p pVar = ((AbstractC3991f.C0916f) abstractC3991f).v().f24412e;
            if (pVar != null) {
                return pVar.f24550a;
            }
        } else {
            if (abstractC3991f instanceof AbstractC3991f.b) {
                return ((AbstractC3991f.b) abstractC3991f).getType();
            }
            if (abstractC3991f != null) {
                throw new p();
            }
        }
        return null;
    }

    public static final float d(long j8) {
        return (float) C2758a.G(j8, EnumC2761d.f31419e);
    }

    public static final String e(AbstractC3991f abstractC3991f) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (abstractC3991f instanceof AbstractC3991f.d) {
            return "wallet";
        }
        if (abstractC3991f instanceof AbstractC3991f.e.d) {
            if (((AbstractC3991f.e.d) abstractC3991f).n() != null) {
                return "instant_debits";
            }
        } else {
            boolean z11 = true;
            if (abstractC3991f instanceof AbstractC3991f.c) {
                z8 = true;
            } else {
                z8 = abstractC3991f instanceof AbstractC3991f.e;
            }
            if (z8) {
                z9 = true;
            } else {
                z9 = abstractC3991f instanceof AbstractC3991f.C0916f;
            }
            if (z9) {
                z10 = true;
            } else {
                z10 = abstractC3991f instanceof AbstractC3991f.b;
            }
            if (!z10 && abstractC3991f != null) {
                z11 = false;
            }
            if (!z11) {
                throw new p();
            }
        }
        return null;
    }

    public static final Map f(AbstractC3991f abstractC3991f) {
        return AbstractC3849b.a(Q.k(x.a("selected_lpm", c(abstractC3991f)), x.a("link_context", e(abstractC3991f))));
    }
}
