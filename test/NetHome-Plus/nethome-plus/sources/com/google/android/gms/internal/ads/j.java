package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzabx f11619f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(zzabx zzabxVar) {
        this.f11619f = zzabxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatb zzatbVar;
        zzatb zzatbVar2;
        zzatbVar = this.f11619f.f12605f;
        if (zzatbVar != null) {
            try {
                zzatbVar2 = this.f11619f.f12605f;
                zzatbVar2.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbad.d("Could not notify onRewardedVideoAdFailedToLoad event.", e2);
            }
        }
    }
}
