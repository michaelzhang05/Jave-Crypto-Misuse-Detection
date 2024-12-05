package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class jc implements zzcdg {
    private zzbtv a;

    /* renamed from: b, reason: collision with root package name */
    private zzcyg f11642b;

    /* renamed from: c, reason: collision with root package name */
    private zzcyo f11643c;

    /* renamed from: d, reason: collision with root package name */
    private zzbqy f11644d;

    /* renamed from: e, reason: collision with root package name */
    private zzcfp f11645e;

    /* renamed from: f, reason: collision with root package name */
    private zzbpx f11646f;

    /* renamed from: g, reason: collision with root package name */
    private zzbqt f11647g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzbkc f11648h;

    private jc(zzbkc zzbkcVar) {
        this.f11648h = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdg
    public final /* synthetic */ zzcdg a(zzbqy zzbqyVar) {
        this.f11644d = (zzbqy) zzdto.a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcdg
    public final zzcdf b() {
        zzdto.c(this.a, zzbtv.class);
        if (this.f11642b == null) {
            this.f11642b = new zzcyg();
        }
        if (this.f11643c == null) {
            this.f11643c = new zzcyo();
        }
        zzdto.c(this.f11644d, zzbqy.class);
        if (this.f11645e == null) {
            this.f11645e = new zzcfp();
        }
        if (this.f11646f == null) {
            this.f11646f = new zzbpx();
        }
        if (this.f11647g == null) {
            this.f11647g = new zzbqt();
        }
        return new kc(this.f11648h, this.a, this.f11642b, this.f11643c, this.f11644d, this.f11645e, this.f11646f, this.f11647g);
    }

    @Override // com.google.android.gms.internal.ads.zzcdg
    public final /* synthetic */ zzcdg c(zzbtv zzbtvVar) {
        this.a = (zzbtv) zzdto.a(zzbtvVar);
        return this;
    }
}
