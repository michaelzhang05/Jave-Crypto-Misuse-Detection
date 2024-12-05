package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zan implements Parcelable.Creator<ResolveAccountResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < I) {
            int z3 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z3);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z3);
            } else if (v == 2) {
                iBinder = SafeParcelReader.A(parcel, z3);
            } else if (v == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.o(parcel, z3, ConnectionResult.CREATOR);
            } else if (v == 4) {
                z = SafeParcelReader.w(parcel, z3);
            } else if (v != 5) {
                SafeParcelReader.H(parcel, z3);
            } else {
                z2 = SafeParcelReader.w(parcel, z3);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new ResolveAccountResponse(i2, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse[] newArray(int i2) {
        return new ResolveAccountResponse[i2];
    }
}
