package L5;

import M5.AbstractC1239l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3150o;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class z implements Collection, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f6527a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f6528a;

        /* renamed from: b, reason: collision with root package name */
        private int f6529b;

        public a(byte[] array) {
            AbstractC3159y.i(array, "array");
            this.f6528a = array;
        }

        public byte b() {
            int i8 = this.f6529b;
            byte[] bArr = this.f6528a;
            if (i8 < bArr.length) {
                this.f6529b = i8 + 1;
                return y.b(bArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f6529b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6529b < this.f6528a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return y.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ z(byte[] bArr) {
        this.f6527a = bArr;
    }

    public static final /* synthetic */ z a(byte[] bArr) {
        return new z(bArr);
    }

    public static byte[] g(int i8) {
        return h(new byte[i8]);
    }

    public static byte[] h(byte[] storage) {
        AbstractC3159y.i(storage, "storage");
        return storage;
    }

    public static boolean l(byte[] bArr, byte b8) {
        return AbstractC1239l.S(bArr, b8);
    }

    public static boolean m(byte[] bArr, Collection elements) {
        AbstractC3159y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof y) || !AbstractC1239l.S(bArr, ((y) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(byte[] bArr, Object obj) {
        if (!(obj instanceof z) || !AbstractC3159y.d(bArr, ((z) obj).y())) {
            return false;
        }
        return true;
    }

    public static final byte q(byte[] bArr, int i8) {
        return y.b(bArr[i8]);
    }

    public static int s(byte[] bArr) {
        return bArr.length;
    }

    public static int t(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean u(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator v(byte[] bArr) {
        return new a(bArr);
    }

    public static final void w(byte[] bArr, int i8, byte b8) {
        bArr[i8] = b8;
    }

    public static String x(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (!(obj instanceof y)) {
            return false;
        }
        return i(((y) obj).f());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        return m(this.f6527a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f6527a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f6527a);
    }

    public boolean i(byte b8) {
        return l(this.f6527a, b8);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.f6527a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return v(this.f6527a);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.f6527a);
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
        return x(this.f6527a);
    }

    public final /* synthetic */ byte[] y() {
        return this.f6527a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3159y.i(array, "array");
        return AbstractC3150o.b(this, array);
    }
}
