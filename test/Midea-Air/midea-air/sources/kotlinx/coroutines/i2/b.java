package kotlinx.coroutines.i2;

import kotlinx.coroutines.c0;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.y;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class b extends c {
    public static final b m;
    private static final c0 n;

    static {
        int b2;
        int d2;
        b bVar = new b();
        m = bVar;
        b2 = kotlin.ranges.f.b(64, w.a());
        d2 = y.d("kotlinx.coroutines.io.parallelism", b2, 0, 0, 12, null);
        n = new e(bVar, d2, "Dispatchers.IO", 1);
    }

    private b() {
        super(0, 0, null, 7, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.c0
    public String toString() {
        return "Dispatchers.Default";
    }

    public final c0 w0() {
        return n;
    }
}
