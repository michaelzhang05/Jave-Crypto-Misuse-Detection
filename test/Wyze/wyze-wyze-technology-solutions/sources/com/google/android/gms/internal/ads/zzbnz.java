package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnz implements zzdti<zzbuz<zzbto>> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbtb> f13431b;

    public zzbnz(zzbnk zzbnkVar, zzdtu<zzbtb> zzdtuVar) {
        this.a = zzbnkVar;
        this.f13431b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final zzbtb zzbtbVar = this.f13431b.get();
        return (zzbuz) zzdto.b(new zzbuz(new zzbto(zzbtbVar) { // from class: com.google.android.gms.internal.ads.bd

            /* renamed from: f, reason: collision with root package name */
            private final zzbtb f11159f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11159f = zzbtbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbto
            public final void u() {
                this.f11159f.f0();
            }
        }, zzbbm.f13155b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
