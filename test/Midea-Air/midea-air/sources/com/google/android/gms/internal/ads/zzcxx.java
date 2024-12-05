package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcxx {
    private zzxz a;

    /* renamed from: b */
    private zzyd f14581b;

    /* renamed from: c */
    private zzzy f14582c;

    /* renamed from: d */
    private String f14583d;

    /* renamed from: e */
    private zzacd f14584e;

    /* renamed from: f */
    private boolean f14585f;

    /* renamed from: g */
    private ArrayList<String> f14586g;

    /* renamed from: h */
    private ArrayList<String> f14587h;

    /* renamed from: i */
    private zzady f14588i;

    /* renamed from: j */
    private PublisherAdViewOptions f14589j;

    /* renamed from: k */
    private zzzs f14590k;
    private String l;
    private String m;
    private zzaiy o;
    private int n = 1;
    public final Set<String> p = new HashSet();

    public final zzyd G() {
        return this.f14581b;
    }

    public final zzxz b() {
        return this.a;
    }

    public final String c() {
        return this.f14583d;
    }

    public final zzcxv d() {
        Preconditions.k(this.f14583d, "ad unit must not be null");
        Preconditions.k(this.f14581b, "ad size must not be null");
        Preconditions.k(this.a, "ad request must not be null");
        return new zzcxv(this);
    }

    public final zzcxx e(PublisherAdViewOptions publisherAdViewOptions) {
        this.f14589j = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f14585f = publisherAdViewOptions.getManualImpressionsEnabled();
            this.f14590k = publisherAdViewOptions.zzkt();
        }
        return this;
    }

    public final zzcxx f(zzady zzadyVar) {
        this.f14588i = zzadyVar;
        return this;
    }

    public final zzcxx g(zzaiy zzaiyVar) {
        this.o = zzaiyVar;
        this.f14584e = new zzacd(false, true, false);
        return this;
    }

    public final zzcxx h(ArrayList<String> arrayList) {
        this.f14586g = arrayList;
        return this;
    }

    public final zzcxx j(boolean z) {
        this.f14585f = z;
        return this;
    }

    public final zzcxx k(zzacd zzacdVar) {
        this.f14584e = zzacdVar;
        return this;
    }

    public final zzcxx l(ArrayList<String> arrayList) {
        this.f14587h = arrayList;
        return this;
    }

    public final zzcxx n(zzyd zzydVar) {
        this.f14581b = zzydVar;
        return this;
    }

    public final zzcxx o(zzzy zzzyVar) {
        this.f14582c = zzzyVar;
        return this;
    }

    public final zzcxx q(int i2) {
        this.n = i2;
        return this;
    }

    public final zzcxx t(String str) {
        this.f14583d = str;
        return this;
    }

    public final zzcxx u(String str) {
        this.l = str;
        return this;
    }

    public final zzcxx v(String str) {
        this.m = str;
        return this;
    }

    public final zzcxx w(zzxz zzxzVar) {
        this.a = zzxzVar;
        return this;
    }
}
