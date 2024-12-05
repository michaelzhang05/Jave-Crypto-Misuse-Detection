package kotlin.reflect.x.internal.l0.l.t1;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.reflect.x.internal.l0.l.w1.b;
import kotlin.reflect.x.internal.l0.l.w1.d;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes2.dex */
public final class i extends m0 implements d {

    /* renamed from: g, reason: collision with root package name */
    private final b f21297g;

    /* renamed from: h, reason: collision with root package name */
    private final j f21298h;

    /* renamed from: i, reason: collision with root package name */
    private final q1 f21299i;

    /* renamed from: j, reason: collision with root package name */
    private final a1 f21300j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f21301k;
    private final boolean l;

    public /* synthetic */ i(b bVar, j jVar, q1 q1Var, a1 a1Var, boolean z, boolean z2, int i2, g gVar) {
        this(bVar, jVar, q1Var, (i2 & 8) != 0 ? a1.f21185g.h() : a1Var, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public List<g1> M0() {
        List<g1> i2;
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public a1 N0() {
        return this.f21300j;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return this.f21301k;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return new i(this.f21297g, O0(), this.f21299i, a1Var, P0(), this.l);
    }

    public final b X0() {
        return this.f21297g;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public j O0() {
        return this.f21298h;
    }

    public final q1 Z0() {
        return this.f21299i;
    }

    public final boolean a1() {
        return this.l;
    }

    @Override // kotlin.reflect.x.internal.l0.l.m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public i S0(boolean z) {
        return new i(this.f21297g, O0(), this.f21299i, N0(), z, false, 32, null);
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public i Y0(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        b bVar = this.f21297g;
        j b2 = O0().b(gVar);
        q1 q1Var = this.f21299i;
        return new i(bVar, b2, q1Var != null ? gVar.a(q1Var).R0() : null, N0(), P0(), false, 32, null);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public h q() {
        return k.a(kotlin.reflect.x.internal.l0.l.u1.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public i(b bVar, j jVar, q1 q1Var, a1 a1Var, boolean z, boolean z2) {
        l.f(bVar, "captureStatus");
        l.f(jVar, "constructor");
        l.f(a1Var, "attributes");
        this.f21297g = bVar;
        this.f21298h = jVar;
        this.f21299i = q1Var;
        this.f21300j = a1Var;
        this.f21301k = z;
        this.l = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(b bVar, q1 q1Var, g1 g1Var, e1 e1Var) {
        this(bVar, new j(g1Var, null, null, e1Var, 6, null), q1Var, null, false, false, 56, null);
        l.f(bVar, "captureStatus");
        l.f(g1Var, "projection");
        l.f(e1Var, "typeParameter");
    }
}
