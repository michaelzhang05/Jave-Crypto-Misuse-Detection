package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcla extends zzamw implements zzbsm {

    /* renamed from: f, reason: collision with root package name */
    private zzamv f14179f;

    /* renamed from: g, reason: collision with root package name */
    private zzbsn f14180g;

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void E(int i2) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.E(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final synchronized void F6(zzbsn zzbsnVar) {
        this.f14180g = zzbsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void G5(zzato zzatoVar) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.G5(zzatoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void H0() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.H0();
        }
    }

    public final synchronized void I7(zzamv zzamvVar) {
        this.f14179f = zzamvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void S() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.S();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void U0(zzamy zzamyVar) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.U0(zzamyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void Y(zzatq zzatqVar) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.Y(zzatqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void h3(String str) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.h3(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void h7() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.h7();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void j0(zzafe zzafeVar, String str) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.j0(zzafeVar, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdClicked() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdClosed() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdFailedToLoad(int i2) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onAdFailedToLoad(i2);
        }
        zzbsn zzbsnVar = this.f14180g;
        if (zzbsnVar != null) {
            zzbsnVar.onAdFailedToLoad(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdImpression() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdLeftApplication() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdLoaded() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onAdLoaded();
        }
        zzbsn zzbsnVar = this.f14180g;
        if (zzbsnVar != null) {
            zzbsnVar.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdOpened() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onVideoPause() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onVideoPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onVideoPlay() throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.onVideoPlay();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        zzamv zzamvVar = this.f14179f;
        if (zzamvVar != null) {
            zzamvVar.zzb(bundle);
        }
    }
}
