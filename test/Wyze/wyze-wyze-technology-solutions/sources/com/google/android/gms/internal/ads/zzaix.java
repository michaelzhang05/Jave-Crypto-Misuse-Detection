package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaix implements Parcelable.Creator<zzaiw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiw createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                bundle = SafeParcelReader.f(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzaiw(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiw[] newArray(int i2) {
        return new zzaiw[i2];
    }
}
