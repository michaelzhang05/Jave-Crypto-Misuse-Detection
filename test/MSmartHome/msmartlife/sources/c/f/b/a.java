package c.f.b;

import c.f.b.b;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a implements b.a {
    private static float a = 0.001f;

    /* renamed from: c, reason: collision with root package name */
    private final b f2442c;

    /* renamed from: d, reason: collision with root package name */
    protected final c f2443d;

    /* renamed from: b, reason: collision with root package name */
    int f2441b = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f2444e = 8;

    /* renamed from: f, reason: collision with root package name */
    private i f2445f = null;

    /* renamed from: g, reason: collision with root package name */
    private int[] f2446g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private int[] f2447h = new int[8];

    /* renamed from: i, reason: collision with root package name */
    private float[] f2448i = new float[8];

    /* renamed from: j, reason: collision with root package name */
    private int f2449j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f2450k = -1;
    private boolean l = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f2442c = bVar;
        this.f2443d = cVar;
    }

    @Override // c.f.b.b.a
    public int a() {
        return this.f2441b;
    }

    @Override // c.f.b.b.a
    public i b(int i2) {
        int i3 = this.f2449j;
        for (int i4 = 0; i3 != -1 && i4 < this.f2441b; i4++) {
            if (i4 == i2) {
                return this.f2443d.f2458d[this.f2446g[i3]];
            }
            i3 = this.f2447h[i3];
        }
        return null;
    }

    @Override // c.f.b.b.a
    public void c() {
        int i2 = this.f2449j;
        for (int i3 = 0; i2 != -1 && i3 < this.f2441b; i3++) {
            float[] fArr = this.f2448i;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2447h[i2];
        }
    }

    @Override // c.f.b.b.a
    public final void clear() {
        int i2 = this.f2449j;
        for (int i3 = 0; i2 != -1 && i3 < this.f2441b; i3++) {
            i iVar = this.f2443d.f2458d[this.f2446g[i2]];
            if (iVar != null) {
                iVar.c(this.f2442c);
            }
            i2 = this.f2447h[i2];
        }
        this.f2449j = -1;
        this.f2450k = -1;
        this.l = false;
        this.f2441b = 0;
    }

    @Override // c.f.b.b.a
    public float d(int i2) {
        int i3 = this.f2449j;
        for (int i4 = 0; i3 != -1 && i4 < this.f2441b; i4++) {
            if (i4 == i2) {
                return this.f2448i[i3];
            }
            i3 = this.f2447h[i3];
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public void e(i iVar, float f2, boolean z) {
        float f3 = a;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f2449j;
            if (i2 == -1) {
                this.f2449j = 0;
                this.f2448i[0] = f2;
                this.f2446g[0] = iVar.f2482d;
                this.f2447h[0] = -1;
                iVar.n++;
                iVar.a(this.f2442c);
                this.f2441b++;
                if (this.l) {
                    return;
                }
                int i3 = this.f2450k + 1;
                this.f2450k = i3;
                int[] iArr = this.f2446g;
                if (i3 >= iArr.length) {
                    this.l = true;
                    this.f2450k = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f2441b; i5++) {
                int[] iArr2 = this.f2446g;
                int i6 = iArr2[i2];
                int i7 = iVar.f2482d;
                if (i6 == i7) {
                    float[] fArr = this.f2448i;
                    float f4 = fArr[i2] + f2;
                    float f5 = a;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f2449j) {
                            this.f2449j = this.f2447h[i2];
                        } else {
                            int[] iArr3 = this.f2447h;
                            iArr3[i4] = iArr3[i2];
                        }
                        if (z) {
                            iVar.c(this.f2442c);
                        }
                        if (this.l) {
                            this.f2450k = i2;
                        }
                        iVar.n--;
                        this.f2441b--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i4 = i2;
                }
                i2 = this.f2447h[i2];
            }
            int i8 = this.f2450k;
            int i9 = i8 + 1;
            if (this.l) {
                int[] iArr4 = this.f2446g;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f2446g;
            if (i8 >= iArr5.length && this.f2441b < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f2446g;
                    if (i10 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            int[] iArr7 = this.f2446g;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f2444e * 2;
                this.f2444e = i11;
                this.l = false;
                this.f2450k = i8 - 1;
                this.f2448i = Arrays.copyOf(this.f2448i, i11);
                this.f2446g = Arrays.copyOf(this.f2446g, this.f2444e);
                this.f2447h = Arrays.copyOf(this.f2447h, this.f2444e);
            }
            this.f2446g[i8] = iVar.f2482d;
            this.f2448i[i8] = f2;
            if (i4 != -1) {
                int[] iArr8 = this.f2447h;
                iArr8[i8] = iArr8[i4];
                iArr8[i4] = i8;
            } else {
                this.f2447h[i8] = this.f2449j;
                this.f2449j = i8;
            }
            iVar.n++;
            iVar.a(this.f2442c);
            this.f2441b++;
            if (!this.l) {
                this.f2450k++;
            }
            int i12 = this.f2450k;
            int[] iArr9 = this.f2446g;
            if (i12 >= iArr9.length) {
                this.l = true;
                this.f2450k = iArr9.length - 1;
            }
        }
    }

    @Override // c.f.b.b.a
    public final float f(i iVar) {
        int i2 = this.f2449j;
        for (int i3 = 0; i2 != -1 && i3 < this.f2441b; i3++) {
            if (this.f2446g[i2] == iVar.f2482d) {
                return this.f2448i[i2];
            }
            i2 = this.f2447h[i2];
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public boolean g(i iVar) {
        int i2 = this.f2449j;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f2441b; i3++) {
            if (this.f2446g[i2] == iVar.f2482d) {
                return true;
            }
            i2 = this.f2447h[i2];
        }
        return false;
    }

    @Override // c.f.b.b.a
    public float h(b bVar, boolean z) {
        float f2 = f(bVar.a);
        j(bVar.a, z);
        b.a aVar = bVar.f2454e;
        int a2 = aVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            i b2 = aVar.b(i2);
            e(b2, aVar.f(b2) * f2, z);
        }
        return f2;
    }

    @Override // c.f.b.b.a
    public final void i(i iVar, float f2) {
        if (f2 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i2 = this.f2449j;
        if (i2 == -1) {
            this.f2449j = 0;
            this.f2448i[0] = f2;
            this.f2446g[0] = iVar.f2482d;
            this.f2447h[0] = -1;
            iVar.n++;
            iVar.a(this.f2442c);
            this.f2441b++;
            if (this.l) {
                return;
            }
            int i3 = this.f2450k + 1;
            this.f2450k = i3;
            int[] iArr = this.f2446g;
            if (i3 >= iArr.length) {
                this.l = true;
                this.f2450k = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f2441b; i5++) {
            int[] iArr2 = this.f2446g;
            int i6 = iArr2[i2];
            int i7 = iVar.f2482d;
            if (i6 == i7) {
                this.f2448i[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f2447h[i2];
        }
        int i8 = this.f2450k;
        int i9 = i8 + 1;
        if (this.l) {
            int[] iArr3 = this.f2446g;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f2446g;
        if (i8 >= iArr4.length && this.f2441b < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f2446g;
                if (i10 >= iArr5.length) {
                    break;
                }
                if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                }
                i10++;
            }
        }
        int[] iArr6 = this.f2446g;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f2444e * 2;
            this.f2444e = i11;
            this.l = false;
            this.f2450k = i8 - 1;
            this.f2448i = Arrays.copyOf(this.f2448i, i11);
            this.f2446g = Arrays.copyOf(this.f2446g, this.f2444e);
            this.f2447h = Arrays.copyOf(this.f2447h, this.f2444e);
        }
        this.f2446g[i8] = iVar.f2482d;
        this.f2448i[i8] = f2;
        if (i4 != -1) {
            int[] iArr7 = this.f2447h;
            iArr7[i8] = iArr7[i4];
            iArr7[i4] = i8;
        } else {
            this.f2447h[i8] = this.f2449j;
            this.f2449j = i8;
        }
        iVar.n++;
        iVar.a(this.f2442c);
        int i12 = this.f2441b + 1;
        this.f2441b = i12;
        if (!this.l) {
            this.f2450k++;
        }
        int[] iArr8 = this.f2446g;
        if (i12 >= iArr8.length) {
            this.l = true;
        }
        if (this.f2450k >= iArr8.length) {
            this.l = true;
            this.f2450k = iArr8.length - 1;
        }
    }

    @Override // c.f.b.b.a
    public final float j(i iVar, boolean z) {
        if (this.f2445f == iVar) {
            this.f2445f = null;
        }
        int i2 = this.f2449j;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f2441b) {
            if (this.f2446g[i2] == iVar.f2482d) {
                if (i2 == this.f2449j) {
                    this.f2449j = this.f2447h[i2];
                } else {
                    int[] iArr = this.f2447h;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    iVar.c(this.f2442c);
                }
                iVar.n--;
                this.f2441b--;
                this.f2446g[i2] = -1;
                if (this.l) {
                    this.f2450k = i2;
                }
                return this.f2448i[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f2447h[i2];
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public void k(float f2) {
        int i2 = this.f2449j;
        for (int i3 = 0; i2 != -1 && i3 < this.f2441b; i3++) {
            float[] fArr = this.f2448i;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2447h[i2];
        }
    }

    public String toString() {
        int i2 = this.f2449j;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (int i3 = 0; i2 != -1 && i3 < this.f2441b; i3++) {
            str = ((str + " -> ") + this.f2448i[i2] + " : ") + this.f2443d.f2458d[this.f2446g[i2]];
            i2 = this.f2447h[i2];
        }
        return str;
    }
}
