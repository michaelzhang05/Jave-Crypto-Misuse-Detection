package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzart extends zzfm implements zzarr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzart(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    public final void A0(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, parcelFileDescriptor);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    public final void a6(zzaym zzaymVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzaymVar);
        R(2, u);
    }
}
