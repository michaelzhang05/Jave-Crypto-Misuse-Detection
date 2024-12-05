package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.x.internal.l0.l.r1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: typeParameterUtils.kt */
/* loaded from: classes2.dex */
public final class c implements e1 {

    /* renamed from: f, reason: collision with root package name */
    private final e1 f21621f;

    /* renamed from: g, reason: collision with root package name */
    private final m f21622g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21623h;

    public c(e1 e1Var, m mVar, int i2) {
        kotlin.jvm.internal.l.f(e1Var, "originalDescriptor");
        kotlin.jvm.internal.l.f(mVar, "declarationDescriptor");
        this.f21621f = e1Var;
        this.f21622g = mVar;
        this.f21623h = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    public boolean F() {
        return this.f21621f.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(o<R, D> oVar, D d2) {
        return (R) this.f21621f.L(oVar, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    public m b() {
        return this.f21622g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    public int f() {
        return this.f21623h + this.f21621f.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1, kotlin.reflect.jvm.internal.impl.descriptors.h
    public kotlin.reflect.x.internal.l0.l.e1 g() {
        return this.f21621f.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.a
    public kotlin.reflect.jvm.internal.impl.descriptors.n1.g getAnnotations() {
        return this.f21621f.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i0
    public kotlin.reflect.x.internal.l0.f.f getName() {
        return this.f21621f.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    public List<kotlin.reflect.x.internal.l0.l.e0> getUpperBounds() {
        return this.f21621f.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    public kotlin.reflect.x.internal.l0.k.n h0() {
        return this.f21621f.h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    public r1 n() {
        return this.f21621f.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    public boolean o0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public kotlin.reflect.x.internal.l0.l.m0 s() {
        return this.f21621f.s();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    public z0 t() {
        return this.f21621f.t();
    }

    public String toString() {
        return this.f21621f + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public e1 a() {
        e1 a = this.f21621f.a();
        kotlin.jvm.internal.l.e(a, "originalDescriptor.original");
        return a;
    }
}
