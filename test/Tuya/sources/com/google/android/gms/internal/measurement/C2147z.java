package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2147z {

    /* renamed from: a, reason: collision with root package name */
    final Map f15970a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final M f15971b = new M();

    public C2147z() {
        b(new C2131x());
        b(new A());
        b(new B());
        b(new F());
        b(new K());
        b(new L());
        b(new N());
    }

    public final r a(T1 t12, r rVar) {
        AbstractC2139y abstractC2139y;
        AbstractC2110u2.c(t12);
        if (rVar instanceof C2091s) {
            C2091s c2091s = (C2091s) rVar;
            ArrayList b8 = c2091s.b();
            String a8 = c2091s.a();
            if (this.f15970a.containsKey(a8)) {
                abstractC2139y = (AbstractC2139y) this.f15970a.get(a8);
            } else {
                abstractC2139y = this.f15971b;
            }
            return abstractC2139y.a(a8, t12, b8);
        }
        return rVar;
    }

    final void b(AbstractC2139y abstractC2139y) {
        Iterator it = abstractC2139y.f15960a.iterator();
        while (it.hasNext()) {
            this.f15970a.put(((O) it.next()).b().toString(), abstractC2139y);
        }
    }
}
