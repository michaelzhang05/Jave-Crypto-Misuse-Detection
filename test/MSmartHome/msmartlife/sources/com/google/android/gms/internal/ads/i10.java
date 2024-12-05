package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class i10 implements zzlx {

    /* renamed from: b, reason: collision with root package name */
    private int f11561b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f11562c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f11563d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f11564e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f11565f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11566g;

    public i10() {
        ByteBuffer byteBuffer = zzlx.a;
        this.f11564e = byteBuffer;
        this.f11565f = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void a() {
        flush();
        this.f11564e = zzlx.a;
        this.f11561b = -1;
        this.f11562c = -1;
        this.f11563d = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean b() {
        int i2 = this.f11563d;
        return (i2 == 0 || i2 == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void c() {
        this.f11566g = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final ByteBuffer d() {
        ByteBuffer byteBuffer = this.f11565f;
        this.f11565f = zzlx.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final int e() {
        return this.f11562c;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final int f() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void flush() {
        this.f11565f = zzlx.a;
        this.f11566g = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean g(int i2, int i3, int i4) throws zzly {
        if (i4 != 3 && i4 != 2 && i4 != Integer.MIN_VALUE && i4 != 1073741824) {
            throw new zzly(i2, i3, i4);
        }
        if (this.f11561b == i2 && this.f11562c == i3 && this.f11563d == i4) {
            return false;
        }
        this.f11561b = i2;
        this.f11562c = i3;
        this.f11563d = i4;
        if (i4 != 2) {
            return true;
        }
        this.f11564e = zzlx.a;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[ADDED_TO_REGION, LOOP:2: B:24:0x0081->B:25:0x0083, LOOP_START, PHI: r0
      0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0041, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.google.android.gms.internal.ads.zzlx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f11563d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 << 1
        L23:
            java.nio.ByteBuffer r3 = r7.f11564e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f11564e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.f11564e
            r2.clear()
        L3f:
            int r2 = r7.f11563d
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f11564e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11564e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f11564e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11564e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f11564e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11564e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f11564e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f11564e
            r7.f11565f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i10.h(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final boolean q() {
        return this.f11566g && this.f11565f == zzlx.a;
    }
}
