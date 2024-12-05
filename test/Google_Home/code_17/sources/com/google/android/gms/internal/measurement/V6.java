package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V6 extends AbstractC2192n {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2261u6 f16425c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(C2278w5 c2278w5, String str, InterfaceC2261u6 interfaceC2261u6) {
        super(str);
        this.f16425c = interfaceC2261u6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n
    public final InterfaceC2236s a(V2 v22, List list) {
        AbstractC2128g2.g("getValue", 2, list);
        InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(0));
        InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(1));
        String c8 = this.f16425c.c(b8.A());
        if (c8 != null) {
            return new C2254u(c8);
        }
        return b9;
    }
}
