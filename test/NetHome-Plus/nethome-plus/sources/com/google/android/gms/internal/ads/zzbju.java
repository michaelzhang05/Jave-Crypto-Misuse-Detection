package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbju implements zzdti<zzblp> {
    private final zzbjn a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbjm> f13319b;

    public zzbju(zzbjn zzbjnVar, zzdtu<zzbjm> zzdtuVar) {
        this.a = zzbjnVar;
        this.f13319b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzblp) zzdto.b(this.f13319b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
