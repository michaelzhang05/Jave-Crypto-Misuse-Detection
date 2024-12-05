package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r0 extends zztq {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f16019d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16020e;

    /* renamed from: f, reason: collision with root package name */
    private int f16021f;

    /* renamed from: g, reason: collision with root package name */
    private int f16022g;

    /* renamed from: h, reason: collision with root package name */
    private int f16023h;

    /* renamed from: i, reason: collision with root package name */
    private int f16024i;

    /* renamed from: j, reason: collision with root package name */
    private int f16025j;

    private r0(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.f16025j = Integer.MAX_VALUE;
        this.f16019d = bArr;
        this.f16021f = i3 + i2;
        this.f16023h = i2;
        this.f16024i = i2;
        this.f16020e = z;
    }

    private final void d() {
        int i2 = this.f16021f + this.f16022g;
        this.f16021f = i2;
        int i3 = i2 - this.f16024i;
        int i4 = this.f16025j;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f16022g = i5;
            this.f16021f = i2 - i5;
            return;
        }
        this.f16022g = 0;
    }

    @Override // com.google.android.gms.internal.measurement.zztq
    public final int b(int i2) throws zzuv {
        if (i2 >= 0) {
            int c2 = i2 + c();
            int i3 = this.f16025j;
            if (c2 <= i3) {
                this.f16025j = c2;
                d();
                return i3;
            }
            throw zzuv.a();
        }
        throw zzuv.b();
    }

    @Override // com.google.android.gms.internal.measurement.zztq
    public final int c() {
        return this.f16023h - this.f16024i;
    }
}
