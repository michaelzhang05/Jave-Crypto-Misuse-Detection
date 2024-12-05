package d7;

/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2566c implements Y6.b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f30216a;

    public C2566c(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.f30216a;
    }

    public C2566c(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        this.f30216a = bArr2;
        System.arraycopy(bArr, i8, bArr2, 0, i9);
    }
}
