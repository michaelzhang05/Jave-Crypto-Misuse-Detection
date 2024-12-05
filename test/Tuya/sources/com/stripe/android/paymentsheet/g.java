package com.stripe.android.paymentsheet;

import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.l;
import com.stripe.android.paymentsheet.u;
import r3.AbstractC3687b;
import r3.C3686a;

/* loaded from: classes4.dex */
public abstract class g {
    public static final Object a(f fVar, l.d dVar, P5.d dVar2) {
        b.d dVar3 = null;
        if (dVar instanceof l.d.a) {
            u.l B8 = dVar.B();
            l.d.a aVar = (l.d.a) dVar;
            com.stripe.android.model.r c8 = aVar.c();
            com.stripe.android.model.p b8 = aVar.b();
            C3686a t8 = dVar.t();
            if (t8 != null) {
                dVar3 = AbstractC3687b.a(t8);
            }
            return fVar.b(B8, b8, c8, dVar3, aVar.e(), dVar2);
        }
        if (dVar instanceof l.d.b) {
            u.l B9 = dVar.B();
            l.d.b bVar = (l.d.b) dVar;
            com.stripe.android.model.o v8 = bVar.v();
            com.stripe.android.model.r b9 = bVar.b();
            C3686a t9 = dVar.t();
            if (t9 != null) {
                dVar3 = AbstractC3687b.a(t9);
            }
            return fVar.a(B9, v8, b9, dVar3, dVar2);
        }
        throw new L5.p();
    }
}
