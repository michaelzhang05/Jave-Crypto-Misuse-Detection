package Q5;

import P5.AbstractC1362c;
import P5.AbstractC1365f;
import P5.AbstractC1371l;
import P5.AbstractC1378t;
import b6.InterfaceC1985a;
import b6.InterfaceC1986b;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class b extends AbstractC1365f implements List, RandomAccess, Serializable, InterfaceC1986b {

    /* renamed from: g, reason: collision with root package name */
    private static final a f9436g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final b f9437h;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f9438a;

    /* renamed from: b, reason: collision with root package name */
    private int f9439b;

    /* renamed from: c, reason: collision with root package name */
    private int f9440c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9441d;

    /* renamed from: e, reason: collision with root package name */
    private final b f9442e;

    /* renamed from: f, reason: collision with root package name */
    private final b f9443f;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q5.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0190b implements ListIterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final b f9444a;

        /* renamed from: b, reason: collision with root package name */
        private int f9445b;

        /* renamed from: c, reason: collision with root package name */
        private int f9446c;

        /* renamed from: d, reason: collision with root package name */
        private int f9447d;

        public C0190b(b list, int i8) {
            AbstractC3255y.i(list, "list");
            this.f9444a = list;
            this.f9445b = i8;
            this.f9446c = -1;
            this.f9447d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f9444a).modCount == this.f9447d) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f9444a;
            int i8 = this.f9445b;
            this.f9445b = i8 + 1;
            bVar.add(i8, obj);
            this.f9446c = -1;
            this.f9447d = ((AbstractList) this.f9444a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f9445b < this.f9444a.f9440c) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f9445b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f9445b < this.f9444a.f9440c) {
                int i8 = this.f9445b;
                this.f9445b = i8 + 1;
                this.f9446c = i8;
                return this.f9444a.f9438a[this.f9444a.f9439b + this.f9446c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f9445b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i8 = this.f9445b;
            if (i8 > 0) {
                int i9 = i8 - 1;
                this.f9445b = i9;
                this.f9446c = i9;
                return this.f9444a.f9438a[this.f9444a.f9439b + this.f9446c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f9445b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i8 = this.f9446c;
            if (i8 != -1) {
                this.f9444a.remove(i8);
                this.f9445b = this.f9446c;
                this.f9446c = -1;
                this.f9447d = ((AbstractList) this.f9444a).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i8 = this.f9446c;
            if (i8 != -1) {
                this.f9444a.set(i8, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        b bVar = new b(0);
        bVar.f9441d = true;
        f9437h = bVar;
    }

    private b(Object[] objArr, int i8, int i9, boolean z8, b bVar, b bVar2) {
        this.f9438a = objArr;
        this.f9439b = i8;
        this.f9440c = i9;
        this.f9441d = z8;
        this.f9442e = bVar;
        this.f9443f = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    private final Object A(int i8) {
        z();
        b bVar = this.f9442e;
        if (bVar != null) {
            this.f9440c--;
            return bVar.A(i8);
        }
        Object[] objArr = this.f9438a;
        Object obj = objArr[i8];
        AbstractC1371l.i(objArr, objArr, i8, i8 + 1, this.f9439b + this.f9440c);
        c.f(this.f9438a, (this.f9439b + this.f9440c) - 1);
        this.f9440c--;
        return obj;
    }

    private final void B(int i8, int i9) {
        if (i9 > 0) {
            z();
        }
        b bVar = this.f9442e;
        if (bVar != null) {
            bVar.B(i8, i9);
        } else {
            Object[] objArr = this.f9438a;
            AbstractC1371l.i(objArr, objArr, i8, i8 + i9, this.f9440c);
            Object[] objArr2 = this.f9438a;
            int i10 = this.f9440c;
            c.g(objArr2, i10 - i9, i10);
        }
        this.f9440c -= i9;
    }

    private final int C(int i8, int i9, Collection collection, boolean z8) {
        int i10;
        b bVar = this.f9442e;
        if (bVar != null) {
            i10 = bVar.C(i8, i9, collection, z8);
        } else {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                int i13 = i8 + i11;
                if (collection.contains(this.f9438a[i13]) == z8) {
                    Object[] objArr = this.f9438a;
                    i11++;
                    objArr[i12 + i8] = objArr[i13];
                    i12++;
                } else {
                    i11++;
                }
            }
            int i14 = i9 - i12;
            Object[] objArr2 = this.f9438a;
            AbstractC1371l.i(objArr2, objArr2, i8 + i12, i9 + i8, this.f9440c);
            Object[] objArr3 = this.f9438a;
            int i15 = this.f9440c;
            c.g(objArr3, i15 - i14, i15);
            i10 = i14;
        }
        if (i10 > 0) {
            z();
        }
        this.f9440c -= i10;
        return i10;
    }

    private final void k(int i8, Collection collection, int i9) {
        z();
        b bVar = this.f9442e;
        if (bVar != null) {
            bVar.k(i8, collection, i9);
            this.f9438a = this.f9442e.f9438a;
            this.f9440c += i9;
        } else {
            v(i8, i9);
            Iterator it = collection.iterator();
            for (int i10 = 0; i10 < i9; i10++) {
                this.f9438a[i8 + i10] = it.next();
            }
        }
    }

    private final void m(int i8, Object obj) {
        z();
        b bVar = this.f9442e;
        if (bVar != null) {
            bVar.m(i8, obj);
            this.f9438a = this.f9442e.f9438a;
            this.f9440c++;
        } else {
            v(i8, 1);
            this.f9438a[i8] = obj;
        }
    }

    private final void o() {
        b bVar = this.f9443f;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void q() {
        if (!y()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean r(List list) {
        boolean h8;
        h8 = c.h(this.f9438a, this.f9439b, this.f9440c, list);
        return h8;
    }

    private final void t(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f9438a;
            if (i8 > objArr.length) {
                this.f9438a = c.e(this.f9438a, AbstractC1362c.Companion.e(objArr.length, i8));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void u(int i8) {
        t(this.f9440c + i8);
    }

    private final void v(int i8, int i9) {
        u(i9);
        Object[] objArr = this.f9438a;
        AbstractC1371l.i(objArr, objArr, i8 + i9, i8, this.f9439b + this.f9440c);
        this.f9440c += i9;
    }

    private final boolean y() {
        b bVar;
        if (!this.f9441d && ((bVar = this.f9443f) == null || !bVar.f9441d)) {
            return false;
        }
        return true;
    }

    private final void z() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        q();
        o();
        m(this.f9439b + this.f9440c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        q();
        o();
        int size = elements.size();
        k(this.f9439b + this.f9440c, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        q();
        o();
        B(this.f9439b, this.f9440c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        o();
        if (obj != this && (!(obj instanceof List) || !r((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        o();
        AbstractC1362c.Companion.b(i8, this.f9440c);
        return this.f9438a[this.f9439b + i8];
    }

    @Override // P5.AbstractC1365f
    public int getSize() {
        o();
        return this.f9440c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8;
        o();
        i8 = c.i(this.f9438a, this.f9439b, this.f9440c);
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        o();
        for (int i8 = 0; i8 < this.f9440c; i8++) {
            if (AbstractC3255y.d(this.f9438a[this.f9439b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        o();
        if (this.f9440c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        o();
        for (int i8 = this.f9440c - 1; i8 >= 0; i8--) {
            if (AbstractC3255y.d(this.f9438a[this.f9439b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final List n() {
        if (this.f9442e == null) {
            q();
            this.f9441d = true;
            if (this.f9440c > 0) {
                return this;
            }
            return f9437h;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        q();
        o();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        q();
        o();
        if (C(this.f9439b, this.f9440c, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // P5.AbstractC1365f
    public Object removeAt(int i8) {
        q();
        o();
        AbstractC1362c.Companion.b(i8, this.f9440c);
        return A(this.f9439b + i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        q();
        o();
        if (C(this.f9439b, this.f9440c, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        q();
        o();
        AbstractC1362c.Companion.b(i8, this.f9440c);
        Object[] objArr = this.f9438a;
        int i9 = this.f9439b;
        Object obj2 = objArr[i9 + i8];
        objArr[i9 + i8] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i8, int i9) {
        b bVar;
        AbstractC1362c.Companion.d(i8, i9, this.f9440c);
        Object[] objArr = this.f9438a;
        int i10 = this.f9439b + i8;
        int i11 = i9 - i8;
        boolean z8 = this.f9441d;
        b bVar2 = this.f9443f;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new b(objArr, i10, i11, z8, this, bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] destination) {
        AbstractC3255y.i(destination, "destination");
        o();
        int length = destination.length;
        int i8 = this.f9440c;
        if (length < i8) {
            Object[] objArr = this.f9438a;
            int i9 = this.f9439b;
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i9, i8 + i9, destination.getClass());
            AbstractC3255y.h(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        Object[] objArr2 = this.f9438a;
        int i10 = this.f9439b;
        AbstractC1371l.i(objArr2, destination, 0, i10, i8 + i10);
        return AbstractC1378t.f(this.f9440c, destination);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j8;
        o();
        j8 = c.j(this.f9438a, this.f9439b, this.f9440c, this);
        return j8;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i8) {
        o();
        AbstractC1362c.Companion.c(i8, this.f9440c);
        return new C0190b(this, i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        q();
        o();
        AbstractC1362c.Companion.c(i8, this.f9440c);
        m(this.f9439b + i8, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection elements) {
        AbstractC3255y.i(elements, "elements");
        q();
        o();
        AbstractC1362c.Companion.c(i8, this.f9440c);
        int size = elements.size();
        k(this.f9439b + i8, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        o();
        Object[] objArr = this.f9438a;
        int i8 = this.f9439b;
        return AbstractC1371l.p(objArr, i8, this.f9440c + i8);
    }

    public b() {
        this(10);
    }

    public b(int i8) {
        this(c.d(i8), 0, 0, false, null, null);
    }
}
