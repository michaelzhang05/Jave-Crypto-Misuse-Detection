package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzg implements Parcelable.Creator<CredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < I) {
            int z4 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z4);
            if (v != 1000) {
                switch (v) {
                    case 1:
                        z = SafeParcelReader.w(parcel, z4);
                        break;
                    case 2:
                        strArr = SafeParcelReader.q(parcel, z4);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.o(parcel, z4, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.o(parcel, z4, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = SafeParcelReader.w(parcel, z4);
                        break;
                    case 6:
                        str = SafeParcelReader.p(parcel, z4);
                        break;
                    case 7:
                        str2 = SafeParcelReader.p(parcel, z4);
                        break;
                    case 8:
                        z3 = SafeParcelReader.w(parcel, z4);
                        break;
                    default:
                        SafeParcelReader.H(parcel, z4);
                        break;
                }
            } else {
                i2 = SafeParcelReader.B(parcel, z4);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new CredentialRequest(i2, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest[] newArray(int i2) {
        return new CredentialRequest[i2];
    }
}
