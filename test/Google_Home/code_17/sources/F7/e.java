package f7;

import H7.f;
import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f31968a;

    /* renamed from: b, reason: collision with root package name */
    private long[][] f31969b;

    @Override // f7.c
    public void a(byte[] bArr) {
        if (this.f31969b == null) {
            this.f31969b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (d.a(this.f31968a, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.f31968a = bArr2;
        d.e(bArr, bArr2);
        d.c(this.f31968a, this.f31969b[1]);
        long[] jArr = this.f31969b[1];
        d.k(jArr, jArr);
        for (int i8 = 2; i8 < 256; i8 += 2) {
            long[][] jArr2 = this.f31969b;
            d.g(jArr2[i8 >> 1], jArr2[i8]);
            long[][] jArr3 = this.f31969b;
            d.s(jArr3[i8], jArr3[1], jArr3[i8 + 1]);
        }
    }

    @Override // f7.c
    public void b(byte[] bArr) {
        long[] jArr = this.f31969b[bArr[15] & 255];
        long j8 = jArr[0];
        long j9 = jArr[1];
        for (int i8 = 14; i8 >= 0; i8--) {
            long[] jArr2 = this.f31969b[bArr[i8] & 255];
            long j10 = j9 << 56;
            j9 = ((j9 >>> 8) | (j8 << 56)) ^ jArr2[1];
            j8 = (((((j8 >>> 8) ^ jArr2[0]) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2)) ^ (j10 >>> 7);
        }
        f.i(j8, bArr, 0);
        f.i(j9, bArr, 8);
    }
}
