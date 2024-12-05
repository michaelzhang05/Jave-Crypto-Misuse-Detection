package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzaaz {
    private final Date a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12556b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12557c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f12558d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f12559e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12560f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f12561g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f12562h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12563i;

    /* renamed from: j, reason: collision with root package name */
    private final String f12564j;

    /* renamed from: k, reason: collision with root package name */
    private final SearchAdRequest f12565k;
    private final int l;
    private final Set<String> m;
    private final Bundle n;
    private final Set<String> o;
    private final boolean p;
    private final zzdak q;
    private final int r;
    private final String s;

    public zzaaz(zzaba zzabaVar) {
        this(zzabaVar, null);
    }

    @Deprecated
    public final Date a() {
        return this.a;
    }

    public final String b() {
        return this.f12556b;
    }

    public final Bundle c(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f12561g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle d() {
        return this.n;
    }

    @Deprecated
    public final int e() {
        return this.f12557c;
    }

    public final Set<String> f() {
        return this.f12558d;
    }

    public final Location g() {
        return this.f12559e;
    }

    public final boolean h() {
        return this.f12560f;
    }

    public final String i() {
        return this.s;
    }

    @Deprecated
    public final <T extends NetworkExtras> T j(Class<T> cls) {
        return (T) this.f12562h.get(cls);
    }

    public final Bundle k(Class<? extends MediationExtrasReceiver> cls) {
        return this.f12561g.getBundle(cls.getName());
    }

    public final String l() {
        return this.f12563i;
    }

    @Deprecated
    public final boolean m() {
        return this.p;
    }

    public final boolean n(Context context) {
        Set<String> set = this.m;
        zzyt.a();
        return set.contains(zzazt.l(context));
    }

    public final String o() {
        return this.f12564j;
    }

    public final SearchAdRequest p() {
        return this.f12565k;
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> q() {
        return this.f12562h;
    }

    public final Bundle r() {
        return this.f12561g;
    }

    public final int s() {
        return this.l;
    }

    public final Set<String> t() {
        return this.o;
    }

    public final int u() {
        return this.r;
    }

    public zzaaz(zzaba zzabaVar, SearchAdRequest searchAdRequest) {
        Date date;
        String str;
        int i2;
        HashSet hashSet;
        Location location;
        boolean z;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i3;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z2;
        int i4;
        String str4;
        date = zzabaVar.f12571g;
        this.a = date;
        str = zzabaVar.f12572h;
        this.f12556b = str;
        i2 = zzabaVar.f12573i;
        this.f12557c = i2;
        hashSet = zzabaVar.a;
        this.f12558d = Collections.unmodifiableSet(hashSet);
        location = zzabaVar.f12574j;
        this.f12559e = location;
        z = zzabaVar.f12575k;
        this.f12560f = z;
        bundle = zzabaVar.f12566b;
        this.f12561g = bundle;
        hashMap = zzabaVar.f12567c;
        this.f12562h = Collections.unmodifiableMap(hashMap);
        str2 = zzabaVar.l;
        this.f12563i = str2;
        str3 = zzabaVar.m;
        this.f12564j = str3;
        this.f12565k = searchAdRequest;
        i3 = zzabaVar.n;
        this.l = i3;
        hashSet2 = zzabaVar.f12568d;
        this.m = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzabaVar.f12569e;
        this.n = bundle2;
        hashSet3 = zzabaVar.f12570f;
        this.o = Collections.unmodifiableSet(hashSet3);
        z2 = zzabaVar.o;
        this.p = z2;
        this.q = null;
        i4 = zzabaVar.p;
        this.r = i4;
        str4 = zzabaVar.q;
        this.s = str4;
    }
}
