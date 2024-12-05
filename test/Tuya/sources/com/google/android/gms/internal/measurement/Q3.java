package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class Q3 extends T3 {

    /* renamed from: f, reason: collision with root package name */
    private final int f15532f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q3(byte[] bArr, int i8, int i9) {
        super(bArr);
        X3.r(0, i9, bArr.length);
        this.f15532f = i9;
    }

    @Override // com.google.android.gms.internal.measurement.T3, com.google.android.gms.internal.measurement.X3
    public final byte a(int i8) {
        int i9 = this.f15532f;
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
        return this.f15563e[i8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.T3, com.google.android.gms.internal.measurement.X3
    public final byte d(int i8) {
        return this.f15563e[i8];
    }

    @Override // com.google.android.gms.internal.measurement.T3, com.google.android.gms.internal.measurement.X3
    public final int g() {
        return this.f15532f;
    }

    @Override // com.google.android.gms.internal.measurement.T3
    protected final int w() {
        return 0;
    }
}
