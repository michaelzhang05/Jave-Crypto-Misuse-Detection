package com.bumptech.glide.load.engine.z;

import android.graphics.Bitmap;

/* compiled from: AttributeStrategy.java */
/* loaded from: classes.dex */
class c implements l {
    private final b a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f8627b = new h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeStrategy.java */
    /* loaded from: classes.dex */
    public static class a implements m {
        private final b a;

        /* renamed from: b, reason: collision with root package name */
        private int f8628b;

        /* renamed from: c, reason: collision with root package name */
        private int f8629c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap.Config f8630d;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.z.m
        public void a() {
            this.a.c(this);
        }

        public void b(int i2, int i3, Bitmap.Config config) {
            this.f8628b = i2;
            this.f8629c = i3;
            this.f8630d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8628b == aVar.f8628b && this.f8629c == aVar.f8629c && this.f8630d == aVar.f8630d;
        }

        public int hashCode() {
            int i2 = ((this.f8628b * 31) + this.f8629c) * 31;
            Bitmap.Config config = this.f8630d;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.g(this.f8628b, this.f8629c, this.f8630d);
        }
    }

    /* compiled from: AttributeStrategy.java */
    /* loaded from: classes.dex */
    static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.z.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i2, int i3, Bitmap.Config config) {
            a b2 = b();
            b2.b(i2, i3, config);
            return b2;
        }
    }

    static String g(int i2, int i3, Bitmap.Config config) {
        return "[" + i2 + "x" + i3 + "], " + config;
    }

    private static String h(Bitmap bitmap) {
        return g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.z.l
    public Bitmap a() {
        return this.f8627b.f();
    }

    @Override // com.bumptech.glide.load.engine.z.l
    public String b(int i2, int i3, Bitmap.Config config) {
        return g(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.z.l
    public void c(Bitmap bitmap) {
        this.f8627b.d(this.a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.z.l
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        return this.f8627b.a(this.a.e(i2, i3, config));
    }

    @Override // com.bumptech.glide.load.engine.z.l
    public int e(Bitmap bitmap) {
        return com.bumptech.glide.r.k.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.z.l
    public String f(Bitmap bitmap) {
        return h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f8627b;
    }
}
