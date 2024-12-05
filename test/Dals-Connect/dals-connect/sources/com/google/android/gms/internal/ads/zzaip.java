package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaip implements Parcelable.Creator<zzaio> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaio createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z2);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, z2);
            } else if (v == 2) {
                z = SafeParcelReader.w(parcel, z2);
            } else if (v == 3) {
                i2 = SafeParcelReader.B(parcel, z2);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z2);
            } else {
                str2 = SafeParcelReader.p(parcel, z2);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzaio(str, z, i2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaio[] newArray(int i2) {
        return new zzaio[i2];
    }
}
