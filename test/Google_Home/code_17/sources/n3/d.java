package N3;

import B3.f;
import O5.p;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class d {
    public static final boolean a(f.e eVar, u.l initializationMode) {
        boolean z8;
        AbstractC3255y.i(eVar, "<this>");
        AbstractC3255y.i(initializationMode, "initializationMode");
        if (eVar.g() == f.a.f808b) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (initializationMode instanceof u.l.b) {
            return z8;
        }
        if (!(initializationMode instanceof u.l.c)) {
            if (initializationMode instanceof u.l.a) {
                if (((u.l.a) initializationMode).b().a().a() == null && !z8) {
                    return false;
                }
            } else {
                throw new p();
            }
        }
        return true;
    }
}
