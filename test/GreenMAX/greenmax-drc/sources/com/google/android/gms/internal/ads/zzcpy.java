package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;

/* loaded from: classes2.dex */
public final class zzcpy implements AppEventListener {

    /* renamed from: f, reason: collision with root package name */
    private zzzs f14352f;

    public final synchronized zzzs a() {
        return this.f14352f;
    }

    public final synchronized void b(zzzs zzzsVar) {
        this.f14352f = zzzsVar;
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        zzzs zzzsVar = this.f14352f;
        if (zzzsVar != null) {
            try {
                zzzsVar.onAppEvent(str, str2);
            } catch (RemoteException e2) {
                zzbad.d("Remote Exception at onAppEvent.", e2);
            }
        }
    }
}
