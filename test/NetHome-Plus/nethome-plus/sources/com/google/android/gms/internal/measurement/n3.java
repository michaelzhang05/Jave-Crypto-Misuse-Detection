package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class n3 {
    final int a;

    /* renamed from: b, reason: collision with root package name */
    final byte[] f16001b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.a == n3Var.a && Arrays.equals(this.f16001b, n3Var.f16001b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.f16001b);
    }
}
