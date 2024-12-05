package a5;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f72d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f73e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    private int f74a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f75b = f73e;

    /* renamed from: c, reason: collision with root package name */
    private int f76c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f5.f fVar) {
            this();
        }

        public final int a(int i6, int i7) {
            int i8 = i6 + (i6 >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            return i8 - 2147483639 > 0 ? i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i8;
        }
    }

    private final void l(int i6, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f75b.length;
        while (i6 < length && it.hasNext()) {
            this.f75b[i6] = it.next();
            i6++;
        }
        int i7 = this.f74a;
        for (int i8 = 0; i8 < i7 && it.hasNext(); i8++) {
            this.f75b[i8] = it.next();
        }
        this.f76c = size() + collection.size();
    }

    private final void m(int i6) {
        Object[] objArr = new Object[i6];
        Object[] objArr2 = this.f75b;
        i.c(objArr2, objArr, 0, this.f74a, objArr2.length);
        Object[] objArr3 = this.f75b;
        int length = objArr3.length;
        int i7 = this.f74a;
        i.c(objArr3, objArr, length - i7, 0, i7);
        this.f74a = 0;
        this.f75b = objArr;
    }

    private final int n(int i6) {
        return i6 == 0 ? j.i(this.f75b) : i6 - 1;
    }

    private final void o(int i6) {
        int a6;
        if (i6 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f75b;
        if (i6 <= objArr.length) {
            return;
        }
        if (objArr != f73e) {
            m(f72d.a(objArr.length, i6));
        } else {
            a6 = g5.f.a(i6, 10);
            this.f75b = new Object[a6];
        }
    }

    private final int p(int i6) {
        if (i6 == j.i(this.f75b)) {
            return 0;
        }
        return i6 + 1;
    }

    private final int q(int i6) {
        return i6 < 0 ? i6 + this.f75b.length : i6;
    }

    private final int r(int i6) {
        Object[] objArr = this.f75b;
        return i6 >= objArr.length ? i6 - objArr.length : i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, Object obj) {
        b.f69a.b(i6, size());
        if (i6 == size()) {
            k(obj);
            return;
        }
        if (i6 == 0) {
            j(obj);
            return;
        }
        o(size() + 1);
        int r5 = r(this.f74a + i6);
        if (i6 < ((size() + 1) >> 1)) {
            int n6 = n(r5);
            int n7 = n(this.f74a);
            int i7 = this.f74a;
            if (n6 >= i7) {
                Object[] objArr = this.f75b;
                objArr[n7] = objArr[i7];
                i.c(objArr, objArr, i7, i7 + 1, n6 + 1);
            } else {
                Object[] objArr2 = this.f75b;
                i.c(objArr2, objArr2, i7 - 1, i7, objArr2.length);
                Object[] objArr3 = this.f75b;
                objArr3[objArr3.length - 1] = objArr3[0];
                i.c(objArr3, objArr3, 0, 1, n6 + 1);
            }
            this.f75b[n6] = obj;
            this.f74a = n7;
        } else {
            int r6 = r(this.f74a + size());
            Object[] objArr4 = this.f75b;
            if (r5 < r6) {
                i.c(objArr4, objArr4, r5 + 1, r5, r6);
            } else {
                i.c(objArr4, objArr4, 1, 0, r6);
                Object[] objArr5 = this.f75b;
                objArr5[0] = objArr5[objArr5.length - 1];
                i.c(objArr5, objArr5, r5 + 1, r5, objArr5.length - 1);
            }
            this.f75b[r5] = obj;
        }
        this.f76c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i6, Collection collection) {
        f5.h.e(collection, "elements");
        b.f69a.b(i6, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i6 == size()) {
            return addAll(collection);
        }
        o(size() + collection.size());
        int r5 = r(this.f74a + size());
        int r6 = r(this.f74a + i6);
        int size = collection.size();
        if (i6 < ((size() + 1) >> 1)) {
            int i7 = this.f74a;
            int i8 = i7 - size;
            if (r6 < i7) {
                Object[] objArr = this.f75b;
                i.c(objArr, objArr, i8, i7, objArr.length);
                Object[] objArr2 = this.f75b;
                if (size >= r6) {
                    i.c(objArr2, objArr2, objArr2.length - size, 0, r6);
                } else {
                    i.c(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f75b;
                    i.c(objArr3, objArr3, 0, size, r6);
                }
            } else if (i8 >= 0) {
                Object[] objArr4 = this.f75b;
                i.c(objArr4, objArr4, i8, i7, r6);
            } else {
                Object[] objArr5 = this.f75b;
                i8 += objArr5.length;
                int i9 = r6 - i7;
                int length = objArr5.length - i8;
                if (length >= i9) {
                    i.c(objArr5, objArr5, i8, i7, r6);
                } else {
                    i.c(objArr5, objArr5, i8, i7, i7 + length);
                    Object[] objArr6 = this.f75b;
                    i.c(objArr6, objArr6, 0, this.f74a + length, r6);
                }
            }
            this.f74a = i8;
            l(q(r6 - size), collection);
        } else {
            int i10 = r6 + size;
            if (r6 < r5) {
                int i11 = size + r5;
                Object[] objArr7 = this.f75b;
                if (i11 > objArr7.length) {
                    if (i10 >= objArr7.length) {
                        i10 -= objArr7.length;
                    } else {
                        int length2 = r5 - (i11 - objArr7.length);
                        i.c(objArr7, objArr7, 0, length2, r5);
                        Object[] objArr8 = this.f75b;
                        i.c(objArr8, objArr8, i10, r6, length2);
                    }
                }
                i.c(objArr7, objArr7, i10, r6, r5);
            } else {
                Object[] objArr9 = this.f75b;
                i.c(objArr9, objArr9, size, 0, r5);
                Object[] objArr10 = this.f75b;
                if (i10 >= objArr10.length) {
                    i.c(objArr10, objArr10, i10 - objArr10.length, r6, objArr10.length);
                } else {
                    i.c(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f75b;
                    i.c(objArr11, objArr11, i10, r6, objArr11.length - size);
                }
            }
            l(r6, collection);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int r5 = r(this.f74a + size());
        int i6 = this.f74a;
        if (i6 < r5) {
            i.e(this.f75b, null, i6, r5);
        } else if (!isEmpty()) {
            Object[] objArr = this.f75b;
            i.e(objArr, null, this.f74a, objArr.length);
            i.e(this.f75b, null, 0, r5);
        }
        this.f74a = 0;
        this.f76c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i6) {
        b.f69a.a(i6, size());
        return this.f75b[r(this.f74a + i6)];
    }

    @Override // a5.c
    public int h() {
        return this.f76c;
    }

    @Override // a5.c
    public Object i(int i6) {
        b.f69a.a(i6, size());
        if (i6 == n.e(this)) {
            return t();
        }
        if (i6 == 0) {
            return s();
        }
        int r5 = r(this.f74a + i6);
        Object obj = this.f75b[r5];
        if (i6 < (size() >> 1)) {
            int i7 = this.f74a;
            if (r5 >= i7) {
                Object[] objArr = this.f75b;
                i.c(objArr, objArr, i7 + 1, i7, r5);
            } else {
                Object[] objArr2 = this.f75b;
                i.c(objArr2, objArr2, 1, 0, r5);
                Object[] objArr3 = this.f75b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i8 = this.f74a;
                i.c(objArr3, objArr3, i8 + 1, i8, objArr3.length - 1);
            }
            Object[] objArr4 = this.f75b;
            int i9 = this.f74a;
            objArr4[i9] = null;
            this.f74a = p(i9);
        } else {
            int r6 = r(this.f74a + n.e(this));
            Object[] objArr5 = this.f75b;
            if (r5 <= r6) {
                i.c(objArr5, objArr5, r5, r5 + 1, r6 + 1);
            } else {
                i.c(objArr5, objArr5, r5, r5 + 1, objArr5.length);
                Object[] objArr6 = this.f75b;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.c(objArr6, objArr6, 0, 1, r6 + 1);
            }
            this.f75b[r6] = null;
        }
        this.f76c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int r5 = r(this.f74a + size());
        int i6 = this.f74a;
        if (i6 < r5) {
            while (i6 < r5) {
                if (!f5.h.a(obj, this.f75b[i6])) {
                    i6++;
                }
            }
            return -1;
        }
        if (i6 < r5) {
            return -1;
        }
        int length = this.f75b.length;
        while (true) {
            if (i6 >= length) {
                for (int i7 = 0; i7 < r5; i7++) {
                    if (f5.h.a(obj, this.f75b[i7])) {
                        i6 = i7 + this.f75b.length;
                    }
                }
                return -1;
            }
            if (f5.h.a(obj, this.f75b[i6])) {
                break;
            }
            i6++;
        }
        return i6 - this.f74a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void j(Object obj) {
        o(size() + 1);
        int n6 = n(this.f74a);
        this.f74a = n6;
        this.f75b[n6] = obj;
        this.f76c = size() + 1;
    }

    public final void k(Object obj) {
        o(size() + 1);
        this.f75b[r(this.f74a + size())] = obj;
        this.f76c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int i6;
        int r5 = r(this.f74a + size());
        int i7 = this.f74a;
        if (i7 < r5) {
            i6 = r5 - 1;
            if (i7 <= i6) {
                while (!f5.h.a(obj, this.f75b[i6])) {
                    if (i6 != i7) {
                        i6--;
                    }
                }
                return i6 - this.f74a;
            }
            return -1;
        }
        if (i7 > r5) {
            int i8 = r5 - 1;
            while (true) {
                if (-1 >= i8) {
                    i6 = j.i(this.f75b);
                    int i9 = this.f74a;
                    if (i9 <= i6) {
                        while (!f5.h.a(obj, this.f75b[i6])) {
                            if (i6 != i9) {
                                i6--;
                            }
                        }
                    }
                } else {
                    if (f5.h.a(obj, this.f75b[i8])) {
                        i6 = i8 + this.f75b.length;
                        break;
                    }
                    i8--;
                }
            }
        }
        return -1;
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
    public boolean removeAll(Collection collection) {
        int r5;
        f5.h.e(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty()) {
            if (!(this.f75b.length == 0)) {
                int r6 = r(this.f74a + size());
                int i6 = this.f74a;
                if (i6 < r6) {
                    r5 = i6;
                    while (i6 < r6) {
                        Object obj = this.f75b[i6];
                        if (!collection.contains(obj)) {
                            this.f75b[r5] = obj;
                            r5++;
                        } else {
                            z5 = true;
                        }
                        i6++;
                    }
                    i.e(this.f75b, null, r5, r6);
                } else {
                    int length = this.f75b.length;
                    int i7 = i6;
                    boolean z6 = false;
                    while (i6 < length) {
                        Object[] objArr = this.f75b;
                        Object obj2 = objArr[i6];
                        objArr[i6] = null;
                        if (!collection.contains(obj2)) {
                            this.f75b[i7] = obj2;
                            i7++;
                        } else {
                            z6 = true;
                        }
                        i6++;
                    }
                    r5 = r(i7);
                    for (int i8 = 0; i8 < r6; i8++) {
                        Object[] objArr2 = this.f75b;
                        Object obj3 = objArr2[i8];
                        objArr2[i8] = null;
                        if (!collection.contains(obj3)) {
                            this.f75b[r5] = obj3;
                            r5 = p(r5);
                        } else {
                            z6 = true;
                        }
                    }
                    z5 = z6;
                }
                if (z5) {
                    this.f76c = q(r5 - this.f74a);
                }
            }
        }
        return z5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int r5;
        f5.h.e(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty()) {
            if (!(this.f75b.length == 0)) {
                int r6 = r(this.f74a + size());
                int i6 = this.f74a;
                if (i6 < r6) {
                    r5 = i6;
                    while (i6 < r6) {
                        Object obj = this.f75b[i6];
                        if (collection.contains(obj)) {
                            this.f75b[r5] = obj;
                            r5++;
                        } else {
                            z5 = true;
                        }
                        i6++;
                    }
                    i.e(this.f75b, null, r5, r6);
                } else {
                    int length = this.f75b.length;
                    int i7 = i6;
                    boolean z6 = false;
                    while (i6 < length) {
                        Object[] objArr = this.f75b;
                        Object obj2 = objArr[i6];
                        objArr[i6] = null;
                        if (collection.contains(obj2)) {
                            this.f75b[i7] = obj2;
                            i7++;
                        } else {
                            z6 = true;
                        }
                        i6++;
                    }
                    r5 = r(i7);
                    for (int i8 = 0; i8 < r6; i8++) {
                        Object[] objArr2 = this.f75b;
                        Object obj3 = objArr2[i8];
                        objArr2[i8] = null;
                        if (collection.contains(obj3)) {
                            this.f75b[r5] = obj3;
                            r5 = p(r5);
                        } else {
                            z6 = true;
                        }
                    }
                    z5 = z6;
                }
                if (z5) {
                    this.f76c = q(r5 - this.f74a);
                }
            }
        }
        return z5;
    }

    public final Object s() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f75b;
        int i6 = this.f74a;
        Object obj = objArr[i6];
        objArr[i6] = null;
        this.f74a = p(i6);
        this.f76c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i6, Object obj) {
        b.f69a.a(i6, size());
        int r5 = r(this.f74a + i6);
        Object[] objArr = this.f75b;
        Object obj2 = objArr[r5];
        objArr[r5] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int r5 = r(this.f74a + n.e(this));
        Object[] objArr = this.f75b;
        Object obj = objArr[r5];
        objArr[r5] = null;
        this.f76c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        k(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        f5.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        o(size() + collection.size());
        l(r(this.f74a + size()), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        f5.h.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = g.a(objArr, size());
        }
        int r5 = r(this.f74a + size());
        int i6 = this.f74a;
        if (i6 < r5) {
            i.d(this.f75b, objArr, 0, i6, r5, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f75b;
            i.c(objArr2, objArr, 0, this.f74a, objArr2.length);
            Object[] objArr3 = this.f75b;
            i.c(objArr3, objArr, objArr3.length - this.f74a, 0, r5);
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }
}
