package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.k0;
import kotlin.reflect.x.internal.l0.l.t1.i;
import kotlin.reflect.x.internal.l0.l.t1.n;
import kotlin.reflect.x.internal.l0.l.t1.o;
import kotlin.reflect.x.internal.l0.l.w1.e;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes2.dex */
public final class p extends r implements n, e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f21280g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final m0 f21281h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21282i;

    /* compiled from: SpecialTypes.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final boolean a(q1 q1Var) {
            return (q1Var.O0() instanceof n) || (q1Var.O0().w() instanceof e1) || (q1Var instanceof i) || (q1Var instanceof u0);
        }

        public static /* synthetic */ p c(a aVar, q1 q1Var, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return aVar.b(q1Var, z);
        }

        private final boolean d(q1 q1Var, boolean z) {
            boolean z2 = false;
            if (!a(q1Var)) {
                return false;
            }
            if (q1Var instanceof u0) {
                return n1.l(q1Var);
            }
            h w = q1Var.O0().w();
            k0 k0Var = w instanceof k0 ? (k0) w : null;
            if (k0Var != null && !k0Var.U0()) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            if (z && (q1Var.O0().w() instanceof e1)) {
                return n1.l(q1Var);
            }
            return !o.a.a(q1Var);
        }

        public final p b(q1 q1Var, boolean z) {
            l.f(q1Var, "type");
            g gVar = null;
            if (q1Var instanceof p) {
                return (p) q1Var;
            }
            if (!d(q1Var, z)) {
                return null;
            }
            if (q1Var instanceof y) {
                y yVar = (y) q1Var;
                l.a(yVar.W0().O0(), yVar.X0().O0());
            }
            return new p(b0.c(q1Var).S0(false), z, gVar);
        }
    }

    private p(m0 m0Var, boolean z) {
        this.f21281h = m0Var;
        this.f21282i = z;
    }

    public /* synthetic */ p(m0 m0Var, boolean z, g gVar) {
        this(m0Var, z);
    }

    @Override // kotlin.reflect.x.internal.l0.l.n
    public boolean A0() {
        return (X0().O0() instanceof n) || (X0().O0().w() instanceof e1);
    }

    @Override // kotlin.reflect.x.internal.l0.l.n
    public e0 K(e0 e0Var) {
        l.f(e0Var, "replacement");
        return q0.e(e0Var.R0(), this.f21282i);
    }

    @Override // kotlin.reflect.x.internal.l0.l.r, kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: V0 */
    public m0 S0(boolean z) {
        return z ? X0().S0(z) : this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return new p(X0().U0(a1Var), this.f21282i);
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    protected m0 X0() {
        return this.f21281h;
    }

    public final m0 a1() {
        return this.f21281h;
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public p Z0(m0 m0Var) {
        l.f(m0Var, "delegate");
        return new p(m0Var, this.f21282i);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m0
    public String toString() {
        return X0() + " & Any";
    }
}
