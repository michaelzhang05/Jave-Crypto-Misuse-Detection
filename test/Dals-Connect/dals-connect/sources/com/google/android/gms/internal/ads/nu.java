package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class nu extends mu {

    /* renamed from: j, reason: collision with root package name */
    protected final byte[] f11893j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nu(byte[] bArr) {
        bArr.getClass();
        this.f11893j = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    public final boolean D() {
        int X = X();
        return kx.k(this.f11893j, X, size() + X);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    public final zzdnd J() {
        return zzdnd.v(this.f11893j, X(), size(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    protected final int N(int i2, int i3, int i4) {
        return zzdod.c(i2, this.f11893j, X(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    public byte O(int i2) {
        return this.f11893j[i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdmr
    public byte P(int i2) {
        return this.f11893j[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    public final zzdmr U(int i2, int i3) {
        int R = zzdmr.R(0, i3, size());
        if (R == 0) {
            return zzdmr.f14805f;
        }
        return new iu(this.f11893j, X(), R);
    }

    @Override // com.google.android.gms.internal.ads.mu
    final boolean W(zzdmr zzdmrVar, int i2, int i3) {
        if (i3 <= zzdmrVar.size()) {
            if (i3 <= zzdmrVar.size()) {
                if (zzdmrVar instanceof nu) {
                    nu nuVar = (nu) zzdmrVar;
                    byte[] bArr = this.f11893j;
                    byte[] bArr2 = nuVar.f11893j;
                    int X = X() + i3;
                    int X2 = X();
                    int X3 = nuVar.X();
                    while (X2 < X) {
                        if (bArr[X2] != bArr2[X3]) {
                            return false;
                        }
                        X2++;
                        X3++;
                    }
                    return true;
                }
                return zzdmrVar.U(0, i3).equals(U(0, i3));
            }
            int size = zzdmrVar.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: 0, ");
            sb.append(i3);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i3);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int X() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    protected final String b(Charset charset) {
        return new String(this.f11893j, X(), size(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdmr) || size() != ((zzdmr) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof nu) {
            nu nuVar = (nu) obj;
            int K = K();
            int K2 = nuVar.K();
            if (K == 0 || K2 == 0 || K == K2) {
                return W(nuVar, 0, size());
            }
            return false;
        }
        return obj.equals(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdmr
    public final void f(zzdmq zzdmqVar) throws IOException {
        zzdmqVar.a(this.f11893j, X(), size());
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    protected void o(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f11893j, 0, bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    public int size() {
        return this.f11893j.length;
    }
}
