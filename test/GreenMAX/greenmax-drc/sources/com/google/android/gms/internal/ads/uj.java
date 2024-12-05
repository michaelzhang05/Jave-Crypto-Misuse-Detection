package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
final class uj implements zzban<ParcelFileDescriptor> {
    private final /* synthetic */ zzarr a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uj(zzcig zzcigVar, zzarr zzarrVar) {
        this.a = zzarrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void a(Throwable th) {
        try {
            this.a.a6(zzaym.w(th, zzcgm.b(th)));
        } catch (RemoteException e2) {
            zzawz.l("Service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void b(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.a.A0(parcelFileDescriptor);
        } catch (RemoteException e2) {
            zzawz.l("Service can't call client", e2);
        }
    }
}
