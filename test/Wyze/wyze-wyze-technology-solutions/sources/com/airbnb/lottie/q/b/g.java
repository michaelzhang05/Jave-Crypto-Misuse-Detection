package com.airbnb.lottie.q.b;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes.dex */
public class g {
    private final List<a<com.airbnb.lottie.s.j.l, Path>> a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f8063b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.s.j.g> f8064c;

    public g(List<com.airbnb.lottie.s.j.g> list) {
        this.f8064c = list;
        this.a = new ArrayList(list.size());
        this.f8063b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.add(list.get(i2).b().a());
            this.f8063b.add(list.get(i2).c().a());
        }
    }

    public List<a<com.airbnb.lottie.s.j.l, Path>> a() {
        return this.a;
    }

    public List<com.airbnb.lottie.s.j.g> b() {
        return this.f8064c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f8063b;
    }
}
