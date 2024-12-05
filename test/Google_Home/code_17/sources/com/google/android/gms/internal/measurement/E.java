package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private Map f16117a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private U f16118b = new U();

    public E() {
        b(new C2290y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    private final void b(A a8) {
        Iterator it = a8.f16048a.iterator();
        while (it.hasNext()) {
            this.f16117a.put(((Z) it.next()).toString(), a8);
        }
    }

    public final InterfaceC2236s a(V2 v22, InterfaceC2236s interfaceC2236s) {
        A a8;
        AbstractC2128g2.b(v22);
        if (interfaceC2236s instanceof C2263v) {
            C2263v c2263v = (C2263v) interfaceC2236s;
            ArrayList c8 = c2263v.c();
            String a9 = c2263v.a();
            if (this.f16117a.containsKey(a9)) {
                a8 = (A) this.f16117a.get(a9);
            } else {
                a8 = this.f16118b;
            }
            return a8.b(a9, v22, c8);
        }
        return interfaceC2236s;
    }
}
