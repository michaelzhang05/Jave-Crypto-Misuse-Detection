package r7;

import g7.AbstractC2889b;

/* renamed from: r7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3978b extends AbstractC2889b {

    /* renamed from: b, reason: collision with root package name */
    private int f39162b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f39163c;

    public C3978b(int i8, byte[] bArr) {
        super(false);
        if (bArr.length == AbstractC3979c.c(i8)) {
            this.f39162b = i8;
            this.f39163c = H7.a.d(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return H7.a.d(this.f39163c);
    }

    public int b() {
        return this.f39162b;
    }
}
