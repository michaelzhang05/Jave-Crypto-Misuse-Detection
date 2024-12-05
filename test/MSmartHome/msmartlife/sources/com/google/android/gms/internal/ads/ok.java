package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class ok extends zzaok {

    /* renamed from: f, reason: collision with root package name */
    private zzcjy<zzaov, zzcla> f11940f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzckm f11941g;

    private ok(zzckm zzckmVar, zzcjy zzcjyVar) {
        this.f11941g = zzckmVar;
        this.f11940f = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    public final void I0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzckm.c(this.f11941g, (View) ObjectWrapper.R(iObjectWrapper));
        this.f11940f.f14137c.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    public final void j(String str) throws RemoteException {
        this.f11940f.f14137c.onAdFailedToLoad(0);
    }
}
