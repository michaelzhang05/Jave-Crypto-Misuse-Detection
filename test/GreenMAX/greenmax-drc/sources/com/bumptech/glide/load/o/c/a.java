package com.bumptech.glide.load.o.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes.dex */
public class a<DataType> implements com.bumptech.glide.load.j<DataType, BitmapDrawable> {
    private final com.bumptech.glide.load.j<DataType, Bitmap> a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f8757b;

    public a(Resources resources, com.bumptech.glide.load.j<DataType, Bitmap> jVar) {
        this.f8757b = (Resources) com.bumptech.glide.r.j.d(resources);
        this.a = (com.bumptech.glide.load.j) com.bumptech.glide.r.j.d(jVar);
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(DataType datatype, com.bumptech.glide.load.i iVar) throws IOException {
        return this.a.a(datatype, iVar);
    }

    @Override // com.bumptech.glide.load.j
    public com.bumptech.glide.load.engine.u<BitmapDrawable> b(DataType datatype, int i2, int i3, com.bumptech.glide.load.i iVar) throws IOException {
        return r.f(this.f8757b, this.a.b(datatype, i2, i3, iVar));
    }
}
