package com.bumptech.glide.load.o.c;

import android.graphics.Bitmap;

/* compiled from: BitmapResource.java */
/* loaded from: classes.dex */
public class d implements com.bumptech.glide.load.engine.u<Bitmap>, com.bumptech.glide.load.engine.q {

    /* renamed from: f, reason: collision with root package name */
    private final Bitmap f8761f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.z.e f8762g;

    public d(Bitmap bitmap, com.bumptech.glide.load.engine.z.e eVar) {
        this.f8761f = (Bitmap) com.bumptech.glide.r.j.e(bitmap, "Bitmap must not be null");
        this.f8762g = (com.bumptech.glide.load.engine.z.e) com.bumptech.glide.r.j.e(eVar, "BitmapPool must not be null");
    }

    public static d f(Bitmap bitmap, com.bumptech.glide.load.engine.z.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.engine.q
    public void a() {
        this.f8761f.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f8761f;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void c() {
        this.f8762g.c(this.f8761f);
    }

    @Override // com.bumptech.glide.load.engine.u
    public int d() {
        return com.bumptech.glide.r.k.h(this.f8761f);
    }

    @Override // com.bumptech.glide.load.engine.u
    public Class<Bitmap> e() {
        return Bitmap.class;
    }
}
