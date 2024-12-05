package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class f implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e f11376f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(e eVar) {
        this.f11376f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzabl.H7(this.f11376f.f11329f) != null) {
            try {
                zzabl.H7(this.f11376f.f11329f).onAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbad.d("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
