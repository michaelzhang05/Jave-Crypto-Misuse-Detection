package com.google.gson.t;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes2.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator<Comparable> f16895f = new a();

    /* renamed from: g, reason: collision with root package name */
    Comparator<? super K> f16896g;

    /* renamed from: h, reason: collision with root package name */
    e<K, V> f16897h;

    /* renamed from: i, reason: collision with root package name */
    int f16898i;

    /* renamed from: j, reason: collision with root package name */
    int f16899j;

    /* renamed from: k, reason: collision with root package name */
    final e<K, V> f16900k;
    private h<K, V>.b l;
    private h<K, V>.c m;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    static class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes2.dex */
        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c2;
            if (!(obj instanceof Map.Entry) || (c2 = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(c2, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f16898i;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes2.dex */
        class a extends h<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f16914k;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f16898i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: f, reason: collision with root package name */
        e<K, V> f16905f;

        /* renamed from: g, reason: collision with root package name */
        e<K, V> f16906g = null;

        /* renamed from: h, reason: collision with root package name */
        int f16907h;

        d() {
            this.f16905f = h.this.f16900k.f16912i;
            this.f16907h = h.this.f16899j;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f16905f;
            h hVar = h.this;
            if (eVar != hVar.f16900k) {
                if (hVar.f16899j == this.f16907h) {
                    this.f16905f = eVar.f16912i;
                    this.f16906g = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16905f != h.this.f16900k;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f16906g;
            if (eVar != null) {
                h.this.f(eVar, true);
                this.f16906g = null;
                this.f16907h = h.this.f16899j;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h() {
        this(f16895f);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f16910g;
            e<K, V> eVar3 = eVar.f16911h;
            int i2 = eVar2 != null ? eVar2.m : 0;
            int i3 = eVar3 != null ? eVar3.m : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.f16910g;
                e<K, V> eVar5 = eVar3.f16911h;
                int i5 = (eVar4 != null ? eVar4.m : 0) - (eVar5 != null ? eVar5.m : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    j(eVar3);
                    i(eVar);
                } else {
                    i(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.f16910g;
                e<K, V> eVar7 = eVar2.f16911h;
                int i6 = (eVar6 != null ? eVar6.m : 0) - (eVar7 != null ? eVar7.m : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    i(eVar2);
                    j(eVar);
                } else {
                    j(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.m = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.m = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f16909f;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f16909f;
        eVar.f16909f = null;
        if (eVar2 != null) {
            eVar2.f16909f = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f16910g == eVar) {
                eVar3.f16910g = eVar2;
                return;
            } else {
                eVar3.f16911h = eVar2;
                return;
            }
        }
        this.f16897h = eVar2;
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f16910g;
        e<K, V> eVar3 = eVar.f16911h;
        e<K, V> eVar4 = eVar3.f16910g;
        e<K, V> eVar5 = eVar3.f16911h;
        eVar.f16911h = eVar4;
        if (eVar4 != null) {
            eVar4.f16909f = eVar;
        }
        h(eVar, eVar3);
        eVar3.f16910g = eVar;
        eVar.f16909f = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.m : 0, eVar4 != null ? eVar4.m : 0) + 1;
        eVar.m = max;
        eVar3.m = Math.max(max, eVar5 != null ? eVar5.m : 0) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f16910g;
        e<K, V> eVar3 = eVar.f16911h;
        e<K, V> eVar4 = eVar2.f16910g;
        e<K, V> eVar5 = eVar2.f16911h;
        eVar.f16910g = eVar5;
        if (eVar5 != null) {
            eVar5.f16909f = eVar;
        }
        h(eVar, eVar2);
        eVar2.f16911h = eVar;
        eVar.f16909f = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.m : 0, eVar5 != null ? eVar5.m : 0) + 1;
        eVar.m = max;
        eVar2.m = Math.max(max, eVar4 != null ? eVar4.m : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    e<K, V> b(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f16896g;
        e<K, V> eVar2 = this.f16897h;
        if (eVar2 != null) {
            Comparable comparable = comparator == f16895f ? (Comparable) k2 : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(eVar2.f16914k);
                } else {
                    i2 = comparator.compare(k2, eVar2.f16914k);
                }
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f16910g : eVar2.f16911h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f16900k;
        if (eVar2 == null) {
            if (comparator == f16895f && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f16913j);
            this.f16897h = eVar;
        } else {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f16913j);
            if (i2 < 0) {
                eVar2.f16910g = eVar;
            } else {
                eVar2.f16911h = eVar;
            }
            e(eVar2, true);
        }
        this.f16898i++;
        this.f16899j++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d2 = d(entry.getKey());
        if (d2 != null && a(d2.l, entry.getValue())) {
            return d2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f16897h = null;
        this.f16898i = 0;
        this.f16899j++;
        e<K, V> eVar = this.f16900k;
        eVar.f16913j = eVar;
        eVar.f16912i = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.l;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.l = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f16913j;
            eVar2.f16912i = eVar.f16912i;
            eVar.f16912i.f16913j = eVar2;
        }
        e<K, V> eVar3 = eVar.f16910g;
        e<K, V> eVar4 = eVar.f16911h;
        e<K, V> eVar5 = eVar.f16909f;
        int i3 = 0;
        if (eVar3 != null && eVar4 != null) {
            e<K, V> b2 = eVar3.m > eVar4.m ? eVar3.b() : eVar4.a();
            f(b2, false);
            e<K, V> eVar6 = eVar.f16910g;
            if (eVar6 != null) {
                i2 = eVar6.m;
                b2.f16910g = eVar6;
                eVar6.f16909f = b2;
                eVar.f16910g = null;
            } else {
                i2 = 0;
            }
            e<K, V> eVar7 = eVar.f16911h;
            if (eVar7 != null) {
                i3 = eVar7.m;
                b2.f16911h = eVar7;
                eVar7.f16909f = b2;
                eVar.f16911h = null;
            }
            b2.m = Math.max(i2, i3) + 1;
            h(eVar, b2);
            return;
        }
        if (eVar3 != null) {
            h(eVar, eVar3);
            eVar.f16910g = null;
        } else if (eVar4 != null) {
            h(eVar, eVar4);
            eVar.f16911h = null;
        } else {
            h(eVar, null);
        }
        e(eVar5, false);
        this.f16898i--;
        this.f16899j++;
    }

    e<K, V> g(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        return d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            return d2.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        h<K, V>.c cVar = this.m;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.m = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        if (k2 != null) {
            e<K, V> b2 = b(k2, true);
            V v2 = b2.l;
            b2.l = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g2 = g(obj);
        if (g2 != null) {
            return g2.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16898i;
    }

    public h(Comparator<? super K> comparator) {
        this.f16898i = 0;
        this.f16899j = 0;
        this.f16900k = new e<>();
        this.f16896g = comparator == null ? f16895f : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: f, reason: collision with root package name */
        e<K, V> f16909f;

        /* renamed from: g, reason: collision with root package name */
        e<K, V> f16910g;

        /* renamed from: h, reason: collision with root package name */
        e<K, V> f16911h;

        /* renamed from: i, reason: collision with root package name */
        e<K, V> f16912i;

        /* renamed from: j, reason: collision with root package name */
        e<K, V> f16913j;

        /* renamed from: k, reason: collision with root package name */
        final K f16914k;
        V l;
        int m;

        e() {
            this.f16914k = null;
            this.f16913j = this;
            this.f16912i = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f16910g; eVar2 != null; eVar2 = eVar2.f16910g) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f16911h; eVar2 != null; eVar2 = eVar2.f16911h) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f16914k;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.l;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f16914k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.l;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f16914k;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.l;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.l;
            this.l = v;
            return v2;
        }

        public String toString() {
            return this.f16914k + "=" + this.l;
        }

        e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f16909f = eVar;
            this.f16914k = k2;
            this.m = 1;
            this.f16912i = eVar2;
            this.f16913j = eVar3;
            eVar3.f16912i = this;
            eVar2.f16913j = this;
        }
    }
}
