package com.stripe.android.paymentsheet;

import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.l;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3159y;
import r3.C3686a;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class m {
    public static final l a(AbstractC3991f abstractC3991f, u.l initializationMode, u.g configuration) {
        boolean z8;
        AbstractC3159y.i(abstractC3991f, "<this>");
        AbstractC3159y.i(initializationMode, "initializationMode");
        AbstractC3159y.i(configuration, "configuration");
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            AbstractC3991f.C0916f c0916f = (AbstractC3991f.C0916f) abstractC3991f;
            return new l.d.b(initializationMode, configuration.t(), c0916f.v(), c0916f.i());
        }
        if (abstractC3991f instanceof AbstractC3991f.b) {
            AbstractC3991f.b bVar = (AbstractC3991f.b) abstractC3991f;
            return new l.b(bVar.getType(), bVar.e());
        }
        if (abstractC3991f instanceof AbstractC3991f.e) {
            AbstractC3991f.e eVar = (AbstractC3991f.e) abstractC3991f;
            if (AbstractC3159y.d(eVar.f().o(), o.p.f24538o.f24550a)) {
                return new l.a(initializationMode, configuration.t(), eVar.f(), eVar.j(), configuration.f());
            }
            C3686a t8 = configuration.t();
            com.stripe.android.model.p f8 = eVar.f();
            com.stripe.android.model.r j8 = eVar.j();
            if (eVar.e() == AbstractC3991f.a.f39764b) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new l.d.a(initializationMode, t8, f8, j8, z8);
        }
        if (abstractC3991f instanceof AbstractC3991f.c) {
            u.k o8 = configuration.o();
            if (o8 != null) {
                return new l.c(initializationMode, configuration.t(), new l.c.a(o8.f(), configuration.s(), o8.p(), o8.e(), o8.b(), o8.i(), configuration.i()));
            }
        } else if (!(abstractC3991f instanceof AbstractC3991f.d)) {
            throw new L5.p();
        }
        return null;
    }
}
