package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzbwd implements zzdti<zzbuz<zzbsr>> {
    private final zzbvz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13591b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbai> f13592c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<zzcxm> f13593d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<zzcxv> f13594e;

    private zzbwd(zzbvz zzbvzVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzcxv> zzdtuVar4) {
        this.a = zzbvzVar;
        this.f13591b = zzdtuVar;
        this.f13592c = zzdtuVar2;
        this.f13593d = zzdtuVar3;
        this.f13594e = zzdtuVar4;
    }

    public static zzbwd a(zzbvz zzbvzVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzcxv> zzdtuVar4) {
        return new zzbwd(zzbvzVar, zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final Context context = this.f13591b.get();
        final zzbai zzbaiVar = this.f13592c.get();
        final zzcxm zzcxmVar = this.f13593d.get();
        final zzcxv zzcxvVar = this.f13594e.get();
        return (zzbuz) zzdto.b(new zzbuz(new zzbsr(context, zzbaiVar, zzcxmVar, zzcxvVar) { // from class: com.google.android.gms.internal.ads.kf

            /* renamed from: f, reason: collision with root package name */
            private final Context f11715f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbai f11716g;

            /* renamed from: h, reason: collision with root package name */
            private final zzcxm f11717h;

            /* renamed from: i, reason: collision with root package name */
            private final zzcxv f11718i;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11715f = context;
                this.f11716g = zzbaiVar;
                this.f11717h = zzcxmVar;
                this.f11718i = zzcxvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbsr
            public final void onAdLoaded() {
                zzk.zzlq().c(this.f11715f, this.f11716g.f13150f, this.f11717h.z.toString(), this.f11718i.f14575f);
            }
        }, zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
