package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzxu implements Parcelable.Creator<zzxt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzxt createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                str2 = SafeParcelReader.p(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzxt(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzxt[] newArray(int i2) {
        return new zzxt[i2];
    }
}