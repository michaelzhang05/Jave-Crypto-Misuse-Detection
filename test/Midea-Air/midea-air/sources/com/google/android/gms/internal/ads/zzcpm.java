package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzcpm extends zzzl {

    /* renamed from: f, reason: collision with root package name */
    private final Context f14325f;

    /* renamed from: g, reason: collision with root package name */
    private final zzyz f14326g;

    /* renamed from: h, reason: collision with root package name */
    private final zzcxv f14327h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbnf f14328i;

    /* renamed from: j, reason: collision with root package name */
    private final ViewGroup f14329j;

    public zzcpm(Context context, zzyz zzyzVar, zzcxv zzcxvVar, zzbnf zzbnfVar) {
        this.f14325f = context;
        this.f14326g = zzyzVar;
        this.f14327h = zzcxvVar;
        this.f14328i = zzbnfVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(zzbnfVar.i(), zzk.zzli().t());
        frameLayout.setMinimumHeight(Q5().f15812h);
        frameLayout.setMinimumWidth(Q5().f15815k);
        this.f14329j = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void A4(zzzy zzzyVar) throws RemoteException {
        zzbad.h("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void C4(zzyw zzywVar) throws RemoteException {
        zzbad.h("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzyz K5() throws RemoteException {
        return this.f14326g;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final String M() throws RemoteException {
        return this.f14328i.f();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void P(zzatb zzatbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzzs P4() throws RemoteException {
        return this.f14327h.n;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final boolean Q4(zzxz zzxzVar) throws RemoteException {
        zzbad.h("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzyd Q5() {
        return zzcxy.a(this.f14325f, Collections.singletonList(this.f14328i.j()));
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void S6() throws RemoteException {
        this.f14328i.l();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final boolean U() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void c0(zzzp zzzpVar) throws RemoteException {
        zzbad.h("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void destroy() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f14328i.a();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void f7(zzado zzadoVar) throws RemoteException {
        zzbad.h("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void g6(zzzs zzzsVar) throws RemoteException {
        zzbad.h("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final Bundle getAdMetadata() throws RemoteException {
        zzbad.h("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f14328i.b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzaar getVideoController() throws RemoteException {
        return this.f14328i.g();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void i1(boolean z) throws RemoteException {
        zzbad.h("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void k4() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void m4(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void n6(zzaqn zzaqnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final boolean p() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void p0(zzyz zzyzVar) throws RemoteException {
        zzbad.h("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void pause() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f14328i.d().f0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void q2(zzyd zzydVar) throws RemoteException {
        zzbnf zzbnfVar = this.f14328i;
        if (zzbnfVar != null) {
            zzbnfVar.h(this.f14329j, zzydVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void q6(zzaax zzaaxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void resume() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f14328i.d().g0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void showInterstitial() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final IObjectWrapper w0() throws RemoteException {
        return ObjectWrapper.i0(this.f14329j);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final String x6() throws RemoteException {
        return this.f14327h.f14575f;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void x7(zzacd zzacdVar) throws RemoteException {
        zzbad.h("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void z3(zzaqt zzaqtVar, String str) throws RemoteException {
    }
}
