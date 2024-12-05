package o;

import java.util.Arrays;
import o.b;
import org.apache.cordova.networkinformation.NetworkManager;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f8187n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f8188a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f8189b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f8190c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f8191d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f8192e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f8193f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f8194g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f8195h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f8196i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f8197j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f8198k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f8199l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f8200m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, c cVar) {
        this.f8199l = bVar;
        this.f8200m = cVar;
        clear();
    }

    private void l(i iVar, int i6) {
        int[] iArr;
        int i7 = iVar.f8169c % this.f8190c;
        int[] iArr2 = this.f8191d;
        int i8 = iArr2[i7];
        if (i8 == -1) {
            iArr2[i7] = i6;
        } else {
            while (true) {
                iArr = this.f8192e;
                int i9 = iArr[i8];
                if (i9 == -1) {
                    break;
                } else {
                    i8 = i9;
                }
            }
            iArr[i8] = i6;
        }
        this.f8192e[i6] = -1;
    }

    private void m(int i6, i iVar, float f6) {
        this.f8193f[i6] = iVar.f8169c;
        this.f8194g[i6] = f6;
        this.f8195h[i6] = -1;
        this.f8196i[i6] = -1;
        iVar.a(this.f8199l);
        iVar.f8179m++;
        this.f8197j++;
    }

    private int n() {
        for (int i6 = 0; i6 < this.f8189b; i6++) {
            if (this.f8193f[i6] == -1) {
                return i6;
            }
        }
        return -1;
    }

    private void o() {
        int i6 = this.f8189b * 2;
        this.f8193f = Arrays.copyOf(this.f8193f, i6);
        this.f8194g = Arrays.copyOf(this.f8194g, i6);
        this.f8195h = Arrays.copyOf(this.f8195h, i6);
        this.f8196i = Arrays.copyOf(this.f8196i, i6);
        this.f8192e = Arrays.copyOf(this.f8192e, i6);
        for (int i7 = this.f8189b; i7 < i6; i7++) {
            this.f8193f[i7] = -1;
            this.f8192e[i7] = -1;
        }
        this.f8189b = i6;
    }

    private void q(int i6, i iVar, float f6) {
        int n6 = n();
        m(n6, iVar, f6);
        if (i6 != -1) {
            this.f8195h[n6] = i6;
            int[] iArr = this.f8196i;
            iArr[n6] = iArr[i6];
            iArr[i6] = n6;
        } else {
            this.f8195h[n6] = -1;
            if (this.f8197j > 0) {
                this.f8196i[n6] = this.f8198k;
                this.f8198k = n6;
            } else {
                this.f8196i[n6] = -1;
            }
        }
        int i7 = this.f8196i[n6];
        if (i7 != -1) {
            this.f8195h[i7] = n6;
        }
        l(iVar, n6);
    }

    private void r(i iVar) {
        int[] iArr;
        int i6;
        int i7 = iVar.f8169c;
        int i8 = i7 % this.f8190c;
        int[] iArr2 = this.f8191d;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            return;
        }
        if (this.f8193f[i9] == i7) {
            int[] iArr3 = this.f8192e;
            iArr2[i8] = iArr3[i9];
            iArr3[i9] = -1;
            return;
        }
        while (true) {
            iArr = this.f8192e;
            i6 = iArr[i9];
            if (i6 == -1 || this.f8193f[i6] == i7) {
                break;
            } else {
                i9 = i6;
            }
        }
        if (i6 == -1 || this.f8193f[i6] != i7) {
            return;
        }
        iArr[i9] = iArr[i6];
        iArr[i6] = -1;
    }

    @Override // o.b.a
    public float a(int i6) {
        int i7 = this.f8197j;
        int i8 = this.f8198k;
        for (int i9 = 0; i9 < i7; i9++) {
            if (i9 == i6) {
                return this.f8194g[i8];
            }
            i8 = this.f8196i[i8];
            if (i8 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // o.b.a
    public void b(i iVar, float f6, boolean z5) {
        float f7 = f8187n;
        if (f6 <= (-f7) || f6 >= f7) {
            int p6 = p(iVar);
            if (p6 == -1) {
                e(iVar, f6);
                return;
            }
            float[] fArr = this.f8194g;
            float f8 = fArr[p6] + f6;
            fArr[p6] = f8;
            float f9 = f8187n;
            if (f8 <= (-f9) || f8 >= f9) {
                return;
            }
            fArr[p6] = 0.0f;
            i(iVar, z5);
        }
    }

    @Override // o.b.a
    public boolean c(i iVar) {
        return p(iVar) != -1;
    }

    @Override // o.b.a
    public void clear() {
        int i6 = this.f8197j;
        for (int i7 = 0; i7 < i6; i7++) {
            i g6 = g(i7);
            if (g6 != null) {
                g6.c(this.f8199l);
            }
        }
        for (int i8 = 0; i8 < this.f8189b; i8++) {
            this.f8193f[i8] = -1;
            this.f8192e[i8] = -1;
        }
        for (int i9 = 0; i9 < this.f8190c; i9++) {
            this.f8191d[i9] = -1;
        }
        this.f8197j = 0;
        this.f8198k = -1;
    }

    @Override // o.b.a
    public float d(b bVar, boolean z5) {
        float f6 = f(bVar.f8123a);
        i(bVar.f8123a, z5);
        j jVar = (j) bVar.f8127e;
        int k6 = jVar.k();
        int i6 = 0;
        int i7 = 0;
        while (i6 < k6) {
            int i8 = jVar.f8193f[i7];
            if (i8 != -1) {
                b(this.f8200m.f8132d[i8], jVar.f8194g[i7] * f6, z5);
                i6++;
            }
            i7++;
        }
        return f6;
    }

    @Override // o.b.a
    public void e(i iVar, float f6) {
        float f7 = f8187n;
        if (f6 > (-f7) && f6 < f7) {
            i(iVar, true);
            return;
        }
        if (this.f8197j == 0) {
            m(0, iVar, f6);
            l(iVar, 0);
            this.f8198k = 0;
            return;
        }
        int p6 = p(iVar);
        if (p6 != -1) {
            this.f8194g[p6] = f6;
            return;
        }
        if (this.f8197j + 1 >= this.f8189b) {
            o();
        }
        int i6 = this.f8197j;
        int i7 = this.f8198k;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.f8193f[i7];
            int i11 = iVar.f8169c;
            if (i10 == i11) {
                this.f8194g[i7] = f6;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.f8196i[i7];
            if (i7 == -1) {
                break;
            }
        }
        q(i8, iVar, f6);
    }

    @Override // o.b.a
    public float f(i iVar) {
        int p6 = p(iVar);
        if (p6 != -1) {
            return this.f8194g[p6];
        }
        return 0.0f;
    }

    @Override // o.b.a
    public i g(int i6) {
        int i7 = this.f8197j;
        if (i7 == 0) {
            return null;
        }
        int i8 = this.f8198k;
        for (int i9 = 0; i9 < i7; i9++) {
            if (i9 == i6 && i8 != -1) {
                return this.f8200m.f8132d[this.f8193f[i8]];
            }
            i8 = this.f8196i[i8];
            if (i8 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // o.b.a
    public void h(float f6) {
        int i6 = this.f8197j;
        int i7 = this.f8198k;
        for (int i8 = 0; i8 < i6; i8++) {
            float[] fArr = this.f8194g;
            fArr[i7] = fArr[i7] / f6;
            i7 = this.f8196i[i7];
            if (i7 == -1) {
                return;
            }
        }
    }

    @Override // o.b.a
    public float i(i iVar, boolean z5) {
        int p6 = p(iVar);
        if (p6 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f6 = this.f8194g[p6];
        if (this.f8198k == p6) {
            this.f8198k = this.f8196i[p6];
        }
        this.f8193f[p6] = -1;
        int[] iArr = this.f8195h;
        int i6 = iArr[p6];
        if (i6 != -1) {
            int[] iArr2 = this.f8196i;
            iArr2[i6] = iArr2[p6];
        }
        int i7 = this.f8196i[p6];
        if (i7 != -1) {
            iArr[i7] = iArr[p6];
        }
        this.f8197j--;
        iVar.f8179m--;
        if (z5) {
            iVar.c(this.f8199l);
        }
        return f6;
    }

    @Override // o.b.a
    public void j() {
        int i6 = this.f8197j;
        int i7 = this.f8198k;
        for (int i8 = 0; i8 < i6; i8++) {
            float[] fArr = this.f8194g;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f8196i[i7];
            if (i7 == -1) {
                return;
            }
        }
    }

    @Override // o.b.a
    public int k() {
        return this.f8197j;
    }

    public int p(i iVar) {
        if (this.f8197j == 0) {
            return -1;
        }
        int i6 = iVar.f8169c;
        int i7 = this.f8191d[i6 % this.f8190c];
        if (i7 == -1) {
            return -1;
        }
        if (this.f8193f[i7] == i6) {
            return i7;
        }
        do {
            i7 = this.f8192e[i7];
            if (i7 == -1) {
                break;
            }
        } while (this.f8193f[i7] != i6);
        if (i7 != -1 && this.f8193f[i7] == i6) {
            return i7;
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i6 = this.f8197j;
        for (int i7 = 0; i7 < i6; i7++) {
            i g6 = g(i7);
            if (g6 != null) {
                String str2 = str + g6 + " = " + a(i7) + " ";
                int p6 = p(g6);
                String str3 = str2 + "[p: ";
                if (this.f8195h[p6] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f8200m.f8132d[this.f8193f[this.f8195h[p6]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(NetworkManager.TYPE_NONE);
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f8196i[p6] != -1 ? str4 + this.f8200m.f8132d[this.f8193f[this.f8196i[p6]]] : str4 + NetworkManager.TYPE_NONE) + "]";
            }
        }
        return str + " }";
    }
}
