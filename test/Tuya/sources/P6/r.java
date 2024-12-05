package P6;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class r extends AbstractC1283i {

    /* renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f8107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z8, RandomAccessFile randomAccessFile) {
        super(z8);
        AbstractC3159y.i(randomAccessFile, "randomAccessFile");
        this.f8107e = randomAccessFile;
    }

    @Override // P6.AbstractC1283i
    protected synchronized void l() {
        this.f8107e.close();
    }

    @Override // P6.AbstractC1283i
    protected synchronized void m() {
        this.f8107e.getFD().sync();
    }

    @Override // P6.AbstractC1283i
    protected synchronized int o(long j8, byte[] array, int i8, int i9) {
        AbstractC3159y.i(array, "array");
        this.f8107e.seek(j8);
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            int read = this.f8107e.read(array, i8, i9 - i10);
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

    @Override // P6.AbstractC1283i
    protected synchronized long r() {
        return this.f8107e.length();
    }

    @Override // P6.AbstractC1283i
    protected synchronized void t(long j8, byte[] array, int i8, int i9) {
        AbstractC3159y.i(array, "array");
        this.f8107e.seek(j8);
        this.f8107e.write(array, i8, i9);
    }
}
