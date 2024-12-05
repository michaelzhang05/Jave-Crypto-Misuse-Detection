package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2028k implements r, InterfaceC2052n {

    /* renamed from: a, reason: collision with root package name */
    protected final String f15749a;

    /* renamed from: b, reason: collision with root package name */
    protected final Map f15750b = new HashMap();

    public AbstractC2028k(String str) {
        this.f15749a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final boolean a(String str) {
        return this.f15750b.containsKey(str);
    }

    public abstract r b(T1 t12, List list);

    public final String c() {
        return this.f15749a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2028k)) {
            return false;
        }
        AbstractC2028k abstractC2028k = (AbstractC2028k) obj;
        String str = this.f15749a;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC2028k.f15749a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return this.f15749a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        String str = this.f15749a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return AbstractC2036l.b(this.f15750b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final void l(String str, r rVar) {
        if (rVar == null) {
            this.f15750b.remove(str);
        } else {
            this.f15750b.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        if ("toString".equals(str)) {
            return new C2115v(this.f15749a);
        }
        return AbstractC2036l.a(this, new C2115v(str), t12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final r p(String str) {
        if (this.f15750b.containsKey(str)) {
            return (r) this.f15750b.get(str);
        }
        return r.f15866c0;
    }
}
