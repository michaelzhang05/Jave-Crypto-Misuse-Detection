package com.stripe.android.payments.bankaccount.navigation;

import L5.p;
import com.stripe.android.payments.bankaccount.navigation.a;
import com.stripe.android.payments.bankaccount.navigation.d;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class b {
    public static final a a(d dVar) {
        a cVar;
        AbstractC3159y.i(dVar, "<this>");
        if (dVar instanceof d.a) {
            return a.C0541a.f25098a;
        }
        if (dVar instanceof d.b) {
            d.b bVar = (d.b) dVar;
            if (bVar.b().c() == null) {
                return new a.c(new IllegalArgumentException("StripeIntent not set for this session"));
            }
            if (bVar.b().b() == null) {
                return new a.c(new IllegalArgumentException("instant debits data cannot be null"));
            }
            cVar = new a.b(bVar.b().c(), bVar.b().b().e(), bVar.b().b().c(), bVar.b().b().b());
        } else if (dVar instanceof d.c) {
            cVar = new a.c(((d.c) dVar).b());
        } else {
            throw new p();
        }
        return cVar;
    }
}
