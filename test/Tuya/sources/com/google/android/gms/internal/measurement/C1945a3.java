package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1945a3 extends AbstractC1981e3 {

    /* renamed from: a, reason: collision with root package name */
    static final C1945a3 f15639a = new C1945a3();

    private C1945a3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1981e3
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1981e3
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
