package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcqd extends zzzl {

    /* renamed from: f, reason: collision with root package name */
    private final zzbjm f14358f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f14359g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f14360h;

    /* renamed from: i, reason: collision with root package name */
    private final zzcpw f14361i = new zzcpw();

    /* renamed from: j, reason: collision with root package name */
    private final zzcpy f14362j = new zzcpy();

    /* renamed from: k, reason: collision with root package name */
    private final zzcqc f14363k = new zzcqc();
    private final zzcxx l;
    private zzado m;
    private zzbvx n;
    private zzbbh<zzbvx> o;
    private boolean p;

    public zzcqd(zzbjm zzbjmVar, Context context, zzyd zzydVar, String str) {
        zzcxx zzcxxVar = new zzcxx();
        this.l = zzcxxVar;
        this.p = false;
        this.f14358f = zzbjmVar;
        zzcxxVar.n(zzydVar).t(str);
        this.f14360h = zzbjmVar.e();
        this.f14359g = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbbh I7(zzcqd zzcqdVar, zzbbh zzbbhVar) {
        zzcqdVar.o = null;
        return null;
    }

    private final synchronized boolean K7() {
        boolean z;
        zzbvx zzbvxVar = this.n;
        if (zzbvxVar != null) {
            z = zzbvxVar.g() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void A4(zzzy zzzyVar) {
        Preconditions.f("setCorrelationIdProvider must be called on the main UI thread");
        this.l.o(zzzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void C4(zzyw zzywVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzyz K5() {
        return this.f14361i.b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized String M() {
        zzbvx zzbvxVar = this.n;
        if (zzbvxVar == null) {
            return null;
        }
        return zzbvxVar.f();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void P(zzatb zzatbVar) {
        this.f14363k.c(zzatbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzzs P4() {
        return this.f14362j.a();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized boolean Q4(zzxz zzxzVar) {
        Preconditions.f("loadAd must be called on the main UI thread.");
        if (this.o == null && !K7()) {
            zzcya.b(this.f14359g, zzxzVar.f15796k);
            this.n = null;
            zzcxv d2 = this.l.w(zzxzVar).d();
            zzbtv.zza zzaVar = new zzbtv.zza();
            zzcqc zzcqcVar = this.f14363k;
            if (zzcqcVar != null) {
                zzaVar.c(zzcqcVar, this.f14358f.e()).g(this.f14363k, this.f14358f.e()).d(this.f14363k, this.f14358f.e());
            }
            zzbws a = this.f14358f.k().c(new zzbqy.zza().e(this.f14359g).b(d2).c()).d(zzaVar.c(this.f14361i, this.f14358f.e()).g(this.f14361i, this.f14358f.e()).d(this.f14361i, this.f14358f.e()).h(this.f14361i, this.f14358f.e()).a(this.f14362j, this.f14358f.e()).k()).b(new zzcow(this.m)).a();
            zzbbh<zzbvx> c2 = a.c();
            this.o = c2;
            zzbar.f(c2, new cn(this, a), this.f14360h);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzyd Q5() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void S6() {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized boolean U() {
        boolean z;
        zzbbh<zzbvx> zzbbhVar = this.o;
        if (zzbbhVar != null) {
            z = zzbbhVar.isDone() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void c0(zzzp zzzpVar) {
        Preconditions.f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void destroy() {
        Preconditions.f("destroy must be called on the main UI thread.");
        zzbvx zzbvxVar = this.n;
        if (zzbvxVar != null) {
            zzbvxVar.i().i0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void f7(zzado zzadoVar) {
        Preconditions.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.m = zzadoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void g6(zzzs zzzsVar) {
        Preconditions.f("setAppEventListener must be called on the main UI thread.");
        this.f14362j.b(zzzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final Bundle getAdMetadata() {
        Preconditions.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized String getMediationAdapterClassName() {
        zzbvx zzbvxVar = this.n;
        if (zzbvxVar == null) {
            return null;
        }
        return zzbvxVar.b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzaar getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void i1(boolean z) {
        Preconditions.f("setManualImpressionsEnabled must be called from the main thread.");
        this.l.j(z);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void k4() {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void m4(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void n6(zzaqn zzaqnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized boolean p() {
        Preconditions.f("isLoaded must be called on the main UI thread.");
        return K7();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void p0(zzyz zzyzVar) {
        Preconditions.f("setAdListener must be called on the main UI thread.");
        this.f14361i.c(zzyzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void pause() {
        Preconditions.f("pause must be called on the main UI thread.");
        zzbvx zzbvxVar = this.n;
        if (zzbvxVar != null) {
            zzbvxVar.i().f0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void q2(zzyd zzydVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void q6(zzaax zzaaxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void resume() {
        Preconditions.f("resume must be called on the main UI thread.");
        zzbvx zzbvxVar = this.n;
        if (zzbvxVar != null) {
            zzbvxVar.i().g0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.f("setImmersiveMode must be called on the main UI thread.");
        this.p = z;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void showInterstitial() {
        Preconditions.f("showInterstitial must be called on the main UI thread.");
        zzbvx zzbvxVar = this.n;
        if (zzbvxVar == null) {
            return;
        }
        if (zzbvxVar.j()) {
            this.n.h(this.p);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final IObjectWrapper w0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized String x6() {
        return this.l.c();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void x7(zzacd zzacdVar) {
        this.l.k(zzacdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void z3(zzaqt zzaqtVar, String str) {
    }
}
