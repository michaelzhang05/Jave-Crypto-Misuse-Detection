package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class J extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public J() {
        this.f16048a.add(Z.AND);
        this.f16048a.add(Z.NOT);
        this.f16048a.add(Z.OR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2236s b(String str, V2 v22, List list) {
        int i8 = M.f16223a[AbstractC2128g2.c(str).ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return super.a(str);
                }
                AbstractC2128g2.f(Z.OR, 2, list);
                InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(0));
                if (b8.y().booleanValue()) {
                    return b8;
                }
                return v22.b((InterfaceC2236s) list.get(1));
            }
            AbstractC2128g2.f(Z.NOT, 1, list);
            return new C2135h(Boolean.valueOf(!v22.b((InterfaceC2236s) list.get(0)).y().booleanValue()));
        }
        AbstractC2128g2.f(Z.AND, 2, list);
        InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(0));
        if (!b9.y().booleanValue()) {
            return b9;
        }
        return v22.b((InterfaceC2236s) list.get(1));
    }
}
