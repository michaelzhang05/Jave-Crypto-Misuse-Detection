package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class d20 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f11270b;

    /* renamed from: c, reason: collision with root package name */
    public int f11271c;

    /* renamed from: d, reason: collision with root package name */
    public long f11272d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11273e;

    /* renamed from: f, reason: collision with root package name */
    private final zzst f11274f;

    /* renamed from: g, reason: collision with root package name */
    private final zzst f11275g;

    /* renamed from: h, reason: collision with root package name */
    private int f11276h;

    /* renamed from: i, reason: collision with root package name */
    private int f11277i;

    public d20(zzst zzstVar, zzst zzstVar2, boolean z) {
        this.f11275g = zzstVar;
        this.f11274f = zzstVar2;
        this.f11273e = z;
        zzstVar2.k(12);
        this.a = zzstVar2.s();
        zzstVar.k(12);
        this.f11277i = zzstVar.s();
        zzsk.f(zzstVar.d() == 1, "first_chunk must be 1");
        this.f11270b = -1;
    }

    public final boolean a() {
        int i2 = this.f11270b + 1;
        this.f11270b = i2;
        if (i2 == this.a) {
            return false;
        }
        this.f11272d = this.f11273e ? this.f11274f.t() : this.f11274f.q();
        if (this.f11270b == this.f11276h) {
            this.f11271c = this.f11275g.s();
            this.f11275g.l(4);
            int i3 = this.f11277i - 1;
            this.f11277i = i3;
            this.f11276h = i3 > 0 ? this.f11275g.s() - 1 : -1;
        }
        return true;
    }
}
