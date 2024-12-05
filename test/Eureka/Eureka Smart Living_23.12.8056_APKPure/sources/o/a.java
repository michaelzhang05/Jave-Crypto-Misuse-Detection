package o;

import java.util.Arrays;
import o.b;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f8111l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f8113b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f8114c;

    /* renamed from: a, reason: collision with root package name */
    int f8112a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f8115d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f8116e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f8117f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f8118g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f8119h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f8120i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f8121j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8122k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f8113b = bVar;
        this.f8114c = cVar;
    }

    @Override // o.b.a
    public float a(int i6) {
        int i7 = this.f8120i;
        for (int i8 = 0; i7 != -1 && i8 < this.f8112a; i8++) {
            if (i8 == i6) {
                return this.f8119h[i7];
            }
            i7 = this.f8118g[i7];
        }
        return 0.0f;
    }

    @Override // o.b.a
    public void b(i iVar, float f6, boolean z5) {
        float f7 = f8111l;
        if (f6 <= (-f7) || f6 >= f7) {
            int i6 = this.f8120i;
            if (i6 == -1) {
                this.f8120i = 0;
                this.f8119h[0] = f6;
                this.f8117f[0] = iVar.f8169c;
                this.f8118g[0] = -1;
                iVar.f8179m++;
                iVar.a(this.f8113b);
                this.f8112a++;
                if (this.f8122k) {
                    return;
                }
                int i7 = this.f8121j + 1;
                this.f8121j = i7;
                int[] iArr = this.f8117f;
                if (i7 >= iArr.length) {
                    this.f8122k = true;
                    this.f8121j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i8 = -1;
            for (int i9 = 0; i6 != -1 && i9 < this.f8112a; i9++) {
                int i10 = this.f8117f[i6];
                int i11 = iVar.f8169c;
                if (i10 == i11) {
                    float[] fArr = this.f8119h;
                    float f8 = fArr[i6] + f6;
                    float f9 = f8111l;
                    if (f8 > (-f9) && f8 < f9) {
                        f8 = 0.0f;
                    }
                    fArr[i6] = f8;
                    if (f8 == 0.0f) {
                        if (i6 == this.f8120i) {
                            this.f8120i = this.f8118g[i6];
                        } else {
                            int[] iArr2 = this.f8118g;
                            iArr2[i8] = iArr2[i6];
                        }
                        if (z5) {
                            iVar.c(this.f8113b);
                        }
                        if (this.f8122k) {
                            this.f8121j = i6;
                        }
                        iVar.f8179m--;
                        this.f8112a--;
                        return;
                    }
                    return;
                }
                if (i10 < i11) {
                    i8 = i6;
                }
                i6 = this.f8118g[i6];
            }
            int i12 = this.f8121j;
            int i13 = i12 + 1;
            if (this.f8122k) {
                int[] iArr3 = this.f8117f;
                if (iArr3[i12] != -1) {
                    i12 = iArr3.length;
                }
            } else {
                i12 = i13;
            }
            int[] iArr4 = this.f8117f;
            if (i12 >= iArr4.length && this.f8112a < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.f8117f;
                    if (i14 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i14] == -1) {
                        i12 = i14;
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr6 = this.f8117f;
            if (i12 >= iArr6.length) {
                i12 = iArr6.length;
                int i15 = this.f8115d * 2;
                this.f8115d = i15;
                this.f8122k = false;
                this.f8121j = i12 - 1;
                this.f8119h = Arrays.copyOf(this.f8119h, i15);
                this.f8117f = Arrays.copyOf(this.f8117f, this.f8115d);
                this.f8118g = Arrays.copyOf(this.f8118g, this.f8115d);
            }
            this.f8117f[i12] = iVar.f8169c;
            this.f8119h[i12] = f6;
            int[] iArr7 = this.f8118g;
            if (i8 != -1) {
                iArr7[i12] = iArr7[i8];
                iArr7[i8] = i12;
            } else {
                iArr7[i12] = this.f8120i;
                this.f8120i = i12;
            }
            iVar.f8179m++;
            iVar.a(this.f8113b);
            this.f8112a++;
            if (!this.f8122k) {
                this.f8121j++;
            }
            int i16 = this.f8121j;
            int[] iArr8 = this.f8117f;
            if (i16 >= iArr8.length) {
                this.f8122k = true;
                this.f8121j = iArr8.length - 1;
            }
        }
    }

    @Override // o.b.a
    public boolean c(i iVar) {
        int i6 = this.f8120i;
        if (i6 == -1) {
            return false;
        }
        for (int i7 = 0; i6 != -1 && i7 < this.f8112a; i7++) {
            if (this.f8117f[i6] == iVar.f8169c) {
                return true;
            }
            i6 = this.f8118g[i6];
        }
        return false;
    }

    @Override // o.b.a
    public final void clear() {
        int i6 = this.f8120i;
        for (int i7 = 0; i6 != -1 && i7 < this.f8112a; i7++) {
            i iVar = this.f8114c.f8132d[this.f8117f[i6]];
            if (iVar != null) {
                iVar.c(this.f8113b);
            }
            i6 = this.f8118g[i6];
        }
        this.f8120i = -1;
        this.f8121j = -1;
        this.f8122k = false;
        this.f8112a = 0;
    }

    @Override // o.b.a
    public float d(b bVar, boolean z5) {
        float f6 = f(bVar.f8123a);
        i(bVar.f8123a, z5);
        b.a aVar = bVar.f8127e;
        int k6 = aVar.k();
        for (int i6 = 0; i6 < k6; i6++) {
            i g6 = aVar.g(i6);
            b(g6, aVar.f(g6) * f6, z5);
        }
        return f6;
    }

    @Override // o.b.a
    public final void e(i iVar, float f6) {
        if (f6 == 0.0f) {
            i(iVar, true);
            return;
        }
        int i6 = this.f8120i;
        if (i6 == -1) {
            this.f8120i = 0;
            this.f8119h[0] = f6;
            this.f8117f[0] = iVar.f8169c;
            this.f8118g[0] = -1;
            iVar.f8179m++;
            iVar.a(this.f8113b);
            this.f8112a++;
            if (this.f8122k) {
                return;
            }
            int i7 = this.f8121j + 1;
            this.f8121j = i7;
            int[] iArr = this.f8117f;
            if (i7 >= iArr.length) {
                this.f8122k = true;
                this.f8121j = iArr.length - 1;
                return;
            }
            return;
        }
        int i8 = -1;
        for (int i9 = 0; i6 != -1 && i9 < this.f8112a; i9++) {
            int i10 = this.f8117f[i6];
            int i11 = iVar.f8169c;
            if (i10 == i11) {
                this.f8119h[i6] = f6;
                return;
            }
            if (i10 < i11) {
                i8 = i6;
            }
            i6 = this.f8118g[i6];
        }
        int i12 = this.f8121j;
        int i13 = i12 + 1;
        if (this.f8122k) {
            int[] iArr2 = this.f8117f;
            if (iArr2[i12] != -1) {
                i12 = iArr2.length;
            }
        } else {
            i12 = i13;
        }
        int[] iArr3 = this.f8117f;
        if (i12 >= iArr3.length && this.f8112a < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f8117f;
                if (i14 >= iArr4.length) {
                    break;
                }
                if (iArr4[i14] == -1) {
                    i12 = i14;
                    break;
                }
                i14++;
            }
        }
        int[] iArr5 = this.f8117f;
        if (i12 >= iArr5.length) {
            i12 = iArr5.length;
            int i15 = this.f8115d * 2;
            this.f8115d = i15;
            this.f8122k = false;
            this.f8121j = i12 - 1;
            this.f8119h = Arrays.copyOf(this.f8119h, i15);
            this.f8117f = Arrays.copyOf(this.f8117f, this.f8115d);
            this.f8118g = Arrays.copyOf(this.f8118g, this.f8115d);
        }
        this.f8117f[i12] = iVar.f8169c;
        this.f8119h[i12] = f6;
        int[] iArr6 = this.f8118g;
        if (i8 != -1) {
            iArr6[i12] = iArr6[i8];
            iArr6[i8] = i12;
        } else {
            iArr6[i12] = this.f8120i;
            this.f8120i = i12;
        }
        iVar.f8179m++;
        iVar.a(this.f8113b);
        int i16 = this.f8112a + 1;
        this.f8112a = i16;
        if (!this.f8122k) {
            this.f8121j++;
        }
        int[] iArr7 = this.f8117f;
        if (i16 >= iArr7.length) {
            this.f8122k = true;
        }
        if (this.f8121j >= iArr7.length) {
            this.f8122k = true;
            this.f8121j = iArr7.length - 1;
        }
    }

    @Override // o.b.a
    public final float f(i iVar) {
        int i6 = this.f8120i;
        for (int i7 = 0; i6 != -1 && i7 < this.f8112a; i7++) {
            if (this.f8117f[i6] == iVar.f8169c) {
                return this.f8119h[i6];
            }
            i6 = this.f8118g[i6];
        }
        return 0.0f;
    }

    @Override // o.b.a
    public i g(int i6) {
        int i7 = this.f8120i;
        for (int i8 = 0; i7 != -1 && i8 < this.f8112a; i8++) {
            if (i8 == i6) {
                return this.f8114c.f8132d[this.f8117f[i7]];
            }
            i7 = this.f8118g[i7];
        }
        return null;
    }

    @Override // o.b.a
    public void h(float f6) {
        int i6 = this.f8120i;
        for (int i7 = 0; i6 != -1 && i7 < this.f8112a; i7++) {
            float[] fArr = this.f8119h;
            fArr[i6] = fArr[i6] / f6;
            i6 = this.f8118g[i6];
        }
    }

    @Override // o.b.a
    public final float i(i iVar, boolean z5) {
        if (this.f8116e == iVar) {
            this.f8116e = null;
        }
        int i6 = this.f8120i;
        if (i6 == -1) {
            return 0.0f;
        }
        int i7 = 0;
        int i8 = -1;
        while (i6 != -1 && i7 < this.f8112a) {
            if (this.f8117f[i6] == iVar.f8169c) {
                if (i6 == this.f8120i) {
                    this.f8120i = this.f8118g[i6];
                } else {
                    int[] iArr = this.f8118g;
                    iArr[i8] = iArr[i6];
                }
                if (z5) {
                    iVar.c(this.f8113b);
                }
                iVar.f8179m--;
                this.f8112a--;
                this.f8117f[i6] = -1;
                if (this.f8122k) {
                    this.f8121j = i6;
                }
                return this.f8119h[i6];
            }
            i7++;
            i8 = i6;
            i6 = this.f8118g[i6];
        }
        return 0.0f;
    }

    @Override // o.b.a
    public void j() {
        int i6 = this.f8120i;
        for (int i7 = 0; i6 != -1 && i7 < this.f8112a; i7++) {
            float[] fArr = this.f8119h;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.f8118g[i6];
        }
    }

    @Override // o.b.a
    public int k() {
        return this.f8112a;
    }

    public String toString() {
        int i6 = this.f8120i;
        String str = "";
        for (int i7 = 0; i6 != -1 && i7 < this.f8112a; i7++) {
            str = ((str + " -> ") + this.f8119h[i6] + " : ") + this.f8114c.f8132d[this.f8117f[i6]];
            i6 = this.f8118g[i6];
        }
        return str;
    }
}
