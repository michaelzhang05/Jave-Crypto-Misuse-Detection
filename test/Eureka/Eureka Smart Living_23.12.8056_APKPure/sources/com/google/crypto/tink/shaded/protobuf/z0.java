package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    private static final z0 f5713c = new z0();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f5715b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final e1 f5714a = new g0();

    private z0() {
    }

    public static z0 a() {
        return f5713c;
    }

    public d1 b(Class cls, d1 d1Var) {
        z.b(cls, "messageType");
        z.b(d1Var, "schema");
        return (d1) this.f5715b.putIfAbsent(cls, d1Var);
    }

    public d1 c(Class cls) {
        z.b(cls, "messageType");
        d1 d1Var = (d1) this.f5715b.get(cls);
        if (d1Var != null) {
            return d1Var;
        }
        d1 a6 = this.f5714a.a(cls);
        d1 b6 = b(cls, a6);
        return b6 != null ? b6 : a6;
    }

    public d1 d(Object obj) {
        return c(obj.getClass());
    }
}
