package K3;

import L5.p;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class d {
    public static final boolean a(AbstractC3991f.e eVar, u.l initializationMode) {
        boolean z8;
        AbstractC3159y.i(eVar, "<this>");
        AbstractC3159y.i(initializationMode, "initializationMode");
        if (eVar.e() == AbstractC3991f.a.f39764b) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (initializationMode instanceof u.l.b) {
            return z8;
        }
        if (!(initializationMode instanceof u.l.c)) {
            if (initializationMode instanceof u.l.a) {
                if (((u.l.a) initializationMode).c().b().b() == null && !z8) {
                    return false;
                }
            } else {
                throw new p();
            }
        }
        return true;
    }
}
