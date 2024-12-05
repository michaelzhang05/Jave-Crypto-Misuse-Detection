package t7;

import R6.C1347n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Y6.e f38294a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38295b;

    /* JADX INFO: Access modifiers changed from: protected */
    public h(C1347n c1347n, int i8) {
        if (c1347n != null) {
            this.f38294a = f.a(c1347n);
            this.f38295b = i8;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    private byte[] d(int i8, byte[] bArr, byte[] bArr2) {
        byte[] q8 = A.q(i8, this.f38295b);
        this.f38294a.b(q8, 0, q8.length);
        this.f38294a.b(bArr, 0, bArr.length);
        this.f38294a.b(bArr2, 0, bArr2.length);
        int i9 = this.f38295b;
        byte[] bArr3 = new byte[i9];
        Y6.e eVar = this.f38294a;
        if (eVar instanceof Y6.i) {
            ((Y6.i) eVar).d(bArr3, 0, i9);
        } else {
            eVar.a(bArr3, 0);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i8 = this.f38295b;
        if (length == i8) {
            if (bArr2.length == i8) {
                return d(0, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i8 = this.f38295b;
        if (length == i8) {
            if (bArr2.length == i8 * 2) {
                return d(1, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.f38295b) {
            if (bArr2.length == 32) {
                return d(3, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong address length");
        }
        throw new IllegalArgumentException("wrong key length");
    }
}
