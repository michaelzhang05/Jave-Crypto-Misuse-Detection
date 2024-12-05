package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2277w4 extends C4 {

    /* renamed from: e, reason: collision with root package name */
    private final int f16879e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16880f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2277w4(byte[] bArr, int i8, int i9) {
        super(bArr);
        AbstractC2241s4.f(i8, i8 + i9, bArr.length);
        this.f16879e = i8;
        this.f16880f = i9;
    }

    @Override // com.google.android.gms.internal.measurement.C4, com.google.android.gms.internal.measurement.AbstractC2241s4
    public final byte c(int i8) {
        int r8 = r();
        if (((r8 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + r8);
        }
        return this.f16095d[this.f16879e + i8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C4, com.google.android.gms.internal.measurement.AbstractC2241s4
    public final byte q(int i8) {
        return this.f16095d[this.f16879e + i8];
    }

    @Override // com.google.android.gms.internal.measurement.C4, com.google.android.gms.internal.measurement.AbstractC2241s4
    public final int r() {
        return this.f16880f;
    }

    @Override // com.google.android.gms.internal.measurement.C4
    protected final int y() {
        return this.f16879e;
    }
}
