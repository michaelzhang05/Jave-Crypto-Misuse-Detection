package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class j1 {
    abstract void a(Object obj, int i6, int i7);

    abstract void b(Object obj, int i6, long j6);

    abstract void c(Object obj, int i6, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(Object obj, int i6, h hVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(Object obj, int i6, long j6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object k(Object obj, Object obj2);

    final void l(Object obj, c1 c1Var) {
        while (c1Var.K() != Integer.MAX_VALUE && m(obj, c1Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(Object obj, c1 c1Var) {
        int j6 = c1Var.j();
        int a6 = p1.a(j6);
        int b6 = p1.b(j6);
        if (b6 == 0) {
            e(obj, a6, c1Var.D());
            return true;
        }
        if (b6 == 1) {
            b(obj, a6, c1Var.m());
            return true;
        }
        if (b6 == 2) {
            d(obj, a6, c1Var.c());
            return true;
        }
        if (b6 != 3) {
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw a0.e();
            }
            a(obj, a6, c1Var.F());
            return true;
        }
        Object n6 = n();
        int c6 = p1.c(a6, 4);
        l(n6, c1Var);
        if (c6 != c1Var.j()) {
            throw a0.b();
        }
        c(obj, a6, r(n6));
        return true;
    }

    abstract Object n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(c1 c1Var);

    abstract Object r(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(Object obj, q1 q1Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t(Object obj, q1 q1Var);
}
