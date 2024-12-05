package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzia implements zzio {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f15122b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f15123c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f15124d;

    /* renamed from: e, reason: collision with root package name */
    private final long[] f15125e;

    public zzia(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = iArr.length;
        this.f15122b = iArr;
        this.f15123c = jArr;
        this.f15124d = jArr2;
        this.f15125e = jArr3;
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final long b(long j2) {
        return this.f15123c[zzkq.a(this.f15125e, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final boolean c() {
        return true;
    }
}
