package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<ActivityRecognitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityRecognitionResult createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        long j2 = 0;
        long j3 = 0;
        ArrayList arrayList = null;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                arrayList = SafeParcelReader.t(parcel, z, DetectedActivity.CREATOR);
            } else if (v == 2) {
                j2 = SafeParcelReader.D(parcel, z);
            } else if (v == 3) {
                j3 = SafeParcelReader.D(parcel, z);
            } else if (v == 4) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v != 5) {
                SafeParcelReader.H(parcel, z);
            } else {
                bundle = SafeParcelReader.f(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new ActivityRecognitionResult(arrayList, j2, j3, i2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityRecognitionResult[] newArray(int i2) {
        return new ActivityRecognitionResult[i2];
    }
}
