package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zao implements Parcelable.Creator<SignInButtonConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInButtonConfig createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        int i2 = 0;
        Scope[] scopeArr = null;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v == 2) {
                i3 = SafeParcelReader.B(parcel, z);
            } else if (v == 3) {
                i4 = SafeParcelReader.B(parcel, z);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.s(parcel, z, Scope.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new SignInButtonConfig(i2, i3, i4, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInButtonConfig[] newArray(int i2) {
        return new SignInButtonConfig[i2];
    }
}
