package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.h.c;
import kotlin.reflect.x.internal.l0.h.f;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes2.dex */
public final class a0 extends y implements o1 {

    /* renamed from: i, reason: collision with root package name */
    private final y f21183i;

    /* renamed from: j, reason: collision with root package name */
    private final e0 f21184j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(y yVar, e0 e0Var) {
        super(yVar.W0(), yVar.X0());
        l.f(yVar, "origin");
        l.f(e0Var, "enhancement");
        this.f21183i = yVar;
        this.f21184j = e0Var;
    }

    @Override // kotlin.reflect.x.internal.l0.l.o1
    public e0 H() {
        return this.f21184j;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    public q1 S0(boolean z) {
        return p1.d(v().S0(z), H().R0().S0(z));
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    public q1 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return p1.d(v().U0(a1Var), H());
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public m0 V0() {
        return v().V0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public String Y0(c cVar, f fVar) {
        l.f(cVar, "renderer");
        l.f(fVar, "options");
        if (fVar.f()) {
            return cVar.w(H());
        }
        return v().Y0(cVar, fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.o1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public y v() {
        return this.f21183i;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public a0 Y0(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        e0 a = gVar.a(v());
        l.d(a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new a0((y) a, gVar.a(H()));
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public String toString() {
        return "[@EnhancedForWarnings(" + H() + ")] " + v();
    }
}
