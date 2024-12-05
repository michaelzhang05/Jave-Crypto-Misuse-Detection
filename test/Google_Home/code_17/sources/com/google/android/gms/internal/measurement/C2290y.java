package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2290y extends A {
    public C2290y() {
        this.f16048a.add(Z.BITWISE_AND);
        this.f16048a.add(Z.BITWISE_LEFT_SHIFT);
        this.f16048a.add(Z.BITWISE_NOT);
        this.f16048a.add(Z.BITWISE_OR);
        this.f16048a.add(Z.BITWISE_RIGHT_SHIFT);
        this.f16048a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f16048a.add(Z.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2236s b(String str, V2 v22, List list) {
        switch (B.f16077a[AbstractC2128g2.c(str).ordinal()]) {
            case 1:
                AbstractC2128g2.f(Z.BITWISE_AND, 2, list);
                return new C2165k(Double.valueOf(AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue()) & AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue())));
            case 2:
                AbstractC2128g2.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C2165k(Double.valueOf(AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue()) << ((int) (AbstractC2128g2.m(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue()) & 31))));
            case 3:
                AbstractC2128g2.f(Z.BITWISE_NOT, 1, list);
                return new C2165k(Double.valueOf(~AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue())));
            case 4:
                AbstractC2128g2.f(Z.BITWISE_OR, 2, list);
                return new C2165k(Double.valueOf(AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue()) | AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue())));
            case 5:
                AbstractC2128g2.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C2165k(Double.valueOf(AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue()) >> ((int) (AbstractC2128g2.m(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue()) & 31))));
            case 6:
                AbstractC2128g2.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C2165k(Double.valueOf(AbstractC2128g2.m(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue()) >>> ((int) (AbstractC2128g2.m(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue()) & 31))));
            case 7:
                AbstractC2128g2.f(Z.BITWISE_XOR, 2, list);
                return new C2165k(Double.valueOf(AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue()) ^ AbstractC2128g2.i(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
