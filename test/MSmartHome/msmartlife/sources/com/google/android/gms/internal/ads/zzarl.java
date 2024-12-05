package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzarl implements Parcelable.Creator<zzark> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzark createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z2);
            if (v == 2) {
                z = SafeParcelReader.w(parcel, z2);
            } else if (v != 3) {
                SafeParcelReader.H(parcel, z2);
            } else {
                arrayList = SafeParcelReader.r(parcel, z2);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzark(z, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzark[] newArray(int i2) {
        return new zzark[i2];
    }
}
