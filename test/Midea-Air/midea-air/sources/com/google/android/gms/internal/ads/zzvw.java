package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzvw implements Parcelable.Creator<zzvv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvv createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z2)) {
                case 2:
                    str = SafeParcelReader.p(parcel, z2);
                    break;
                case 3:
                    j2 = SafeParcelReader.D(parcel, z2);
                    break;
                case 4:
                    str2 = SafeParcelReader.p(parcel, z2);
                    break;
                case 5:
                    str3 = SafeParcelReader.p(parcel, z2);
                    break;
                case 6:
                    str4 = SafeParcelReader.p(parcel, z2);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel, z2);
                    break;
                case 8:
                    z = SafeParcelReader.w(parcel, z2);
                    break;
                case 9:
                    j3 = SafeParcelReader.D(parcel, z2);
                    break;
                default:
                    SafeParcelReader.H(parcel, z2);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzvv(str, j2, str2, str3, str4, bundle, z, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvv[] newArray(int i2) {
        return new zzvv[i2];
    }
}
