package R1;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9587a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9588b;

    public f(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            this.f9587a = bArr;
            if (bArr2 != null) {
                this.f9588b = bArr2;
                return;
            }
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public byte[] a() {
        return this.f9588b;
    }

    public byte[] b() {
        return this.f9587a;
    }
}
