package com.bumptech.glide.p.m;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableCrossFadeFactory.java */
/* loaded from: classes.dex */
public class a implements e<Drawable> {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8939b;

    /* renamed from: c, reason: collision with root package name */
    private b f8940c;

    /* compiled from: DrawableCrossFadeFactory.java */
    /* renamed from: com.bumptech.glide.p.m.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124a {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8941b;

        public C0124a() {
            this(300);
        }

        public a a() {
            return new a(this.a, this.f8941b);
        }

        public C0124a(int i2) {
            this.a = i2;
        }
    }

    protected a(int i2, boolean z) {
        this.a = i2;
        this.f8939b = z;
    }

    private d<Drawable> b() {
        if (this.f8940c == null) {
            this.f8940c = new b(this.a, this.f8939b);
        }
        return this.f8940c;
    }

    @Override // com.bumptech.glide.p.m.e
    public d<Drawable> a(com.bumptech.glide.load.a aVar, boolean z) {
        return aVar == com.bumptech.glide.load.a.MEMORY_CACHE ? c.b() : b();
    }
}
