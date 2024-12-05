package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1995g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15714a;

    public C1995g(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f15714a = booleanValue;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C1995g(Boolean.valueOf(this.f15714a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1995g) && this.f15714a == ((C1995g) obj).f15714a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        double d8;
        if (true != this.f15714a) {
            d8 = 0.0d;
        } else {
            d8 = 1.0d;
        }
        return Double.valueOf(d8);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return Boolean.toString(this.f15714a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        return Boolean.valueOf(this.f15714a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f15714a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        if ("toString".equals(str)) {
            return new C2115v(Boolean.toString(this.f15714a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f15714a), str));
    }

    public final String toString() {
        return String.valueOf(this.f15714a);
    }
}
