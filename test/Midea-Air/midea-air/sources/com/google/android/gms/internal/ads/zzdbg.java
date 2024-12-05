package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzdbg extends zzfm implements zzdbf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final zzdbd H4(zzdbb zzdbbVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzdbbVar);
        Parcel C = C(1, u);
        zzdbd zzdbdVar = (zzdbd) zzfo.b(C, zzdbd.CREATOR);
        C.recycle();
        return zzdbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void m3(zzday zzdayVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzdayVar);
        R(2, u);
    }
}
