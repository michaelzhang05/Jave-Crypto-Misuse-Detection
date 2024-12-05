package io.sentry;

import java.security.SecureRandom;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TracesSampler.java */
/* loaded from: classes2.dex */
public final class p5 {
    private static final Double a = Double.valueOf(1.0d);

    /* renamed from: b, reason: collision with root package name */
    private final x4 f19073b;

    /* renamed from: c, reason: collision with root package name */
    private final SecureRandom f19074c;

    public p5(x4 x4Var) {
        this((x4) io.sentry.util.q.c(x4Var, "options are required"), new SecureRandom());
    }

    private boolean b(Double d2) {
        return d2.doubleValue() >= this.f19074c.nextDouble();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.sentry.q5 a(io.sentry.r3 r8) {
        /*
            r7 = this;
            io.sentry.r5 r0 = r8.a()
            io.sentry.q5 r0 = r0.g()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            io.sentry.x4 r0 = r7.f19073b
            io.sentry.x4$d r0 = r0.getProfilesSampler()
            r1 = 0
            if (r0 == 0) goto L2d
            io.sentry.x4 r0 = r7.f19073b     // Catch: java.lang.Throwable -> L1f
            io.sentry.x4$d r0 = r0.getProfilesSampler()     // Catch: java.lang.Throwable -> L1f
            java.lang.Double r0 = r0.a(r8)     // Catch: java.lang.Throwable -> L1f
            goto L2e
        L1f:
            r0 = move-exception
            io.sentry.x4 r2 = r7.f19073b
            io.sentry.w1 r2 = r2.getLogger()
            io.sentry.s4 r3 = io.sentry.s4.ERROR
            java.lang.String r4 = "Error in the 'ProfilesSamplerCallback' callback."
            r2.b(r3, r4, r0)
        L2d:
            r0 = r1
        L2e:
            if (r0 != 0) goto L36
            io.sentry.x4 r0 = r7.f19073b
            java.lang.Double r0 = r0.getProfilesSampleRate()
        L36:
            if (r0 == 0) goto L40
            boolean r2 = r7.b(r0)
            if (r2 == 0) goto L40
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            io.sentry.x4 r3 = r7.f19073b
            io.sentry.x4$g r3 = r3.getTracesSampler()
            if (r3 == 0) goto L77
            io.sentry.x4 r3 = r7.f19073b     // Catch: java.lang.Throwable -> L58
            io.sentry.x4$g r3 = r3.getTracesSampler()     // Catch: java.lang.Throwable -> L58
            java.lang.Double r3 = r3.a(r8)     // Catch: java.lang.Throwable -> L58
            goto L67
        L58:
            r3 = move-exception
            io.sentry.x4 r4 = r7.f19073b
            io.sentry.w1 r4 = r4.getLogger()
            io.sentry.s4 r5 = io.sentry.s4.ERROR
            java.lang.String r6 = "Error in the 'TracesSamplerCallback' callback."
            r4.b(r5, r6, r3)
            r3 = r1
        L67:
            if (r3 == 0) goto L77
            io.sentry.q5 r8 = new io.sentry.q5
            boolean r1 = r7.b(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.<init>(r1, r3, r2, r0)
            return r8
        L77:
            io.sentry.r5 r8 = r8.a()
            io.sentry.q5 r8 = r8.u()
            if (r8 == 0) goto L82
            return r8
        L82:
            io.sentry.x4 r8 = r7.f19073b
            java.lang.Double r8 = r8.getTracesSampleRate()
            io.sentry.x4 r3 = r7.f19073b
            java.lang.Boolean r3 = r3.getEnableTracing()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L99
            java.lang.Double r3 = io.sentry.p5.a
            goto L9a
        L99:
            r3 = r1
        L9a:
            if (r8 != 0) goto L9d
            r8 = r3
        L9d:
            if (r8 == 0) goto Lad
            io.sentry.q5 r1 = new io.sentry.q5
            boolean r3 = r7.b(r8)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.<init>(r3, r8, r2, r0)
            return r1
        Lad:
            io.sentry.q5 r8 = new io.sentry.q5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.<init>(r0, r1, r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.p5.a(io.sentry.r3):io.sentry.q5");
    }

    p5(x4 x4Var, SecureRandom secureRandom) {
        this.f19073b = x4Var;
        this.f19074c = secureRandom;
    }
}
