package kotlin.reflect.x.internal.l0.i.q.a;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.reflect.x.internal.l0.l.w1.d;
import okhttp3.HttpUrl;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class a extends m0 implements d {

    /* renamed from: g, reason: collision with root package name */
    private final g1 f20860g;

    /* renamed from: h, reason: collision with root package name */
    private final b f20861h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f20862i;

    /* renamed from: j, reason: collision with root package name */
    private final a1 f20863j;

    public /* synthetic */ a(g1 g1Var, b bVar, boolean z, a1 a1Var, int i2, g gVar) {
        this(g1Var, (i2 & 2) != 0 ? new c(g1Var) : bVar, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? a1.f21185g.h() : a1Var);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public List<g1> M0() {
        List<g1> i2;
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public a1 N0() {
        return this.f20863j;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return this.f20862i;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return new a(this.f20860g, O0(), P0(), a1Var);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public b O0() {
        return this.f20861h;
    }

    @Override // kotlin.reflect.x.internal.l0.l.m0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public a S0(boolean z) {
        return z == P0() ? this : new a(this.f20860g, O0(), z, N0());
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public a Y0(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        g1 b2 = this.f20860g.b(gVar);
        l.e(b2, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(b2, O0(), P0(), N0());
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public h q() {
        return k.a(kotlin.reflect.x.internal.l0.l.u1.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.x.internal.l0.l.m0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f20860g);
        sb.append(')');
        sb.append(P0() ? "?" : HttpUrl.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }

    public a(g1 g1Var, b bVar, boolean z, a1 a1Var) {
        l.f(g1Var, "typeProjection");
        l.f(bVar, "constructor");
        l.f(a1Var, "attributes");
        this.f20860g = g1Var;
        this.f20861h = bVar;
        this.f20862i = z;
        this.f20863j = a1Var;
    }
}
