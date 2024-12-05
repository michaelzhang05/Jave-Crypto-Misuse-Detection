package S6;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface X extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void h(C1417e c1417e, long j8);

    a0 timeout();
}
