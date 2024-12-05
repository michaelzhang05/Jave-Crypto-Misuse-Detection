package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaaw extends zzfm implements zzaau {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void S() throws RemoteException {
        R(4, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoPause() throws RemoteException {
        R(3, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoPlay() throws RemoteException {
        R(2, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoStart() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void x0(boolean z) throws RemoteException {
        Parcel u = u();
        zzfo.a(u, z);
        R(5, u);
    }
}
