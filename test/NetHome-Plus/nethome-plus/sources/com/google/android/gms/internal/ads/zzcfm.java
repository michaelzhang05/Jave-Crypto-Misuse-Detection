package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcfm implements zzdti<zzcfk> {
    private final zzdtu<zzcfi> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Set<ii>> f13995b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Clock> f13996c;

    private zzcfm(zzdtu<zzcfi> zzdtuVar, zzdtu<Set<ii>> zzdtuVar2, zzdtu<Clock> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13995b = zzdtuVar2;
        this.f13996c = zzdtuVar3;
    }

    public static zzcfm a(zzdtu<zzcfi> zzdtuVar, zzdtu<Set<ii>> zzdtuVar2, zzdtu<Clock> zzdtuVar3) {
        return new zzcfm(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcfk(this.a.get(), this.f13995b.get(), this.f13996c.get());
    }
}
