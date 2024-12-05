package com.google.android.gms.common.api.internal;

import O.C1258b;
import Q.C1301b;
import R.AbstractC1306c;
import R.C1308e;
import R.C1316m;
import R.C1320q;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import r0.InterfaceC3674e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r implements InterfaceC3674e {

    /* renamed from: a, reason: collision with root package name */
    private final C1939c f15191a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15192b;

    /* renamed from: c, reason: collision with root package name */
    private final C1301b f15193c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15194d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15195e;

    r(C1939c c1939c, int i8, C1301b c1301b, long j8, long j9, String str, String str2) {
        this.f15191a = c1939c;
        this.f15192b = i8;
        this.f15193c = c1301b;
        this.f15194d = j8;
        this.f15195e = j9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r b(C1939c c1939c, int i8, C1301b c1301b) {
        boolean z8;
        long j8;
        long j9;
        if (c1939c.e()) {
            R.r a8 = C1320q.b().a();
            if (a8 != null) {
                if (a8.z()) {
                    z8 = a8.G();
                    n t8 = c1939c.t(c1301b);
                    if (t8 != null) {
                        if (t8.v() instanceof AbstractC1306c) {
                            AbstractC1306c abstractC1306c = (AbstractC1306c) t8.v();
                            if (abstractC1306c.J() && !abstractC1306c.e()) {
                                C1308e c8 = c(t8, abstractC1306c, i8);
                                if (c8 != null) {
                                    t8.G();
                                    z8 = c8.I();
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
            return new r(c1939c, i8, c1301b, j8, j9, null, null);
        }
        return null;
    }

    private static C1308e c(n nVar, AbstractC1306c abstractC1306c, int i8) {
        int[] u8;
        int[] z8;
        C1308e H8 = abstractC1306c.H();
        if (H8 == null || !H8.G() || ((u8 = H8.u()) != null ? !W.b.a(u8, i8) : !((z8 = H8.z()) == null || !W.b.a(z8, i8))) || nVar.t() >= H8.s()) {
            return null;
        }
        return H8;
    }

    @Override // r0.InterfaceC3674e
    public final void a(Task task) {
        n t8;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int s8;
        long j8;
        long j9;
        int i12;
        if (this.f15191a.e()) {
            R.r a8 = C1320q.b().a();
            if ((a8 == null || a8.z()) && (t8 = this.f15191a.t(this.f15193c)) != null && (t8.v() instanceof AbstractC1306c)) {
                AbstractC1306c abstractC1306c = (AbstractC1306c) t8.v();
                boolean z9 = true;
                if (this.f15194d > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int z10 = abstractC1306c.z();
                if (a8 != null) {
                    z8 &= a8.G();
                    int s9 = a8.s();
                    int u8 = a8.u();
                    i8 = a8.I();
                    if (abstractC1306c.J() && !abstractC1306c.e()) {
                        C1308e c8 = c(t8, abstractC1306c, this.f15192b);
                        if (c8 != null) {
                            if (!c8.I() || this.f15194d <= 0) {
                                z9 = false;
                            }
                            u8 = c8.s();
                            z8 = z9;
                        } else {
                            return;
                        }
                    }
                    i9 = s9;
                    i10 = u8;
                } else {
                    i8 = 0;
                    i9 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
                    i10 = 100;
                }
                C1939c c1939c = this.f15191a;
                if (task.n()) {
                    i11 = 0;
                    s8 = 0;
                } else {
                    if (task.l()) {
                        i11 = 100;
                    } else {
                        Exception i13 = task.i();
                        if (i13 instanceof P.b) {
                            Status a9 = ((P.b) i13).a();
                            int z11 = a9.z();
                            C1258b s10 = a9.s();
                            if (s10 == null) {
                                i11 = z11;
                            } else {
                                s8 = s10.s();
                                i11 = z11;
                            }
                        } else {
                            i11 = 101;
                        }
                    }
                    s8 = -1;
                }
                if (z8) {
                    long j10 = this.f15194d;
                    long j11 = this.f15195e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i12 = (int) (SystemClock.elapsedRealtime() - j11);
                    j8 = j10;
                    j9 = currentTimeMillis;
                } else {
                    j8 = 0;
                    j9 = 0;
                    i12 = -1;
                }
                c1939c.C(new C1316m(this.f15192b, i11, s8, j8, j9, null, null, z10, i12), i8, i9, i10);
            }
        }
    }
}
