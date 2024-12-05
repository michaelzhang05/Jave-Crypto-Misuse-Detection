package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1986f implements Iterable, r, InterfaceC2052n {

    /* renamed from: a, reason: collision with root package name */
    final SortedMap f15698a;

    /* renamed from: b, reason: collision with root package name */
    final Map f15699b;

    public C1986f() {
        this.f15698a = new TreeMap();
        this.f15699b = new TreeMap();
    }

    public final boolean A(int i8) {
        if (i8 >= 0 && i8 <= ((Integer) this.f15698a.lastKey()).intValue()) {
            return this.f15698a.containsKey(Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final boolean a(String str) {
        if (!"length".equals(str) && !this.f15699b.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        C1986f c1986f = new C1986f();
        for (Map.Entry entry : this.f15698a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2052n) {
                c1986f.f15698a.put((Integer) entry.getKey(), (r) entry.getValue());
            } else {
                c1986f.f15698a.put((Integer) entry.getKey(), ((r) entry.getValue()).d());
            }
        }
        return c1986f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1986f)) {
            return false;
        }
        C1986f c1986f = (C1986f) obj;
        if (r() != c1986f.r()) {
            return false;
        }
        if (this.f15698a.isEmpty()) {
            return c1986f.f15698a.isEmpty();
        }
        for (int intValue = ((Integer) this.f15698a.firstKey()).intValue(); intValue <= ((Integer) this.f15698a.lastKey()).intValue(); intValue++) {
            if (!s(intValue).equals(c1986f.s(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        if (this.f15698a.size() == 1) {
            return s(0).f();
        }
        if (this.f15698a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return t(",");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f15698a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return new C1968d(this, this.f15698a.keySet().iterator(), this.f15699b.keySet().iterator());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1977e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final void l(String str, r rVar) {
        if (rVar == null) {
            this.f15699b.remove(str);
        } else {
            this.f15699b.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return AbstractC2036l.a(this, new C2115v(str), t12, list);
        }
        return E.a(str, this, t12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final r p(String str) {
        r rVar;
        if ("length".equals(str)) {
            return new C2020j(Double.valueOf(r()));
        }
        if (a(str) && (rVar = (r) this.f15699b.get(str)) != null) {
            return rVar;
        }
        return r.f15866c0;
    }

    public final int q() {
        return this.f15698a.size();
    }

    public final int r() {
        if (this.f15698a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f15698a.lastKey()).intValue() + 1;
    }

    public final r s(int i8) {
        r rVar;
        if (i8 < r()) {
            if (A(i8) && (rVar = (r) this.f15698a.get(Integer.valueOf(i8))) != null) {
                return rVar;
            }
            return r.f15866c0;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String t(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f15698a.isEmpty()) {
            int i8 = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i8 >= r()) {
                    break;
                }
                r s8 = s(i8);
                sb.append(str2);
                if (!(s8 instanceof C2123w) && !(s8 instanceof C2068p)) {
                    sb.append(s8.g());
                }
                i8++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return t(",");
    }

    public final Iterator u() {
        return this.f15698a.keySet().iterator();
    }

    public final List v() {
        ArrayList arrayList = new ArrayList(r());
        for (int i8 = 0; i8 < r(); i8++) {
            arrayList.add(s(i8));
        }
        return arrayList;
    }

    public final void w() {
        this.f15698a.clear();
    }

    public final void x(int i8, r rVar) {
        if (i8 >= 0) {
            if (i8 >= r()) {
                z(i8, rVar);
                return;
            }
            for (int intValue = ((Integer) this.f15698a.lastKey()).intValue(); intValue >= i8; intValue--) {
                SortedMap sortedMap = this.f15698a;
                Integer valueOf = Integer.valueOf(intValue);
                r rVar2 = (r) sortedMap.get(valueOf);
                if (rVar2 != null) {
                    z(intValue + 1, rVar2);
                    this.f15698a.remove(valueOf);
                }
            }
            z(i8, rVar);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i8);
    }

    public final void y(int i8) {
        int intValue = ((Integer) this.f15698a.lastKey()).intValue();
        if (i8 <= intValue && i8 >= 0) {
            this.f15698a.remove(Integer.valueOf(i8));
            if (i8 == intValue) {
                SortedMap sortedMap = this.f15698a;
                int i9 = i8 - 1;
                Integer valueOf = Integer.valueOf(i9);
                if (!sortedMap.containsKey(valueOf) && i9 >= 0) {
                    this.f15698a.put(valueOf, r.f15866c0);
                    return;
                }
                return;
            }
            while (true) {
                i8++;
                if (i8 <= ((Integer) this.f15698a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f15698a;
                    Integer valueOf2 = Integer.valueOf(i8);
                    r rVar = (r) sortedMap2.get(valueOf2);
                    if (rVar != null) {
                        this.f15698a.put(Integer.valueOf(i8 - 1), rVar);
                        this.f15698a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void z(int i8, r rVar) {
        if (i8 <= 32468) {
            if (i8 >= 0) {
                if (rVar == null) {
                    this.f15698a.remove(Integer.valueOf(i8));
                    return;
                } else {
                    this.f15698a.put(Integer.valueOf(i8), rVar);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
        }
        throw new IllegalStateException("Array too large");
    }

    public C1986f(List list) {
        this();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                z(i8, (r) list.get(i8));
            }
        }
    }
}
