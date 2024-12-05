package r7;

import g7.AbstractC2889b;

/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3977a extends AbstractC2889b {

    /* renamed from: b, reason: collision with root package name */
    private int f39160b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f39161c;

    public C3977a(int i8, byte[] bArr) {
        super(true);
        if (bArr.length == AbstractC3979c.b(i8)) {
            this.f39160b = i8;
            this.f39161c = H7.a.d(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return H7.a.d(this.f39161c);
    }

    public int b() {
        return this.f39160b;
    }
}
