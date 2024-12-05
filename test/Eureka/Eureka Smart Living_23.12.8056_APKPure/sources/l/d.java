package l;

/* loaded from: classes.dex */
public class d implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f7229e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private boolean f7230a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f7231b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f7232c;

    /* renamed from: d, reason: collision with root package name */
    private int f7233d;

    public d() {
        this(10);
    }

    private void d() {
        int i6 = this.f7233d;
        long[] jArr = this.f7231b;
        Object[] objArr = this.f7232c;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            if (obj != f7229e) {
                if (i8 != i7) {
                    jArr[i7] = jArr[i8];
                    objArr[i7] = obj;
                    objArr[i8] = null;
                }
                i7++;
            }
        }
        this.f7230a = false;
        this.f7233d = i7;
    }

    public void a(long j6, Object obj) {
        int i6 = this.f7233d;
        if (i6 != 0 && j6 <= this.f7231b[i6 - 1]) {
            j(j6, obj);
            return;
        }
        if (this.f7230a && i6 >= this.f7231b.length) {
            d();
        }
        int i7 = this.f7233d;
        if (i7 >= this.f7231b.length) {
            int f6 = c.f(i7 + 1);
            long[] jArr = new long[f6];
            Object[] objArr = new Object[f6];
            long[] jArr2 = this.f7231b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f7232c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f7231b = jArr;
            this.f7232c = objArr;
        }
        this.f7231b[i7] = j6;
        this.f7232c[i7] = obj;
        this.f7233d = i7 + 1;
    }

    public void b() {
        int i6 = this.f7233d;
        Object[] objArr = this.f7232c;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        this.f7233d = 0;
        this.f7230a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f7231b = (long[]) this.f7231b.clone();
            dVar.f7232c = (Object[]) this.f7232c.clone();
            return dVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public Object e(long j6) {
        return f(j6, null);
    }

    public Object f(long j6, Object obj) {
        Object obj2;
        int b6 = c.b(this.f7231b, this.f7233d, j6);
        return (b6 < 0 || (obj2 = this.f7232c[b6]) == f7229e) ? obj : obj2;
    }

    public int h(long j6) {
        if (this.f7230a) {
            d();
        }
        return c.b(this.f7231b, this.f7233d, j6);
    }

    public long i(int i6) {
        if (this.f7230a) {
            d();
        }
        return this.f7231b[i6];
    }

    public void j(long j6, Object obj) {
        int b6 = c.b(this.f7231b, this.f7233d, j6);
        if (b6 >= 0) {
            this.f7232c[b6] = obj;
            return;
        }
        int i6 = ~b6;
        int i7 = this.f7233d;
        if (i6 < i7) {
            Object[] objArr = this.f7232c;
            if (objArr[i6] == f7229e) {
                this.f7231b[i6] = j6;
                objArr[i6] = obj;
                return;
            }
        }
        if (this.f7230a && i7 >= this.f7231b.length) {
            d();
            i6 = ~c.b(this.f7231b, this.f7233d, j6);
        }
        int i8 = this.f7233d;
        if (i8 >= this.f7231b.length) {
            int f6 = c.f(i8 + 1);
            long[] jArr = new long[f6];
            Object[] objArr2 = new Object[f6];
            long[] jArr2 = this.f7231b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f7232c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f7231b = jArr;
            this.f7232c = objArr2;
        }
        int i9 = this.f7233d;
        if (i9 - i6 != 0) {
            long[] jArr3 = this.f7231b;
            int i10 = i6 + 1;
            System.arraycopy(jArr3, i6, jArr3, i10, i9 - i6);
            Object[] objArr4 = this.f7232c;
            System.arraycopy(objArr4, i6, objArr4, i10, this.f7233d - i6);
        }
        this.f7231b[i6] = j6;
        this.f7232c[i6] = obj;
        this.f7233d++;
    }

    public void k(long j6) {
        int b6 = c.b(this.f7231b, this.f7233d, j6);
        if (b6 >= 0) {
            Object[] objArr = this.f7232c;
            Object obj = objArr[b6];
            Object obj2 = f7229e;
            if (obj != obj2) {
                objArr[b6] = obj2;
                this.f7230a = true;
            }
        }
    }

    public void l(int i6) {
        Object[] objArr = this.f7232c;
        Object obj = objArr[i6];
        Object obj2 = f7229e;
        if (obj != obj2) {
            objArr[i6] = obj2;
            this.f7230a = true;
        }
    }

    public int m() {
        if (this.f7230a) {
            d();
        }
        return this.f7233d;
    }

    public Object n(int i6) {
        if (this.f7230a) {
            d();
        }
        return this.f7232c[i6];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7233d * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f7233d; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(i(i6));
            sb.append('=');
            Object n6 = n(i6);
            if (n6 != this) {
                sb.append(n6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i6) {
        this.f7230a = false;
        if (i6 == 0) {
            this.f7231b = c.f7227b;
            this.f7232c = c.f7228c;
        } else {
            int f6 = c.f(i6);
            this.f7231b = new long[f6];
            this.f7232c = new Object[f6];
        }
    }
}
