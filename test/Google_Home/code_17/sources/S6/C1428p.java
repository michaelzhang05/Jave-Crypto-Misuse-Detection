package S6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1428p implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1419g f9932a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f9933b;

    /* renamed from: c, reason: collision with root package name */
    private int f9934c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9935d;

    public C1428p(InterfaceC1419g source, Inflater inflater) {
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(inflater, "inflater");
        this.f9932a = source;
        this.f9933b = inflater;
    }

    private final void f() {
        int i8 = this.f9934c;
        if (i8 == 0) {
            return;
        }
        int remaining = i8 - this.f9933b.getRemaining();
        this.f9934c -= remaining;
        this.f9932a.skip(remaining);
    }

    @Override // S6.Z
    public long C(C1417e sink, long j8) {
        AbstractC3255y.i(sink, "sink");
        do {
            long a8 = a(sink, j8);
            if (a8 > 0) {
                return a8;
            }
            if (this.f9933b.finished() || this.f9933b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f9932a.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(C1417e sink, long j8) {
        AbstractC3255y.i(sink, "sink");
        if (j8 >= 0) {
            if (!this.f9935d) {
                if (j8 == 0) {
                    return 0L;
                }
                try {
                    U H8 = sink.H(1);
                    int min = (int) Math.min(j8, 8192 - H8.f9846c);
                    b();
                    int inflate = this.f9933b.inflate(H8.f9844a, H8.f9846c, min);
                    f();
                    if (inflate > 0) {
                        H8.f9846c += inflate;
                        long j9 = inflate;
                        sink.D(sink.E() + j9);
                        return j9;
                    }
                    if (H8.f9845b == H8.f9846c) {
                        sink.f9887a = H8.b();
                        V.b(H8);
                    }
                    return 0L;
                } catch (DataFormatException e8) {
                    throw new IOException(e8);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    public final boolean b() {
        if (!this.f9933b.needsInput()) {
            return false;
        }
        if (this.f9932a.exhausted()) {
            return true;
        }
        U u8 = this.f9932a.i().f9887a;
        AbstractC3255y.f(u8);
        int i8 = u8.f9846c;
        int i9 = u8.f9845b;
        int i10 = i8 - i9;
        this.f9934c = i10;
        this.f9933b.setInput(u8.f9844a, i9, i10);
        return false;
    }

    @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9935d) {
            return;
        }
        this.f9933b.end();
        this.f9935d = true;
        this.f9932a.close();
    }

    @Override // S6.Z
    public a0 timeout() {
        return this.f9932a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1428p(Z source, Inflater inflater) {
        this(L.d(source), inflater);
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(inflater, "inflater");
    }
}
