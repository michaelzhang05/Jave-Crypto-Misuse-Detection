package L6;

import L6.d;
import P6.C1279e;
import P6.InterfaceC1280f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f6690g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1280f f6691a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6692b;

    /* renamed from: c, reason: collision with root package name */
    private final C1279e f6693c;

    /* renamed from: d, reason: collision with root package name */
    private int f6694d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6695e;

    /* renamed from: f, reason: collision with root package name */
    final d.b f6696f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(InterfaceC1280f interfaceC1280f, boolean z8) {
        this.f6691a = interfaceC1280f;
        this.f6692b = z8;
        C1279e c1279e = new C1279e();
        this.f6693c = c1279e;
        this.f6696f = new d.b(c1279e);
        this.f6694d = 16384;
    }

    private void A(int i8, long j8) {
        byte b8;
        while (j8 > 0) {
            int min = (int) Math.min(this.f6694d, j8);
            long j9 = min;
            j8 -= j9;
            if (j8 == 0) {
                b8 = 4;
            } else {
                b8 = 0;
            }
            g(i8, min, (byte) 9, b8);
            this.f6691a.C(this.f6693c, j9);
        }
    }

    private static void E(InterfaceC1280f interfaceC1280f, int i8) {
        interfaceC1280f.writeByte((i8 >>> 16) & 255);
        interfaceC1280f.writeByte((i8 >>> 8) & 255);
        interfaceC1280f.writeByte(i8 & 255);
    }

    public synchronized void a(m mVar) {
        try {
            if (!this.f6695e) {
                this.f6694d = mVar.f(this.f6694d);
                if (mVar.c() != -1) {
                    this.f6696f.e(mVar.c());
                }
                g(0, 0, (byte) 4, (byte) 1);
                this.f6691a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            if (!this.f6695e) {
                if (!this.f6692b) {
                    return;
                }
                Logger logger = f6690g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(G6.c.o(">> CONNECTION %s", e.f6572a.n()));
                }
                this.f6691a.write(e.f6572a.L());
                this.f6691a.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f6695e = true;
        this.f6691a.close();
    }

    public synchronized void e(boolean z8, int i8, C1279e c1279e, int i9) {
        byte b8;
        if (!this.f6695e) {
            if (z8) {
                b8 = (byte) 1;
            } else {
                b8 = 0;
            }
            f(i8, b8, c1279e, i9);
        } else {
            throw new IOException("closed");
        }
    }

    void f(int i8, byte b8, C1279e c1279e, int i9) {
        g(i8, i9, (byte) 0, b8);
        if (i9 > 0) {
            this.f6691a.C(c1279e, i9);
        }
    }

    public synchronized void flush() {
        if (!this.f6695e) {
            this.f6691a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void g(int i8, int i9, byte b8, byte b9) {
        Logger logger = f6690g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i8, i9, b8, b9));
        }
        int i10 = this.f6694d;
        if (i9 <= i10) {
            if ((Integer.MIN_VALUE & i8) == 0) {
                E(this.f6691a, i9);
                this.f6691a.writeByte(b8 & 255);
                this.f6691a.writeByte(b9 & 255);
                this.f6691a.writeInt(i8 & Integer.MAX_VALUE);
                return;
            }
            throw e.c("reserved bit set: %s", Integer.valueOf(i8));
        }
        throw e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i10), Integer.valueOf(i9));
    }

    public synchronized void h(int i8, b bVar, byte[] bArr) {
        try {
            if (!this.f6695e) {
                if (bVar.f6542a != -1) {
                    g(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f6691a.writeInt(i8);
                    this.f6691a.writeInt(bVar.f6542a);
                    if (bArr.length > 0) {
                        this.f6691a.write(bArr);
                    }
                    this.f6691a.flush();
                } else {
                    throw e.c("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void l(boolean z8, int i8, List list) {
        byte b8;
        if (!this.f6695e) {
            this.f6696f.g(list);
            long x8 = this.f6693c.x();
            int min = (int) Math.min(this.f6694d, x8);
            long j8 = min;
            if (x8 == j8) {
                b8 = 4;
            } else {
                b8 = 0;
            }
            if (z8) {
                b8 = (byte) (b8 | 1);
            }
            g(i8, min, (byte) 1, b8);
            this.f6691a.C(this.f6693c, j8);
            if (x8 > j8) {
                A(i8, x8 - j8);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public int m() {
        return this.f6694d;
    }

    public synchronized void o(boolean z8, int i8, int i9) {
        if (!this.f6695e) {
            g(0, 8, (byte) 6, z8 ? (byte) 1 : (byte) 0);
            this.f6691a.writeInt(i8);
            this.f6691a.writeInt(i9);
            this.f6691a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void r(int i8, int i9, List list) {
        byte b8;
        if (!this.f6695e) {
            this.f6696f.g(list);
            long x8 = this.f6693c.x();
            int min = (int) Math.min(this.f6694d - 4, x8);
            long j8 = min;
            if (x8 == j8) {
                b8 = 4;
            } else {
                b8 = 0;
            }
            g(i8, min + 4, (byte) 5, b8);
            this.f6691a.writeInt(i9 & Integer.MAX_VALUE);
            this.f6691a.C(this.f6693c, j8);
            if (x8 > j8) {
                A(i8, x8 - j8);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void t(int i8, b bVar) {
        if (!this.f6695e) {
            if (bVar.f6542a != -1) {
                g(i8, 4, (byte) 3, (byte) 0);
                this.f6691a.writeInt(bVar.f6542a);
                this.f6691a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void u(m mVar) {
        int i8;
        try {
            if (!this.f6695e) {
                g(0, mVar.j() * 6, (byte) 4, (byte) 0);
                for (int i9 = 0; i9 < 10; i9++) {
                    if (mVar.g(i9)) {
                        if (i9 == 4) {
                            i8 = 3;
                        } else if (i9 == 7) {
                            i8 = 4;
                        } else {
                            i8 = i9;
                        }
                        this.f6691a.writeShort(i8);
                        this.f6691a.writeInt(mVar.b(i9));
                    }
                }
                this.f6691a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void w(boolean z8, int i8, int i9, List list) {
        if (!this.f6695e) {
            l(z8, i8, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void x(int i8, long j8) {
        if (!this.f6695e) {
            if (j8 != 0 && j8 <= 2147483647L) {
                g(i8, 4, (byte) 8, (byte) 0);
                this.f6691a.writeInt((int) j8);
                this.f6691a.flush();
            } else {
                throw e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j8));
            }
        } else {
            throw new IOException("closed");
        }
    }
}
