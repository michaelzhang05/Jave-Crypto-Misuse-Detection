package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzclb extends zzatl implements zzbsm {

    /* renamed from: f, reason: collision with root package name */
    private zzatk f14181f;

    /* renamed from: g, reason: collision with root package name */
    private zzbsn f14182g;

    /* renamed from: h, reason: collision with root package name */
    private zzbvo f14183h;

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final synchronized void F6(zzbsn zzbsnVar) {
        this.f14182g = zzbsnVar;
    }

    public final synchronized void I7(zzatk zzatkVar) {
        this.f14181f = zzatkVar;
    }

    public final synchronized void J7(zzbvo zzbvoVar) {
        this.f14183h = zzbvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void M0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.M0(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void R1(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.R1(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void V2(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.V2(iObjectWrapper);
        }
        zzbvo zzbvoVar = this.f14183h;
        if (zzbvoVar != null) {
            zzbvoVar.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void X3(IObjectWrapper iObjectWrapper, zzato zzatoVar) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.X3(iObjectWrapper, zzatoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void c4(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.c4(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void e7(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.e7(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void h2(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.h2(iObjectWrapper, i2);
        }
        zzbsn zzbsnVar = this.f14182g;
        if (zzbsnVar != null) {
            zzbsnVar.onAdFailedToLoad(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void l5(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.l5(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void r3(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.r3(iObjectWrapper);
        }
        zzbsn zzbsnVar = this.f14182g;
        if (zzbsnVar != null) {
            zzbsnVar.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void r6(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.r6(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void t1(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.t1(iObjectWrapper, i2);
        }
        zzbvo zzbvoVar = this.f14183h;
        if (zzbvoVar != null) {
            zzbvoVar.a(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        zzatk zzatkVar = this.f14181f;
        if (zzatkVar != null) {
            zzatkVar.zzb(bundle);
        }
    }
}
