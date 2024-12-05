package S6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class S implements InterfaceC1418f {

    /* renamed from: a, reason: collision with root package name */
    public final X f9835a;

    /* renamed from: b, reason: collision with root package name */
    public final C1417e f9836b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9837c;

    public S(X sink) {
        AbstractC3255y.i(sink, "sink");
        this.f9835a = sink;
        this.f9836b = new C1417e();
    }

    @Override // S6.InterfaceC1418f
    public C1417e buffer() {
        return this.f9836b;
    }

    @Override // S6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f9837c) {
            try {
                if (this.f9836b.E() > 0) {
                    X x8 = this.f9835a;
                    C1417e c1417e = this.f9836b;
                    x8.h(c1417e, c1417e.E());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f9835a.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f9837c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f emitCompleteSegments() {
        if (!this.f9837c) {
            long f8 = this.f9836b.f();
            if (f8 > 0) {
                this.f9835a.h(this.f9836b, f8);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1418f, S6.X, java.io.Flushable
    public void flush() {
        if (!this.f9837c) {
            if (this.f9836b.E() > 0) {
                X x8 = this.f9835a;
                C1417e c1417e = this.f9836b;
                x8.h(c1417e, c1417e.E());
            }
            this.f9835a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.X
    public void h(C1417e source, long j8) {
        AbstractC3255y.i(source, "source");
        if (!this.f9837c) {
            this.f9836b.h(source, j8);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9837c;
    }

    @Override // S6.InterfaceC1418f
    public OutputStream outputStream() {
        return new a();
    }

    @Override // S6.X
    public a0 timeout() {
        return this.f9835a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f9835a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC3255y.i(source, "source");
        if (!this.f9837c) {
            int write = this.f9836b.write(source);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f writeByte(int i8) {
        if (!this.f9837c) {
            this.f9836b.writeByte(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f writeDecimalLong(long j8) {
        if (!this.f9837c) {
            this.f9836b.writeDecimalLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f writeHexadecimalUnsignedLong(long j8) {
        if (!this.f9837c) {
            this.f9836b.writeHexadecimalUnsignedLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f writeInt(int i8) {
        if (!this.f9837c) {
            this.f9836b.writeInt(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f writeShort(int i8) {
        if (!this.f9837c) {
            this.f9836b.writeShort(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f writeUtf8(String string) {
        AbstractC3255y.i(string, "string");
        if (!this.f9837c) {
            this.f9836b.writeUtf8(string);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* loaded from: classes5.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            S.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            S s8 = S.this;
            if (!s8.f9837c) {
                s8.flush();
            }
        }

        public String toString() {
            return S.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            S s8 = S.this;
            if (!s8.f9837c) {
                s8.f9836b.writeByte((byte) i8);
                S.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i8, int i9) {
            AbstractC3255y.i(data, "data");
            S s8 = S.this;
            if (!s8.f9837c) {
                s8.f9836b.write(data, i8, i9);
                S.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f write(byte[] source) {
        AbstractC3255y.i(source, "source");
        if (!this.f9837c) {
            this.f9836b.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1418f
    public InterfaceC1418f write(byte[] source, int i8, int i9) {
        AbstractC3255y.i(source, "source");
        if (!this.f9837c) {
            this.f9836b.write(source, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }
}
