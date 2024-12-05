package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzlr {
    public static final zzlr a = new u00();

    public final boolean a() {
        return g() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if ((g() - 1) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r3, com.google.android.gms.internal.ads.zzlt r4, com.google.android.gms.internal.ads.zzlu r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.c(r3, r4, r0)
            r2.d(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.g()
            int r6 = r6 - r4
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = 0
            goto L2a
        L22:
            int r6 = r2.g()
            int r6 = r6 - r4
            if (r6 != 0) goto L2a
            r4 = -1
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.d(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlr.b(int, com.google.android.gms.internal.ads.zzlt, com.google.android.gms.internal.ads.zzlu, int):int");
    }

    public abstract zzlt c(int i2, zzlt zzltVar, boolean z);

    public final zzlu d(int i2, zzlu zzluVar, boolean z) {
        return e(i2, zzluVar, false, 0L);
    }

    public abstract zzlu e(int i2, zzlu zzluVar, boolean z, long j2);

    public abstract int f(Object obj);

    public abstract int g();

    public abstract int h();
}
