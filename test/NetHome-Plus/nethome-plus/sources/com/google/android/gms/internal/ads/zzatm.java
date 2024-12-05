package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzatm extends zzfm implements zzatk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void M0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(4, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void R1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(5, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void V2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void X3(IObjectWrapper iObjectWrapper, zzato zzatoVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzatoVar);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void c4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(10, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void e7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(8, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void h2(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeInt(i2);
        R(9, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void l5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(11, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void r3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void r6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(6, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void t1(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeInt(i2);
        R(2, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, bundle);
        R(12, u);
    }
}
