package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzatv extends zzfm implements zzatt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void E7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.a(u, z);
        R(10, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void L1(zzxz zzxzVar, zzaub zzaubVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzxzVar);
        zzfo.c(u, zzaubVar);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void V5(zzaao zzaaoVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzaaoVar);
        R(8, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void c6(zzatw zzatwVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzatwVar);
        R(2, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void d2(zzaum zzaumVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzaumVar);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel C = C(9, u());
        Bundle bundle = (Bundle) zzfo.b(C, Bundle.CREATOR);
        C.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel C = C(4, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final boolean isLoaded() throws RemoteException {
        Parcel C = C(3, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final zzatq n7() throws RemoteException {
        zzatq zzatsVar;
        Parcel C = C(11, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzatsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzatq) {
                zzatsVar = (zzatq) queryLocalInterface;
            } else {
                zzatsVar = new zzats(readStrongBinder);
            }
        }
        C.recycle();
        return zzatsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void q5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(5, u);
    }
}
