package o;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i {

    /* renamed from: o, reason: collision with root package name */
    private static int f8166o = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8167a;

    /* renamed from: b, reason: collision with root package name */
    private String f8168b;

    /* renamed from: f, reason: collision with root package name */
    public float f8172f;

    /* renamed from: j, reason: collision with root package name */
    a f8176j;

    /* renamed from: c, reason: collision with root package name */
    public int f8169c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f8170d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f8171e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8173g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f8174h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f8175i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    b[] f8177k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    int f8178l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f8179m = 0;

    /* renamed from: n, reason: collision with root package name */
    HashSet f8180n = null;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f8176j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        f8166o++;
    }

    public final void a(b bVar) {
        int i6 = 0;
        while (true) {
            int i7 = this.f8178l;
            if (i6 >= i7) {
                b[] bVarArr = this.f8177k;
                if (i7 >= bVarArr.length) {
                    this.f8177k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f8177k;
                int i8 = this.f8178l;
                bVarArr2[i8] = bVar;
                this.f8178l = i8 + 1;
                return;
            }
            if (this.f8177k[i6] == bVar) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final void c(b bVar) {
        int i6 = this.f8178l;
        int i7 = 0;
        while (i7 < i6) {
            if (this.f8177k[i7] == bVar) {
                while (i7 < i6 - 1) {
                    b[] bVarArr = this.f8177k;
                    int i8 = i7 + 1;
                    bVarArr[i7] = bVarArr[i8];
                    i7 = i8;
                }
                this.f8178l--;
                return;
            }
            i7++;
        }
    }

    public void d() {
        this.f8168b = null;
        this.f8176j = a.UNKNOWN;
        this.f8171e = 0;
        this.f8169c = -1;
        this.f8170d = -1;
        this.f8172f = 0.0f;
        this.f8173g = false;
        int i6 = this.f8178l;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f8177k[i7] = null;
        }
        this.f8178l = 0;
        this.f8179m = 0;
        this.f8167a = false;
        Arrays.fill(this.f8175i, 0.0f);
    }

    public void e(d dVar, float f6) {
        this.f8172f = f6;
        this.f8173g = true;
        int i6 = this.f8178l;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f8177k[i7].B(dVar, this, false);
        }
        this.f8178l = 0;
    }

    public void f(a aVar, String str) {
        this.f8176j = aVar;
    }

    public final void g(b bVar) {
        int i6 = this.f8178l;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f8177k[i7].C(bVar, false);
        }
        this.f8178l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f8168b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f8168b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f8169c);
        }
        return sb.toString();
    }
}
