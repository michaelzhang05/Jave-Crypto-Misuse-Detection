package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2081q4 implements W4 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2081q4 f15857a = new C2081q4();

    private C2081q4() {
    }

    public static C2081q4 c() {
        return f15857a;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final V4 a(Class cls) {
        if (AbstractC2112u4.class.isAssignableFrom(cls)) {
            try {
                return (V4) AbstractC2112u4.k(cls.asSubclass(AbstractC2112u4.class)).A(3, null, null);
            } catch (Exception e8) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final boolean b(Class cls) {
        return AbstractC2112u4.class.isAssignableFrom(cls);
    }
}
