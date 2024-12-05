package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* loaded from: classes3.dex */
final class L2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16213a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16214b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(Y2 y22, InterfaceC2029k0 interfaceC2029k0) {
        this.f16214b = y22;
        this.f16213a = interfaceC2029k0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0089  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.Y2 r0 = r7.f16214b
            com.google.android.gms.measurement.internal.Y1 r0 = r0.f16777a
            com.google.android.gms.measurement.internal.a4 r0 = r0.M()
            com.google.android.gms.internal.measurement.X6.c()
            com.google.android.gms.measurement.internal.Y1 r1 = r0.f16777a
            com.google.android.gms.measurement.internal.h r1 = r1.z()
            com.google.android.gms.measurement.internal.j1 r2 = com.google.android.gms.measurement.internal.AbstractC2217k1.f16627w0
            r3 = 0
            boolean r1 = r1.B(r3, r2)
            if (r1 == 0) goto L77
            com.google.android.gms.measurement.internal.Y1 r1 = r0.f16777a
            com.google.android.gms.measurement.internal.I1 r1 = r1.F()
            m0.p r1 = r1.q()
            m0.o r2 = m0.o.ANALYTICS_STORAGE
            boolean r1 = r1.j(r2)
            if (r1 != 0) goto L3d
            com.google.android.gms.measurement.internal.Y1 r0 = r0.f16777a
            com.google.android.gms.measurement.internal.u1 r0 = r0.d()
            com.google.android.gms.measurement.internal.s1 r0 = r0.x()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L3b:
            r0 = r3
            goto L87
        L3d:
            com.google.android.gms.measurement.internal.Y1 r1 = r0.f16777a
            com.google.android.gms.measurement.internal.I1 r1 = r1.F()
            com.google.android.gms.measurement.internal.Y1 r2 = r0.f16777a
            W.d r2 = r2.a()
            long r4 = r2.currentTimeMillis()
            boolean r1 = r1.v(r4)
            if (r1 != 0) goto L3b
            com.google.android.gms.measurement.internal.Y1 r1 = r0.f16777a
            com.google.android.gms.measurement.internal.I1 r1 = r1.F()
            com.google.android.gms.measurement.internal.F1 r1 = r1.f16160p
            long r1 = r1.a()
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L66
            goto L3b
        L66:
            com.google.android.gms.measurement.internal.Y1 r0 = r0.f16777a
            com.google.android.gms.measurement.internal.I1 r0 = r0.F()
            com.google.android.gms.measurement.internal.F1 r0 = r0.f16160p
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L87
        L77:
            com.google.android.gms.measurement.internal.Y1 r0 = r0.f16777a
            com.google.android.gms.measurement.internal.u1 r0 = r0.d()
            com.google.android.gms.measurement.internal.s1 r0 = r0.x()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.a(r1)
            goto L3b
        L87:
            if (r0 == 0) goto L9b
            com.google.android.gms.measurement.internal.Y2 r1 = r7.f16214b
            com.google.android.gms.measurement.internal.Y1 r1 = r1.f16777a
            com.google.android.gms.measurement.internal.y4 r1 = r1.N()
            com.google.android.gms.internal.measurement.k0 r2 = r7.f16213a
            long r3 = r0.longValue()
            r1.J(r2, r3)
            return
        L9b:
            com.google.android.gms.internal.measurement.k0 r0 = r7.f16213a     // Catch: android.os.RemoteException -> La1
            r0.G(r3)     // Catch: android.os.RemoteException -> La1
            return
        La1:
            r0 = move-exception
            com.google.android.gms.measurement.internal.Y2 r1 = r7.f16214b
            com.google.android.gms.measurement.internal.Y1 r1 = r1.f16777a
            com.google.android.gms.measurement.internal.u1 r1 = r1.d()
            com.google.android.gms.measurement.internal.s1 r1 = r1.r()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.L2.run():void");
    }
}
