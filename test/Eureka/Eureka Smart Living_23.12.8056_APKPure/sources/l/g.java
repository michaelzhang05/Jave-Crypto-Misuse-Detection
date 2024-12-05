package l;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    static Object[] f7257d;

    /* renamed from: e, reason: collision with root package name */
    static int f7258e;

    /* renamed from: f, reason: collision with root package name */
    static Object[] f7259f;

    /* renamed from: g, reason: collision with root package name */
    static int f7260g;

    /* renamed from: a, reason: collision with root package name */
    int[] f7261a;

    /* renamed from: b, reason: collision with root package name */
    Object[] f7262b;

    /* renamed from: c, reason: collision with root package name */
    int f7263c;

    public g() {
        this.f7261a = c.f7226a;
        this.f7262b = c.f7228c;
        this.f7263c = 0;
    }

    private void a(int i6) {
        if (i6 == 8) {
            synchronized (g.class) {
                Object[] objArr = f7259f;
                if (objArr != null) {
                    this.f7262b = objArr;
                    f7259f = (Object[]) objArr[0];
                    this.f7261a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7260g--;
                    return;
                }
            }
        } else if (i6 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f7257d;
                if (objArr2 != null) {
                    this.f7262b = objArr2;
                    f7257d = (Object[]) objArr2[0];
                    this.f7261a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f7258e--;
                    return;
                }
            }
        }
        this.f7261a = new int[i6];
        this.f7262b = new Object[i6 << 1];
    }

    private static int b(int[] iArr, int i6, int i7) {
        try {
            return c.a(iArr, i6, i7);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i6) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f7260g < 10) {
                    objArr[0] = f7259f;
                    objArr[1] = iArr;
                    for (int i7 = (i6 << 1) - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f7259f = objArr;
                    f7260g++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (g.class) {
                if (f7258e < 10) {
                    objArr[0] = f7257d;
                    objArr[1] = iArr;
                    for (int i8 = (i6 << 1) - 1; i8 >= 2; i8--) {
                        objArr[i8] = null;
                    }
                    f7257d = objArr;
                    f7258e++;
                }
            }
        }
    }

    public void c(int i6) {
        int i7 = this.f7263c;
        int[] iArr = this.f7261a;
        if (iArr.length < i6) {
            Object[] objArr = this.f7262b;
            a(i6);
            if (this.f7263c > 0) {
                System.arraycopy(iArr, 0, this.f7261a, 0, i7);
                System.arraycopy(objArr, 0, this.f7262b, 0, i7 << 1);
            }
            d(iArr, objArr, i7);
        }
        if (this.f7263c != i7) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i6 = this.f7263c;
        if (i6 > 0) {
            int[] iArr = this.f7261a;
            Object[] objArr = this.f7262b;
            this.f7261a = c.f7226a;
            this.f7262b = c.f7228c;
            this.f7263c = 0;
            d(iArr, objArr, i6);
        }
        if (this.f7263c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i6) {
        int i7 = this.f7263c;
        if (i7 == 0) {
            return -1;
        }
        int b6 = b(this.f7261a, i7, i6);
        if (b6 < 0 || obj.equals(this.f7262b[b6 << 1])) {
            return b6;
        }
        int i8 = b6 + 1;
        while (i8 < i7 && this.f7261a[i8] == i6) {
            if (obj.equals(this.f7262b[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = b6 - 1; i9 >= 0 && this.f7261a[i9] == i6; i9--) {
            if (obj.equals(this.f7262b[i9 << 1])) {
                return i9;
            }
        }
        return ~i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.f7263c; i6++) {
                try {
                    Object i7 = i(i6);
                    Object m6 = m(i6);
                    Object obj2 = gVar.get(i7);
                    if (m6 == null) {
                        if (obj2 != null || !gVar.containsKey(i7)) {
                            return false;
                        }
                    } else if (!m6.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f7263c; i8++) {
                try {
                    Object i9 = i(i8);
                    Object m7 = m(i8);
                    Object obj3 = map.get(i9);
                    if (m7 == null) {
                        if (obj3 != null || !map.containsKey(i9)) {
                            return false;
                        }
                    } else if (!m7.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i6 = this.f7263c;
        if (i6 == 0) {
            return -1;
        }
        int b6 = b(this.f7261a, i6, 0);
        if (b6 < 0 || this.f7262b[b6 << 1] == null) {
            return b6;
        }
        int i7 = b6 + 1;
        while (i7 < i6 && this.f7261a[i7] == 0) {
            if (this.f7262b[i7 << 1] == null) {
                return i7;
            }
            i7++;
        }
        for (int i8 = b6 - 1; i8 >= 0 && this.f7261a[i8] == 0; i8--) {
            if (this.f7262b[i8 << 1] == null) {
                return i8;
            }
        }
        return ~i7;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f6 = f(obj);
        return f6 >= 0 ? this.f7262b[(f6 << 1) + 1] : obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(Object obj) {
        int i6 = this.f7263c * 2;
        Object[] objArr = this.f7262b;
        if (obj == null) {
            for (int i7 = 1; i7 < i6; i7 += 2) {
                if (objArr[i7] == null) {
                    return i7 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i6; i8 += 2) {
            if (obj.equals(objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f7261a;
        Object[] objArr = this.f7262b;
        int i6 = this.f7263c;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            Object obj = objArr[i7];
            i9 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i8];
            i8++;
            i7 += 2;
        }
        return i9;
    }

    public Object i(int i6) {
        return this.f7262b[i6 << 1];
    }

    public boolean isEmpty() {
        return this.f7263c <= 0;
    }

    public void j(g gVar) {
        int i6 = gVar.f7263c;
        c(this.f7263c + i6);
        if (this.f7263c != 0) {
            for (int i7 = 0; i7 < i6; i7++) {
                put(gVar.i(i7), gVar.m(i7));
            }
        } else if (i6 > 0) {
            System.arraycopy(gVar.f7261a, 0, this.f7261a, 0, i6);
            System.arraycopy(gVar.f7262b, 0, this.f7262b, 0, i6 << 1);
            this.f7263c = i6;
        }
    }

    public Object k(int i6) {
        Object[] objArr = this.f7262b;
        int i7 = i6 << 1;
        Object obj = objArr[i7 + 1];
        int i8 = this.f7263c;
        int i9 = 0;
        if (i8 <= 1) {
            d(this.f7261a, objArr, i8);
            this.f7261a = c.f7226a;
            this.f7262b = c.f7228c;
        } else {
            int i10 = i8 - 1;
            int[] iArr = this.f7261a;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i6 < i10) {
                    int i11 = i6 + 1;
                    int i12 = i10 - i6;
                    System.arraycopy(iArr, i11, iArr, i6, i12);
                    Object[] objArr2 = this.f7262b;
                    System.arraycopy(objArr2, i11 << 1, objArr2, i7, i12 << 1);
                }
                Object[] objArr3 = this.f7262b;
                int i13 = i10 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                a(i8 > 8 ? i8 + (i8 >> 1) : 8);
                if (i8 != this.f7263c) {
                    throw new ConcurrentModificationException();
                }
                if (i6 > 0) {
                    System.arraycopy(iArr, 0, this.f7261a, 0, i6);
                    System.arraycopy(objArr, 0, this.f7262b, 0, i7);
                }
                if (i6 < i10) {
                    int i14 = i6 + 1;
                    int i15 = i10 - i6;
                    System.arraycopy(iArr, i14, this.f7261a, i6, i15);
                    System.arraycopy(objArr, i14 << 1, this.f7262b, i7, i15 << 1);
                }
            }
            i9 = i10;
        }
        if (i8 != this.f7263c) {
            throw new ConcurrentModificationException();
        }
        this.f7263c = i9;
        return obj;
    }

    public Object l(int i6, Object obj) {
        int i7 = (i6 << 1) + 1;
        Object[] objArr = this.f7262b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public Object m(int i6) {
        return this.f7262b[(i6 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i6;
        int e6;
        int i7 = this.f7263c;
        if (obj == null) {
            e6 = g();
            i6 = 0;
        } else {
            int hashCode = obj.hashCode();
            i6 = hashCode;
            e6 = e(obj, hashCode);
        }
        if (e6 >= 0) {
            int i8 = (e6 << 1) + 1;
            Object[] objArr = this.f7262b;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~e6;
        int[] iArr = this.f7261a;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            Object[] objArr2 = this.f7262b;
            a(i10);
            if (i7 != this.f7263c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f7261a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f7262b, 0, objArr2.length);
            }
            d(iArr, objArr2, i7);
        }
        if (i9 < i7) {
            int[] iArr3 = this.f7261a;
            int i11 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i11, i7 - i9);
            Object[] objArr3 = this.f7262b;
            System.arraycopy(objArr3, i9 << 1, objArr3, i11 << 1, (this.f7263c - i9) << 1);
        }
        int i12 = this.f7263c;
        if (i7 == i12) {
            int[] iArr4 = this.f7261a;
            if (i9 < iArr4.length) {
                iArr4[i9] = i6;
                Object[] objArr4 = this.f7262b;
                int i13 = i9 << 1;
                objArr4[i13] = obj;
                objArr4[i13 + 1] = obj2;
                this.f7263c = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f6 = f(obj);
        if (f6 >= 0) {
            return k(f6);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f6 = f(obj);
        if (f6 >= 0) {
            return l(f6, obj2);
        }
        return null;
    }

    public int size() {
        return this.f7263c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7263c * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f7263c; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object i7 = i(i6);
            if (i7 != this) {
                sb.append(i7);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m6 = m(i6);
            if (m6 != this) {
                sb.append(m6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public g(int i6) {
        if (i6 == 0) {
            this.f7261a = c.f7226a;
            this.f7262b = c.f7228c;
        } else {
            a(i6);
        }
        this.f7263c = 0;
    }

    public boolean remove(Object obj, Object obj2) {
        int f6 = f(obj);
        if (f6 < 0) {
            return false;
        }
        Object m6 = m(f6);
        if (obj2 != m6 && (obj2 == null || !obj2.equals(m6))) {
            return false;
        }
        k(f6);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f6 = f(obj);
        if (f6 < 0) {
            return false;
        }
        Object m6 = m(f6);
        if (m6 != obj2 && (obj2 == null || !obj2.equals(m6))) {
            return false;
        }
        l(f6, obj3);
        return true;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }
}
