package kotlin.reflect.x.internal.l0.l.t1;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.i.j;
import kotlin.reflect.x.internal.l0.l.d1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.t1.f;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes2.dex */
public final class m implements l {

    /* renamed from: c, reason: collision with root package name */
    private final g f21313c;

    /* renamed from: d, reason: collision with root package name */
    private final f f21314d;

    /* renamed from: e, reason: collision with root package name */
    private final j f21315e;

    public m(g gVar, f fVar) {
        l.f(gVar, "kotlinTypeRefiner");
        l.f(fVar, "kotlinTypePreparator");
        this.f21313c = gVar;
        this.f21314d = fVar;
        j m = j.m(c());
        l.e(m, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f21315e = m;
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.l
    public j a() {
        return this.f21315e;
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.e
    public boolean b(e0 e0Var, e0 e0Var2) {
        l.f(e0Var, "a");
        l.f(e0Var2, "b");
        return e(a.b(false, false, null, f(), c(), 6, null), e0Var.R0(), e0Var2.R0());
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.l
    public g c() {
        return this.f21313c;
    }

    @Override // kotlin.reflect.x.internal.l0.l.t1.e
    public boolean d(e0 e0Var, e0 e0Var2) {
        l.f(e0Var, "subtype");
        l.f(e0Var2, "supertype");
        return g(a.b(true, false, null, f(), c(), 6, null), e0Var.R0(), e0Var2.R0());
    }

    public final boolean e(d1 d1Var, q1 q1Var, q1 q1Var2) {
        l.f(d1Var, "<this>");
        l.f(q1Var, "a");
        l.f(q1Var2, "b");
        return f.a.k(d1Var, q1Var, q1Var2);
    }

    public f f() {
        return this.f21314d;
    }

    public final boolean g(d1 d1Var, q1 q1Var, q1 q1Var2) {
        l.f(d1Var, "<this>");
        l.f(q1Var, "subType");
        l.f(q1Var2, "superType");
        return f.t(f.a, d1Var, q1Var, q1Var2, false, 8, null);
    }

    public /* synthetic */ m(g gVar, f fVar, int i2, g gVar2) {
        this(gVar, (i2 & 2) != 0 ? f.a.a : fVar);
    }
}
