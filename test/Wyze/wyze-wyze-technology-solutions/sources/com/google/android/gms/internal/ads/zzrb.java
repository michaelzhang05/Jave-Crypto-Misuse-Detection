package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzrb {
    public static final zzrb a = new zzrb(new zzra[0]);

    /* renamed from: b, reason: collision with root package name */
    public final int f15464b;

    /* renamed from: c, reason: collision with root package name */
    private final zzra[] f15465c;

    /* renamed from: d, reason: collision with root package name */
    private int f15466d;

    public zzrb(zzra... zzraVarArr) {
        this.f15465c = zzraVarArr;
        this.f15464b = zzraVarArr.length;
    }

    public final int a(zzra zzraVar) {
        for (int i2 = 0; i2 < this.f15464b; i2++) {
            if (this.f15465c[i2] == zzraVar) {
                return i2;
            }
        }
        return -1;
    }

    public final zzra b(int i2) {
        return this.f15465c[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzrb.class == obj.getClass()) {
            zzrb zzrbVar = (zzrb) obj;
            if (this.f15464b == zzrbVar.f15464b && Arrays.equals(this.f15465c, zzrbVar.f15465c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f15466d == 0) {
            this.f15466d = Arrays.hashCode(this.f15465c);
        }
        return this.f15466d;
    }
}
