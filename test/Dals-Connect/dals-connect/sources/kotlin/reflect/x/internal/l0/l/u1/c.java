package kotlin.reflect.x.internal.l0.l.u1;

import cm.aptoide.pt.database.room.RoomNotification;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.p;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.j1;

/* compiled from: ErrorFunctionDescriptor.kt */
/* loaded from: classes2.dex */
public final class c extends g0 {

    /* compiled from: ErrorFunctionDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a implements y.a<y0> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> b() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> c(List<? extends i1> list) {
            l.f(list, "parameters");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> d(d0 d0Var) {
            l.f(d0Var, "modality");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> e(w0 w0Var) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> f() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> g(e0 e0Var) {
            l.f(e0Var, "type");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> h(b bVar) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> i() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> j(boolean z) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> k(w0 w0Var) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> l(j1 j1Var) {
            l.f(j1Var, "substitution");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> m(List<? extends e1> list) {
            l.f(list, "parameters");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public <V> y.a<y0> n(a.InterfaceC0365a<V> interfaceC0365a, V v) {
            l.f(interfaceC0365a, "userDataKey");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> o(u uVar) {
            l.f(uVar, "visibility");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> p(m mVar) {
            l.f(mVar, "owner");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> q() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> r(b.a aVar) {
            l.f(aVar, "kind");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> s(g gVar) {
            l.f(gVar, "additionalAnnotations");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> t(f fVar) {
            l.f(fVar, "name");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        public y.a<y0> u() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public y0 a() {
            return c.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(eVar, null, g.f21674c.b(), f.C(b.ERROR_FUNCTION.f()), b.a.DECLARATION, z0.a);
        List<w0> i2;
        List<? extends e1> i3;
        List<i1> i4;
        l.f(eVar, "containingDeclaration");
        i2 = t.i();
        i3 = t.i();
        i4 = t.i();
        S0(null, null, i2, i3, i4, k.d(j.n, new String[0]), d0.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.t.f21863e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.g0, kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    protected p M0(m mVar, y yVar, b.a aVar, f fVar, g gVar, z0 z0Var) {
        l.f(mVar, "newOwner");
        l.f(aVar, "kind");
        l.f(gVar, "annotations");
        l.f(z0Var, "source");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V i0(a.InterfaceC0365a<V> interfaceC0365a) {
        l.f(interfaceC0365a, RoomNotification.KEY);
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.g0, kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: l1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public y0 k0(m mVar, d0 d0Var, u uVar, b.a aVar, boolean z) {
        l.f(mVar, "newOwner");
        l.f(d0Var, "modality");
        l.f(uVar, "visibility");
        l.f(aVar, "kind");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.g0, kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.y0
    public y.a<y0> u() {
        return new a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    public void x0(Collection<? extends b> collection) {
        l.f(collection, "overriddenDescriptors");
    }
}
