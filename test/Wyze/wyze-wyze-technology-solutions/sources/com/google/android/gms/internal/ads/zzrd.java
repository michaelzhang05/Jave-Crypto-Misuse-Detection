package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class zzrd implements zzrm {
    private final zzra a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15468b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f15469c;

    /* renamed from: d, reason: collision with root package name */
    private final zzlh[] f15470d;

    /* renamed from: e, reason: collision with root package name */
    private final long[] f15471e;

    /* renamed from: f, reason: collision with root package name */
    private int f15472f;

    public zzrd(zzra zzraVar, int... iArr) {
        int i2 = 0;
        zzsk.e(iArr.length > 0);
        this.a = (zzra) zzsk.d(zzraVar);
        int length = iArr.length;
        this.f15468b = length;
        this.f15470d = new zzlh[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f15470d[i3] = zzraVar.a(iArr[i3]);
        }
        Arrays.sort(this.f15470d, new l30());
        this.f15469c = new int[this.f15468b];
        while (true) {
            int i4 = this.f15468b;
            if (i2 < i4) {
                this.f15469c[i2] = zzraVar.b(this.f15470d[i2]);
                i2++;
            } else {
                this.f15471e = new long[i4];
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final zzra a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final int b(int i2) {
        return this.f15469c[0];
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final zzlh c(int i2) {
        return this.f15470d[i2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzrd zzrdVar = (zzrd) obj;
            if (this.a == zzrdVar.a && Arrays.equals(this.f15469c, zzrdVar.f15469c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f15472f == 0) {
            this.f15472f = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.f15469c);
        }
        return this.f15472f;
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final int length() {
        return this.f15469c.length;
    }
}
