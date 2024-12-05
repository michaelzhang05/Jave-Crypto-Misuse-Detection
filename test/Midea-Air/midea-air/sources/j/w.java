package j;

import java.nio.ByteBuffer;

/* compiled from: RealBufferedSink.kt */
/* loaded from: classes2.dex */
public final class w implements g {

    /* renamed from: f, reason: collision with root package name */
    public final f f19398f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19399g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f19400h;

    public w(b0 b0Var) {
        kotlin.jvm.internal.l.f(b0Var, "sink");
        this.f19400h = b0Var;
        this.f19398f = new f();
    }

    @Override // j.g
    public g B() {
        if (!this.f19399g) {
            long T = this.f19398f.T();
            if (T > 0) {
                this.f19400h.write(this.f19398f, T);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public g M(String str) {
        kotlin.jvm.internal.l.f(str, "string");
        if (!this.f19399g) {
            this.f19398f.M(str);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public g U(String str, int i2, int i3) {
        kotlin.jvm.internal.l.f(str, "string");
        if (!this.f19399g) {
            this.f19398f.U(str, i2, i3);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public long V(d0 d0Var) {
        kotlin.jvm.internal.l.f(d0Var, "source");
        long j2 = 0;
        while (true) {
            long read = d0Var.read(this.f19398f, 8192);
            if (read == -1) {
                return j2;
            }
            j2 += read;
            B();
        }
    }

    @Override // j.g
    public g W(long j2) {
        if (!this.f19399g) {
            this.f19398f.W(j2);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19399g) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f19398f.size() > 0) {
                b0 b0Var = this.f19400h;
                f fVar = this.f19398f;
                b0Var.write(fVar, fVar.size());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f19400h.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f19399g = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // j.g
    public f e() {
        return this.f19398f;
    }

    @Override // j.g
    public g f0(i iVar) {
        kotlin.jvm.internal.l.f(iVar, "byteString");
        if (!this.f19399g) {
            this.f19398f.f0(iVar);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g, j.b0, java.io.Flushable
    public void flush() {
        if (!this.f19399g) {
            if (this.f19398f.size() > 0) {
                b0 b0Var = this.f19400h;
                f fVar = this.f19398f;
                b0Var.write(fVar, fVar.size());
            }
            this.f19400h.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f19399g;
    }

    @Override // j.g
    public g m0(long j2) {
        if (!this.f19399g) {
            this.f19398f.m0(j2);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public g n() {
        if (!this.f19399g) {
            long size = this.f19398f.size();
            if (size > 0) {
                this.f19400h.write(this.f19398f, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.b0
    public e0 timeout() {
        return this.f19400h.timeout();
    }

    public String toString() {
        return "buffer(" + this.f19400h + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f(byteBuffer, "source");
        if (!this.f19399g) {
            int write = this.f19398f.write(byteBuffer);
            B();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public g writeByte(int i2) {
        if (!this.f19399g) {
            this.f19398f.writeByte(i2);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public g writeInt(int i2) {
        if (!this.f19399g) {
            this.f19398f.writeInt(i2);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public g writeShort(int i2) {
        if (!this.f19399g) {
            this.f19398f.writeShort(i2);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.b0
    public void write(f fVar, long j2) {
        kotlin.jvm.internal.l.f(fVar, "source");
        if (!this.f19399g) {
            this.f19398f.write(fVar, j2);
            B();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public g write(byte[] bArr) {
        kotlin.jvm.internal.l.f(bArr, "source");
        if (!this.f19399g) {
            this.f19398f.write(bArr);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.g
    public g write(byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.l.f(bArr, "source");
        if (!this.f19399g) {
            this.f19398f.write(bArr, i2, i3);
            return B();
        }
        throw new IllegalStateException("closed".toString());
    }
}
