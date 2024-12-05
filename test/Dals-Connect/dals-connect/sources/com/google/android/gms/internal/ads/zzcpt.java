package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import java.util.Collections;

@zzard
/* loaded from: classes2.dex */
public final class zzcpt extends zzzl implements zzbtf {

    /* renamed from: f, reason: collision with root package name */
    private final zzbjm f14344f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f14345g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f14346h;

    /* renamed from: i, reason: collision with root package name */
    private final zzcpw f14347i = new zzcpw();

    /* renamed from: j, reason: collision with root package name */
    private final zzcpv f14348j = new zzcpv();

    /* renamed from: k, reason: collision with root package name */
    private final zzcpy f14349k = new zzcpy();
    private final zzbtb l;
    private final zzcxx m;
    private zzado n;
    private zzbnf o;
    private zzbbh<zzbnf> p;

    public zzcpt(zzbjm zzbjmVar, Context context, zzyd zzydVar, String str) {
        zzcxx zzcxxVar = new zzcxx();
        this.m = zzcxxVar;
        this.f14346h = new FrameLayout(context);
        this.f14344f = zzbjmVar;
        this.f14345g = context;
        zzcxxVar.n(zzydVar).t(str);
        zzbtb g2 = zzbjmVar.g();
        this.l = g2;
        g2.V(this, zzbjmVar.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbbh I7(zzcpt zzcptVar, zzbbh zzbbhVar) {
        zzcptVar.p = null;
        return null;
    }

    private final synchronized zzboc M7(zzcxv zzcxvVar) {
        return this.f14344f.j().f(new zzbqy.zza().e(this.f14345g).b(zzcxvVar).c()).a(new zzbtv.zza().h(this.f14347i, this.f14344f.e()).h(this.f14348j, this.f14344f.e()).c(this.f14347i, this.f14344f.e()).g(this.f14347i, this.f14344f.e()).d(this.f14347i, this.f14344f.e()).a(this.f14349k, this.f14344f.e()).k()).e(new zzcow(this.n)).g(new zzbxk(zzbzc.a, null)).c(new zzbox(this.l)).d(new zzbnc(this.f14346h)).b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void A4(zzzy zzzyVar) {
        Preconditions.f("setCorrelationIdProvider must be called on the main UI thread");
        this.m.o(zzzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void C() {
        boolean q;
        Object parent = this.f14346h.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            q = zzk.zzlg().q(view, view.getContext());
        } else {
            q = false;
        }
        if (q) {
            Q4(this.m.b());
        } else {
            this.l.i0(60);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void C4(zzyw zzywVar) {
        Preconditions.f("setAdListener must be called on the main UI thread.");
        this.f14348j.a(zzywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzyz K5() {
        return this.f14347i.b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized String M() {
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar == null) {
            return null;
        }
        return zzbnfVar.f();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void P(zzatb zzatbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzzs P4() {
        return this.f14349k.a();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized boolean Q4(zzxz zzxzVar) {
        Preconditions.f("loadAd must be called on the main UI thread.");
        if (this.p != null) {
            return false;
        }
        zzcya.b(this.f14345g, zzxzVar.f15796k);
        zzboc M7 = M7(this.m.w(zzxzVar).d());
        zzbbh<zzbnf> d2 = M7.d();
        this.p = d2;
        zzbar.f(d2, new an(this, M7), this.f14344f.e());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized zzyd Q5() {
        Preconditions.f("getAdSize must be called on the main UI thread.");
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar != null) {
            return zzcxy.a(this.f14345g, Collections.singletonList(zzbnfVar.j()));
        }
        return this.m.G();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void S6() {
        Preconditions.f("recordManualImpression must be called on the main UI thread.");
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar != null) {
            zzbnfVar.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized boolean U() {
        boolean z;
        zzbbh<zzbnf> zzbbhVar = this.p;
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
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar != null) {
            zzbnfVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void f7(zzado zzadoVar) {
        Preconditions.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.n = zzadoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void g6(zzzs zzzsVar) {
        Preconditions.f("setAppEventListener must be called on the main UI thread.");
        this.f14349k.b(zzzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final Bundle getAdMetadata() {
        Preconditions.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized String getMediationAdapterClassName() {
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar == null) {
            return null;
        }
        return zzbnfVar.b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized zzaar getVideoController() {
        Preconditions.f("getVideoController must be called from the main thread.");
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar == null) {
            return null;
        }
        return zzbnfVar.g();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void i1(boolean z) {
        Preconditions.f("setManualImpressionsEnabled must be called from the main thread.");
        this.m.j(z);
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
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void p0(zzyz zzyzVar) {
        Preconditions.f("setAdListener must be called on the main UI thread.");
        this.f14347i.c(zzyzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void pause() {
        Preconditions.f("pause must be called on the main UI thread.");
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar != null) {
            zzbnfVar.d().f0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void q2(zzyd zzydVar) {
        Preconditions.f("setAdSize must be called on the main UI thread.");
        this.m.n(zzydVar);
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar != null) {
            zzbnfVar.h(this.f14346h, zzydVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void q6(zzaax zzaaxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void resume() {
        Preconditions.f("resume must be called on the main UI thread.");
        zzbnf zzbnfVar = this.o;
        if (zzbnfVar != null) {
            zzbnfVar.d().g0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final IObjectWrapper w0() {
        Preconditions.f("destroy must be called on the main UI thread.");
        return ObjectWrapper.i0(this.f14346h);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized String x6() {
        return this.m.c();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void x7(zzacd zzacdVar) {
        Preconditions.f("setVideoOptions must be called on the main UI thread.");
        this.m.k(zzacdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void z3(zzaqt zzaqtVar, String str) {
    }
}
