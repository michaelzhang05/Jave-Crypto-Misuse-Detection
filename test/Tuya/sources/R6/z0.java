package R6;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class z0 extends C0 {

    /* renamed from: c, reason: collision with root package name */
    private int f8870c;

    /* renamed from: d, reason: collision with root package name */
    private int f8871d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8872e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8873f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(InputStream inputStream, int i8) {
        super(inputStream, i8);
        this.f8872e = false;
        this.f8873f = true;
        this.f8870c = inputStream.read();
        int read = inputStream.read();
        this.f8871d = read;
        if (read >= 0) {
            e();
            return;
        }
        throw new EOFException();
    }

    private boolean e() {
        if (!this.f8872e && this.f8873f && this.f8870c == 0 && this.f8871d == 0) {
            this.f8872e = true;
            b(true);
        }
        return this.f8872e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z8) {
        this.f8873f = z8;
        e();
    }

    @Override // java.io.InputStream
    public int read() {
        if (e()) {
            return -1;
        }
        int read = this.f8767a.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i8 = this.f8870c;
        this.f8870c = this.f8871d;
        this.f8871d = read;
        return i8;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (this.f8873f || i9 < 3) {
            return super.read(bArr, i8, i9);
        }
        if (this.f8872e) {
            return -1;
        }
        int read = this.f8767a.read(bArr, i8 + 2, i9 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i8] = (byte) this.f8870c;
        bArr[i8 + 1] = (byte) this.f8871d;
        this.f8870c = this.f8767a.read();
        int read2 = this.f8767a.read();
        this.f8871d = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
