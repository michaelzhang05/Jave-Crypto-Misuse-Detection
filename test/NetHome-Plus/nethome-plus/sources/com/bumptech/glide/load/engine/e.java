package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.a0.a;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* loaded from: classes.dex */
class e<DataType> implements a.b {
    private final com.bumptech.glide.load.d<DataType> a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f8508b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i f8509c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(com.bumptech.glide.load.d<DataType> dVar, DataType datatype, com.bumptech.glide.load.i iVar) {
        this.a = dVar;
        this.f8508b = datatype;
        this.f8509c = iVar;
    }

    @Override // com.bumptech.glide.load.engine.a0.a.b
    public boolean a(File file) {
        return this.a.a(this.f8508b, file, this.f8509c);
    }
}
