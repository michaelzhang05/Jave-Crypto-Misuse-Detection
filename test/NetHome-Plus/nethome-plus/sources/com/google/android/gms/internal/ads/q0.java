package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
final class q0 extends zzaif {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbbr f12025f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(p0 p0Var, zzbbr zzbbrVar) {
        this.f12025f = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final void C1(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.f12025f.b(parcelFileDescriptor);
    }
}
