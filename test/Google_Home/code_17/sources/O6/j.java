package O6;

import O6.d;
import S6.C1417e;
import S6.InterfaceC1418f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f8481g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1418f f8482a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8483b;

    /* renamed from: c, reason: collision with root package name */
    private final C1417e f8484c;

    /* renamed from: d, reason: collision with root package name */
    private int f8485d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8486e;

    /* renamed from: f, reason: collision with root package name */
    final d.b f8487f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(InterfaceC1418f interfaceC1418f, boolean z8) {
        this.f8482a = interfaceC1418f;
        this.f8483b = z8;
        C1417e c1417e = new C1417e();
        this.f8484c = c1417e;
        this.f8487f = new d.b(c1417e);
        this.f8485d = 16384;
    }

    private void D(int i8, long j8) {
        byte b8;
        while (j8 > 0) {
            int min = (int) Math.min(this.f8485d, j8);
            long j9 = min;
            j8 -= j9;
            if (j8 == 0) {
                b8 = 4;
            } else {
                b8 = 0;
            }
            l(i8, min, (byte) 9, b8);
            this.f8482a.h(this.f8484c, j9);
        }
    }

    private static void E(InterfaceC1418f interfaceC1418f, int i8) {
        interfaceC1418f.writeByte((i8 >>> 16) & 255);
        interfaceC1418f.writeByte((i8 >>> 8) & 255);
        interfaceC1418f.writeByte(i8 & 255);
    }

    public synchronized void A(int i8, long j8) {
        if (!this.f8486e) {
            if (j8 != 0 && j8 <= 2147483647L) {
                l(i8, 4, (byte) 8, (byte) 0);
                this.f8482a.writeInt((int) j8);
                this.f8482a.flush();
            } else {
                throw e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j8));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(m mVar) {
        try {
            if (!this.f8486e) {
                this.f8485d = mVar.f(this.f8485d);
                if (mVar.c() != -1) {
                    this.f8487f.e(mVar.c());
                }
                l(0, 0, (byte) 4, (byte) 1);
                this.f8482a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            if (!this.f8486e) {
                if (!this.f8483b) {
                    return;
                }
                Logger logger = f8481g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(J6.c.o(">> CONNECTION %s", e.f8363a.n()));
                }
                this.f8482a.write(e.f8363a.P());
                this.f8482a.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f8486e = true;
        this.f8482a.close();
    }

    public synchronized void f(boolean z8, int i8, C1417e c1417e, int i9) {
        byte b8;
        if (!this.f8486e) {
            if (z8) {
                b8 = (byte) 1;
            } else {
                b8 = 0;
            }
            g(i8, b8, c1417e, i9);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void flush() {
        if (!this.f8486e) {
            this.f8482a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    void g(int i8, byte b8, C1417e c1417e, int i9) {
        l(i8, i9, (byte) 0, b8);
        if (i9 > 0) {
            this.f8482a.h(c1417e, i9);
        }
    }

    public void l(int i8, int i9, byte b8, byte b9) {
        Logger logger = f8481g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i8, i9, b8, b9));
        }
        int i10 = this.f8485d;
        if (i9 <= i10) {
            if ((Integer.MIN_VALUE & i8) == 0) {
                E(this.f8482a, i9);
                this.f8482a.writeByte(b8 & 255);
                this.f8482a.writeByte(b9 & 255);
                this.f8482a.writeInt(i8 & Integer.MAX_VALUE);
                return;
            }
            throw e.c("reserved bit set: %s", Integer.valueOf(i8));
        }
        throw e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i10), Integer.valueOf(i9));
    }

    public synchronized void m(int i8, b bVar, byte[] bArr) {
        try {
            if (!this.f8486e) {
                if (bVar.f8333a != -1) {
                    l(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f8482a.writeInt(i8);
                    this.f8482a.writeInt(bVar.f8333a);
                    if (bArr.length > 0) {
                        this.f8482a.write(bArr);
                    }
                    this.f8482a.flush();
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

    void n(boolean z8, int i8, List list) {
        byte b8;
        if (!this.f8486e) {
            this.f8487f.g(list);
            long E8 = this.f8484c.E();
            int min = (int) Math.min(this.f8485d, E8);
            long j8 = min;
            if (E8 == j8) {
                b8 = 4;
            } else {
                b8 = 0;
            }
            if (z8) {
                b8 = (byte) (b8 | 1);
            }
            l(i8, min, (byte) 1, b8);
            this.f8482a.h(this.f8484c, j8);
            if (E8 > j8) {
                D(i8, E8 - j8);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public int o() {
        return this.f8485d;
    }

    public synchronized void s(boolean z8, int i8, int i9) {
        if (!this.f8486e) {
            l(0, 8, (byte) 6, z8 ? (byte) 1 : (byte) 0);
            this.f8482a.writeInt(i8);
            this.f8482a.writeInt(i9);
            this.f8482a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void u(int i8, int i9, List list) {
        byte b8;
        if (!this.f8486e) {
            this.f8487f.g(list);
            long E8 = this.f8484c.E();
            int min = (int) Math.min(this.f8485d - 4, E8);
            long j8 = min;
            if (E8 == j8) {
                b8 = 4;
            } else {
                b8 = 0;
            }
            l(i8, min + 4, (byte) 5, b8);
            this.f8482a.writeInt(i9 & Integer.MAX_VALUE);
            this.f8482a.h(this.f8484c, j8);
            if (E8 > j8) {
                D(i8, E8 - j8);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void v(int i8, b bVar) {
        if (!this.f8486e) {
            if (bVar.f8333a != -1) {
                l(i8, 4, (byte) 3, (byte) 0);
                this.f8482a.writeInt(bVar.f8333a);
                this.f8482a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void x(m mVar) {
        int i8;
        try {
            if (!this.f8486e) {
                l(0, mVar.j() * 6, (byte) 4, (byte) 0);
                for (int i9 = 0; i9 < 10; i9++) {
                    if (mVar.g(i9)) {
                        if (i9 == 4) {
                            i8 = 3;
                        } else if (i9 == 7) {
                            i8 = 4;
                        } else {
                            i8 = i9;
                        }
                        this.f8482a.writeShort(i8);
                        this.f8482a.writeInt(mVar.b(i9));
                    }
                }
                this.f8482a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void y(boolean z8, int i8, int i9, List list) {
        if (!this.f8486e) {
            n(z8, i8, list);
        } else {
            throw new IOException("closed");
        }
    }
}
