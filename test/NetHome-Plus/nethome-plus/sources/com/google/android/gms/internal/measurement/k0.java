package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class k0 extends o0 {

    /* renamed from: k, reason: collision with root package name */
    private final int f15984k;
    private final int l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzte.K(i2, i2 + i3, bArr.length);
        this.f15984k = i2;
        this.l = i3;
    }

    @Override // com.google.android.gms.internal.measurement.o0
    protected final int R() {
        return this.f15984k;
    }

    @Override // com.google.android.gms.internal.measurement.o0, com.google.android.gms.internal.measurement.zzte
    public final int size() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.measurement.o0, com.google.android.gms.internal.measurement.zzte
    public final byte w(int i2) {
        int size = size();
        if (((size - (i2 + 1)) | i2) >= 0) {
            return this.f16004j[this.f15984k + i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.o0, com.google.android.gms.internal.measurement.zzte
    public final byte z(int i2) {
        return this.f16004j[this.f15984k + i2];
    }
}
