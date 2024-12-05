package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzm extends zzfm implements zzzk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void A4(zzzy zzzyVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzzyVar);
        R(21, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void C4(zzyw zzywVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzywVar);
        R(20, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzyz K5() throws RemoteException {
        zzyz zzzbVar;
        Parcel C = C(33, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzzbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof zzyz) {
                zzzbVar = (zzyz) queryLocalInterface;
            } else {
                zzzbVar = new zzzb(readStrongBinder);
            }
        }
        C.recycle();
        return zzzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final String M() throws RemoteException {
        Parcel C = C(35, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void P(zzatb zzatbVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzatbVar);
        R(24, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzzs P4() throws RemoteException {
        zzzs zzzuVar;
        Parcel C = C(32, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzzuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof zzzs) {
                zzzuVar = (zzzs) queryLocalInterface;
            } else {
                zzzuVar = new zzzu(readStrongBinder);
            }
        }
        C.recycle();
        return zzzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final boolean Q4(zzxz zzxzVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzxzVar);
        Parcel C = C(4, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzyd Q5() throws RemoteException {
        Parcel C = C(12, u());
        zzyd zzydVar = (zzyd) zzfo.b(C, zzyd.CREATOR);
        C.recycle();
        return zzydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void S6() throws RemoteException {
        R(11, u());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final boolean U() throws RemoteException {
        Parcel C = C(23, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void c0(zzzp zzzpVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzzpVar);
        R(36, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void destroy() throws RemoteException {
        R(2, u());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void f7(zzado zzadoVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzadoVar);
        R(19, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void g6(zzzs zzzsVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzzsVar);
        R(8, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel C = C(37, u());
        Bundle bundle = (Bundle) zzfo.b(C, Bundle.CREATOR);
        C.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzaar getVideoController() throws RemoteException {
        zzaar zzaatVar;
        Parcel C = C(26, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzaatVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof zzaar) {
                zzaatVar = (zzaar) queryLocalInterface;
            } else {
                zzaatVar = new zzaat(readStrongBinder);
            }
        }
        C.recycle();
        return zzaatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void i1(boolean z) throws RemoteException {
        Parcel u = u();
        zzfo.a(u, z);
        R(22, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final boolean p() throws RemoteException {
        Parcel C = C(3, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void p0(zzyz zzyzVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzyzVar);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void pause() throws RemoteException {
        R(5, u());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void q2(zzyd zzydVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzydVar);
        R(13, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void resume() throws RemoteException {
        R(6, u());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel u = u();
        zzfo.a(u, z);
        R(34, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void showInterstitial() throws RemoteException {
        R(9, u());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final IObjectWrapper w0() throws RemoteException {
        Parcel C = C(1, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final String x6() throws RemoteException {
        Parcel C = C(31, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void x7(zzacd zzacdVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzacdVar);
        R(29, u);
    }
}
