package com.bumptech.glide.load.n;

import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> {
        public final com.bumptech.glide.load.f a;

        /* renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.f> f8732b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.m.d<Data> f8733c;

        public a(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.m.d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(com.bumptech.glide.load.f fVar, List<com.bumptech.glide.load.f> list, com.bumptech.glide.load.m.d<Data> dVar) {
            this.a = (com.bumptech.glide.load.f) com.bumptech.glide.r.j.d(fVar);
            this.f8732b = (List) com.bumptech.glide.r.j.d(list);
            this.f8733c = (com.bumptech.glide.load.m.d) com.bumptech.glide.r.j.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i2, int i3, com.bumptech.glide.load.i iVar);
}
