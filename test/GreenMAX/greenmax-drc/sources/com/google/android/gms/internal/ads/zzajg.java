package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzajg extends zzfm implements zzaje {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void c3(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(2, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    public final void y6(zzaja zzajaVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzajaVar);
        R(1, u);
    }
}
