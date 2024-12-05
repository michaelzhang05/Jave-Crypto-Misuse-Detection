package b2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1962b extends AbstractC1961a {

    /* renamed from: c, reason: collision with root package name */
    private final C1959C f15089c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15090d;

    /* renamed from: e, reason: collision with root package name */
    private final C1964d f15091e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15092f;

    /* renamed from: g, reason: collision with root package name */
    private int f15093g;

    /* renamed from: h, reason: collision with root package name */
    private final C1962b f15094h;

    /* renamed from: i, reason: collision with root package name */
    private C1962b f15095i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1962b(C1959C c1959c, boolean z8, C1964d c1964d, C1962b c1962b) {
        super(589824);
        int i8;
        this.f15089c = c1959c;
        this.f15090d = z8;
        this.f15091e = c1964d;
        int i9 = c1964d.f15102b;
        if (i9 == 0) {
            i8 = -1;
        } else {
            i8 = i9 - 2;
        }
        this.f15092f = i8;
        this.f15094h = c1962b;
        if (c1962b != null) {
            c1962b.f15095i = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(C1962b c1962b, C1962b c1962b2, C1962b c1962b3, C1962b c1962b4) {
        int i8;
        if (c1962b != null) {
            i8 = c1962b.g("RuntimeVisibleAnnotations");
        } else {
            i8 = 0;
        }
        if (c1962b2 != null) {
            i8 += c1962b2.g("RuntimeInvisibleAnnotations");
        }
        if (c1962b3 != null) {
            i8 += c1962b3.g("RuntimeVisibleTypeAnnotations");
        }
        if (c1962b4 != null) {
            return i8 + c1962b4.g("RuntimeInvisibleTypeAnnotations");
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(String str, C1962b[] c1962bArr, int i8) {
        int i9 = (i8 * 2) + 7;
        for (int i10 = 0; i10 < i8; i10++) {
            C1962b c1962b = c1962bArr[i10];
            i9 += c1962b == null ? 0 : c1962b.g(str) - 8;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1962b i(C1959C c1959c, int i8, E e8, String str, C1962b c1962b) {
        C1964d c1964d = new C1964d();
        F.a(i8, c1964d);
        E.d(e8, c1964d);
        c1964d.k(c1959c.D(str)).k(0);
        return new C1962b(c1959c, true, c1964d, c1962b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1962b j(C1959C c1959c, String str, C1962b c1962b) {
        C1964d c1964d = new C1964d();
        c1964d.k(c1959c.D(str)).k(0);
        return new C1962b(c1959c, true, c1964d, c1962b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(C1959C c1959c, C1962b c1962b, C1962b c1962b2, C1962b c1962b3, C1962b c1962b4, C1964d c1964d) {
        if (c1962b != null) {
            c1962b.k(c1959c.D("RuntimeVisibleAnnotations"), c1964d);
        }
        if (c1962b2 != null) {
            c1962b2.k(c1959c.D("RuntimeInvisibleAnnotations"), c1964d);
        }
        if (c1962b3 != null) {
            c1962b3.k(c1959c.D("RuntimeVisibleTypeAnnotations"), c1964d);
        }
        if (c1962b4 != null) {
            c1962b4.k(c1959c.D("RuntimeInvisibleTypeAnnotations"), c1964d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(int i8, C1962b[] c1962bArr, int i9, C1964d c1964d) {
        int i10 = (i9 * 2) + 1;
        for (int i11 = 0; i11 < i9; i11++) {
            C1962b c1962b = c1962bArr[i11];
            i10 += c1962b == null ? 0 : c1962b.g(null) - 8;
        }
        c1964d.k(i8);
        c1964d.i(i10);
        c1964d.g(i9);
        for (int i12 = 0; i12 < i9; i12++) {
            C1962b c1962b2 = null;
            int i13 = 0;
            for (C1962b c1962b3 = c1962bArr[i12]; c1962b3 != null; c1962b3 = c1962b3.f15094h) {
                c1962b3.d();
                i13++;
                c1962b2 = c1962b3;
            }
            c1964d.k(i13);
            while (c1962b2 != null) {
                C1964d c1964d2 = c1962b2.f15091e;
                c1964d.h(c1964d2.f15101a, 0, c1964d2.f15102b);
                c1962b2 = c1962b2.f15095i;
            }
        }
    }

    @Override // b2.AbstractC1961a
    public void a(String str, Object obj) {
        this.f15093g++;
        if (this.f15090d) {
            this.f15091e.k(this.f15089c.D(str));
        }
        if (obj instanceof String) {
            this.f15091e.e(115, this.f15089c.D((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.f15091e.e(66, this.f15089c.l(((Byte) obj).byteValue()).f15051a);
            return;
        }
        if (obj instanceof Boolean) {
            this.f15091e.e(90, this.f15089c.l(((Boolean) obj).booleanValue() ? 1 : 0).f15051a);
            return;
        }
        if (obj instanceof Character) {
            this.f15091e.e(67, this.f15089c.l(((Character) obj).charValue()).f15051a);
            return;
        }
        if (obj instanceof Short) {
            this.f15091e.e(83, this.f15089c.l(((Short) obj).shortValue()).f15051a);
            return;
        }
        if (obj instanceof C1960D) {
            this.f15091e.e(99, this.f15089c.D(((C1960D) obj).d()));
            return;
        }
        int i8 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.f15091e.e(91, bArr.length);
            int length = bArr.length;
            while (i8 < length) {
                this.f15091e.e(66, this.f15089c.l(bArr[i8]).f15051a);
                i8++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.f15091e.e(91, zArr.length);
            int length2 = zArr.length;
            while (i8 < length2) {
                this.f15091e.e(90, this.f15089c.l(zArr[i8] ? 1 : 0).f15051a);
                i8++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.f15091e.e(91, sArr.length);
            int length3 = sArr.length;
            while (i8 < length3) {
                this.f15091e.e(83, this.f15089c.l(sArr[i8]).f15051a);
                i8++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.f15091e.e(91, cArr.length);
            int length4 = cArr.length;
            while (i8 < length4) {
                this.f15091e.e(67, this.f15089c.l(cArr[i8]).f15051a);
                i8++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.f15091e.e(91, iArr.length);
            int length5 = iArr.length;
            while (i8 < length5) {
                this.f15091e.e(73, this.f15089c.l(iArr[i8]).f15051a);
                i8++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.f15091e.e(91, jArr.length);
            int length6 = jArr.length;
            while (i8 < length6) {
                this.f15091e.e(74, this.f15089c.p(jArr[i8]).f15051a);
                i8++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.f15091e.e(91, fArr.length);
            int length7 = fArr.length;
            while (i8 < length7) {
                this.f15091e.e(70, this.f15089c.k(fArr[i8]).f15051a);
                i8++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            this.f15091e.e(91, dArr.length);
            int length8 = dArr.length;
            while (i8 < length8) {
                this.f15091e.e(68, this.f15089c.f(dArr[i8]).f15051a);
                i8++;
            }
            return;
        }
        AbstractC1958B d8 = this.f15089c.d(obj);
        this.f15091e.e(".s.IFJDCS".charAt(d8.f15052b), d8.f15051a);
    }

    @Override // b2.AbstractC1961a
    public AbstractC1961a b(String str, String str2) {
        this.f15093g++;
        if (this.f15090d) {
            this.f15091e.k(this.f15089c.D(str));
        }
        this.f15091e.e(64, this.f15089c.D(str2)).k(0);
        return new C1962b(this.f15089c, true, this.f15091e, null);
    }

    @Override // b2.AbstractC1961a
    public AbstractC1961a c(String str) {
        this.f15093g++;
        if (this.f15090d) {
            this.f15091e.k(this.f15089c.D(str));
        }
        this.f15091e.e(91, 0);
        return new C1962b(this.f15089c, false, this.f15091e, null);
    }

    @Override // b2.AbstractC1961a
    public void d() {
        int i8 = this.f15092f;
        if (i8 != -1) {
            byte[] bArr = this.f15091e.f15101a;
            int i9 = this.f15093g;
            bArr[i8] = (byte) (i9 >>> 8);
            bArr[i8 + 1] = (byte) i9;
        }
    }

    @Override // b2.AbstractC1961a
    public void e(String str, String str2, String str3) {
        this.f15093g++;
        if (this.f15090d) {
            this.f15091e.k(this.f15089c.D(str));
        }
        this.f15091e.e(101, this.f15089c.D(str2)).k(this.f15089c.D(str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(String str) {
        if (str != null) {
            this.f15089c.D(str);
        }
        int i8 = 8;
        for (C1962b c1962b = this; c1962b != null; c1962b = c1962b.f15094h) {
            i8 += c1962b.f15091e.f15102b;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i8, C1964d c1964d) {
        int i9 = 2;
        int i10 = 0;
        C1962b c1962b = null;
        for (C1962b c1962b2 = this; c1962b2 != null; c1962b2 = c1962b2.f15094h) {
            c1962b2.d();
            i9 += c1962b2.f15091e.f15102b;
            i10++;
            c1962b = c1962b2;
        }
        c1964d.k(i8);
        c1964d.i(i9);
        c1964d.k(i10);
        while (c1962b != null) {
            C1964d c1964d2 = c1962b.f15091e;
            c1964d.h(c1964d2.f15101a, 0, c1964d2.f15102b);
            c1962b = c1962b.f15095i;
        }
    }
}
