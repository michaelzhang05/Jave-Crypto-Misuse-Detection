package U6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: U6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1452j extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final int f10454a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10455b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f10456c;

    public C1452j(InputStream inputStream) {
        this(inputStream, E0.c(inputStream));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1460s b(int i8, x0 x0Var, byte[][] bArr) {
        if (i8 != 10) {
            if (i8 != 12) {
                if (i8 != 30) {
                    switch (i8) {
                        case 1:
                            return C1442c.u(g(x0Var, bArr));
                        case 2:
                            return new C1453k(x0Var.l(), false);
                        case 3:
                            return AbstractC1440b.u(x0Var.f(), x0Var);
                        case 4:
                            return new C1439a0(x0Var.l());
                        case 5:
                            return Y.f10422a;
                        case 6:
                            return C1456n.y(g(x0Var, bArr));
                        default:
                            switch (i8) {
                                case 18:
                                    return new Z(x0Var.l());
                                case 19:
                                    return new C1445d0(x0Var.l());
                                case 20:
                                    return new g0(x0Var.l());
                                case 21:
                                    return new k0(x0Var.l());
                                case 22:
                                    return new X(x0Var.l());
                                case 23:
                                    return new A(x0Var.l());
                                case 24:
                                    return new C1451i(x0Var.l());
                                case 25:
                                    return new W(x0Var.l());
                                case 26:
                                    return new l0(x0Var.l());
                                case 27:
                                    return new U(x0Var.l());
                                case 28:
                                    return new j0(x0Var.l());
                                default:
                                    throw new IOException("unknown tag " + i8 + " encountered");
                            }
                    }
                }
                return new P(f(x0Var));
            }
            return new i0(x0Var.l());
        }
        return C1448f.u(g(x0Var, bArr));
    }

    private static char[] f(x0 x0Var) {
        int f8 = x0Var.f();
        if ((f8 & 1) == 0) {
            int i8 = f8 / 2;
            char[] cArr = new char[i8];
            byte[] bArr = new byte[8];
            int i9 = 0;
            int i10 = 0;
            while (f8 >= 8) {
                if (J7.a.d(x0Var, bArr, 0, 8) == 8) {
                    cArr[i10] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                    cArr[i10 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                    cArr[i10 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                    cArr[i10 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                    i10 += 4;
                    f8 -= 8;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (f8 > 0) {
                if (J7.a.d(x0Var, bArr, 0, f8) != f8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                do {
                    int i11 = i9 + 1;
                    int i12 = bArr[i9] << 8;
                    i9 += 2;
                    cArr[i10] = (char) ((bArr[i11] & 255) | i12);
                    i10++;
                } while (i9 < f8);
            }
            if (x0Var.f() == 0 && i8 == i10) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    private static byte[] g(x0 x0Var, byte[][] bArr) {
        int f8 = x0Var.f();
        if (f8 >= bArr.length) {
            return x0Var.l();
        }
        byte[] bArr2 = bArr[f8];
        if (bArr2 == null) {
            bArr2 = new byte[f8];
            bArr[f8] = bArr2;
        }
        x0Var.g(bArr2);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(InputStream inputStream, int i8, boolean z8) {
        int read = inputStream.read();
        if (read >= 0) {
            if (read == 128) {
                return -1;
            }
            if (read > 127) {
                int i9 = read & 127;
                if (i9 <= 4) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < i9; i11++) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i10 = (i10 << 8) + read2;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (i10 >= 0) {
                        if (i10 >= i8 && !z8) {
                            throw new IOException("corrupted stream - out of bounds length found: " + i10 + " >= " + i8);
                        }
                        return i10;
                    }
                    throw new IOException("corrupted stream - negative length found");
                }
                throw new IOException("DER length more than 4 bytes: " + i9);
            }
            return read;
        }
        throw new EOFException("EOF found when length expected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(InputStream inputStream, int i8) {
        int i9 = i8 & 31;
        if (i9 == 31) {
            int read = inputStream.read();
            if ((read & 127) != 0) {
                int i10 = 0;
                while (read >= 0 && (read & 128) != 0) {
                    i10 = ((read & 127) | i10) << 7;
                    read = inputStream.read();
                }
                if (read >= 0) {
                    return i10 | (read & 127);
                }
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i9;
    }

    protected AbstractC1460s a(int i8, int i9, int i10) {
        boolean z8;
        if ((i8 & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        x0 x0Var = new x0(this, i10, this.f10454a);
        if ((i8 & PsExtractor.AUDIO_STREAM) == 192) {
            return new r0(z8, i9, x0Var.l());
        }
        if ((i8 & 64) != 0) {
            return new m0(z8, i9, x0Var.l());
        }
        if ((i8 & 128) != 0) {
            return new C1466y(x0Var).c(z8, i9);
        }
        if (z8) {
            if (i9 != 4) {
                if (i9 != 8) {
                    if (i9 != 16) {
                        if (i9 == 17) {
                            return p0.b(u(x0Var));
                        }
                        throw new IOException("unknown tag " + i9 + " encountered");
                    }
                    if (this.f10455b) {
                        return new B0(x0Var.l());
                    }
                    return p0.a(u(x0Var));
                }
                return new o0(u(x0Var));
            }
            C1446e u8 = u(x0Var);
            int f8 = u8.f();
            AbstractC1457o[] abstractC1457oArr = new AbstractC1457o[f8];
            for (int i11 = 0; i11 != f8; i11++) {
                InterfaceC1444d d8 = u8.d(i11);
                if (d8 instanceof AbstractC1457o) {
                    abstractC1457oArr[i11] = (AbstractC1457o) d8;
                } else {
                    throw new C1449g("unknown object encountered in constructed OCTET STRING: " + d8.getClass());
                }
            }
            return new E(abstractC1457oArr);
        }
        return b(i9, x0Var, this.f10456c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f10454a;
    }

    protected int m() {
        return n(this, this.f10454a, false);
    }

    public AbstractC1460s o() {
        boolean z8;
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int s8 = s(this, read);
        if ((read & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int m8 = m();
        if (m8 < 0) {
            if (z8) {
                C1466y c1466y = new C1466y(new z0(this, this.f10454a), this.f10454a);
                if ((read & PsExtractor.AUDIO_STREAM) == 192) {
                    return new H(s8, c1466y).e();
                }
                if ((read & 64) != 0) {
                    return new C(s8, c1466y).e();
                }
                if ((read & 128) != 0) {
                    return new N(true, s8, c1466y).e();
                }
                if (s8 != 4) {
                    if (s8 != 8) {
                        if (s8 != 16) {
                            if (s8 == 17) {
                                return new L(c1466y).e();
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return new J(c1466y).e();
                    }
                    return new T(c1466y).e();
                }
                return new F(c1466y).e();
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        try {
            return a(read, s8, m8);
        } catch (IllegalArgumentException e8) {
            throw new C1449g("corrupted stream detected", e8);
        }
    }

    C1446e u(x0 x0Var) {
        if (x0Var.f() < 1) {
            return new C1446e(0);
        }
        C1452j c1452j = new C1452j(x0Var);
        C1446e c1446e = new C1446e();
        while (true) {
            AbstractC1460s o8 = c1452j.o();
            if (o8 != null) {
                c1446e.a(o8);
            } else {
                return c1446e;
            }
        }
    }

    public C1452j(InputStream inputStream, int i8) {
        this(inputStream, i8, false);
    }

    public C1452j(InputStream inputStream, int i8, boolean z8) {
        super(inputStream);
        this.f10454a = i8;
        this.f10455b = z8;
        this.f10456c = new byte[11];
    }

    public C1452j(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C1452j(byte[] bArr, boolean z8) {
        this(new ByteArrayInputStream(bArr), bArr.length, z8);
    }
}
