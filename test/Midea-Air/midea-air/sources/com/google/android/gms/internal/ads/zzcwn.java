package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcwn implements zzcva<zzcwm> {
    zzaci a;

    /* renamed from: b, reason: collision with root package name */
    private zzbbl f14532b;

    /* renamed from: c, reason: collision with root package name */
    List<String> f14533c;

    public zzcwn(zzaci zzaciVar, zzbbl zzbblVar, List<String> list) {
        this.a = zzaciVar;
        this.f14532b = zzbblVar;
        this.f14533c = list;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcwm> b() {
        return this.f14532b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.pp

            /* renamed from: f, reason: collision with root package name */
            private final zzcwn f12007f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12007f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcwn zzcwnVar = this.f12007f;
                return new zzcwm(zzcwnVar.a.a(zzcwnVar.f14533c));
            }
        });
    }
}
