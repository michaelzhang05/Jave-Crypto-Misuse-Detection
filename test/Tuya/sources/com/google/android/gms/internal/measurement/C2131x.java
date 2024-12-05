package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2131x extends AbstractC2139y {
    public C2131x() {
        this.f15960a.add(O.BITWISE_AND);
        this.f15960a.add(O.BITWISE_LEFT_SHIFT);
        this.f15960a.add(O.BITWISE_NOT);
        this.f15960a.add(O.BITWISE_OR);
        this.f15960a.add(O.BITWISE_RIGHT_SHIFT);
        this.f15960a.add(O.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f15960a.add(O.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2139y
    public final r a(String str, T1 t12, List list) {
        O o8 = O.ADD;
        switch (AbstractC2110u2.e(str).ordinal()) {
            case 4:
                AbstractC2110u2.h(O.BITWISE_AND.name(), 2, list);
                return new C2020j(Double.valueOf(AbstractC2110u2.b(t12.b((r) list.get(0)).f().doubleValue()) & AbstractC2110u2.b(t12.b((r) list.get(1)).f().doubleValue())));
            case 5:
                AbstractC2110u2.h(O.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C2020j(Double.valueOf(AbstractC2110u2.b(t12.b((r) list.get(0)).f().doubleValue()) << ((int) (AbstractC2110u2.d(t12.b((r) list.get(1)).f().doubleValue()) & 31))));
            case 6:
                AbstractC2110u2.h(O.BITWISE_NOT.name(), 1, list);
                return new C2020j(Double.valueOf(~AbstractC2110u2.b(t12.b((r) list.get(0)).f().doubleValue())));
            case 7:
                AbstractC2110u2.h(O.BITWISE_OR.name(), 2, list);
                return new C2020j(Double.valueOf(AbstractC2110u2.b(t12.b((r) list.get(0)).f().doubleValue()) | AbstractC2110u2.b(t12.b((r) list.get(1)).f().doubleValue())));
            case 8:
                AbstractC2110u2.h(O.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C2020j(Double.valueOf(AbstractC2110u2.b(t12.b((r) list.get(0)).f().doubleValue()) >> ((int) (AbstractC2110u2.d(t12.b((r) list.get(1)).f().doubleValue()) & 31))));
            case 9:
                AbstractC2110u2.h(O.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C2020j(Double.valueOf(AbstractC2110u2.d(t12.b((r) list.get(0)).f().doubleValue()) >>> ((int) (AbstractC2110u2.d(t12.b((r) list.get(1)).f().doubleValue()) & 31))));
            case 10:
                AbstractC2110u2.h(O.BITWISE_XOR.name(), 2, list);
                return new C2020j(Double.valueOf(AbstractC2110u2.b(t12.b((r) list.get(0)).f().doubleValue()) ^ AbstractC2110u2.b(t12.b((r) list.get(1)).f().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
