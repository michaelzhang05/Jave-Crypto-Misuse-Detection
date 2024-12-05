package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class U extends A {
    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2236s b(String str, V2 v22, List list) {
        if (str != null && !str.isEmpty() && v22.g(str)) {
            InterfaceC2236s c8 = v22.c(str);
            if (c8 instanceof AbstractC2192n) {
                return ((AbstractC2192n) c8).a(v22, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
