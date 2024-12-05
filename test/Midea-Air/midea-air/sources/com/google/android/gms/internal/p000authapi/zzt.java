package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzt implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            if (SafeParcelReader.v(z) != 1) {
                SafeParcelReader.H(parcel, z);
            } else {
                credential = (Credential) SafeParcelReader.o(parcel, z, Credential.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzs(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs[] newArray(int i2) {
        return new zzs[i2];
    }
}
