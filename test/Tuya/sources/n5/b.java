package N5;

import M5.AbstractC1230c;
import M5.AbstractC1233f;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class b extends AbstractC1233f implements List, RandomAccess, Serializable, Y5.b {

    /* renamed from: g, reason: collision with root package name */
    private static final a f7476g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final b f7477h;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f7478a;

    /* renamed from: b, reason: collision with root package name */
    private int f7479b;

    /* renamed from: c, reason: collision with root package name */
    private int f7480c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7481d;

    /* renamed from: e, reason: collision with root package name */
    private final b f7482e;

    /* renamed from: f, reason: collision with root package name */
    private final b f7483f;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N5.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0161b implements ListIterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f7484a;

        /* renamed from: b, reason: collision with root package name */
        private int f7485b;

        /* renamed from: c, reason: collision with root package name */
        private int f7486c;

        /* renamed from: d, reason: collision with root package name */
        private int f7487d;

        public C0161b(b list, int i8) {
            AbstractC3159y.i(list, "list");
            this.f7484a = list;
            this.f7485b = i8;
            this.f7486c = -1;
            this.f7487d = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.f7484a).modCount == this.f7487d) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            b bVar = this.f7484a;
            int i8 = this.f7485b;
            this.f7485b = i8 + 1;
            bVar.add(i8, obj);
            this.f7486c = -1;
            this.f7487d = ((AbstractList) this.f7484a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f7485b < this.f7484a.f7480c) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f7485b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (this.f7485b < this.f7484a.f7480c) {
                int i8 = this.f7485b;
                this.f7485b = i8 + 1;
                this.f7486c = i8;
                return this.f7484a.f7478a[this.f7484a.f7479b + this.f7486c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7485b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            b();
            int i8 = this.f7485b;
            if (i8 > 0) {
                int i9 = i8 - 1;
                this.f7485b = i9;
                this.f7486c = i9;
                return this.f7484a.f7478a[this.f7484a.f7479b + this.f7486c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7485b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i8 = this.f7486c;
            if (i8 != -1) {
                this.f7484a.remove(i8);
                this.f7485b = this.f7486c;
                this.f7486c = -1;
                this.f7487d = ((AbstractList) this.f7484a).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            b();
            int i8 = this.f7486c;
            if (i8 != -1) {
                this.f7484a.set(i8, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        b bVar = new b(0);
        bVar.f7481d = true;
        f7477h = bVar;
    }

    private b(Object[] objArr, int i8, int i9, boolean z8, b bVar, b bVar2) {
        this.f7478a = objArr;
        this.f7479b = i8;
        this.f7480c = i9;
        this.f7481d = z8;
        this.f7482e = bVar;
        this.f7483f = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    private final void A() {
        ((AbstractList) this).modCount++;
    }

    private final Object B(int i8) {
        A();
        b bVar = this.f7482e;
        if (bVar != null) {
            this.f7480c--;
            return bVar.B(i8);
        }
        Object[] objArr = this.f7478a;
        Object obj = objArr[i8];
        AbstractC1239l.i(objArr, objArr, i8, i8 + 1, this.f7479b + this.f7480c);
        c.f(this.f7478a, (this.f7479b + this.f7480c) - 1);
        this.f7480c--;
        return obj;
    }

    private final void C(int i8, int i9) {
        if (i9 > 0) {
            A();
        }
        b bVar = this.f7482e;
        if (bVar != null) {
            bVar.C(i8, i9);
        } else {
            Object[] objArr = this.f7478a;
            AbstractC1239l.i(objArr, objArr, i8, i8 + i9, this.f7480c);
            Object[] objArr2 = this.f7478a;
            int i10 = this.f7480c;
            c.g(objArr2, i10 - i9, i10);
        }
        this.f7480c -= i9;
    }

    private final int D(int i8, int i9, Collection collection, boolean z8) {
        int i10;
        b bVar = this.f7482e;
        if (bVar != null) {
            i10 = bVar.D(i8, i9, collection, z8);
        } else {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                int i13 = i8 + i11;
                if (collection.contains(this.f7478a[i13]) == z8) {
                    Object[] objArr = this.f7478a;
                    i11++;
                    objArr[i12 + i8] = objArr[i13];
                    i12++;
                } else {
                    i11++;
                }
            }
            int i14 = i9 - i12;
            Object[] objArr2 = this.f7478a;
            AbstractC1239l.i(objArr2, objArr2, i8 + i12, i9 + i8, this.f7480c);
            Object[] objArr3 = this.f7478a;
            int i15 = this.f7480c;
            c.g(objArr3, i15 - i14, i15);
            i10 = i14;
        }
        if (i10 > 0) {
            A();
        }
        this.f7480c -= i10;
        return i10;
    }

    private final void m(int i8, Collection collection, int i9) {
        A();
        b bVar = this.f7482e;
        if (bVar != null) {
            bVar.m(i8, collection, i9);
            this.f7478a = this.f7482e.f7478a;
            this.f7480c += i9;
        } else {
            x(i8, i9);
            Iterator it = collection.iterator();
            for (int i10 = 0; i10 < i9; i10++) {
                this.f7478a[i8 + i10] = it.next();
            }
        }
    }

    private final void p(int i8, Object obj) {
        A();
        b bVar = this.f7482e;
        if (bVar != null) {
            bVar.p(i8, obj);
            this.f7478a = this.f7482e.f7478a;
            this.f7480c++;
        } else {
            x(i8, 1);
            this.f7478a[i8] = obj;
        }
    }

    private final void r() {
        b bVar = this.f7483f;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void t() {
        if (!y()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean u(List list) {
        boolean h8;
        h8 = c.h(this.f7478a, this.f7479b, this.f7480c, list);
        return h8;
    }

    private final void v(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f7478a;
            if (i8 > objArr.length) {
                this.f7478a = c.e(this.f7478a, AbstractC1230c.Companion.e(objArr.length, i8));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void w(int i8) {
        v(this.f7480c + i8);
    }

    private final void x(int i8, int i9) {
        w(i9);
        Object[] objArr = this.f7478a;
        AbstractC1239l.i(objArr, objArr, i8 + i9, i8, this.f7479b + this.f7480c);
        this.f7480c += i9;
    }

    private final boolean y() {
        b bVar;
        if (!this.f7481d && ((bVar = this.f7483f) == null || !bVar.f7481d)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        t();
        r();
        p(this.f7479b + this.f7480c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        t();
        r();
        int size = elements.size();
        m(this.f7479b + this.f7480c, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        t();
        r();
        C(this.f7479b, this.f7480c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        r();
        if (obj != this && (!(obj instanceof List) || !u((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        r();
        AbstractC1230c.Companion.b(i8, this.f7480c);
        return this.f7478a[this.f7479b + i8];
    }

    @Override // M5.AbstractC1233f
    public int getSize() {
        r();
        return this.f7480c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8;
        r();
        i8 = c.i(this.f7478a, this.f7479b, this.f7480c);
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        r();
        for (int i8 = 0; i8 < this.f7480c; i8++) {
            if (AbstractC3159y.d(this.f7478a[this.f7479b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        r();
        if (this.f7480c == 0) {
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
        r();
        for (int i8 = this.f7480c - 1; i8 >= 0; i8--) {
            if (AbstractC3159y.d(this.f7478a[this.f7479b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final List q() {
        if (this.f7482e == null) {
            t();
            this.f7481d = true;
            if (this.f7480c > 0) {
                return this;
            }
            return f7477h;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        t();
        r();
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
        AbstractC3159y.i(elements, "elements");
        t();
        r();
        if (D(this.f7479b, this.f7480c, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // M5.AbstractC1233f
    public Object removeAt(int i8) {
        t();
        r();
        AbstractC1230c.Companion.b(i8, this.f7480c);
        return B(this.f7479b + i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        t();
        r();
        if (D(this.f7479b, this.f7480c, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        t();
        r();
        AbstractC1230c.Companion.b(i8, this.f7480c);
        Object[] objArr = this.f7478a;
        int i9 = this.f7479b;
        Object obj2 = objArr[i9 + i8];
        objArr[i9 + i8] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i8, int i9) {
        b bVar;
        AbstractC1230c.Companion.d(i8, i9, this.f7480c);
        Object[] objArr = this.f7478a;
        int i10 = this.f7479b + i8;
        int i11 = i9 - i8;
        boolean z8 = this.f7481d;
        b bVar2 = this.f7483f;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new b(objArr, i10, i11, z8, this, bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] destination) {
        AbstractC3159y.i(destination, "destination");
        r();
        int length = destination.length;
        int i8 = this.f7480c;
        if (length < i8) {
            Object[] objArr = this.f7478a;
            int i9 = this.f7479b;
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i9, i8 + i9, destination.getClass());
            AbstractC3159y.h(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        Object[] objArr2 = this.f7478a;
        int i10 = this.f7479b;
        AbstractC1239l.i(objArr2, destination, 0, i10, i8 + i10);
        return AbstractC1246t.f(this.f7480c, destination);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j8;
        r();
        j8 = c.j(this.f7478a, this.f7479b, this.f7480c, this);
        return j8;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i8) {
        r();
        AbstractC1230c.Companion.c(i8, this.f7480c);
        return new C0161b(this, i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        t();
        r();
        AbstractC1230c.Companion.c(i8, this.f7480c);
        p(this.f7479b + i8, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection elements) {
        AbstractC3159y.i(elements, "elements");
        t();
        r();
        AbstractC1230c.Companion.c(i8, this.f7480c);
        int size = elements.size();
        m(this.f7479b + i8, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        r();
        Object[] objArr = this.f7478a;
        int i8 = this.f7479b;
        return AbstractC1239l.p(objArr, i8, this.f7480c + i8);
    }

    public b() {
        this(10);
    }

    public b(int i8) {
        this(c.d(i8), 0, 0, false, null, null);
    }
}
