package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class gc implements zzbwt {
    private zzbtv a;

    /* renamed from: b, reason: collision with root package name */
    private zzcyg f11482b;

    /* renamed from: c, reason: collision with root package name */
    private zzcyo f11483c;

    /* renamed from: d, reason: collision with root package name */
    private zzbqy f11484d;

    /* renamed from: e, reason: collision with root package name */
    private zzcfp f11485e;

    /* renamed from: f, reason: collision with root package name */
    private zzbpx f11486f;

    /* renamed from: g, reason: collision with root package name */
    private zzbqt f11487g;

    /* renamed from: h, reason: collision with root package name */
    private zzcow f11488h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzbkc f11489i;

    private gc(zzbkc zzbkcVar) {
        this.f11489i = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final zzbws a() {
        zzdto.c(this.a, zzbtv.class);
        if (this.f11482b == null) {
            this.f11482b = new zzcyg();
        }
        if (this.f11483c == null) {
            this.f11483c = new zzcyo();
        }
        zzdto.c(this.f11484d, zzbqy.class);
        if (this.f11485e == null) {
            this.f11485e = new zzcfp();
        }
        if (this.f11486f == null) {
            this.f11486f = new zzbpx();
        }
        if (this.f11487g == null) {
            this.f11487g = new zzbqt();
        }
        zzdto.c(this.f11488h, zzcow.class);
        return new hc(this.f11489i, this.a, this.f11482b, this.f11483c, this.f11484d, this.f11485e, this.f11486f, this.f11487g, this.f11488h);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final /* synthetic */ zzbwt b(zzcow zzcowVar) {
        this.f11488h = (zzcow) zzdto.a(zzcowVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final /* synthetic */ zzbwt c(zzbqy zzbqyVar) {
        this.f11484d = (zzbqy) zzdto.a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final /* synthetic */ zzbwt d(zzbtv zzbtvVar) {
        this.a = (zzbtv) zzdto.a(zzbtvVar);
        return this;
    }
}
