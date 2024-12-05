package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes2.dex */
public final class a extends r {

    /* renamed from: g, reason: collision with root package name */
    private final m0 f21181g;

    /* renamed from: h, reason: collision with root package name */
    private final m0 f21182h;

    public a(m0 m0Var, m0 m0Var2) {
        l.f(m0Var, "delegate");
        l.f(m0Var2, "abbreviation");
        this.f21181g = m0Var;
        this.f21182h = m0Var2;
    }

    public final m0 W() {
        return X0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return new a(X0().U0(a1Var), this.f21182h);
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    protected m0 X0() {
        return this.f21181g;
    }

    public final m0 a1() {
        return this.f21182h;
    }

    @Override // kotlin.reflect.x.internal.l0.l.m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public a S0(boolean z) {
        return new a(X0().S0(z), this.f21182h.S0(z));
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a Y0(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        e0 a = gVar.a(X0());
        l.d(a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 a2 = gVar.a(this.f21182h);
        l.d(a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((m0) a, (m0) a2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public a Z0(m0 m0Var) {
        l.f(m0Var, "delegate");
        return new a(m0Var, this.f21182h);
    }
}
