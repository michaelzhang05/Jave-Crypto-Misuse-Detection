package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2060o implements r, InterfaceC2052n {

    /* renamed from: a, reason: collision with root package name */
    final Map f15773a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final boolean a(String str) {
        return this.f15773a.containsKey(str);
    }

    public final List b() {
        return new ArrayList(this.f15773a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        C2060o c2060o = new C2060o();
        for (Map.Entry entry : this.f15773a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2052n) {
                c2060o.f15773a.put((String) entry.getKey(), (r) entry.getValue());
            } else {
                c2060o.f15773a.put((String) entry.getKey(), ((r) entry.getValue()).d());
            }
        }
        return c2060o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2060o)) {
            return false;
        }
        return this.f15773a.equals(((C2060o) obj).f15773a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f15773a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return AbstractC2036l.b(this.f15773a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final void l(String str, r rVar) {
        if (rVar == null) {
            this.f15773a.remove(str);
        } else {
            this.f15773a.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r m(String str, T1 t12, List list) {
        if ("toString".equals(str)) {
            return new C2115v(toString());
        }
        return AbstractC2036l.a(this, new C2115v(str), t12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final r p(String str) {
        if (this.f15773a.containsKey(str)) {
            return (r) this.f15773a.get(str);
        }
        return r.f15866c0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f15773a.isEmpty()) {
            for (String str : this.f15773a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f15773a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
