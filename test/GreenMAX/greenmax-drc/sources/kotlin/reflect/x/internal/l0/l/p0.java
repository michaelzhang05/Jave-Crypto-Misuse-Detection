package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes2.dex */
public final class p0 extends r implements o1 {

    /* renamed from: g, reason: collision with root package name */
    private final m0 f21283g;

    /* renamed from: h, reason: collision with root package name */
    private final e0 f21284h;

    public p0(m0 m0Var, e0 e0Var) {
        l.f(m0Var, "delegate");
        l.f(e0Var, "enhancement");
        this.f21283g = m0Var;
        this.f21284h = e0Var;
    }

    @Override // kotlin.reflect.x.internal.l0.l.o1
    public e0 H() {
        return this.f21284h;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: V0 */
    public m0 S0(boolean z) {
        q1 d2 = p1.d(v().S0(z), H().R0().S0(z));
        l.d(d2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (m0) d2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        q1 d2 = p1.d(v().U0(a1Var), H());
        l.d(d2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (m0) d2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    protected m0 X0() {
        return this.f21283g;
    }

    @Override // kotlin.reflect.x.internal.l0.l.o1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public m0 v() {
        return X0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public p0 Y0(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        e0 a = gVar.a(X0());
        l.d(a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new p0((m0) a, gVar.a(H()));
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public p0 Z0(m0 m0Var) {
        l.f(m0Var, "delegate");
        return new p0(m0Var, H());
    }

    @Override // kotlin.reflect.x.internal.l0.l.m0
    public String toString() {
        return "[@EnhancedForWarnings(" + H() + ")] " + v();
    }
}
