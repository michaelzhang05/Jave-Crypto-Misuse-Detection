package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzbns implements zzdti<zzbuz<zzbsr>> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13419b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbai> f13420c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcxm> f13421d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcxv> f13422e;

    public zzbns(zzbnk zzbnkVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzcxv> zzdtuVar4) {
        this.a = zzbnkVar;
        this.f13419b = zzdtuVar;
        this.f13420c = zzdtuVar2;
        this.f13421d = zzdtuVar3;
        this.f13422e = zzdtuVar4;
    }

    public static zzbuz<zzbsr> a(zzbnk zzbnkVar, final Context context, final zzbai zzbaiVar, final zzcxm zzcxmVar, final zzcxv zzcxvVar) {
        return (zzbuz) zzdto.b(new zzbuz(new zzbsr(context, zzbaiVar, zzcxmVar, zzcxvVar) { // from class: com.google.android.gms.internal.ads.ad

            /* renamed from: f, reason: collision with root package name */
            private final Context f11083f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbai f11084g;

            /* renamed from: h, reason: collision with root package name */
            private final zzcxm f11085h;

            /* renamed from: i, reason: collision with root package name */
            private final zzcxv f11086i;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11083f = context;
                this.f11084g = zzbaiVar;
                this.f11085h = zzcxmVar;
                this.f11086i = zzcxvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbsr
            public final void onAdLoaded() {
                zzk.zzlq().c(this.f11083f, this.f11084g.f13150f, this.f11085h.z.toString(), this.f11086i.f14575f);
            }
        }, zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return a(this.a, this.f13419b.get(), this.f13420c.get(), this.f13421d.get(), this.f13422e.get());
    }
}
