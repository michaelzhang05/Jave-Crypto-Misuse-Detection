package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class M extends AbstractC2139y {
    @Override // com.google.android.gms.internal.measurement.AbstractC2139y
    public final r a(String str, T1 t12, List list) {
        if (str != null && !str.isEmpty() && t12.h(str)) {
            r d8 = t12.d(str);
            if (d8 instanceof AbstractC2028k) {
                return ((AbstractC2028k) d8).b(t12, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
