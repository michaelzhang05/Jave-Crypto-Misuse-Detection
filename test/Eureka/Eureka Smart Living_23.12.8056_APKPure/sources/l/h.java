package l;

/* loaded from: classes.dex */
public class h implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f7264e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private boolean f7265a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f7266b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f7267c;

    /* renamed from: d, reason: collision with root package name */
    private int f7268d;

    public h() {
        this(10);
    }

    private void d() {
        int i6 = this.f7268d;
        int[] iArr = this.f7266b;
        Object[] objArr = this.f7267c;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            if (obj != f7264e) {
                if (i8 != i7) {
                    iArr[i7] = iArr[i8];
                    objArr[i7] = obj;
                    objArr[i8] = null;
                }
                i7++;
            }
        }
        this.f7265a = false;
        this.f7268d = i7;
    }

    public void a(int i6, Object obj) {
        int i7 = this.f7268d;
        if (i7 != 0 && i6 <= this.f7266b[i7 - 1]) {
            j(i6, obj);
            return;
        }
        if (this.f7265a && i7 >= this.f7266b.length) {
            d();
        }
        int i8 = this.f7268d;
        if (i8 >= this.f7266b.length) {
            int e6 = c.e(i8 + 1);
            int[] iArr = new int[e6];
            Object[] objArr = new Object[e6];
            int[] iArr2 = this.f7266b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f7267c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f7266b = iArr;
            this.f7267c = objArr;
        }
        this.f7266b[i8] = i6;
        this.f7267c[i8] = obj;
        this.f7268d = i8 + 1;
    }

    public void b() {
        int i6 = this.f7268d;
        Object[] objArr = this.f7267c;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        this.f7268d = 0;
        this.f7265a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f7266b = (int[]) this.f7266b.clone();
            hVar.f7267c = (Object[]) this.f7267c.clone();
            return hVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public Object e(int i6) {
        return f(i6, null);
    }

    public Object f(int i6, Object obj) {
        Object obj2;
        int a6 = c.a(this.f7266b, this.f7268d, i6);
        return (a6 < 0 || (obj2 = this.f7267c[a6]) == f7264e) ? obj : obj2;
    }

    public int h(Object obj) {
        if (this.f7265a) {
            d();
        }
        for (int i6 = 0; i6 < this.f7268d; i6++) {
            if (this.f7267c[i6] == obj) {
                return i6;
            }
        }
        return -1;
    }

    public int i(int i6) {
        if (this.f7265a) {
            d();
        }
        return this.f7266b[i6];
    }

    public void j(int i6, Object obj) {
        int a6 = c.a(this.f7266b, this.f7268d, i6);
        if (a6 >= 0) {
            this.f7267c[a6] = obj;
            return;
        }
        int i7 = ~a6;
        int i8 = this.f7268d;
        if (i7 < i8) {
            Object[] objArr = this.f7267c;
            if (objArr[i7] == f7264e) {
                this.f7266b[i7] = i6;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f7265a && i8 >= this.f7266b.length) {
            d();
            i7 = ~c.a(this.f7266b, this.f7268d, i6);
        }
        int i9 = this.f7268d;
        if (i9 >= this.f7266b.length) {
            int e6 = c.e(i9 + 1);
            int[] iArr = new int[e6];
            Object[] objArr2 = new Object[e6];
            int[] iArr2 = this.f7266b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f7267c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f7266b = iArr;
            this.f7267c = objArr2;
        }
        int i10 = this.f7268d;
        if (i10 - i7 != 0) {
            int[] iArr3 = this.f7266b;
            int i11 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i11, i10 - i7);
            Object[] objArr4 = this.f7267c;
            System.arraycopy(objArr4, i7, objArr4, i11, this.f7268d - i7);
        }
        this.f7266b[i7] = i6;
        this.f7267c[i7] = obj;
        this.f7268d++;
    }

    public int k() {
        if (this.f7265a) {
            d();
        }
        return this.f7268d;
    }

    public Object l(int i6) {
        if (this.f7265a) {
            d();
        }
        return this.f7267c[i6];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7268d * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f7268d; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(i(i6));
            sb.append('=');
            Object l6 = l(i6);
            if (l6 != this) {
                sb.append(l6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i6) {
        this.f7265a = false;
        if (i6 == 0) {
            this.f7266b = c.f7226a;
            this.f7267c = c.f7228c;
        } else {
            int e6 = c.e(i6);
            this.f7266b = new int[e6];
            this.f7267c = new Object[e6];
        }
    }
}
