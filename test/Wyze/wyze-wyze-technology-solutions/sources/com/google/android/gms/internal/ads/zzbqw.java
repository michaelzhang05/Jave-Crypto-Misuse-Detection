package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbqw implements zzdti<zzbam<zzcxm, zzayb>> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbai> f13527b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcxv> f13528c;

    public zzbqw(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13527b = zzdtuVar2;
        this.f13528c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final Context context = this.a.get();
        final zzbai zzbaiVar = this.f13527b.get();
        final zzcxv zzcxvVar = this.f13528c.get();
        return (zzbam) zzdto.b(new zzbam(context, zzbaiVar, zzcxvVar) { // from class: com.google.android.gms.internal.ads.nd
            private final Context a;

            /* renamed from: b, reason: collision with root package name */
            private final zzbai f11877b;

            /* renamed from: c, reason: collision with root package name */
            private final zzcxv f11878c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = context;
                this.f11877b = zzbaiVar;
                this.f11878c = zzcxvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj) {
                Context context2 = this.a;
                zzbai zzbaiVar2 = this.f11877b;
                zzcxv zzcxvVar2 = this.f11878c;
                zzcxm zzcxmVar = (zzcxm) obj;
                zzayb zzaybVar = new zzayb(context2);
                zzaybVar.h(zzcxmVar.y);
                zzaybVar.i(zzcxmVar.z.toString());
                zzaybVar.j(zzbaiVar2.f13150f);
                zzaybVar.a(zzcxvVar2.f14575f);
                return zzaybVar;
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
