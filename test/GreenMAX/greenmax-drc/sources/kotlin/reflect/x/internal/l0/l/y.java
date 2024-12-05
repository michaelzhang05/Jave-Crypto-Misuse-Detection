package kotlin.reflect.x.internal.l0.l;

import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.h.c;
import kotlin.reflect.x.internal.l0.h.f;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.w1.g;

/* compiled from: KotlinType.kt */
/* loaded from: classes2.dex */
public abstract class y extends q1 implements g {

    /* renamed from: g, reason: collision with root package name */
    private final m0 f21387g;

    /* renamed from: h, reason: collision with root package name */
    private final m0 f21388h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m0 m0Var, m0 m0Var2) {
        super(null);
        l.f(m0Var, "lowerBound");
        l.f(m0Var2, "upperBound");
        this.f21387g = m0Var;
        this.f21388h = m0Var2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public List<g1> M0() {
        return V0().M0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public a1 N0() {
        return V0().N0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public e1 O0() {
        return V0().O0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return V0().P0();
    }

    public abstract m0 V0();

    public final m0 W0() {
        return this.f21387g;
    }

    public final m0 X0() {
        return this.f21388h;
    }

    public abstract String Y0(c cVar, f fVar);

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public h q() {
        return V0().q();
    }

    public String toString() {
        return c.f20764j.w(this);
    }
}
