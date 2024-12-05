package com.airbnb.lottie;

import android.graphics.Rect;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public class d {
    private final m a = new m();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f7902b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<com.airbnb.lottie.s.k.d>> f7903c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, g> f7904d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, com.airbnb.lottie.s.c> f7905e;

    /* renamed from: f, reason: collision with root package name */
    private c.e.h<com.airbnb.lottie.s.d> f7906f;

    /* renamed from: g, reason: collision with root package name */
    private c.e.d<com.airbnb.lottie.s.k.d> f7907g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.airbnb.lottie.s.k.d> f7908h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f7909i;

    /* renamed from: j, reason: collision with root package name */
    private float f7910j;

    /* renamed from: k, reason: collision with root package name */
    private float f7911k;
    private float l;

    public void a(String str) {
        Log.w("LOTTIE", str);
        this.f7902b.add(str);
    }

    public Rect b() {
        return this.f7909i;
    }

    public c.e.h<com.airbnb.lottie.s.d> c() {
        return this.f7906f;
    }

    public float d() {
        return (e() / this.l) * 1000.0f;
    }

    public float e() {
        return this.f7911k - this.f7910j;
    }

    public float f() {
        return this.f7911k;
    }

    public Map<String, com.airbnb.lottie.s.c> g() {
        return this.f7905e;
    }

    public float h() {
        return this.l;
    }

    public Map<String, g> i() {
        return this.f7904d;
    }

    public List<com.airbnb.lottie.s.k.d> j() {
        return this.f7908h;
    }

    public m k() {
        return this.a;
    }

    public List<com.airbnb.lottie.s.k.d> l(String str) {
        return this.f7903c.get(str);
    }

    public float m() {
        return this.f7910j;
    }

    public void n(Rect rect, float f2, float f3, float f4, List<com.airbnb.lottie.s.k.d> list, c.e.d<com.airbnb.lottie.s.k.d> dVar, Map<String, List<com.airbnb.lottie.s.k.d>> map, Map<String, g> map2, c.e.h<com.airbnb.lottie.s.d> hVar, Map<String, com.airbnb.lottie.s.c> map3) {
        this.f7909i = rect;
        this.f7910j = f2;
        this.f7911k = f3;
        this.l = f4;
        this.f7908h = list;
        this.f7907g = dVar;
        this.f7903c = map;
        this.f7904d = map2;
        this.f7906f = hVar;
        this.f7905e = map3;
    }

    public com.airbnb.lottie.s.k.d o(long j2) {
        return this.f7907g.g(j2);
    }

    public void p(boolean z) {
        this.a.b(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.airbnb.lottie.s.k.d> it = this.f7908h.iterator();
        while (it.hasNext()) {
            sb.append(it.next().v("\t"));
        }
        return sb.toString();
    }
}
