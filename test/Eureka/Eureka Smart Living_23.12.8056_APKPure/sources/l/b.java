package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Collection, Set {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f7215e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f7216f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    private static Object[] f7217g;

    /* renamed from: h, reason: collision with root package name */
    private static int f7218h;

    /* renamed from: i, reason: collision with root package name */
    private static Object[] f7219i;

    /* renamed from: j, reason: collision with root package name */
    private static int f7220j;

    /* renamed from: a, reason: collision with root package name */
    private int[] f7221a;

    /* renamed from: b, reason: collision with root package name */
    Object[] f7222b;

    /* renamed from: c, reason: collision with root package name */
    int f7223c;

    /* renamed from: d, reason: collision with root package name */
    private f f7224d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f {
        a() {
        }

        @Override // l.f
        protected void a() {
            b.this.clear();
        }

        @Override // l.f
        protected Object b(int i6, int i7) {
            return b.this.f7222b[i6];
        }

        @Override // l.f
        protected Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // l.f
        protected int d() {
            return b.this.f7223c;
        }

        @Override // l.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // l.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // l.f
        protected void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // l.f
        protected void h(int i6) {
            b.this.n(i6);
        }

        @Override // l.f
        protected Object i(int i6, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void h(int i6) {
        if (i6 == 8) {
            synchronized (b.class) {
                Object[] objArr = f7219i;
                if (objArr != null) {
                    this.f7222b = objArr;
                    f7219i = (Object[]) objArr[0];
                    this.f7221a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7220j--;
                    return;
                }
            }
        } else if (i6 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f7217g;
                if (objArr2 != null) {
                    this.f7222b = objArr2;
                    f7217g = (Object[]) objArr2[0];
                    this.f7221a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f7218h--;
                    return;
                }
            }
        }
        this.f7221a = new int[i6];
        this.f7222b = new Object[i6];
    }

    private static void j(int[] iArr, Object[] objArr, int i6) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f7220j < 10) {
                    objArr[0] = f7219i;
                    objArr[1] = iArr;
                    for (int i7 = i6 - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f7219i = objArr;
                    f7220j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f7218h < 10) {
                    objArr[0] = f7217g;
                    objArr[1] = iArr;
                    for (int i8 = i6 - 1; i8 >= 2; i8--) {
                        objArr[i8] = null;
                    }
                    f7217g = objArr;
                    f7218h++;
                }
            }
        }
    }

    private f k() {
        if (this.f7224d == null) {
            this.f7224d = new a();
        }
        return this.f7224d;
    }

    private int l(Object obj, int i6) {
        int i7 = this.f7223c;
        if (i7 == 0) {
            return -1;
        }
        int a6 = c.a(this.f7221a, i7, i6);
        if (a6 < 0 || obj.equals(this.f7222b[a6])) {
            return a6;
        }
        int i8 = a6 + 1;
        while (i8 < i7 && this.f7221a[i8] == i6) {
            if (obj.equals(this.f7222b[i8])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a6 - 1; i9 >= 0 && this.f7221a[i9] == i6; i9--) {
            if (obj.equals(this.f7222b[i9])) {
                return i9;
            }
        }
        return ~i8;
    }

    private int m() {
        int i6 = this.f7223c;
        if (i6 == 0) {
            return -1;
        }
        int a6 = c.a(this.f7221a, i6, 0);
        if (a6 < 0 || this.f7222b[a6] == null) {
            return a6;
        }
        int i7 = a6 + 1;
        while (i7 < i6 && this.f7221a[i7] == 0) {
            if (this.f7222b[i7] == null) {
                return i7;
            }
            i7++;
        }
        for (int i8 = a6 - 1; i8 >= 0 && this.f7221a[i8] == 0; i8--) {
            if (this.f7222b[i8] == null) {
                return i8;
            }
        }
        return ~i7;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i6;
        int l6;
        if (obj == null) {
            l6 = m();
            i6 = 0;
        } else {
            int hashCode = obj.hashCode();
            i6 = hashCode;
            l6 = l(obj, hashCode);
        }
        if (l6 >= 0) {
            return false;
        }
        int i7 = ~l6;
        int i8 = this.f7223c;
        int[] iArr = this.f7221a;
        if (i8 >= iArr.length) {
            int i9 = 8;
            if (i8 >= 8) {
                i9 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f7222b;
            h(i9);
            int[] iArr2 = this.f7221a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f7222b, 0, objArr.length);
            }
            j(iArr, objArr, this.f7223c);
        }
        int i10 = this.f7223c;
        if (i7 < i10) {
            int[] iArr3 = this.f7221a;
            int i11 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i11, i10 - i7);
            Object[] objArr2 = this.f7222b;
            System.arraycopy(objArr2, i7, objArr2, i11, this.f7223c - i7);
        }
        this.f7221a[i7] = i6;
        this.f7222b[i7] = obj;
        this.f7223c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        i(this.f7223c + collection.size());
        Iterator it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= add(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i6 = this.f7223c;
        if (i6 != 0) {
            j(this.f7221a, this.f7222b, i6);
            this.f7221a = f7215e;
            this.f7222b = f7216f;
            this.f7223c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
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
            for (int i6 = 0; i6 < this.f7223c; i6++) {
                try {
                    if (!set.contains(o(i6))) {
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
        int[] iArr = this.f7221a;
        int i6 = this.f7223c;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += iArr[i8];
        }
        return i7;
    }

    public void i(int i6) {
        int[] iArr = this.f7221a;
        if (iArr.length < i6) {
            Object[] objArr = this.f7222b;
            h(i6);
            int i7 = this.f7223c;
            if (i7 > 0) {
                System.arraycopy(iArr, 0, this.f7221a, 0, i7);
                System.arraycopy(objArr, 0, this.f7222b, 0, this.f7223c);
            }
            j(iArr, objArr, this.f7223c);
        }
    }

    public int indexOf(Object obj) {
        return obj == null ? m() : l(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f7223c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return k().m().iterator();
    }

    public Object n(int i6) {
        Object[] objArr = this.f7222b;
        Object obj = objArr[i6];
        int i7 = this.f7223c;
        if (i7 <= 1) {
            j(this.f7221a, objArr, i7);
            this.f7221a = f7215e;
            this.f7222b = f7216f;
            this.f7223c = 0;
        } else {
            int[] iArr = this.f7221a;
            if (iArr.length <= 8 || i7 >= iArr.length / 3) {
                int i8 = i7 - 1;
                this.f7223c = i8;
                if (i6 < i8) {
                    int i9 = i6 + 1;
                    System.arraycopy(iArr, i9, iArr, i6, i8 - i6);
                    Object[] objArr2 = this.f7222b;
                    System.arraycopy(objArr2, i9, objArr2, i6, this.f7223c - i6);
                }
                this.f7222b[this.f7223c] = null;
            } else {
                h(i7 > 8 ? i7 + (i7 >> 1) : 8);
                this.f7223c--;
                if (i6 > 0) {
                    System.arraycopy(iArr, 0, this.f7221a, 0, i6);
                    System.arraycopy(objArr, 0, this.f7222b, 0, i6);
                }
                int i10 = this.f7223c;
                if (i6 < i10) {
                    int i11 = i6 + 1;
                    System.arraycopy(iArr, i11, this.f7221a, i6, i10 - i6);
                    System.arraycopy(objArr, i11, this.f7222b, i6, this.f7223c - i6);
                }
            }
        }
        return obj;
    }

    public Object o(int i6) {
        return this.f7222b[i6];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        n(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= remove(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z5 = false;
        for (int i6 = this.f7223c - 1; i6 >= 0; i6--) {
            if (!collection.contains(this.f7222b[i6])) {
                n(i6);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f7223c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i6 = this.f7223c;
        Object[] objArr = new Object[i6];
        System.arraycopy(this.f7222b, 0, objArr, 0, i6);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7223c * 14);
        sb.append('{');
        for (int i6 = 0; i6 < this.f7223c; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object o6 = o(i6);
            if (o6 != this) {
                sb.append(o6);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i6) {
        if (i6 == 0) {
            this.f7221a = f7215e;
            this.f7222b = f7216f;
        } else {
            h(i6);
        }
        this.f7223c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f7223c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f7223c);
        }
        System.arraycopy(this.f7222b, 0, objArr, 0, this.f7223c);
        int length = objArr.length;
        int i6 = this.f7223c;
        if (length > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
