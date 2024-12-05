package com.stripe.android.paymentsheet;

import P5.AbstractC1378t;
import com.stripe.android.paymentsheet.p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class q {
    public static final String a(p pVar) {
        p.d dVar;
        com.stripe.android.model.o e8;
        AbstractC3255y.i(pVar, "<this>");
        String str = null;
        if (pVar instanceof p.d) {
            dVar = (p.d) pVar;
        } else {
            dVar = null;
        }
        if (dVar != null && (e8 = dVar.e()) != null) {
            str = e8.f25463a;
        }
        return AbstractC1378t.w0(AbstractC1378t.r(pVar.a(), str), "-", null, null, 0, null, null, 62, null);
    }
}
