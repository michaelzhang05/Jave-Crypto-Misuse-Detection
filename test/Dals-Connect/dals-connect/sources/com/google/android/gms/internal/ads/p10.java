package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p10 implements s10 {
    private final byte[] a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final Stack<r10> f11964b = new Stack<>();

    /* renamed from: c, reason: collision with root package name */
    private final y10 f11965c = new y10();

    /* renamed from: d, reason: collision with root package name */
    private t10 f11966d;

    /* renamed from: e, reason: collision with root package name */
    private int f11967e;

    /* renamed from: f, reason: collision with root package name */
    private int f11968f;

    /* renamed from: g, reason: collision with root package name */
    private long f11969g;

    private final long d(zzno zznoVar, int i2) throws IOException, InterruptedException {
        zznoVar.readFully(this.a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.a[i3] & 255);
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.s10
    public final void a() {
        this.f11967e = 0;
        this.f11964b.clear();
        this.f11965c.a();
    }

    @Override // com.google.android.gms.internal.ads.s10
    public final void b(t10 t10Var) {
        this.f11966d = t10Var;
    }

    @Override // com.google.android.gms.internal.ads.s10
    public final boolean c(zzno zznoVar) throws IOException, InterruptedException {
        String str;
        double longBitsToDouble;
        int d2;
        int c2;
        long j2;
        int i2;
        zzsk.e(this.f11966d != null);
        while (true) {
            if (!this.f11964b.isEmpty()) {
                long position = zznoVar.getPosition();
                j2 = this.f11964b.peek().f12094b;
                if (position >= j2) {
                    t10 t10Var = this.f11966d;
                    i2 = this.f11964b.pop().a;
                    t10Var.h(i2);
                    return true;
                }
            }
            if (this.f11967e == 0) {
                long b2 = this.f11965c.b(zznoVar, true, false, 4);
                if (b2 == -2) {
                    zznoVar.c();
                    while (true) {
                        zznoVar.d(this.a, 0, 4);
                        d2 = y10.d(this.a[0]);
                        if (d2 != -1 && d2 <= 4) {
                            c2 = (int) y10.c(this.a, d2, false);
                            if (this.f11966d.a(c2)) {
                                break;
                            }
                        }
                        zznoVar.a(1);
                    }
                    zznoVar.a(d2);
                    b2 = c2;
                }
                if (b2 == -1) {
                    return false;
                }
                this.f11968f = (int) b2;
                this.f11967e = 1;
            }
            if (this.f11967e == 1) {
                this.f11969g = this.f11965c.b(zznoVar, false, true, 8);
                this.f11967e = 2;
            }
            int g2 = this.f11966d.g(this.f11968f);
            if (g2 != 0) {
                if (g2 == 1) {
                    long position2 = zznoVar.getPosition();
                    this.f11964b.add(new r10(this.f11968f, this.f11969g + position2));
                    this.f11966d.e(this.f11968f, position2, this.f11969g);
                    this.f11967e = 0;
                    return true;
                }
                if (g2 == 2) {
                    long j3 = this.f11969g;
                    if (j3 <= 8) {
                        this.f11966d.b(this.f11968f, d(zznoVar, (int) j3));
                        this.f11967e = 0;
                        return true;
                    }
                    long j4 = this.f11969g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j4);
                    throw new zzlm(sb.toString());
                }
                if (g2 == 3) {
                    long j5 = this.f11969g;
                    if (j5 <= 2147483647L) {
                        t10 t10Var2 = this.f11966d;
                        int i3 = this.f11968f;
                        int i4 = (int) j5;
                        if (i4 == 0) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            byte[] bArr = new byte[i4];
                            zznoVar.readFully(bArr, 0, i4);
                            str = new String(bArr);
                        }
                        t10Var2.f(i3, str);
                        this.f11967e = 0;
                        return true;
                    }
                    long j6 = this.f11969g;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j6);
                    throw new zzlm(sb2.toString());
                }
                if (g2 == 4) {
                    this.f11966d.c(this.f11968f, (int) this.f11969g, zznoVar);
                    this.f11967e = 0;
                    return true;
                }
                if (g2 == 5) {
                    long j7 = this.f11969g;
                    if (j7 != 4 && j7 != 8) {
                        long j8 = this.f11969g;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j8);
                        throw new zzlm(sb3.toString());
                    }
                    t10 t10Var3 = this.f11966d;
                    int i5 = this.f11968f;
                    int i6 = (int) j7;
                    long d3 = d(zznoVar, i6);
                    if (i6 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) d3);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(d3);
                    }
                    t10Var3.d(i5, longBitsToDouble);
                    this.f11967e = 0;
                    return true;
                }
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append("Invalid element type ");
                sb4.append(g2);
                throw new zzlm(sb4.toString());
            }
            zznoVar.a((int) this.f11969g);
            this.f11967e = 0;
        }
    }
}
