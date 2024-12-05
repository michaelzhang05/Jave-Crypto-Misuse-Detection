package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class f10 implements zzlx {

    /* renamed from: b, reason: collision with root package name */
    private int f11379b;

    /* renamed from: c, reason: collision with root package name */
    private int f11380c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f11381d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11382e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f11383f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f11384g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f11385h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11386i;

    public f10() {
        ByteBuffer byteBuffer = zzlx.a;
        this.f11384g = byteBuffer;
        this.f11385h = byteBuffer;
        this.f11379b = -1;
        this.f11380c = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void a() {
        flush();
        this.f11384g = zzlx.a;
        this.f11379b = -1;
        this.f11380c = -1;
        this.f11383f = null;
        this.f11382e = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean b() {
        return this.f11382e;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void c() {
        this.f11386i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final ByteBuffer d() {
        ByteBuffer byteBuffer = this.f11385h;
        this.f11385h = zzlx.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final int e() {
        int[] iArr = this.f11383f;
        return iArr == null ? this.f11379b : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final int f() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void flush() {
        this.f11385h = zzlx.a;
        this.f11386i = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean g(int i2, int i3, int i4) throws zzly {
        boolean z = !Arrays.equals(this.f11381d, this.f11383f);
        int[] iArr = this.f11381d;
        this.f11383f = iArr;
        if (iArr == null) {
            this.f11382e = false;
            return z;
        }
        if (i4 == 2) {
            if (!z && this.f11380c == i2 && this.f11379b == i3) {
                return false;
            }
            this.f11380c = i2;
            this.f11379b = i3;
            this.f11382e = i3 != iArr.length;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f11383f;
                if (i5 >= iArr2.length) {
                    return true;
                }
                int i6 = iArr2[i5];
                if (i6 < i3) {
                    this.f11382e = (i6 != i5) | this.f11382e;
                    i5++;
                } else {
                    throw new zzly(i2, i3, i4);
                }
            }
        } else {
            throw new zzly(i2, i3, i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f11379b * 2)) * this.f11383f.length) << 1;
        if (this.f11384g.capacity() < length) {
            this.f11384g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f11384g.clear();
        }
        while (position < limit) {
            for (int i2 : this.f11383f) {
                this.f11384g.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.f11379b << 1;
        }
        byteBuffer.position(limit);
        this.f11384g.flip();
        this.f11385h = this.f11384g;
    }

    public final void i(int[] iArr) {
        this.f11381d = iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean q() {
        return this.f11386i && this.f11385h == zzlx.a;
    }
}
