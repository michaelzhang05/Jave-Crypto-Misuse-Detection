package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U5 {

    /* renamed from: c, reason: collision with root package name */
    private static final U5 f16348c = new U5();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f16350b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final X5 f16349a = new C2269v5();

    private U5() {
    }

    public static U5 a() {
        return f16348c;
    }

    public final Y5 b(Class cls) {
        AbstractC2111e5.f(cls, "messageType");
        Y5 y52 = (Y5) this.f16350b.get(cls);
        if (y52 == null) {
            Y5 a8 = this.f16349a.a(cls);
            AbstractC2111e5.f(cls, "messageType");
            AbstractC2111e5.f(a8, "schema");
            Y5 y53 = (Y5) this.f16350b.putIfAbsent(cls, a8);
            if (y53 != null) {
                return y53;
            }
            return a8;
        }
        return y52;
    }

    public final Y5 c(Object obj) {
        return b(obj.getClass());
    }
}
