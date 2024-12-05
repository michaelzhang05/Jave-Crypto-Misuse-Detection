package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2287x5 implements F5 {

    /* renamed from: a, reason: collision with root package name */
    private F5[] f16896a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2287x5(F5... f5Arr) {
        this.f16896a = f5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final G5 a(Class cls) {
        for (F5 f52 : this.f16896a) {
            if (f52.b(cls)) {
                return f52.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final boolean b(Class cls) {
        for (F5 f52 : this.f16896a) {
            if (f52.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
