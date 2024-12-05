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
public final class B implements Collection, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f8264a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f8265a;

        /* renamed from: b, reason: collision with root package name */
        private int f8266b;

        public a(int[] array) {
            AbstractC3255y.i(array, "array");
            this.f8265a = array;
        }

        public int a() {
            int i8 = this.f8266b;
            int[] iArr = this.f8265a;
            if (i8 < iArr.length) {
                this.f8266b = i8 + 1;
                return A.b(iArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f8266b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8266b < this.f8265a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return A.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ B(int[] iArr) {
        this.f8264a = iArr;
    }

    public static final /* synthetic */ B c(int[] iArr) {
        return new B(iArr);
    }

    public static int[] e(int i8) {
        return f(new int[i8]);
    }

    public static int[] f(int[] storage) {
        AbstractC3255y.i(storage, "storage");
        return storage;
    }

    public static boolean k(int[] iArr, int i8) {
        return AbstractC1371l.U(iArr, i8);
    }

    public static boolean l(int[] iArr, Collection elements) {
        AbstractC3255y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof A) || !AbstractC1371l.U(iArr, ((A) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(int[] iArr, Object obj) {
        if (!(obj instanceof B) || !AbstractC3255y.d(iArr, ((B) obj).y())) {
            return false;
        }
        return true;
    }

    public static final int n(int[] iArr, int i8) {
        return A.b(iArr[i8]);
    }

    public static int p(int[] iArr) {
        return iArr.length;
    }

    public static int q(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean r(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator t(int[] iArr) {
        return new a(iArr);
    }

    public static final void u(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    public static String v(int[] iArr) {
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
        return j(((A) obj).f());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        return l(this.f8264a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f8264a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f8264a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f8264a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return t(this.f8264a);
    }

    public boolean j(int i8) {
        return k(this.f8264a, i8);
    }

    @Override // java.util.Collection
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f8264a);
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
        return v(this.f8264a);
    }

    public final /* synthetic */ int[] y() {
        return this.f8264a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3255y.i(array, "array");
        return AbstractC3246o.b(this, array);
    }
}
