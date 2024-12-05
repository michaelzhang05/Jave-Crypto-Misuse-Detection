package com.bumptech.glide.load.o.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: classes.dex */
public class b implements com.bumptech.glide.load.k<BitmapDrawable> {
    private final com.bumptech.glide.load.engine.z.e a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.k<Bitmap> f8758b;

    public b(com.bumptech.glide.load.engine.z.e eVar, com.bumptech.glide.load.k<Bitmap> kVar) {
        this.a = eVar;
        this.f8758b = kVar;
    }

    @Override // com.bumptech.glide.load.k
    public com.bumptech.glide.load.c b(com.bumptech.glide.load.i iVar) {
        return this.f8758b.b(iVar);
    }

    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(com.bumptech.glide.load.engine.u<BitmapDrawable> uVar, File file, com.bumptech.glide.load.i iVar) {
        return this.f8758b.a(new d(uVar.get().getBitmap(), this.a), file, iVar);
    }
}
