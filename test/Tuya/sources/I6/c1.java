package i6;

import n6.C3482B;

/* loaded from: classes5.dex */
public final class c1 extends C3482B {

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal f31753e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c1(P5.g r3, P5.d r4) {
        /*
            r2 = this;
            i6.d1 r0 = i6.d1.f31755a
            P5.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            P5.g r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f31753e = r0
            P5.g r4 = r4.getContext()
            P5.e$b r0 = P5.e.f7991a0
            P5.g$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof i6.I
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = n6.J.c(r3, r4)
            n6.J.a(r3, r4)
            r2.P0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.c1.<init>(P5.g, P5.d):void");
    }

    @Override // n6.C3482B, i6.AbstractC2809a
    protected void K0(Object obj) {
        if (this.threadLocalIsSet) {
            L5.r rVar = (L5.r) this.f31753e.get();
            if (rVar != null) {
                n6.J.a((P5.g) rVar.a(), rVar.b());
            }
            this.f31753e.remove();
        }
        Object a8 = AbstractC2808G.a(obj, this.f36231d);
        P5.d dVar = this.f36231d;
        P5.g context = dVar.getContext();
        c1 c1Var = null;
        Object c8 = n6.J.c(context, null);
        if (c8 != n6.J.f36239a) {
            c1Var = H.g(dVar, context, c8);
        }
        try {
            this.f36231d.resumeWith(a8);
            L5.I i8 = L5.I.f6487a;
        } finally {
            if (c1Var == null || c1Var.O0()) {
                n6.J.a(context, c8);
            }
        }
    }

    public final boolean O0() {
        boolean z8;
        if (this.threadLocalIsSet && this.f31753e.get() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f31753e.remove();
        return !z8;
    }

    public final void P0(P5.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f31753e.set(L5.x.a(gVar, obj));
    }
}
