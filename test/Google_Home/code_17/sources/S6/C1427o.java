package S6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1427o implements Z {

    /* renamed from: a, reason: collision with root package name */
    private byte f9927a;

    /* renamed from: b, reason: collision with root package name */
    private final T f9928b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f9929c;

    /* renamed from: d, reason: collision with root package name */
    private final C1428p f9930d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f9931e;

    public C1427o(Z source) {
        AbstractC3255y.i(source, "source");
        T t8 = new T(source);
        this.f9928b = t8;
        Inflater inflater = new Inflater(true);
        this.f9929c = inflater;
        this.f9930d = new C1428p((InterfaceC1419g) t8, inflater);
        this.f9931e = new CRC32();
    }

    private final void a(String str, int i8, int i9) {
        if (i9 == i8) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i9), Integer.valueOf(i8)}, 3));
        AbstractC3255y.h(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void b() {
        boolean z8;
        this.f9928b.require(10L);
        byte n8 = this.f9928b.f9840b.n(3L);
        if (((n8 >> 1) & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            g(this.f9928b.f9840b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f9928b.readShort());
        this.f9928b.skip(8L);
        if (((n8 >> 2) & 1) == 1) {
            this.f9928b.require(2L);
            if (z8) {
                g(this.f9928b.f9840b, 0L, 2L);
            }
            long readShortLe = this.f9928b.f9840b.readShortLe() & 65535;
            this.f9928b.require(readShortLe);
            if (z8) {
                g(this.f9928b.f9840b, 0L, readShortLe);
            }
            this.f9928b.skip(readShortLe);
        }
        if (((n8 >> 3) & 1) == 1) {
            long indexOf = this.f9928b.indexOf((byte) 0);
            if (indexOf != -1) {
                if (z8) {
                    g(this.f9928b.f9840b, 0L, indexOf + 1);
                }
                this.f9928b.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((n8 >> 4) & 1) == 1) {
            long indexOf2 = this.f9928b.indexOf((byte) 0);
            if (indexOf2 != -1) {
                if (z8) {
                    g(this.f9928b.f9840b, 0L, indexOf2 + 1);
                }
                this.f9928b.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z8) {
            a("FHCRC", this.f9928b.readShortLe(), (short) this.f9931e.getValue());
            this.f9931e.reset();
        }
    }

    private final void f() {
        a("CRC", this.f9928b.readIntLe(), (int) this.f9931e.getValue());
        a("ISIZE", this.f9928b.readIntLe(), (int) this.f9929c.getBytesWritten());
    }

    private final void g(C1417e c1417e, long j8, long j9) {
        U u8 = c1417e.f9887a;
        AbstractC3255y.f(u8);
        while (true) {
            int i8 = u8.f9846c;
            int i9 = u8.f9845b;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= i8 - i9;
            u8 = u8.f9849f;
            AbstractC3255y.f(u8);
        }
        while (j9 > 0) {
            int min = (int) Math.min(u8.f9846c - r7, j9);
            this.f9931e.update(u8.f9844a, (int) (u8.f9845b + j8), min);
            j9 -= min;
            u8 = u8.f9849f;
            AbstractC3255y.f(u8);
            j8 = 0;
        }
    }

    @Override // S6.Z
    public long C(C1417e sink, long j8) {
        AbstractC3255y.i(sink, "sink");
        if (j8 >= 0) {
            if (j8 == 0) {
                return 0L;
            }
            if (this.f9927a == 0) {
                b();
                this.f9927a = (byte) 1;
            }
            if (this.f9927a == 1) {
                long E8 = sink.E();
                long C8 = this.f9930d.C(sink, j8);
                if (C8 != -1) {
                    g(sink, E8, C8);
                    return C8;
                }
                this.f9927a = (byte) 2;
            }
            if (this.f9927a == 2) {
                f();
                this.f9927a = (byte) 3;
                if (!this.f9928b.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9930d.close();
    }

    @Override // S6.Z
    public a0 timeout() {
        return this.f9928b.timeout();
    }
}
