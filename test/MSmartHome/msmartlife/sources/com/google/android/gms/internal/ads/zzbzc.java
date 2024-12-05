package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbzc {
    public static final zzbzc a = new zzbze().b();

    /* renamed from: b, reason: collision with root package name */
    private final zzafl f13717b;

    /* renamed from: c, reason: collision with root package name */
    private final zzafi f13718c;

    /* renamed from: d, reason: collision with root package name */
    private final zzafx f13719d;

    /* renamed from: e, reason: collision with root package name */
    private final zzafu f13720e;

    /* renamed from: f, reason: collision with root package name */
    private final zzaje f13721f;

    /* renamed from: g, reason: collision with root package name */
    private final c.e.g<String, zzafr> f13722g;

    /* renamed from: h, reason: collision with root package name */
    private final c.e.g<String, zzafo> f13723h;

    private zzbzc(zzbze zzbzeVar) {
        this.f13717b = zzbzeVar.a;
        this.f13718c = zzbzeVar.f13724b;
        this.f13719d = zzbzeVar.f13725c;
        this.f13722g = new c.e.g<>(zzbzeVar.f13728f);
        this.f13723h = new c.e.g<>(zzbzeVar.f13729g);
        this.f13720e = zzbzeVar.f13726d;
        this.f13721f = zzbzeVar.f13727e;
    }

    public final zzafl a() {
        return this.f13717b;
    }

    public final zzafi b() {
        return this.f13718c;
    }

    public final zzafx c() {
        return this.f13719d;
    }

    public final zzafu d() {
        return this.f13720e;
    }

    public final zzaje e() {
        return this.f13721f;
    }

    public final ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f13719d != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f13717b != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f13718c != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f13722g.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f13721f != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>(this.f13722g.size());
        for (int i2 = 0; i2 < this.f13722g.size(); i2++) {
            arrayList.add(this.f13722g.i(i2));
        }
        return arrayList;
    }

    public final zzafr h(String str) {
        return this.f13722g.get(str);
    }

    public final zzafo i(String str) {
        return this.f13723h.get(str);
    }
}
