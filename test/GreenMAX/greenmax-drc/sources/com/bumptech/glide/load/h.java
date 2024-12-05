package com.bumptech.glide.load;

import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class h<T> {
    private static final b<Object> a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final T f8662b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f8663c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8664d;

    /* renamed from: e, reason: collision with root package name */
    private volatile byte[] f8665e;

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private h(String str, T t, b<T> bVar) {
        this.f8664d = com.bumptech.glide.r.j.b(str);
        this.f8662b = t;
        this.f8663c = (b) com.bumptech.glide.r.j.d(bVar);
    }

    public static <T> h<T> a(String str, T t, b<T> bVar) {
        return new h<>(str, t, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) a;
    }

    private byte[] d() {
        if (this.f8665e == null) {
            this.f8665e = this.f8664d.getBytes(f.a);
        }
        return this.f8665e;
    }

    public static <T> h<T> e(String str) {
        return new h<>(str, null, b());
    }

    public static <T> h<T> f(String str, T t) {
        return new h<>(str, t, b());
    }

    public T c() {
        return this.f8662b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f8664d.equals(((h) obj).f8664d);
        }
        return false;
    }

    public void g(T t, MessageDigest messageDigest) {
        this.f8663c.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f8664d.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f8664d + "'}";
    }
}
