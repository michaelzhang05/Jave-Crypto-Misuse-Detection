package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcor<AdT> implements zzcjv<AdT> {
    private final zzado a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbbl f14304b;

    /* renamed from: c, reason: collision with root package name */
    private final zzczt f14305c;

    /* renamed from: d, reason: collision with root package name */
    private final zzcou<AdT> f14306d;

    public zzcor(zzczt zzcztVar, zzbbl zzbblVar, zzado zzadoVar, zzcou<AdT> zzcouVar) {
        this.f14305c = zzcztVar;
        this.f14304b = zzbblVar;
        this.a = zzadoVar;
        this.f14306d = zzcouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<AdT> a(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzbbr zzbbrVar = new zzbbr();
        zzcoz zzcozVar = new zzcoz();
        zzcozVar.a(new pm(this, zzbbrVar, zzcxuVar, zzcxmVar, zzcozVar));
        zzcxq zzcxqVar = zzcxmVar.p;
        final zzadj zzadjVar = new zzadj(zzcozVar, zzcxqVar.f14564b, zzcxqVar.a);
        return this.f14305c.g(zzczs.CUSTOM_RENDER_SYN).a(new zzczd(this, zzadjVar) { // from class: com.google.android.gms.internal.ads.om
            private final zzcor a;

            /* renamed from: b, reason: collision with root package name */
            private final zzadj f11945b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11945b = zzadjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzczd
            public final void run() {
                this.a.d(this.f11945b);
            }
        }, this.f14304b).j(zzczs.CUSTOM_RENDER_ACK).g(zzbbrVar).f();
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar;
        return (this.a == null || (zzcxqVar = zzcxmVar.p) == null || zzcxqVar.a == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzadj zzadjVar) throws Exception {
        this.a.E2(zzadjVar);
    }
}
