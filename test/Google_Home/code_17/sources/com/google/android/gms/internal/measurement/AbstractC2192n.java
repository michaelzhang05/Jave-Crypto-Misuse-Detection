package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2192n implements InterfaceC2183m, InterfaceC2236s {

    /* renamed from: a, reason: collision with root package name */
    protected final String f16731a;

    /* renamed from: b, reason: collision with root package name */
    protected final Map f16732b = new HashMap();

    public AbstractC2192n(String str) {
        this.f16731a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final String A() {
        return this.f16731a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Iterator B() {
        return AbstractC2210p.b(this.f16732b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s C(String str, V2 v22, List list) {
        if ("toString".equals(str)) {
            return new C2254u(this.f16731a);
        }
        return AbstractC2210p.a(this, new C2254u(str), v22, list);
    }

    public abstract InterfaceC2236s a(V2 v22, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public InterfaceC2236s b() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final InterfaceC2236s c(String str) {
        if (this.f16732b.containsKey(str)) {
            return (InterfaceC2236s) this.f16732b.get(str);
        }
        return InterfaceC2236s.f16802b0;
    }

    public final String d() {
        return this.f16731a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2192n)) {
            return false;
        }
        AbstractC2192n abstractC2192n = (AbstractC2192n) obj;
        String str = this.f16731a;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC2192n.f16731a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final boolean f(String str) {
        return this.f16732b.containsKey(str);
    }

    public int hashCode() {
        String str = this.f16731a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final void j(String str, InterfaceC2236s interfaceC2236s) {
        if (interfaceC2236s == null) {
            this.f16732b.remove(str);
        } else {
            this.f16732b.put(str, interfaceC2236s);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Boolean y() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Double z() {
        return Double.valueOf(Double.NaN);
    }
}
