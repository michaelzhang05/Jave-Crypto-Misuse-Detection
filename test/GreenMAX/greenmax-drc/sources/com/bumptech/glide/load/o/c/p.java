package com.bumptech.glide.load.o.c;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: FitCenter.java */
/* loaded from: classes.dex */
public class p extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8789b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(com.bumptech.glide.load.f.a);

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return obj instanceof p;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.o.c.e
    protected Bitmap transform(com.bumptech.glide.load.engine.z.e eVar, Bitmap bitmap, int i2, int i3) {
        return w.f(eVar, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f8789b);
    }
}
