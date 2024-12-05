package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class Z5 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f16536a;

    /* renamed from: b, reason: collision with root package name */
    private int f16537b;

    /* renamed from: c, reason: collision with root package name */
    private Map f16538c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16539d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C2172k6 f16540e;

    /* renamed from: f, reason: collision with root package name */
    private Map f16541f;

    private final int c(Comparable comparable) {
        int i8;
        int i9 = this.f16537b;
        int i10 = i9 - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((C2122f6) this.f16536a[i10]).getKey());
            if (compareTo > 0) {
                i8 = i9 + 1;
                return -i8;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((C2122f6) this.f16536a[i12]).getKey());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        i8 = i11 + 1;
        return -i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(int i8) {
        r();
        Object value = ((C2122f6) this.f16536a[i8]).getValue();
        Object[] objArr = this.f16536a;
        System.arraycopy(objArr, i8 + 1, objArr, i8, (this.f16537b - i8) - 1);
        this.f16537b--;
        if (!this.f16538c.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f16536a[this.f16537b] = new C2122f6(this, (Map.Entry) it.next());
            this.f16537b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap q() {
        r();
        if (this.f16538c.isEmpty() && !(this.f16538c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16538c = treeMap;
            this.f16541f = treeMap.descendingMap();
        }
        return (SortedMap) this.f16538c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        if (!this.f16539d) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        return this.f16537b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        r();
        if (this.f16537b != 0) {
            this.f16536a = null;
            this.f16537b = 0;
        }
        if (!this.f16538c.isEmpty()) {
            this.f16538c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (c(comparable) < 0 && !this.f16538c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f16540e == null) {
            this.f16540e = new C2172k6(this);
        }
        return this.f16540e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z5)) {
            return super.equals(obj);
        }
        Z5 z52 = (Z5) obj;
        int size = size();
        if (size != z52.size()) {
            return false;
        }
        int i8 = this.f16537b;
        if (i8 != z52.f16537b) {
            return entrySet().equals(z52.entrySet());
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!g(i9).equals(z52.g(i9))) {
                return false;
            }
        }
        if (i8 == size) {
            return true;
        }
        return this.f16538c.equals(z52.f16538c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        r();
        int c8 = c(comparable);
        if (c8 >= 0) {
            return ((C2122f6) this.f16536a[c8]).setValue(obj);
        }
        r();
        if (this.f16536a == null) {
            this.f16536a = new Object[16];
        }
        int i8 = -(c8 + 1);
        if (i8 >= 16) {
            return q().put(comparable, obj);
        }
        int i9 = this.f16537b;
        if (i9 == 16) {
            C2122f6 c2122f6 = (C2122f6) this.f16536a[15];
            this.f16537b = i9 - 1;
            q().put((Comparable) c2122f6.getKey(), c2122f6.getValue());
        }
        Object[] objArr = this.f16536a;
        System.arraycopy(objArr, i8, objArr, i8 + 1, (objArr.length - i8) - 1);
        this.f16536a[i8] = new C2122f6(this, comparable, obj);
        this.f16537b++;
        return null;
    }

    public final Map.Entry g(int i8) {
        if (i8 < this.f16537b) {
            return (C2122f6) this.f16536a[i8];
        }
        throw new ArrayIndexOutOfBoundsException(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int c8 = c(comparable);
        if (c8 >= 0) {
            return ((C2122f6) this.f16536a[c8]).getValue();
        }
        return this.f16538c.get(comparable);
    }

    public final Iterable h() {
        if (this.f16538c.isEmpty()) {
            return Collections.emptySet();
        }
        return this.f16538c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i8 = this.f16537b;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += this.f16536a[i10].hashCode();
        }
        if (this.f16538c.size() > 0) {
            return i9 + this.f16538c.hashCode();
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set l() {
        return new C2102d6(this);
    }

    public void m() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f16539d) {
            if (this.f16538c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(this.f16538c);
            }
            this.f16538c = unmodifiableMap;
            if (this.f16541f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(this.f16541f);
            }
            this.f16541f = unmodifiableMap2;
            this.f16539d = true;
        }
    }

    public final boolean o() {
        return this.f16539d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int c8 = c(comparable);
        if (c8 >= 0) {
            return i(c8);
        }
        if (this.f16538c.isEmpty()) {
            return null;
        }
        return this.f16538c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16537b + this.f16538c.size();
    }

    private Z5() {
        this.f16538c = Collections.emptyMap();
        this.f16541f = Collections.emptyMap();
    }
}
