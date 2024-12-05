package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzajd extends zzfm implements zzajc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void C7() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void Z1(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(2, u);
    }
}
