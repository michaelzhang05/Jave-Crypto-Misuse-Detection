package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbg implements Parcelable.Creator<zzbf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbf createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        zzbd zzbdVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i2 = 1;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z);
                    break;
                case 2:
                    zzbdVar = (zzbd) SafeParcelReader.o(parcel, z, zzbd.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.A(parcel, z);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.o(parcel, z, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.A(parcel, z);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.A(parcel, z);
                    break;
                default:
                    SafeParcelReader.H(parcel, z);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzbf(i2, zzbdVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbf[] newArray(int i2) {
        return new zzbf[i2];
    }
}
