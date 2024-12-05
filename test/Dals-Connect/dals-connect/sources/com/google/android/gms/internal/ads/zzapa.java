package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzapa extends zzfm implements zzaoy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final void I2(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final void onFailure(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(2, u);
    }
}
