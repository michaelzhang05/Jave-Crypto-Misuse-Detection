package U6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: U6.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1466y {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f10490a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10491b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f10492c;

    public C1466y(InputStream inputStream) {
        this(inputStream, E0.c(inputStream));
    }

    private void e(boolean z8) {
        InputStream inputStream = this.f10490a;
        if (inputStream instanceof z0) {
            ((z0) inputStream).g(z8);
        }
    }

    InterfaceC1444d a(int i8) {
        if (i8 != 4) {
            if (i8 != 8) {
                if (i8 != 16) {
                    if (i8 == 17) {
                        return new L(this);
                    }
                    throw new C1449g("unknown BER object encountered: 0x" + Integer.toHexString(i8));
                }
                return new J(this);
            }
            return new T(this);
        }
        return new F(this);
    }

    public InterfaceC1444d b() {
        boolean z8;
        int read = this.f10490a.read();
        if (read == -1) {
            return null;
        }
        boolean z9 = false;
        e(false);
        int s8 = C1452j.s(this.f10490a, read);
        if ((read & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        InputStream inputStream = this.f10490a;
        int i8 = this.f10491b;
        if (s8 == 4 || s8 == 16 || s8 == 17 || s8 == 8) {
            z9 = true;
        }
        int n8 = C1452j.n(inputStream, i8, z9);
        if (n8 < 0) {
            if (z8) {
                C1466y c1466y = new C1466y(new z0(this.f10490a, this.f10491b), this.f10491b);
                if ((read & PsExtractor.AUDIO_STREAM) == 192) {
                    return new H(s8, c1466y);
                }
                if ((read & 64) != 0) {
                    return new C(s8, c1466y);
                }
                if ((read & 128) != 0) {
                    return new N(true, s8, c1466y);
                }
                return c1466y.a(s8);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        x0 x0Var = new x0(this.f10490a, n8, this.f10491b);
        if ((read & PsExtractor.AUDIO_STREAM) == 192) {
            return new r0(z8, s8, x0Var.l());
        }
        if ((read & 64) != 0) {
            return new m0(z8, s8, x0Var.l());
        }
        if ((read & 128) != 0) {
            return new N(z8, s8, new C1466y(x0Var));
        }
        if (z8) {
            if (s8 != 4) {
                if (s8 != 8) {
                    if (s8 != 16) {
                        if (s8 == 17) {
                            return new v0(new C1466y(x0Var));
                        }
                        throw new IOException("unknown tag " + s8 + " encountered");
                    }
                    return new t0(new C1466y(x0Var));
                }
                return new T(new C1466y(x0Var));
            }
            return new F(new C1466y(x0Var));
        }
        if (s8 != 4) {
            try {
                return C1452j.b(s8, x0Var, this.f10492c);
            } catch (IllegalArgumentException e8) {
                throw new C1449g("corrupted stream detected", e8);
            }
        }
        return new C1441b0(x0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1460s c(boolean z8, int i8) {
        if (!z8) {
            return new w0(false, i8, new C1439a0(((x0) this.f10490a).l()));
        }
        C1446e d8 = d();
        if (this.f10490a instanceof z0) {
            if (d8.f() == 1) {
                return new M(true, i8, d8.d(0));
            }
            return new M(false, i8, D.a(d8));
        }
        if (d8.f() == 1) {
            return new w0(true, i8, d8.d(0));
        }
        return new w0(false, i8, p0.a(d8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1446e d() {
        AbstractC1460s d8;
        InterfaceC1444d b8 = b();
        if (b8 == null) {
            return new C1446e(0);
        }
        C1446e c1446e = new C1446e();
        do {
            if (b8 instanceof y0) {
                d8 = ((y0) b8).e();
            } else {
                d8 = b8.d();
            }
            c1446e.a(d8);
            b8 = b();
        } while (b8 != null);
        return c1446e;
    }

    public C1466y(InputStream inputStream, int i8) {
        this.f10490a = inputStream;
        this.f10491b = i8;
        this.f10492c = new byte[11];
    }
}
