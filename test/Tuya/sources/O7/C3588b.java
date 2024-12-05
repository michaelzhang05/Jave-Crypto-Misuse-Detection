package o7;

import d7.AbstractC2565b;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3588b extends AbstractC2565b {

    /* renamed from: b, reason: collision with root package name */
    private int f36954b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f36955c;

    public C3588b(int i8, byte[] bArr) {
        super(false);
        if (bArr.length == AbstractC3589c.c(i8)) {
            this.f36954b = i8;
            this.f36955c = E7.a.d(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return E7.a.d(this.f36955c);
    }

    public int b() {
        return this.f36954b;
    }
}
