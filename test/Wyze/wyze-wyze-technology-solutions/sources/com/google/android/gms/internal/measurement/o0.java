package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class o0 extends n0 {

    /* renamed from: j, reason: collision with root package name */
    protected final byte[] f16004j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(byte[] bArr) {
        bArr.getClass();
        this.f16004j = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzte
    public final zzte L(int i2, int i3) {
        int K = zzte.K(0, i3, size());
        if (K == 0) {
            return zzte.f16104f;
        }
        return new k0(this.f16004j, R(), K);
    }

    @Override // com.google.android.gms.internal.measurement.zzte
    public final boolean O() {
        int R = R();
        return b3.g(this.f16004j, R, size() + R);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    final boolean Q(zzte zzteVar, int i2, int i3) {
        if (i3 <= zzteVar.size()) {
            if (i3 <= zzteVar.size()) {
                if (zzteVar instanceof o0) {
                    o0 o0Var = (o0) zzteVar;
                    byte[] bArr = this.f16004j;
                    byte[] bArr2 = o0Var.f16004j;
                    int R = R() + i3;
                    int R2 = R();
                    int R3 = o0Var.R();
                    while (R2 < R) {
                        if (bArr[R2] != bArr2[R3]) {
                            return false;
                        }
                        R2++;
                        R3++;
                    }
                    return true;
                }
                return zzteVar.L(0, i3).equals(L(0, i3));
            }
            int size = zzteVar.size();
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

    protected int R() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzte
    protected final int b(int i2, int i3, int i4) {
        return zzuq.c(i2, this.f16004j, R(), i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzte
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzte) || size() != ((zzte) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            int P = P();
            int P2 = o0Var.P();
            if (P == 0 || P2 == 0 || P == P2) {
                return Q(o0Var, 0, size());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzte
    protected final String f(Charset charset) {
        return new String(this.f16004j, R(), size(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzte
    public final void o(zztd zztdVar) throws IOException {
        zztdVar.a(this.f16004j, R(), size());
    }

    @Override // com.google.android.gms.internal.measurement.zzte
    public int size() {
        return this.f16004j.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzte
    public byte w(int i2) {
        return this.f16004j[i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzte
    public byte z(int i2) {
        return this.f16004j[i2];
    }
}
