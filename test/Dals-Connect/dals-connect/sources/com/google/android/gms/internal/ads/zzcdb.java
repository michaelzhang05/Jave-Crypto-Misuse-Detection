package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzcdb extends zzbpc {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13911f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbwz f13912g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbup f13913h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbrp f13914i;

    /* renamed from: j, reason: collision with root package name */
    private final zzbpv f13915j;

    /* renamed from: k, reason: collision with root package name */
    private final zzatq f13916k;
    private final zzdan l;
    private boolean m = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdb(Context context, zzbwz zzbwzVar, zzbup zzbupVar, zzbrp zzbrpVar, zzbry zzbryVar, zzbpv zzbpvVar, zzcxm zzcxmVar, zzdan zzdanVar) {
        this.f13911f = context;
        this.f13912g = zzbwzVar;
        this.f13913h = zzbupVar;
        this.f13914i = zzbrpVar;
        this.f13487c = zzbryVar;
        this.f13915j = zzbpvVar;
        this.l = zzdanVar;
        this.f13916k = new zzaup(zzcxmVar.l);
    }

    public final boolean g() {
        return this.f13915j.a();
    }

    public final zzbry h() {
        return this.f13487c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context] */
    public final void i(boolean z, Activity activity) {
        if (((Boolean) zzyt.e().c(zzacu.L0)).booleanValue()) {
            zzk.zzlg();
            if (zzaxi.A(this.f13911f)) {
                zzbad.i("Rewarded ad can not be shown when app is not in foreground.");
                this.f13914i.E(3);
                if (((Boolean) zzyt.e().c(zzacu.M0)).booleanValue()) {
                    this.l.a(this.a.f14570b.f14567b.f14559b);
                    return;
                }
                return;
            }
        }
        if (this.m) {
            zzbad.i("The rewarded ad have been showed.");
            this.f13914i.E(1);
            return;
        }
        this.m = true;
        this.f13913h.y();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f13911f;
        }
        this.f13912g.a(z, activity2);
    }

    public final zzatq j() {
        return this.f13916k;
    }
}
