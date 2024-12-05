package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class pw<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private final int f12011f;

    /* renamed from: g, reason: collision with root package name */
    private List<ww> f12012g;

    /* renamed from: h, reason: collision with root package name */
    private Map<K, V> f12013h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12014i;

    /* renamed from: j, reason: collision with root package name */
    private volatile yw f12015j;

    /* renamed from: k, reason: collision with root package name */
    private Map<K, V> f12016k;
    private volatile sw l;

    private pw(int i2) {
        this.f12011f = i2;
        this.f12012g = Collections.emptyList();
        this.f12013h = Collections.emptyMap();
        this.f12016k = Collections.emptyMap();
    }

    private final int b(K k2) {
        int size = this.f12012g.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo((Comparable) this.f12012g.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo((Comparable) this.f12012g.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        if (this.f12014i) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> k() {
        j();
        if (this.f12013h.isEmpty() && !(this.f12013h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12013h = treeMap;
            this.f12016k = treeMap.descendingMap();
        }
        return (SortedMap) this.f12013h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzdnu<FieldDescriptorType>> pw<FieldDescriptorType, Object> p(int i2) {
        return new qw(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V r(int i2) {
        j();
        V v = (V) this.f12012g.remove(i2).getValue();
        if (!this.f12013h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = k().entrySet().iterator();
            this.f12012g.add(new ww(this, it.next()));
            it.remove();
        }
        return v;
    }

    public final boolean a() {
        return this.f12014i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.f12012g.isEmpty()) {
            this.f12012g.clear();
        }
        if (this.f12013h.isEmpty()) {
            return;
        }
        this.f12013h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f12013h.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        j();
        int b2 = b(k2);
        if (b2 >= 0) {
            return (V) this.f12012g.get(b2).setValue(v);
        }
        j();
        if (this.f12012g.isEmpty() && !(this.f12012g instanceof ArrayList)) {
            this.f12012g = new ArrayList(this.f12011f);
        }
        int i2 = -(b2 + 1);
        if (i2 >= this.f12011f) {
            return k().put(k2, v);
        }
        int size = this.f12012g.size();
        int i3 = this.f12011f;
        if (size == i3) {
            ww remove = this.f12012g.remove(i3 - 1);
            k().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f12012g.add(i2, new ww(this, k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f12015j == null) {
            this.f12015j = new yw(this, null);
        }
        return this.f12015j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw)) {
            return super.equals(obj);
        }
        pw pwVar = (pw) obj;
        int size = size();
        if (size != pwVar.size()) {
            return false;
        }
        int g2 = g();
        if (g2 != pwVar.g()) {
            return entrySet().equals(pwVar.entrySet());
        }
        for (int i2 = 0; i2 < g2; i2++) {
            if (!q(i2).equals(pwVar.q(i2))) {
                return false;
            }
        }
        if (g2 != size) {
            return this.f12013h.equals(pwVar.f12013h);
        }
        return true;
    }

    public void f() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f12014i) {
            return;
        }
        if (this.f12013h.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f12013h);
        }
        this.f12013h = unmodifiableMap;
        if (this.f12016k.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f12016k);
        }
        this.f12016k = unmodifiableMap2;
        this.f12014i = true;
    }

    public final int g() {
        return this.f12012g.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return (V) this.f12012g.get(b2).getValue();
        }
        return this.f12013h.get(comparable);
    }

    public final Iterable<Map.Entry<K, V>> h() {
        if (this.f12013h.isEmpty()) {
            return tw.a();
        }
        return this.f12013h.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int g2 = g();
        int i2 = 0;
        for (int i3 = 0; i3 < g2; i3++) {
            i2 += this.f12012g.get(i3).hashCode();
        }
        return this.f12013h.size() > 0 ? i2 + this.f12013h.hashCode() : i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> i() {
        if (this.l == null) {
            this.l = new sw(this, null);
        }
        return this.l;
    }

    public final Map.Entry<K, V> q(int i2) {
        return this.f12012g.get(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return (V) r(b2);
        }
        if (this.f12013h.isEmpty()) {
            return null;
        }
        return this.f12013h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12012g.size() + this.f12013h.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ pw(int i2, qw qwVar) {
        this(i2);
    }
}
