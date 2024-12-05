package P5;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: P5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1370k extends AbstractC1365f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8885d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f8886e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    private int f8887a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f8888b;

    /* renamed from: c, reason: collision with root package name */
    private int f8889c;

    /* renamed from: P5.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1370k(int i8) {
        Object[] objArr;
        if (i8 == 0) {
            objArr = f8886e;
        } else if (i8 > 0) {
            objArr = new Object[i8];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i8);
        }
        this.f8888b = objArr;
    }

    private final void f(int i8, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f8888b.length;
        while (i8 < length && it.hasNext()) {
            this.f8888b[i8] = it.next();
            i8++;
        }
        int i9 = this.f8887a;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f8888b[i10] = it.next();
        }
        this.f8889c = size() + collection.size();
    }

    private final void j(int i8) {
        Object[] objArr = new Object[i8];
        Object[] objArr2 = this.f8888b;
        AbstractC1371l.i(objArr2, objArr, 0, this.f8887a, objArr2.length);
        Object[] objArr3 = this.f8888b;
        int length = objArr3.length;
        int i9 = this.f8887a;
        AbstractC1371l.i(objArr3, objArr, length - i9, 0, i9);
        this.f8887a = 0;
        this.f8888b = objArr;
    }

    private final int k(int i8) {
        if (i8 == 0) {
            return AbstractC1371l.i0(this.f8888b);
        }
        return i8 - 1;
    }

    private final void m(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f8888b;
            if (i8 <= objArr.length) {
                return;
            }
            if (objArr == f8886e) {
                this.f8888b = new Object[g6.m.d(i8, 10)];
                return;
            } else {
                j(AbstractC1362c.Companion.e(objArr.length, i8));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int o(int i8) {
        if (i8 == AbstractC1371l.i0(this.f8888b)) {
            return 0;
        }
        return i8 + 1;
    }

    private final int r(int i8) {
        if (i8 < 0) {
            return i8 + this.f8888b.length;
        }
        return i8;
    }

    private final int t(int i8) {
        Object[] objArr = this.f8888b;
        if (i8 >= objArr.length) {
            return i8 - objArr.length;
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        e(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m(size() + elements.size());
        f(t(this.f8887a + size()), elements);
        return true;
    }

    public final void c(Object obj) {
        m(size() + 1);
        int k8 = k(this.f8887a);
        this.f8887a = k8;
        this.f8888b[k8] = obj;
        this.f8889c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int t8 = t(this.f8887a + size());
        int i8 = this.f8887a;
        if (i8 < t8) {
            AbstractC1371l.t(this.f8888b, null, i8, t8);
        } else if (!isEmpty()) {
            Object[] objArr = this.f8888b;
            AbstractC1371l.t(objArr, null, this.f8887a, objArr.length);
            AbstractC1371l.t(this.f8888b, null, 0, t8);
        }
        this.f8887a = 0;
        this.f8889c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void e(Object obj) {
        m(size() + 1);
        this.f8888b[t(this.f8887a + size())] = obj;
        this.f8889c = size() + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f8888b[this.f8887a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        AbstractC1362c.Companion.b(i8, size());
        return this.f8888b[t(this.f8887a + i8)];
    }

    @Override // P5.AbstractC1365f
    public int getSize() {
        return this.f8889c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i8;
        int t8 = t(this.f8887a + size());
        int i9 = this.f8887a;
        if (i9 < t8) {
            while (i9 < t8) {
                if (AbstractC3255y.d(obj, this.f8888b[i9])) {
                    i8 = this.f8887a;
                } else {
                    i9++;
                }
            }
            return -1;
        }
        if (i9 >= t8) {
            int length = this.f8888b.length;
            while (true) {
                if (i9 < length) {
                    if (AbstractC3255y.d(obj, this.f8888b[i9])) {
                        i8 = this.f8887a;
                        break;
                    }
                    i9++;
                } else {
                    for (int i10 = 0; i10 < t8; i10++) {
                        if (AbstractC3255y.d(obj, this.f8888b[i10])) {
                            i9 = i10 + this.f8888b.length;
                            i8 = this.f8887a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i9 - i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f8888b[t(this.f8887a + AbstractC1378t.o(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int i02;
        int i8;
        int t8 = t(this.f8887a + size());
        int i9 = this.f8887a;
        if (i9 < t8) {
            i02 = t8 - 1;
            if (i9 <= i02) {
                while (!AbstractC3255y.d(obj, this.f8888b[i02])) {
                    if (i02 != i9) {
                        i02--;
                    }
                }
                i8 = this.f8887a;
                return i02 - i8;
            }
            return -1;
        }
        if (i9 > t8) {
            int i10 = t8 - 1;
            while (true) {
                if (-1 < i10) {
                    if (AbstractC3255y.d(obj, this.f8888b[i10])) {
                        i02 = i10 + this.f8888b.length;
                        i8 = this.f8887a;
                        break;
                    }
                    i10--;
                } else {
                    i02 = AbstractC1371l.i0(this.f8888b);
                    int i11 = this.f8887a;
                    if (i11 <= i02) {
                        while (!AbstractC3255y.d(obj, this.f8888b[i02])) {
                            if (i02 != i11) {
                                i02--;
                            }
                        }
                        i8 = this.f8887a;
                    }
                }
            }
        }
        return -1;
    }

    public final Object n() {
        if (isEmpty()) {
            return null;
        }
        return this.f8888b[this.f8887a];
    }

    public final Object q() {
        if (isEmpty()) {
            return null;
        }
        return this.f8888b[t(this.f8887a + AbstractC1378t.o(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int t8;
        AbstractC3255y.i(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f8888b.length != 0) {
            int t9 = t(this.f8887a + size());
            int i8 = this.f8887a;
            if (i8 < t9) {
                t8 = i8;
                while (i8 < t9) {
                    Object obj = this.f8888b[i8];
                    if (!elements.contains(obj)) {
                        this.f8888b[t8] = obj;
                        t8++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                AbstractC1371l.t(this.f8888b, null, t8, t9);
            } else {
                int length = this.f8888b.length;
                int i9 = i8;
                boolean z9 = false;
                while (i8 < length) {
                    Object[] objArr = this.f8888b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (!elements.contains(obj2)) {
                        this.f8888b[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i8++;
                }
                t8 = t(i9);
                for (int i10 = 0; i10 < t9; i10++) {
                    Object[] objArr2 = this.f8888b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (!elements.contains(obj3)) {
                        this.f8888b[t8] = obj3;
                        t8 = o(t8);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                this.f8889c = r(t8 - this.f8887a);
            }
        }
        return z8;
    }

    @Override // P5.AbstractC1365f
    public Object removeAt(int i8) {
        AbstractC1362c.Companion.b(i8, size());
        if (i8 == AbstractC1378t.o(this)) {
            return y();
        }
        if (i8 == 0) {
            return u();
        }
        int t8 = t(this.f8887a + i8);
        Object obj = this.f8888b[t8];
        if (i8 < (size() >> 1)) {
            int i9 = this.f8887a;
            if (t8 >= i9) {
                Object[] objArr = this.f8888b;
                AbstractC1371l.i(objArr, objArr, i9 + 1, i9, t8);
            } else {
                Object[] objArr2 = this.f8888b;
                AbstractC1371l.i(objArr2, objArr2, 1, 0, t8);
                Object[] objArr3 = this.f8888b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.f8887a;
                AbstractC1371l.i(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.f8888b;
            int i11 = this.f8887a;
            objArr4[i11] = null;
            this.f8887a = o(i11);
        } else {
            int t9 = t(this.f8887a + AbstractC1378t.o(this));
            if (t8 <= t9) {
                Object[] objArr5 = this.f8888b;
                AbstractC1371l.i(objArr5, objArr5, t8, t8 + 1, t9 + 1);
            } else {
                Object[] objArr6 = this.f8888b;
                AbstractC1371l.i(objArr6, objArr6, t8, t8 + 1, objArr6.length);
                Object[] objArr7 = this.f8888b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC1371l.i(objArr7, objArr7, 0, 1, t9 + 1);
            }
            this.f8888b[t9] = null;
        }
        this.f8889c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int t8;
        AbstractC3255y.i(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f8888b.length != 0) {
            int t9 = t(this.f8887a + size());
            int i8 = this.f8887a;
            if (i8 < t9) {
                t8 = i8;
                while (i8 < t9) {
                    Object obj = this.f8888b[i8];
                    if (elements.contains(obj)) {
                        this.f8888b[t8] = obj;
                        t8++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                AbstractC1371l.t(this.f8888b, null, t8, t9);
            } else {
                int length = this.f8888b.length;
                int i9 = i8;
                boolean z9 = false;
                while (i8 < length) {
                    Object[] objArr = this.f8888b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (elements.contains(obj2)) {
                        this.f8888b[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i8++;
                }
                t8 = t(i9);
                for (int i10 = 0; i10 < t9; i10++) {
                    Object[] objArr2 = this.f8888b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.f8888b[t8] = obj3;
                        t8 = o(t8);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                this.f8889c = r(t8 - this.f8887a);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        AbstractC1362c.Companion.b(i8, size());
        int t8 = t(this.f8887a + i8);
        Object[] objArr = this.f8888b;
        Object obj2 = objArr[t8];
        objArr[t8] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC3255y.i(array, "array");
        if (array.length < size()) {
            array = AbstractC1372m.a(array, size());
        }
        int t8 = t(this.f8887a + size());
        int i8 = this.f8887a;
        if (i8 < t8) {
            AbstractC1371l.n(this.f8888b, array, 0, i8, t8, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f8888b;
            AbstractC1371l.i(objArr, array, 0, this.f8887a, objArr.length);
            Object[] objArr2 = this.f8888b;
            AbstractC1371l.i(objArr2, array, objArr2.length - this.f8887a, 0, t8);
        }
        return AbstractC1378t.f(size(), array);
    }

    public final Object u() {
        if (!isEmpty()) {
            Object[] objArr = this.f8888b;
            int i8 = this.f8887a;
            Object obj = objArr[i8];
            objArr[i8] = null;
            this.f8887a = o(i8);
            this.f8889c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object v() {
        if (isEmpty()) {
            return null;
        }
        return u();
    }

    public final Object y() {
        if (!isEmpty()) {
            int t8 = t(this.f8887a + AbstractC1378t.o(this));
            Object[] objArr = this.f8888b;
            Object obj = objArr[t8];
            objArr[t8] = null;
            this.f8889c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object z() {
        if (isEmpty()) {
            return null;
        }
        return y();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        AbstractC1362c.Companion.c(i8, size());
        if (i8 == size()) {
            e(obj);
            return;
        }
        if (i8 == 0) {
            c(obj);
            return;
        }
        m(size() + 1);
        int t8 = t(this.f8887a + i8);
        if (i8 < ((size() + 1) >> 1)) {
            int k8 = k(t8);
            int k9 = k(this.f8887a);
            int i9 = this.f8887a;
            if (k8 >= i9) {
                Object[] objArr = this.f8888b;
                objArr[k9] = objArr[i9];
                AbstractC1371l.i(objArr, objArr, i9, i9 + 1, k8 + 1);
            } else {
                Object[] objArr2 = this.f8888b;
                AbstractC1371l.i(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.f8888b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC1371l.i(objArr3, objArr3, 0, 1, k8 + 1);
            }
            this.f8888b[k8] = obj;
            this.f8887a = k9;
        } else {
            int t9 = t(this.f8887a + size());
            if (t8 < t9) {
                Object[] objArr4 = this.f8888b;
                AbstractC1371l.i(objArr4, objArr4, t8 + 1, t8, t9);
            } else {
                Object[] objArr5 = this.f8888b;
                AbstractC1371l.i(objArr5, objArr5, 1, 0, t9);
                Object[] objArr6 = this.f8888b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC1371l.i(objArr6, objArr6, t8 + 1, t8, objArr6.length - 1);
            }
            this.f8888b[t8] = obj;
        }
        this.f8889c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection elements) {
        AbstractC3255y.i(elements, "elements");
        AbstractC1362c.Companion.c(i8, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i8 == size()) {
            return addAll(elements);
        }
        m(size() + elements.size());
        int t8 = t(this.f8887a + size());
        int t9 = t(this.f8887a + i8);
        int size = elements.size();
        if (i8 < ((size() + 1) >> 1)) {
            int i9 = this.f8887a;
            int i10 = i9 - size;
            if (t9 < i9) {
                Object[] objArr = this.f8888b;
                AbstractC1371l.i(objArr, objArr, i10, i9, objArr.length);
                if (size >= t9) {
                    Object[] objArr2 = this.f8888b;
                    AbstractC1371l.i(objArr2, objArr2, objArr2.length - size, 0, t9);
                } else {
                    Object[] objArr3 = this.f8888b;
                    AbstractC1371l.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f8888b;
                    AbstractC1371l.i(objArr4, objArr4, 0, size, t9);
                }
            } else if (i10 >= 0) {
                Object[] objArr5 = this.f8888b;
                AbstractC1371l.i(objArr5, objArr5, i10, i9, t9);
            } else {
                Object[] objArr6 = this.f8888b;
                i10 += objArr6.length;
                int i11 = t9 - i9;
                int length = objArr6.length - i10;
                if (length >= i11) {
                    AbstractC1371l.i(objArr6, objArr6, i10, i9, t9);
                } else {
                    AbstractC1371l.i(objArr6, objArr6, i10, i9, i9 + length);
                    Object[] objArr7 = this.f8888b;
                    AbstractC1371l.i(objArr7, objArr7, 0, this.f8887a + length, t9);
                }
            }
            this.f8887a = i10;
            f(r(t9 - size), elements);
        } else {
            int i12 = t9 + size;
            if (t9 < t8) {
                int i13 = size + t8;
                Object[] objArr8 = this.f8888b;
                if (i13 <= objArr8.length) {
                    AbstractC1371l.i(objArr8, objArr8, i12, t9, t8);
                } else if (i12 >= objArr8.length) {
                    AbstractC1371l.i(objArr8, objArr8, i12 - objArr8.length, t9, t8);
                } else {
                    int length2 = t8 - (i13 - objArr8.length);
                    AbstractC1371l.i(objArr8, objArr8, 0, length2, t8);
                    Object[] objArr9 = this.f8888b;
                    AbstractC1371l.i(objArr9, objArr9, i12, t9, length2);
                }
            } else {
                Object[] objArr10 = this.f8888b;
                AbstractC1371l.i(objArr10, objArr10, size, 0, t8);
                Object[] objArr11 = this.f8888b;
                if (i12 >= objArr11.length) {
                    AbstractC1371l.i(objArr11, objArr11, i12 - objArr11.length, t9, objArr11.length);
                } else {
                    AbstractC1371l.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f8888b;
                    AbstractC1371l.i(objArr12, objArr12, i12, t9, objArr12.length - size);
                }
            }
            f(t9, elements);
        }
        return true;
    }

    public C1370k() {
        this.f8888b = f8886e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
