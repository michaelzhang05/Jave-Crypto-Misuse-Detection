package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2135h implements InterfaceC2236s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16655a;

    public C2135h(Boolean bool) {
        if (bool == null) {
            this.f16655a = false;
        } else {
            this.f16655a = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final String A() {
        return Boolean.toString(this.f16655a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Iterator B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s C(String str, V2 v22, List list) {
        if ("toString".equals(str)) {
            return new C2254u(Boolean.toString(this.f16655a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f16655a), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s b() {
        return new C2135h(Boolean.valueOf(this.f16655a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2135h) && this.f16655a == ((C2135h) obj).f16655a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f16655a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f16655a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Boolean y() {
        return Boolean.valueOf(this.f16655a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Double z() {
        double d8;
        if (this.f16655a) {
            d8 = 1.0d;
        } else {
            d8 = 0.0d;
        }
        return Double.valueOf(d8);
    }
}
