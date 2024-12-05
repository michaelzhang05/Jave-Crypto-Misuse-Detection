package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaro extends zzfm implements zzarm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void Y5(zzarx zzarxVar, zzarr zzarrVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzarxVar);
        zzfo.c(u, zzarrVar);
        R(4, u);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void y7(zzarx zzarxVar, zzarr zzarrVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzarxVar);
        zzfo.c(u, zzarrVar);
        R(5, u);
    }
}
