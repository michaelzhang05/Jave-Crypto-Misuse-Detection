package U6;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class z0 extends C0 {

    /* renamed from: c, reason: collision with root package name */
    private int f10496c;

    /* renamed from: d, reason: collision with root package name */
    private int f10497d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10498e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10499f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(InputStream inputStream, int i8) {
        super(inputStream, i8);
        this.f10498e = false;
        this.f10499f = true;
        this.f10496c = inputStream.read();
        int read = inputStream.read();
        this.f10497d = read;
        if (read >= 0) {
            f();
            return;
        }
        throw new EOFException();
    }

    private boolean f() {
        if (!this.f10498e && this.f10499f && this.f10496c == 0 && this.f10497d == 0) {
            this.f10498e = true;
            b(true);
        }
        return this.f10498e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z8) {
        this.f10499f = z8;
        f();
    }

    @Override // java.io.InputStream
    public int read() {
        if (f()) {
            return -1;
        }
        int read = this.f10393a.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i8 = this.f10496c;
        this.f10496c = this.f10497d;
        this.f10497d = read;
        return i8;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (this.f10499f || i9 < 3) {
            return super.read(bArr, i8, i9);
        }
        if (this.f10498e) {
            return -1;
        }
        int read = this.f10393a.read(bArr, i8 + 2, i9 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i8] = (byte) this.f10496c;
        bArr[i8 + 1] = (byte) this.f10497d;
        this.f10496c = this.f10393a.read();
        int read2 = this.f10393a.read();
        this.f10497d = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
