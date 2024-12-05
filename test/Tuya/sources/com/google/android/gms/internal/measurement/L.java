package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class L extends AbstractC2139y {
    /* JADX INFO: Access modifiers changed from: protected */
    public L() {
        this.f15960a.add(O.ADD);
        this.f15960a.add(O.DIVIDE);
        this.f15960a.add(O.MODULUS);
        this.f15960a.add(O.MULTIPLY);
        this.f15960a.add(O.NEGATE);
        this.f15960a.add(O.POST_DECREMENT);
        this.f15960a.add(O.POST_INCREMENT);
        this.f15960a.add(O.PRE_DECREMENT);
        this.f15960a.add(O.PRE_INCREMENT);
        this.f15960a.add(O.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2139y
    public final r a(String str, T1 t12, List list) {
        O o8 = O.ADD;
        int ordinal = AbstractC2110u2.e(str).ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                if (ordinal != 59) {
                    if (ordinal != 52 && ordinal != 53) {
                        if (ordinal != 55 && ordinal != 56) {
                            switch (ordinal) {
                                case 44:
                                    AbstractC2110u2.h(O.MODULUS.name(), 2, list);
                                    return new C2020j(Double.valueOf(t12.b((r) list.get(0)).f().doubleValue() % t12.b((r) list.get(1)).f().doubleValue()));
                                case 45:
                                    AbstractC2110u2.h(O.MULTIPLY.name(), 2, list);
                                    return new C2020j(Double.valueOf(t12.b((r) list.get(0)).f().doubleValue() * t12.b((r) list.get(1)).f().doubleValue()));
                                case 46:
                                    AbstractC2110u2.h(O.NEGATE.name(), 1, list);
                                    return new C2020j(Double.valueOf(-t12.b((r) list.get(0)).f().doubleValue()));
                                default:
                                    return super.b(str);
                            }
                        }
                        AbstractC2110u2.h(str, 1, list);
                        return t12.b((r) list.get(0));
                    }
                    AbstractC2110u2.h(str, 2, list);
                    r b8 = t12.b((r) list.get(0));
                    t12.b((r) list.get(1));
                    return b8;
                }
                AbstractC2110u2.h(O.SUBTRACT.name(), 2, list);
                return new C2020j(Double.valueOf(t12.b((r) list.get(0)).f().doubleValue() + new C2020j(Double.valueOf(-t12.b((r) list.get(1)).f().doubleValue())).f().doubleValue()));
            }
            AbstractC2110u2.h(O.DIVIDE.name(), 2, list);
            return new C2020j(Double.valueOf(t12.b((r) list.get(0)).f().doubleValue() / t12.b((r) list.get(1)).f().doubleValue()));
        }
        AbstractC2110u2.h(O.ADD.name(), 2, list);
        r b9 = t12.b((r) list.get(0));
        r b10 = t12.b((r) list.get(1));
        if (!(b9 instanceof InterfaceC2052n) && !(b9 instanceof C2115v) && !(b10 instanceof InterfaceC2052n) && !(b10 instanceof C2115v)) {
            return new C2020j(Double.valueOf(b9.f().doubleValue() + b10.f().doubleValue()));
        }
        return new C2115v(String.valueOf(b9.g()).concat(String.valueOf(b10.g())));
    }
}
