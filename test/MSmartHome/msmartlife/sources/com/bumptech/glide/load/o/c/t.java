package com.bumptech.glide.load.o.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes.dex */
public class t implements com.bumptech.glide.load.j<Uri, Bitmap> {
    private final com.bumptech.glide.load.o.e.e a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.z.e f8801b;

    public t(com.bumptech.glide.load.o.e.e eVar, com.bumptech.glide.load.engine.z.e eVar2) {
        this.a = eVar;
        this.f8801b = eVar2;
    }

    @Override // com.bumptech.glide.load.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(Uri uri, int i2, int i3, com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.load.engine.u<Drawable> b2 = this.a.b(uri, i2, i3, iVar);
        if (b2 == null) {
            return null;
        }
        return m.a(this.f8801b, b2.get(), i2, i3);
    }

    @Override // com.bumptech.glide.load.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, com.bumptech.glide.load.i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
