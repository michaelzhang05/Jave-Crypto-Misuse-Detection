package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaet extends zzfm implements zzaer {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaet(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void H(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void M5() throws RemoteException {
        R(2, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void a0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(3, u);
    }
}
