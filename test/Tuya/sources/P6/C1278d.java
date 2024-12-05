package P6;

import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: P6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1278d implements X {
    @Override // P6.X
    public void C(C1279e source, long j8) {
        AbstractC3159y.i(source, "source");
        source.skip(j8);
    }

    @Override // P6.X
    public a0 timeout() {
        return a0.f8031e;
    }

    @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // P6.X, java.io.Flushable
    public void flush() {
    }
}
