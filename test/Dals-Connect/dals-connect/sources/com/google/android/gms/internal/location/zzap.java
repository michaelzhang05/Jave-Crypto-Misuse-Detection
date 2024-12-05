package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzap extends zza implements zzao {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void P5(zzbf zzbfVar) throws RemoteException {
        Parcel u = u();
        zzc.b(u, zzbfVar);
        C(59, u);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void d0(boolean z) throws RemoteException {
        Parcel u = u();
        zzc.c(u, z);
        C(12, u);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void x3(zzo zzoVar) throws RemoteException {
        Parcel u = u();
        zzc.b(u, zzoVar);
        C(75, u);
    }
}
