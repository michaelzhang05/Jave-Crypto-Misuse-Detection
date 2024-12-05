package L5;

import M5.AbstractC1239l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3150o;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class B implements Collection, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f6473a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f6474a;

        /* renamed from: b, reason: collision with root package name */
        private int f6475b;

        public a(int[] array) {
            AbstractC3159y.i(array, "array");
            this.f6474a = array;
        }

        public int b() {
            int i8 = this.f6475b;
            int[] iArr = this.f6474a;
            if (i8 < iArr.length) {
                this.f6475b = i8 + 1;
                return A.b(iArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f6475b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6475b < this.f6474a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return A.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ B(int[] iArr) {
        this.f6473a = iArr;
    }

    public static final /* synthetic */ B a(int[] iArr) {
        return new B(iArr);
    }

    public static int[] g(int i8) {
        return h(new int[i8]);
    }

    public static int[] h(int[] storage) {
        AbstractC3159y.i(storage, "storage");
        return storage;
    }

    public static boolean l(int[] iArr, int i8) {
        return AbstractC1239l.U(iArr, i8);
    }

    public static boolean m(int[] iArr, Collection elements) {
        AbstractC3159y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof A) || !AbstractC1239l.U(iArr, ((A) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(int[] iArr, Object obj) {
        if (!(obj instanceof B) || !AbstractC3159y.d(iArr, ((B) obj).y())) {
            return false;
        }
        return true;
    }

    public static final int q(int[] iArr, int i8) {
        return A.b(iArr[i8]);
    }

    public static int s(int[] iArr) {
        return iArr.length;
    }

    public static int t(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean u(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator v(int[] iArr) {
        return new a(iArr);
    }

    public static final void w(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    public static String x(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
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
        if (!(obj instanceof A)) {
            return false;
        }
        return i(((A) obj).f());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        return m(this.f6473a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f6473a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f6473a);
    }

    public boolean i(int i8) {
        return l(this.f6473a, i8);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.f6473a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return v(this.f6473a);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.f6473a);
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
        return x(this.f6473a);
    }

    public final /* synthetic */ int[] y() {
        return this.f6473a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3159y.i(array, "array");
        return AbstractC3150o.b(this, array);
    }
}
