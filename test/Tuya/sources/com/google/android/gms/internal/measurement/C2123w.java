package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2123w implements r {
    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return r.f15866c0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2123w;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
