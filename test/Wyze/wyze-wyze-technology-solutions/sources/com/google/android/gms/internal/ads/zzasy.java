package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzasy extends zzfm implements zzasw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void P(zzatb zzatbVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzatbVar);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void T1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(11, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void c0(zzzp zzzpVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzzpVar);
        R(14, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel C = C(15, u());
        Bundle bundle = (Bundle) zzfo.b(C, Bundle.CREATOR);
        C.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel C = C(12, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void h4(zzath zzathVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzathVar);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean isLoaded() throws RemoteException {
        Parcel C = C(5, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void k6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(10, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void l7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(9, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setCustomData(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(19, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel u = u();
        zzfo.a(u, z);
        R(34, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setUserId(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(13, u);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void show() throws RemoteException {
        R(2, u());
    }
}
