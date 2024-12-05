package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcxv {
    public final zzzy a;

    /* renamed from: b, reason: collision with root package name */
    public final zzacd f14571b;

    /* renamed from: c, reason: collision with root package name */
    public final zzaiy f14572c;

    /* renamed from: d, reason: collision with root package name */
    public final zzxz f14573d;

    /* renamed from: e, reason: collision with root package name */
    public final zzyd f14574e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14575f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<String> f14576g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<String> f14577h;

    /* renamed from: i, reason: collision with root package name */
    public final zzady f14578i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14579j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14580k;
    public final int l;
    public final PublisherAdViewOptions m;
    public final zzzs n;
    public final Set<String> o;

    private zzcxv(zzcxx zzcxxVar) {
        zzacd zzacdVar;
        this.f14574e = zzcxx.a(zzcxxVar);
        this.f14575f = zzcxx.i(zzcxxVar);
        this.a = zzcxx.m(zzcxxVar);
        this.f14573d = new zzxz(zzcxx.C(zzcxxVar).f15791f, zzcxx.C(zzcxxVar).f15792g, zzcxx.C(zzcxxVar).f15793h, zzcxx.C(zzcxxVar).f15794i, zzcxx.C(zzcxxVar).f15795j, zzcxx.C(zzcxxVar).f15796k, zzcxx.C(zzcxxVar).l, zzcxx.C(zzcxxVar).m || zzcxx.D(zzcxxVar), zzcxx.C(zzcxxVar).n, zzcxx.C(zzcxxVar).o, zzcxx.C(zzcxxVar).p, zzcxx.C(zzcxxVar).q, zzcxx.C(zzcxxVar).r, zzcxx.C(zzcxxVar).s, zzcxx.C(zzcxxVar).t, zzcxx.C(zzcxxVar).u, zzcxx.C(zzcxxVar).v, zzcxx.C(zzcxxVar).w, zzcxx.C(zzcxxVar).x, zzcxx.C(zzcxxVar).y, zzcxx.C(zzcxxVar).z);
        zzady zzadyVar = null;
        if (zzcxx.E(zzcxxVar) != null) {
            zzacdVar = zzcxx.E(zzcxxVar);
        } else {
            zzacdVar = zzcxx.F(zzcxxVar) != null ? zzcxx.F(zzcxxVar).f12674k : null;
        }
        this.f14571b = zzacdVar;
        this.f14576g = zzcxx.p(zzcxxVar);
        this.f14577h = zzcxx.r(zzcxxVar);
        if (zzcxx.p(zzcxxVar) != null) {
            if (zzcxx.F(zzcxxVar) == null) {
                zzadyVar = new zzady(new NativeAdOptions.Builder().build());
            } else {
                zzadyVar = zzcxx.F(zzcxxVar);
            }
        }
        this.f14578i = zzadyVar;
        this.f14579j = zzcxx.s(zzcxxVar);
        this.f14580k = zzcxx.x(zzcxxVar);
        this.l = zzcxx.y(zzcxxVar);
        this.m = zzcxx.z(zzcxxVar);
        this.n = zzcxx.A(zzcxxVar);
        this.f14572c = zzcxx.B(zzcxxVar);
        this.o = zzcxxVar.p;
    }

    public final zzaga a() {
        PublisherAdViewOptions publisherAdViewOptions = this.m;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzku();
    }
}
