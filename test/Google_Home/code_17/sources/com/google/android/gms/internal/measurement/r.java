package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class r implements InterfaceC2183m, InterfaceC2236s {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16790a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final String A() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Iterator B() {
        return AbstractC2210p.b(this.f16790a);
    }

    public InterfaceC2236s C(String str, V2 v22, List list) {
        if ("toString".equals(str)) {
            return new C2254u(toString());
        }
        return AbstractC2210p.a(this, new C2254u(str), v22, list);
    }

    public final List a() {
        return new ArrayList(this.f16790a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s b() {
        r rVar = new r();
        for (Map.Entry entry : this.f16790a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2183m) {
                rVar.f16790a.put((String) entry.getKey(), (InterfaceC2236s) entry.getValue());
            } else {
                rVar.f16790a.put((String) entry.getKey(), ((InterfaceC2236s) entry.getValue()).b());
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final InterfaceC2236s c(String str) {
        if (this.f16790a.containsKey(str)) {
            return (InterfaceC2236s) this.f16790a.get(str);
        }
        return InterfaceC2236s.f16802b0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f16790a.equals(((r) obj).f16790a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final boolean f(String str) {
        return this.f16790a.containsKey(str);
    }

    public int hashCode() {
        return this.f16790a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final void j(String str, InterfaceC2236s interfaceC2236s) {
        if (interfaceC2236s == null) {
            this.f16790a.remove(str);
        } else {
            this.f16790a.put(str, interfaceC2236s);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f16790a.isEmpty()) {
            for (String str : this.f16790a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f16790a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
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
