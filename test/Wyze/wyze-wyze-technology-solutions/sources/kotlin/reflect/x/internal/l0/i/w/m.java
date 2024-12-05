package kotlin.reflect.x.internal.l0.i.w;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.q.a.d;
import kotlin.reflect.x.internal.l0.i.w.k;
import kotlin.reflect.x.internal.l0.l.j1;
import kotlin.reflect.x.internal.l0.l.l1;

/* compiled from: SubstitutingScope.kt */
/* loaded from: classes2.dex */
public final class m implements h {

    /* renamed from: b, reason: collision with root package name */
    private final h f20936b;

    /* renamed from: c, reason: collision with root package name */
    private final l1 f20937c;

    /* renamed from: d, reason: collision with root package name */
    private Map<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> f20938d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f20939e;

    /* compiled from: SubstitutingScope.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke() {
            m mVar = m.this;
            return mVar.k(k.a.a(mVar.f20936b, null, null, 3, null));
        }
    }

    public m(h hVar, l1 l1Var) {
        Lazy b2;
        l.f(hVar, "workerScope");
        l.f(l1Var, "givenSubstitutor");
        this.f20936b = hVar;
        j1 j2 = l1Var.j();
        l.e(j2, "givenSubstitutor.substitution");
        this.f20937c = d.f(j2, false, 1, null).c();
        b2 = i.b(new a());
        this.f20939e = b2;
    }

    private final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> j() {
        return (Collection) this.f20939e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> Collection<D> k(Collection<? extends D> collection) {
        if (this.f20937c.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g2 = kotlin.reflect.jvm.internal.impl.utils.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g2.add(l((kotlin.reflect.jvm.internal.impl.descriptors.m) it.next()));
        }
        return g2;
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> D l(D d2) {
        if (this.f20937c.k()) {
            return d2;
        }
        if (this.f20938d == null) {
            this.f20938d = new HashMap();
        }
        Map<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> map = this.f20938d;
        l.c(map);
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = map.get(d2);
        if (mVar == null) {
            if (!(d2 instanceof b1)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d2).toString());
            }
            mVar = ((b1) d2).c(this.f20937c);
            if (mVar != null) {
                map.put(d2, mVar);
            } else {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d2 + " substitution fails");
            }
        }
        D d3 = (D) mVar;
        l.d(d3, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d3;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<? extends y0> a(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return k(this.f20936b.a(fVar, bVar));
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> b() {
        return this.f20936b.b();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Collection<? extends t0> c(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return k(this.f20936b.c(fVar, bVar));
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> d() {
        return this.f20936b.d();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<f> e() {
        return this.f20936b.e();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public h f(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        h f2 = this.f20936b.f(fVar, bVar);
        if (f2 != null) {
            return (h) l(f2);
        }
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(d dVar, Function1<? super f, Boolean> function1) {
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        return j();
    }
}
