package i6;

import P5.g;
import h6.C2758a;

/* loaded from: classes5.dex */
public abstract class X {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31733a;

        /* renamed from: b, reason: collision with root package name */
        int f31734b;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31733a = obj;
            this.f31734b |= Integer.MIN_VALUE;
            return X.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(P5.d r4) {
        /*
            boolean r0 = r4 instanceof i6.X.a
            if (r0 == 0) goto L13
            r0 = r4
            i6.X$a r0 = (i6.X.a) r0
            int r1 = r0.f31734b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31734b = r1
            goto L18
        L13:
            i6.X$a r0 = new i6.X$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f31733a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f31734b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            L5.t.b(r4)
            goto L52
        L31:
            L5.t.b(r4)
            r0.f31734b = r3
            i6.p r4 = new i6.p
            P5.d r2 = Q5.b.c(r0)
            r4.<init>(r2, r3)
            r4.B()
            java.lang.Object r4 = r4.y()
            java.lang.Object r2 = Q5.b.e()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            L5.h r4 = new L5.h
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.X.a(P5.d):java.lang.Object");
    }

    public static final Object b(long j8, P5.d dVar) {
        if (j8 <= 0) {
            return L5.I.f6487a;
        }
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        if (j8 < Long.MAX_VALUE) {
            d(c2839p.getContext()).o(j8, c2839p);
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == Q5.b.e()) {
            return y8;
        }
        return L5.I.f6487a;
    }

    public static final Object c(long j8, P5.d dVar) {
        Object b8 = b(e(j8), dVar);
        if (b8 == Q5.b.e()) {
            return b8;
        }
        return L5.I.f6487a;
    }

    public static final W d(P5.g gVar) {
        W w8;
        g.b bVar = gVar.get(P5.e.f7991a0);
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
        if (C2758a.g(j8, C2758a.f31409b.b()) > 0) {
            return d6.m.e(C2758a.o(j8), 1L);
        }
        return 0L;
    }
}
