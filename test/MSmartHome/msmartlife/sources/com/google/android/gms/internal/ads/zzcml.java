package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzcml extends zzcmn<zzbph> {
    private final zzbjm a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbxk f14209b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbqy.zza f14210c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbtv f14211d;

    public zzcml(zzbjm zzbjmVar, zzbxk zzbxkVar, zzbqy.zza zzaVar, zzbtv zzbtvVar) {
        this.a = zzbjmVar;
        this.f14209b = zzbxkVar;
        this.f14210c = zzaVar;
        this.f14211d = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    protected final zzbbh<zzbph> c(zzcxv zzcxvVar, Bundle bundle) {
        return this.a.l().c(this.f14210c.b(zzcxvVar).h(bundle).c()).a(this.f14211d).d(this.f14209b).b().d();
    }
}
