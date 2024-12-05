package kotlin.reflect.x.internal.l0.l;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.h.c;
import kotlin.reflect.x.internal.l0.h.f;
import kotlin.reflect.x.internal.l0.l.t1.e;

/* compiled from: flexibleTypes.kt */
/* loaded from: classes2.dex */
public final class z extends y implements n {

    /* renamed from: i, reason: collision with root package name */
    public static final a f21393i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static boolean f21394j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21395k;

    /* compiled from: flexibleTypes.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, m0 m0Var2) {
        super(m0Var, m0Var2);
        l.f(m0Var, "lowerBound");
        l.f(m0Var2, "upperBound");
    }

    private final void a1() {
        if (!f21394j || this.f21395k) {
            return;
        }
        this.f21395k = true;
        b0.b(W0());
        b0.b(X0());
        l.a(W0(), X0());
        e.a.d(W0(), X0());
    }

    @Override // kotlin.reflect.x.internal.l0.l.n
    public boolean A0() {
        return (W0().O0().w() instanceof e1) && l.a(W0().O0(), X0().O0());
    }

    @Override // kotlin.reflect.x.internal.l0.l.n
    public e0 K(e0 e0Var) {
        q1 d2;
        l.f(e0Var, "replacement");
        q1 R0 = e0Var.R0();
        if (R0 instanceof y) {
            d2 = R0;
        } else {
            if (!(R0 instanceof m0)) {
                throw new NoWhenBranchMatchedException();
            }
            m0 m0Var = (m0) R0;
            d2 = f0.d(m0Var, m0Var.S0(true));
        }
        return p1.b(d2, R0);
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    public q1 S0(boolean z) {
        return f0.d(W0().S0(z), X0().S0(z));
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    public q1 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return f0.d(W0().U0(a1Var), X0().U0(a1Var));
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public m0 V0() {
        a1();
        return W0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public String Y0(c cVar, f fVar) {
        l.f(cVar, "renderer");
        l.f(fVar, "options");
        if (fVar.n()) {
            return '(' + cVar.w(W0()) + ".." + cVar.w(X0()) + ')';
        }
        return cVar.t(cVar.w(W0()), cVar.w(X0()), kotlin.reflect.x.internal.l0.l.x1.a.h(this));
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public y Y0(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        e0 a2 = gVar.a(W0());
        l.d(a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 a3 = gVar.a(X0());
        l.d(a3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new z((m0) a2, (m0) a3);
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public String toString() {
        return '(' + W0() + ".." + X0() + ')';
    }
}
