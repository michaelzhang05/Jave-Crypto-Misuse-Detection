package o;

import java.util.Arrays;
import java.util.Comparator;
import o.b;

/* loaded from: classes.dex */
public class h extends o.b {

    /* renamed from: g, reason: collision with root package name */
    private int f8156g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f8157h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f8158i;

    /* renamed from: j, reason: collision with root package name */
    private int f8159j;

    /* renamed from: k, reason: collision with root package name */
    b f8160k;

    /* renamed from: l, reason: collision with root package name */
    c f8161l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f8169c - iVar2.f8169c;
        }
    }

    /* loaded from: classes.dex */
    class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        i f8163a;

        /* renamed from: b, reason: collision with root package name */
        h f8164b;

        public b(h hVar) {
            this.f8164b = hVar;
        }

        public boolean a(i iVar, float f6) {
            boolean z5 = true;
            if (!this.f8163a.f8167a) {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f7 = iVar.f8175i[i6];
                    if (f7 != 0.0f) {
                        float f8 = f7 * f6;
                        if (Math.abs(f8) < 1.0E-4f) {
                            f8 = 0.0f;
                        }
                        this.f8163a.f8175i[i6] = f8;
                    } else {
                        this.f8163a.f8175i[i6] = 0.0f;
                    }
                }
                return true;
            }
            for (int i7 = 0; i7 < 9; i7++) {
                float[] fArr = this.f8163a.f8175i;
                float f9 = fArr[i7] + (iVar.f8175i[i7] * f6);
                fArr[i7] = f9;
                if (Math.abs(f9) < 1.0E-4f) {
                    this.f8163a.f8175i[i7] = 0.0f;
                } else {
                    z5 = false;
                }
            }
            if (z5) {
                h.this.G(this.f8163a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f8163a = iVar;
        }

        public final boolean c() {
            for (int i6 = 8; i6 >= 0; i6--) {
                float f6 = this.f8163a.f8175i[i6];
                if (f6 > 0.0f) {
                    return false;
                }
                if (f6 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f8163a.f8169c - ((i) obj).f8169c;
        }

        public final boolean d(i iVar) {
            int i6 = 8;
            while (true) {
                if (i6 < 0) {
                    break;
                }
                float f6 = iVar.f8175i[i6];
                float f7 = this.f8163a.f8175i[i6];
                if (f7 == f6) {
                    i6--;
                } else if (f7 < f6) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f8163a.f8175i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f8163a != null) {
                for (int i6 = 0; i6 < 9; i6++) {
                    str = str + this.f8163a.f8175i[i6] + " ";
                }
            }
            return str + "] " + this.f8163a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f8156g = 128;
        this.f8157h = new i[128];
        this.f8158i = new i[128];
        this.f8159j = 0;
        this.f8160k = new b(this);
        this.f8161l = cVar;
    }

    private final void F(i iVar) {
        int i6;
        int i7 = this.f8159j + 1;
        i[] iVarArr = this.f8157h;
        if (i7 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f8157h = iVarArr2;
            this.f8158i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f8157h;
        int i8 = this.f8159j;
        iVarArr3[i8] = iVar;
        int i9 = i8 + 1;
        this.f8159j = i9;
        if (i9 > 1 && iVarArr3[i9 - 1].f8169c > iVar.f8169c) {
            int i10 = 0;
            while (true) {
                i6 = this.f8159j;
                if (i10 >= i6) {
                    break;
                }
                this.f8158i[i10] = this.f8157h[i10];
                i10++;
            }
            Arrays.sort(this.f8158i, 0, i6, new a());
            for (int i11 = 0; i11 < this.f8159j; i11++) {
                this.f8157h[i11] = this.f8158i[i11];
            }
        }
        iVar.f8167a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i6 = 0;
        while (i6 < this.f8159j) {
            if (this.f8157h[i6] == iVar) {
                while (true) {
                    int i7 = this.f8159j;
                    if (i6 >= i7 - 1) {
                        this.f8159j = i7 - 1;
                        iVar.f8167a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f8157h;
                        int i8 = i6 + 1;
                        iVarArr[i6] = iVarArr[i8];
                        i6 = i8;
                    }
                }
            } else {
                i6++;
            }
        }
    }

    @Override // o.b
    public void C(o.b bVar, boolean z5) {
        i iVar = bVar.f8123a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f8127e;
        int k6 = aVar.k();
        for (int i6 = 0; i6 < k6; i6++) {
            i g6 = aVar.g(i6);
            float a6 = aVar.a(i6);
            this.f8160k.b(g6);
            if (this.f8160k.a(iVar, a6)) {
                F(g6);
            }
            this.f8124b += bVar.f8124b * a6;
        }
        G(iVar);
    }

    @Override // o.b, o.d.a
    public void a(i iVar) {
        this.f8160k.b(iVar);
        this.f8160k.e();
        iVar.f8175i[iVar.f8171e] = 1.0f;
        F(iVar);
    }

    @Override // o.b, o.d.a
    public i b(d dVar, boolean[] zArr) {
        int i6 = -1;
        for (int i7 = 0; i7 < this.f8159j; i7++) {
            i iVar = this.f8157h[i7];
            if (!zArr[iVar.f8169c]) {
                this.f8160k.b(iVar);
                b bVar = this.f8160k;
                if (i6 == -1) {
                    if (!bVar.c()) {
                    }
                    i6 = i7;
                } else {
                    if (!bVar.d(this.f8157h[i6])) {
                    }
                    i6 = i7;
                }
            }
        }
        if (i6 == -1) {
            return null;
        }
        return this.f8157h[i6];
    }

    @Override // o.b, o.d.a
    public void clear() {
        this.f8159j = 0;
        this.f8124b = 0.0f;
    }

    @Override // o.b
    public String toString() {
        String str = " goal -> (" + this.f8124b + ") : ";
        for (int i6 = 0; i6 < this.f8159j; i6++) {
            this.f8160k.b(this.f8157h[i6]);
            str = str + this.f8160k + " ";
        }
        return str;
    }
}
