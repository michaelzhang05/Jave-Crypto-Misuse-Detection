package L6;

import L6.d;
import P6.C1279e;
import P6.C1282h;
import P6.InterfaceC1281g;
import P6.Z;
import P6.a0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    static final Logger f6656e = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1281g f6657a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6658b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6659c;

    /* renamed from: d, reason: collision with root package name */
    final d.a f6660d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z8, int i8, InterfaceC1281g interfaceC1281g, int i9);

        void ackSettings();

        void b(int i8, L6.b bVar, C1282h c1282h);

        void c(int i8, L6.b bVar);

        void d(boolean z8, m mVar);

        void headers(boolean z8, int i8, int i9, List list);

        void ping(boolean z8, int i8, int i9);

        void priority(int i8, int i9, int i10, boolean z8);

        void pushPromise(int i8, int i9, List list);

        void windowUpdate(int i8, long j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(InterfaceC1281g interfaceC1281g, boolean z8) {
        this.f6657a = interfaceC1281g;
        this.f6659c = z8;
        a aVar = new a(interfaceC1281g);
        this.f6658b = aVar;
        this.f6660d = new d.a(4096, aVar);
    }

    private void A(b bVar, int i8, byte b8, int i9) {
        if (i8 == 4) {
            long readInt = this.f6657a.readInt() & 2147483647L;
            if (readInt != 0) {
                bVar.windowUpdate(i9, readInt);
                return;
            }
            throw e.d("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        throw e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i8));
    }

    static int a(int i8, byte b8, short s8) {
        if ((b8 & 8) != 0) {
            i8--;
        }
        if (s8 <= i8) {
            return (short) (i8 - s8);
        }
        throw e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s8), Integer.valueOf(i8));
    }

    private void f(b bVar, int i8, byte b8, int i9) {
        boolean z8;
        short s8 = 0;
        if (i9 != 0) {
            if ((b8 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((b8 & 32) == 0) {
                if ((b8 & 8) != 0) {
                    s8 = (short) (this.f6657a.readByte() & 255);
                }
                bVar.a(z8, i9, this.f6657a, a(i8, b8, s8));
                this.f6657a.skip(s8);
                return;
            }
            throw e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void g(b bVar, int i8, byte b8, int i9) {
        if (i8 >= 8) {
            if (i9 == 0) {
                int readInt = this.f6657a.readInt();
                int readInt2 = this.f6657a.readInt();
                int i10 = i8 - 8;
                L6.b a8 = L6.b.a(readInt2);
                if (a8 != null) {
                    C1282h c1282h = C1282h.f8067e;
                    if (i10 > 0) {
                        c1282h = this.f6657a.readByteString(i10);
                    }
                    bVar.b(readInt, a8, c1282h);
                    return;
                }
                throw e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            throw e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        throw e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i8));
    }

    private List h(int i8, short s8, byte b8, int i9) {
        a aVar = this.f6658b;
        aVar.f6665e = i8;
        aVar.f6662b = i8;
        aVar.f6666f = s8;
        aVar.f6663c = b8;
        aVar.f6664d = i9;
        this.f6660d.k();
        return this.f6660d.e();
    }

    private void l(b bVar, int i8, byte b8, int i9) {
        boolean z8;
        short s8 = 0;
        if (i9 != 0) {
            if ((b8 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((b8 & 8) != 0) {
                s8 = (short) (this.f6657a.readByte() & 255);
            }
            if ((b8 & 32) != 0) {
                r(bVar, i9);
                i8 -= 5;
            }
            bVar.headers(z8, i9, -1, h(a(i8, b8, s8), s8, b8, i9));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    static int m(InterfaceC1281g interfaceC1281g) {
        return (interfaceC1281g.readByte() & 255) | ((interfaceC1281g.readByte() & 255) << 16) | ((interfaceC1281g.readByte() & 255) << 8);
    }

    private void o(b bVar, int i8, byte b8, int i9) {
        boolean z8 = true;
        if (i8 == 8) {
            if (i9 == 0) {
                int readInt = this.f6657a.readInt();
                int readInt2 = this.f6657a.readInt();
                if ((b8 & 1) == 0) {
                    z8 = false;
                }
                bVar.ping(z8, readInt, readInt2);
                return;
            }
            throw e.d("TYPE_PING streamId != 0", new Object[0]);
        }
        throw e.d("TYPE_PING length != 8: %s", Integer.valueOf(i8));
    }

    private void r(b bVar, int i8) {
        boolean z8;
        int readInt = this.f6657a.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        bVar.priority(i8, readInt & Integer.MAX_VALUE, (this.f6657a.readByte() & 255) + 1, z8);
    }

    private void t(b bVar, int i8, byte b8, int i9) {
        if (i8 == 5) {
            if (i9 != 0) {
                r(bVar, i9);
                return;
            }
            throw e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        throw e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i8));
    }

    private void u(b bVar, int i8, byte b8, int i9) {
        short s8 = 0;
        if (i9 != 0) {
            if ((b8 & 8) != 0) {
                s8 = (short) (this.f6657a.readByte() & 255);
            }
            bVar.pushPromise(i9, this.f6657a.readInt() & Integer.MAX_VALUE, h(a(i8 - 4, b8, s8), s8, b8, i9));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void w(b bVar, int i8, byte b8, int i9) {
        if (i8 == 4) {
            if (i9 != 0) {
                int readInt = this.f6657a.readInt();
                L6.b a8 = L6.b.a(readInt);
                if (a8 != null) {
                    bVar.c(i9, a8);
                    return;
                }
                throw e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            throw e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        throw e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i8));
    }

    private void x(b bVar, int i8, byte b8, int i9) {
        if (i9 == 0) {
            if ((b8 & 1) != 0) {
                if (i8 == 0) {
                    bVar.ackSettings();
                    return;
                }
                throw e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            if (i8 % 6 == 0) {
                m mVar = new m();
                for (int i10 = 0; i10 < i8; i10 += 6) {
                    int readShort = this.f6657a.readShort() & 65535;
                    int readInt = this.f6657a.readInt();
                    if (readShort != 2) {
                        if (readShort != 3) {
                            if (readShort != 4) {
                                if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                                    throw e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                                }
                            } else if (readInt >= 0) {
                                readShort = 7;
                            } else {
                                throw e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        } else {
                            readShort = 4;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                    mVar.i(readShort, readInt);
                }
                bVar.d(false, mVar);
                return;
            }
            throw e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i8));
        }
        throw e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
    }

    public boolean b(boolean z8, b bVar) {
        try {
            this.f6657a.require(9L);
            int m8 = m(this.f6657a);
            if (m8 >= 0 && m8 <= 16384) {
                byte readByte = (byte) (this.f6657a.readByte() & 255);
                if (z8 && readByte != 4) {
                    throw e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                }
                byte readByte2 = (byte) (this.f6657a.readByte() & 255);
                int readInt = this.f6657a.readInt() & Integer.MAX_VALUE;
                Logger logger = f6656e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.b(true, readInt, m8, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        f(bVar, m8, readByte2, readInt);
                        return true;
                    case 1:
                        l(bVar, m8, readByte2, readInt);
                        return true;
                    case 2:
                        t(bVar, m8, readByte2, readInt);
                        return true;
                    case 3:
                        w(bVar, m8, readByte2, readInt);
                        return true;
                    case 4:
                        x(bVar, m8, readByte2, readInt);
                        return true;
                    case 5:
                        u(bVar, m8, readByte2, readInt);
                        return true;
                    case 6:
                        o(bVar, m8, readByte2, readInt);
                        return true;
                    case 7:
                        g(bVar, m8, readByte2, readInt);
                        return true;
                    case 8:
                        A(bVar, m8, readByte2, readInt);
                        return true;
                    default:
                        this.f6657a.skip(m8);
                        return true;
                }
            }
            throw e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(m8));
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6657a.close();
    }

    public void e(b bVar) {
        if (this.f6659c) {
            if (!b(true, bVar)) {
                throw e.d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC1281g interfaceC1281g = this.f6657a;
        C1282h c1282h = e.f6572a;
        C1282h readByteString = interfaceC1281g.readByteString(c1282h.F());
        Logger logger = f6656e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(G6.c.o("<< CONNECTION %s", readByteString.n()));
        }
        if (c1282h.equals(readByteString)) {
        } else {
            throw e.d("Expected a connection header but was %s", readByteString.M());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1281g f6661a;

        /* renamed from: b, reason: collision with root package name */
        int f6662b;

        /* renamed from: c, reason: collision with root package name */
        byte f6663c;

        /* renamed from: d, reason: collision with root package name */
        int f6664d;

        /* renamed from: e, reason: collision with root package name */
        int f6665e;

        /* renamed from: f, reason: collision with root package name */
        short f6666f;

        a(InterfaceC1281g interfaceC1281g) {
            this.f6661a = interfaceC1281g;
        }

        private void a() {
            int i8 = this.f6664d;
            int m8 = h.m(this.f6661a);
            this.f6665e = m8;
            this.f6662b = m8;
            byte readByte = (byte) (this.f6661a.readByte() & 255);
            this.f6663c = (byte) (this.f6661a.readByte() & 255);
            Logger logger = h.f6656e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f6664d, this.f6662b, readByte, this.f6663c));
            }
            int readInt = this.f6661a.readInt() & Integer.MAX_VALUE;
            this.f6664d = readInt;
            if (readByte == 9) {
                if (readInt == i8) {
                    return;
                } else {
                    throw e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            throw e.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
        }

        @Override // P6.Z
        public a0 timeout() {
            return this.f6661a.timeout();
        }

        @Override // P6.Z
        public long y(C1279e c1279e, long j8) {
            while (true) {
                int i8 = this.f6665e;
                if (i8 == 0) {
                    this.f6661a.skip(this.f6666f);
                    this.f6666f = (short) 0;
                    if ((this.f6663c & 4) != 0) {
                        return -1L;
                    }
                    a();
                } else {
                    long y8 = this.f6661a.y(c1279e, Math.min(j8, i8));
                    if (y8 == -1) {
                        return -1L;
                    }
                    this.f6665e = (int) (this.f6665e - y8);
                    return y8;
                }
            }
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
