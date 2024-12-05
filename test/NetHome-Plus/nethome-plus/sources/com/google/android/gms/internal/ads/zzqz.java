package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzqz extends zzlr {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f15449b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f15450c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15451d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15452e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15453f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15454g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15455h;

    public zzqz(long j2, boolean z) {
        this(j2, j2, 0L, 0L, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzlt c(int i2, zzlt zzltVar, boolean z) {
        zzsk.g(i2, 0, 1);
        Object obj = z ? f15449b : null;
        return zzltVar.a(obj, obj, 0, this.f15450c, 0L, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzlu e(int i2, zzlu zzluVar, boolean z, long j2) {
        zzsk.g(i2, 0, 1);
        boolean z2 = this.f15454g;
        long j3 = this.f15451d;
        zzluVar.a = null;
        zzluVar.f15263b = -9223372036854775807L;
        zzluVar.f15264c = -9223372036854775807L;
        zzluVar.f15265d = z2;
        zzluVar.f15266e = false;
        zzluVar.f15269h = 0L;
        zzluVar.f15270i = j3;
        zzluVar.f15267f = 0;
        zzluVar.f15268g = 0;
        zzluVar.f15271j = 0L;
        return zzluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final int f(Object obj) {
        return f15449b.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final int g() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final int h() {
        return 1;
    }

    private zzqz(long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.f15450c = j2;
        this.f15451d = j3;
        this.f15452e = 0L;
        this.f15453f = 0L;
        this.f15454g = z;
        this.f15455h = false;
    }
}
