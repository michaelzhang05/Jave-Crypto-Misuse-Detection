package x0;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L extends AbstractC4184t {

    /* renamed from: f, reason: collision with root package name */
    static final L f40590f = new L(AbstractC4180o.t(), AbstractC4163G.c());

    /* renamed from: e, reason: collision with root package name */
    final transient AbstractC4180o f40591e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(AbstractC4180o abstractC4180o, Comparator comparator) {
        super(comparator);
        this.f40591e = abstractC4180o;
    }

    private int Z(Object obj) {
        return Collections.binarySearch(this.f40591e, obj, a0());
    }

    @Override // x0.AbstractC4184t
    AbstractC4184t D() {
        Comparator reverseOrder = Collections.reverseOrder(this.f40664c);
        if (isEmpty()) {
            return AbstractC4184t.F(reverseOrder);
        }
        return new L(this.f40591e.z(), reverseOrder);
    }

    @Override // x0.AbstractC4184t
    AbstractC4184t K(Object obj, boolean z8) {
        return V(0, W(obj, z8));
    }

    @Override // x0.AbstractC4184t
    AbstractC4184t N(Object obj, boolean z8, Object obj2, boolean z9) {
        return Q(obj, z8).K(obj2, z9);
    }

    @Override // x0.AbstractC4184t
    AbstractC4184t Q(Object obj, boolean z8) {
        return V(Y(obj, z8), size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public S descendingIterator() {
        return this.f40591e.z().iterator();
    }

    L V(int i8, int i9) {
        if (i8 == 0 && i9 == size()) {
            return this;
        }
        if (i8 < i9) {
            return new L(this.f40591e.subList(i8, i9), this.f40664c);
        }
        return AbstractC4184t.F(this.f40664c);
    }

    int W(Object obj, boolean z8) {
        int binarySearch = Collections.binarySearch(this.f40591e, w0.h.i(obj), comparator());
        if (binarySearch >= 0) {
            if (z8) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return this.f40591e.iterator();
    }

    int Y(Object obj, boolean z8) {
        int binarySearch = Collections.binarySearch(this.f40591e, w0.h.i(obj), comparator());
        if (binarySearch >= 0) {
            if (!z8) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    Comparator a0() {
        return this.f40664c;
    }

    @Override // x0.AbstractC4179n
    int c(Object[] objArr, int i8) {
        return this.f40591e.c(objArr, i8);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int Y7 = Y(obj, true);
        if (Y7 == size()) {
            return null;
        }
        return this.f40591e.get(Y7);
    }

    @Override // x0.AbstractC4179n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (Z(obj) < 0) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC4159C) {
            collection = ((InterfaceC4159C) collection).i();
        }
        if (P.b(comparator(), collection) && collection.size() > 1) {
            S it = iterator();
            Iterator it2 = collection.iterator();
            if (!it.hasNext()) {
                return false;
            }
            Object next = it2.next();
            Object next2 = it.next();
            while (true) {
                try {
                    int R8 = R(next2, next);
                    if (R8 < 0) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        next2 = it.next();
                    } else if (R8 == 0) {
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else if (R8 > 0) {
                        break;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public Object[] d() {
        return this.f40591e.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public int e() {
        return this.f40591e.e();
    }

    @Override // x0.r, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (P.b(this.f40664c, set)) {
            Iterator it = set.iterator();
            try {
                S it2 = iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Object next2 = it.next();
                    if (next2 == null || R(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public int f() {
        return this.f40591e.f();
    }

    @Override // java.util.SortedSet
    public Object first() {
        if (!isEmpty()) {
            return this.f40591e.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int W7 = W(obj, true) - 1;
        if (W7 == -1) {
            return null;
        }
        return this.f40591e.get(W7);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int Y7 = Y(obj, false);
        if (Y7 == size()) {
            return null;
        }
        return this.f40591e.get(Y7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public boolean j() {
        return this.f40591e.j();
    }

    @Override // java.util.SortedSet
    public Object last() {
        if (!isEmpty()) {
            return this.f40591e.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int W7 = W(obj, false) - 1;
        if (W7 == -1) {
            return null;
        }
        return this.f40591e.get(W7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f40591e.size();
    }
}
