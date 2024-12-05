package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Stack;

/* loaded from: classes2.dex */
final class c00 implements f00 {
    private final byte[] a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final Stack<e00> f11185b = new Stack<>();

    /* renamed from: c, reason: collision with root package name */
    private final h00 f11186c = new h00();

    /* renamed from: d, reason: collision with root package name */
    private g00 f11187d;

    /* renamed from: e, reason: collision with root package name */
    private int f11188e;

    /* renamed from: f, reason: collision with root package name */
    private int f11189f;

    /* renamed from: g, reason: collision with root package name */
    private long f11190g;

    private final long d(zzie zzieVar, int i2) throws IOException, InterruptedException {
        zzieVar.readFully(this.a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.a[i3] & 255);
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.f00
    public final void a() {
        this.f11188e = 0;
        this.f11185b.clear();
        this.f11186c.a();
    }

    @Override // com.google.android.gms.internal.ads.f00
    public final void b(g00 g00Var) {
        this.f11187d = g00Var;
    }

    @Override // com.google.android.gms.internal.ads.f00
    public final boolean c(zzie zzieVar) throws IOException, InterruptedException {
        double longBitsToDouble;
        long j2;
        int i2;
        zzkh.d(this.f11187d != null);
        while (true) {
            if (!this.f11185b.isEmpty()) {
                long position = zzieVar.getPosition();
                j2 = this.f11185b.peek().f11330b;
                if (position >= j2) {
                    g00 g00Var = this.f11187d;
                    i2 = this.f11185b.pop().a;
                    g00Var.h(i2);
                    return true;
                }
            }
            if (this.f11188e == 0) {
                long b2 = this.f11186c.b(zzieVar, true, false);
                if (b2 == -1) {
                    return false;
                }
                this.f11189f = (int) b2;
                this.f11188e = 1;
            }
            if (this.f11188e == 1) {
                this.f11190g = this.f11186c.b(zzieVar, false, true);
                this.f11188e = 2;
            }
            int g2 = this.f11187d.g(this.f11189f);
            if (g2 != 0) {
                if (g2 == 1) {
                    long position2 = zzieVar.getPosition();
                    this.f11185b.add(new e00(this.f11189f, this.f11190g + position2));
                    this.f11187d.e(this.f11189f, position2, this.f11190g);
                    this.f11188e = 0;
                    return true;
                }
                if (g2 == 2) {
                    long j3 = this.f11190g;
                    if (j3 <= 8) {
                        this.f11187d.b(this.f11189f, d(zzieVar, (int) j3));
                        this.f11188e = 0;
                        return true;
                    }
                    long j4 = this.f11190g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j4);
                    throw new IllegalStateException(sb.toString());
                }
                if (g2 == 3) {
                    long j5 = this.f11190g;
                    if (j5 <= 2147483647L) {
                        g00 g00Var2 = this.f11187d;
                        int i3 = this.f11189f;
                        int i4 = (int) j5;
                        byte[] bArr = new byte[i4];
                        zzieVar.readFully(bArr, 0, i4);
                        g00Var2.f(i3, new String(bArr, Charset.forName("UTF-8")));
                        this.f11188e = 0;
                        return true;
                    }
                    long j6 = this.f11190g;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j6);
                    throw new IllegalStateException(sb2.toString());
                }
                if (g2 == 4) {
                    this.f11187d.i(this.f11189f, (int) this.f11190g, zzieVar);
                    this.f11188e = 0;
                    return true;
                }
                if (g2 == 5) {
                    long j7 = this.f11190g;
                    if (j7 != 4 && j7 != 8) {
                        long j8 = this.f11190g;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j8);
                        throw new IllegalStateException(sb3.toString());
                    }
                    g00 g00Var3 = this.f11187d;
                    int i5 = this.f11189f;
                    int i6 = (int) j7;
                    long d2 = d(zzieVar, i6);
                    if (i6 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) d2);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(d2);
                    }
                    g00Var3.d(i5, longBitsToDouble);
                    this.f11188e = 0;
                    return true;
                }
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append("Invalid element type ");
                sb4.append(g2);
                throw new IllegalStateException(sb4.toString());
            }
            zzieVar.a((int) this.f11190g);
            this.f11188e = 0;
        }
    }
}
