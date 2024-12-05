package com.bumptech.glide.load.o.g;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.l;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes.dex */
public class f implements l<c> {

    /* renamed from: b, reason: collision with root package name */
    private final l<Bitmap> f8831b;

    public f(l<Bitmap> lVar) {
        this.f8831b = (l) com.bumptech.glide.r.j.d(lVar);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f8831b.equals(((f) obj).f8831b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f8831b.hashCode();
    }

    @Override // com.bumptech.glide.load.l
    public u<c> transform(Context context, u<c> uVar, int i2, int i3) {
        c cVar = uVar.get();
        u<Bitmap> dVar = new com.bumptech.glide.load.o.c.d(cVar.e(), com.bumptech.glide.c.c(context).f());
        u<Bitmap> transform = this.f8831b.transform(context, dVar, i2, i3);
        if (!dVar.equals(transform)) {
            dVar.c();
        }
        cVar.m(this.f8831b, transform.get());
        return uVar;
    }

    @Override // com.bumptech.glide.load.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f8831b.updateDiskCacheKey(messageDigest);
    }
}
