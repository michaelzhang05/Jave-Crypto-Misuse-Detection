package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaou extends zzfm implements zzaos {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void B() throws RemoteException {
        R(2, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void j(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(3, u);
    }
}
