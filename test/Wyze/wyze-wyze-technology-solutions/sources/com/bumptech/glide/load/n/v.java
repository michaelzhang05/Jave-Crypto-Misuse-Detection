package com.bumptech.glide.load.n;

import com.bumptech.glide.load.m.d;
import com.bumptech.glide.load.n.n;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {
    private static final v<?> a = new v<>();

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {
        private static final a<?> a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) a;
        }

        @Override // com.bumptech.glide.load.n.o
        public n<Model, Model> b(r rVar) {
            return v.c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    private static class b<Model> implements com.bumptech.glide.load.m.d<Model> {

        /* renamed from: f, reason: collision with root package name */
        private final Model f8750f;

        b(Model model) {
            this.f8750f = model;
        }

        @Override // com.bumptech.glide.load.m.d
        public Class<Model> a() {
            return (Class<Model>) this.f8750f.getClass();
        }

        @Override // com.bumptech.glide.load.m.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.m.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.m.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.m.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Model> aVar) {
            aVar.g(this.f8750f);
        }
    }

    @Deprecated
    public v() {
    }

    public static <T> v<T> c() {
        return (v<T>) a;
    }

    @Override // com.bumptech.glide.load.n.n
    public boolean a(Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.n.n
    public n.a<Model> b(Model model, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.q.c(model), new b(model));
    }
}
