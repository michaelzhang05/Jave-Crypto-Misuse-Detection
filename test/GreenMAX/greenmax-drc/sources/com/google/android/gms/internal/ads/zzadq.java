package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzadq extends zzfm implements zzado {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void E2(zzadl zzadlVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzadlVar);
        R(1, u);
    }
}
