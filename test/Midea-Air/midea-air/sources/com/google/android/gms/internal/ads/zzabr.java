package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzabr extends zzaac {

    /* renamed from: f, reason: collision with root package name */
    private zzait f12604f;

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void D2(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final String F3() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final boolean H3() throws RemoteException {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void H7() {
        zzait zzaitVar = this.f12604f;
        if (zzaitVar != null) {
            try {
                zzaitVar.B4(Collections.EMPTY_LIST);
            } catch (RemoteException e2) {
                zzbad.d("Could not notify onComplete event.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final float I4() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void I5(float f2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final List<zzaio> K2() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void M6(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void P1(zzait zzaitVar) throws RemoteException {
        this.f12604f = zzaitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void S1(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void f0() throws RemoteException {
        zzbad.g("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzazt.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.h

            /* renamed from: f, reason: collision with root package name */
            private final zzabr f11497f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11497f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11497f.H7();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void p2(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void p5(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void s0(zzamp zzampVar) throws RemoteException {
    }
}
