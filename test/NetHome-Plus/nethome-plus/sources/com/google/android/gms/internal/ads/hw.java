package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class hw {
    private static final hw a = new hw();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, mw<?>> f11546c = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final nw f11545b = new qv();

    private hw() {
    }

    public static hw b() {
        return a;
    }

    public final <T> mw<T> a(T t) {
        return c(t.getClass());
    }

    public final <T> mw<T> c(Class<T> cls) {
        zzdod.d(cls, "messageType");
        mw<T> mwVar = (mw) this.f11546c.get(cls);
        if (mwVar != null) {
            return mwVar;
        }
        mw<T> a2 = this.f11545b.a(cls);
        zzdod.d(cls, "messageType");
        zzdod.d(a2, "schema");
        mw<T> mwVar2 = (mw) this.f11546c.putIfAbsent(cls, a2);
        return mwVar2 != null ? mwVar2 : a2;
    }
}
