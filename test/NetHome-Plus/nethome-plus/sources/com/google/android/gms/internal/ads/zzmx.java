package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes2.dex */
public final class zzmx implements zzlx {

    /* renamed from: d, reason: collision with root package name */
    private j10 f15296d;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f15299g;

    /* renamed from: h, reason: collision with root package name */
    private ShortBuffer f15300h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f15301i;

    /* renamed from: j, reason: collision with root package name */
    private long f15302j;

    /* renamed from: k, reason: collision with root package name */
    private long f15303k;
    private boolean l;

    /* renamed from: e, reason: collision with root package name */
    private float f15297e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f15298f = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    private int f15294b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f15295c = -1;

    public zzmx() {
        ByteBuffer byteBuffer = zzlx.a;
        this.f15299g = byteBuffer;
        this.f15300h = byteBuffer.asShortBuffer();
        this.f15301i = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void a() {
        this.f15296d = null;
        ByteBuffer byteBuffer = zzlx.a;
        this.f15299g = byteBuffer;
        this.f15300h = byteBuffer.asShortBuffer();
        this.f15301i = byteBuffer;
        this.f15294b = -1;
        this.f15295c = -1;
        this.f15302j = 0L;
        this.f15303k = 0L;
        this.l = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean b() {
        return Math.abs(this.f15297e - 1.0f) >= 0.01f || Math.abs(this.f15298f - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void c() {
        this.f15296d.k();
        this.l = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final ByteBuffer d() {
        ByteBuffer byteBuffer = this.f15301i;
        this.f15301i = zzlx.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final int e() {
        return this.f15294b;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final int f() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void flush() {
        j10 j10Var = new j10(this.f15295c, this.f15294b);
        this.f15296d = j10Var;
        j10Var.a(this.f15297e);
        this.f15296d.c(this.f15298f);
        this.f15301i = zzlx.a;
        this.f15302j = 0L;
        this.f15303k = 0L;
        this.l = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean g(int i2, int i3, int i4) throws zzly {
        if (i4 == 2) {
            if (this.f15295c == i2 && this.f15294b == i3) {
                return false;
            }
            this.f15295c = i2;
            this.f15294b = i3;
            return true;
        }
        throw new zzly(i2, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f15302j += remaining;
            this.f15296d.e(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int l = (this.f15296d.l() * this.f15294b) << 1;
        if (l > 0) {
            if (this.f15299g.capacity() < l) {
                ByteBuffer order = ByteBuffer.allocateDirect(l).order(ByteOrder.nativeOrder());
                this.f15299g = order;
                this.f15300h = order.asShortBuffer();
            } else {
                this.f15299g.clear();
                this.f15300h.clear();
            }
            this.f15296d.i(this.f15300h);
            this.f15303k += l;
            this.f15299g.limit(l);
            this.f15301i = this.f15299g;
        }
    }

    public final float i(float f2) {
        float a = zzsy.a(f2, 0.1f, 8.0f);
        this.f15297e = a;
        return a;
    }

    public final float j(float f2) {
        this.f15298f = zzsy.a(f2, 0.1f, 8.0f);
        return f2;
    }

    public final long k() {
        return this.f15302j;
    }

    public final long l() {
        return this.f15303k;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean q() {
        if (!this.l) {
            return false;
        }
        j10 j10Var = this.f15296d;
        return j10Var == null || j10Var.l() == 0;
    }
}
