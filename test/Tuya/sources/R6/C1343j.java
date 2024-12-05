package R6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: R6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1343j extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final int f8828a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8829b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f8830c;

    public C1343j(InputStream inputStream) {
        this(inputStream, E0.c(inputStream));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1351s b(int i8, x0 x0Var, byte[][] bArr) {
        if (i8 != 10) {
            if (i8 != 12) {
                if (i8 != 30) {
                    switch (i8) {
                        case 1:
                            return C1333c.w(f(x0Var, bArr));
                        case 2:
                            return new C1344k(x0Var.g(), false);
                        case 3:
                            return AbstractC1331b.w(x0Var.e(), x0Var);
                        case 4:
                            return new C1330a0(x0Var.g());
                        case 5:
                            return Y.f8796a;
                        case 6:
                            return C1347n.y(f(x0Var, bArr));
                        default:
                            switch (i8) {
                                case 18:
                                    return new Z(x0Var.g());
                                case 19:
                                    return new C1336d0(x0Var.g());
                                case 20:
                                    return new g0(x0Var.g());
                                case 21:
                                    return new k0(x0Var.g());
                                case 22:
                                    return new X(x0Var.g());
                                case 23:
                                    return new A(x0Var.g());
                                case 24:
                                    return new C1342i(x0Var.g());
                                case 25:
                                    return new W(x0Var.g());
                                case 26:
                                    return new l0(x0Var.g());
                                case 27:
                                    return new U(x0Var.g());
                                case 28:
                                    return new j0(x0Var.g());
                                default:
                                    throw new IOException("unknown tag " + i8 + " encountered");
                            }
                    }
                }
                return new P(e(x0Var));
            }
            return new i0(x0Var.g());
        }
        return C1339f.w(f(x0Var, bArr));
    }

    private static char[] e(x0 x0Var) {
        int e8 = x0Var.e();
        if ((e8 & 1) == 0) {
            int i8 = e8 / 2;
            char[] cArr = new char[i8];
            byte[] bArr = new byte[8];
            int i9 = 0;
            int i10 = 0;
            while (e8 >= 8) {
                if (G7.a.d(x0Var, bArr, 0, 8) == 8) {
                    cArr[i10] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                    cArr[i10 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                    cArr[i10 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                    cArr[i10 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                    i10 += 4;
                    e8 -= 8;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (e8 > 0) {
                if (G7.a.d(x0Var, bArr, 0, e8) != e8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                do {
                    int i11 = i9 + 1;
                    int i12 = bArr[i9] << 8;
                    i9 += 2;
                    cArr[i10] = (char) ((bArr[i11] & 255) | i12);
                    i10++;
                } while (i9 < e8);
            }
            if (x0Var.e() == 0 && i8 == i10) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    private static byte[] f(x0 x0Var, byte[][] bArr) {
        int e8 = x0Var.e();
        if (e8 >= bArr.length) {
            return x0Var.g();
        }
        byte[] bArr2 = bArr[e8];
        if (bArr2 == null) {
            bArr2 = new byte[e8];
            bArr[e8] = bArr2;
        }
        x0Var.f(bArr2);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(InputStream inputStream, int i8, boolean z8) {
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
    public static int o(InputStream inputStream, int i8) {
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

    protected AbstractC1351s a(int i8, int i9, int i10) {
        boolean z8;
        if ((i8 & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        x0 x0Var = new x0(this, i10, this.f8828a);
        if ((i8 & PsExtractor.AUDIO_STREAM) == 192) {
            return new r0(z8, i9, x0Var.g());
        }
        if ((i8 & 64) != 0) {
            return new m0(z8, i9, x0Var.g());
        }
        if ((i8 & 128) != 0) {
            return new C1357y(x0Var).c(z8, i9);
        }
        if (z8) {
            if (i9 != 4) {
                if (i9 != 8) {
                    if (i9 != 16) {
                        if (i9 == 17) {
                            return p0.b(r(x0Var));
                        }
                        throw new IOException("unknown tag " + i9 + " encountered");
                    }
                    if (this.f8829b) {
                        return new B0(x0Var.g());
                    }
                    return p0.a(r(x0Var));
                }
                return new o0(r(x0Var));
            }
            C1337e r8 = r(x0Var);
            int f8 = r8.f();
            AbstractC1348o[] abstractC1348oArr = new AbstractC1348o[f8];
            for (int i11 = 0; i11 != f8; i11++) {
                InterfaceC1335d d8 = r8.d(i11);
                if (d8 instanceof AbstractC1348o) {
                    abstractC1348oArr[i11] = (AbstractC1348o) d8;
                } else {
                    throw new C1340g("unknown object encountered in constructed OCTET STRING: " + d8.getClass());
                }
            }
            return new E(abstractC1348oArr);
        }
        return b(i9, x0Var, this.f8830c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f8828a;
    }

    protected int h() {
        return l(this, this.f8828a, false);
    }

    public AbstractC1351s m() {
        boolean z8;
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int o8 = o(this, read);
        if ((read & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int h8 = h();
        if (h8 < 0) {
            if (z8) {
                C1357y c1357y = new C1357y(new z0(this, this.f8828a), this.f8828a);
                if ((read & PsExtractor.AUDIO_STREAM) == 192) {
                    return new H(o8, c1357y).g();
                }
                if ((read & 64) != 0) {
                    return new C(o8, c1357y).g();
                }
                if ((read & 128) != 0) {
                    return new N(true, o8, c1357y).g();
                }
                if (o8 != 4) {
                    if (o8 != 8) {
                        if (o8 != 16) {
                            if (o8 == 17) {
                                return new L(c1357y).g();
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return new J(c1357y).g();
                    }
                    return new T(c1357y).g();
                }
                return new F(c1357y).g();
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        try {
            return a(read, o8, h8);
        } catch (IllegalArgumentException e8) {
            throw new C1340g("corrupted stream detected", e8);
        }
    }

    C1337e r(x0 x0Var) {
        if (x0Var.e() < 1) {
            return new C1337e(0);
        }
        C1343j c1343j = new C1343j(x0Var);
        C1337e c1337e = new C1337e();
        while (true) {
            AbstractC1351s m8 = c1343j.m();
            if (m8 != null) {
                c1337e.a(m8);
            } else {
                return c1337e;
            }
        }
    }

    public C1343j(InputStream inputStream, int i8) {
        this(inputStream, i8, false);
    }

    public C1343j(InputStream inputStream, int i8, boolean z8) {
        super(inputStream);
        this.f8828a = i8;
        this.f8829b = z8;
        this.f8830c = new byte[11];
    }

    public C1343j(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C1343j(byte[] bArr, boolean z8) {
        this(new ByteArrayInputStream(bArr), bArr.length, z8);
    }
}
