package kotlin.reflect.x.internal.l0.i.w;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.utils.d;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: MemberScopeImpl.kt */
/* loaded from: classes2.dex */
public abstract class i implements h {
    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<? extends y0> a(f fVar, b bVar) {
        List i2;
        l.f(fVar, "name");
        l.f(bVar, "location");
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> b() {
        Collection<m> g2 = g(d.t, d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g2) {
            if (obj instanceof y0) {
                f name = ((y0) obj).getName();
                l.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<? extends t0> c(f fVar, b bVar) {
        List i2;
        l.f(fVar, "name");
        l.f(bVar, "location");
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> d() {
        Collection<m> g2 = g(d.u, d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g2) {
            if (obj instanceof y0) {
                f name = ((y0) obj).getName();
                l.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> e() {
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public h f(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public Collection<m> g(d dVar, Function1<? super f, Boolean> function1) {
        List i2;
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        i2 = t.i();
        return i2;
    }
}
