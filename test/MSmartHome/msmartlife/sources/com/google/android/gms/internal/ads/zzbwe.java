package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbwe implements zzdti<Set<zzbuz<zzbrl>>> {
    private final zzbvz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbxc> f13595b;

    private zzbwe(zzbvz zzbvzVar, zzdtu<zzbxc> zzdtuVar) {
        this.a = zzbvzVar;
        this.f13595b = zzdtuVar;
    }

    public static zzbwe a(zzbvz zzbvzVar, zzdtu<zzbxc> zzdtuVar) {
        return new zzbwe(zzbvzVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.b(this.a.a(this.f13595b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
