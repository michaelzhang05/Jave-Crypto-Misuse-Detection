package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2150i4 implements H5 {
    public abstract /* synthetic */ Object clone();

    public abstract AbstractC2150i4 e(byte[] bArr, int i8, int i9);

    public abstract AbstractC2150i4 f(byte[] bArr, int i8, int i9, O4 o42);

    @Override // com.google.android.gms.internal.measurement.H5
    public final /* synthetic */ H5 v(byte[] bArr, O4 o42) {
        return f(bArr, 0, bArr.length, o42);
    }

    @Override // com.google.android.gms.internal.measurement.H5
    public final /* synthetic */ H5 y(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }
}
