package kotlin.reflect.x.internal.l0.j.b.g0;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.d;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.i0;
import kotlin.reflect.x.internal.l0.e.r;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.e.z.g;
import kotlin.reflect.x.internal.l0.e.z.h;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.g0;
import kotlin.reflect.x.internal.l0.l.k1;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes2.dex */
public final class l extends d implements g {
    private final n m;
    private final r n;
    private final c o;
    private final g p;
    private final h q;
    private final f r;
    private Collection<? extends i0> s;
    private m0 t;
    private m0 u;
    private List<? extends e1> v;
    private m0 w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(kotlin.reflect.x.internal.l0.k.n r13, kotlin.reflect.jvm.internal.impl.descriptors.m r14, kotlin.reflect.jvm.internal.impl.descriptors.n1.g r15, kotlin.reflect.x.internal.l0.f.f r16, kotlin.reflect.jvm.internal.impl.descriptors.u r17, kotlin.reflect.x.internal.l0.e.r r18, kotlin.reflect.x.internal.l0.e.z.c r19, kotlin.reflect.x.internal.l0.e.z.g r20, kotlin.reflect.x.internal.l0.e.z.h r21, kotlin.reflect.x.internal.l0.j.b.g0.f r22) {
        /*
            r12 = this;
            r6 = r12
            r7 = r13
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.l.f(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            r1 = r14
            kotlin.jvm.internal.l.f(r14, r0)
            java.lang.String r0 = "annotations"
            r2 = r15
            kotlin.jvm.internal.l.f(r15, r0)
            java.lang.String r0 = "name"
            r3 = r16
            kotlin.jvm.internal.l.f(r3, r0)
            java.lang.String r0 = "visibility"
            r5 = r17
            kotlin.jvm.internal.l.f(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.l.f(r8, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.l.f(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.l.f(r11, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = kotlin.reflect.jvm.internal.impl.descriptors.z0.a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.l.e(r4, r0)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.m = r7
            r6.n = r8
            r6.o = r9
            r6.p = r10
            r6.q = r11
            r0 = r22
            r6.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.j.b.g0.l.<init>(kotlin.f0.x.e.l0.k.n, kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.n1.g, kotlin.f0.x.e.l0.f.f, kotlin.reflect.jvm.internal.impl.descriptors.u, kotlin.f0.x.e.l0.e.r, kotlin.f0.x.e.l0.e.z.c, kotlin.f0.x.e.l0.e.z.g, kotlin.f0.x.e.l0.e.z.h, kotlin.f0.x.e.l0.j.b.g0.f):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.d
    protected List<e1> N0() {
        List list = this.v;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.l.v("typeConstructorParameters");
        return null;
    }

    public r P0() {
        return this.n;
    }

    public h Q0() {
        return this.q;
    }

    public final void R0(List<? extends e1> list, m0 m0Var, m0 m0Var2) {
        kotlin.jvm.internal.l.f(list, "declaredTypeParameters");
        kotlin.jvm.internal.l.f(m0Var, "underlyingType");
        kotlin.jvm.internal.l.f(m0Var2, "expandedType");
        O0(list);
        this.t = m0Var;
        this.u = m0Var2;
        this.v = f1.d(this);
        this.w = A0();
        this.s = M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public d1 c(l1 l1Var) {
        kotlin.jvm.internal.l.f(l1Var, "substitutor");
        if (l1Var.k()) {
            return this;
        }
        n h0 = h0();
        m b2 = b();
        kotlin.jvm.internal.l.e(b2, "containingDeclaration");
        kotlin.reflect.jvm.internal.impl.descriptors.n1.g annotations = getAnnotations();
        kotlin.jvm.internal.l.e(annotations, "annotations");
        f name = getName();
        kotlin.jvm.internal.l.e(name, "name");
        l lVar = new l(h0, b2, annotations, name, getVisibility(), P0(), Z(), T(), Q0(), c0());
        List<e1> w = w();
        m0 g0 = g0();
        r1 r1Var = r1.INVARIANT;
        e0 n = l1Var.n(g0, r1Var);
        kotlin.jvm.internal.l.e(n, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        m0 a = k1.a(n);
        e0 n2 = l1Var.n(W(), r1Var);
        kotlin.jvm.internal.l.e(n2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        lVar.R0(w, a, k1.a(n2));
        return lVar;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.g
    public g T() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public m0 W() {
        m0 m0Var = this.u;
        if (m0Var != null) {
            return m0Var;
        }
        kotlin.jvm.internal.l.v("expandedType");
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.g
    public c Z() {
        return this.o;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.g
    public f c0() {
        return this.r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public m0 g0() {
        m0 m0Var = this.t;
        if (m0Var != null) {
            return m0Var;
        }
        kotlin.jvm.internal.l.v("underlyingType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.d
    protected n h0() {
        return this.m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public e r() {
        if (g0.a(W())) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h w = W().O0().w();
        if (w instanceof e) {
            return (e) w;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public m0 s() {
        m0 m0Var = this.w;
        if (m0Var != null) {
            return m0Var;
        }
        kotlin.jvm.internal.l.v("defaultTypeImpl");
        return null;
    }
}
