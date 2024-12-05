package g4;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f6768a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public long g() {
        return this.f6768a;
    }

    @Override // java.io.OutputStream
    public void write(int i6) {
        this.f6768a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f6768a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i6, int i7) {
        int i8;
        if (i6 < 0 || i6 > bArr.length || i7 < 0 || (i8 = i6 + i7) > bArr.length || i8 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f6768a += i7;
    }
}
