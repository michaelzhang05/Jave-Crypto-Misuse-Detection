package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcpv implements zzxr {

    /* renamed from: f, reason: collision with root package name */
    private zzyw f14350f;

    public final synchronized void a(zzyw zzywVar) {
        this.f14350f = zzywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final synchronized void onAdClicked() {
        zzyw zzywVar = this.f14350f;
        if (zzywVar != null) {
            try {
                zzywVar.onAdClicked();
            } catch (RemoteException e2) {
                zzbad.d("Remote Exception at onAdClicked.", e2);
            }
        }
    }
}
