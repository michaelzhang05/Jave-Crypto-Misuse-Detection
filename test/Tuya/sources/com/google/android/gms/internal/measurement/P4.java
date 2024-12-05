package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class P4 implements W4 {

    /* renamed from: a, reason: collision with root package name */
    private final W4[] f15488a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P4(W4... w4Arr) {
        this.f15488a = w4Arr;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final V4 a(Class cls) {
        W4[] w4Arr = this.f15488a;
        for (int i8 = 0; i8 < 2; i8++) {
            W4 w42 = w4Arr[i8];
            if (w42.b(cls)) {
                return w42.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final boolean b(Class cls) {
        W4[] w4Arr = this.f15488a;
        for (int i8 = 0; i8 < 2; i8++) {
            if (w4Arr[i8].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
