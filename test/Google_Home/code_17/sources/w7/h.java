package w7;

import U6.C1456n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final b7.e f40421a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40422b;

    /* JADX INFO: Access modifiers changed from: protected */
    public h(C1456n c1456n, int i8) {
        if (c1456n != null) {
            this.f40421a = f.a(c1456n);
            this.f40422b = i8;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    private byte[] d(int i8, byte[] bArr, byte[] bArr2) {
        byte[] q8 = A.q(i8, this.f40422b);
        this.f40421a.b(q8, 0, q8.length);
        this.f40421a.b(bArr, 0, bArr.length);
        this.f40421a.b(bArr2, 0, bArr2.length);
        int i9 = this.f40422b;
        byte[] bArr3 = new byte[i9];
        b7.e eVar = this.f40421a;
        if (eVar instanceof b7.i) {
            ((b7.i) eVar).d(bArr3, 0, i9);
        } else {
            eVar.a(bArr3, 0);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i8 = this.f40422b;
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
        int i8 = this.f40422b;
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
        if (bArr.length == this.f40422b) {
            if (bArr2.length == 32) {
                return d(3, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong address length");
        }
        throw new IllegalArgumentException("wrong key length");
    }
}
