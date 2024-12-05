package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class em implements zzbvo {
    private final /* synthetic */ zzcxu a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzcxm f11365b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzcjy f11366c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ zzcnw f11367d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public em(zzcnw zzcnwVar, zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar) {
        this.f11367d = zzcnwVar;
        this.a = zzcxuVar;
        this.f11365b = zzcxmVar;
        this.f11366c = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void a(int i2) {
        String valueOf = String.valueOf(this.f11366c.a);
        zzbad.i(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void onInitializationSucceeded() {
        Executor executor;
        executor = this.f11367d.f14275b;
        final zzcxu zzcxuVar = this.a;
        final zzcxm zzcxmVar = this.f11365b;
        final zzcjy zzcjyVar = this.f11366c;
        executor.execute(new Runnable(this, zzcxuVar, zzcxmVar, zzcjyVar) { // from class: com.google.android.gms.internal.ads.fm

            /* renamed from: f, reason: collision with root package name */
            private final em f11428f;

            /* renamed from: g, reason: collision with root package name */
            private final zzcxu f11429g;

            /* renamed from: h, reason: collision with root package name */
            private final zzcxm f11430h;

            /* renamed from: i, reason: collision with root package name */
            private final zzcjy f11431i;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11428f = this;
                this.f11429g = zzcxuVar;
                this.f11430h = zzcxmVar;
                this.f11431i = zzcjyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                em emVar = this.f11428f;
                zzcxu zzcxuVar2 = this.f11429g;
                zzcxm zzcxmVar2 = this.f11430h;
                zzcjy zzcjyVar2 = this.f11431i;
                zzcnw zzcnwVar = emVar.f11367d;
                zzcnw.e(zzcxuVar2, zzcxmVar2, zzcjyVar2);
            }
        });
    }
}
