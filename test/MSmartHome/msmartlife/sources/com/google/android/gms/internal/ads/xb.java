package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class xb implements zzbxp {
    private zzcyo a;

    /* renamed from: b, reason: collision with root package name */
    private zzbqy f12385b;

    /* renamed from: c, reason: collision with root package name */
    private zzcfp f12386c;

    /* renamed from: d, reason: collision with root package name */
    private zzbpx f12387d;

    /* renamed from: e, reason: collision with root package name */
    private zzbqt f12388e;

    /* renamed from: f, reason: collision with root package name */
    private zzbtv f12389f;

    /* renamed from: g, reason: collision with root package name */
    private zzbxk f12390g;

    /* renamed from: h, reason: collision with root package name */
    private zzcyg f12391h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzbkc f12392i;

    private xb(zzbkc zzbkcVar) {
        this.f12392i = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    public final /* synthetic */ zzbxp a(zzbtv zzbtvVar) {
        this.f12389f = (zzbtv) zzdto.a(zzbtvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    public final zzbxo b() {
        if (this.a == null) {
            this.a = new zzcyo();
        }
        zzdto.c(this.f12385b, zzbqy.class);
        if (this.f12386c == null) {
            this.f12386c = new zzcfp();
        }
        if (this.f12387d == null) {
            this.f12387d = new zzbpx();
        }
        if (this.f12388e == null) {
            this.f12388e = new zzbqt();
        }
        zzdto.c(this.f12389f, zzbtv.class);
        zzdto.c(this.f12390g, zzbxk.class);
        if (this.f12391h == null) {
            this.f12391h = new zzcyg();
        }
        return new yb(this.f12392i, this.a, this.f12385b, this.f12386c, this.f12387d, this.f12388e, this.f12389f, this.f12390g, this.f12391h);
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    public final /* synthetic */ zzbxp c(zzbqy zzbqyVar) {
        this.f12385b = (zzbqy) zzdto.a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    public final /* synthetic */ zzbxp d(zzbxk zzbxkVar) {
        this.f12390g = (zzbxk) zzdto.a(zzbxkVar);
        return this;
    }
}
