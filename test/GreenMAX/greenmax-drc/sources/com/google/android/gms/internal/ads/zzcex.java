package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcex implements zzczz {

    /* renamed from: f, reason: collision with root package name */
    private Map<zzczs, zzcez> f13977f;

    /* renamed from: g, reason: collision with root package name */
    private zzwj f13978g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcex(zzwj zzwjVar, Map<zzczs, zzcez> map) {
        this.f13977f = map;
        this.f13978g = zzwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void b(zzczs zzczsVar, String str, Throwable th) {
        if (this.f13977f.containsKey(zzczsVar)) {
            this.f13978g.b(this.f13977f.get(zzczsVar).f13980c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void c(zzczs zzczsVar, String str) {
        if (this.f13977f.containsKey(zzczsVar)) {
            this.f13978g.b(this.f13977f.get(zzczsVar).f13979b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void d(zzczs zzczsVar, String str) {
        if (this.f13977f.containsKey(zzczsVar)) {
            this.f13978g.b(this.f13977f.get(zzczsVar).a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void e(zzczs zzczsVar, String str) {
    }
}
