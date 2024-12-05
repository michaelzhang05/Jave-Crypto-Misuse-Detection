package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public final class g extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f18797i = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Comparator f18798a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18799b;

    /* renamed from: c, reason: collision with root package name */
    e f18800c;

    /* renamed from: d, reason: collision with root package name */
    int f18801d;

    /* renamed from: e, reason: collision with root package name */
    int f18802e;

    /* renamed from: f, reason: collision with root package name */
    final e f18803f;

    /* renamed from: g, reason: collision with root package name */
    private b f18804g;

    /* renamed from: h, reason: collision with root package name */
    private c f18805h;

    /* loaded from: classes4.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes4.dex */
    class b extends AbstractSet {

        /* loaded from: classes4.dex */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e c8;
            if (!(obj instanceof Map.Entry) || (c8 = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.g(c8, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f18801d;
        }
    }

    /* loaded from: classes4.dex */
    final class c extends AbstractSet {

        /* loaded from: classes4.dex */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f18819f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (g.this.h(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f18801d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public abstract class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        e f18810a;

        /* renamed from: b, reason: collision with root package name */
        e f18811b = null;

        /* renamed from: c, reason: collision with root package name */
        int f18812c;

        d() {
            this.f18810a = g.this.f18803f.f18817d;
            this.f18812c = g.this.f18802e;
        }

        final e a() {
            e eVar = this.f18810a;
            g gVar = g.this;
            if (eVar != gVar.f18803f) {
                if (gVar.f18802e == this.f18812c) {
                    this.f18810a = eVar.f18817d;
                    this.f18811b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f18810a != g.this.f18803f) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f18811b;
            if (eVar != null) {
                g.this.g(eVar, true);
                this.f18811b = null;
                this.f18812c = g.this.f18802e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public g() {
        this(f18797i, true);
    }

    private boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void f(e eVar, boolean z8) {
        int i8;
        int i9;
        int i10;
        int i11;
        while (eVar != null) {
            e eVar2 = eVar.f18815b;
            e eVar3 = eVar.f18816c;
            int i12 = 0;
            if (eVar2 != null) {
                i8 = eVar2.f18822i;
            } else {
                i8 = 0;
            }
            if (eVar3 != null) {
                i9 = eVar3.f18822i;
            } else {
                i9 = 0;
            }
            int i13 = i8 - i9;
            if (i13 == -2) {
                e eVar4 = eVar3.f18815b;
                e eVar5 = eVar3.f18816c;
                if (eVar5 != null) {
                    i11 = eVar5.f18822i;
                } else {
                    i11 = 0;
                }
                if (eVar4 != null) {
                    i12 = eVar4.f18822i;
                }
                int i14 = i12 - i11;
                if (i14 != -1 && (i14 != 0 || z8)) {
                    k(eVar3);
                    j(eVar);
                } else {
                    j(eVar);
                }
                if (z8) {
                    return;
                }
            } else if (i13 == 2) {
                e eVar6 = eVar2.f18815b;
                e eVar7 = eVar2.f18816c;
                if (eVar7 != null) {
                    i10 = eVar7.f18822i;
                } else {
                    i10 = 0;
                }
                if (eVar6 != null) {
                    i12 = eVar6.f18822i;
                }
                int i15 = i12 - i10;
                if (i15 != 1 && (i15 != 0 || z8)) {
                    j(eVar2);
                    k(eVar);
                } else {
                    k(eVar);
                }
                if (z8) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f18822i = i8 + 1;
                if (z8) {
                    return;
                }
            } else {
                eVar.f18822i = Math.max(i8, i9) + 1;
                if (!z8) {
                    return;
                }
            }
            eVar = eVar.f18814a;
        }
    }

    private void i(e eVar, e eVar2) {
        e eVar3 = eVar.f18814a;
        eVar.f18814a = null;
        if (eVar2 != null) {
            eVar2.f18814a = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f18815b == eVar) {
                eVar3.f18815b = eVar2;
                return;
            } else {
                eVar3.f18816c = eVar2;
                return;
            }
        }
        this.f18800c = eVar2;
    }

    private void j(e eVar) {
        int i8;
        int i9;
        e eVar2 = eVar.f18815b;
        e eVar3 = eVar.f18816c;
        e eVar4 = eVar3.f18815b;
        e eVar5 = eVar3.f18816c;
        eVar.f18816c = eVar4;
        if (eVar4 != null) {
            eVar4.f18814a = eVar;
        }
        i(eVar, eVar3);
        eVar3.f18815b = eVar;
        eVar.f18814a = eVar3;
        int i10 = 0;
        if (eVar2 != null) {
            i8 = eVar2.f18822i;
        } else {
            i8 = 0;
        }
        if (eVar4 != null) {
            i9 = eVar4.f18822i;
        } else {
            i9 = 0;
        }
        int max = Math.max(i8, i9) + 1;
        eVar.f18822i = max;
        if (eVar5 != null) {
            i10 = eVar5.f18822i;
        }
        eVar3.f18822i = Math.max(max, i10) + 1;
    }

    private void k(e eVar) {
        int i8;
        int i9;
        e eVar2 = eVar.f18815b;
        e eVar3 = eVar.f18816c;
        e eVar4 = eVar2.f18815b;
        e eVar5 = eVar2.f18816c;
        eVar.f18815b = eVar5;
        if (eVar5 != null) {
            eVar5.f18814a = eVar;
        }
        i(eVar, eVar2);
        eVar2.f18816c = eVar;
        eVar.f18814a = eVar2;
        int i10 = 0;
        if (eVar3 != null) {
            i8 = eVar3.f18822i;
        } else {
            i8 = 0;
        }
        if (eVar5 != null) {
            i9 = eVar5.f18822i;
        } else {
            i9 = 0;
        }
        int max = Math.max(i8, i9) + 1;
        eVar.f18822i = max;
        if (eVar4 != null) {
            i10 = eVar4.f18822i;
        }
        eVar2.f18822i = Math.max(max, i10) + 1;
    }

    e b(Object obj, boolean z8) {
        int i8;
        e eVar;
        Comparable comparable;
        e eVar2;
        Comparator comparator = this.f18798a;
        e eVar3 = this.f18800c;
        if (eVar3 != null) {
            if (comparator == f18797i) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i8 = comparable.compareTo(eVar3.f18819f);
                } else {
                    i8 = comparator.compare(obj, eVar3.f18819f);
                }
                if (i8 == 0) {
                    return eVar3;
                }
                if (i8 < 0) {
                    eVar2 = eVar3.f18815b;
                } else {
                    eVar2 = eVar3.f18816c;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i8 = 0;
        }
        if (!z8) {
            return null;
        }
        e eVar4 = this.f18803f;
        if (eVar3 == null) {
            if (comparator == f18797i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f18799b, eVar3, obj, eVar4, eVar4.f18818e);
            this.f18800c = eVar;
        } else {
            eVar = new e(this.f18799b, eVar3, obj, eVar4, eVar4.f18818e);
            if (i8 < 0) {
                eVar3.f18815b = eVar;
            } else {
                eVar3.f18816c = eVar;
            }
            f(eVar3, true);
        }
        this.f18801d++;
        this.f18802e++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e e8 = e(entry.getKey());
        if (e8 == null || !a(e8.f18821h, entry.getValue())) {
            return null;
        }
        return e8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f18800c = null;
        this.f18801d = 0;
        this.f18802e++;
        e eVar = this.f18803f;
        eVar.f18818e = eVar;
        eVar.f18817d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (e(obj) != null) {
            return true;
        }
        return false;
    }

    e e(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f18804g;
        if (bVar == null) {
            b bVar2 = new b();
            this.f18804g = bVar2;
            return bVar2;
        }
        return bVar;
    }

    void g(e eVar, boolean z8) {
        e a8;
        int i8;
        if (z8) {
            e eVar2 = eVar.f18818e;
            eVar2.f18817d = eVar.f18817d;
            eVar.f18817d.f18818e = eVar2;
        }
        e eVar3 = eVar.f18815b;
        e eVar4 = eVar.f18816c;
        e eVar5 = eVar.f18814a;
        int i9 = 0;
        if (eVar3 != null && eVar4 != null) {
            if (eVar3.f18822i > eVar4.f18822i) {
                a8 = eVar3.b();
            } else {
                a8 = eVar4.a();
            }
            g(a8, false);
            e eVar6 = eVar.f18815b;
            if (eVar6 != null) {
                i8 = eVar6.f18822i;
                a8.f18815b = eVar6;
                eVar6.f18814a = a8;
                eVar.f18815b = null;
            } else {
                i8 = 0;
            }
            e eVar7 = eVar.f18816c;
            if (eVar7 != null) {
                i9 = eVar7.f18822i;
                a8.f18816c = eVar7;
                eVar7.f18814a = a8;
                eVar.f18816c = null;
            }
            a8.f18822i = Math.max(i8, i9) + 1;
            i(eVar, a8);
            return;
        }
        if (eVar3 != null) {
            i(eVar, eVar3);
            eVar.f18815b = null;
        } else if (eVar4 != null) {
            i(eVar, eVar4);
            eVar.f18816c = null;
        } else {
            i(eVar, null);
        }
        f(eVar5, false);
        this.f18801d--;
        this.f18802e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e e8 = e(obj);
        if (e8 != null) {
            return e8.f18821h;
        }
        return null;
    }

    e h(Object obj) {
        e e8 = e(obj);
        if (e8 != null) {
            g(e8, true);
        }
        return e8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f18805h;
        if (cVar == null) {
            c cVar2 = new c();
            this.f18805h = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f18799b) {
                throw new NullPointerException("value == null");
            }
            e b8 = b(obj, true);
            Object obj3 = b8.f18821h;
            b8.f18821h = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e h8 = h(obj);
        if (h8 != null) {
            return h8.f18821h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f18801d;
    }

    public g(boolean z8) {
        this(f18797i, z8);
    }

    public g(Comparator comparator, boolean z8) {
        this.f18801d = 0;
        this.f18802e = 0;
        this.f18798a = comparator == null ? f18797i : comparator;
        this.f18799b = z8;
        this.f18803f = new e(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        e f18814a;

        /* renamed from: b, reason: collision with root package name */
        e f18815b;

        /* renamed from: c, reason: collision with root package name */
        e f18816c;

        /* renamed from: d, reason: collision with root package name */
        e f18817d;

        /* renamed from: e, reason: collision with root package name */
        e f18818e;

        /* renamed from: f, reason: collision with root package name */
        final Object f18819f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f18820g;

        /* renamed from: h, reason: collision with root package name */
        Object f18821h;

        /* renamed from: i, reason: collision with root package name */
        int f18822i;

        e(boolean z8) {
            this.f18819f = null;
            this.f18820g = z8;
            this.f18818e = this;
            this.f18817d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f18815b; eVar2 != null; eVar2 = eVar2.f18815b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f18816c; eVar2 != null; eVar2 = eVar2.f18816c) {
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
            Object obj2 = this.f18819f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f18821h;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f18819f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f18821h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object obj = this.f18819f;
            int i8 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            Object obj2 = this.f18821h;
            if (obj2 != null) {
                i8 = obj2.hashCode();
            }
            return hashCode ^ i8;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f18820g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f18821h;
            this.f18821h = obj;
            return obj2;
        }

        public String toString() {
            return this.f18819f + "=" + this.f18821h;
        }

        e(boolean z8, e eVar, Object obj, e eVar2, e eVar3) {
            this.f18814a = eVar;
            this.f18819f = obj;
            this.f18820g = z8;
            this.f18822i = 1;
            this.f18817d = eVar2;
            this.f18818e = eVar3;
            eVar3.f18817d = this;
            eVar2.f18818e = this;
        }
    }
}
