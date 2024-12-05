package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzauz implements Parcelable.Creator<zzauy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzauy createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < I) {
            int z5 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z5)) {
                case 2:
                    str = SafeParcelReader.p(parcel, z5);
                    break;
                case 3:
                    str2 = SafeParcelReader.p(parcel, z5);
                    break;
                case 4:
                    z = SafeParcelReader.w(parcel, z5);
                    break;
                case 5:
                    z2 = SafeParcelReader.w(parcel, z5);
                    break;
                case 6:
                    arrayList = SafeParcelReader.r(parcel, z5);
                    break;
                case 7:
                    z3 = SafeParcelReader.w(parcel, z5);
                    break;
                case 8:
                    z4 = SafeParcelReader.w(parcel, z5);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.r(parcel, z5);
                    break;
                default:
                    SafeParcelReader.H(parcel, z5);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzauy(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzauy[] newArray(int i2) {
        return new zzauy[i2];
    }
}
