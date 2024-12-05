package H6;

import P6.AbstractC1286l;
import P6.C1279e;
import P6.X;
import java.io.IOException;

/* loaded from: classes5.dex */
abstract class e extends AbstractC1286l {

    /* renamed from: b, reason: collision with root package name */
    private boolean f3589b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(X x8) {
        super(x8);
    }

    @Override // P6.AbstractC1286l, P6.X
    public void C(C1279e c1279e, long j8) {
        if (this.f3589b) {
            c1279e.skip(j8);
            return;
        }
        try {
            super.C(c1279e, j8);
        } catch (IOException e8) {
            this.f3589b = true;
            a(e8);
        }
    }

    protected abstract void a(IOException iOException);

    @Override // P6.AbstractC1286l, P6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3589b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e8) {
            this.f3589b = true;
            a(e8);
        }
    }

    @Override // P6.AbstractC1286l, P6.X, java.io.Flushable
    public void flush() {
        if (this.f3589b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e8) {
            this.f3589b = true;
            a(e8);
        }
    }
}
