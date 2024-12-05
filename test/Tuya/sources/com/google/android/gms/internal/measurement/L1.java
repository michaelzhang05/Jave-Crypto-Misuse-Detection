package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes3.dex */
public final class L1 extends AbstractC2088r4 implements Z4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ L1(com.google.android.gms.internal.measurement.D1 r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.M1 r1 = com.google.android.gms.internal.measurement.M1.G()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.L1.<init>(com.google.android.gms.internal.measurement.D1):void");
    }

    public final L1 A(long j8) {
        m();
        M1.T((M1) this.f15876b, j8);
        return this;
    }

    public final L1 B(long j8) {
        m();
        M1.S((M1) this.f15876b, j8);
        return this;
    }

    public final Q1 C(int i8) {
        return ((M1) this.f15876b).H(i8);
    }

    public final String D() {
        return ((M1) this.f15876b).J();
    }

    public final List E() {
        return DesugarCollections.unmodifiableList(((M1) this.f15876b).K());
    }

    public final boolean F() {
        return ((M1) this.f15876b).W();
    }

    public final int o() {
        return ((M1) this.f15876b).C();
    }

    public final long p() {
        return ((M1) this.f15876b).D();
    }

    public final long q() {
        return ((M1) this.f15876b).E();
    }

    public final L1 r(Iterable iterable) {
        m();
        M1.O((M1) this.f15876b, iterable);
        return this;
    }

    public final L1 s(P1 p12) {
        m();
        M1.N((M1) this.f15876b, (Q1) p12.k());
        return this;
    }

    public final L1 t(Q1 q12) {
        m();
        M1.N((M1) this.f15876b, q12);
        return this;
    }

    public final L1 v() {
        m();
        ((M1) this.f15876b).zze = AbstractC2112u4.p();
        return this;
    }

    public final L1 w(int i8) {
        m();
        M1.Q((M1) this.f15876b, i8);
        return this;
    }

    public final L1 x(String str) {
        m();
        M1.R((M1) this.f15876b, str);
        return this;
    }

    public final L1 y(int i8, P1 p12) {
        m();
        M1.M((M1) this.f15876b, i8, (Q1) p12.k());
        return this;
    }

    public final L1 z(int i8, Q1 q12) {
        m();
        M1.M((M1) this.f15876b, i8, q12);
        return this;
    }
}
