package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzbvh implements zzbvg {
    private final List<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdae f13574b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13575c;

    public zzbvh(zzcxm zzcxmVar, zzdae zzdaeVar) {
        this.a = zzcxmVar.n;
        this.f13574b = zzdaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void a() {
        if (this.f13575c) {
            return;
        }
        this.f13574b.h(this.a);
        this.f13575c = true;
    }
}
