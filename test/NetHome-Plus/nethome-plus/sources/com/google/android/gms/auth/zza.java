package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator<AccountChangeEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEvent createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        String str2 = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z);
                    break;
                case 2:
                    j2 = SafeParcelReader.D(parcel, z);
                    break;
                case 3:
                    str = SafeParcelReader.p(parcel, z);
                    break;
                case 4:
                    i3 = SafeParcelReader.B(parcel, z);
                    break;
                case 5:
                    i4 = SafeParcelReader.B(parcel, z);
                    break;
                case 6:
                    str2 = SafeParcelReader.p(parcel, z);
                    break;
                default:
                    SafeParcelReader.H(parcel, z);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new AccountChangeEvent(i2, j2, str, i3, i4, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEvent[] newArray(int i2) {
        return new AccountChangeEvent[i2];
    }
}
