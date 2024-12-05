package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class A4 extends AbstractC2192n {

    /* renamed from: c, reason: collision with root package name */
    private final C2095d f16052c;

    public A4(C2095d c2095d) {
        super("internal.eventLogger");
        this.f16052c = c2095d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n
    public final InterfaceC2236s a(V2 v22, List list) {
        Map hashMap;
        AbstractC2128g2.g(this.f16731a, 3, list);
        String A8 = v22.b((InterfaceC2236s) list.get(0)).A();
        long a8 = (long) AbstractC2128g2.a(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue());
        InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(2));
        if (b8 instanceof r) {
            hashMap = AbstractC2128g2.e((r) b8);
        } else {
            hashMap = new HashMap();
        }
        this.f16052c.c(A8, a8, hashMap);
        return InterfaceC2236s.f16802b0;
    }
}
