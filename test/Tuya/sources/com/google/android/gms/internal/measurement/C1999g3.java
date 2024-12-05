package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1999g3 extends AbstractC1981e3 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15715a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1999g3(Object obj) {
        this.f15715a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1981e3
    public final Object a() {
        return this.f15715a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1981e3
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1999g3) {
            return this.f15715a.equals(((C1999g3) obj).f15715a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15715a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f15715a.toString() + ")";
    }
}
