package com.stripe.android.paymentsheet;

import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.l;
import com.stripe.android.paymentsheet.u;
import u3.AbstractC4060b;
import u3.C4059a;

/* loaded from: classes4.dex */
public abstract class g {
    public static final Object a(f fVar, l.d dVar, S5.d dVar2) {
        b.d dVar3 = null;
        if (dVar instanceof l.d.a) {
            u.l D8 = dVar.D();
            l.d.a aVar = (l.d.a) dVar;
            com.stripe.android.model.r b8 = aVar.b();
            com.stripe.android.model.p a8 = aVar.a();
            C4059a q8 = dVar.q();
            if (q8 != null) {
                dVar3 = AbstractC4060b.a(q8);
            }
            return fVar.a(D8, a8, b8, dVar3, aVar.g(), dVar2);
        }
        if (dVar instanceof l.d.b) {
            u.l D9 = dVar.D();
            l.d.b bVar = (l.d.b) dVar;
            com.stripe.android.model.o r8 = bVar.r();
            com.stripe.android.model.r a9 = bVar.a();
            C4059a q9 = dVar.q();
            if (q9 != null) {
                dVar3 = AbstractC4060b.a(q9);
            }
            return fVar.b(D9, r8, a9, dVar3, dVar2);
        }
        throw new O5.p();
    }
}
