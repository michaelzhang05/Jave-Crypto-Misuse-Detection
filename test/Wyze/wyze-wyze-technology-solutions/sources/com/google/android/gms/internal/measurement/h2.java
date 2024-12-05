package com.google.android.gms.internal.measurement;

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
public class h2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private final int f15968f;

    /* renamed from: g, reason: collision with root package name */
    private List<o2> f15969g;

    /* renamed from: h, reason: collision with root package name */
    private Map<K, V> f15970h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15971i;

    /* renamed from: j, reason: collision with root package name */
    private volatile q2 f15972j;

    /* renamed from: k, reason: collision with root package name */
    private Map<K, V> f15973k;
    private volatile k2 l;

    private h2(int i2) {
        this.f15968f = i2;
        this.f15969g = Collections.emptyList();
        this.f15970h = Collections.emptyMap();
        this.f15973k = Collections.emptyMap();
    }

    private final int b(K k2) {
        int size = this.f15969g.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo((Comparable) this.f15969g.get(size).getKey());
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
            int compareTo2 = k2.compareTo((Comparable) this.f15969g.get(i3).getKey());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzuh<FieldDescriptorType>> h2<FieldDescriptorType, Object> g(int i2) {
        return new i2(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V i(int i2) {
        q();
        V v = (V) this.f15969g.remove(i2).getValue();
        if (!this.f15970h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = r().entrySet().iterator();
            this.f15969g.add(new o2(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        if (this.f15971i) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> r() {
        q();
        if (this.f15970h.isEmpty() && !(this.f15970h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15970h = treeMap;
            this.f15973k = treeMap.descendingMap();
        }
        return (SortedMap) this.f15970h;
    }

    public final boolean a() {
        return this.f15971i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        q();
        if (!this.f15969g.isEmpty()) {
            this.f15969g.clear();
        }
        if (this.f15970h.isEmpty()) {
            return;
        }
        this.f15970h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f15970h.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        q();
        int b2 = b(k2);
        if (b2 >= 0) {
            return (V) this.f15969g.get(b2).setValue(v);
        }
        q();
        if (this.f15969g.isEmpty() && !(this.f15969g instanceof ArrayList)) {
            this.f15969g = new ArrayList(this.f15968f);
        }
        int i2 = -(b2 + 1);
        if (i2 >= this.f15968f) {
            return r().put(k2, v);
        }
        int size = this.f15969g.size();
        int i3 = this.f15968f;
        if (size == i3) {
            o2 remove = this.f15969g.remove(i3 - 1);
            r().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f15969g.add(i2, new o2(this, k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f15972j == null) {
            this.f15972j = new q2(this, null);
        }
        return this.f15972j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return super.equals(obj);
        }
        h2 h2Var = (h2) obj;
        int size = size();
        if (size != h2Var.size()) {
            return false;
        }
        int m = m();
        if (m != h2Var.m()) {
            return entrySet().equals(h2Var.entrySet());
        }
        for (int i2 = 0; i2 < m; i2++) {
            if (!h(i2).equals(h2Var.h(i2))) {
                return false;
            }
        }
        if (m != size) {
            return this.f15970h.equals(h2Var.f15970h);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return (V) this.f15969g.get(b2).getValue();
        }
        return this.f15970h.get(comparable);
    }

    public final Map.Entry<K, V> h(int i2) {
        return this.f15969g.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m = m();
        int i2 = 0;
        for (int i3 = 0; i3 < m; i3++) {
            i2 += this.f15969g.get(i3).hashCode();
        }
        return this.f15970h.size() > 0 ? i2 + this.f15970h.hashCode() : i2;
    }

    public void l() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f15971i) {
            return;
        }
        if (this.f15970h.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f15970h);
        }
        this.f15970h = unmodifiableMap;
        if (this.f15973k.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f15973k);
        }
        this.f15973k = unmodifiableMap2;
        this.f15971i = true;
    }

    public final int m() {
        return this.f15969g.size();
    }

    public final Iterable<Map.Entry<K, V>> n() {
        if (this.f15970h.isEmpty()) {
            return l2.a();
        }
        return this.f15970h.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> p() {
        if (this.l == null) {
            this.l = new k2(this, null);
        }
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return (V) i(b2);
        }
        if (this.f15970h.isEmpty()) {
            return null;
        }
        return this.f15970h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f15969g.size() + this.f15970h.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ h2(int i2, i2 i2Var) {
        this(i2);
    }
}
