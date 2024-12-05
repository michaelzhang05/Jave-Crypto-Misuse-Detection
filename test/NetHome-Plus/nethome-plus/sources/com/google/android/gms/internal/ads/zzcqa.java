package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcqa implements zzbrl, zzbrs {

    /* renamed from: f, reason: collision with root package name */
    private zzatw f14353f;

    /* renamed from: g, reason: collision with root package name */
    private zzaue f14354g;

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final synchronized void E(int i2) {
        zzatw zzatwVar = this.f14353f;
        if (zzatwVar != null) {
            try {
                zzatwVar.J6(i2);
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void a(zzasr zzasrVar, String str, String str2) {
        zzatw zzatwVar = this.f14353f;
        if (zzatwVar != null) {
            try {
                zzatwVar.Y(new zzaup(zzasrVar.getType(), zzasrVar.getAmount()));
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
        zzaue zzaueVar = this.f14354g;
        if (zzaueVar != null) {
            try {
                zzaueVar.O2(new zzaup(zzasrVar.getType(), zzasrVar.getAmount()), str, str2);
            } catch (RemoteException e3) {
                zzbad.f("#007 Could not call remote method.", e3);
            }
        }
    }

    public final synchronized void b(zzatw zzatwVar) {
        this.f14353f = zzatwVar;
    }

    public final synchronized void c(zzaue zzaueVar) {
        this.f14354g = zzaueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdClosed() {
        zzatw zzatwVar = this.f14353f;
        if (zzatwVar != null) {
            try {
                zzatwVar.Z0();
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdOpened() {
        zzatw zzatwVar = this.f14353f;
        if (zzatwVar != null) {
            try {
                zzatwVar.G1();
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoStarted() {
    }
}
