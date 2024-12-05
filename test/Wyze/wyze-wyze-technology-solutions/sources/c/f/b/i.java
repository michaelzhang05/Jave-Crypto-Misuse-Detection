package c.f.b;

import java.util.Arrays;
import java.util.HashSet;
import okhttp3.HttpUrl;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class i {
    private static int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2480b;

    /* renamed from: c, reason: collision with root package name */
    private String f2481c;

    /* renamed from: g, reason: collision with root package name */
    public float f2485g;

    /* renamed from: k, reason: collision with root package name */
    a f2489k;

    /* renamed from: d, reason: collision with root package name */
    public int f2482d = -1;

    /* renamed from: e, reason: collision with root package name */
    int f2483e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2484f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2486h = false;

    /* renamed from: i, reason: collision with root package name */
    float[] f2487i = new float[9];

    /* renamed from: j, reason: collision with root package name */
    float[] f2488j = new float[9];
    b[] l = new b[16];
    int m = 0;
    public int n = 0;
    boolean o = false;
    int p = -1;
    float q = 0.0f;
    HashSet<b> r = null;

    /* compiled from: SolverVariable.java */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f2489k = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        a++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.m;
            if (i2 < i3) {
                if (this.l[i2] == bVar) {
                    return;
                } else {
                    i2++;
                }
            } else {
                b[] bVarArr = this.l;
                if (i3 >= bVarArr.length) {
                    this.l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.l;
                int i4 = this.m;
                bVarArr2[i4] = bVar;
                this.m = i4 + 1;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.m;
        int i3 = 0;
        while (i3 < i2) {
            if (this.l[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.l;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.m--;
                return;
            }
            i3++;
        }
    }

    public void d() {
        this.f2481c = null;
        this.f2489k = a.UNKNOWN;
        this.f2484f = 0;
        this.f2482d = -1;
        this.f2483e = -1;
        this.f2485g = 0.0f;
        this.f2486h = false;
        this.o = false;
        this.p = -1;
        this.q = 0.0f;
        int i2 = this.m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.l[i3] = null;
        }
        this.m = 0;
        this.n = 0;
        this.f2480b = false;
        Arrays.fill(this.f2488j, 0.0f);
    }

    public void e(d dVar, float f2) {
        this.f2485g = f2;
        this.f2486h = true;
        this.o = false;
        this.p = -1;
        this.q = 0.0f;
        int i2 = this.m;
        this.f2483e = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.l[i3].A(dVar, this, false);
        }
        this.m = 0;
    }

    public void f(a aVar, String str) {
        this.f2489k = aVar;
    }

    public final void g(d dVar, b bVar) {
        int i2 = this.m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.l[i3].B(dVar, bVar, false);
        }
        this.m = 0;
    }

    public String toString() {
        if (this.f2481c != null) {
            return HttpUrl.FRAGMENT_ENCODE_SET + this.f2481c;
        }
        return HttpUrl.FRAGMENT_ENCODE_SET + this.f2482d;
    }
}
