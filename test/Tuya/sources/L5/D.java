package L5;

import M5.AbstractC1239l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3150o;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class D implements Collection, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f6478a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final long[] f6479a;

        /* renamed from: b, reason: collision with root package name */
        private int f6480b;

        public a(long[] array) {
            AbstractC3159y.i(array, "array");
            this.f6479a = array;
        }

        public long b() {
            int i8 = this.f6480b;
            long[] jArr = this.f6479a;
            if (i8 < jArr.length) {
                this.f6480b = i8 + 1;
                return C.b(jArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f6480b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6480b < this.f6479a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ D(long[] jArr) {
        this.f6478a = jArr;
    }

    public static final /* synthetic */ D a(long[] jArr) {
        return new D(jArr);
    }

    public static long[] g(int i8) {
        return h(new long[i8]);
    }

    public static long[] h(long[] storage) {
        AbstractC3159y.i(storage, "storage");
        return storage;
    }

    public static boolean l(long[] jArr, long j8) {
        return AbstractC1239l.V(jArr, j8);
    }

    public static boolean m(long[] jArr, Collection elements) {
        AbstractC3159y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C) || !AbstractC1239l.V(jArr, ((C) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr, Object obj) {
        if (!(obj instanceof D) || !AbstractC3159y.d(jArr, ((D) obj).y())) {
            return false;
        }
        return true;
    }

    public static final long q(long[] jArr, int i8) {
        return C.b(jArr[i8]);
    }

    public static int s(long[] jArr) {
        return jArr.length;
    }

    public static int t(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean u(long[] jArr) {
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator v(long[] jArr) {
        return new a(jArr);
    }

    public static final void w(long[] jArr, int i8, long j8) {
        jArr[i8] = j8;
    }

    public static String x(long[] jArr) {
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
        return i(((C) obj).g());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        return m(this.f6478a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f6478a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f6478a);
    }

    public boolean i(long j8) {
        return l(this.f6478a, j8);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.f6478a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return v(this.f6478a);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.f6478a);
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
        return AbstractC3150o.a(this);
    }

    public String toString() {
        return x(this.f6478a);
    }

    public final /* synthetic */ long[] y() {
        return this.f6478a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3159y.i(array, "array");
        return AbstractC3150o.b(this, array);
    }
}
