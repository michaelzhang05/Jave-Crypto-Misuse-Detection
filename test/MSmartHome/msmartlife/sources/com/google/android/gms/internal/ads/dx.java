package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class dx<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(B b2, int i2, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(B b2, int i2, zzdmr zzdmrVar);

    abstract void c(B b2, int i2, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(T t, vx vxVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean e(lw lwVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(B b2, lw lwVar) throws IOException {
        int tag = lwVar.getTag();
        int i2 = tag >>> 3;
        int i3 = tag & 7;
        if (i3 == 0) {
            a(b2, i2, lwVar.j());
            return true;
        }
        if (i3 == 1) {
            n(b2, i2, lwVar.k());
            return true;
        }
        if (i3 == 2) {
            b(b2, i2, lwVar.u());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 == 5) {
                o(b2, i2, lwVar.r());
                return true;
            }
            throw zzdok.f();
        }
        B m = m();
        int i4 = 4 | (i2 << 3);
        while (lwVar.n() != Integer.MAX_VALUE && f(m, lwVar)) {
        }
        if (i4 == lwVar.getTag()) {
            c(b2, i2, h(m));
            return true;
        }
        throw zzdok.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g(Object obj);

    abstract T h(B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B k(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int l(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B m();

    abstract void n(B b2, int i2, long j2);

    abstract void o(B b2, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(T t, vx vxVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void q(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void r(Object obj, B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T s(T t, T t2);
}
