package com.bumptech.glide.load.o;

import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.r.j;

/* compiled from: SimpleResource.java */
/* loaded from: classes.dex */
public class a<T> implements u<T> {

    /* renamed from: f, reason: collision with root package name */
    protected final T f8755f;

    public a(T t) {
        this.f8755f = (T) j.d(t);
    }

    @Override // com.bumptech.glide.load.engine.u
    public void c() {
    }

    @Override // com.bumptech.glide.load.engine.u
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.u
    public Class<T> e() {
        return (Class<T>) this.f8755f.getClass();
    }

    @Override // com.bumptech.glide.load.engine.u
    public final T get() {
        return this.f8755f;
    }
}
