package kotlin.reflect.x.internal.l0.l.u1;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.h;
import kotlin.reflect.x.internal.l0.l.j1;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: ErrorClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class a extends h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(kotlin.reflect.x.internal.l0.f.f r21) {
        /*
            r20 = this;
            r9 = r20
            java.lang.String r0 = "name"
            r2 = r21
            kotlin.jvm.internal.l.f(r2, r0)
            kotlin.f0.x.e.l0.l.u1.k r10 = kotlin.reflect.x.internal.l0.l.u1.k.a
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r1 = r10.i()
            kotlin.reflect.jvm.internal.impl.descriptors.d0 r3 = kotlin.reflect.jvm.internal.impl.descriptors.d0.OPEN
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS
            java.util.List r5 = kotlin.collections.r.i()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r11 = kotlin.reflect.jvm.internal.impl.descriptors.z0.a
            kotlin.f0.x.e.l0.k.n r8 = kotlin.reflect.x.internal.l0.k.f.f21159b
            r7 = 0
            r0 = r20
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g r0 = r0.b()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.p1.f r0 = kotlin.reflect.jvm.internal.impl.descriptors.p1.f.o1(r9, r0, r1, r11)
            java.util.List r2 = kotlin.collections.r.i()
            kotlin.reflect.jvm.internal.impl.descriptors.u r3 = kotlin.reflect.jvm.internal.impl.descriptors.t.f21862d
            r0.r1(r2, r3)
            java.lang.String r2 = "create(this, Annotations…          )\n            }"
            kotlin.jvm.internal.l.e(r0, r2)
            kotlin.f0.x.e.l0.l.u1.g r2 = kotlin.reflect.x.internal.l0.l.u1.g.SCOPE_FOR_ERROR_CLASS
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            kotlin.f0.x.e.l0.f.f r4 = r0.getName()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "errorConstructor.name.toString()"
            kotlin.jvm.internal.l.e(r4, r5)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = ""
            r3[r1] = r4
            kotlin.f0.x.e.l0.l.u1.f r1 = kotlin.reflect.x.internal.l0.l.u1.k.b(r2, r3)
            kotlin.f0.x.e.l0.l.u1.h r2 = new kotlin.f0.x.e.l0.l.u1.h
            kotlin.f0.x.e.l0.l.u1.j r14 = kotlin.reflect.x.internal.l0.l.u1.j.w0
            java.lang.String[] r3 = new java.lang.String[r5]
            kotlin.f0.x.e.l0.l.u1.i r12 = r10.e(r14, r3)
            java.lang.String[] r3 = new java.lang.String[r5]
            r15 = 0
            r16 = 0
            r18 = 24
            r19 = 0
            r11 = r2
            r13 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.h1(r2)
            java.util.Set r2 = kotlin.collections.s0.c(r0)
            r9.L0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.u1.a.<init>(kotlin.f0.x.e.l0.f.f):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.a, kotlin.reflect.jvm.internal.impl.descriptors.b1
    /* renamed from: A0 */
    public e c(l1 l1Var) {
        l.f(l1Var, "substitutor");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.h
    public String toString() {
        String f2 = getName().f();
        l.e(f2, "name.asString()");
        return f2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.a, kotlin.reflect.jvm.internal.impl.descriptors.p1.t
    public kotlin.reflect.x.internal.l0.i.w.h v(j1 j1Var, g gVar) {
        l.f(j1Var, "typeSubstitution");
        l.f(gVar, "kotlinTypeRefiner");
        g gVar2 = g.SCOPE_FOR_ERROR_CLASS;
        String fVar = getName().toString();
        l.e(fVar, "name.toString()");
        return k.b(gVar2, fVar, j1Var.toString());
    }
}
