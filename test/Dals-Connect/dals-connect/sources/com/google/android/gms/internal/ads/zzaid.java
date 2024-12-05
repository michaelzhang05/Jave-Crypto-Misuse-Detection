package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaid implements Parcelable.Creator<zzaic> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j2 = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < I) {
            int z3 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z3)) {
                case 1:
                    z = SafeParcelReader.w(parcel, z3);
                    break;
                case 2:
                    str = SafeParcelReader.p(parcel, z3);
                    break;
                case 3:
                    i2 = SafeParcelReader.B(parcel, z3);
                    break;
                case 4:
                    bArr = SafeParcelReader.g(parcel, z3);
                    break;
                case 5:
                    strArr = SafeParcelReader.q(parcel, z3);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.q(parcel, z3);
                    break;
                case 7:
                    z2 = SafeParcelReader.w(parcel, z3);
                    break;
                case 8:
                    j2 = SafeParcelReader.D(parcel, z3);
                    break;
                default:
                    SafeParcelReader.H(parcel, z3);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzaic(z, str, i2, bArr, strArr, strArr2, z2, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic[] newArray(int i2) {
        return new zzaic[i2];
    }
}
