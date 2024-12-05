package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class H implements I {

    /* renamed from: a, reason: collision with root package name */
    private final T1 f15338a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15339b;

    public H(T1 t12, String str) {
        this.f15338a = t12;
        this.f15339b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final T1 a(r rVar) {
        T1 a8 = this.f15338a.a();
        a8.e(this.f15339b, rVar);
        return a8;
    }
}
