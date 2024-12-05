package X0;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f12715a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f12715a;
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        this.f12715a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f12715a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        int i10;
        if (i8 >= 0 && i8 <= bArr.length && i9 >= 0 && (i10 = i8 + i9) <= bArr.length && i10 >= 0) {
            this.f12715a += i9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
