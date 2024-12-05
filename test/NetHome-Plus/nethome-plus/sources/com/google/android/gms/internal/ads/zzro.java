package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzro {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    private final zzrm[] f15497b;

    /* renamed from: c, reason: collision with root package name */
    private int f15498c;

    public zzro(zzrm... zzrmVarArr) {
        this.f15497b = zzrmVarArr;
        this.a = zzrmVarArr.length;
    }

    public final zzrm a(int i2) {
        return this.f15497b[i2];
    }

    public final zzrm[] b() {
        return (zzrm[]) this.f15497b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzro.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f15497b, ((zzro) obj).f15497b);
    }

    public final int hashCode() {
        if (this.f15498c == 0) {
            this.f15498c = Arrays.hashCode(this.f15497b) + 527;
        }
        return this.f15498c;
    }
}
