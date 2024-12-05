package O5;

import P5.AbstractC1371l;
import b6.InterfaceC1985a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3246o;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class D implements Collection, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f8269a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final long[] f8270a;

        /* renamed from: b, reason: collision with root package name */
        private int f8271b;

        public a(long[] array) {
            AbstractC3255y.i(array, "array");
            this.f8270a = array;
        }

        public long a() {
            int i8 = this.f8271b;
            long[] jArr = this.f8270a;
            if (i8 < jArr.length) {
                this.f8271b = i8 + 1;
                return C.b(jArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f8271b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8271b < this.f8270a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ D(long[] jArr) {
        this.f8269a = jArr;
    }

    public static final /* synthetic */ D c(long[] jArr) {
        return new D(jArr);
    }

    public static long[] e(int i8) {
        return f(new long[i8]);
    }

    public static long[] f(long[] storage) {
        AbstractC3255y.i(storage, "storage");
        return storage;
    }

    public static boolean k(long[] jArr, long j8) {
        return AbstractC1371l.V(jArr, j8);
    }

    public static boolean l(long[] jArr, Collection elements) {
        AbstractC3255y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C) || !AbstractC1371l.V(jArr, ((C) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(long[] jArr, Object obj) {
        if (!(obj instanceof D) || !AbstractC3255y.d(jArr, ((D) obj).y())) {
            return false;
        }
        return true;
    }

    public static final long n(long[] jArr, int i8) {
        return C.b(jArr[i8]);
    }

    public static int p(long[] jArr) {
        return jArr.length;
    }

    public static int q(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean r(long[] jArr) {
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator t(long[] jArr) {
        return new a(jArr);
    }

    public static final void u(long[] jArr, int i8, long j8) {
        jArr[i8] = j8;
    }

    public static String v(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        return j(((C) obj).g());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        return l(this.f8269a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f8269a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f8269a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f8269a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return t(this.f8269a);
    }

    public boolean j(long j8) {
        return k(this.f8269a, j8);
    }

    @Override // java.util.Collection
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f8269a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3246o.a(this);
    }

    public String toString() {
        return v(this.f8269a);
    }

    public final /* synthetic */ long[] y() {
        return this.f8269a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3255y.i(array, "array");
        return AbstractC3246o.b(this, array);
    }
}
