package R6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: R6.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1357y {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f8864a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8865b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f8866c;

    public C1357y(InputStream inputStream) {
        this(inputStream, E0.c(inputStream));
    }

    private void e(boolean z8) {
        InputStream inputStream = this.f8864a;
        if (inputStream instanceof z0) {
            ((z0) inputStream).f(z8);
        }
    }

    InterfaceC1335d a(int i8) {
        if (i8 != 4) {
            if (i8 != 8) {
                if (i8 != 16) {
                    if (i8 == 17) {
                        return new L(this);
                    }
                    throw new C1340g("unknown BER object encountered: 0x" + Integer.toHexString(i8));
                }
                return new J(this);
            }
            return new T(this);
        }
        return new F(this);
    }

    public InterfaceC1335d b() {
        boolean z8;
        int read = this.f8864a.read();
        if (read == -1) {
            return null;
        }
        boolean z9 = false;
        e(false);
        int o8 = C1343j.o(this.f8864a, read);
        if ((read & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        InputStream inputStream = this.f8864a;
        int i8 = this.f8865b;
        if (o8 == 4 || o8 == 16 || o8 == 17 || o8 == 8) {
            z9 = true;
        }
        int l8 = C1343j.l(inputStream, i8, z9);
        if (l8 < 0) {
            if (z8) {
                C1357y c1357y = new C1357y(new z0(this.f8864a, this.f8865b), this.f8865b);
                if ((read & PsExtractor.AUDIO_STREAM) == 192) {
                    return new H(o8, c1357y);
                }
                if ((read & 64) != 0) {
                    return new C(o8, c1357y);
                }
                if ((read & 128) != 0) {
                    return new N(true, o8, c1357y);
                }
                return c1357y.a(o8);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        x0 x0Var = new x0(this.f8864a, l8, this.f8865b);
        if ((read & PsExtractor.AUDIO_STREAM) == 192) {
            return new r0(z8, o8, x0Var.g());
        }
        if ((read & 64) != 0) {
            return new m0(z8, o8, x0Var.g());
        }
        if ((read & 128) != 0) {
            return new N(z8, o8, new C1357y(x0Var));
        }
        if (z8) {
            if (o8 != 4) {
                if (o8 != 8) {
                    if (o8 != 16) {
                        if (o8 == 17) {
                            return new v0(new C1357y(x0Var));
                        }
                        throw new IOException("unknown tag " + o8 + " encountered");
                    }
                    return new t0(new C1357y(x0Var));
                }
                return new T(new C1357y(x0Var));
            }
            return new F(new C1357y(x0Var));
        }
        if (o8 != 4) {
            try {
                return C1343j.b(o8, x0Var, this.f8866c);
            } catch (IllegalArgumentException e8) {
                throw new C1340g("corrupted stream detected", e8);
            }
        }
        return new C1332b0(x0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1351s c(boolean z8, int i8) {
        if (!z8) {
            return new w0(false, i8, new C1330a0(((x0) this.f8864a).g()));
        }
        C1337e d8 = d();
        if (this.f8864a instanceof z0) {
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
    public C1337e d() {
        AbstractC1351s d8;
        InterfaceC1335d b8 = b();
        if (b8 == null) {
            return new C1337e(0);
        }
        C1337e c1337e = new C1337e();
        do {
            if (b8 instanceof y0) {
                d8 = ((y0) b8).g();
            } else {
                d8 = b8.d();
            }
            c1337e.a(d8);
            b8 = b();
        } while (b8 != null);
        return c1337e;
    }

    public C1357y(InputStream inputStream, int i8) {
        this.f8864a = inputStream;
        this.f8865b = i8;
        this.f8866c = new byte[11];
    }
}
