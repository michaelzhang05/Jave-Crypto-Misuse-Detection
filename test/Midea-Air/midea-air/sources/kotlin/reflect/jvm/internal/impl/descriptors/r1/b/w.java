package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: ReflectJavaPackage.kt */
/* loaded from: classes2.dex */
public final class w extends p implements kotlin.reflect.x.internal.l0.d.a.n0.u {
    private final kotlin.reflect.x.internal.l0.f.c a;

    public w(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        this.a = cVar;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.u
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.u> A() {
        List i2;
        i2 = kotlin.collections.t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.x.internal.l0.d.a.n0.a> getAnnotations() {
        List<kotlin.reflect.x.internal.l0.d.a.n0.a> i2;
        i2 = kotlin.collections.t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.u
    public kotlin.reflect.x.internal.l0.f.c d() {
        return this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public kotlin.reflect.x.internal.l0.d.a.n0.a e(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && kotlin.jvm.internal.l.a(d(), ((w) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public boolean l() {
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.u
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.g> p(Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        List i2;
        kotlin.jvm.internal.l.f(function1, "nameFilter");
        i2 = kotlin.collections.t.i();
        return i2;
    }

    public String toString() {
        return w.class.getName() + ": " + d();
    }
}
