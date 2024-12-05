package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements l2.d {

    /* renamed from: a, reason: collision with root package name */
    private final b f4625a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4626b;

    /* renamed from: c, reason: collision with root package name */
    private final u1.b f4627c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4628d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4629e;

    p(b bVar, int i6, u1.b bVar2, long j6, long j7, String str, String str2) {
        this.f4625a = bVar;
        this.f4626b = i6;
        this.f4627c = bVar2;
        this.f4628d = j6;
        this.f4629e = j7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p b(b bVar, int i6, u1.b bVar2) {
        boolean z5;
        if (!bVar.f()) {
            return null;
        }
        v1.p a6 = v1.o.b().a();
        if (a6 == null) {
            z5 = true;
        } else {
            if (!a6.c()) {
                return null;
            }
            z5 = a6.d();
            l w5 = bVar.w(bVar2);
            if (w5 != null) {
                if (!(w5.u() instanceof v1.c)) {
                    return null;
                }
                v1.c cVar = (v1.c) w5.u();
                if (cVar.I() && !cVar.a()) {
                    v1.e c6 = c(w5, cVar, i6);
                    if (c6 == null) {
                        return null;
                    }
                    w5.F();
                    z5 = c6.e();
                }
            }
        }
        return new p(bVar, i6, bVar2, z5 ? System.currentTimeMillis() : 0L, z5 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static v1.e c(l lVar, v1.c cVar, int i6) {
        int[] b6;
        int[] c6;
        v1.e G = cVar.G();
        if (G == null || !G.d() || ((b6 = G.b()) != null ? !z1.b.a(b6, i6) : !((c6 = G.c()) == null || !z1.b.a(c6, i6))) || lVar.s() >= G.a()) {
            return null;
        }
        return G;
    }

    @Override // l2.d
    public final void a(l2.i iVar) {
        l w5;
        int i6;
        int i7;
        int i8;
        int i9;
        int a6;
        long j6;
        long j7;
        int i10;
        if (this.f4625a.f()) {
            v1.p a7 = v1.o.b().a();
            if ((a7 == null || a7.c()) && (w5 = this.f4625a.w(this.f4627c)) != null && (w5.u() instanceof v1.c)) {
                v1.c cVar = (v1.c) w5.u();
                boolean z5 = this.f4628d > 0;
                int y5 = cVar.y();
                if (a7 != null) {
                    z5 &= a7.d();
                    int a8 = a7.a();
                    int b6 = a7.b();
                    i6 = a7.e();
                    if (cVar.I() && !cVar.a()) {
                        v1.e c6 = c(w5, cVar, this.f4626b);
                        if (c6 == null) {
                            return;
                        }
                        boolean z6 = c6.e() && this.f4628d > 0;
                        b6 = c6.a();
                        z5 = z6;
                    }
                    i7 = a8;
                    i8 = b6;
                } else {
                    i6 = 0;
                    i7 = 5000;
                    i8 = 100;
                }
                b bVar = this.f4625a;
                if (iVar.m()) {
                    i9 = 0;
                    a6 = 0;
                } else {
                    if (iVar.k()) {
                        i9 = 100;
                    } else {
                        Exception h6 = iVar.h();
                        if (h6 instanceof t1.b) {
                            Status a9 = ((t1.b) h6).a();
                            int b7 = a9.b();
                            s1.a a10 = a9.a();
                            a6 = a10 == null ? -1 : a10.a();
                            i9 = b7;
                        } else {
                            i9 = 101;
                        }
                    }
                    a6 = -1;
                }
                if (z5) {
                    long j8 = this.f4628d;
                    j7 = System.currentTimeMillis();
                    j6 = j8;
                    i10 = (int) (SystemClock.elapsedRealtime() - this.f4629e);
                } else {
                    j6 = 0;
                    j7 = 0;
                    i10 = -1;
                }
                bVar.E(new v1.l(this.f4626b, i9, a6, j6, j7, null, null, y5, i10), i6, i7, i8);
            }
        }
    }
}
