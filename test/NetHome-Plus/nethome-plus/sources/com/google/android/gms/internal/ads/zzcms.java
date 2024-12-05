package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzcms extends zzcmn<zzcdb> {
    private final zzbjm a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbqy.zza f14233b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbtv f14234c;

    public zzcms(zzbjm zzbjmVar, zzbqy.zza zzaVar, zzbtv zzbtvVar) {
        this.a = zzbjmVar;
        this.f14233b = zzaVar;
        this.f14234c = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    protected final zzbbh<zzcdb> c(zzcxv zzcxvVar, Bundle bundle) {
        return this.a.m().a(this.f14233b.b(zzcxvVar).h(bundle).c()).c(this.f14234c).b().c();
    }
}
