package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzanj extends zzaas {

    /* renamed from: f, reason: collision with root package name */
    private final Object f12817f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private volatile zzaau f12818g;

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void F1(zzaau zzaauVar) throws RemoteException {
        synchronized (this.f12817f) {
            this.f12818g = zzaauVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final float G() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean J0() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void f2(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final float j6() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final zzaau k5() throws RemoteException {
        zzaau zzaauVar;
        synchronized (this.f12817f) {
            zzaauVar = this.f12818g;
        }
        return zzaauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final float q7() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int t() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean u1() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void v5() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean w5() throws RemoteException {
        throw new RemoteException();
    }
}
