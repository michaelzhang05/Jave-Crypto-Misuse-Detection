package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzcmq extends zzcmn<zzbvx> {
    private final zzbjm a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbqy.zza f14227b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcow f14228c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbtv f14229d;

    public zzcmq(zzbjm zzbjmVar, zzbqy.zza zzaVar, zzcow zzcowVar, zzbtv zzbtvVar) {
        this.a = zzbjmVar;
        this.f14227b = zzaVar;
        this.f14228c = zzcowVar;
        this.f14229d = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    protected final zzbbh<zzbvx> c(zzcxv zzcxvVar, Bundle bundle) {
        return this.a.k().c(this.f14227b.b(zzcxvVar).h(bundle).c()).d(this.f14229d).b(this.f14228c).a().c();
    }
}
