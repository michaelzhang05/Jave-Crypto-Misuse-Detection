package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzafn extends zzfm implements zzafl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void j2(zzafa zzafaVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzafaVar);
        R(1, u);
    }
}
