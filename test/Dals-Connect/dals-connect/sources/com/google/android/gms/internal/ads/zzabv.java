package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzabv extends zzatu {
    @Override // com.google.android.gms.internal.ads.zzatt
    public final void A2(zzaue zzaueVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void E7(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void L1(zzxz zzxzVar, final zzaub zzaubVar) throws RemoteException {
        zzbad.g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazt.a.post(new Runnable(zzaubVar) { // from class: com.google.android.gms.internal.ads.i

            /* renamed from: f, reason: collision with root package name */
            private final zzaub f11557f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11557f = zzaubVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzaub zzaubVar2 = this.f11557f;
                if (zzaubVar2 != null) {
                    try {
                        zzaubVar2.Z4(1);
                    } catch (RemoteException e2) {
                        zzbad.f("#007 Could not call remote method.", e2);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void V5(zzaao zzaaoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void c6(zzatw zzatwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void d2(zzaum zzaumVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final String getMediationAdapterClassName() throws RemoteException {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final zzatq n7() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void q5(IObjectWrapper iObjectWrapper) throws RemoteException {
    }
}
