package com.airbnb.lottie.s.j;

import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public class n implements b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f8188b;

    public n(String str, List<b> list) {
        this.a = str;
        this.f8188b = list;
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return new com.airbnb.lottie.q.a.c(fVar, aVar, this);
    }

    public List<b> b() {
        return this.f8188b;
    }

    public String c() {
        return this.a;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.f8188b.toArray()) + '}';
    }
}
