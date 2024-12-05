package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcbi {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcxv f13838b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f13839c;

    /* renamed from: d, reason: collision with root package name */
    private final zzcdn f13840d;

    public zzcbi(Context context, zzcxv zzcxvVar, Executor executor, zzcdn zzcdnVar) {
        this.a = context;
        this.f13838b = zzcxvVar;
        this.f13839c = executor;
        this.f13840d = zzcdnVar;
    }

    private final void e(zzbgz zzbgzVar) {
        zzbgzVar.f("/video", zzagz.l);
        zzbgzVar.f("/videoMeta", zzagz.m);
        zzbgzVar.f("/precache", new zzbgc());
        zzbgzVar.f("/delayPageLoaded", zzagz.p);
        zzbgzVar.f("/instrument", zzagz.n);
        zzbgzVar.f("/log", zzagz.f12717g);
        zzbgzVar.f("/videoClicked", zzagz.f12718h);
        zzbgzVar.p().b(true);
        if (this.f13838b.f14572c != null) {
            zzbgzVar.f("/open", new zzahs(null, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh a(String str, String str2, Object obj) throws Exception {
        final zzbgz b2 = this.f13840d.b(zzyd.J(this.a));
        final zzbbq g2 = zzbbq.g(b2);
        e(b2);
        if (this.f13838b.f14572c != null) {
            b2.A(zzbin.d());
        } else {
            b2.A(zzbin.c());
        }
        b2.p().i(new zzbij(this, b2, g2) { // from class: com.google.android.gms.internal.ads.bh
            private final zzcbi a;

            /* renamed from: b, reason: collision with root package name */
            private final zzbgz f11162b;

            /* renamed from: c, reason: collision with root package name */
            private final zzbbq f11163c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11162b = b2;
                this.f11163c = g2;
            }

            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzae(boolean z) {
                this.a.c(this.f11162b, this.f11163c, z);
            }
        });
        b2.G(str, str2, null);
        return g2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh b(JSONObject jSONObject, final zzbgz zzbgzVar) throws Exception {
        final zzbbq g2 = zzbbq.g(zzbgzVar);
        if (this.f13838b.f14572c != null) {
            zzbgzVar.A(zzbin.d());
        } else {
            zzbgzVar.A(zzbin.c());
        }
        zzbgzVar.p().i(new zzbij(this, zzbgzVar, g2) { // from class: com.google.android.gms.internal.ads.ch
            private final zzcbi a;

            /* renamed from: b, reason: collision with root package name */
            private final zzbgz f11249b;

            /* renamed from: c, reason: collision with root package name */
            private final zzbbq f11250c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11249b = zzbgzVar;
                this.f11250c = g2;
            }

            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzae(boolean z) {
                this.a.d(this.f11249b, this.f11250c, z);
            }
        });
        zzbgzVar.Y("google.afma.nativeAds.renderVideo", jSONObject);
        return g2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(zzbgz zzbgzVar, zzbbq zzbbqVar, boolean z) {
        if (this.f13838b.f14571b != null && zzbgzVar.h() != null) {
            zzbgzVar.h().M7(this.f13838b.f14571b);
        }
        zzbbqVar.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzbgz zzbgzVar, zzbbq zzbbqVar, boolean z) {
        if (this.f13838b.f14571b != null && zzbgzVar.h() != null) {
            zzbgzVar.h().M7(this.f13838b.f14571b);
        }
        zzbbqVar.h();
    }

    public final zzbbh<zzbgz> f(final JSONObject jSONObject) {
        return zzbar.c(zzbar.c(zzbar.o(null), new zzbal(this) { // from class: com.google.android.gms.internal.ads.zg
            private final zzcbi a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.h(obj);
            }
        }, this.f13839c), new zzbal(this, jSONObject) { // from class: com.google.android.gms.internal.ads.xg
            private final zzcbi a;

            /* renamed from: b, reason: collision with root package name */
            private final JSONObject f12393b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f12393b = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.b(this.f12393b, (zzbgz) obj);
            }
        }, this.f13839c);
    }

    public final zzbbh<zzbgz> g(final String str, final String str2) {
        return zzbar.c(zzbar.o(null), new zzbal(this, str, str2) { // from class: com.google.android.gms.internal.ads.yg
            private final zzcbi a;

            /* renamed from: b, reason: collision with root package name */
            private final String f12465b;

            /* renamed from: c, reason: collision with root package name */
            private final String f12466c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f12465b = str;
                this.f12466c = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.a(this.f12465b, this.f12466c, obj);
            }
        }, this.f13839c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh h(Object obj) throws Exception {
        zzbgz b2 = this.f13840d.b(zzyd.J(this.a));
        final zzbbq g2 = zzbbq.g(b2);
        e(b2);
        b2.p().j(new zzbik(g2) { // from class: com.google.android.gms.internal.ads.ah
            private final zzbbq a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = g2;
            }

            @Override // com.google.android.gms.internal.ads.zzbik
            public final void a() {
                this.a.h();
            }
        });
        b2.loadUrl((String) zzyt.e().c(zzacu.K2));
        return g2;
    }
}
