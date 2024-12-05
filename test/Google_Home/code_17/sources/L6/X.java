package l6;

import S5.g;
import k6.C3225a;

/* loaded from: classes5.dex */
public abstract class X {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34585a;

        /* renamed from: b, reason: collision with root package name */
        int f34586b;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34585a = obj;
            this.f34586b |= Integer.MIN_VALUE;
            return X.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(S5.d r4) {
        /*
            boolean r0 = r4 instanceof l6.X.a
            if (r0 == 0) goto L13
            r0 = r4
            l6.X$a r0 = (l6.X.a) r0
            int r1 = r0.f34586b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34586b = r1
            goto L18
        L13:
            l6.X$a r0 = new l6.X$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f34585a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f34586b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            O5.t.b(r4)
            goto L52
        L31:
            O5.t.b(r4)
            r0.f34586b = r3
            l6.p r4 = new l6.p
            S5.d r2 = T5.b.c(r0)
            r4.<init>(r2, r3)
            r4.C()
            java.lang.Object r4 = r4.y()
            java.lang.Object r2 = T5.b.e()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            O5.h r4 = new O5.h
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.X.a(S5.d):java.lang.Object");
    }

    public static final Object b(long j8, S5.d dVar) {
        if (j8 <= 0) {
            return O5.I.f8278a;
        }
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        if (j8 < Long.MAX_VALUE) {
            d(c3374p.getContext()).v(j8, c3374p);
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == T5.b.e()) {
            return y8;
        }
        return O5.I.f8278a;
    }

    public static final Object c(long j8, S5.d dVar) {
        Object b8 = b(e(j8), dVar);
        if (b8 == T5.b.e()) {
            return b8;
        }
        return O5.I.f8278a;
    }

    public static final W d(S5.g gVar) {
        W w8;
        g.b bVar = gVar.get(S5.e.f9822a0);
        if (bVar instanceof W) {
            w8 = (W) bVar;
        } else {
            w8 = null;
        }
        if (w8 == null) {
            return T.a();
        }
        return w8;
    }

    public static final long e(long j8) {
        if (C3225a.g(j8, C3225a.f34131b.b()) > 0) {
            return g6.m.e(C3225a.o(j8), 1L);
        }
        return 0L;
    }
}
