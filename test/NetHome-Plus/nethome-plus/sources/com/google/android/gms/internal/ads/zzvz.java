package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzvz extends zzfm implements zzvy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final zzvs L4(zzvv zzvvVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzvvVar);
        Parcel C = C(1, u);
        zzvs zzvsVar = (zzvs) zzfo.b(C, zzvs.CREATOR);
        C.recycle();
        return zzvsVar;
    }
}
