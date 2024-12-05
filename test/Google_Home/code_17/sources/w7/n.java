package w7;

/* loaded from: classes5.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f40449a;

    /* JADX INFO: Access modifiers changed from: protected */
    public n(m mVar, byte[][] bArr) {
        if (mVar != null) {
            if (bArr != null) {
                if (!A.k(bArr)) {
                    if (bArr.length == mVar.a()) {
                        for (byte[] bArr2 : bArr) {
                            if (bArr2.length != mVar.c()) {
                                throw new IllegalArgumentException("wrong publicKey format");
                            }
                        }
                        this.f40449a = A.d(bArr);
                        return;
                    }
                    throw new IllegalArgumentException("wrong publicKey size");
                }
                throw new NullPointerException("publicKey byte array == null");
            }
            throw new NullPointerException("publicKey == null");
        }
        throw new NullPointerException("params == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[][] a() {
        return A.d(this.f40449a);
    }
}
