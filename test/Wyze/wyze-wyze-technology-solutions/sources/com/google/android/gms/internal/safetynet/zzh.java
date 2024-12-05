package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;

/* loaded from: classes2.dex */
public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // com.google.android.gms.internal.safetynet.zzb
    protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            e1((Status) zzc.a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zza) zzc.a(parcel, com.google.android.gms.safetynet.zza.CREATOR));
        } else if (i2 == 2) {
            g0(parcel.readString());
        } else if (i2 == 3) {
            v2((Status) zzc.a(parcel, Status.CREATOR), (SafeBrowsingData) zzc.a(parcel, SafeBrowsingData.CREATOR));
        } else if (i2 == 4) {
            V6((Status) zzc.a(parcel, Status.CREATOR), zzc.c(parcel));
        } else if (i2 == 6) {
            P3((Status) zzc.a(parcel, Status.CREATOR), (zzf) zzc.a(parcel, zzf.CREATOR));
        } else if (i2 == 8) {
            E5((Status) zzc.a(parcel, Status.CREATOR), (zzd) zzc.a(parcel, zzd.CREATOR));
        } else if (i2 == 15) {
            W5((Status) zzc.a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zzh) zzc.a(parcel, com.google.android.gms.safetynet.zzh.CREATOR));
        } else if (i2 == 10) {
            T5((Status) zzc.a(parcel, Status.CREATOR), zzc.c(parcel));
        } else {
            if (i2 != 11) {
                return false;
            }
            b0((Status) zzc.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
