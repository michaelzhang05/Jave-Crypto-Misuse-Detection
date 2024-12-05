package kotlin.reflect.x.internal.l0.d.a.l0;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.t;
import kotlin.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.x.internal.l0.d.a.l0.k;
import kotlin.reflect.x.internal.l0.d.a.l0.l.h;
import kotlin.reflect.x.internal.l0.d.a.n0.u;
import kotlin.reflect.x.internal.l0.d.a.o;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* loaded from: classes2.dex */
public final class f implements o0 {
    private final g a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.a<c, h> f19973b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function0<h> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f19975g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(0);
            this.f19975g = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h(f.this.a, this.f19975g);
        }
    }

    public f(b bVar) {
        Lazy c2;
        l.f(bVar, "components");
        k.a aVar = k.a.a;
        c2 = j.c(null);
        g gVar = new g(bVar, aVar, c2);
        this.a = gVar;
        this.f19973b = gVar.e().b();
    }

    private final h e(c cVar) {
        u a2 = o.a.a(this.a.a().d(), cVar, false, 2, null);
        if (a2 == null) {
            return null;
        }
        return this.f19973b.b(cVar, new a(a2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    public List<h> a(c cVar) {
        List<h> m;
        l.f(cVar, "fqName");
        m = t.m(e(cVar));
        return m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    public void b(c cVar, Collection<k0> collection) {
        l.f(cVar, "fqName");
        l.f(collection, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.a.a(collection, e(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    public boolean c(c cVar) {
        l.f(cVar, "fqName");
        return o.a.a(this.a.a().d(), cVar, false, 2, null) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<c> p(c cVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        List<c> i2;
        l.f(cVar, "fqName");
        l.f(function1, "nameFilter");
        h e2 = e(cVar);
        List<c> P0 = e2 != null ? e2.P0() : null;
        if (P0 != null) {
            return P0;
        }
        i2 = t.i();
        return i2;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.a.a().m();
    }
}
