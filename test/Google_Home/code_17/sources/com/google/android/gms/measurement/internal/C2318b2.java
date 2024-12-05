package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2318b2 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f17469g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f17470a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2311a2 f17471b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f17472c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f17473d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f17474e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f17475f;

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.f17473d) {
        }
        if (obj != null) {
            return obj;
        }
        if (Z1.f17431a == null) {
            return this.f17472c;
        }
        synchronized (f17469g) {
            try {
                if (C2329d.a()) {
                    if (this.f17475f == null) {
                        obj2 = this.f17472c;
                    } else {
                        obj2 = this.f17475f;
                    }
                    return obj2;
                }
                try {
                    for (C2318b2 c2318b2 : H.T0()) {
                        if (!C2329d.a()) {
                            Object obj3 = null;
                            try {
                                InterfaceC2311a2 interfaceC2311a2 = c2318b2.f17471b;
                                if (interfaceC2311a2 != null) {
                                    obj3 = interfaceC2311a2.w();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f17469g) {
                                c2318b2.f17475f = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC2311a2 interfaceC2311a22 = this.f17471b;
                if (interfaceC2311a22 == null) {
                    return this.f17472c;
                }
                try {
                    return interfaceC2311a22.w();
                } catch (IllegalStateException unused3) {
                    return this.f17472c;
                } catch (SecurityException unused4) {
                    return this.f17472c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f17470a;
    }

    private C2318b2(String str, Object obj, Object obj2, InterfaceC2311a2 interfaceC2311a2, boolean z8) {
        this.f17473d = new Object();
        this.f17474e = null;
        this.f17475f = null;
        this.f17470a = str;
        this.f17472c = obj;
        this.f17471b = interfaceC2311a2;
    }
}
