package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class cc implements zzbod {
    private zzbtv a;

    /* renamed from: b, reason: collision with root package name */
    private zzcyg f11238b;

    /* renamed from: c, reason: collision with root package name */
    private zzcyo f11239c;

    /* renamed from: d, reason: collision with root package name */
    private zzbqy f11240d;

    /* renamed from: e, reason: collision with root package name */
    private zzcfp f11241e;

    /* renamed from: f, reason: collision with root package name */
    private zzbnc f11242f;

    /* renamed from: g, reason: collision with root package name */
    private zzbpx f11243g;

    /* renamed from: h, reason: collision with root package name */
    private zzbqt f11244h;

    /* renamed from: i, reason: collision with root package name */
    private zzbox f11245i;

    /* renamed from: j, reason: collision with root package name */
    private zzcow f11246j;

    /* renamed from: k, reason: collision with root package name */
    private zzbxk f11247k;
    private final /* synthetic */ zzbkc l;

    private cc(zzbkc zzbkcVar) {
        this.l = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod a(zzbtv zzbtvVar) {
        this.a = (zzbtv) zzdto.a(zzbtvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final zzboc b() {
        zzdto.c(this.a, zzbtv.class);
        if (this.f11238b == null) {
            this.f11238b = new zzcyg();
        }
        if (this.f11239c == null) {
            this.f11239c = new zzcyo();
        }
        zzdto.c(this.f11240d, zzbqy.class);
        if (this.f11241e == null) {
            this.f11241e = new zzcfp();
        }
        zzdto.c(this.f11242f, zzbnc.class);
        if (this.f11243g == null) {
            this.f11243g = new zzbpx();
        }
        if (this.f11244h == null) {
            this.f11244h = new zzbqt();
        }
        zzdto.c(this.f11245i, zzbox.class);
        zzdto.c(this.f11246j, zzcow.class);
        zzdto.c(this.f11247k, zzbxk.class);
        return new dc(this.l, this.a, this.f11238b, this.f11239c, this.f11240d, this.f11241e, this.f11242f, this.f11243g, this.f11244h, this.f11245i, this.f11246j, this.f11247k);
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod c(zzbox zzboxVar) {
        this.f11245i = (zzbox) zzdto.a(zzboxVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod d(zzbnc zzbncVar) {
        this.f11242f = (zzbnc) zzdto.a(zzbncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod e(zzcow zzcowVar) {
        this.f11246j = (zzcow) zzdto.a(zzcowVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod f(zzbqy zzbqyVar) {
        this.f11240d = (zzbqy) zzdto.a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod g(zzbxk zzbxkVar) {
        this.f11247k = (zzbxk) zzdto.a(zzbxkVar);
        return this;
    }
}
