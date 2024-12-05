package com.stripe.android.paymentsheet;

import B3.f;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.l;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3255y;
import u3.C4059a;

/* loaded from: classes4.dex */
public abstract class m {
    public static final l a(B3.f fVar, u.l initializationMode, u.g configuration) {
        boolean z8;
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(initializationMode, "initializationMode");
        AbstractC3255y.i(configuration, "configuration");
        if (fVar instanceof f.C0009f) {
            f.C0009f c0009f = (f.C0009f) fVar;
            return new l.d.b(initializationMode, configuration.q(), c0009f.r(), c0009f.i());
        }
        if (fVar instanceof f.b) {
            f.b bVar = (f.b) fVar;
            return new l.b(bVar.getType(), bVar.g());
        }
        if (fVar instanceof f.e) {
            f.e eVar = (f.e) fVar;
            if (AbstractC3255y.d(eVar.h().u(), o.p.f25593o.f25605a)) {
                return new l.a(initializationMode, configuration.q(), eVar.h(), eVar.l(), configuration.h());
            }
            C4059a q8 = configuration.q();
            com.stripe.android.model.p h8 = eVar.h();
            com.stripe.android.model.r l8 = eVar.l();
            if (eVar.g() == f.a.f808b) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new l.d.a(initializationMode, q8, h8, l8, z8);
        }
        if (fVar instanceof f.c) {
            u.k u8 = configuration.u();
            if (u8 != null) {
                return new l.c(initializationMode, configuration.q(), new l.c.a(u8.h(), configuration.v(), u8.m(), u8.g(), u8.a(), u8.i(), configuration.i()));
            }
        } else if (!(fVar instanceof f.d)) {
            throw new O5.p();
        }
        return null;
    }
}
