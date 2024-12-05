package c.e;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f2434f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private boolean f2435g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f2436h;

    /* renamed from: i, reason: collision with root package name */
    private Object[] f2437i;

    /* renamed from: j, reason: collision with root package name */
    private int f2438j;

    public h() {
        this(10);
    }

    private void e() {
        int i2 = this.f2438j;
        int[] iArr = this.f2436h;
        Object[] objArr = this.f2437i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2434f) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2435g = false;
        this.f2438j = i3;
    }

    public void b(int i2, E e2) {
        int i3 = this.f2438j;
        if (i3 != 0 && i2 <= this.f2436h[i3 - 1]) {
            l(i2, e2);
            return;
        }
        if (this.f2435g && i3 >= this.f2436h.length) {
            e();
        }
        int i4 = this.f2438j;
        if (i4 >= this.f2436h.length) {
            int e3 = c.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f2436h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2437i;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2436h = iArr;
            this.f2437i = objArr;
        }
        this.f2436h[i4] = i2;
        this.f2437i[i4] = e2;
        this.f2438j = i4 + 1;
    }

    public void c() {
        int i2 = this.f2438j;
        Object[] objArr = this.f2437i;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2438j = 0;
        this.f2435g = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f2436h = (int[]) this.f2436h.clone();
            hVar.f2437i = (Object[]) this.f2437i.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E g(int i2) {
        return h(i2, null);
    }

    public E h(int i2, E e2) {
        int a = c.a(this.f2436h, this.f2438j, i2);
        if (a >= 0) {
            Object[] objArr = this.f2437i;
            if (objArr[a] != f2434f) {
                return (E) objArr[a];
            }
        }
        return e2;
    }

    public int i(int i2) {
        if (this.f2435g) {
            e();
        }
        return c.a(this.f2436h, this.f2438j, i2);
    }

    public int j(E e2) {
        if (this.f2435g) {
            e();
        }
        for (int i2 = 0; i2 < this.f2438j; i2++) {
            if (this.f2437i[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public int k(int i2) {
        if (this.f2435g) {
            e();
        }
        return this.f2436h[i2];
    }

    public void l(int i2, E e2) {
        int a = c.a(this.f2436h, this.f2438j, i2);
        if (a >= 0) {
            this.f2437i[a] = e2;
            return;
        }
        int i3 = a ^ (-1);
        int i4 = this.f2438j;
        if (i3 < i4) {
            Object[] objArr = this.f2437i;
            if (objArr[i3] == f2434f) {
                this.f2436h[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f2435g && i4 >= this.f2436h.length) {
            e();
            i3 = c.a(this.f2436h, this.f2438j, i2) ^ (-1);
        }
        int i5 = this.f2438j;
        if (i5 >= this.f2436h.length) {
            int e3 = c.e(i5 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f2436h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2437i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2436h = iArr;
            this.f2437i = objArr2;
        }
        int i6 = this.f2438j;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f2436h;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f2437i;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f2438j - i3);
        }
        this.f2436h[i3] = i2;
        this.f2437i[i3] = e2;
        this.f2438j++;
    }

    public void m(int i2) {
        int a = c.a(this.f2436h, this.f2438j, i2);
        if (a >= 0) {
            Object[] objArr = this.f2437i;
            Object obj = objArr[a];
            Object obj2 = f2434f;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f2435g = true;
            }
        }
    }

    public int n() {
        if (this.f2435g) {
            e();
        }
        return this.f2438j;
    }

    public E o(int i2) {
        if (this.f2435g) {
            e();
        }
        return (E) this.f2437i[i2];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2438j * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2438j; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(k(i2));
            sb.append('=');
            E o = o(i2);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i2) {
        this.f2435g = false;
        if (i2 == 0) {
            this.f2436h = c.a;
            this.f2437i = c.f2401c;
        } else {
            int e2 = c.e(i2);
            this.f2436h = new int[e2];
            this.f2437i = new Object[e2];
        }
    }
}
