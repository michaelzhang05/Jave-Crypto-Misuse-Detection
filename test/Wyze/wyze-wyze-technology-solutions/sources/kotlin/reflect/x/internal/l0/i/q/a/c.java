package kotlin.reflect.x.internal.l0.i.q.a;

import java.util.Collection;
import java.util.List;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.reflect.x.internal.l0.l.t1.j;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    private final g1 a;

    /* renamed from: b, reason: collision with root package name */
    private j f20864b;

    public c(g1 g1Var) {
        l.f(g1Var, "projection");
        this.a = g1Var;
        f().a();
        r1 r1Var = r1.INVARIANT;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public Collection<e0> a() {
        e0 I;
        List e2;
        if (f().a() == r1.OUT_VARIANCE) {
            I = f().getType();
        } else {
            I = o().I();
        }
        l.e(I, "if (projection.projectio… builtIns.nullableAnyType");
        e2 = s.e(I);
        return e2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: c */
    public /* bridge */ /* synthetic */ h w() {
        return (h) g();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public boolean e() {
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.i.q.a.b
    public g1 f() {
        return this.a;
    }

    public Void g() {
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public List<e1> getParameters() {
        List<e1> i2;
        i2 = t.i();
        return i2;
    }

    public final j h() {
        return this.f20864b;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c b(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        g1 b2 = f().b(gVar);
        l.e(b2, "projection.refine(kotlinTypeRefiner)");
        return new c(b2);
    }

    public final void j(j jVar) {
        this.f20864b = jVar;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public kotlin.reflect.x.internal.l0.b.h o() {
        kotlin.reflect.x.internal.l0.b.h o = f().getType().O0().o();
        l.e(o, "projection.type.constructor.builtIns");
        return o;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + f() + ')';
    }
}
