package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzbvx extends zzbpc {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13578f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbup f13579g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbwz f13580h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbpv f13581i;

    /* renamed from: j, reason: collision with root package name */
    private final zzdan f13582j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13583k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvx(Context context, zzbry zzbryVar, zzbup zzbupVar, zzbwz zzbwzVar, zzbpv zzbpvVar, zzdan zzdanVar) {
        this.f13578f = context;
        this.f13487c = zzbryVar;
        this.f13579g = zzbupVar;
        this.f13580h = zzbwzVar;
        this.f13581i = zzbpvVar;
        this.f13582j = zzdanVar;
    }

    public final boolean g() {
        return this.f13581i.a();
    }

    public final void h(boolean z) {
        this.f13579g.y();
        this.f13580h.a(z, this.f13578f);
        this.f13583k = true;
    }

    public final zzbry i() {
        return this.f13487c;
    }

    public final boolean j() {
        if (((Boolean) zzyt.e().c(zzacu.L0)).booleanValue()) {
            zzk.zzlg();
            if (zzaxi.A(this.f13578f)) {
                zzbad.i("It is not recommended to show an interstitial when app is not in foreground.");
                if (((Boolean) zzyt.e().c(zzacu.M0)).booleanValue()) {
                    this.f13582j.a(this.a.f14570b.f14567b.f14559b);
                }
                return false;
            }
        }
        return !this.f13583k;
    }
}
