package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzf implements Parcelable.Creator<ActivityTransitionRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionRequest createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                arrayList = SafeParcelReader.t(parcel, z, ActivityTransition.CREATOR);
            } else if (v == 2) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v != 3) {
                SafeParcelReader.H(parcel, z);
            } else {
                arrayList2 = SafeParcelReader.t(parcel, z, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new ActivityTransitionRequest(arrayList, str, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionRequest[] newArray(int i2) {
        return new ActivityTransitionRequest[i2];
    }
}
