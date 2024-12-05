package l6;

import q6.C3861B;

/* loaded from: classes5.dex */
public final class c1 extends C3861B {

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal f34605e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c1(S5.g r3, S5.d r4) {
        /*
            r2 = this;
            l6.d1 r0 = l6.d1.f34607a
            S5.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            S5.g r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f34605e = r0
            S5.g r4 = r4.getContext()
            S5.e$b r0 = S5.e.f9822a0
            S5.g$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof l6.I
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = q6.J.c(r3, r4)
            q6.J.a(r3, r4)
            r2.O0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.c1.<init>(S5.g, S5.d):void");
    }

    @Override // q6.C3861B, l6.AbstractC3344a
    protected void J0(Object obj) {
        if (this.threadLocalIsSet) {
            O5.r rVar = (O5.r) this.f34605e.get();
            if (rVar != null) {
                q6.J.a((S5.g) rVar.a(), rVar.b());
            }
            this.f34605e.remove();
        }
        Object a8 = AbstractC3343G.a(obj, this.f38359d);
        S5.d dVar = this.f38359d;
        S5.g context = dVar.getContext();
        c1 c1Var = null;
        Object c8 = q6.J.c(context, null);
        if (c8 != q6.J.f38367a) {
            c1Var = H.g(dVar, context, c8);
        }
        try {
            this.f38359d.resumeWith(a8);
            O5.I i8 = O5.I.f8278a;
        } finally {
            if (c1Var == null || c1Var.N0()) {
                q6.J.a(context, c8);
            }
        }
    }

    public final boolean N0() {
        boolean z8;
        if (this.threadLocalIsSet && this.f34605e.get() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f34605e.remove();
        return !z8;
    }

    public final void O0(S5.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f34605e.set(O5.x.a(gVar, obj));
    }
}
