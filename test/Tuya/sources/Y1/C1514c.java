package Y1;

/* renamed from: Y1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1514c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12811a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f12812b;

    /* renamed from: c, reason: collision with root package name */
    C1514c f12813c;

    /* renamed from: Y1.c$a */
    /* loaded from: classes4.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f12814a;

        /* renamed from: b, reason: collision with root package name */
        private C1514c[] f12815b = new C1514c[6];

        private void a(C1514c c1514c) {
            int i8 = this.f12814a;
            C1514c[] c1514cArr = this.f12815b;
            if (i8 >= c1514cArr.length) {
                C1514c[] c1514cArr2 = new C1514c[c1514cArr.length + 6];
                System.arraycopy(c1514cArr, 0, c1514cArr2, 0, i8);
                this.f12815b = c1514cArr2;
            }
            C1514c[] c1514cArr3 = this.f12815b;
            int i9 = this.f12814a;
            this.f12814a = i9 + 1;
            c1514cArr3[i9] = c1514c;
        }

        private boolean c(C1514c c1514c) {
            for (int i8 = 0; i8 < this.f12814a; i8++) {
                if (this.f12815b[i8].f12811a.equals(c1514c.f12811a)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(C1514c c1514c) {
            while (c1514c != null) {
                if (!c(c1514c)) {
                    a(c1514c);
                }
                c1514c = c1514c.f12813c;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1514c[] d() {
            int i8 = this.f12814a;
            C1514c[] c1514cArr = new C1514c[i8];
            System.arraycopy(this.f12815b, 0, c1514cArr, 0, i8);
            return c1514cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C1514c(String str) {
        this.f12811a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(C c8, int i8, int i9) {
        int i10;
        if ((i8 & 4096) != 0 && c8.R() < 49) {
            c8.D("Synthetic");
            i10 = 6;
        } else {
            i10 = 0;
        }
        if (i9 != 0) {
            c8.D("Signature");
            i10 += 8;
        }
        if ((i8 & 131072) != 0) {
            c8.D("Deprecated");
            return i10 + 6;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(C c8, int i8, int i9, C1515d c1515d) {
        if ((i8 & 4096) != 0 && c8.R() < 49) {
            c1515d.k(c8.D("Synthetic")).i(0);
        }
        if (i9 != 0) {
            c1515d.k(c8.D("Signature")).i(2).k(i9);
        }
        if ((i8 & 131072) != 0) {
            c1515d.k(c8.D("Deprecated")).i(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(C c8) {
        return c(c8, null, 0, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(C c8, byte[] bArr, int i8, int i9, int i10) {
        h hVar = c8.f12773a;
        int i11 = 0;
        for (C1514c c1514c = this; c1514c != null; c1514c = c1514c.f12813c) {
            c8.D(c1514c.f12811a);
            i11 += c1514c.j(hVar, bArr, i8, i9, i10).f12817b + 6;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        int i8 = 0;
        for (C1514c c1514c = this; c1514c != null; c1514c = c1514c.f12813c) {
            i8++;
        }
        return i8;
    }

    public boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(C c8, C1515d c1515d) {
        h(c8, null, 0, -1, -1, c1515d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(C c8, byte[] bArr, int i8, int i9, int i10, C1515d c1515d) {
        h hVar = c8.f12773a;
        for (C1514c c1514c = this; c1514c != null; c1514c = c1514c.f12813c) {
            C1515d j8 = c1514c.j(hVar, bArr, i8, i9, i10);
            c1515d.k(c8.D(c1514c.f12811a)).i(j8.f12817b);
            c1515d.h(j8.f12816a, 0, j8.f12817b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C1514c i(C1516e c1516e, int i8, int i9, char[] cArr, int i10, s[] sVarArr) {
        C1514c c1514c = new C1514c(this.f12811a);
        byte[] bArr = new byte[i9];
        c1514c.f12812b = bArr;
        System.arraycopy(c1516e.f12820c, i8, bArr, 0, i9);
        return c1514c;
    }

    protected C1515d j(h hVar, byte[] bArr, int i8, int i9, int i10) {
        return new C1515d(this.f12812b);
    }
}
