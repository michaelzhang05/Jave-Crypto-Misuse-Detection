package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator<ProxyRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyRequest createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v == 2) {
                i3 = SafeParcelReader.B(parcel, z);
            } else if (v == 3) {
                j2 = SafeParcelReader.D(parcel, z);
            } else if (v == 4) {
                bArr = SafeParcelReader.g(parcel, z);
            } else if (v == 5) {
                bundle = SafeParcelReader.f(parcel, z);
            } else if (v != 1000) {
                SafeParcelReader.H(parcel, z);
            } else {
                i2 = SafeParcelReader.B(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new ProxyRequest(i2, str, i3, j2, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyRequest[] newArray(int i2) {
        return new ProxyRequest[i2];
    }
}
