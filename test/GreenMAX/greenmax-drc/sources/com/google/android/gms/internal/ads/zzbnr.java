package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnr implements zzdti<zzbnf> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<yc> f13418b;

    public zzbnr(zzbnk zzbnkVar, zzdtu<yc> zzdtuVar) {
        this.a = zzbnkVar;
        this.f13418b = zzdtuVar;
    }

    public static zzbnf a(zzbnk zzbnkVar, Object obj) {
        return (zzbnf) zzdto.b((yc) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return a(this.a, this.f13418b.get());
    }
}
