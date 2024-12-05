package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
class n implements com.bumptech.glide.load.f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f8581b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8582c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8583d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f8584e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f8585f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.f f8586g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.l<?>> f8587h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.i f8588i;

    /* renamed from: j, reason: collision with root package name */
    private int f8589j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Object obj, com.bumptech.glide.load.f fVar, int i2, int i3, Map<Class<?>, com.bumptech.glide.load.l<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.i iVar) {
        this.f8581b = com.bumptech.glide.r.j.d(obj);
        this.f8586g = (com.bumptech.glide.load.f) com.bumptech.glide.r.j.e(fVar, "Signature must not be null");
        this.f8582c = i2;
        this.f8583d = i3;
        this.f8587h = (Map) com.bumptech.glide.r.j.d(map);
        this.f8584e = (Class) com.bumptech.glide.r.j.e(cls, "Resource class must not be null");
        this.f8585f = (Class) com.bumptech.glide.r.j.e(cls2, "Transcode class must not be null");
        this.f8588i = (com.bumptech.glide.load.i) com.bumptech.glide.r.j.d(iVar);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f8581b.equals(nVar.f8581b) && this.f8586g.equals(nVar.f8586g) && this.f8583d == nVar.f8583d && this.f8582c == nVar.f8582c && this.f8587h.equals(nVar.f8587h) && this.f8584e.equals(nVar.f8584e) && this.f8585f.equals(nVar.f8585f) && this.f8588i.equals(nVar.f8588i);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        if (this.f8589j == 0) {
            int hashCode = this.f8581b.hashCode();
            this.f8589j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f8586g.hashCode();
            this.f8589j = hashCode2;
            int i2 = (hashCode2 * 31) + this.f8582c;
            this.f8589j = i2;
            int i3 = (i2 * 31) + this.f8583d;
            this.f8589j = i3;
            int hashCode3 = (i3 * 31) + this.f8587h.hashCode();
            this.f8589j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f8584e.hashCode();
            this.f8589j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f8585f.hashCode();
            this.f8589j = hashCode5;
            this.f8589j = (hashCode5 * 31) + this.f8588i.hashCode();
        }
        return this.f8589j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f8581b + ", width=" + this.f8582c + ", height=" + this.f8583d + ", resourceClass=" + this.f8584e + ", transcodeClass=" + this.f8585f + ", signature=" + this.f8586g + ", hashCode=" + this.f8589j + ", transformations=" + this.f8587h + ", options=" + this.f8588i + '}';
    }

    @Override // com.bumptech.glide.load.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
