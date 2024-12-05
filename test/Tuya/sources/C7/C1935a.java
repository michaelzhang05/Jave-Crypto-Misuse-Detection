package c7;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1935a implements InterfaceC1936b {

    /* renamed from: a, reason: collision with root package name */
    private long[] f14992a;

    @Override // c7.InterfaceC1936b
    public void a(byte[] bArr) {
        this.f14992a = d.d(bArr);
    }

    @Override // c7.InterfaceC1936b
    public void b(long j8, byte[] bArr) {
        long[] l8 = d.l();
        if (j8 > 0) {
            long[] jArr = new long[2];
            d.f(this.f14992a, jArr);
            do {
                if ((1 & j8) != 0) {
                    d.j(l8, jArr);
                }
                d.m(jArr, jArr);
                j8 >>>= 1;
            } while (j8 > 0);
        }
        d.b(l8, bArr);
    }
}
