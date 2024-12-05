package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;

/* compiled from: FunctionDescriptor.java */
/* loaded from: classes2.dex */
public interface y extends b {

    /* compiled from: FunctionDescriptor.java */
    /* loaded from: classes2.dex */
    public interface a<D extends y> {
        D a();

        a<D> b();

        a<D> c(List<i1> list);

        a<D> d(d0 d0Var);

        a<D> e(w0 w0Var);

        a<D> f();

        a<D> g(kotlin.reflect.x.internal.l0.l.e0 e0Var);

        a<D> h(b bVar);

        a<D> i();

        a<D> j(boolean z);

        a<D> k(w0 w0Var);

        a<D> l(kotlin.reflect.x.internal.l0.l.j1 j1Var);

        a<D> m(List<e1> list);

        <V> a<D> n(a.InterfaceC0365a<V> interfaceC0365a, V v);

        a<D> o(u uVar);

        a<D> p(m mVar);

        a<D> q();

        a<D> r(b.a aVar);

        a<D> s(kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar);

        a<D> t(kotlin.reflect.x.internal.l0.f.f fVar);

        a<D> u();
    }

    boolean C0();

    boolean H0();

    boolean P();

    boolean Q();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    y a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    m b();

    y c(kotlin.reflect.x.internal.l0.l.l1 l1Var);

    y d0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    Collection<? extends y> e();

    boolean isInline();

    boolean isSuspend();

    a<? extends y> u();

    boolean w0();
}
