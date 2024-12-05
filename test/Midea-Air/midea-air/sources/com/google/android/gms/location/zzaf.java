package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzaf implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str3 = str2;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                str2 = SafeParcelReader.p(parcel, z);
            } else if (v == 2) {
                str3 = SafeParcelReader.p(parcel, z);
            } else if (v != 5) {
                SafeParcelReader.H(parcel, z);
            } else {
                str = SafeParcelReader.p(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzae(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i2) {
        return new zzae[i2];
    }
}
