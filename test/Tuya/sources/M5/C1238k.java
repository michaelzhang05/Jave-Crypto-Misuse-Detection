package M5;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: M5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1238k extends AbstractC1233f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f7061d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f7062e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    private int f7063a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f7064b;

    /* renamed from: c, reason: collision with root package name */
    private int f7065c;

    /* renamed from: M5.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1238k(int i8) {
        Object[] objArr;
        if (i8 == 0) {
            objArr = f7062e;
        } else if (i8 > 0) {
            objArr = new Object[i8];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i8);
        }
        this.f7064b = objArr;
    }

    private final void h(int i8, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f7064b.length;
        while (i8 < length && it.hasNext()) {
            this.f7064b[i8] = it.next();
            i8++;
        }
        int i9 = this.f7063a;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f7064b[i10] = it.next();
        }
        this.f7065c = size() + collection.size();
    }

    private final void l(int i8) {
        Object[] objArr = new Object[i8];
        Object[] objArr2 = this.f7064b;
        AbstractC1239l.i(objArr2, objArr, 0, this.f7063a, objArr2.length);
        Object[] objArr3 = this.f7064b;
        int length = objArr3.length;
        int i9 = this.f7063a;
        AbstractC1239l.i(objArr3, objArr, length - i9, 0, i9);
        this.f7063a = 0;
        this.f7064b = objArr;
    }

    private final int m(int i8) {
        if (i8 == 0) {
            return AbstractC1239l.i0(this.f7064b);
        }
        return i8 - 1;
    }

    private final void p(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f7064b;
            if (i8 <= objArr.length) {
                return;
            }
            if (objArr == f7062e) {
                this.f7064b = new Object[d6.m.d(i8, 10)];
                return;
            } else {
                l(AbstractC1230c.Companion.e(objArr.length, i8));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int r(int i8) {
        if (i8 == AbstractC1239l.i0(this.f7064b)) {
            return 0;
        }
        return i8 + 1;
    }

    private final int u(int i8) {
        if (i8 < 0) {
            return i8 + this.f7064b.length;
        }
        return i8;
    }

    private final int v(int i8) {
        Object[] objArr = this.f7064b;
        if (i8 >= objArr.length) {
            return i8 - objArr.length;
        }
        return i8;
    }

    public final Object A() {
        if (isEmpty()) {
            return null;
        }
        return y();
    }

    public final void a(Object obj) {
        p(size() + 1);
        int m8 = m(this.f7063a);
        this.f7063a = m8;
        this.f7064b[m8] = obj;
        this.f7065c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        g(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        p(size() + elements.size());
        h(v(this.f7063a + size()), elements);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int v8 = v(this.f7063a + size());
        int i8 = this.f7063a;
        if (i8 < v8) {
            AbstractC1239l.t(this.f7064b, null, i8, v8);
        } else if (!isEmpty()) {
            Object[] objArr = this.f7064b;
            AbstractC1239l.t(objArr, null, this.f7063a, objArr.length);
            AbstractC1239l.t(this.f7064b, null, 0, v8);
        }
        this.f7063a = 0;
        this.f7065c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f7064b[this.f7063a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void g(Object obj) {
        p(size() + 1);
        this.f7064b[v(this.f7063a + size())] = obj;
        this.f7065c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        AbstractC1230c.Companion.b(i8, size());
        return this.f7064b[v(this.f7063a + i8)];
    }

    @Override // M5.AbstractC1233f
    public int getSize() {
        return this.f7065c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i8;
        int v8 = v(this.f7063a + size());
        int i9 = this.f7063a;
        if (i9 < v8) {
            while (i9 < v8) {
                if (AbstractC3159y.d(obj, this.f7064b[i9])) {
                    i8 = this.f7063a;
                } else {
                    i9++;
                }
            }
            return -1;
        }
        if (i9 >= v8) {
            int length = this.f7064b.length;
            while (true) {
                if (i9 < length) {
                    if (AbstractC3159y.d(obj, this.f7064b[i9])) {
                        i8 = this.f7063a;
                        break;
                    }
                    i9++;
                } else {
                    for (int i10 = 0; i10 < v8; i10++) {
                        if (AbstractC3159y.d(obj, this.f7064b[i10])) {
                            i9 = i10 + this.f7064b.length;
                            i8 = this.f7063a;
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
            return this.f7064b[v(this.f7063a + AbstractC1246t.o(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int i02;
        int i8;
        int v8 = v(this.f7063a + size());
        int i9 = this.f7063a;
        if (i9 < v8) {
            i02 = v8 - 1;
            if (i9 <= i02) {
                while (!AbstractC3159y.d(obj, this.f7064b[i02])) {
                    if (i02 != i9) {
                        i02--;
                    }
                }
                i8 = this.f7063a;
                return i02 - i8;
            }
            return -1;
        }
        if (i9 > v8) {
            int i10 = v8 - 1;
            while (true) {
                if (-1 < i10) {
                    if (AbstractC3159y.d(obj, this.f7064b[i10])) {
                        i02 = i10 + this.f7064b.length;
                        i8 = this.f7063a;
                        break;
                    }
                    i10--;
                } else {
                    i02 = AbstractC1239l.i0(this.f7064b);
                    int i11 = this.f7063a;
                    if (i11 <= i02) {
                        while (!AbstractC3159y.d(obj, this.f7064b[i02])) {
                            if (i02 != i11) {
                                i02--;
                            }
                        }
                        i8 = this.f7063a;
                    }
                }
            }
        }
        return -1;
    }

    public final Object q() {
        if (isEmpty()) {
            return null;
        }
        return this.f7064b[this.f7063a];
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
        int v8;
        AbstractC3159y.i(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f7064b.length != 0) {
            int v9 = v(this.f7063a + size());
            int i8 = this.f7063a;
            if (i8 < v9) {
                v8 = i8;
                while (i8 < v9) {
                    Object obj = this.f7064b[i8];
                    if (!elements.contains(obj)) {
                        this.f7064b[v8] = obj;
                        v8++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                AbstractC1239l.t(this.f7064b, null, v8, v9);
            } else {
                int length = this.f7064b.length;
                int i9 = i8;
                boolean z9 = false;
                while (i8 < length) {
                    Object[] objArr = this.f7064b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (!elements.contains(obj2)) {
                        this.f7064b[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i8++;
                }
                v8 = v(i9);
                for (int i10 = 0; i10 < v9; i10++) {
                    Object[] objArr2 = this.f7064b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (!elements.contains(obj3)) {
                        this.f7064b[v8] = obj3;
                        v8 = r(v8);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                this.f7065c = u(v8 - this.f7063a);
            }
        }
        return z8;
    }

    @Override // M5.AbstractC1233f
    public Object removeAt(int i8) {
        AbstractC1230c.Companion.b(i8, size());
        if (i8 == AbstractC1246t.o(this)) {
            return y();
        }
        if (i8 == 0) {
            return w();
        }
        int v8 = v(this.f7063a + i8);
        Object obj = this.f7064b[v8];
        if (i8 < (size() >> 1)) {
            int i9 = this.f7063a;
            if (v8 >= i9) {
                Object[] objArr = this.f7064b;
                AbstractC1239l.i(objArr, objArr, i9 + 1, i9, v8);
            } else {
                Object[] objArr2 = this.f7064b;
                AbstractC1239l.i(objArr2, objArr2, 1, 0, v8);
                Object[] objArr3 = this.f7064b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.f7063a;
                AbstractC1239l.i(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.f7064b;
            int i11 = this.f7063a;
            objArr4[i11] = null;
            this.f7063a = r(i11);
        } else {
            int v9 = v(this.f7063a + AbstractC1246t.o(this));
            if (v8 <= v9) {
                Object[] objArr5 = this.f7064b;
                AbstractC1239l.i(objArr5, objArr5, v8, v8 + 1, v9 + 1);
            } else {
                Object[] objArr6 = this.f7064b;
                AbstractC1239l.i(objArr6, objArr6, v8, v8 + 1, objArr6.length);
                Object[] objArr7 = this.f7064b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC1239l.i(objArr7, objArr7, 0, 1, v9 + 1);
            }
            this.f7064b[v9] = null;
        }
        this.f7065c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int v8;
        AbstractC3159y.i(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f7064b.length != 0) {
            int v9 = v(this.f7063a + size());
            int i8 = this.f7063a;
            if (i8 < v9) {
                v8 = i8;
                while (i8 < v9) {
                    Object obj = this.f7064b[i8];
                    if (elements.contains(obj)) {
                        this.f7064b[v8] = obj;
                        v8++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                AbstractC1239l.t(this.f7064b, null, v8, v9);
            } else {
                int length = this.f7064b.length;
                int i9 = i8;
                boolean z9 = false;
                while (i8 < length) {
                    Object[] objArr = this.f7064b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (elements.contains(obj2)) {
                        this.f7064b[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i8++;
                }
                v8 = v(i9);
                for (int i10 = 0; i10 < v9; i10++) {
                    Object[] objArr2 = this.f7064b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.f7064b[v8] = obj3;
                        v8 = r(v8);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                this.f7065c = u(v8 - this.f7063a);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        AbstractC1230c.Companion.b(i8, size());
        int v8 = v(this.f7063a + i8);
        Object[] objArr = this.f7064b;
        Object obj2 = objArr[v8];
        objArr[v8] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            return null;
        }
        return this.f7064b[v(this.f7063a + AbstractC1246t.o(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC3159y.i(array, "array");
        if (array.length < size()) {
            array = AbstractC1240m.a(array, size());
        }
        int v8 = v(this.f7063a + size());
        int i8 = this.f7063a;
        if (i8 < v8) {
            AbstractC1239l.n(this.f7064b, array, 0, i8, v8, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f7064b;
            AbstractC1239l.i(objArr, array, 0, this.f7063a, objArr.length);
            Object[] objArr2 = this.f7064b;
            AbstractC1239l.i(objArr2, array, objArr2.length - this.f7063a, 0, v8);
        }
        return AbstractC1246t.f(size(), array);
    }

    public final Object w() {
        if (!isEmpty()) {
            Object[] objArr = this.f7064b;
            int i8 = this.f7063a;
            Object obj = objArr[i8];
            objArr[i8] = null;
            this.f7063a = r(i8);
            this.f7065c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object x() {
        if (isEmpty()) {
            return null;
        }
        return w();
    }

    public final Object y() {
        if (!isEmpty()) {
            int v8 = v(this.f7063a + AbstractC1246t.o(this));
            Object[] objArr = this.f7064b;
            Object obj = objArr[v8];
            objArr[v8] = null;
            this.f7065c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        AbstractC1230c.Companion.c(i8, size());
        if (i8 == size()) {
            g(obj);
            return;
        }
        if (i8 == 0) {
            a(obj);
            return;
        }
        p(size() + 1);
        int v8 = v(this.f7063a + i8);
        if (i8 < ((size() + 1) >> 1)) {
            int m8 = m(v8);
            int m9 = m(this.f7063a);
            int i9 = this.f7063a;
            if (m8 >= i9) {
                Object[] objArr = this.f7064b;
                objArr[m9] = objArr[i9];
                AbstractC1239l.i(objArr, objArr, i9, i9 + 1, m8 + 1);
            } else {
                Object[] objArr2 = this.f7064b;
                AbstractC1239l.i(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.f7064b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC1239l.i(objArr3, objArr3, 0, 1, m8 + 1);
            }
            this.f7064b[m8] = obj;
            this.f7063a = m9;
        } else {
            int v9 = v(this.f7063a + size());
            if (v8 < v9) {
                Object[] objArr4 = this.f7064b;
                AbstractC1239l.i(objArr4, objArr4, v8 + 1, v8, v9);
            } else {
                Object[] objArr5 = this.f7064b;
                AbstractC1239l.i(objArr5, objArr5, 1, 0, v9);
                Object[] objArr6 = this.f7064b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC1239l.i(objArr6, objArr6, v8 + 1, v8, objArr6.length - 1);
            }
            this.f7064b[v8] = obj;
        }
        this.f7065c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection elements) {
        AbstractC3159y.i(elements, "elements");
        AbstractC1230c.Companion.c(i8, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i8 == size()) {
            return addAll(elements);
        }
        p(size() + elements.size());
        int v8 = v(this.f7063a + size());
        int v9 = v(this.f7063a + i8);
        int size = elements.size();
        if (i8 < ((size() + 1) >> 1)) {
            int i9 = this.f7063a;
            int i10 = i9 - size;
            if (v9 < i9) {
                Object[] objArr = this.f7064b;
                AbstractC1239l.i(objArr, objArr, i10, i9, objArr.length);
                if (size >= v9) {
                    Object[] objArr2 = this.f7064b;
                    AbstractC1239l.i(objArr2, objArr2, objArr2.length - size, 0, v9);
                } else {
                    Object[] objArr3 = this.f7064b;
                    AbstractC1239l.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f7064b;
                    AbstractC1239l.i(objArr4, objArr4, 0, size, v9);
                }
            } else if (i10 >= 0) {
                Object[] objArr5 = this.f7064b;
                AbstractC1239l.i(objArr5, objArr5, i10, i9, v9);
            } else {
                Object[] objArr6 = this.f7064b;
                i10 += objArr6.length;
                int i11 = v9 - i9;
                int length = objArr6.length - i10;
                if (length >= i11) {
                    AbstractC1239l.i(objArr6, objArr6, i10, i9, v9);
                } else {
                    AbstractC1239l.i(objArr6, objArr6, i10, i9, i9 + length);
                    Object[] objArr7 = this.f7064b;
                    AbstractC1239l.i(objArr7, objArr7, 0, this.f7063a + length, v9);
                }
            }
            this.f7063a = i10;
            h(u(v9 - size), elements);
        } else {
            int i12 = v9 + size;
            if (v9 < v8) {
                int i13 = size + v8;
                Object[] objArr8 = this.f7064b;
                if (i13 <= objArr8.length) {
                    AbstractC1239l.i(objArr8, objArr8, i12, v9, v8);
                } else if (i12 >= objArr8.length) {
                    AbstractC1239l.i(objArr8, objArr8, i12 - objArr8.length, v9, v8);
                } else {
                    int length2 = v8 - (i13 - objArr8.length);
                    AbstractC1239l.i(objArr8, objArr8, 0, length2, v8);
                    Object[] objArr9 = this.f7064b;
                    AbstractC1239l.i(objArr9, objArr9, i12, v9, length2);
                }
            } else {
                Object[] objArr10 = this.f7064b;
                AbstractC1239l.i(objArr10, objArr10, size, 0, v8);
                Object[] objArr11 = this.f7064b;
                if (i12 >= objArr11.length) {
                    AbstractC1239l.i(objArr11, objArr11, i12 - objArr11.length, v9, objArr11.length);
                } else {
                    AbstractC1239l.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f7064b;
                    AbstractC1239l.i(objArr12, objArr12, i12, v9, objArr12.length - size);
                }
            }
            h(v9, elements);
        }
        return true;
    }

    public C1238k() {
        this.f7064b = f7062e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
