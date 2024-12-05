package Z6;

/* loaded from: classes5.dex */
public class e extends a {

    /* renamed from: d, reason: collision with root package name */
    private int f13453d;

    /* renamed from: e, reason: collision with root package name */
    private int f13454e;

    /* renamed from: f, reason: collision with root package name */
    private int f13455f;

    /* renamed from: g, reason: collision with root package name */
    private int f13456g;

    /* renamed from: h, reason: collision with root package name */
    private int f13457h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f13458i = new int[80];

    /* renamed from: j, reason: collision with root package name */
    private int f13459j;

    public e() {
        k();
    }

    private int l(int i8, int i9, int i10) {
        return ((~i8) & i10) | (i9 & i8);
    }

    private int m(int i8, int i9, int i10) {
        return (i8 & (i9 | i10)) | (i9 & i10);
    }

    private int n(int i8, int i9, int i10) {
        return (i8 ^ i9) ^ i10;
    }

    @Override // Y6.e
    public int a(byte[] bArr, int i8) {
        g();
        E7.f.d(this.f13453d, bArr, i8);
        E7.f.d(this.f13454e, bArr, i8 + 4);
        E7.f.d(this.f13455f, bArr, i8 + 8);
        E7.f.d(this.f13456g, bArr, i8 + 12);
        E7.f.d(this.f13457h, bArr, i8 + 16);
        k();
        return 20;
    }

    @Override // Y6.e
    public String e() {
        return "SHA-1";
    }

    @Override // Y6.e
    public int f() {
        return 20;
    }

    @Override // Z6.a
    protected void h() {
        for (int i8 = 16; i8 < 80; i8++) {
            int[] iArr = this.f13458i;
            int i9 = ((iArr[i8 - 3] ^ iArr[i8 - 8]) ^ iArr[i8 - 14]) ^ iArr[i8 - 16];
            iArr[i8] = (i9 >>> 31) | (i9 << 1);
        }
        int i10 = this.f13453d;
        int i11 = this.f13454e;
        int i12 = this.f13455f;
        int i13 = this.f13456g;
        int i14 = this.f13457h;
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            int l8 = i14 + ((i10 << 5) | (i10 >>> 27)) + l(i11, i12, i13) + this.f13458i[i15] + 1518500249;
            int i17 = (i11 >>> 2) | (i11 << 30);
            int l9 = i13 + ((l8 << 5) | (l8 >>> 27)) + l(i10, i17, i12) + this.f13458i[i15 + 1] + 1518500249;
            int i18 = (i10 >>> 2) | (i10 << 30);
            int l10 = i12 + ((l9 << 5) | (l9 >>> 27)) + l(l8, i18, i17) + this.f13458i[i15 + 2] + 1518500249;
            i14 = (l8 >>> 2) | (l8 << 30);
            int i19 = i15 + 4;
            i11 = i17 + ((l10 << 5) | (l10 >>> 27)) + l(l9, i14, i18) + this.f13458i[i15 + 3] + 1518500249;
            i13 = (l9 >>> 2) | (l9 << 30);
            i15 += 5;
            i10 = i18 + ((i11 << 5) | (i11 >>> 27)) + l(l10, i13, i14) + this.f13458i[i19] + 1518500249;
            i12 = (l10 >>> 2) | (l10 << 30);
        }
        for (int i20 = 0; i20 < 4; i20++) {
            int n8 = i14 + ((i10 << 5) | (i10 >>> 27)) + n(i11, i12, i13) + this.f13458i[i15] + 1859775393;
            int i21 = (i11 >>> 2) | (i11 << 30);
            int n9 = i13 + ((n8 << 5) | (n8 >>> 27)) + n(i10, i21, i12) + this.f13458i[i15 + 1] + 1859775393;
            int i22 = (i10 >>> 2) | (i10 << 30);
            int n10 = i12 + ((n9 << 5) | (n9 >>> 27)) + n(n8, i22, i21) + this.f13458i[i15 + 2] + 1859775393;
            i14 = (n8 >>> 2) | (n8 << 30);
            int i23 = i15 + 4;
            i11 = i21 + ((n10 << 5) | (n10 >>> 27)) + n(n9, i14, i22) + this.f13458i[i15 + 3] + 1859775393;
            i13 = (n9 >>> 2) | (n9 << 30);
            i15 += 5;
            i10 = i22 + ((i11 << 5) | (i11 >>> 27)) + n(n10, i13, i14) + this.f13458i[i23] + 1859775393;
            i12 = (n10 >>> 2) | (n10 << 30);
        }
        for (int i24 = 0; i24 < 4; i24++) {
            int m8 = i14 + (((((i10 << 5) | (i10 >>> 27)) + m(i11, i12, i13)) + this.f13458i[i15]) - 1894007588);
            int m9 = i13 + (((((m8 << 5) | (m8 >>> 27)) + m(i10, r2, i12)) + this.f13458i[i15 + 1]) - 1894007588);
            int m10 = i12 + (((((m9 << 5) | (m9 >>> 27)) + m(m8, r1, r2)) + this.f13458i[i15 + 2]) - 1894007588);
            i14 = (m8 >>> 2) | (m8 << 30);
            int i25 = i15 + 4;
            i11 = ((i11 >>> 2) | (i11 << 30)) + (((((m10 << 5) | (m10 >>> 27)) + m(m9, i14, r1)) + this.f13458i[i15 + 3]) - 1894007588);
            i13 = (m9 >>> 2) | (m9 << 30);
            i15 += 5;
            i10 = ((i10 >>> 2) | (i10 << 30)) + (((((i11 << 5) | (i11 >>> 27)) + m(m10, i13, i14)) + this.f13458i[i25]) - 1894007588);
            i12 = (m10 >>> 2) | (m10 << 30);
        }
        for (int i26 = 0; i26 <= 3; i26++) {
            int n11 = i14 + (((((i10 << 5) | (i10 >>> 27)) + n(i11, i12, i13)) + this.f13458i[i15]) - 899497514);
            int n12 = i13 + (((((n11 << 5) | (n11 >>> 27)) + n(i10, r2, i12)) + this.f13458i[i15 + 1]) - 899497514);
            int n13 = i12 + (((((n12 << 5) | (n12 >>> 27)) + n(n11, r1, r2)) + this.f13458i[i15 + 2]) - 899497514);
            i14 = (n11 >>> 2) | (n11 << 30);
            int i27 = i15 + 4;
            i11 = ((i11 >>> 2) | (i11 << 30)) + (((((n13 << 5) | (n13 >>> 27)) + n(n12, i14, r1)) + this.f13458i[i15 + 3]) - 899497514);
            i13 = (n12 >>> 2) | (n12 << 30);
            i15 += 5;
            i10 = ((i10 >>> 2) | (i10 << 30)) + (((((i11 << 5) | (i11 >>> 27)) + n(n13, i13, i14)) + this.f13458i[i27]) - 899497514);
            i12 = (n13 >>> 2) | (n13 << 30);
        }
        this.f13453d += i10;
        this.f13454e += i11;
        this.f13455f += i12;
        this.f13456g += i13;
        this.f13457h += i14;
        this.f13459j = 0;
        for (int i28 = 0; i28 < 16; i28++) {
            this.f13458i[i28] = 0;
        }
    }

    @Override // Z6.a
    protected void i(long j8) {
        if (this.f13459j > 14) {
            h();
        }
        int[] iArr = this.f13458i;
        iArr[14] = (int) (j8 >>> 32);
        iArr[15] = (int) j8;
    }

    @Override // Z6.a
    protected void j(byte[] bArr, int i8) {
        int i9 = (bArr[i8 + 3] & 255) | (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
        int[] iArr = this.f13458i;
        int i10 = this.f13459j;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        this.f13459j = i11;
        if (i11 == 16) {
            h();
        }
    }

    @Override // Z6.a
    public void k() {
        super.k();
        this.f13453d = 1732584193;
        this.f13454e = -271733879;
        this.f13455f = -1732584194;
        this.f13456g = 271733878;
        this.f13457h = -1009589776;
        this.f13459j = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f13458i;
            if (i8 != iArr.length) {
                iArr[i8] = 0;
                i8++;
            } else {
                return;
            }
        }
    }
}
