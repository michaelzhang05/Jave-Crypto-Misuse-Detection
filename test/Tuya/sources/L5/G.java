package L5;

import M5.AbstractC1239l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3150o;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class G implements Collection, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private final short[] f6484a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final short[] f6485a;

        /* renamed from: b, reason: collision with root package name */
        private int f6486b;

        public a(short[] array) {
            AbstractC3159y.i(array, "array");
            this.f6485a = array;
        }

        public short b() {
            int i8 = this.f6486b;
            short[] sArr = this.f6485a;
            if (i8 < sArr.length) {
                this.f6486b = i8 + 1;
                return F.b(sArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f6486b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6486b < this.f6485a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return F.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ G(short[] sArr) {
        this.f6484a = sArr;
    }

    public static final /* synthetic */ G a(short[] sArr) {
        return new G(sArr);
    }

    public static short[] g(int i8) {
        return h(new short[i8]);
    }

    public static short[] h(short[] storage) {
        AbstractC3159y.i(storage, "storage");
        return storage;
    }

    public static boolean l(short[] sArr, short s8) {
        return AbstractC1239l.X(sArr, s8);
    }

    public static boolean m(short[] sArr, Collection elements) {
        AbstractC3159y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof F) || !AbstractC1239l.X(sArr, ((F) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(short[] sArr, Object obj) {
        if (!(obj instanceof G) || !AbstractC3159y.d(sArr, ((G) obj).y())) {
            return false;
        }
        return true;
    }

    public static final short q(short[] sArr, int i8) {
        return F.b(sArr[i8]);
    }

    public static int s(short[] sArr) {
        return sArr.length;
    }

    public static int t(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean u(short[] sArr) {
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator v(short[] sArr) {
        return new a(sArr);
    }

    public static final void w(short[] sArr, int i8, short s8) {
        sArr[i8] = s8;
    }

    public static String x(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
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
        if (!(obj instanceof F)) {
            return false;
        }
        return i(((F) obj).f());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        return m(this.f6484a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f6484a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f6484a);
    }

    public boolean i(short s8) {
        return l(this.f6484a, s8);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.f6484a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return v(this.f6484a);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.f6484a);
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
        return x(this.f6484a);
    }

    public final /* synthetic */ short[] y() {
        return this.f6484a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3159y.i(array, "array");
        return AbstractC3150o.b(this, array);
    }
}
