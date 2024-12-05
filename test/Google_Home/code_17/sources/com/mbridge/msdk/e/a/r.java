package com.mbridge.msdk.e.a;

import com.mbridge.msdk.e.a.b;

/* loaded from: classes4.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f19909a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f19910b;

    /* renamed from: c, reason: collision with root package name */
    public final z f19911c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19912d;

    /* loaded from: classes4.dex */
    public interface a {
        void a(z zVar);
    }

    /* loaded from: classes4.dex */
    public interface b<T> {
        void a(T t8);
    }

    private r(T t8, b.a aVar) {
        this.f19912d = false;
        this.f19909a = t8;
        this.f19910b = aVar;
        this.f19911c = null;
    }

    public static <T> r<T> a(T t8, b.a aVar) {
        return new r<>(t8, aVar);
    }

    public static <T> r<T> a(z zVar) {
        return new r<>(zVar);
    }

    public final boolean a() {
        return this.f19911c == null;
    }

    private r(z zVar) {
        this.f19912d = false;
        this.f19909a = null;
        this.f19910b = null;
        this.f19911c = zVar;
    }
}
