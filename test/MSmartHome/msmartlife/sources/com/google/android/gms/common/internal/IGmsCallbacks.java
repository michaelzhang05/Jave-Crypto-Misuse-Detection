package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface IGmsCallbacks extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class zza extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                M3(parcel.readInt(), parcel.readStrongBinder(), (Bundle) com.google.android.gms.internal.common.zzc.b(parcel, Bundle.CREATOR));
            } else if (i2 == 2) {
                n3(parcel.readInt(), (Bundle) com.google.android.gms.internal.common.zzc.b(parcel, Bundle.CREATOR));
            } else {
                if (i2 != 3) {
                    return false;
                }
                a3(parcel.readInt(), parcel.readStrongBinder(), (zzb) com.google.android.gms.internal.common.zzc.b(parcel, zzb.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void M3(int i2, IBinder iBinder, Bundle bundle) throws RemoteException;

    void a3(int i2, IBinder iBinder, zzb zzbVar) throws RemoteException;

    void n3(int i2, Bundle bundle) throws RemoteException;
}
