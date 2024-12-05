package com.bumptech.glide.load;

import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    private final c.e.a<h<?>, Object> f8666b = new com.bumptech.glide.r.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void d(h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.g(obj, messageDigest);
    }

    public <T> T a(h<T> hVar) {
        return this.f8666b.containsKey(hVar) ? (T) this.f8666b.get(hVar) : hVar.c();
    }

    public void b(i iVar) {
        this.f8666b.j(iVar.f8666b);
    }

    public <T> i c(h<T> hVar, T t) {
        this.f8666b.put(hVar, t);
        return this;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f8666b.equals(((i) obj).f8666b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f8666b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f8666b + '}';
    }

    @Override // com.bumptech.glide.load.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i2 = 0; i2 < this.f8666b.size(); i2++) {
            d(this.f8666b.i(i2), this.f8666b.m(i2), messageDigest);
        }
    }
}
