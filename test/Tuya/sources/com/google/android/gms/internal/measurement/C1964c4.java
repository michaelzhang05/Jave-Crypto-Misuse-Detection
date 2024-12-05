package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1964c4 extends AbstractC1991f4 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f15671e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15672f;

    /* renamed from: g, reason: collision with root package name */
    private int f15673g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1964c4(byte[] bArr, int i8, int i9) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i9) | i9) >= 0) {
                this.f15671e = bArr;
                this.f15673g = 0;
                this.f15672f = i9;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        throw new NullPointerException("buffer");
    }

    public final void B(byte[] bArr, int i8, int i9) {
        try {
            System.arraycopy(bArr, 0, this.f15671e, this.f15673g, i9);
            this.f15673g += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new C1973d4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15673g), Integer.valueOf(this.f15672f), Integer.valueOf(i9)), e8);
        }
    }

    public final void C(String str) {
        int i8 = this.f15673g;
        try {
            int y8 = AbstractC1991f4.y(str.length() * 3);
            int y9 = AbstractC1991f4.y(str.length());
            if (y9 == y8) {
                int i9 = i8 + y9;
                this.f15673g = i9;
                int b8 = E5.b(str, this.f15671e, i9, this.f15672f - i9);
                this.f15673g = i8;
                r((b8 - i8) - y9);
                this.f15673g = b8;
                return;
            }
            r(E5.c(str));
            byte[] bArr = this.f15671e;
            int i10 = this.f15673g;
            this.f15673g = E5.b(str, bArr, i10, this.f15672f - i10);
        } catch (D5 e8) {
            this.f15673g = i8;
            b(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new C1973d4(e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final int d() {
        return this.f15672f - this.f15673g;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void e(byte b8) {
        try {
            byte[] bArr = this.f15671e;
            int i8 = this.f15673g;
            this.f15673g = i8 + 1;
            bArr[i8] = b8;
        } catch (IndexOutOfBoundsException e8) {
            throw new C1973d4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15673g), Integer.valueOf(this.f15672f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void f(int i8, boolean z8) {
        r(i8 << 3);
        e(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void g(int i8, X3 x32) {
        r((i8 << 3) | 2);
        r(x32.g());
        x32.p(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void h(int i8, int i9) {
        r((i8 << 3) | 5);
        i(i9);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void i(int i8) {
        try {
            byte[] bArr = this.f15671e;
            int i9 = this.f15673g;
            int i10 = i9 + 1;
            this.f15673g = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.f15673g = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.f15673g = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f15673g = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new C1973d4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15673g), Integer.valueOf(this.f15672f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void j(int i8, long j8) {
        r((i8 << 3) | 1);
        k(j8);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void k(long j8) {
        try {
            byte[] bArr = this.f15671e;
            int i8 = this.f15673g;
            int i9 = i8 + 1;
            this.f15673g = i9;
            bArr[i8] = (byte) (((int) j8) & 255);
            int i10 = i8 + 2;
            this.f15673g = i10;
            bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
            int i11 = i8 + 3;
            this.f15673g = i11;
            bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
            int i12 = i8 + 4;
            this.f15673g = i12;
            bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
            int i13 = i8 + 5;
            this.f15673g = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.f15673g = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.f15673g = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f15673g = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new C1973d4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15673g), Integer.valueOf(this.f15672f), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void l(int i8, int i9) {
        r(i8 << 3);
        m(i9);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void m(int i8) {
        if (i8 >= 0) {
            r(i8);
        } else {
            t(i8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void n(byte[] bArr, int i8, int i9) {
        B(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void o(int i8, String str) {
        r((i8 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void p(int i8, int i9) {
        r((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void q(int i8, int i9) {
        r(i8 << 3);
        r(i9);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void r(int i8) {
        while ((i8 & (-128)) != 0) {
            try {
                byte[] bArr = this.f15671e;
                int i9 = this.f15673g;
                this.f15673g = i9 + 1;
                bArr[i9] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new C1973d4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15673g), Integer.valueOf(this.f15672f), 1), e8);
            }
        }
        byte[] bArr2 = this.f15671e;
        int i10 = this.f15673g;
        this.f15673g = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void s(int i8, long j8) {
        r(i8 << 3);
        t(j8);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1991f4
    public final void t(long j8) {
        boolean z8;
        z8 = AbstractC1991f4.f15701c;
        if (z8 && this.f15672f - this.f15673g >= 10) {
            while ((j8 & (-128)) != 0) {
                byte[] bArr = this.f15671e;
                int i8 = this.f15673g;
                this.f15673g = i8 + 1;
                AbstractC2153z5.s(bArr, i8, (byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            }
            byte[] bArr2 = this.f15671e;
            int i9 = this.f15673g;
            this.f15673g = 1 + i9;
            AbstractC2153z5.s(bArr2, i9, (byte) j8);
            return;
        }
        while ((j8 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f15671e;
                int i10 = this.f15673g;
                this.f15673g = i10 + 1;
                bArr3[i10] = (byte) ((((int) j8) & 127) | 128);
                j8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new C1973d4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15673g), Integer.valueOf(this.f15672f), 1), e8);
            }
        }
        byte[] bArr4 = this.f15671e;
        int i11 = this.f15673g;
        this.f15673g = i11 + 1;
        bArr4[i11] = (byte) j8;
    }
}
