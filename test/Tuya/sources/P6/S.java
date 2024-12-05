package P6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class S implements InterfaceC1280f {

    /* renamed from: a, reason: collision with root package name */
    public final X f8004a;

    /* renamed from: b, reason: collision with root package name */
    public final C1279e f8005b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8006c;

    public S(X sink) {
        AbstractC3159y.i(sink, "sink");
        this.f8004a = sink;
        this.f8005b = new C1279e();
    }

    @Override // P6.X
    public void C(C1279e source, long j8) {
        AbstractC3159y.i(source, "source");
        if (!this.f8006c) {
            this.f8005b.C(source, j8);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public C1279e buffer() {
        return this.f8005b;
    }

    @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f8006c) {
            try {
                if (this.f8005b.x() > 0) {
                    X x8 = this.f8004a;
                    C1279e c1279e = this.f8005b;
                    x8.C(c1279e, c1279e.x());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f8004a.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f8006c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f emitCompleteSegments() {
        if (!this.f8006c) {
            long e8 = this.f8005b.e();
            if (e8 > 0) {
                this.f8004a.C(this.f8005b, e8);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f, P6.X, java.io.Flushable
    public void flush() {
        if (!this.f8006c) {
            if (this.f8005b.x() > 0) {
                X x8 = this.f8004a;
                C1279e c1279e = this.f8005b;
                x8.C(c1279e, c1279e.x());
            }
            this.f8004a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f8006c;
    }

    @Override // P6.InterfaceC1280f
    public OutputStream outputStream() {
        return new a();
    }

    @Override // P6.X
    public a0 timeout() {
        return this.f8004a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f8004a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC3159y.i(source, "source");
        if (!this.f8006c) {
            int write = this.f8005b.write(source);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeByte(int i8) {
        if (!this.f8006c) {
            this.f8005b.writeByte(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeDecimalLong(long j8) {
        if (!this.f8006c) {
            this.f8005b.writeDecimalLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeHexadecimalUnsignedLong(long j8) {
        if (!this.f8006c) {
            this.f8005b.writeHexadecimalUnsignedLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeInt(int i8) {
        if (!this.f8006c) {
            this.f8005b.writeInt(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeShort(int i8) {
        if (!this.f8006c) {
            this.f8005b.writeShort(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeUtf8(String string) {
        AbstractC3159y.i(string, "string");
        if (!this.f8006c) {
            this.f8005b.writeUtf8(string);
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
            if (!s8.f8006c) {
                s8.flush();
            }
        }

        public String toString() {
            return S.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            S s8 = S.this;
            if (!s8.f8006c) {
                s8.f8005b.writeByte((byte) i8);
                S.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i8, int i9) {
            AbstractC3159y.i(data, "data");
            S s8 = S.this;
            if (!s8.f8006c) {
                s8.f8005b.write(data, i8, i9);
                S.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f write(byte[] source) {
        AbstractC3159y.i(source, "source");
        if (!this.f8006c) {
            this.f8005b.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f write(byte[] source, int i8, int i9) {
        AbstractC3159y.i(source, "source");
        if (!this.f8006c) {
            this.f8005b.write(source, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }
}
