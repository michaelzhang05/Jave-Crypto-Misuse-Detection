package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzabx extends zzasx {

    /* renamed from: f, reason: collision with root package name */
    private zzatb f12605f;

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void P(zzatb zzatbVar) throws RemoteException {
        this.f12605f = zzatbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void T1(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void b5(zzasu zzasuVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void c0(zzzp zzzpVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void destroy() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void h4(zzath zzathVar) throws RemoteException {
        zzbad.g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazt.a.post(new j(this));
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void k6(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void l7(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void pause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void r5(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void resume() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setCustomData(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void show() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void u4(IObjectWrapper iObjectWrapper) throws RemoteException {
    }
}
