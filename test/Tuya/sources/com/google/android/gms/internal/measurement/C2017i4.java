package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2017i4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15731a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15732b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2017i4(Object obj, int i8) {
        this.f15731a = obj;
        this.f15732b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2017i4)) {
            return false;
        }
        C2017i4 c2017i4 = (C2017i4) obj;
        if (this.f15731a != c2017i4.f15731a || this.f15732b != c2017i4.f15732b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15731a) * 65535) + this.f15732b;
    }
}
