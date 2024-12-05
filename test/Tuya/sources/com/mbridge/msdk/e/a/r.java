package com.mbridge.msdk.e.a;

import com.mbridge.msdk.e.a.b;

/* loaded from: classes4.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f18854a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f18855b;

    /* renamed from: c, reason: collision with root package name */
    public final z f18856c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18857d;

    /* loaded from: classes4.dex */
    public interface a {
        void a(z zVar);
    }

    /* loaded from: classes4.dex */
    public interface b<T> {
        void a(T t8);
    }

    private r(T t8, b.a aVar) {
        this.f18857d = false;
        this.f18854a = t8;
        this.f18855b = aVar;
        this.f18856c = null;
    }

    public static <T> r<T> a(T t8, b.a aVar) {
        return new r<>(t8, aVar);
    }

    public static <T> r<T> a(z zVar) {
        return new r<>(zVar);
    }

    public final boolean a() {
        return this.f18856c == null;
    }

    private r(z zVar) {
        this.f18857d = false;
        this.f18854a = null;
        this.f18855b = null;
        this.f18856c = zVar;
    }
}
