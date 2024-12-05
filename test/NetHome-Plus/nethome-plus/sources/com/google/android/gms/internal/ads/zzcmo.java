package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzcmo extends zzcmn<zzbnf> {
    private final zzbjm a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbqy.zza f14215b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcow f14216c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbtv f14217d;

    /* renamed from: e, reason: collision with root package name */
    private final zzbxk f14218e;

    /* renamed from: f, reason: collision with root package name */
    private final zzbtb f14219f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f14220g;

    public zzcmo(zzbjm zzbjmVar, zzbqy.zza zzaVar, zzcow zzcowVar, zzbtv zzbtvVar, zzbxk zzbxkVar, zzbtb zzbtbVar, ViewGroup viewGroup) {
        this.a = zzbjmVar;
        this.f14215b = zzaVar;
        this.f14216c = zzcowVar;
        this.f14217d = zzbtvVar;
        this.f14218e = zzbxkVar;
        this.f14219f = zzbtbVar;
        this.f14220g = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    protected final zzbbh<zzbnf> c(zzcxv zzcxvVar, Bundle bundle) {
        return this.a.j().f(this.f14215b.b(zzcxvVar).h(bundle).c()).a(this.f14217d).e(this.f14216c).g(this.f14218e).c(new zzbox(this.f14219f)).d(new zzbnc(this.f14220g)).b().d();
    }
}
