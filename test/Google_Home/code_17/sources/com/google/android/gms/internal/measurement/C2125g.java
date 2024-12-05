package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2125g implements InterfaceC2183m, InterfaceC2236s, Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final SortedMap f16651a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16652b;

    public C2125g() {
        this.f16651a = new TreeMap();
        this.f16652b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final String A() {
        return toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Iterator B() {
        return new C2115f(this, this.f16651a.keySet().iterator(), this.f16652b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s C(String str, V2 v22, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return AbstractC2210p.a(this, new C2254u(str), v22, list);
        }
        return H.d(str, this, v22, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s b() {
        C2125g c2125g = new C2125g();
        for (Map.Entry entry : this.f16651a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2183m) {
                c2125g.f16651a.put((Integer) entry.getKey(), (InterfaceC2236s) entry.getValue());
            } else {
                c2125g.f16651a.put((Integer) entry.getKey(), ((InterfaceC2236s) entry.getValue()).b());
            }
        }
        return c2125g;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final InterfaceC2236s c(String str) {
        InterfaceC2236s interfaceC2236s;
        if ("length".equals(str)) {
            return new C2165k(Double.valueOf(m()));
        }
        if (f(str) && (interfaceC2236s = (InterfaceC2236s) this.f16652b.get(str)) != null) {
            return interfaceC2236s;
        }
        return InterfaceC2236s.f16802b0;
    }

    public final int d() {
        return this.f16651a.size();
    }

    public final InterfaceC2236s e(int i8) {
        InterfaceC2236s interfaceC2236s;
        if (i8 < m()) {
            if (q(i8) && (interfaceC2236s = (InterfaceC2236s) this.f16651a.get(Integer.valueOf(i8))) != null) {
                return interfaceC2236s;
            }
            return InterfaceC2236s.f16802b0;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2125g)) {
            return false;
        }
        C2125g c2125g = (C2125g) obj;
        if (m() != c2125g.m()) {
            return false;
        }
        if (this.f16651a.isEmpty()) {
            return c2125g.f16651a.isEmpty();
        }
        for (int intValue = ((Integer) this.f16651a.firstKey()).intValue(); intValue <= ((Integer) this.f16651a.lastKey()).intValue(); intValue++) {
            if (!e(intValue).equals(c2125g.e(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final boolean f(String str) {
        if (!"length".equals(str) && !this.f16652b.containsKey(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16651a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2145i(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    public final void j(String str, InterfaceC2236s interfaceC2236s) {
        if (interfaceC2236s == null) {
            this.f16652b.remove(str);
        } else {
            this.f16652b.put(str, interfaceC2236s);
        }
    }

    public final void k(int i8, InterfaceC2236s interfaceC2236s) {
        if (i8 >= 0) {
            if (i8 >= m()) {
                p(i8, interfaceC2236s);
                return;
            }
            for (int intValue = ((Integer) this.f16651a.lastKey()).intValue(); intValue >= i8; intValue--) {
                InterfaceC2236s interfaceC2236s2 = (InterfaceC2236s) this.f16651a.get(Integer.valueOf(intValue));
                if (interfaceC2236s2 != null) {
                    p(intValue + 1, interfaceC2236s2);
                    this.f16651a.remove(Integer.valueOf(intValue));
                }
            }
            p(i8, interfaceC2236s);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i8);
    }

    public final void l(InterfaceC2236s interfaceC2236s) {
        p(m(), interfaceC2236s);
    }

    public final int m() {
        if (this.f16651a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f16651a.lastKey()).intValue() + 1;
    }

    public final String n(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f16651a.isEmpty()) {
            for (int i8 = 0; i8 < m(); i8++) {
                InterfaceC2236s e8 = e(i8);
                sb.append(str);
                if (!(e8 instanceof C2299z) && !(e8 instanceof C2219q)) {
                    sb.append(e8.A());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void o(int i8) {
        int intValue = ((Integer) this.f16651a.lastKey()).intValue();
        if (i8 <= intValue && i8 >= 0) {
            this.f16651a.remove(Integer.valueOf(i8));
            if (i8 == intValue) {
                int i9 = i8 - 1;
                if (!this.f16651a.containsKey(Integer.valueOf(i9)) && i9 >= 0) {
                    this.f16651a.put(Integer.valueOf(i9), InterfaceC2236s.f16802b0);
                    return;
                }
                return;
            }
            while (true) {
                i8++;
                if (i8 <= ((Integer) this.f16651a.lastKey()).intValue()) {
                    InterfaceC2236s interfaceC2236s = (InterfaceC2236s) this.f16651a.get(Integer.valueOf(i8));
                    if (interfaceC2236s != null) {
                        this.f16651a.put(Integer.valueOf(i8 - 1), interfaceC2236s);
                        this.f16651a.remove(Integer.valueOf(i8));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void p(int i8, InterfaceC2236s interfaceC2236s) {
        if (i8 <= 32468) {
            if (i8 >= 0) {
                if (interfaceC2236s == null) {
                    this.f16651a.remove(Integer.valueOf(i8));
                    return;
                } else {
                    this.f16651a.put(Integer.valueOf(i8), interfaceC2236s);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean q(int i8) {
        if (i8 >= 0 && i8 <= ((Integer) this.f16651a.lastKey()).intValue()) {
            return this.f16651a.containsKey(Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
    }

    public final Iterator r() {
        return this.f16651a.keySet().iterator();
    }

    public final List t() {
        ArrayList arrayList = new ArrayList(m());
        for (int i8 = 0; i8 < m(); i8++) {
            arrayList.add(e(i8));
        }
        return arrayList;
    }

    public final String toString() {
        return n(",");
    }

    public final void u() {
        this.f16651a.clear();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Boolean y() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Double z() {
        if (this.f16651a.size() == 1) {
            return e(0).z();
        }
        if (this.f16651a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public C2125g(List list) {
        this();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                p(i8, (InterfaceC2236s) list.get(i8));
            }
        }
    }

    public C2125g(InterfaceC2236s... interfaceC2236sArr) {
        this(Arrays.asList(interfaceC2236sArr));
    }
}
