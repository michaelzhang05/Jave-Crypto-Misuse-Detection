package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaih extends zzfm implements zzaig {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final void U2(zzaia zzaiaVar, zzaie zzaieVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzaiaVar);
        zzfo.c(u, zzaieVar);
        i0(2, u);
    }
}
