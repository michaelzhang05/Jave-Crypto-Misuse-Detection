package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    b f7242a;

    /* renamed from: b, reason: collision with root package name */
    c f7243b;

    /* renamed from: c, reason: collision with root package name */
    e f7244c;

    /* loaded from: classes.dex */
    final class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final int f7245a;

        /* renamed from: b, reason: collision with root package name */
        int f7246b;

        /* renamed from: c, reason: collision with root package name */
        int f7247c;

        /* renamed from: d, reason: collision with root package name */
        boolean f7248d = false;

        a(int i6) {
            this.f7245a = i6;
            this.f7246b = f.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7247c < this.f7246b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object b6 = f.this.b(this.f7247c, this.f7245a);
            this.f7247c++;
            this.f7248d = true;
            return b6;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f7248d) {
                throw new IllegalStateException();
            }
            int i6 = this.f7247c - 1;
            this.f7247c = i6;
            this.f7246b--;
            this.f7248d = false;
            f.this.h(i6);
        }
    }

    /* loaded from: classes.dex */
    final class b implements Set {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int d6 = f.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d6 != f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e6 = f.this.e(entry.getKey());
            if (e6 < 0) {
                return false;
            }
            return l.c.c(f.this.b(e6, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i6 = 0;
            for (int d6 = f.this.d() - 1; d6 >= 0; d6--) {
                Object b6 = f.this.b(d6, 0);
                Object b7 = f.this.b(d6, 1);
                i6 += (b6 == null ? 0 : b6.hashCode()) ^ (b7 == null ? 0 : b7.hashCode());
            }
            return i6;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return f.j(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i6 = 0;
            for (int d6 = f.this.d() - 1; d6 >= 0; d6--) {
                Object b6 = f.this.b(d6, 0);
                i6 += b6 == null ? 0 : b6.hashCode();
            }
            return i6;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e6 = f.this.e(obj);
            if (e6 < 0) {
                return false;
            }
            f.this.h(e6);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return f.o(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return f.p(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return f.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 0);
        }
    }

    /* loaded from: classes.dex */
    final class d implements Iterator, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        int f7252a;

        /* renamed from: c, reason: collision with root package name */
        boolean f7254c = false;

        /* renamed from: b, reason: collision with root package name */
        int f7253b = -1;

        d() {
            this.f7252a = f.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f7253b++;
            this.f7254c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f7254c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return l.c.c(entry.getKey(), f.this.b(this.f7253b, 0)) && l.c.c(entry.getValue(), f.this.b(this.f7253b, 1));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f7254c) {
                return f.this.b(this.f7253b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f7254c) {
                return f.this.b(this.f7253b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7253b < this.f7252a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f7254c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object b6 = f.this.b(this.f7253b, 0);
            Object b7 = f.this.b(this.f7253b, 1);
            return (b6 == null ? 0 : b6.hashCode()) ^ (b7 != null ? b7.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f7254c) {
                throw new IllegalStateException();
            }
            f.this.h(this.f7253b);
            this.f7253b--;
            this.f7252a--;
            this.f7254c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f7254c) {
                return f.this.i(this.f7253b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f6 = f.this.f(obj);
            if (f6 < 0) {
                return false;
            }
            f.this.h(f6);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int d6 = f.this.d();
            int i6 = 0;
            boolean z5 = false;
            while (i6 < d6) {
                if (collection.contains(f.this.b(i6, 1))) {
                    f.this.h(i6);
                    i6--;
                    d6--;
                    z5 = true;
                }
                i6++;
            }
            return z5;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int d6 = f.this.d();
            int i6 = 0;
            boolean z5 = false;
            while (i6 < d6) {
                if (!collection.contains(f.this.b(i6, 1))) {
                    f.this.h(i6);
                    i6--;
                    d6--;
                    z5 = true;
                }
                i6++;
            }
            return z5;
        }

        @Override // java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return f.this.q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 1);
        }
    }

    public static boolean j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i6, int i7);

    protected abstract Map c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(Object obj, Object obj2);

    protected abstract void h(int i6);

    protected abstract Object i(int i6, Object obj);

    public Set l() {
        if (this.f7242a == null) {
            this.f7242a = new b();
        }
        return this.f7242a;
    }

    public Set m() {
        if (this.f7243b == null) {
            this.f7243b = new c();
        }
        return this.f7243b;
    }

    public Collection n() {
        if (this.f7244c == null) {
            this.f7244c = new e();
        }
        return this.f7244c;
    }

    public Object[] q(int i6) {
        int d6 = d();
        Object[] objArr = new Object[d6];
        for (int i7 = 0; i7 < d6; i7++) {
            objArr[i7] = b(i7, i6);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i6) {
        int d6 = d();
        if (objArr.length < d6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d6);
        }
        for (int i7 = 0; i7 < d6; i7++) {
            objArr[i7] = b(i7, i6);
        }
        if (objArr.length > d6) {
            objArr[d6] = null;
        }
        return objArr;
    }
}
