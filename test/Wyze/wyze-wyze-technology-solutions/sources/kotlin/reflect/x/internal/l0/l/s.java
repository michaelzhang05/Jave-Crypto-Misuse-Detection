package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public abstract class s extends r {

    /* renamed from: g, reason: collision with root package name */
    private final m0 f21292g;

    public s(m0 m0Var) {
        l.f(m0Var, "delegate");
        this.f21292g = m0Var;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: V0 */
    public m0 S0(boolean z) {
        return z == P0() ? this : X0().S0(z).U0(N0());
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return a1Var != N0() ? new o0(this, a1Var) : this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    protected m0 X0() {
        return this.f21292g;
    }
}
