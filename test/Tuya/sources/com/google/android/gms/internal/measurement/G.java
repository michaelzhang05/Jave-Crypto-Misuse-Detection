package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class G implements I {

    /* renamed from: a, reason: collision with root package name */
    private final T1 f15329a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15330b;

    public G(T1 t12, String str) {
        this.f15329a = t12;
        this.f15330b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final T1 a(r rVar) {
        T1 a8 = this.f15329a.a();
        a8.f(this.f15330b, rVar);
        return a8;
    }
}
