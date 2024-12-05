package c.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f, reason: collision with root package name */
    c<K, V> f2335f;

    /* renamed from: g, reason: collision with root package name */
    private c<K, V> f2336g;

    /* renamed from: h, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f2337h = new WeakHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private int f2338i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // c.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2342i;
        }

        @Override // c.b.a.b.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f2341h;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: c.b.a.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0051b<K, V> extends e<K, V> {
        C0051b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // c.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2341h;
        }

        @Override // c.b.a.b.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f2342i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f, reason: collision with root package name */
        final K f2339f;

        /* renamed from: g, reason: collision with root package name */
        final V f2340g;

        /* renamed from: h, reason: collision with root package name */
        c<K, V> f2341h;

        /* renamed from: i, reason: collision with root package name */
        c<K, V> f2342i;

        c(K k2, V v) {
            this.f2339f = k2;
            this.f2340g = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2339f.equals(cVar.f2339f) && this.f2340g.equals(cVar.f2340g);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2339f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2340g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f2339f.hashCode() ^ this.f2340g.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2339f + "=" + this.f2340g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: f, reason: collision with root package name */
        private c<K, V> f2343f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2344g = true;

        d() {
        }

        @Override // c.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f2343f;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2342i;
                this.f2343f = cVar3;
                this.f2344g = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f2344g) {
                this.f2344g = false;
                this.f2343f = b.this.f2335f;
            } else {
                c<K, V> cVar = this.f2343f;
                this.f2343f = cVar != null ? cVar.f2341h : null;
            }
            return this.f2343f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2344g) {
                return b.this.f2335f != null;
            }
            c<K, V> cVar = this.f2343f;
            return (cVar == null || cVar.f2341h == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: f, reason: collision with root package name */
        c<K, V> f2346f;

        /* renamed from: g, reason: collision with root package name */
        c<K, V> f2347g;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2346f = cVar2;
            this.f2347g = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f2347g;
            c<K, V> cVar2 = this.f2346f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // c.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f2346f == cVar && cVar == this.f2347g) {
                this.f2347g = null;
                this.f2346f = null;
            }
            c<K, V> cVar2 = this.f2346f;
            if (cVar2 == cVar) {
                this.f2346f = c(cVar2);
            }
            if (this.f2347g == cVar) {
                this.f2347g = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f2347g;
            this.f2347g = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2347g != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public V D(K k2) {
        c<K, V> f2 = f(k2);
        if (f2 == null) {
            return null;
        }
        this.f2338i--;
        if (!this.f2337h.isEmpty()) {
            Iterator<f<K, V>> it = this.f2337h.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(f2);
            }
        }
        c<K, V> cVar = f2.f2342i;
        if (cVar != null) {
            cVar.f2341h = f2.f2341h;
        } else {
            this.f2335f = f2.f2341h;
        }
        c<K, V> cVar2 = f2.f2341h;
        if (cVar2 != null) {
            cVar2.f2342i = cVar;
        } else {
            this.f2336g = cVar;
        }
        f2.f2341h = null;
        f2.f2342i = null;
        return f2.f2340g;
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0051b c0051b = new C0051b(this.f2336g, this.f2335f);
        this.f2337h.put(c0051b, Boolean.FALSE);
        return c0051b;
    }

    public Map.Entry<K, V> b() {
        return this.f2335f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    protected c<K, V> f(K k2) {
        c<K, V> cVar = this.f2335f;
        while (cVar != null && !cVar.f2339f.equals(k2)) {
            cVar = cVar.f2341h;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f2335f, this.f2336g);
        this.f2337h.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public b<K, V>.d o() {
        b<K, V>.d dVar = new d();
        this.f2337h.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int size() {
        return this.f2338i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Map.Entry<K, V> w() {
        return this.f2336g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c<K, V> x(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f2338i++;
        c<K, V> cVar2 = this.f2336g;
        if (cVar2 == null) {
            this.f2335f = cVar;
            this.f2336g = cVar;
            return cVar;
        }
        cVar2.f2341h = cVar;
        cVar.f2342i = cVar2;
        this.f2336g = cVar;
        return cVar;
    }

    public V z(K k2, V v) {
        c<K, V> f2 = f(k2);
        if (f2 != null) {
            return f2.f2340g;
        }
        x(k2, v);
        return null;
    }
}
