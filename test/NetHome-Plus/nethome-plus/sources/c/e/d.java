package c.e;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f2402f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private boolean f2403g;

    /* renamed from: h, reason: collision with root package name */
    private long[] f2404h;

    /* renamed from: i, reason: collision with root package name */
    private Object[] f2405i;

    /* renamed from: j, reason: collision with root package name */
    private int f2406j;

    public d() {
        this(10);
    }

    private void e() {
        int i2 = this.f2406j;
        long[] jArr = this.f2404h;
        Object[] objArr = this.f2405i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2402f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2403g = false;
        this.f2406j = i3;
    }

    public void b(long j2, E e2) {
        int i2 = this.f2406j;
        if (i2 != 0 && j2 <= this.f2404h[i2 - 1]) {
            k(j2, e2);
            return;
        }
        if (this.f2403g && i2 >= this.f2404h.length) {
            e();
        }
        int i3 = this.f2406j;
        if (i3 >= this.f2404h.length) {
            int f2 = c.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr = new Object[f2];
            long[] jArr2 = this.f2404h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2405i;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2404h = jArr;
            this.f2405i = objArr;
        }
        this.f2404h[i3] = j2;
        this.f2405i[i3] = e2;
        this.f2406j = i3 + 1;
    }

    public void c() {
        int i2 = this.f2406j;
        Object[] objArr = this.f2405i;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2406j = 0;
        this.f2403g = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f2404h = (long[]) this.f2404h.clone();
            dVar.f2405i = (Object[]) this.f2405i.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E g(long j2) {
        return h(j2, null);
    }

    public E h(long j2, E e2) {
        int b2 = c.b(this.f2404h, this.f2406j, j2);
        if (b2 >= 0) {
            Object[] objArr = this.f2405i;
            if (objArr[b2] != f2402f) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public int i(long j2) {
        if (this.f2403g) {
            e();
        }
        return c.b(this.f2404h, this.f2406j, j2);
    }

    public long j(int i2) {
        if (this.f2403g) {
            e();
        }
        return this.f2404h[i2];
    }

    public void k(long j2, E e2) {
        int b2 = c.b(this.f2404h, this.f2406j, j2);
        if (b2 >= 0) {
            this.f2405i[b2] = e2;
            return;
        }
        int i2 = b2 ^ (-1);
        int i3 = this.f2406j;
        if (i2 < i3) {
            Object[] objArr = this.f2405i;
            if (objArr[i2] == f2402f) {
                this.f2404h[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f2403g && i3 >= this.f2404h.length) {
            e();
            i2 = c.b(this.f2404h, this.f2406j, j2) ^ (-1);
        }
        int i4 = this.f2406j;
        if (i4 >= this.f2404h.length) {
            int f2 = c.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f2404h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2405i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2404h = jArr;
            this.f2405i = objArr2;
        }
        int i5 = this.f2406j;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f2404h;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2405i;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2406j - i2);
        }
        this.f2404h[i2] = j2;
        this.f2405i[i2] = e2;
        this.f2406j++;
    }

    public void l(long j2) {
        int b2 = c.b(this.f2404h, this.f2406j, j2);
        if (b2 >= 0) {
            Object[] objArr = this.f2405i;
            Object obj = objArr[b2];
            Object obj2 = f2402f;
            if (obj != obj2) {
                objArr[b2] = obj2;
                this.f2403g = true;
            }
        }
    }

    public void m(int i2) {
        Object[] objArr = this.f2405i;
        Object obj = objArr[i2];
        Object obj2 = f2402f;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f2403g = true;
        }
    }

    public int n() {
        if (this.f2403g) {
            e();
        }
        return this.f2406j;
    }

    public E p(int i2) {
        if (this.f2403g) {
            e();
        }
        return (E) this.f2405i[i2];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2406j * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2406j; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(j(i2));
            sb.append('=');
            E p = p(i2);
            if (p != this) {
                sb.append(p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i2) {
        this.f2403g = false;
        if (i2 == 0) {
            this.f2404h = c.f2400b;
            this.f2405i = c.f2401c;
        } else {
            int f2 = c.f(i2);
            this.f2404h = new long[f2];
            this.f2405i = new Object[f2];
        }
    }
}
