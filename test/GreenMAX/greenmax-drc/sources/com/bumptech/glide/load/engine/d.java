package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
final class d implements com.bumptech.glide.load.f {

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.f f8506b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.f f8507c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.f fVar2) {
        this.f8506b = fVar;
        this.f8507c = fVar2;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8506b.equals(dVar.f8506b) && this.f8507c.equals(dVar.f8507c);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return (this.f8506b.hashCode() * 31) + this.f8507c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f8506b + ", signature=" + this.f8507c + '}';
    }

    @Override // com.bumptech.glide.load.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f8506b.updateDiskCacheKey(messageDigest);
        this.f8507c.updateDiskCacheKey(messageDigest);
    }
}
