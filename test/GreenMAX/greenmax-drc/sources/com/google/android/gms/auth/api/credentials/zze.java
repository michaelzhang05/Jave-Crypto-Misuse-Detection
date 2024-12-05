package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zze implements Parcelable.Creator<CredentialPickerConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < I) {
            int z4 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z4);
            if (v == 1) {
                z = SafeParcelReader.w(parcel, z4);
            } else if (v == 2) {
                z2 = SafeParcelReader.w(parcel, z4);
            } else if (v == 3) {
                z3 = SafeParcelReader.w(parcel, z4);
            } else if (v == 4) {
                i3 = SafeParcelReader.B(parcel, z4);
            } else if (v != 1000) {
                SafeParcelReader.H(parcel, z4);
            } else {
                i2 = SafeParcelReader.B(parcel, z4);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new CredentialPickerConfig(i2, z, z2, z3, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig[] newArray(int i2) {
        return new CredentialPickerConfig[i2];
    }
}
