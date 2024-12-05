package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzctl implements zzcva<zzctk> {
    private final zzbbl a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcxk f14439b;

    public zzctl(zzbbl zzbblVar, zzcxk zzcxkVar) {
        this.a = zzbblVar;
        this.f14439b = zzcxkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzctk a() throws Exception {
        return new zzctk(this.f14439b);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzctk> b() {
        return this.a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.jo

            /* renamed from: f, reason: collision with root package name */
            private final zzctl f11661f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11661f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11661f.a();
            }
        });
    }
}
