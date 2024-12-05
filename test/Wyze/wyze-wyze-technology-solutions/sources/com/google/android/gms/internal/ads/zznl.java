package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zznl implements zznu {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f15336b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f15337c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f15338d;

    /* renamed from: e, reason: collision with root package name */
    private final long[] f15339e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15340f;

    public zznl(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f15336b = iArr;
        this.f15337c = jArr;
        this.f15338d = jArr2;
        this.f15339e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f15340f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f15340f = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final long b(long j2) {
        return this.f15337c[zzsy.b(this.f15339e, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final long f() {
        return this.f15340f;
    }
}
