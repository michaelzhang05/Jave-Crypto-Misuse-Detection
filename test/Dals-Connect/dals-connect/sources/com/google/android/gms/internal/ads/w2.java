package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class w2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e.e.a.a f12315f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzanu f12316g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w2(zzanu zzanuVar, e.e.a.a aVar) {
        this.f12316g = zzanuVar;
        this.f12315f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzamv zzamvVar;
        try {
            zzamvVar = this.f12316g.a;
            zzamvVar.onAdFailedToLoad(zzaog.a(this.f12315f));
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }
}
