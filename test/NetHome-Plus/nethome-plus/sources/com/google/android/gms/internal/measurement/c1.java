package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;

/* loaded from: classes2.dex */
final class c1 implements u1 {
    private static final c1 a = new c1();

    private c1() {
    }

    public static c1 c() {
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final t1 a(Class<?> cls) {
        if (!zzuo.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (t1) zzuo.k(cls.asSubclass(zzuo.class)).h(zzuo.zze.f16128c, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final boolean b(Class<?> cls) {
        return zzuo.class.isAssignableFrom(cls);
    }
}
