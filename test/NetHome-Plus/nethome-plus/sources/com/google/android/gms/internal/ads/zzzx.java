package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzx extends zzfm implements zzzv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zza(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzydVar);
        u.writeString(str);
        zzfo.c(u, zzampVar);
        u.writeInt(i2);
        Parcel C = C(1, u);
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzzk) {
                zzzmVar = (zzzk) queryLocalInterface;
            } else {
                zzzmVar = new zzzm(readStrongBinder);
            }
        }
        C.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zzb(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzydVar);
        u.writeString(str);
        zzfo.c(u, zzampVar);
        u.writeInt(i2);
        Parcel C = C(2, u);
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzzk) {
                zzzmVar = (zzzk) queryLocalInterface;
            } else {
                zzzmVar = new zzzm(readStrongBinder);
            }
        }
        C.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaem zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, iObjectWrapper2);
        Parcel C = C(5, u);
        zzaem H7 = zzaen.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaqg zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        Parcel C = C(8, u);
        zzaqg zzac = zzaqh.zzac(C.readStrongBinder());
        C.recycle();
        return zzac;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzf zza(IObjectWrapper iObjectWrapper, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzf zzzhVar;
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeString(str);
        zzfo.c(u, zzampVar);
        u.writeInt(i2);
        Parcel C = C(3, u);
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzzhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzzf) {
                zzzhVar = (zzzf) queryLocalInterface;
            } else {
                zzzhVar = new zzzh(readStrongBinder);
            }
        }
        C.recycle();
        return zzzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzatt zzb(IObjectWrapper iObjectWrapper, String str, zzamp zzampVar, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeString(str);
        zzfo.c(u, zzampVar);
        u.writeInt(i2);
        Parcel C = C(12, u);
        zzatt H7 = zzatu.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzasw zza(IObjectWrapper iObjectWrapper, zzamp zzampVar, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, zzampVar);
        u.writeInt(i2);
        Parcel C = C(6, u);
        zzasw H7 = zzasx.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaab zza(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzaab zzaadVar;
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeInt(i2);
        Parcel C = C(9, u);
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzaadVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzaab) {
                zzaadVar = (zzaab) queryLocalInterface;
            } else {
                zzaadVar = new zzaad(readStrongBinder);
            }
        }
        C.recycle();
        return zzaadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zza(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzydVar);
        u.writeString(str);
        u.writeInt(i2);
        Parcel C = C(10, u);
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzzk) {
                zzzmVar = (zzzk) queryLocalInterface;
            } else {
                zzzmVar = new zzzm(readStrongBinder);
            }
        }
        C.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaer zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, iObjectWrapper2);
        zzfo.c(u, iObjectWrapper3);
        Parcel C = C(11, u);
        zzaer H7 = zzaes.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }
}
