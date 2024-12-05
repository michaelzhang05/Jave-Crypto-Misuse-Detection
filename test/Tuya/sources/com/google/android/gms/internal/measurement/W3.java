package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class W3 extends AbstractC2028k {

    /* renamed from: c, reason: collision with root package name */
    private final C1959c f15594c;

    public W3(C1959c c1959c) {
        super("internal.eventLogger");
        this.f15594c = c1959c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        Map hashMap;
        AbstractC2110u2.h(this.f15749a, 3, list);
        String g8 = t12.b((r) list.get(0)).g();
        long a8 = (long) AbstractC2110u2.a(t12.b((r) list.get(1)).f().doubleValue());
        r b8 = t12.b((r) list.get(2));
        if (b8 instanceof C2060o) {
            hashMap = AbstractC2110u2.g((C2060o) b8);
        } else {
            hashMap = new HashMap();
        }
        this.f15594c.e(g8, a8, hashMap);
        return r.f15866c0;
    }
}
