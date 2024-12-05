package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbze {
    zzafl a;

    /* renamed from: b, reason: collision with root package name */
    zzafi f13724b;

    /* renamed from: c, reason: collision with root package name */
    zzafx f13725c;

    /* renamed from: d, reason: collision with root package name */
    zzafu f13726d;

    /* renamed from: e, reason: collision with root package name */
    zzaje f13727e;

    /* renamed from: f, reason: collision with root package name */
    final c.e.g<String, zzafr> f13728f = new c.e.g<>();

    /* renamed from: g, reason: collision with root package name */
    final c.e.g<String, zzafo> f13729g = new c.e.g<>();

    public final zzbze a(zzafu zzafuVar) {
        this.f13726d = zzafuVar;
        return this;
    }

    public final zzbzc b() {
        return new zzbzc(this);
    }

    public final zzbze c(zzafi zzafiVar) {
        this.f13724b = zzafiVar;
        return this;
    }

    public final zzbze d(zzafl zzaflVar) {
        this.a = zzaflVar;
        return this;
    }

    public final zzbze e(zzafx zzafxVar) {
        this.f13725c = zzafxVar;
        return this;
    }

    public final zzbze f(zzaje zzajeVar) {
        this.f13727e = zzajeVar;
        return this;
    }

    public final zzbze g(String str, zzafr zzafrVar, zzafo zzafoVar) {
        this.f13728f.put(str, zzafrVar);
        this.f13729g.put(str, zzafoVar);
        return this;
    }
}
