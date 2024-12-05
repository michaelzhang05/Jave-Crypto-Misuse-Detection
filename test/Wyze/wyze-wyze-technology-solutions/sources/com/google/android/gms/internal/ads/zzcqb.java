package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcqb implements zzbro, zzbsr {

    /* renamed from: f, reason: collision with root package name */
    private zzaub f14355f;

    public final synchronized void a(zzaub zzaubVar) {
        this.f14355f = zzaubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final synchronized void onAdFailedToLoad(int i2) {
        zzaub zzaubVar = this.f14355f;
        if (zzaubVar != null) {
            try {
                zzaubVar.Z4(i2);
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        zzaub zzaubVar = this.f14355f;
        if (zzaubVar != null) {
            try {
                zzaubVar.Y0();
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }
}
