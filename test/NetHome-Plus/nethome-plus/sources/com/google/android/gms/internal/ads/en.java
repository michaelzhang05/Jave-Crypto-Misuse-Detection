package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class en extends zzaap {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzaao f11368f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzcqf f11369g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public en(zzcqf zzcqfVar, zzaao zzaaoVar) {
        this.f11369g = zzcqfVar;
        this.f11368f = zzaaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void onAdMetadataChanged() throws RemoteException {
        boolean z;
        zzaao zzaaoVar;
        z = this.f11369g.o;
        if (!z || (zzaaoVar = this.f11368f) == null) {
            return;
        }
        zzaaoVar.onAdMetadataChanged();
    }
}
