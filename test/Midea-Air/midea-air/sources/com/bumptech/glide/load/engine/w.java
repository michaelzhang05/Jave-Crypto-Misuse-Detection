package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
final class w implements com.bumptech.glide.load.f {

    /* renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.r.g<Class<?>, byte[]> f8611b = new com.bumptech.glide.r.g<>(50);

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.z.b f8612c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.f f8613d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.f f8614e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8615f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8616g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f8617h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.i f8618i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.l<?> f8619j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(com.bumptech.glide.load.engine.z.b bVar, com.bumptech.glide.load.f fVar, com.bumptech.glide.load.f fVar2, int i2, int i3, com.bumptech.glide.load.l<?> lVar, Class<?> cls, com.bumptech.glide.load.i iVar) {
        this.f8612c = bVar;
        this.f8613d = fVar;
        this.f8614e = fVar2;
        this.f8615f = i2;
        this.f8616g = i3;
        this.f8619j = lVar;
        this.f8617h = cls;
        this.f8618i = iVar;
    }

    private byte[] a() {
        com.bumptech.glide.r.g<Class<?>, byte[]> gVar = f8611b;
        byte[] g2 = gVar.g(this.f8617h);
        if (g2 != null) {
            return g2;
        }
        byte[] bytes = this.f8617h.getName().getBytes(com.bumptech.glide.load.f.a);
        gVar.k(this.f8617h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f8616g == wVar.f8616g && this.f8615f == wVar.f8615f && com.bumptech.glide.r.k.d(this.f8619j, wVar.f8619j) && this.f8617h.equals(wVar.f8617h) && this.f8613d.equals(wVar.f8613d) && this.f8614e.equals(wVar.f8614e) && this.f8618i.equals(wVar.f8618i);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        int hashCode = (((((this.f8613d.hashCode() * 31) + this.f8614e.hashCode()) * 31) + this.f8615f) * 31) + this.f8616g;
        com.bumptech.glide.load.l<?> lVar = this.f8619j;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f8617h.hashCode()) * 31) + this.f8618i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f8613d + ", signature=" + this.f8614e + ", width=" + this.f8615f + ", height=" + this.f8616g + ", decodedResourceClass=" + this.f8617h + ", transformation='" + this.f8619j + "', options=" + this.f8618i + '}';
    }

    @Override // com.bumptech.glide.load.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f8612c.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f8615f).putInt(this.f8616g).array();
        this.f8614e.updateDiskCacheKey(messageDigest);
        this.f8613d.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.l<?> lVar = this.f8619j;
        if (lVar != null) {
            lVar.updateDiskCacheKey(messageDigest);
        }
        this.f8618i.updateDiskCacheKey(messageDigest);
        messageDigest.update(a());
        this.f8612c.d(bArr);
    }
}
