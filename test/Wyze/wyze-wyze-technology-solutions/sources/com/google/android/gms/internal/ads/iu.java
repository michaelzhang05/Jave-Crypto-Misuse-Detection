package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class iu extends nu {

    /* renamed from: k, reason: collision with root package name */
    private final int f11616k;
    private final int l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public iu(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzdmr.R(i2, i2 + i3, bArr.length);
        this.f11616k = i2;
        this.l = i3;
    }

    @Override // com.google.android.gms.internal.ads.nu, com.google.android.gms.internal.ads.zzdmr
    public final byte O(int i2) {
        int size = size();
        if (((size - (i2 + 1)) | i2) >= 0) {
            return this.f11893j[this.f11616k + i2];
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
    @Override // com.google.android.gms.internal.ads.nu, com.google.android.gms.internal.ads.zzdmr
    public final byte P(int i2) {
        return this.f11893j[this.f11616k + i2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.nu
    public final int X() {
        return this.f11616k;
    }

    @Override // com.google.android.gms.internal.ads.nu, com.google.android.gms.internal.ads.zzdmr
    protected final void o(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f11893j, X(), bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.ads.nu, com.google.android.gms.internal.ads.zzdmr
    public final int size() {
        return this.l;
    }
}
