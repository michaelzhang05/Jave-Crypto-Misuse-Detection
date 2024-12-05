package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzanp extends zzamw {

    /* renamed from: f, reason: collision with root package name */
    private final Adapter f12835f;

    /* renamed from: g, reason: collision with root package name */
    private final zzatk f12836g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanp(Adapter adapter, zzatk zzatkVar) {
        this.f12835f = adapter;
        this.f12836g = zzatkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void E(int i2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void G5(zzato zzatoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void H0() throws RemoteException {
        zzatk zzatkVar = this.f12836g;
        if (zzatkVar != null) {
            zzatkVar.R1(ObjectWrapper.i0(this.f12835f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void S() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void U0(zzamy zzamyVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void Y(zzatq zzatqVar) throws RemoteException {
        zzatk zzatkVar = this.f12836g;
        if (zzatkVar != null) {
            zzatkVar.X3(ObjectWrapper.i0(this.f12835f), new zzato(zzatqVar.getType(), zzatqVar.getAmount()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void h3(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void h7() throws RemoteException {
        zzatk zzatkVar = this.f12836g;
        if (zzatkVar != null) {
            zzatkVar.l5(ObjectWrapper.i0(this.f12835f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void j0(zzafe zzafeVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClicked() throws RemoteException {
        zzatk zzatkVar = this.f12836g;
        if (zzatkVar != null) {
            zzatkVar.e7(ObjectWrapper.i0(this.f12835f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClosed() throws RemoteException {
        zzatk zzatkVar = this.f12836g;
        if (zzatkVar != null) {
            zzatkVar.r6(ObjectWrapper.i0(this.f12835f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdFailedToLoad(int i2) throws RemoteException {
        zzatk zzatkVar = this.f12836g;
        if (zzatkVar != null) {
            zzatkVar.h2(ObjectWrapper.i0(this.f12835f), i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdImpression() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLeftApplication() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLoaded() throws RemoteException {
        zzatk zzatkVar = this.f12836g;
        if (zzatkVar != null) {
            zzatkVar.r3(ObjectWrapper.i0(this.f12835f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdOpened() throws RemoteException {
        zzatk zzatkVar = this.f12836g;
        if (zzatkVar != null) {
            zzatkVar.M0(ObjectWrapper.i0(this.f12835f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPlay() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
