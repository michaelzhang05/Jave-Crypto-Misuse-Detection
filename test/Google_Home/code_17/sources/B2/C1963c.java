package b2;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1963c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15096a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f15097b;

    /* renamed from: c, reason: collision with root package name */
    C1963c f15098c;

    /* renamed from: b2.c$a */
    /* loaded from: classes4.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f15099a;

        /* renamed from: b, reason: collision with root package name */
        private C1963c[] f15100b = new C1963c[6];

        private void a(C1963c c1963c) {
            int i8 = this.f15099a;
            C1963c[] c1963cArr = this.f15100b;
            if (i8 >= c1963cArr.length) {
                C1963c[] c1963cArr2 = new C1963c[c1963cArr.length + 6];
                System.arraycopy(c1963cArr, 0, c1963cArr2, 0, i8);
                this.f15100b = c1963cArr2;
            }
            C1963c[] c1963cArr3 = this.f15100b;
            int i9 = this.f15099a;
            this.f15099a = i9 + 1;
            c1963cArr3[i9] = c1963c;
        }

        private boolean c(C1963c c1963c) {
            for (int i8 = 0; i8 < this.f15099a; i8++) {
                if (this.f15100b[i8].f15096a.equals(c1963c.f15096a)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(C1963c c1963c) {
            while (c1963c != null) {
                if (!c(c1963c)) {
                    a(c1963c);
                }
                c1963c = c1963c.f15098c;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1963c[] d() {
            int i8 = this.f15099a;
            C1963c[] c1963cArr = new C1963c[i8];
            System.arraycopy(this.f15100b, 0, c1963cArr, 0, i8);
            return c1963cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C1963c(String str) {
        this.f15096a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(C1959C c1959c, int i8, int i9) {
        int i10;
        if ((i8 & 4096) != 0 && c1959c.R() < 49) {
            c1959c.D("Synthetic");
            i10 = 6;
        } else {
            i10 = 0;
        }
        if (i9 != 0) {
            c1959c.D("Signature");
            i10 += 8;
        }
        if ((i8 & 131072) != 0) {
            c1959c.D("Deprecated");
            return i10 + 6;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(C1959C c1959c, int i8, int i9, C1964d c1964d) {
        if ((i8 & 4096) != 0 && c1959c.R() < 49) {
            c1964d.k(c1959c.D("Synthetic")).i(0);
        }
        if (i9 != 0) {
            c1964d.k(c1959c.D("Signature")).i(2).k(i9);
        }
        if ((i8 & 131072) != 0) {
            c1964d.k(c1959c.D("Deprecated")).i(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(C1959C c1959c) {
        return c(c1959c, null, 0, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(C1959C c1959c, byte[] bArr, int i8, int i9, int i10) {
        h hVar = c1959c.f15058a;
        int i11 = 0;
        for (C1963c c1963c = this; c1963c != null; c1963c = c1963c.f15098c) {
            c1959c.D(c1963c.f15096a);
            i11 += c1963c.j(hVar, bArr, i8, i9, i10).f15102b + 6;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        int i8 = 0;
        for (C1963c c1963c = this; c1963c != null; c1963c = c1963c.f15098c) {
            i8++;
        }
        return i8;
    }

    public boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(C1959C c1959c, C1964d c1964d) {
        h(c1959c, null, 0, -1, -1, c1964d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(C1959C c1959c, byte[] bArr, int i8, int i9, int i10, C1964d c1964d) {
        h hVar = c1959c.f15058a;
        for (C1963c c1963c = this; c1963c != null; c1963c = c1963c.f15098c) {
            C1964d j8 = c1963c.j(hVar, bArr, i8, i9, i10);
            c1964d.k(c1959c.D(c1963c.f15096a)).i(j8.f15102b);
            c1964d.h(j8.f15101a, 0, j8.f15102b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C1963c i(C1965e c1965e, int i8, int i9, char[] cArr, int i10, s[] sVarArr) {
        C1963c c1963c = new C1963c(this.f15096a);
        byte[] bArr = new byte[i9];
        c1963c.f15097b = bArr;
        System.arraycopy(c1965e.f15105c, i8, bArr, 0, i9);
        return c1963c;
    }

    protected C1964d j(h hVar, byte[] bArr, int i8, int i9, int i10) {
        return new C1964d(this.f15097b);
    }
}
