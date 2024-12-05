package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzbtv {
    private final Set<zzbuz<zzxr>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<zzbuz<zzbrl>> f13549b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<zzbuz<zzbrw>> f13550c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<zzbuz<zzbsr>> f13551d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<zzbuz<zzbro>> f13552e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<zzbuz<zzbrs>> f13553f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<zzbuz<AdMetadataListener>> f13554g;

    /* renamed from: h, reason: collision with root package name */
    private final Set<zzbuz<AppEventListener>> f13555h;

    /* renamed from: i, reason: collision with root package name */
    private zzbrm f13556i;

    /* renamed from: j, reason: collision with root package name */
    private zzcmu f13557j;

    /* loaded from: classes2.dex */
    public static class zza {
        private Set<zzbuz<zzxr>> a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private Set<zzbuz<zzbrl>> f13558b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private Set<zzbuz<zzbrw>> f13559c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        private Set<zzbuz<zzbsr>> f13560d = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        private Set<zzbuz<zzbro>> f13561e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private Set<zzbuz<AdMetadataListener>> f13562f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        private Set<zzbuz<AppEventListener>> f13563g = new HashSet();

        /* renamed from: h, reason: collision with root package name */
        private Set<zzbuz<zzbrs>> f13564h = new HashSet();

        public final zza a(AppEventListener appEventListener, Executor executor) {
            this.f13563g.add(new zzbuz<>(appEventListener, executor));
            return this;
        }

        public final zza b(AdMetadataListener adMetadataListener, Executor executor) {
            this.f13562f.add(new zzbuz<>(adMetadataListener, executor));
            return this;
        }

        public final zza c(zzbrl zzbrlVar, Executor executor) {
            this.f13558b.add(new zzbuz<>(zzbrlVar, executor));
            return this;
        }

        public final zza d(zzbro zzbroVar, Executor executor) {
            this.f13561e.add(new zzbuz<>(zzbroVar, executor));
            return this;
        }

        public final zza e(zzbrs zzbrsVar, Executor executor) {
            this.f13564h.add(new zzbuz<>(zzbrsVar, executor));
            return this;
        }

        public final zza f(zzbrw zzbrwVar, Executor executor) {
            this.f13559c.add(new zzbuz<>(zzbrwVar, executor));
            return this;
        }

        public final zza g(zzbsr zzbsrVar, Executor executor) {
            this.f13560d.add(new zzbuz<>(zzbsrVar, executor));
            return this;
        }

        public final zza h(zzxr zzxrVar, Executor executor) {
            this.a.add(new zzbuz<>(zzxrVar, executor));
            return this;
        }

        public final zza i(zzzs zzzsVar, Executor executor) {
            if (this.f13563g != null) {
                zzcpy zzcpyVar = new zzcpy();
                zzcpyVar.b(zzzsVar);
                this.f13563g.add(new zzbuz<>(zzcpyVar, executor));
            }
            return this;
        }

        public final zzbtv k() {
            return new zzbtv(this);
        }
    }

    private zzbtv(zza zzaVar) {
        this.a = zzaVar.a;
        this.f13550c = zzaVar.f13559c;
        this.f13549b = zzaVar.f13558b;
        this.f13551d = zzaVar.f13560d;
        this.f13552e = zzaVar.f13561e;
        this.f13553f = zzaVar.f13564h;
        this.f13554g = zzaVar.f13562f;
        this.f13555h = zzaVar.f13563g;
    }

    public final zzcmu a(Clock clock) {
        if (this.f13557j == null) {
            this.f13557j = new zzcmu(clock);
        }
        return this.f13557j;
    }

    public final Set<zzbuz<zzbrl>> b() {
        return this.f13549b;
    }

    public final Set<zzbuz<zzbsr>> c() {
        return this.f13551d;
    }

    public final Set<zzbuz<zzbro>> d() {
        return this.f13552e;
    }

    public final Set<zzbuz<zzbrs>> e() {
        return this.f13553f;
    }

    public final Set<zzbuz<AdMetadataListener>> f() {
        return this.f13554g;
    }

    public final Set<zzbuz<AppEventListener>> g() {
        return this.f13555h;
    }

    public final Set<zzbuz<zzxr>> h() {
        return this.a;
    }

    public final Set<zzbuz<zzbrw>> i() {
        return this.f13550c;
    }

    public final zzbrm j(Set<zzbuz<zzbro>> set) {
        if (this.f13556i == null) {
            this.f13556i = new zzbrm(set);
        }
        return this.f13556i;
    }
}
