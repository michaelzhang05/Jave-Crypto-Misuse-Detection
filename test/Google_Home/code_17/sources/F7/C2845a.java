package f7;

/* renamed from: f7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2845a implements InterfaceC2846b {

    /* renamed from: a, reason: collision with root package name */
    private long[] f31967a;

    @Override // f7.InterfaceC2846b
    public void a(byte[] bArr) {
        this.f31967a = d.d(bArr);
    }

    @Override // f7.InterfaceC2846b
    public void b(long j8, byte[] bArr) {
        long[] l8 = d.l();
        if (j8 > 0) {
            long[] jArr = new long[2];
            d.f(this.f31967a, jArr);
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
