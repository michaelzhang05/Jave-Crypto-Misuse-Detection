package com.stripe.android.paymentsheet;

import B3.f;
import com.stripe.android.paymentsheet.p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final p b(List list, B3.f fVar) {
        Object obj;
        boolean z8;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                p pVar = (p) obj;
                if (fVar instanceof f.c) {
                    z8 = pVar instanceof p.b;
                } else if (fVar instanceof f.d) {
                    z8 = pVar instanceof p.c;
                } else {
                    if (fVar instanceof f.C0009f) {
                        if (pVar instanceof p.d) {
                            z8 = AbstractC3255y.d(((f.C0009f) fVar).r().f25463a, ((p.d) pVar).e().f25463a);
                        }
                    } else if (!(fVar instanceof f.e) && !(fVar instanceof f.b)) {
                        throw new O5.p();
                    }
                    z8 = false;
                }
                if (z8) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (p) obj;
    }

    public static final B3.f c(p pVar) {
        AbstractC3255y.i(pVar, "<this>");
        if (pVar instanceof p.a) {
            return null;
        }
        if (pVar instanceof p.b) {
            return f.c.f820a;
        }
        if (pVar instanceof p.c) {
            return f.d.f821a;
        }
        if (pVar instanceof p.d) {
            return new f.C0009f(((p.d) pVar).e(), null, null, 6, null);
        }
        throw new O5.p();
    }
}
