package U6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class x0 extends C0 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f10487e = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    private final int f10488c;

    /* renamed from: d, reason: collision with root package name */
    private int f10489d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(InputStream inputStream, int i8, int i9) {
        super(inputStream, i9);
        if (i8 >= 0) {
            this.f10488c = i8;
            this.f10489d = i8;
            if (i8 == 0) {
                b(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f10489d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(byte[] bArr) {
        int i8 = this.f10489d;
        if (i8 == bArr.length) {
            if (i8 == 0) {
                return;
            }
            int a8 = a();
            int i9 = this.f10489d;
            if (i9 < a8) {
                int c8 = i9 - J7.a.c(this.f10393a, bArr);
                this.f10489d = c8;
                if (c8 == 0) {
                    b(true);
                    return;
                }
                throw new EOFException("DEF length " + this.f10488c + " object truncated by " + this.f10489d);
            }
            throw new IOException("corrupted stream - out of bounds length found: " + this.f10489d + " >= " + a8);
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] l() {
        if (this.f10489d == 0) {
            return f10487e;
        }
        int a8 = a();
        int i8 = this.f10489d;
        if (i8 < a8) {
            byte[] bArr = new byte[i8];
            int c8 = i8 - J7.a.c(this.f10393a, bArr);
            this.f10489d = c8;
            if (c8 == 0) {
                b(true);
                return bArr;
            }
            throw new EOFException("DEF length " + this.f10488c + " object truncated by " + this.f10489d);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + this.f10489d + " >= " + a8);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f10489d == 0) {
            return -1;
        }
        int read = this.f10393a.read();
        if (read >= 0) {
            int i8 = this.f10489d - 1;
            this.f10489d = i8;
            if (i8 == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f10488c + " object truncated by " + this.f10489d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        int i10 = this.f10489d;
        if (i10 == 0) {
            return -1;
        }
        int read = this.f10393a.read(bArr, i8, Math.min(i9, i10));
        if (read >= 0) {
            int i11 = this.f10489d - read;
            this.f10489d = i11;
            if (i11 == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f10488c + " object truncated by " + this.f10489d);
    }
}
