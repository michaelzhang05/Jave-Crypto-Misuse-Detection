package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzl implements Parcelable.Creator<zzk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzk createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < I) {
            int z3 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z3);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, z3);
            } else if (v == 2) {
                iBinder = SafeParcelReader.A(parcel, z3);
            } else if (v == 3) {
                z = SafeParcelReader.w(parcel, z3);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z3);
            } else {
                z2 = SafeParcelReader.w(parcel, z3);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzk(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzk[] newArray(int i2) {
        return new zzk[i2];
    }
}
