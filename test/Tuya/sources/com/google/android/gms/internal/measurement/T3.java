package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class T3 extends S3 {

    /* renamed from: e, reason: collision with root package name */
    protected final byte[] f15563e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T3(byte[] bArr) {
        bArr.getClass();
        this.f15563e = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.X3
    public byte a(int i8) {
        return this.f15563e[i8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.X3
    public byte d(int i8) {
        return this.f15563e[i8];
    }

    @Override // com.google.android.gms.internal.measurement.X3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X3) || g() != ((X3) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (obj instanceof T3) {
            T3 t32 = (T3) obj;
            int t8 = t();
            int t9 = t32.t();
            if (t8 != 0 && t9 != 0 && t8 != t9) {
                return false;
            }
            int g8 = g();
            if (g8 <= t32.g()) {
                if (g8 <= t32.g()) {
                    byte[] bArr = this.f15563e;
                    byte[] bArr2 = t32.f15563e;
                    t32.w();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < g8) {
                        if (bArr[i8] != bArr2[i9]) {
                            return false;
                        }
                        i8++;
                        i9++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + g8 + ", " + t32.g());
            }
            throw new IllegalArgumentException("Length too large: " + g8 + g());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.X3
    public int g() {
        return this.f15563e.length;
    }

    @Override // com.google.android.gms.internal.measurement.X3
    protected final int h(int i8, int i9, int i10) {
        return B4.b(i8, this.f15563e, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.X3
    public final X3 l(int i8, int i9) {
        int r8 = X3.r(0, i9, g());
        if (r8 == 0) {
            return X3.f15622b;
        }
        return new Q3(this.f15563e, 0, r8);
    }

    @Override // com.google.android.gms.internal.measurement.X3
    protected final String m(Charset charset) {
        return new String(this.f15563e, 0, g(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.X3
    public final void p(M3 m32) {
        ((C1964c4) m32).B(this.f15563e, 0, g());
    }

    @Override // com.google.android.gms.internal.measurement.X3
    public final boolean q() {
        return E5.e(this.f15563e, 0, g());
    }

    protected int w() {
        return 0;
    }
}
