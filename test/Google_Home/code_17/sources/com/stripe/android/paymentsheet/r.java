package com.stripe.android.paymentsheet;

import P5.AbstractC1378t;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import t3.C4033g;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f27402a = new r();

    private r() {
    }

    public final t3.o a(List paymentMethods, boolean z8, boolean z9, B3.f fVar, Function1 nameProvider, boolean z10, boolean z11) {
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(nameProvider, "nameProvider");
        List b8 = b(paymentMethods, z8, z9, nameProvider, z10, z11);
        return new t3.o(b8, c(b8, fVar));
    }

    public final List b(List paymentMethods, boolean z8, boolean z9, Function1 nameProvider, boolean z10, boolean z11) {
        String str;
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(nameProvider, "nameProvider");
        p.b bVar = p.b.f27138a;
        if (!z8) {
            bVar = null;
        }
        p.c cVar = p.c.f27141a;
        if (!z9) {
            cVar = null;
        }
        List r8 = AbstractC1378t.r(p.a.f27135a, bVar, cVar);
        List<com.stripe.android.model.o> list = paymentMethods;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        for (com.stripe.android.model.o oVar : list) {
            o.p pVar = oVar.f25467e;
            if (pVar != null) {
                str = pVar.f25605a;
            } else {
                str = null;
            }
            arrayList.add(new p.d(new C4033g((B2.b) nameProvider.invoke(str), oVar, z11), z10));
        }
        return AbstractC1378t.G0(r8, arrayList);
    }

    public final p c(List items, B3.f fVar) {
        p b8;
        AbstractC3255y.i(items, "items");
        if (fVar != null) {
            b8 = s.b(items, fVar);
            return b8;
        }
        return null;
    }
}
