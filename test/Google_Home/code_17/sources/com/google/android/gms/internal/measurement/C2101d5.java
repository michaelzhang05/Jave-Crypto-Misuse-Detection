package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2101d5 implements F5 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2101d5 f16604a = new C2101d5();

    private C2101d5() {
    }

    public static C2101d5 c() {
        return f16604a;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final G5 a(Class cls) {
        if (AbstractC2091c5.class.isAssignableFrom(cls)) {
            try {
                return (G5) AbstractC2091c5.l(cls.asSubclass(AbstractC2091c5.class)).o(AbstractC2091c5.c.f16587c, null, null);
            } catch (Exception e8) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e8);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final boolean b(Class cls) {
        return AbstractC2091c5.class.isAssignableFrom(cls);
    }
}
