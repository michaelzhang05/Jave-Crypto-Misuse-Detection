package P6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1289o implements Z {

    /* renamed from: a, reason: collision with root package name */
    private byte f8096a;

    /* renamed from: b, reason: collision with root package name */
    private final T f8097b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f8098c;

    /* renamed from: d, reason: collision with root package name */
    private final C1290p f8099d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f8100e;

    public C1289o(Z source) {
        AbstractC3159y.i(source, "source");
        T t8 = new T(source);
        this.f8097b = t8;
        Inflater inflater = new Inflater(true);
        this.f8098c = inflater;
        this.f8099d = new C1290p((InterfaceC1281g) t8, inflater);
        this.f8100e = new CRC32();
    }

    private final void a(String str, int i8, int i9) {
        if (i9 == i8) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i9), Integer.valueOf(i8)}, 3));
        AbstractC3159y.h(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void b() {
        boolean z8;
        this.f8097b.require(10L);
        byte l8 = this.f8097b.f8009b.l(3L);
        if (((l8 >> 1) & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            f(this.f8097b.f8009b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f8097b.readShort());
        this.f8097b.skip(8L);
        if (((l8 >> 2) & 1) == 1) {
            this.f8097b.require(2L);
            if (z8) {
                f(this.f8097b.f8009b, 0L, 2L);
            }
            long readShortLe = this.f8097b.f8009b.readShortLe() & 65535;
            this.f8097b.require(readShortLe);
            if (z8) {
                f(this.f8097b.f8009b, 0L, readShortLe);
            }
            this.f8097b.skip(readShortLe);
        }
        if (((l8 >> 3) & 1) == 1) {
            long indexOf = this.f8097b.indexOf((byte) 0);
            if (indexOf != -1) {
                if (z8) {
                    f(this.f8097b.f8009b, 0L, indexOf + 1);
                }
                this.f8097b.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((l8 >> 4) & 1) == 1) {
            long indexOf2 = this.f8097b.indexOf((byte) 0);
            if (indexOf2 != -1) {
                if (z8) {
                    f(this.f8097b.f8009b, 0L, indexOf2 + 1);
                }
                this.f8097b.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z8) {
            a("FHCRC", this.f8097b.readShortLe(), (short) this.f8100e.getValue());
            this.f8100e.reset();
        }
    }

    private final void e() {
        a("CRC", this.f8097b.readIntLe(), (int) this.f8100e.getValue());
        a("ISIZE", this.f8097b.readIntLe(), (int) this.f8098c.getBytesWritten());
    }

    private final void f(C1279e c1279e, long j8, long j9) {
        U u8 = c1279e.f8056a;
        AbstractC3159y.f(u8);
        while (true) {
            int i8 = u8.f8015c;
            int i9 = u8.f8014b;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= i8 - i9;
            u8 = u8.f8018f;
            AbstractC3159y.f(u8);
        }
        while (j9 > 0) {
            int min = (int) Math.min(u8.f8015c - r7, j9);
            this.f8100e.update(u8.f8013a, (int) (u8.f8014b + j8), min);
            j9 -= min;
            u8 = u8.f8018f;
            AbstractC3159y.f(u8);
            j8 = 0;
        }
    }

    @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8099d.close();
    }

    @Override // P6.Z
    public a0 timeout() {
        return this.f8097b.timeout();
    }

    @Override // P6.Z
    public long y(C1279e sink, long j8) {
        AbstractC3159y.i(sink, "sink");
        if (j8 >= 0) {
            if (j8 == 0) {
                return 0L;
            }
            if (this.f8096a == 0) {
                b();
                this.f8096a = (byte) 1;
            }
            if (this.f8096a == 1) {
                long x8 = sink.x();
                long y8 = this.f8099d.y(sink, j8);
                if (y8 != -1) {
                    f(sink, x8, y8);
                    return y8;
                }
                this.f8096a = (byte) 2;
            }
            if (this.f8096a == 2) {
                e();
                this.f8096a = (byte) 3;
                if (!this.f8097b.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }
}
