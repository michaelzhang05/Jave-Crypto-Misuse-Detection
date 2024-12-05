package b7;

import Y6.b;
import Y6.f;
import Y6.g;
import c7.C1935a;
import c7.InterfaceC1936b;
import c7.c;
import c7.d;
import c7.e;
import d7.C2564a;
import d7.C2566c;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1886a {

    /* renamed from: a, reason: collision with root package name */
    private Y6.a f14793a;

    /* renamed from: b, reason: collision with root package name */
    private c f14794b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1936b f14795c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14796d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14797e;

    /* renamed from: f, reason: collision with root package name */
    private int f14798f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f14799g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f14800h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f14801i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f14802j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f14803k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f14804l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f14805m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f14806n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f14807o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f14808p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f14809q;

    /* renamed from: r, reason: collision with root package name */
    private int f14810r;

    /* renamed from: s, reason: collision with root package name */
    private int f14811s;

    /* renamed from: t, reason: collision with root package name */
    private long f14812t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f14813u;

    /* renamed from: v, reason: collision with root package name */
    private int f14814v;

    /* renamed from: w, reason: collision with root package name */
    private long f14815w;

    /* renamed from: x, reason: collision with root package name */
    private long f14816x;

    public C1886a(Y6.a aVar) {
        this(aVar, null);
    }

    private void a() {
        if (!this.f14797e) {
            if (this.f14796d) {
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
        this.f14794b.b(bArr);
    }

    private void e(byte[] bArr, byte[] bArr2, int i8) {
        d.q(bArr, bArr2, i8);
        this.f14794b.b(bArr);
    }

    private void f(byte[] bArr, byte[] bArr2, int i8, int i9) {
        d.r(bArr, bArr2, i8, i9);
        this.f14794b.b(bArr);
    }

    private void g(byte[] bArr) {
        int i8 = this.f14810r;
        if (i8 != 0) {
            this.f14810r = i8 - 1;
            byte[] bArr2 = this.f14809q;
            int i9 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i9;
            int i10 = (i9 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i10;
            int i11 = (i10 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i11;
            bArr2[12] = (byte) ((i11 >>> 8) + (bArr2[12] & 255));
            this.f14793a.b(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void j() {
        if (this.f14815w > 0) {
            System.arraycopy(this.f14807o, 0, this.f14808p, 0, 16);
            this.f14816x = this.f14815w;
        }
        int i8 = this.f14814v;
        if (i8 > 0) {
            f(this.f14808p, this.f14813u, 0, i8);
            this.f14816x += this.f14814v;
        }
        if (this.f14816x > 0) {
            System.arraycopy(this.f14808p, 0, this.f14806n, 0, 16);
        }
    }

    private void l(byte[] bArr, int i8, byte[] bArr2, int i9) {
        if (bArr2.length - i9 >= 16) {
            if (this.f14812t == 0) {
                j();
            }
            byte[] bArr3 = new byte[16];
            g(bArr3);
            if (this.f14796d) {
                d.q(bArr3, bArr, i8);
                d(this.f14806n, bArr3);
                System.arraycopy(bArr3, 0, bArr2, i9, 16);
            } else {
                e(this.f14806n, bArr, i8);
                d.o(bArr3, 0, bArr, i8, bArr2, i9);
            }
            this.f14812t += 16;
            return;
        }
        throw new g("Output buffer too short");
    }

    private void n(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = new byte[16];
        g(bArr3);
        if (this.f14796d) {
            d.n(bArr, i8, bArr3, 0, i9);
            f(this.f14806n, bArr, i8, i9);
        } else {
            f(this.f14806n, bArr, i8, i9);
            d.n(bArr, i8, bArr3, 0, i9);
        }
        System.arraycopy(bArr, i8, bArr2, i10, i9);
        this.f14812t += i9;
    }

    private void o(boolean z8) {
        this.f14793a.reset();
        this.f14806n = new byte[16];
        this.f14807o = new byte[16];
        this.f14808p = new byte[16];
        this.f14813u = new byte[16];
        this.f14814v = 0;
        this.f14815w = 0L;
        this.f14816x = 0L;
        this.f14809q = E7.a.d(this.f14803k);
        this.f14810r = -2;
        this.f14811s = 0;
        this.f14812t = 0L;
        byte[] bArr = this.f14804l;
        if (bArr != null) {
            E7.a.i(bArr, (byte) 0);
        }
        if (z8) {
            this.f14805m = null;
        }
        if (this.f14796d) {
            this.f14797e = false;
            return;
        }
        byte[] bArr2 = this.f14801i;
        if (bArr2 != null) {
            k(bArr2, 0, bArr2.length);
        }
    }

    public int b(byte[] bArr, int i8) {
        a();
        if (this.f14812t == 0) {
            j();
        }
        int i9 = this.f14811s;
        if (this.f14796d) {
            if (bArr.length - i8 < this.f14798f + i9) {
                throw new g("Output buffer too short");
            }
        } else {
            int i10 = this.f14798f;
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
            n(this.f14804l, 0, i9, bArr, i8);
        }
        long j8 = this.f14815w;
        int i11 = this.f14814v;
        long j9 = j8 + i11;
        this.f14815w = j9;
        if (j9 > this.f14816x) {
            if (i11 > 0) {
                f(this.f14807o, this.f14813u, 0, i11);
            }
            if (this.f14816x > 0) {
                d.p(this.f14807o, this.f14808p);
            }
            long j10 = ((this.f14812t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f14795c == null) {
                C1935a c1935a = new C1935a();
                this.f14795c = c1935a;
                c1935a.a(this.f14802j);
            }
            this.f14795c.b(j10, bArr2);
            d.i(this.f14807o, bArr2);
            d.p(this.f14806n, this.f14807o);
        }
        byte[] bArr3 = new byte[16];
        E7.f.i(this.f14815w * 8, bArr3, 0);
        E7.f.i(this.f14812t * 8, bArr3, 8);
        d(this.f14806n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f14793a.b(this.f14803k, 0, bArr4, 0);
        d.p(bArr4, this.f14806n);
        int i12 = this.f14798f;
        byte[] bArr5 = new byte[i12];
        this.f14805m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i12);
        if (this.f14796d) {
            System.arraycopy(this.f14805m, 0, bArr, i8 + this.f14811s, this.f14798f);
            i9 += this.f14798f;
        } else {
            int i13 = this.f14798f;
            byte[] bArr6 = new byte[i13];
            System.arraycopy(this.f14804l, i9, bArr6, 0, i13);
            if (!E7.a.g(this.f14805m, bArr6)) {
                throw new f("mac check in GCM failed");
            }
        }
        o(false);
        return i9;
    }

    public int h(int i8) {
        int i9 = i8 + this.f14811s;
        if (this.f14796d) {
            return i9 + this.f14798f;
        }
        int i10 = this.f14798f;
        if (i9 < i10) {
            return 0;
        }
        return i9 - i10;
    }

    public void i(boolean z8, b bVar) {
        int i8;
        byte[] bArr;
        this.f14796d = z8;
        this.f14805m = null;
        this.f14797e = true;
        if (bVar instanceof C2564a) {
            C2564a c2564a = (C2564a) bVar;
            byte[] d8 = c2564a.d();
            this.f14801i = c2564a.a();
            int c8 = c2564a.c();
            if (c8 >= 32 && c8 <= 128 && c8 % 8 == 0) {
                this.f14798f = c8 / 8;
                C2566c b8 = c2564a.b();
                if (z8) {
                    i8 = 16;
                } else {
                    i8 = this.f14798f + 16;
                }
                this.f14804l = new byte[i8];
                if (d8 != null && d8.length >= 1) {
                    if (z8 && (bArr = this.f14800h) != null && E7.a.a(bArr, d8)) {
                        if (b8 != null) {
                            byte[] bArr2 = this.f14799g;
                            if (bArr2 != null && E7.a.a(bArr2, b8.a())) {
                                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                            }
                        } else {
                            throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                        }
                    }
                    this.f14800h = d8;
                    if (b8 != null) {
                        this.f14799g = b8.a();
                    }
                    if (b8 != null) {
                        this.f14793a.a(true, b8);
                        byte[] bArr3 = new byte[16];
                        this.f14802j = bArr3;
                        this.f14793a.b(bArr3, 0, bArr3, 0);
                        this.f14794b.a(this.f14802j);
                        this.f14795c = null;
                    } else if (this.f14802j == null) {
                        throw new IllegalArgumentException("Key must be specified in initial init");
                    }
                    byte[] bArr4 = new byte[16];
                    this.f14803k = bArr4;
                    byte[] bArr5 = this.f14800h;
                    if (bArr5.length == 12) {
                        System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                        this.f14803k[15] = 1;
                    } else {
                        c(bArr4, bArr5, bArr5.length);
                        byte[] bArr6 = new byte[16];
                        E7.f.i(this.f14800h.length * 8, bArr6, 8);
                        d(this.f14803k, bArr6);
                    }
                    this.f14806n = new byte[16];
                    this.f14807o = new byte[16];
                    this.f14808p = new byte[16];
                    this.f14813u = new byte[16];
                    this.f14814v = 0;
                    this.f14815w = 0L;
                    this.f14816x = 0L;
                    this.f14809q = E7.a.d(this.f14803k);
                    this.f14810r = -2;
                    this.f14811s = 0;
                    this.f14812t = 0L;
                    byte[] bArr7 = this.f14801i;
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
            byte[] bArr2 = this.f14813u;
            int i11 = this.f14814v;
            bArr2[i11] = bArr[i8 + i10];
            int i12 = i11 + 1;
            this.f14814v = i12;
            if (i12 == 16) {
                d(this.f14807o, bArr2);
                this.f14814v = 0;
                this.f14815w += 16;
            }
        }
    }

    public int m(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11;
        a();
        if (bArr.length - i8 >= i9) {
            if (this.f14796d) {
                if (this.f14811s != 0) {
                    while (i9 > 0) {
                        i9--;
                        byte[] bArr3 = this.f14804l;
                        int i12 = this.f14811s;
                        int i13 = i8 + 1;
                        bArr3[i12] = bArr[i8];
                        int i14 = i12 + 1;
                        this.f14811s = i14;
                        if (i14 == 16) {
                            l(bArr3, 0, bArr2, i10);
                            this.f14811s = 0;
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
                    System.arraycopy(bArr, i8, this.f14804l, 0, i9);
                    this.f14811s = i9;
                }
            } else {
                i11 = 0;
                for (int i15 = 0; i15 < i9; i15++) {
                    byte[] bArr4 = this.f14804l;
                    int i16 = this.f14811s;
                    bArr4[i16] = bArr[i8 + i15];
                    int i17 = i16 + 1;
                    this.f14811s = i17;
                    if (i17 == bArr4.length) {
                        l(bArr4, 0, bArr2, i10 + i11);
                        byte[] bArr5 = this.f14804l;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.f14798f);
                        this.f14811s = this.f14798f;
                        i11 += 16;
                    }
                }
            }
            return i11;
        }
        throw new Y6.d("Input buffer too short");
    }

    public C1886a(Y6.a aVar, c cVar) {
        if (aVar.c() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        cVar = cVar == null ? new e() : cVar;
        this.f14793a = aVar;
        this.f14794b = cVar;
    }
}
