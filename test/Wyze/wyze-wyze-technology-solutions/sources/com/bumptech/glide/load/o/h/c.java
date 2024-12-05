package com.bumptech.glide.load.o.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {
    private final com.bumptech.glide.load.engine.z.e a;

    /* renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f8851b;

    /* renamed from: c, reason: collision with root package name */
    private final e<com.bumptech.glide.load.o.g.c, byte[]> f8852c;

    public c(com.bumptech.glide.load.engine.z.e eVar, e<Bitmap, byte[]> eVar2, e<com.bumptech.glide.load.o.g.c, byte[]> eVar3) {
        this.a = eVar;
        this.f8851b = eVar2;
        this.f8852c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static u<com.bumptech.glide.load.o.g.c> b(u<Drawable> uVar) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.o.h.e
    public u<byte[]> a(u<Drawable> uVar, i iVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f8851b.a(com.bumptech.glide.load.o.c.d.f(((BitmapDrawable) drawable).getBitmap(), this.a), iVar);
        }
        if (drawable instanceof com.bumptech.glide.load.o.g.c) {
            return this.f8852c.a(b(uVar), iVar);
        }
        return null;
    }
}
