package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes4.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.b.a f19759a;

    /* renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.f.c f19760b;

    /* renamed from: c, reason: collision with root package name */
    public T f19761c;

    private k(T t8, com.mbridge.msdk.foundation.same.net.f.c cVar) {
        this.f19759a = null;
        this.f19761c = t8;
        this.f19760b = cVar;
    }

    public static <T> k<T> a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        return new k<>(aVar);
    }

    public static <T> k<T> a(T t8, com.mbridge.msdk.foundation.same.net.f.c cVar) {
        return new k<>(t8, cVar);
    }

    private k(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        this.f19760b = null;
        this.f19761c = null;
        this.f19759a = aVar;
    }
}
