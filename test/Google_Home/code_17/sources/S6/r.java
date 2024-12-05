package S6;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class r extends AbstractC1421i {

    /* renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f9938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z8, RandomAccessFile randomAccessFile) {
        super(z8);
        AbstractC3255y.i(randomAccessFile, "randomAccessFile");
        this.f9938e = randomAccessFile;
    }

    @Override // S6.AbstractC1421i
    protected synchronized void n() {
        this.f9938e.close();
    }

    @Override // S6.AbstractC1421i
    protected synchronized void o() {
        this.f9938e.getFD().sync();
    }

    @Override // S6.AbstractC1421i
    protected synchronized int s(long j8, byte[] array, int i8, int i9) {
        AbstractC3255y.i(array, "array");
        this.f9938e.seek(j8);
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            int read = this.f9938e.read(array, i8, i9 - i10);
            if (read == -1) {
                if (i10 == 0) {
                    return -1;
                }
            } else {
                i10 += read;
            }
        }
        return i10;
    }

    @Override // S6.AbstractC1421i
    protected synchronized long u() {
        return this.f9938e.length();
    }

    @Override // S6.AbstractC1421i
    protected synchronized void v(long j8, byte[] array, int i8, int i9) {
        AbstractC3255y.i(array, "array");
        this.f9938e.seek(j8);
        this.f9938e.write(array, i8, i9);
    }
}
