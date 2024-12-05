package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes4.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.b.a f20814a;

    /* renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.f.c f20815b;

    /* renamed from: c, reason: collision with root package name */
    public T f20816c;

    private k(T t8, com.mbridge.msdk.foundation.same.net.f.c cVar) {
        this.f20814a = null;
        this.f20816c = t8;
        this.f20815b = cVar;
    }

    public static <T> k<T> a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        return new k<>(aVar);
    }

    public static <T> k<T> a(T t8, com.mbridge.msdk.foundation.same.net.f.c cVar) {
        return new k<>(t8, cVar);
    }

    private k(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        this.f20815b = null;
        this.f20816c = null;
        this.f20814a = aVar;
    }
}
