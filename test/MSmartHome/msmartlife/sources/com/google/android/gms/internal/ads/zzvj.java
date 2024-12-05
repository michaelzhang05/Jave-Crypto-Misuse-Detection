package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

@zzard
/* loaded from: classes2.dex */
public final class zzvj extends zzva {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f15671c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15672d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15673e;

    public zzvj(int i2) {
        int i3 = i2 / 8;
        this.f15672d = i2 % 8 > 0 ? i3 + 1 : i3;
        this.f15673e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final byte[] a(String str) {
        synchronized (this.f15664b) {
            MessageDigest b2 = b();
            this.f15671c = b2;
            if (b2 == null) {
                return new byte[0];
            }
            b2.reset();
            this.f15671c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.f15671c.digest();
            int length = digest.length;
            int i2 = this.f15672d;
            if (length <= i2) {
                i2 = digest.length;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(digest, 0, bArr, 0, i2);
            if (this.f15673e % 8 > 0) {
                long j2 = 0;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (i3 > 0) {
                        j2 <<= 8;
                    }
                    j2 += bArr[i3] & 255;
                }
                long j3 = j2 >>> (8 - (this.f15673e % 8));
                for (int i4 = this.f15672d - 1; i4 >= 0; i4--) {
                    bArr[i4] = (byte) (255 & j3);
                    j3 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
