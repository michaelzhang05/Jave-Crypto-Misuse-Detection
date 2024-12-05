package i6;

import o6.AbstractC3586b;

/* loaded from: classes5.dex */
public abstract class a1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        long f31742a;

        /* renamed from: b, reason: collision with root package name */
        Object f31743b;

        /* renamed from: c, reason: collision with root package name */
        Object f31744c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f31745d;

        /* renamed from: e, reason: collision with root package name */
        int f31746e;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31745d = obj;
            this.f31746e |= Integer.MIN_VALUE;
            return a1.d(0L, null, this);
        }
    }

    public static final Y0 a(long j8, W w8, InterfaceC2855x0 interfaceC2855x0) {
        return new Y0("Timed out waiting for " + j8 + " ms", interfaceC2855x0);
    }

    private static final Object b(Z0 z02, X5.n nVar) {
        B0.i(z02, X.d(z02.f36231d.getContext()).w(z02.f31740e, z02, z02.getContext()));
        return AbstractC3586b.c(z02, z02, nVar);
    }

    public static final Object c(long j8, X5.n nVar, P5.d dVar) {
        if (j8 > 0) {
            Object b8 = b(new Z0(j8, dVar), nVar);
            if (b8 == Q5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return b8;
        }
        throw new Y0("Timed out immediately");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r7, X5.n r9, P5.d r10) {
        /*
            boolean r0 = r10 instanceof i6.a1.a
            if (r0 == 0) goto L13
            r0 = r10
            i6.a1$a r0 = (i6.a1.a) r0
            int r1 = r0.f31746e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31746e = r1
            goto L18
        L13:
            i6.a1$a r0 = new i6.a1$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f31745d
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f31746e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f31744c
            kotlin.jvm.internal.T r7 = (kotlin.jvm.internal.T) r7
            java.lang.Object r8 = r0.f31743b
            X5.n r8 = (X5.n) r8
            L5.t.b(r10)     // Catch: i6.Y0 -> L32
            goto L6f
        L32:
            r8 = move-exception
            goto L70
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            L5.t.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.T r10 = new kotlin.jvm.internal.T
            r10.<init>()
            r0.f31743b = r9     // Catch: i6.Y0 -> L68
            r0.f31744c = r10     // Catch: i6.Y0 -> L68
            r0.f31742a = r7     // Catch: i6.Y0 -> L68
            r0.f31746e = r4     // Catch: i6.Y0 -> L68
            i6.Z0 r2 = new i6.Z0     // Catch: i6.Y0 -> L68
            r2.<init>(r7, r0)     // Catch: i6.Y0 -> L68
            r10.f33761a = r2     // Catch: i6.Y0 -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: i6.Y0 -> L68
            java.lang.Object r8 = Q5.b.e()     // Catch: i6.Y0 -> L68
            if (r7 != r8) goto L6b
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: i6.Y0 -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L70
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r10 = r7
        L6f:
            return r10
        L70:
            i6.x0 r9 = r8.f31738a
            java.lang.Object r7 = r7.f33761a
            if (r9 != r7) goto L77
            return r3
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.a1.d(long, X5.n, P5.d):java.lang.Object");
    }

    public static final Object e(long j8, X5.n nVar, P5.d dVar) {
        return d(X.e(j8), nVar, dVar);
    }
}
