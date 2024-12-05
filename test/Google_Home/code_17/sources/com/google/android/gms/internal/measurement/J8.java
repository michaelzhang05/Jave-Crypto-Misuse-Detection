package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class J8 extends AbstractC2192n {

    /* renamed from: c, reason: collision with root package name */
    private final Z4 f16162c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f16163d;

    public J8(Z4 z42) {
        super("require");
        this.f16163d = new HashMap();
        this.f16162c = z42;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n
    public final InterfaceC2236s a(V2 v22, List list) {
        AbstractC2128g2.g("require", 1, list);
        String A8 = v22.b((InterfaceC2236s) list.get(0)).A();
        if (this.f16163d.containsKey(A8)) {
            return (InterfaceC2236s) this.f16163d.get(A8);
        }
        InterfaceC2236s a8 = this.f16162c.a(A8);
        if (a8 instanceof AbstractC2192n) {
            this.f16163d.put(A8, (AbstractC2192n) a8);
        }
        return a8;
    }
}
