package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbkn {
    private zzcye a;

    /* renamed from: b, reason: collision with root package name */
    private zzbjn f13330b;

    /* renamed from: c, reason: collision with root package name */
    private zzbld f13331c;

    /* renamed from: d, reason: collision with root package name */
    private zzbkw f13332d;

    /* renamed from: e, reason: collision with root package name */
    private zzdac f13333e;

    private zzbkn() {
    }

    public final zzbkn a(zzbkw zzbkwVar) {
        this.f13332d = (zzbkw) zzdto.a(zzbkwVar);
        return this;
    }

    public final zzbjm b() {
        if (this.a == null) {
            this.a = new zzcye();
        }
        zzdto.c(this.f13330b, zzbjn.class);
        if (this.f13331c == null) {
            this.f13331c = new zzbld();
        }
        zzdto.c(this.f13332d, zzbkw.class);
        if (this.f13333e == null) {
            this.f13333e = new zzdac();
        }
        return new zzbkc(this.a, this.f13330b, this.f13331c, this.f13332d, this.f13333e);
    }

    public final zzbkn c(zzbjn zzbjnVar) {
        this.f13330b = (zzbjn) zzdto.a(zzbjnVar);
        return this;
    }
}
