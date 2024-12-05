package com.bumptech.glide.r;

/* compiled from: MultiClassKey.java */
/* loaded from: classes.dex */
public class i {
    private Class<?> a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f8961b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f8962c;

    public i() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.f8961b = cls2;
        this.f8962c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.f8961b.equals(iVar.f8961b) && k.d(this.f8962c, iVar.f8962c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.f8961b.hashCode()) * 31;
        Class<?> cls = this.f8962c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.f8961b + '}';
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
