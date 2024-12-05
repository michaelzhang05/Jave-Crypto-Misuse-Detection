package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final p b(List list, AbstractC3991f abstractC3991f) {
        Object obj;
        boolean z8;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                p pVar = (p) obj;
                if (abstractC3991f instanceof AbstractC3991f.c) {
                    z8 = pVar instanceof p.b;
                } else if (abstractC3991f instanceof AbstractC3991f.d) {
                    z8 = pVar instanceof p.c;
                } else {
                    if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                        if (pVar instanceof p.d) {
                            z8 = AbstractC3159y.d(((AbstractC3991f.C0916f) abstractC3991f).v().f24408a, ((p.d) pVar).e().f24408a);
                        }
                    } else if (!(abstractC3991f instanceof AbstractC3991f.e) && !(abstractC3991f instanceof AbstractC3991f.b)) {
                        throw new L5.p();
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

    public static final AbstractC3991f c(p pVar) {
        AbstractC3159y.i(pVar, "<this>");
        if (pVar instanceof p.a) {
            return null;
        }
        if (pVar instanceof p.b) {
            return AbstractC3991f.c.f39776a;
        }
        if (pVar instanceof p.c) {
            return AbstractC3991f.d.f39777a;
        }
        if (pVar instanceof p.d) {
            return new AbstractC3991f.C0916f(((p.d) pVar).e(), null, null, 6, null);
        }
        throw new L5.p();
    }
}
