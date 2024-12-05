package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbjj extends zzfm implements zzbjh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    public final void p1(zzbjf zzbjfVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzbjfVar);
        R(1, u);
    }
}
