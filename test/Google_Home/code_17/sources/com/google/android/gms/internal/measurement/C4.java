package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class C4 extends AbstractC2304z4 {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f16095d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4(byte[] bArr) {
        super();
        bArr.getClass();
        this.f16095d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2241s4
    public byte c(int i8) {
        return this.f16095d[i8];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2241s4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2241s4) || r() != ((AbstractC2241s4) obj).r()) {
            return false;
        }
        if (r() == 0) {
            return true;
        }
        if (obj instanceof C4) {
            C4 c42 = (C4) obj;
            int d8 = d();
            int d9 = c42.d();
            if (d8 != 0 && d9 != 0 && d8 != d9) {
                return false;
            }
            return v(c42, 0, r());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2241s4
    public final AbstractC2241s4 j(int i8, int i9) {
        int f8 = AbstractC2241s4.f(0, i9, r());
        if (f8 == 0) {
            return AbstractC2241s4.f16818b;
        }
        return new C2277w4(this.f16095d, y(), f8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2241s4
    public final void o(AbstractC2215p4 abstractC2215p4) {
        abstractC2215p4.a(this.f16095d, y(), r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2241s4
    public byte q(int i8) {
        return this.f16095d[i8];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2241s4
    public int r() {
        return this.f16095d.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2241s4
    protected final int t(int i8, int i9, int i10) {
        return AbstractC2111e5.a(i8, this.f16095d, y(), i10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2304z4
    final boolean v(AbstractC2241s4 abstractC2241s4, int i8, int i9) {
        if (i9 <= abstractC2241s4.r()) {
            if (i9 <= abstractC2241s4.r()) {
                if (abstractC2241s4 instanceof C4) {
                    C4 c42 = (C4) abstractC2241s4;
                    byte[] bArr = this.f16095d;
                    byte[] bArr2 = c42.f16095d;
                    int y8 = y() + i9;
                    int y9 = y();
                    int y10 = c42.y();
                    while (y9 < y8) {
                        if (bArr[y9] != bArr2[y10]) {
                            return false;
                        }
                        y9++;
                        y10++;
                    }
                    return true;
                }
                return abstractC2241s4.j(0, i9).equals(j(0, i9));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i9 + ", " + abstractC2241s4.r());
        }
        throw new IllegalArgumentException("Length too large: " + i9 + r());
    }

    protected int y() {
        return 0;
    }
}
