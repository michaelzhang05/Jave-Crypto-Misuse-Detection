package kotlin.reflect.x.internal.l0.l;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.reflect.x.internal.l0.l.u1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public final class n0 extends m0 {

    /* renamed from: g, reason: collision with root package name */
    private final e1 f21270g;

    /* renamed from: h, reason: collision with root package name */
    private final List<g1> f21271h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21272i;

    /* renamed from: j, reason: collision with root package name */
    private final h f21273j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1<g, m0> f21274k;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(e1 e1Var, List<? extends g1> list, boolean z, h hVar, Function1<? super g, ? extends m0> function1) {
        l.f(e1Var, "constructor");
        l.f(list, "arguments");
        l.f(hVar, "memberScope");
        l.f(function1, "refinedTypeFactory");
        this.f21270g = e1Var;
        this.f21271h = list;
        this.f21272i = z;
        this.f21273j = hVar;
        this.f21274k = function1;
        if (!(q() instanceof f) || (q() instanceof kotlin.reflect.x.internal.l0.l.u1.l)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + q() + '\n' + O0());
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public List<g1> M0() {
        return this.f21271h;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public a1 N0() {
        return a1.f21185g.h();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public e1 O0() {
        return this.f21270g;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return this.f21272i;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: V0 */
    public m0 S0(boolean z) {
        if (z == P0()) {
            return this;
        }
        if (z) {
            return new k0(this);
        }
        return new i0(this);
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return a1Var.isEmpty() ? this : new o0(this, a1Var);
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public m0 Y0(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        m0 invoke = this.f21274k.invoke(gVar);
        return invoke == null ? this : invoke;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public h q() {
        return this.f21273j;
    }
}
