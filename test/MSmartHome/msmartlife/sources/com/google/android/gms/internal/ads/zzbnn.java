package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbnn implements zzdti<zzbso> {
    private final zzbnk a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Set<zzbuz<zzbsr>>> f13417b;

    public zzbnn(zzbnk zzbnkVar, zzdtu<Set<zzbuz<zzbsr>>> zzdtuVar) {
        this.a = zzbnkVar;
        this.f13417b = zzdtuVar;
    }

    public static zzbso a(zzbnk zzbnkVar, Set<zzbuz<zzbsr>> set) {
        return (zzbso) zzdto.b(zzbnkVar.a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return a(this.a, this.f13417b.get());
    }
}
