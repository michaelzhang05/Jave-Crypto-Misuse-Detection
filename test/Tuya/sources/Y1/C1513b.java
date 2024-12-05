package Y1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Y1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1513b extends AbstractC1512a {

    /* renamed from: c, reason: collision with root package name */
    private final C f12804c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12805d;

    /* renamed from: e, reason: collision with root package name */
    private final C1515d f12806e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12807f;

    /* renamed from: g, reason: collision with root package name */
    private int f12808g;

    /* renamed from: h, reason: collision with root package name */
    private final C1513b f12809h;

    /* renamed from: i, reason: collision with root package name */
    private C1513b f12810i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1513b(C c8, boolean z8, C1515d c1515d, C1513b c1513b) {
        super(589824);
        int i8;
        this.f12804c = c8;
        this.f12805d = z8;
        this.f12806e = c1515d;
        int i9 = c1515d.f12817b;
        if (i9 == 0) {
            i8 = -1;
        } else {
            i8 = i9 - 2;
        }
        this.f12807f = i8;
        this.f12809h = c1513b;
        if (c1513b != null) {
            c1513b.f12810i = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(C1513b c1513b, C1513b c1513b2, C1513b c1513b3, C1513b c1513b4) {
        int i8;
        if (c1513b != null) {
            i8 = c1513b.g("RuntimeVisibleAnnotations");
        } else {
            i8 = 0;
        }
        if (c1513b2 != null) {
            i8 += c1513b2.g("RuntimeInvisibleAnnotations");
        }
        if (c1513b3 != null) {
            i8 += c1513b3.g("RuntimeVisibleTypeAnnotations");
        }
        if (c1513b4 != null) {
            return i8 + c1513b4.g("RuntimeInvisibleTypeAnnotations");
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(String str, C1513b[] c1513bArr, int i8) {
        int i9 = (i8 * 2) + 7;
        for (int i10 = 0; i10 < i8; i10++) {
            C1513b c1513b = c1513bArr[i10];
            i9 += c1513b == null ? 0 : c1513b.g(str) - 8;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1513b i(C c8, int i8, E e8, String str, C1513b c1513b) {
        C1515d c1515d = new C1515d();
        F.a(i8, c1515d);
        E.d(e8, c1515d);
        c1515d.k(c8.D(str)).k(0);
        return new C1513b(c8, true, c1515d, c1513b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1513b j(C c8, String str, C1513b c1513b) {
        C1515d c1515d = new C1515d();
        c1515d.k(c8.D(str)).k(0);
        return new C1513b(c8, true, c1515d, c1513b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(C c8, C1513b c1513b, C1513b c1513b2, C1513b c1513b3, C1513b c1513b4, C1515d c1515d) {
        if (c1513b != null) {
            c1513b.k(c8.D("RuntimeVisibleAnnotations"), c1515d);
        }
        if (c1513b2 != null) {
            c1513b2.k(c8.D("RuntimeInvisibleAnnotations"), c1515d);
        }
        if (c1513b3 != null) {
            c1513b3.k(c8.D("RuntimeVisibleTypeAnnotations"), c1515d);
        }
        if (c1513b4 != null) {
            c1513b4.k(c8.D("RuntimeInvisibleTypeAnnotations"), c1515d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(int i8, C1513b[] c1513bArr, int i9, C1515d c1515d) {
        int i10 = (i9 * 2) + 1;
        for (int i11 = 0; i11 < i9; i11++) {
            C1513b c1513b = c1513bArr[i11];
            i10 += c1513b == null ? 0 : c1513b.g(null) - 8;
        }
        c1515d.k(i8);
        c1515d.i(i10);
        c1515d.g(i9);
        for (int i12 = 0; i12 < i9; i12++) {
            C1513b c1513b2 = null;
            int i13 = 0;
            for (C1513b c1513b3 = c1513bArr[i12]; c1513b3 != null; c1513b3 = c1513b3.f12809h) {
                c1513b3.d();
                i13++;
                c1513b2 = c1513b3;
            }
            c1515d.k(i13);
            while (c1513b2 != null) {
                C1515d c1515d2 = c1513b2.f12806e;
                c1515d.h(c1515d2.f12816a, 0, c1515d2.f12817b);
                c1513b2 = c1513b2.f12810i;
            }
        }
    }

    @Override // Y1.AbstractC1512a
    public void a(String str, Object obj) {
        this.f12808g++;
        if (this.f12805d) {
            this.f12806e.k(this.f12804c.D(str));
        }
        if (obj instanceof String) {
            this.f12806e.e(115, this.f12804c.D((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.f12806e.e(66, this.f12804c.l(((Byte) obj).byteValue()).f12766a);
            return;
        }
        if (obj instanceof Boolean) {
            this.f12806e.e(90, this.f12804c.l(((Boolean) obj).booleanValue() ? 1 : 0).f12766a);
            return;
        }
        if (obj instanceof Character) {
            this.f12806e.e(67, this.f12804c.l(((Character) obj).charValue()).f12766a);
            return;
        }
        if (obj instanceof Short) {
            this.f12806e.e(83, this.f12804c.l(((Short) obj).shortValue()).f12766a);
            return;
        }
        if (obj instanceof D) {
            this.f12806e.e(99, this.f12804c.D(((D) obj).d()));
            return;
        }
        int i8 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.f12806e.e(91, bArr.length);
            int length = bArr.length;
            while (i8 < length) {
                this.f12806e.e(66, this.f12804c.l(bArr[i8]).f12766a);
                i8++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.f12806e.e(91, zArr.length);
            int length2 = zArr.length;
            while (i8 < length2) {
                this.f12806e.e(90, this.f12804c.l(zArr[i8] ? 1 : 0).f12766a);
                i8++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.f12806e.e(91, sArr.length);
            int length3 = sArr.length;
            while (i8 < length3) {
                this.f12806e.e(83, this.f12804c.l(sArr[i8]).f12766a);
                i8++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.f12806e.e(91, cArr.length);
            int length4 = cArr.length;
            while (i8 < length4) {
                this.f12806e.e(67, this.f12804c.l(cArr[i8]).f12766a);
                i8++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.f12806e.e(91, iArr.length);
            int length5 = iArr.length;
            while (i8 < length5) {
                this.f12806e.e(73, this.f12804c.l(iArr[i8]).f12766a);
                i8++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.f12806e.e(91, jArr.length);
            int length6 = jArr.length;
            while (i8 < length6) {
                this.f12806e.e(74, this.f12804c.p(jArr[i8]).f12766a);
                i8++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.f12806e.e(91, fArr.length);
            int length7 = fArr.length;
            while (i8 < length7) {
                this.f12806e.e(70, this.f12804c.k(fArr[i8]).f12766a);
                i8++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            this.f12806e.e(91, dArr.length);
            int length8 = dArr.length;
            while (i8 < length8) {
                this.f12806e.e(68, this.f12804c.f(dArr[i8]).f12766a);
                i8++;
            }
            return;
        }
        B d8 = this.f12804c.d(obj);
        this.f12806e.e(".s.IFJDCS".charAt(d8.f12767b), d8.f12766a);
    }

    @Override // Y1.AbstractC1512a
    public AbstractC1512a b(String str, String str2) {
        this.f12808g++;
        if (this.f12805d) {
            this.f12806e.k(this.f12804c.D(str));
        }
        this.f12806e.e(64, this.f12804c.D(str2)).k(0);
        return new C1513b(this.f12804c, true, this.f12806e, null);
    }

    @Override // Y1.AbstractC1512a
    public AbstractC1512a c(String str) {
        this.f12808g++;
        if (this.f12805d) {
            this.f12806e.k(this.f12804c.D(str));
        }
        this.f12806e.e(91, 0);
        return new C1513b(this.f12804c, false, this.f12806e, null);
    }

    @Override // Y1.AbstractC1512a
    public void d() {
        int i8 = this.f12807f;
        if (i8 != -1) {
            byte[] bArr = this.f12806e.f12816a;
            int i9 = this.f12808g;
            bArr[i8] = (byte) (i9 >>> 8);
            bArr[i8 + 1] = (byte) i9;
        }
    }

    @Override // Y1.AbstractC1512a
    public void e(String str, String str2, String str3) {
        this.f12808g++;
        if (this.f12805d) {
            this.f12806e.k(this.f12804c.D(str));
        }
        this.f12806e.e(101, this.f12804c.D(str2)).k(this.f12804c.D(str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(String str) {
        if (str != null) {
            this.f12804c.D(str);
        }
        int i8 = 8;
        for (C1513b c1513b = this; c1513b != null; c1513b = c1513b.f12809h) {
            i8 += c1513b.f12806e.f12817b;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i8, C1515d c1515d) {
        int i9 = 2;
        int i10 = 0;
        C1513b c1513b = null;
        for (C1513b c1513b2 = this; c1513b2 != null; c1513b2 = c1513b2.f12809h) {
            c1513b2.d();
            i9 += c1513b2.f12806e.f12817b;
            i10++;
            c1513b = c1513b2;
        }
        c1515d.k(i8);
        c1515d.i(i9);
        c1515d.k(i10);
        while (c1513b != null) {
            C1515d c1515d2 = c1513b.f12806e;
            c1515d.h(c1515d2.f12816a, 0, c1515d2.f12817b);
            c1513b = c1513b.f12810i;
        }
    }
}
