package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2048m3 implements Serializable, InterfaceC2016i3 {

    /* renamed from: a, reason: collision with root package name */
    final Object f15763a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2048m3(Object obj) {
        this.f15763a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2016i3
    public final Object a() {
        return this.f15763a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2048m3) {
            return AbstractC1972d3.a(this.f15763a, ((C2048m3) obj).f15763a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15763a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f15763a.toString() + ")";
    }
}
