package P6;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface X extends Closeable, Flushable {
    void C(C1279e c1279e, long j8);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    a0 timeout();
}
