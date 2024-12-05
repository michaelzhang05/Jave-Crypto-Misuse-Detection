package e7;

import b7.InterfaceC1990a;
import b7.InterfaceC1991b;
import b7.f;
import b7.g;
import f7.C2845a;
import f7.InterfaceC2846b;
import f7.c;
import f7.d;
import f7.e;
import g7.C2888a;
import g7.C2890c;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2807a {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1990a f31799a;

    /* renamed from: b, reason: collision with root package name */
    private c f31800b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2846b f31801c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31802d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31803e;

    /* renamed from: f, reason: collision with root package name */
    private int f31804f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f31805g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f31806h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f31807i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f31808j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f31809k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f31810l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f31811m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f31812n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f31813o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f31814p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f31815q;

    /* renamed from: r, reason: collision with root package name */
    private int f31816r;

    /* renamed from: s, reason: collision with root package name */
    private int f31817s;

    /* renamed from: t, reason: collision with root package name */
    private long f31818t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f31819u;

    /* renamed from: v, reason: collision with root package name */
    private int f31820v;

    /* renamed from: w, reason: collision with root package name */
    private long f31821w;

    /* renamed from: x, reason: collision with root package name */
    private long f31822x;

    public C2807a(InterfaceC1990a interfaceC1990a) {
        this(interfaceC1990a, null);
    }

    private void a() {
        if (!this.f31803e) {
            if (this.f31802d) {
                throw new IllegalStateException("GCM cipher cannot be reused for encryption");
            }
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
    }

    private void c(byte[] bArr, byte[] bArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9 += 16) {
            f(bArr, bArr2, i9, Math.min(i8 - i9, 16));
        }
    }

    private void d(byte[] bArr, byte[] bArr2) {
        d.p(bArr, bArr2);
        this.f31800b.b(bArr);
    }

    private void e(byte[] bArr, byte[] bArr2, int i8) {
        d.q(bArr, bArr2, i8);
        this.f31800b.b(bArr);
    }

    private void f(byte[] bArr, byte[] bArr2, int i8, int i9) {
        d.r(bArr, bArr2, i8, i9);
        this.f31800b.b(bArr);
    }

    private void g(byte[] bArr) {
        int i8 = this.f31816r;
        if (i8 != 0) {
            this.f31816r = i8 - 1;
            byte[] bArr2 = this.f31815q;
            int i9 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i9;
            int i10 = (i9 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i10;
            int i11 = (i10 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i11;
            bArr2[12] = (byte) ((i11 >>> 8) + (bArr2[12] & 255));
            this.f31799a.b(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void j() {
        if (this.f31821w > 0) {
            System.arraycopy(this.f31813o, 0, this.f31814p, 0, 16);
            this.f31822x = this.f31821w;
        }
        int i8 = this.f31820v;
        if (i8 > 0) {
            f(this.f31814p, this.f31819u, 0, i8);
            this.f31822x += this.f31820v;
        }
        if (this.f31822x > 0) {
            System.arraycopy(this.f31814p, 0, this.f31812n, 0, 16);
        }
    }

    private void l(byte[] bArr, int i8, byte[] bArr2, int i9) {
        if (bArr2.length - i9 >= 16) {
            if (this.f31818t == 0) {
                j();
            }
            byte[] bArr3 = new byte[16];
            g(bArr3);
            if (this.f31802d) {
                d.q(bArr3, bArr, i8);
                d(this.f31812n, bArr3);
                System.arraycopy(bArr3, 0, bArr2, i9, 16);
            } else {
                e(this.f31812n, bArr, i8);
                d.o(bArr3, 0, bArr, i8, bArr2, i9);
            }
            this.f31818t += 16;
            return;
        }
        throw new g("Output buffer too short");
    }

    private void n(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = new byte[16];
        g(bArr3);
        if (this.f31802d) {
            d.n(bArr, i8, bArr3, 0, i9);
            f(this.f31812n, bArr, i8, i9);
        } else {
            f(this.f31812n, bArr, i8, i9);
            d.n(bArr, i8, bArr3, 0, i9);
        }
        System.arraycopy(bArr, i8, bArr2, i10, i9);
        this.f31818t += i9;
    }

    private void o(boolean z8) {
        this.f31799a.reset();
        this.f31812n = new byte[16];
        this.f31813o = new byte[16];
        this.f31814p = new byte[16];
        this.f31819u = new byte[16];
        this.f31820v = 0;
        this.f31821w = 0L;
        this.f31822x = 0L;
        this.f31815q = H7.a.d(this.f31809k);
        this.f31816r = -2;
        this.f31817s = 0;
        this.f31818t = 0L;
        byte[] bArr = this.f31810l;
        if (bArr != null) {
            H7.a.i(bArr, (byte) 0);
        }
        if (z8) {
            this.f31811m = null;
        }
        if (this.f31802d) {
            this.f31803e = false;
            return;
        }
        byte[] bArr2 = this.f31807i;
        if (bArr2 != null) {
            k(bArr2, 0, bArr2.length);
        }
    }

    public int b(byte[] bArr, int i8) {
        a();
        if (this.f31818t == 0) {
            j();
        }
        int i9 = this.f31817s;
        if (this.f31802d) {
            if (bArr.length - i8 < this.f31804f + i9) {
                throw new g("Output buffer too short");
            }
        } else {
            int i10 = this.f31804f;
            if (i9 >= i10) {
                i9 -= i10;
                if (bArr.length - i8 < i9) {
                    throw new g("Output buffer too short");
                }
            } else {
                throw new f("data too short");
            }
        }
        if (i9 > 0) {
            n(this.f31810l, 0, i9, bArr, i8);
        }
        long j8 = this.f31821w;
        int i11 = this.f31820v;
        long j9 = j8 + i11;
        this.f31821w = j9;
        if (j9 > this.f31822x) {
            if (i11 > 0) {
                f(this.f31813o, this.f31819u, 0, i11);
            }
            if (this.f31822x > 0) {
                d.p(this.f31813o, this.f31814p);
            }
            long j10 = ((this.f31818t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f31801c == null) {
                C2845a c2845a = new C2845a();
                this.f31801c = c2845a;
                c2845a.a(this.f31808j);
            }
            this.f31801c.b(j10, bArr2);
            d.i(this.f31813o, bArr2);
            d.p(this.f31812n, this.f31813o);
        }
        byte[] bArr3 = new byte[16];
        H7.f.i(this.f31821w * 8, bArr3, 0);
        H7.f.i(this.f31818t * 8, bArr3, 8);
        d(this.f31812n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f31799a.b(this.f31809k, 0, bArr4, 0);
        d.p(bArr4, this.f31812n);
        int i12 = this.f31804f;
        byte[] bArr5 = new byte[i12];
        this.f31811m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i12);
        if (this.f31802d) {
            System.arraycopy(this.f31811m, 0, bArr, i8 + this.f31817s, this.f31804f);
            i9 += this.f31804f;
        } else {
            int i13 = this.f31804f;
            byte[] bArr6 = new byte[i13];
            System.arraycopy(this.f31810l, i9, bArr6, 0, i13);
            if (!H7.a.g(this.f31811m, bArr6)) {
                throw new f("mac check in GCM failed");
            }
        }
        o(false);
        return i9;
    }

    public int h(int i8) {
        int i9 = i8 + this.f31817s;
        if (this.f31802d) {
            return i9 + this.f31804f;
        }
        int i10 = this.f31804f;
        if (i9 < i10) {
            return 0;
        }
        return i9 - i10;
    }

    public void i(boolean z8, InterfaceC1991b interfaceC1991b) {
        int i8;
        byte[] bArr;
        this.f31802d = z8;
        this.f31811m = null;
        this.f31803e = true;
        if (interfaceC1991b instanceof C2888a) {
            C2888a c2888a = (C2888a) interfaceC1991b;
            byte[] d8 = c2888a.d();
            this.f31807i = c2888a.a();
            int c8 = c2888a.c();
            if (c8 >= 32 && c8 <= 128 && c8 % 8 == 0) {
                this.f31804f = c8 / 8;
                C2890c b8 = c2888a.b();
                if (z8) {
                    i8 = 16;
                } else {
                    i8 = this.f31804f + 16;
                }
                this.f31810l = new byte[i8];
                if (d8 != null && d8.length >= 1) {
                    if (z8 && (bArr = this.f31806h) != null && H7.a.a(bArr, d8)) {
                        if (b8 != null) {
                            byte[] bArr2 = this.f31805g;
                            if (bArr2 != null && H7.a.a(bArr2, b8.a())) {
                                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                            }
                        } else {
                            throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                        }
                    }
                    this.f31806h = d8;
                    if (b8 != null) {
                        this.f31805g = b8.a();
                    }
                    if (b8 != null) {
                        this.f31799a.a(true, b8);
                        byte[] bArr3 = new byte[16];
                        this.f31808j = bArr3;
                        this.f31799a.b(bArr3, 0, bArr3, 0);
                        this.f31800b.a(this.f31808j);
                        this.f31801c = null;
                    } else if (this.f31808j == null) {
                        throw new IllegalArgumentException("Key must be specified in initial init");
                    }
                    byte[] bArr4 = new byte[16];
                    this.f31809k = bArr4;
                    byte[] bArr5 = this.f31806h;
                    if (bArr5.length == 12) {
                        System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                        this.f31809k[15] = 1;
                    } else {
                        c(bArr4, bArr5, bArr5.length);
                        byte[] bArr6 = new byte[16];
                        H7.f.i(this.f31806h.length * 8, bArr6, 8);
                        d(this.f31809k, bArr6);
                    }
                    this.f31812n = new byte[16];
                    this.f31813o = new byte[16];
                    this.f31814p = new byte[16];
                    this.f31819u = new byte[16];
                    this.f31820v = 0;
                    this.f31821w = 0L;
                    this.f31822x = 0L;
                    this.f31815q = H7.a.d(this.f31809k);
                    this.f31816r = -2;
                    this.f31817s = 0;
                    this.f31818t = 0L;
                    byte[] bArr7 = this.f31807i;
                    if (bArr7 != null) {
                        k(bArr7, 0, bArr7.length);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("IV must be at least 1 byte");
            }
            throw new IllegalArgumentException("Invalid value for MAC size: " + c8);
        }
        throw new IllegalArgumentException("invalid parameters passed to GCM");
    }

    public void k(byte[] bArr, int i8, int i9) {
        a();
        for (int i10 = 0; i10 < i9; i10++) {
            byte[] bArr2 = this.f31819u;
            int i11 = this.f31820v;
            bArr2[i11] = bArr[i8 + i10];
            int i12 = i11 + 1;
            this.f31820v = i12;
            if (i12 == 16) {
                d(this.f31813o, bArr2);
                this.f31820v = 0;
                this.f31821w += 16;
            }
        }
    }

    public int m(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11;
        a();
        if (bArr.length - i8 >= i9) {
            if (this.f31802d) {
                if (this.f31817s != 0) {
                    while (i9 > 0) {
                        i9--;
                        byte[] bArr3 = this.f31810l;
                        int i12 = this.f31817s;
                        int i13 = i8 + 1;
                        bArr3[i12] = bArr[i8];
                        int i14 = i12 + 1;
                        this.f31817s = i14;
                        if (i14 == 16) {
                            l(bArr3, 0, bArr2, i10);
                            this.f31817s = 0;
                            i8 = i13;
                            i11 = 16;
                            break;
                        }
                        i8 = i13;
                    }
                }
                i11 = 0;
                while (i9 >= 16) {
                    l(bArr, i8, bArr2, i10 + i11);
                    i8 += 16;
                    i9 -= 16;
                    i11 += 16;
                }
                if (i9 > 0) {
                    System.arraycopy(bArr, i8, this.f31810l, 0, i9);
                    this.f31817s = i9;
                }
            } else {
                i11 = 0;
                for (int i15 = 0; i15 < i9; i15++) {
                    byte[] bArr4 = this.f31810l;
                    int i16 = this.f31817s;
                    bArr4[i16] = bArr[i8 + i15];
                    int i17 = i16 + 1;
                    this.f31817s = i17;
                    if (i17 == bArr4.length) {
                        l(bArr4, 0, bArr2, i10 + i11);
                        byte[] bArr5 = this.f31810l;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.f31804f);
                        this.f31817s = this.f31804f;
                        i11 += 16;
                    }
                }
            }
            return i11;
        }
        throw new b7.d("Input buffer too short");
    }

    public C2807a(InterfaceC1990a interfaceC1990a, c cVar) {
        if (interfaceC1990a.c() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        cVar = cVar == null ? new e() : cVar;
        this.f31799a = interfaceC1990a;
        this.f31800b = cVar;
    }
}
