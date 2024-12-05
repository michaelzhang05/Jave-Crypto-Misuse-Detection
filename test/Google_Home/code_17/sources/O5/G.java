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
public final class G implements Collection, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private final short[] f8275a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final short[] f8276a;

        /* renamed from: b, reason: collision with root package name */
        private int f8277b;

        public a(short[] array) {
            AbstractC3255y.i(array, "array");
            this.f8276a = array;
        }

        public short a() {
            int i8 = this.f8277b;
            short[] sArr = this.f8276a;
            if (i8 < sArr.length) {
                this.f8277b = i8 + 1;
                return F.b(sArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f8277b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8277b < this.f8276a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return F.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ G(short[] sArr) {
        this.f8275a = sArr;
    }

    public static final /* synthetic */ G c(short[] sArr) {
        return new G(sArr);
    }

    public static short[] e(int i8) {
        return f(new short[i8]);
    }

    public static short[] f(short[] storage) {
        AbstractC3255y.i(storage, "storage");
        return storage;
    }

    public static boolean k(short[] sArr, short s8) {
        return AbstractC1371l.X(sArr, s8);
    }

    public static boolean l(short[] sArr, Collection elements) {
        AbstractC3255y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof F) || !AbstractC1371l.X(sArr, ((F) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(short[] sArr, Object obj) {
        if (!(obj instanceof G) || !AbstractC3255y.d(sArr, ((G) obj).y())) {
            return false;
        }
        return true;
    }

    public static final short n(short[] sArr, int i8) {
        return F.b(sArr[i8]);
    }

    public static int p(short[] sArr) {
        return sArr.length;
    }

    public static int q(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean r(short[] sArr) {
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator t(short[] sArr) {
        return new a(sArr);
    }

    public static final void u(short[] sArr, int i8, short s8) {
        sArr[i8] = s8;
    }

    public static String v(short[] sArr) {
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
        return j(((F) obj).f());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        return l(this.f8275a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f8275a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f8275a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f8275a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return t(this.f8275a);
    }

    public boolean j(short s8) {
        return k(this.f8275a, s8);
    }

    @Override // java.util.Collection
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f8275a);
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
        return v(this.f8275a);
    }

    public final /* synthetic */ short[] y() {
        return this.f8275a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3255y.i(array, "array");
        return AbstractC3246o.b(this, array);
    }
}
