package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class C7 extends AbstractC2028k {

    /* renamed from: c, reason: collision with root package name */
    private final G7 f15289c;

    public C7(G7 g72) {
        super("internal.registerCallback");
        this.f15289c = g72;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        int i8;
        AbstractC2110u2.h(this.f15749a, 3, list);
        String g8 = t12.b((r) list.get(0)).g();
        r b8 = t12.b((r) list.get(1));
        if (b8 instanceof C2076q) {
            r b9 = t12.b((r) list.get(2));
            if (b9 instanceof C2060o) {
                C2060o c2060o = (C2060o) b9;
                if (c2060o.a("type")) {
                    String g9 = c2060o.p("type").g();
                    if (c2060o.a("priority")) {
                        i8 = AbstractC2110u2.b(c2060o.p("priority").f().doubleValue());
                    } else {
                        i8 = 1000;
                    }
                    this.f15289c.a(g8, i8, (C2076q) b8, g9);
                    return r.f15866c0;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
