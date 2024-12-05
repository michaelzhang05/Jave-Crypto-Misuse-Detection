package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzk;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcfz implements AppEventListener, zzbrl, zzbro, zzbrw, zzbrx, zzbsr, zzbtk, zzczz, zzxr {

    /* renamed from: f, reason: collision with root package name */
    private final List<Object> f14015f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcfn f14016g;

    /* renamed from: h, reason: collision with root package name */
    private long f14017h;

    public zzcfz(zzcfn zzcfnVar, zzbjm zzbjmVar) {
        this.f14016g = zzcfnVar;
        this.f14015f = Collections.singletonList(zzbjmVar);
    }

    private final void f(Class cls, String str, Object... objArr) {
        zzcfn zzcfnVar = this.f14016g;
        List<Object> list = this.f14015f;
        String simpleName = cls.getSimpleName();
        zzcfnVar.a(list, simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void P(zzarx zzarxVar) {
        this.f14017h = zzk.zzln().b();
        f(zzbtk.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void a(zzasr zzasrVar, String str, String str2) {
        f(zzbrl.class, "onRewarded", zzasrVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void b(zzczs zzczsVar, String str, Throwable th) {
        f(zzczr.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void c(zzczs zzczsVar, String str) {
        f(zzczr.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void d(zzczs zzczsVar, String str) {
        f(zzczr.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void e(zzczs zzczsVar, String str) {
        f(zzczr.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final void j(Context context) {
        f(zzbrx.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final void k(Context context) {
        f(zzbrx.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void onAdClicked() {
        f(zzxr.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
        f(zzbrl.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) {
        f(zzbro.class, "onAdFailedToLoad", Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void onAdImpression() {
        f(zzbrw.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
        f(zzbrl.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        long b2 = zzk.zzln().b() - this.f14017h;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(b2);
        zzawz.m(sb.toString());
        f(zzbsr.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() {
        f(zzbrl.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final void onAppEvent(String str, String str2) {
        f(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
        f(zzbrl.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
        f(zzbrl.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void q(zzcxu zzcxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final void r(Context context) {
        f(zzbrx.class, "onPause", context);
    }
}
