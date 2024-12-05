package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes2.dex */
public final class zzzh extends zzfm implements zzzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void C5(zzzy zzzyVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzzyVar);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void C6(zzady zzadyVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzadyVar);
        R(6, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void E3(zzafi zzafiVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzafiVar);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void O1(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, publisherAdViewOptions);
        R(9, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void Q0(zzafu zzafuVar, zzyd zzydVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzafuVar);
        zzfo.d(u, zzydVar);
        R(8, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void R5(String str, zzafr zzafrVar, zzafo zzafoVar) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        zzfo.c(u, zzafrVar);
        zzfo.c(u, zzafoVar);
        R(5, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void U1(zzyz zzyzVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzyzVar);
        R(2, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void Y3(zzafx zzafxVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzafxVar);
        R(10, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void n1(zzafl zzaflVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzaflVar);
        R(4, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzzc x1() throws RemoteException {
        zzzc zzzeVar;
        Parcel C = C(1, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzzeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzzc) {
                zzzeVar = (zzzc) queryLocalInterface;
            } else {
                zzzeVar = new zzze(readStrongBinder);
            }
        }
        C.recycle();
        return zzzeVar;
    }
}
