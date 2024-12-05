package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2341e4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17563a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17564b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2341e4(A3 a32, com.google.android.gms.internal.measurement.R0 r02) {
        this.f17563a = r02;
        this.f17564b = a32;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.A3 r0 = r7.f17564b
            com.google.android.gms.measurement.internal.p5 r0 = r0.r()
            com.google.android.gms.measurement.internal.t2 r1 = r0.f()
            com.google.android.gms.measurement.internal.x3 r1 = r1.M()
            boolean r1 = r1.B()
            r2 = 0
            if (r1 != 0) goto L24
            com.google.android.gms.measurement.internal.i2 r0 = r0.c()
            com.google.android.gms.measurement.internal.k2 r0 = r0.M()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L22:
            r0 = r2
            goto L55
        L24:
            com.google.android.gms.measurement.internal.t2 r1 = r0.f()
            V.d r3 = r0.x()
            long r3 = r3.currentTimeMillis()
            boolean r1 = r1.z(r3)
            if (r1 != 0) goto L22
            com.google.android.gms.measurement.internal.t2 r1 = r0.f()
            com.google.android.gms.measurement.internal.y2 r1 = r1.f17829s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L47
            goto L22
        L47:
            com.google.android.gms.measurement.internal.t2 r0 = r0.f()
            com.google.android.gms.measurement.internal.y2 r0 = r0.f17829s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L55:
            if (r0 == 0) goto L69
            com.google.android.gms.measurement.internal.A3 r1 = r7.f17564b
            com.google.android.gms.measurement.internal.R2 r1 = r1.f17844a
            com.google.android.gms.measurement.internal.a6 r1 = r1.L()
            com.google.android.gms.internal.measurement.R0 r2 = r7.f17563a
            long r3 = r0.longValue()
            r1.Q(r2, r3)
            return
        L69:
            com.google.android.gms.internal.measurement.R0 r0 = r7.f17563a     // Catch: android.os.RemoteException -> L6f
            r0.e(r2)     // Catch: android.os.RemoteException -> L6f
            return
        L6f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.A3 r1 = r7.f17564b
            com.google.android.gms.measurement.internal.R2 r1 = r1.f17844a
            com.google.android.gms.measurement.internal.i2 r1 = r1.c()
            com.google.android.gms.measurement.internal.k2 r1 = r1.G()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC2341e4.run():void");
    }
}
