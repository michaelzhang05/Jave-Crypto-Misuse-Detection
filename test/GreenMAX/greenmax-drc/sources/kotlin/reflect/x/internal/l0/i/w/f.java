package kotlin.reflect.x.internal.l0.i.w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.c.b.b;

/* compiled from: InnerClassesScopeWrapper.kt */
/* loaded from: classes2.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    private final h f20926b;

    public f(h hVar) {
        l.f(hVar, "workerScope");
        this.f20926b = hVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> b() {
        return this.f20926b.b();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> d() {
        return this.f20926b.d();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> e() {
        return this.f20926b.e();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public h f(kotlin.reflect.x.internal.l0.f.f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        h f2 = this.f20926b.f(fVar, bVar);
        if (f2 == null) {
            return null;
        }
        e eVar = f2 instanceof e ? (e) f2 : null;
        if (eVar != null) {
            return eVar;
        }
        if (f2 instanceof d1) {
            return (d1) f2;
        }
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<h> g(d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        List<h> i2;
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        d n = dVar.n(d.a.c());
        if (n == null) {
            i2 = t.i();
            return i2;
        }
        Collection<m> g2 = this.f20926b.g(n, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g2) {
            if (obj instanceof i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f20926b;
    }
}
