package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcwc implements zzcva<zzcwb> {
    zzvx a;

    /* renamed from: b, reason: collision with root package name */
    private zzbbl f14523b;

    /* renamed from: c, reason: collision with root package name */
    Context f14524c;

    public zzcwc(zzvx zzvxVar, zzbbl zzbblVar, Context context) {
        this.a = zzvxVar;
        this.f14523b = zzbblVar;
        this.f14524c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcwb> b() {
        return this.f14523b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.lp

            /* renamed from: f, reason: collision with root package name */
            private final zzcwc f11777f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11777f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcwc zzcwcVar = this.f11777f;
                return new zzcwb(zzcwcVar.a.a(zzcwcVar.f14524c));
            }
        });
    }
}
