package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaft extends zzfm implements zzafr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final void U4(zzafe zzafeVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzafeVar);
        R(1, u);
    }
}
