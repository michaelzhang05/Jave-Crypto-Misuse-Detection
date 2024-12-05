package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c2 {
    private static final c2 a = new c2();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, e2<?>> f15940c = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final f2 f15939b = new m1();

    private c2() {
    }

    public static c2 c() {
        return a;
    }

    public final <T> e2<T> a(T t) {
        return b(t.getClass());
    }

    public final <T> e2<T> b(Class<T> cls) {
        zzuq.d(cls, "messageType");
        e2<T> e2Var = (e2) this.f15940c.get(cls);
        if (e2Var != null) {
            return e2Var;
        }
        e2<T> a2 = this.f15939b.a(cls);
        zzuq.d(cls, "messageType");
        zzuq.d(a2, "schema");
        e2<T> e2Var2 = (e2) this.f15940c.putIfAbsent(cls, a2);
        return e2Var2 != null ? e2Var2 : a2;
    }
}
