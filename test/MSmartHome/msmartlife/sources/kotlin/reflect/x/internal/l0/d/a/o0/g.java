package kotlin.reflect.x.internal.l0.d.a.o0;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.j0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.p1;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.r;
import kotlin.reflect.x.internal.l0.l.x1.a;
import kotlin.reflect.x.internal.l0.l.y;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes2.dex */
public final class g extends r implements j0 {

    /* renamed from: g, reason: collision with root package name */
    private final m0 f20130g;

    public g(m0 m0Var) {
        l.f(m0Var, "delegate");
        this.f20130g = m0Var;
    }

    private final m0 a1(m0 m0Var) {
        m0 S0 = m0Var.S0(false);
        return !a.q(m0Var) ? S0 : new g(S0);
    }

    @Override // kotlin.reflect.x.internal.l0.l.n
    public boolean A0() {
        return true;
    }

    @Override // kotlin.reflect.x.internal.l0.l.n
    public e0 K(e0 e0Var) {
        l.f(e0Var, "replacement");
        q1 R0 = e0Var.R0();
        if (!a.q(R0) && !n1.l(R0)) {
            return R0;
        }
        if (R0 instanceof m0) {
            return a1((m0) R0);
        }
        if (R0 instanceof y) {
            y yVar = (y) R0;
            return p1.d(f0.d(a1(yVar.W0()), a1(yVar.X0())), p1.a(R0));
        }
        throw new IllegalStateException(("Incorrect type: " + R0).toString());
    }

    @Override // kotlin.reflect.x.internal.l0.l.r, kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: V0 */
    public m0 S0(boolean z) {
        return z ? X0().S0(true) : this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    protected m0 X0() {
        return this.f20130g;
    }

    @Override // kotlin.reflect.x.internal.l0.l.m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public g U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return new g(X0().U0(a1Var));
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public g Z0(m0 m0Var) {
        l.f(m0Var, "delegate");
        return new g(m0Var);
    }
}
