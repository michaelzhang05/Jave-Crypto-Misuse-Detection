package R6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class x0 extends C0 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f8861e = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    private final int f8862c;

    /* renamed from: d, reason: collision with root package name */
    private int f8863d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(InputStream inputStream, int i8, int i9) {
        super(inputStream, i9);
        if (i8 >= 0) {
            this.f8862c = i8;
            this.f8863d = i8;
            if (i8 == 0) {
                b(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f8863d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(byte[] bArr) {
        int i8 = this.f8863d;
        if (i8 == bArr.length) {
            if (i8 == 0) {
                return;
            }
            int a8 = a();
            int i9 = this.f8863d;
            if (i9 < a8) {
                int c8 = i9 - G7.a.c(this.f8767a, bArr);
                this.f8863d = c8;
                if (c8 == 0) {
                    b(true);
                    return;
                }
                throw new EOFException("DEF length " + this.f8862c + " object truncated by " + this.f8863d);
            }
            throw new IOException("corrupted stream - out of bounds length found: " + this.f8863d + " >= " + a8);
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] g() {
        if (this.f8863d == 0) {
            return f8861e;
        }
        int a8 = a();
        int i8 = this.f8863d;
        if (i8 < a8) {
            byte[] bArr = new byte[i8];
            int c8 = i8 - G7.a.c(this.f8767a, bArr);
            this.f8863d = c8;
            if (c8 == 0) {
                b(true);
                return bArr;
            }
            throw new EOFException("DEF length " + this.f8862c + " object truncated by " + this.f8863d);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + this.f8863d + " >= " + a8);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f8863d == 0) {
            return -1;
        }
        int read = this.f8767a.read();
        if (read >= 0) {
            int i8 = this.f8863d - 1;
            this.f8863d = i8;
            if (i8 == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f8862c + " object truncated by " + this.f8863d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        int i10 = this.f8863d;
        if (i10 == 0) {
            return -1;
        }
        int read = this.f8767a.read(bArr, i8, Math.min(i9, i10));
        if (read >= 0) {
            int i11 = this.f8863d - read;
            this.f8863d = i11;
            if (i11 == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f8862c + " object truncated by " + this.f8863d);
    }
}
