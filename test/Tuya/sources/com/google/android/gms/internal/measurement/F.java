package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class F extends AbstractC2139y {
    /* JADX INFO: Access modifiers changed from: protected */
    public F() {
        this.f15960a.add(O.AND);
        this.f15960a.add(O.NOT);
        this.f15960a.add(O.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2139y
    public final r a(String str, T1 t12, List list) {
        O o8 = O.ADD;
        int ordinal = AbstractC2110u2.e(str).ordinal();
        if (ordinal != 1) {
            if (ordinal != 47) {
                if (ordinal != 50) {
                    return super.b(str);
                }
                AbstractC2110u2.h(O.OR.name(), 2, list);
                r b8 = t12.b((r) list.get(0));
                if (b8.h().booleanValue()) {
                    return b8;
                }
                return t12.b((r) list.get(1));
            }
            AbstractC2110u2.h(O.NOT.name(), 1, list);
            return new C1995g(Boolean.valueOf(!t12.b((r) list.get(0)).h().booleanValue()));
        }
        AbstractC2110u2.h(O.AND.name(), 2, list);
        r b9 = t12.b((r) list.get(0));
        if (!b9.h().booleanValue()) {
            return b9;
        }
        return t12.b((r) list.get(1));
    }
}
