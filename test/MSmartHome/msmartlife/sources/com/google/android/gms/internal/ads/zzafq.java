package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzafq extends zzfm implements zzafo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafo
    public final void j0(zzafe zzafeVar, String str) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzafeVar);
        u.writeString(str);
        R(1, u);
    }
}
