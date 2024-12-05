package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public abstract class G3 implements X4 {
    @Override // com.google.android.gms.internal.measurement.X4
    public final /* synthetic */ X4 I(byte[] bArr, C2025j4 c2025j4) {
        return f(bArr, 0, bArr.length, c2025j4);
    }

    @Override // com.google.android.gms.internal.measurement.X4
    public final /* synthetic */ X4 L(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public abstract G3 e(byte[] bArr, int i8, int i9);

    public abstract G3 f(byte[] bArr, int i8, int i9, C2025j4 c2025j4);
}
