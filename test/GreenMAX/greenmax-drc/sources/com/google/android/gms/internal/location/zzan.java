package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzan extends zzb implements zzam {
    public zzan() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            h6(parcel.readInt(), parcel.createStringArray());
        } else if (i2 == 2) {
            F7(parcel.readInt(), parcel.createStringArray());
        } else {
            if (i2 != 3) {
                return false;
            }
            q3(parcel.readInt(), (PendingIntent) zzc.a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
