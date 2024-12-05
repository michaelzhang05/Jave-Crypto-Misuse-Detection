package c.f.b;

import c.f.b.b;
import java.util.Arrays;
import java.util.Comparator;
import okhttp3.HttpUrl;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class h extends c.f.b.b {

    /* renamed from: g, reason: collision with root package name */
    private int f2471g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f2472h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f2473i;

    /* renamed from: j, reason: collision with root package name */
    private int f2474j;

    /* renamed from: k, reason: collision with root package name */
    b f2475k;
    c l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f2482d - iVar2.f2482d;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    class b implements Comparable {

        /* renamed from: f, reason: collision with root package name */
        i f2477f;

        /* renamed from: g, reason: collision with root package name */
        h f2478g;

        public b(h hVar) {
            this.f2478g = hVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f2477f.f2482d - ((i) obj).f2482d;
        }

        public boolean d(i iVar, float f2) {
            boolean z = true;
            if (!this.f2477f.f2480b) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float f3 = iVar.f2488j[i2];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f2477f.f2488j[i2] = f4;
                    } else {
                        this.f2477f.f2488j[i2] = 0.0f;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.f2477f.f2488j;
                fArr[i3] = fArr[i3] + (iVar.f2488j[i3] * f2);
                if (Math.abs(fArr[i3]) < 1.0E-4f) {
                    this.f2477f.f2488j[i3] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                h.this.G(this.f2477f);
            }
            return false;
        }

        public void f(i iVar) {
            this.f2477f = iVar;
        }

        public final boolean i() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.f2477f.f2488j[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean n(i iVar) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f2 = iVar.f2488j[i2];
                float f3 = this.f2477f.f2488j[i2];
                if (f3 == f2) {
                    i2--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        public void o() {
            Arrays.fill(this.f2477f.f2488j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f2477f != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f2477f.f2488j[i2] + " ";
                }
            }
            return str + "] " + this.f2477f;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f2471g = 128;
        this.f2472h = new i[128];
        this.f2473i = new i[128];
        this.f2474j = 0;
        this.f2475k = new b(this);
        this.l = cVar;
    }

    private final void F(i iVar) {
        int i2;
        int i3 = this.f2474j + 1;
        i[] iVarArr = this.f2472h;
        if (i3 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f2472h = iVarArr2;
            this.f2473i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f2472h;
        int i4 = this.f2474j;
        iVarArr3[i4] = iVar;
        int i5 = i4 + 1;
        this.f2474j = i5;
        if (i5 > 1 && iVarArr3[i5 - 1].f2482d > iVar.f2482d) {
            int i6 = 0;
            while (true) {
                i2 = this.f2474j;
                if (i6 >= i2) {
                    break;
                }
                this.f2473i[i6] = this.f2472h[i6];
                i6++;
            }
            Arrays.sort(this.f2473i, 0, i2, new a());
            for (int i7 = 0; i7 < this.f2474j; i7++) {
                this.f2472h[i7] = this.f2473i[i7];
            }
        }
        iVar.f2480b = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i2 = 0;
        while (i2 < this.f2474j) {
            if (this.f2472h[i2] == iVar) {
                while (true) {
                    int i3 = this.f2474j;
                    if (i2 < i3 - 1) {
                        i[] iVarArr = this.f2472h;
                        int i4 = i2 + 1;
                        iVarArr[i2] = iVarArr[i4];
                        i2 = i4;
                    } else {
                        this.f2474j = i3 - 1;
                        iVar.f2480b = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // c.f.b.b
    public void B(d dVar, c.f.b.b bVar, boolean z) {
        i iVar = bVar.a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f2454e;
        int a2 = aVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            i b2 = aVar.b(i2);
            float d2 = aVar.d(i2);
            this.f2475k.f(b2);
            if (this.f2475k.d(iVar, d2)) {
                F(b2);
            }
            this.f2451b += bVar.f2451b * d2;
        }
        G(iVar);
    }

    @Override // c.f.b.b, c.f.b.d.a
    public void a(i iVar) {
        this.f2475k.f(iVar);
        this.f2475k.o();
        iVar.f2488j[iVar.f2484f] = 1.0f;
        F(iVar);
    }

    @Override // c.f.b.b, c.f.b.d.a
    public i b(d dVar, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f2474j; i3++) {
            i iVar = this.f2472h[i3];
            if (!zArr[iVar.f2482d]) {
                this.f2475k.f(iVar);
                if (i2 == -1) {
                    if (!this.f2475k.i()) {
                    }
                    i2 = i3;
                } else {
                    if (!this.f2475k.n(this.f2472h[i2])) {
                    }
                    i2 = i3;
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f2472h[i2];
    }

    @Override // c.f.b.b, c.f.b.d.a
    public void clear() {
        this.f2474j = 0;
        this.f2451b = 0.0f;
    }

    @Override // c.f.b.b, c.f.b.d.a
    public boolean isEmpty() {
        return this.f2474j == 0;
    }

    @Override // c.f.b.b
    public String toString() {
        String str = HttpUrl.FRAGMENT_ENCODE_SET + " goal -> (" + this.f2451b + ") : ";
        for (int i2 = 0; i2 < this.f2474j; i2++) {
            this.f2475k.f(this.f2472h[i2]);
            str = str + this.f2475k + " ";
        }
        return str;
    }
}
