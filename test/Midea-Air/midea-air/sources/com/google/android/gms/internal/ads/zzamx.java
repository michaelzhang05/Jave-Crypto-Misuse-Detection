package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzamx extends zzfm implements zzamv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void E(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(17, u);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void G5(zzato zzatoVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzatoVar);
        R(14, u);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void H0() throws RemoteException {
        R(13, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void S() throws RemoteException {
        R(11, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void U0(zzamy zzamyVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzamyVar);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void Y(zzatq zzatqVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzatqVar);
        R(16, u);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void h3(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(12, u);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void h7() throws RemoteException {
        R(18, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void j0(zzafe zzafeVar, String str) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzafeVar);
        u.writeString(str);
        R(10, u);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClicked() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClosed() throws RemoteException {
        R(2, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdFailedToLoad(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdImpression() throws RemoteException {
        R(8, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLeftApplication() throws RemoteException {
        R(4, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLoaded() throws RemoteException {
        R(6, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdOpened() throws RemoteException {
        R(5, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        R(9, u);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPause() throws RemoteException {
        R(15, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPlay() throws RemoteException {
        R(20, u());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, bundle);
        R(19, u);
    }
}
