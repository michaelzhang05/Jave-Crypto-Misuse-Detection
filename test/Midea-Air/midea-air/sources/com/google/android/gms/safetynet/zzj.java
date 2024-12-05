package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class zzj implements Parcelable.Creator<SafeBrowsingData> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, safeBrowsingData.J(), false);
        SafeParcelWriter.o(parcel, 3, safeBrowsingData.w(), i2, false);
        SafeParcelWriter.o(parcel, 4, safeBrowsingData.z(), i2, false);
        SafeParcelWriter.l(parcel, 5, safeBrowsingData.D());
        SafeParcelWriter.e(parcel, 6, safeBrowsingData.L(), false);
        SafeParcelWriter.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeBrowsingData createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 2) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v == 3) {
                dataHolder = (DataHolder) SafeParcelReader.o(parcel, z, DataHolder.CREATOR);
            } else if (v == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.o(parcel, z, ParcelFileDescriptor.CREATOR);
            } else if (v == 5) {
                j2 = SafeParcelReader.D(parcel, z);
            } else if (v != 6) {
                SafeParcelReader.H(parcel, z);
            } else {
                bArr = SafeParcelReader.g(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new SafeBrowsingData(str, dataHolder, parcelFileDescriptor, j2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeBrowsingData[] newArray(int i2) {
        return new SafeBrowsingData[i2];
    }
}
