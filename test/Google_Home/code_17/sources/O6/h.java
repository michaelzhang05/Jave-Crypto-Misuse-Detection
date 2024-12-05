package O6;

import O6.d;
import S6.C1417e;
import S6.C1420h;
import S6.InterfaceC1419g;
import S6.Z;
import S6.a0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    static final Logger f8447e = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1419g f8448a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8449b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8450c;

    /* renamed from: d, reason: collision with root package name */
    final d.a f8451d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface b {
        void a(int i8, O6.b bVar);

        void ackSettings();

        void b(boolean z8, m mVar);

        void c(boolean z8, int i8, InterfaceC1419g interfaceC1419g, int i9);

        void d(int i8, O6.b bVar, C1420h c1420h);

        void headers(boolean z8, int i8, int i9, List list);

        void ping(boolean z8, int i8, int i9);

        void priority(int i8, int i9, int i10, boolean z8);

        void pushPromise(int i8, int i9, List list);

        void windowUpdate(int i8, long j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(InterfaceC1419g interfaceC1419g, boolean z8) {
        this.f8448a = interfaceC1419g;
        this.f8450c = z8;
        a aVar = new a(interfaceC1419g);
        this.f8449b = aVar;
        this.f8451d = new d.a(4096, aVar);
    }

    private void A(b bVar, int i8, byte b8, int i9) {
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
                    int readShort = this.f8448a.readShort() & 65535;
                    int readInt = this.f8448a.readInt();
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
                bVar.b(false, mVar);
                return;
            }
            throw e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i8));
        }
        throw e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
    }

    private void D(b bVar, int i8, byte b8, int i9) {
        if (i8 == 4) {
            long readInt = this.f8448a.readInt() & 2147483647L;
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

    private void g(b bVar, int i8, byte b8, int i9) {
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
                    s8 = (short) (this.f8448a.readByte() & 255);
                }
                bVar.c(z8, i9, this.f8448a, a(i8, b8, s8));
                this.f8448a.skip(s8);
                return;
            }
            throw e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void l(b bVar, int i8, byte b8, int i9) {
        if (i8 >= 8) {
            if (i9 == 0) {
                int readInt = this.f8448a.readInt();
                int readInt2 = this.f8448a.readInt();
                int i10 = i8 - 8;
                O6.b a8 = O6.b.a(readInt2);
                if (a8 != null) {
                    C1420h c1420h = C1420h.f9898e;
                    if (i10 > 0) {
                        c1420h = this.f8448a.readByteString(i10);
                    }
                    bVar.d(readInt, a8, c1420h);
                    return;
                }
                throw e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            throw e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        throw e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i8));
    }

    private List m(int i8, short s8, byte b8, int i9) {
        a aVar = this.f8449b;
        aVar.f8456e = i8;
        aVar.f8453b = i8;
        aVar.f8457f = s8;
        aVar.f8454c = b8;
        aVar.f8455d = i9;
        this.f8451d.k();
        return this.f8451d.e();
    }

    private void n(b bVar, int i8, byte b8, int i9) {
        boolean z8;
        short s8 = 0;
        if (i9 != 0) {
            if ((b8 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((b8 & 8) != 0) {
                s8 = (short) (this.f8448a.readByte() & 255);
            }
            if ((b8 & 32) != 0) {
                u(bVar, i9);
                i8 -= 5;
            }
            bVar.headers(z8, i9, -1, m(a(i8, b8, s8), s8, b8, i9));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    static int o(InterfaceC1419g interfaceC1419g) {
        return (interfaceC1419g.readByte() & 255) | ((interfaceC1419g.readByte() & 255) << 16) | ((interfaceC1419g.readByte() & 255) << 8);
    }

    private void s(b bVar, int i8, byte b8, int i9) {
        boolean z8 = true;
        if (i8 == 8) {
            if (i9 == 0) {
                int readInt = this.f8448a.readInt();
                int readInt2 = this.f8448a.readInt();
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

    private void u(b bVar, int i8) {
        boolean z8;
        int readInt = this.f8448a.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        bVar.priority(i8, readInt & Integer.MAX_VALUE, (this.f8448a.readByte() & 255) + 1, z8);
    }

    private void v(b bVar, int i8, byte b8, int i9) {
        if (i8 == 5) {
            if (i9 != 0) {
                u(bVar, i9);
                return;
            }
            throw e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        throw e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i8));
    }

    private void x(b bVar, int i8, byte b8, int i9) {
        short s8 = 0;
        if (i9 != 0) {
            if ((b8 & 8) != 0) {
                s8 = (short) (this.f8448a.readByte() & 255);
            }
            bVar.pushPromise(i9, this.f8448a.readInt() & Integer.MAX_VALUE, m(a(i8 - 4, b8, s8), s8, b8, i9));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void y(b bVar, int i8, byte b8, int i9) {
        if (i8 == 4) {
            if (i9 != 0) {
                int readInt = this.f8448a.readInt();
                O6.b a8 = O6.b.a(readInt);
                if (a8 != null) {
                    bVar.a(i9, a8);
                    return;
                }
                throw e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            throw e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        throw e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i8));
    }

    public boolean b(boolean z8, b bVar) {
        try {
            this.f8448a.require(9L);
            int o8 = o(this.f8448a);
            if (o8 >= 0 && o8 <= 16384) {
                byte readByte = (byte) (this.f8448a.readByte() & 255);
                if (z8 && readByte != 4) {
                    throw e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                }
                byte readByte2 = (byte) (this.f8448a.readByte() & 255);
                int readInt = this.f8448a.readInt() & Integer.MAX_VALUE;
                Logger logger = f8447e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.b(true, readInt, o8, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        g(bVar, o8, readByte2, readInt);
                        return true;
                    case 1:
                        n(bVar, o8, readByte2, readInt);
                        return true;
                    case 2:
                        v(bVar, o8, readByte2, readInt);
                        return true;
                    case 3:
                        y(bVar, o8, readByte2, readInt);
                        return true;
                    case 4:
                        A(bVar, o8, readByte2, readInt);
                        return true;
                    case 5:
                        x(bVar, o8, readByte2, readInt);
                        return true;
                    case 6:
                        s(bVar, o8, readByte2, readInt);
                        return true;
                    case 7:
                        l(bVar, o8, readByte2, readInt);
                        return true;
                    case 8:
                        D(bVar, o8, readByte2, readInt);
                        return true;
                    default:
                        this.f8448a.skip(o8);
                        return true;
                }
            }
            throw e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(o8));
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8448a.close();
    }

    public void f(b bVar) {
        if (this.f8450c) {
            if (!b(true, bVar)) {
                throw e.d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC1419g interfaceC1419g = this.f8448a;
        C1420h c1420h = e.f8363a;
        C1420h readByteString = interfaceC1419g.readByteString(c1420h.K());
        Logger logger = f8447e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(J6.c.o("<< CONNECTION %s", readByteString.n()));
        }
        if (c1420h.equals(readByteString)) {
        } else {
            throw e.d("Expected a connection header but was %s", readByteString.Q());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1419g f8452a;

        /* renamed from: b, reason: collision with root package name */
        int f8453b;

        /* renamed from: c, reason: collision with root package name */
        byte f8454c;

        /* renamed from: d, reason: collision with root package name */
        int f8455d;

        /* renamed from: e, reason: collision with root package name */
        int f8456e;

        /* renamed from: f, reason: collision with root package name */
        short f8457f;

        a(InterfaceC1419g interfaceC1419g) {
            this.f8452a = interfaceC1419g;
        }

        private void a() {
            int i8 = this.f8455d;
            int o8 = h.o(this.f8452a);
            this.f8456e = o8;
            this.f8453b = o8;
            byte readByte = (byte) (this.f8452a.readByte() & 255);
            this.f8454c = (byte) (this.f8452a.readByte() & 255);
            Logger logger = h.f8447e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f8455d, this.f8453b, readByte, this.f8454c));
            }
            int readInt = this.f8452a.readInt() & Integer.MAX_VALUE;
            this.f8455d = readInt;
            if (readByte == 9) {
                if (readInt == i8) {
                    return;
                } else {
                    throw e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            throw e.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
        }

        @Override // S6.Z
        public long C(C1417e c1417e, long j8) {
            while (true) {
                int i8 = this.f8456e;
                if (i8 == 0) {
                    this.f8452a.skip(this.f8457f);
                    this.f8457f = (short) 0;
                    if ((this.f8454c & 4) != 0) {
                        return -1L;
                    }
                    a();
                } else {
                    long C8 = this.f8452a.C(c1417e, Math.min(j8, i8));
                    if (C8 == -1) {
                        return -1L;
                    }
                    this.f8456e = (int) (this.f8456e - C8);
                    return C8;
                }
            }
        }

        @Override // S6.Z
        public a0 timeout() {
            return this.f8452a.timeout();
        }

        @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
