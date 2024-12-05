package c.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f2393f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private static final Object[] f2394g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    private static Object[] f2395h;

    /* renamed from: i, reason: collision with root package name */
    private static int f2396i;

    /* renamed from: j, reason: collision with root package name */
    private static Object[] f2397j;

    /* renamed from: k, reason: collision with root package name */
    private static int f2398k;
    private int[] l;
    Object[] m;
    int n;
    private f<E, E> o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArraySet.java */
    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
        }

        @Override // c.e.f
        protected void a() {
            b.this.clear();
        }

        @Override // c.e.f
        protected Object b(int i2, int i3) {
            return b.this.m[i2];
        }

        @Override // c.e.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // c.e.f
        protected int d() {
            return b.this.n;
        }

        @Override // c.e.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // c.e.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // c.e.f
        protected void g(E e2, E e3) {
            b.this.add(e2);
        }

        @Override // c.e.f
        protected void h(int i2) {
            b.this.z(i2);
        }

        @Override // c.e.f
        protected E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f2397j;
                if (objArr != null) {
                    this.m = objArr;
                    f2397j = (Object[]) objArr[0];
                    this.l = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2398k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f2395h;
                if (objArr2 != null) {
                    this.m = objArr2;
                    f2395h = (Object[]) objArr2[0];
                    this.l = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2396i--;
                    return;
                }
            }
        }
        this.l = new int[i2];
        this.m = new Object[i2];
    }

    private static void f(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f2398k < 10) {
                    objArr[0] = f2397j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2397j = objArr;
                    f2398k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f2396i < 10) {
                    objArr[0] = f2395h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2395h = objArr;
                    f2396i++;
                }
            }
        }
    }

    private f<E, E> o() {
        if (this.o == null) {
            this.o = new a();
        }
        return this.o;
    }

    private int w(Object obj, int i2) {
        int i3 = this.n;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.l, i3, i2);
        if (a2 < 0 || obj.equals(this.m[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.l[i4] == i2) {
            if (obj.equals(this.m[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.l[i5] == i2; i5--) {
            if (obj.equals(this.m[i5])) {
                return i5;
            }
        }
        return i4 ^ (-1);
    }

    private int x() {
        int i2 = this.n;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.l, i2, 0);
        if (a2 < 0 || this.m[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.l[i3] == 0) {
            if (this.m[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.l[i4] == 0; i4--) {
            if (this.m[i4] == null) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public E D(int i2) {
        return (E) this.m[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int w;
        if (e2 == null) {
            w = x();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            w = w(e2, hashCode);
        }
        if (w >= 0) {
            return false;
        }
        int i3 = w ^ (-1);
        int i4 = this.n;
        int[] iArr = this.l;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.m;
            a(i5);
            int[] iArr2 = this.l;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.m, 0, objArr.length);
            }
            f(iArr, objArr, this.n);
        }
        int i6 = this.n;
        if (i3 < i6) {
            int[] iArr3 = this.l;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.m;
            System.arraycopy(objArr2, i3, objArr2, i7, this.n - i3);
        }
        this.l[i3] = i2;
        this.m[i3] = e2;
        this.n++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.n + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public void b(int i2) {
        int[] iArr = this.l;
        if (iArr.length < i2) {
            Object[] objArr = this.m;
            a(i2);
            int i3 = this.n;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.l, 0, i3);
                System.arraycopy(objArr, 0, this.m, 0, this.n);
            }
            f(iArr, objArr, this.n);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.n;
        if (i2 != 0) {
            f(this.l, this.m, i2);
            this.l = f2393f;
            this.m = f2394g;
            this.n = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.n; i2++) {
                try {
                    if (!set.contains(D(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.l;
        int i2 = this.n;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? x() : w(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.n <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return o().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        z(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.n - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.m[i2])) {
                z(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.n;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.n;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.m, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.n * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.n; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E D = D(i2);
            if (D != this) {
                sb.append(D);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E z(int i2) {
        Object[] objArr = this.m;
        E e2 = (E) objArr[i2];
        int i3 = this.n;
        if (i3 <= 1) {
            f(this.l, objArr, i3);
            this.l = f2393f;
            this.m = f2394g;
            this.n = 0;
        } else {
            int[] iArr = this.l;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.n--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.l, 0, i2);
                    System.arraycopy(objArr, 0, this.m, 0, i2);
                }
                int i4 = this.n;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, this.l, i2, i4 - i2);
                    System.arraycopy(objArr, i5, this.m, i2, this.n - i2);
                }
            } else {
                int i6 = i3 - 1;
                this.n = i6;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, iArr, i2, i6 - i2);
                    Object[] objArr2 = this.m;
                    System.arraycopy(objArr2, i7, objArr2, i2, this.n - i2);
                }
                this.m[this.n] = null;
            }
        }
        return e2;
    }

    public b(int i2) {
        if (i2 == 0) {
            this.l = f2393f;
            this.m = f2394g;
        } else {
            a(i2);
        }
        this.n = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.n) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.n));
        }
        System.arraycopy(this.m, 0, tArr, 0, this.n);
        int length = tArr.length;
        int i2 = this.n;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
