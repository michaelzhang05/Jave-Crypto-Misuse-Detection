package com.google.android.gms.common.api.internal;

import N.C1331b;
import P.C1357b;
import Q.AbstractC1387c;
import Q.C1389e;
import Q.C1397m;
import Q.C1401q;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import q0.InterfaceC3821e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r implements InterfaceC3821e {

    /* renamed from: a, reason: collision with root package name */
    private final C2063c f15992a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15993b;

    /* renamed from: c, reason: collision with root package name */
    private final C1357b f15994c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15995d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15996e;

    r(C2063c c2063c, int i8, C1357b c1357b, long j8, long j9, String str, String str2) {
        this.f15992a = c2063c;
        this.f15993b = i8;
        this.f15994c = c1357b;
        this.f15995d = j8;
        this.f15996e = j9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r b(C2063c c2063c, int i8, C1357b c1357b) {
        boolean z8;
        long j8;
        long j9;
        if (c2063c.e()) {
            Q.r a8 = C1401q.b().a();
            if (a8 != null) {
                if (a8.v()) {
                    z8 = a8.y();
                    n t8 = c2063c.t(c1357b);
                    if (t8 != null) {
                        if (t8.v() instanceof AbstractC1387c) {
                            AbstractC1387c abstractC1387c = (AbstractC1387c) t8.v();
                            if (abstractC1387c.J() && !abstractC1387c.f()) {
                                C1389e c8 = c(t8, abstractC1387c, i8);
                                if (c8 != null) {
                                    t8.G();
                                    z8 = c8.z();
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            } else {
                z8 = true;
            }
            if (z8) {
                j8 = System.currentTimeMillis();
            } else {
                j8 = 0;
            }
            if (z8) {
                j9 = SystemClock.elapsedRealtime();
            } else {
                j9 = 0;
            }
            return new r(c2063c, i8, c1357b, j8, j9, null, null);
        }
        return null;
    }

    private static C1389e c(n nVar, AbstractC1387c abstractC1387c, int i8) {
        int[] u8;
        int[] v8;
        C1389e H8 = abstractC1387c.H();
        if (H8 == null || !H8.y() || ((u8 = H8.u()) != null ? !V.b.a(u8, i8) : !((v8 = H8.v()) == null || !V.b.a(v8, i8))) || nVar.t() >= H8.p()) {
            return null;
        }
        return H8;
    }

    @Override // q0.InterfaceC3821e
    public final void a(Task task) {
        n t8;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int p8;
        long j8;
        long j9;
        int i12;
        if (this.f15992a.e()) {
            Q.r a8 = C1401q.b().a();
            if ((a8 == null || a8.v()) && (t8 = this.f15992a.t(this.f15994c)) != null && (t8.v() instanceof AbstractC1387c)) {
                AbstractC1387c abstractC1387c = (AbstractC1387c) t8.v();
                boolean z9 = true;
                if (this.f15995d > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int z10 = abstractC1387c.z();
                if (a8 != null) {
                    z8 &= a8.y();
                    int p9 = a8.p();
                    int u8 = a8.u();
                    i8 = a8.z();
                    if (abstractC1387c.J() && !abstractC1387c.f()) {
                        C1389e c8 = c(t8, abstractC1387c, this.f15993b);
                        if (c8 != null) {
                            if (!c8.z() || this.f15995d <= 0) {
                                z9 = false;
                            }
                            u8 = c8.p();
                            z8 = z9;
                        } else {
                            return;
                        }
                    }
                    i9 = p9;
                    i10 = u8;
                } else {
                    i8 = 0;
                    i9 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
                    i10 = 100;
                }
                C2063c c2063c = this.f15992a;
                if (task.n()) {
                    i11 = 0;
                    p8 = 0;
                } else {
                    if (task.l()) {
                        i11 = 100;
                    } else {
                        Exception i13 = task.i();
                        if (i13 instanceof O.b) {
                            Status a9 = ((O.b) i13).a();
                            int v8 = a9.v();
                            C1331b p10 = a9.p();
                            if (p10 == null) {
                                i11 = v8;
                            } else {
                                p8 = p10.p();
                                i11 = v8;
                            }
                        } else {
                            i11 = 101;
                        }
                    }
                    p8 = -1;
                }
                if (z8) {
                    long j10 = this.f15995d;
                    long j11 = this.f15996e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i12 = (int) (SystemClock.elapsedRealtime() - j11);
                    j8 = j10;
                    j9 = currentTimeMillis;
                } else {
                    j8 = 0;
                    j9 = 0;
                    i12 = -1;
                }
                c2063c.C(new C1397m(this.f15993b, i11, p8, j8, j9, null, null, z10, i12), i8, i9, i10);
            }
        }
    }
}
