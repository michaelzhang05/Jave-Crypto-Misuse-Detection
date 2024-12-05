package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f10780g = {"data"};

    /* renamed from: h, reason: collision with root package name */
    private final Parcelable.Creator<T> f10781h;

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T get(int i2) {
        DataHolder dataHolder = this.f10769f;
        byte[] w = dataHolder.w("data", i2, dataHolder.L(i2));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(w, 0, w.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.f10781h.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
