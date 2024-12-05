package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

/* loaded from: classes2.dex */
public final class zzcqj extends zzasx {

    /* renamed from: f, reason: collision with root package name */
    private zzbbh<zzcdb> f14370f;

    /* renamed from: g, reason: collision with root package name */
    private zzcdb f14371g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbjm f14372h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f14373i;
    private zzbss m;

    /* renamed from: j, reason: collision with root package name */
    private final zzcqc f14374j = new zzcqc();

    /* renamed from: k, reason: collision with root package name */
    private final zzcpx f14375k = new zzcpx();
    private final zzcpy l = new zzcpy();
    private boolean n = false;
    private final zzcxx o = new zzcxx();
    private boolean p = false;

    public zzcqj(zzbjm zzbjmVar, Context context) {
        this.f14372h = zzbjmVar;
        this.f14373i = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbbh I7(zzcqj zzcqjVar, zzbbh zzbbhVar) {
        zzcqjVar.f14370f = null;
        return null;
    }

    private final synchronized boolean L7() {
        boolean z;
        zzcdb zzcdbVar = this.f14371g;
        if (zzcdbVar != null) {
            z = zzcdbVar.g() ? false : true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M7() {
        this.n = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N7() {
        this.f14375k.onAdMetadataChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void O7() {
        this.f14374j.onAdFailedToLoad(1);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void P(zzatb zzatbVar) throws RemoteException {
        Preconditions.f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f14374j.c(zzatbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void T1(IObjectWrapper iObjectWrapper) {
        Preconditions.f("destroy must be called on the main UI thread.");
        Context context = null;
        this.f14375k.a(null);
        this.n = false;
        if (this.f14371g != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.R(iObjectWrapper);
            }
            this.f14371g.h().i0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void b5(zzasu zzasuVar) {
        Preconditions.f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f14374j.b(zzasuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void c0(zzzp zzzpVar) {
        Preconditions.f("setAdMetadataListener can only be called from the UI thread.");
        this.f14375k.a(new in(this, zzzpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void destroy() throws RemoteException {
        T1(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final Bundle getAdMetadata() {
        zzbss zzbssVar;
        Preconditions.f("getAdMetadata can only be called from the UI thread.");
        if (this.n && (zzbssVar = this.m) != null) {
            return zzbssVar.Y();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        zzcdb zzcdbVar = this.f14371g;
        if (zzcdbVar == null) {
            return null;
        }
        return zzcdbVar.b();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void h4(zzath zzathVar) throws RemoteException {
        Preconditions.f("loadAd must be called on the main UI thread.");
        this.n = false;
        String str = zzathVar.f12975g;
        if (str == null) {
            zzbad.g("Ad unit ID should not be null for rewarded video ad.");
            this.f14372h.e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gn

                /* renamed from: f, reason: collision with root package name */
                private final zzcqj f11492f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11492f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11492f.O7();
                }
            });
            return;
        }
        if (zzacw.a(str)) {
            return;
        }
        if (this.f14370f != null) {
            return;
        }
        if (L7()) {
            if (!((Boolean) zzyt.e().c(zzacu.o4)).booleanValue()) {
                return;
            }
        }
        zzcya.b(this.f14373i, zzathVar.f12974f.f15796k);
        this.f14371g = null;
        zzcdf b2 = this.f14372h.m().a(new zzbqy.zza().e(this.f14373i).b(this.o.t(zzathVar.f12975g).n(zzyd.L()).w(zzathVar.f12974f).d()).i(null).c()).c(new zzbtv.zza().c(this.f14374j, this.f14372h.e()).g(new jn(this, this.f14374j), this.f14372h.e()).d(this.f14374j, this.f14372h.e()).b(this.f14375k, this.f14372h.e()).a(this.l, this.f14372h.e()).k()).b();
        this.m = b2.d();
        zzbbh<zzcdb> c2 = b2.c();
        this.f14370f = c2;
        zzbar.f(c2, new hn(this, b2), this.f14372h.e());
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean isLoaded() throws RemoteException {
        Preconditions.f("isLoaded must be called on the main UI thread.");
        return L7();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void k6(IObjectWrapper iObjectWrapper) {
        Preconditions.f("resume must be called on the main UI thread.");
        if (this.f14371g != null) {
            this.f14371g.h().g0(iObjectWrapper == null ? null : (Context) ObjectWrapper.R(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void l7(IObjectWrapper iObjectWrapper) {
        Preconditions.f("pause must be called on the main UI thread.");
        if (this.f14371g != null) {
            this.f14371g.h().f0(iObjectWrapper == null ? null : (Context) ObjectWrapper.R(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void pause() throws RemoteException {
        l7(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void r5(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void resume() throws RemoteException {
        k6(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzyt.e().c(zzacu.d1)).booleanValue()) {
            Preconditions.f("#008 Must be called on the main UI thread.: setCustomData");
            this.o.v(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.f("setImmersiveMode must be called on the main UI thread.");
        this.p = z;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.f("setUserId must be called on the main UI thread.");
        this.o.u(str);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void show() throws RemoteException {
        u4(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void u4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.f("showAd must be called on the main UI thread.");
        if (this.f14371g == null) {
            return;
        }
        if (iObjectWrapper != null) {
            Object R = ObjectWrapper.R(iObjectWrapper);
            if (R instanceof Activity) {
                activity = (Activity) R;
                this.f14371g.i(this.p, activity);
            }
        }
        activity = null;
        this.f14371g.i(this.p, activity);
    }
}
