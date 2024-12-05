package g7;

import b7.InterfaceC1991b;

/* renamed from: g7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2890c implements InterfaceC1991b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f32096a;

    public C2890c(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.f32096a;
    }

    public C2890c(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        this.f32096a = bArr2;
        System.arraycopy(bArr, i8, bArr2, 0, i9);
    }
}
