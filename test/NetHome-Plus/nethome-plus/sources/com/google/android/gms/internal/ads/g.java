package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class g implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzabp f11446f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(zzabp zzabpVar) {
        this.f11446f = zzabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzyz zzyzVar;
        zzyz zzyzVar2;
        zzyzVar = this.f11446f.f12603f;
        if (zzyzVar != null) {
            try {
                zzyzVar2 = this.f11446f.f12603f;
                zzyzVar2.onAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbad.d("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
