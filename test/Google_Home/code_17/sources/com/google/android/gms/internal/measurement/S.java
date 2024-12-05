package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class S extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public S() {
        this.f16048a.add(Z.ADD);
        this.f16048a.add(Z.DIVIDE);
        this.f16048a.add(Z.MODULUS);
        this.f16048a.add(Z.MULTIPLY);
        this.f16048a.add(Z.NEGATE);
        this.f16048a.add(Z.POST_DECREMENT);
        this.f16048a.add(Z.POST_INCREMENT);
        this.f16048a.add(Z.PRE_DECREMENT);
        this.f16048a.add(Z.PRE_INCREMENT);
        this.f16048a.add(Z.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2236s b(String str, V2 v22, List list) {
        switch (V.f16353a[AbstractC2128g2.c(str).ordinal()]) {
            case 1:
                AbstractC2128g2.f(Z.ADD, 2, list);
                InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(0));
                InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(1));
                if (!(b8 instanceof InterfaceC2183m) && !(b8 instanceof C2254u) && !(b9 instanceof InterfaceC2183m) && !(b9 instanceof C2254u)) {
                    return new C2165k(Double.valueOf(b8.z().doubleValue() + b9.z().doubleValue()));
                }
                return new C2254u(b8.A() + b9.A());
            case 2:
                AbstractC2128g2.f(Z.DIVIDE, 2, list);
                return new C2165k(Double.valueOf(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue() / v22.b((InterfaceC2236s) list.get(1)).z().doubleValue()));
            case 3:
                AbstractC2128g2.f(Z.MODULUS, 2, list);
                return new C2165k(Double.valueOf(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue() % v22.b((InterfaceC2236s) list.get(1)).z().doubleValue()));
            case 4:
                AbstractC2128g2.f(Z.MULTIPLY, 2, list);
                return new C2165k(Double.valueOf(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue() * v22.b((InterfaceC2236s) list.get(1)).z().doubleValue()));
            case 5:
                AbstractC2128g2.f(Z.NEGATE, 1, list);
                return new C2165k(Double.valueOf(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                AbstractC2128g2.g(str, 2, list);
                InterfaceC2236s b10 = v22.b((InterfaceC2236s) list.get(0));
                v22.b((InterfaceC2236s) list.get(1));
                return b10;
            case 8:
            case 9:
                AbstractC2128g2.g(str, 1, list);
                return v22.b((InterfaceC2236s) list.get(0));
            case 10:
                AbstractC2128g2.f(Z.SUBTRACT, 2, list);
                return new C2165k(Double.valueOf(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue() + new C2165k(Double.valueOf(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue() * (-1.0d))).z().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
