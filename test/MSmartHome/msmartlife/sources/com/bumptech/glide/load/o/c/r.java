package com.bumptech.glide.load.o.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes.dex */
public final class r implements com.bumptech.glide.load.engine.u<BitmapDrawable>, com.bumptech.glide.load.engine.q {

    /* renamed from: f, reason: collision with root package name */
    private final Resources f8793f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.u<Bitmap> f8794g;

    private r(Resources resources, com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        this.f8793f = (Resources) com.bumptech.glide.r.j.d(resources);
        this.f8794g = (com.bumptech.glide.load.engine.u) com.bumptech.glide.r.j.d(uVar);
    }

    public static com.bumptech.glide.load.engine.u<BitmapDrawable> f(Resources resources, com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new r(resources, uVar);
    }

    @Override // com.bumptech.glide.load.engine.q
    public void a() {
        com.bumptech.glide.load.engine.u<Bitmap> uVar = this.f8794g;
        if (uVar instanceof com.bumptech.glide.load.engine.q) {
            ((com.bumptech.glide.load.engine.q) uVar).a();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f8793f, this.f8794g.get());
    }

    @Override // com.bumptech.glide.load.engine.u
    public void c() {
        this.f8794g.c();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int d() {
        return this.f8794g.d();
    }

    @Override // com.bumptech.glide.load.engine.u
    public Class<BitmapDrawable> e() {
        return BitmapDrawable.class;
    }
}
