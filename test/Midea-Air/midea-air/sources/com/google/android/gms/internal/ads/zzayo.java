package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzayo implements Parcelable.Creator<zzaym> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaym createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                i2 = SafeParcelReader.B(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzaym(str, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaym[] newArray(int i2) {
        return new zzaym[i2];
    }
}
