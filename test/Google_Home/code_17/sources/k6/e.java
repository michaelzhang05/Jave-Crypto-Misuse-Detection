package K6;

import S6.AbstractC1424l;
import S6.C1417e;
import S6.X;
import java.io.IOException;

/* loaded from: classes5.dex */
abstract class e extends AbstractC1424l {

    /* renamed from: b, reason: collision with root package name */
    private boolean f5192b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(X x8) {
        super(x8);
    }

    protected abstract void a(IOException iOException);

    @Override // S6.AbstractC1424l, S6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5192b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e8) {
            this.f5192b = true;
            a(e8);
        }
    }

    @Override // S6.AbstractC1424l, S6.X, java.io.Flushable
    public void flush() {
        if (this.f5192b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e8) {
            this.f5192b = true;
            a(e8);
        }
    }

    @Override // S6.AbstractC1424l, S6.X
    public void h(C1417e c1417e, long j8) {
        if (this.f5192b) {
            c1417e.skip(j8);
            return;
        }
        try {
            super.h(c1417e, j8);
        } catch (IOException e8) {
            this.f5192b = true;
            a(e8);
        }
    }
}
