package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class G8 extends AbstractC2192n {

    /* renamed from: c, reason: collision with root package name */
    private C2075b f16144c;

    public G8(C2075b c2075b) {
        super("internal.registerCallback");
        this.f16144c = c2075b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n
    public final InterfaceC2236s a(V2 v22, List list) {
        int i8;
        AbstractC2128g2.g(this.f16731a, 3, list);
        String A8 = v22.b((InterfaceC2236s) list.get(0)).A();
        InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(1));
        if (b8 instanceof C2245t) {
            InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(2));
            if (b9 instanceof r) {
                r rVar = (r) b9;
                if (rVar.f("type")) {
                    String A9 = rVar.c("type").A();
                    if (rVar.f("priority")) {
                        i8 = AbstractC2128g2.i(rVar.c("priority").z().doubleValue());
                    } else {
                        i8 = 1000;
                    }
                    this.f16144c.c(A8, i8, (C2245t) b8, A9);
                    return InterfaceC2236s.f16802b0;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
