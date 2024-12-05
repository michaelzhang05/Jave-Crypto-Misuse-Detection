package c.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: f, reason: collision with root package name */
    static Object[] f2428f;

    /* renamed from: g, reason: collision with root package name */
    static int f2429g;

    /* renamed from: h, reason: collision with root package name */
    static Object[] f2430h;

    /* renamed from: i, reason: collision with root package name */
    static int f2431i;

    /* renamed from: j, reason: collision with root package name */
    int[] f2432j;

    /* renamed from: k, reason: collision with root package name */
    Object[] f2433k;
    int l;

    public g() {
        this.f2432j = c.a;
        this.f2433k = c.f2401c;
        this.l = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (g.class) {
                Object[] objArr = f2430h;
                if (objArr != null) {
                    this.f2433k = objArr;
                    f2430h = (Object[]) objArr[0];
                    this.f2432j = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2431i--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f2428f;
                if (objArr2 != null) {
                    this.f2433k = objArr2;
                    f2428f = (Object[]) objArr2[0];
                    this.f2432j = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2429g--;
                    return;
                }
            }
        }
        this.f2432j = new int[i2];
        this.f2433k = new Object[i2 << 1];
    }

    private static int b(int[] iArr, int i2, int i3) {
        try {
            return c.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f2431i < 10) {
                    objArr[0] = f2430h;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2430h = objArr;
                    f2431i++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (g.class) {
                if (f2429g < 10) {
                    objArr[0] = f2428f;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2428f = objArr;
                    f2429g++;
                }
            }
        }
    }

    public void c(int i2) {
        int i3 = this.l;
        int[] iArr = this.f2432j;
        if (iArr.length < i2) {
            Object[] objArr = this.f2433k;
            a(i2);
            if (this.l > 0) {
                System.arraycopy(iArr, 0, this.f2432j, 0, i3);
                System.arraycopy(objArr, 0, this.f2433k, 0, i3 << 1);
            }
            d(iArr, objArr, i3);
        }
        if (this.l != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.l;
        if (i2 > 0) {
            int[] iArr = this.f2432j;
            Object[] objArr = this.f2433k;
            this.f2432j = c.a;
            this.f2433k = c.f2401c;
            this.l = 0;
            d(iArr, objArr, i2);
        }
        if (this.l > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i2) {
        int i3 = this.l;
        if (i3 == 0) {
            return -1;
        }
        int b2 = b(this.f2432j, i3, i2);
        if (b2 < 0 || obj.equals(this.f2433k[b2 << 1])) {
            return b2;
        }
        int i4 = b2 + 1;
        while (i4 < i3 && this.f2432j[i4] == i2) {
            if (obj.equals(this.f2433k[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = b2 - 1; i5 >= 0 && this.f2432j[i5] == i2; i5--) {
            if (obj.equals(this.f2433k[i5 << 1])) {
                return i5;
            }
        }
        return i4 ^ (-1);
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
            for (int i2 = 0; i2 < this.l; i2++) {
                try {
                    K i3 = i(i2);
                    V m = m(i2);
                    Object obj2 = gVar.get(i3);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i3)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
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
            for (int i4 = 0; i4 < this.l; i4++) {
                try {
                    K i5 = i(i4);
                    V m2 = m(i4);
                    Object obj3 = map.get(i5);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i5)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
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
        int i2 = this.l;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f2432j, i2, 0);
        if (b2 < 0 || this.f2433k[b2 << 1] == null) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f2432j[i3] == 0) {
            if (this.f2433k[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b2 - 1; i4 >= 0 && this.f2432j[i4] == 0; i4--) {
            if (this.f2433k[i4 << 1] == null) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? (V) this.f2433k[(f2 << 1) + 1] : v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(Object obj) {
        int i2 = this.l * 2;
        Object[] objArr = this.f2433k;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f2432j;
        Object[] objArr = this.f2433k;
        int i2 = this.l;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public K i(int i2) {
        return (K) this.f2433k[i2 << 1];
    }

    public boolean isEmpty() {
        return this.l <= 0;
    }

    public void j(g<? extends K, ? extends V> gVar) {
        int i2 = gVar.l;
        c(this.l + i2);
        if (this.l != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(gVar.i(i3), gVar.m(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(gVar.f2432j, 0, this.f2432j, 0, i2);
            System.arraycopy(gVar.f2433k, 0, this.f2433k, 0, i2 << 1);
            this.l = i2;
        }
    }

    public V k(int i2) {
        Object[] objArr = this.f2433k;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.l;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.f2432j, objArr, i4);
            this.f2432j = c.a;
            this.f2433k = c.f2401c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f2432j;
            if (iArr.length > 8 && i4 < iArr.length / 3) {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.l) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2432j, 0, i2);
                    System.arraycopy(objArr, 0, this.f2433k, 0, i3);
                }
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, this.f2432j, i2, i8);
                    System.arraycopy(objArr, i7 << 1, this.f2433k, i3, i8 << 1);
                }
            } else {
                if (i2 < i6) {
                    int i9 = i2 + 1;
                    int i10 = i6 - i2;
                    System.arraycopy(iArr, i9, iArr, i2, i10);
                    Object[] objArr2 = this.f2433k;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i3, i10 << 1);
                }
                Object[] objArr3 = this.f2433k;
                int i11 = i6 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            }
            i5 = i6;
        }
        if (i4 == this.l) {
            this.l = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2433k;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public V m(int i2) {
        return (V) this.f2433k[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int e2;
        int i3 = this.l;
        if (k2 == null) {
            e2 = g();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            e2 = e(k2, hashCode);
        }
        if (e2 >= 0) {
            int i4 = (e2 << 1) + 1;
            Object[] objArr = this.f2433k;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = e2 ^ (-1);
        int[] iArr = this.f2432j;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f2433k;
            a(i6);
            if (i3 == this.l) {
                int[] iArr2 = this.f2432j;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f2433k, 0, objArr2.length);
                }
                d(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2432j;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2433k;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.l - i5) << 1);
        }
        int i8 = this.l;
        if (i3 == i8) {
            int[] iArr4 = this.f2432j;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f2433k;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v;
                this.l = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return k(f2);
        }
        return null;
    }

    public V replace(K k2, V v) {
        int f2 = f(k2);
        if (f2 >= 0) {
            return l(f2, v);
        }
        return null;
    }

    public int size() {
        return this.l;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.l * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.l; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m = m(i2);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        V m = m(f2);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        k(f2);
        return true;
    }

    public boolean replace(K k2, V v, V v2) {
        int f2 = f(k2);
        if (f2 < 0) {
            return false;
        }
        V m = m(f2);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        l(f2, v2);
        return true;
    }

    public g(int i2) {
        if (i2 == 0) {
            this.f2432j = c.a;
            this.f2433k = c.f2401c;
        } else {
            a(i2);
        }
        this.l = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            j(gVar);
        }
    }
}
