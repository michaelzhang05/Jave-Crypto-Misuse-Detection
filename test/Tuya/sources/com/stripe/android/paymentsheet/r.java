package com.stripe.android.paymentsheet;

import M5.AbstractC1246t;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import q3.C3654g;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f26347a = new r();

    private r() {
    }

    public final q3.o a(List paymentMethods, boolean z8, boolean z9, AbstractC3991f abstractC3991f, Function1 nameProvider, boolean z10, boolean z11) {
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(nameProvider, "nameProvider");
        List b8 = b(paymentMethods, z8, z9, nameProvider, z10, z11);
        return new q3.o(b8, c(b8, abstractC3991f));
    }

    public final List b(List paymentMethods, boolean z8, boolean z9, Function1 nameProvider, boolean z10, boolean z11) {
        String str;
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(nameProvider, "nameProvider");
        p.b bVar = p.b.f26083a;
        if (!z8) {
            bVar = null;
        }
        p.c cVar = p.c.f26086a;
        if (!z9) {
            cVar = null;
        }
        List r8 = AbstractC1246t.r(p.a.f26080a, bVar, cVar);
        List<com.stripe.android.model.o> list = paymentMethods;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        for (com.stripe.android.model.o oVar : list) {
            o.p pVar = oVar.f24412e;
            if (pVar != null) {
                str = pVar.f24550a;
            } else {
                str = null;
            }
            arrayList.add(new p.d(new C3654g((InterfaceC3983b) nameProvider.invoke(str), oVar, z11), z10));
        }
        return AbstractC1246t.G0(r8, arrayList);
    }

    public final p c(List items, AbstractC3991f abstractC3991f) {
        p b8;
        AbstractC3159y.i(items, "items");
        if (abstractC3991f != null) {
            b8 = s.b(items, abstractC3991f);
            return b8;
        }
        return null;
    }
}
