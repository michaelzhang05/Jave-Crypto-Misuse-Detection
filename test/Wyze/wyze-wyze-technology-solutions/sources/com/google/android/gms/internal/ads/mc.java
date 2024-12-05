package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class mc implements zzcqp {
    private zzcyo a;

    /* renamed from: b, reason: collision with root package name */
    private zzbqy f11812b;

    /* renamed from: c, reason: collision with root package name */
    private zzcqt f11813c;

    /* renamed from: d, reason: collision with root package name */
    private zzcfp f11814d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzbkc f11815e;

    private mc(zzbkc zzbkcVar) {
        this.f11815e = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    public final zzcqo a() {
        if (this.a == null) {
            this.a = new zzcyo();
        }
        zzdto.c(this.f11812b, zzbqy.class);
        zzdto.c(this.f11813c, zzcqt.class);
        if (this.f11814d == null) {
            this.f11814d = new zzcfp();
        }
        return new nc(this.f11815e, this.a, this.f11812b, this.f11813c, this.f11814d);
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    public final /* synthetic */ zzcqp b(zzbqy zzbqyVar) {
        this.f11812b = (zzbqy) zzdto.a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    public final /* synthetic */ zzcqp c(zzcqt zzcqtVar) {
        this.f11813c = (zzcqt) zzdto.a(zzcqtVar);
        return this;
    }
}
