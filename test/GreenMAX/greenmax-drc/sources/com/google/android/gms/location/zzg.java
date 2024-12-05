package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzg implements Parcelable.Creator<ActivityTransitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionResult createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            if (SafeParcelReader.v(z) != 1) {
                SafeParcelReader.H(parcel, z);
            } else {
                arrayList = SafeParcelReader.t(parcel, z, ActivityTransitionEvent.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new ActivityTransitionResult(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionResult[] newArray(int i2) {
        return new ActivityTransitionResult[i2];
    }
}
