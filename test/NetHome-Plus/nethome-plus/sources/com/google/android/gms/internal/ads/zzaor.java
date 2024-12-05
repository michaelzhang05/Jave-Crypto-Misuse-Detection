package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaor extends zzfm implements zzaop {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaor(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    public final void K4(zzang zzangVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzangVar);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    public final void j(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(2, u);
    }
}
