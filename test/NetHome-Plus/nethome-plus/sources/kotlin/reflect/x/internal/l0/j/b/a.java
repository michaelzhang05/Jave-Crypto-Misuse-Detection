package kotlin.reflect.x.internal.l0.j.b;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.k.h;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* loaded from: classes2.dex */
public abstract class a implements o0 {
    private final n a;

    /* renamed from: b, reason: collision with root package name */
    private final u f20963b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f20964c;

    /* renamed from: d, reason: collision with root package name */
    protected k f20965d;

    /* renamed from: e, reason: collision with root package name */
    private final h<c, k0> f20966e;

    /* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    /* renamed from: kotlin.f0.x.e.l0.j.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0342a extends Lambda implements Function1<c, k0> {
        C0342a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(c cVar) {
            l.f(cVar, "fqName");
            p d2 = a.this.d(cVar);
            if (d2 == null) {
                return null;
            }
            d2.M0(a.this.e());
            return d2;
        }
    }

    public a(n nVar, u uVar, g0 g0Var) {
        l.f(nVar, "storageManager");
        l.f(uVar, "finder");
        l.f(g0Var, "moduleDescriptor");
        this.a = nVar;
        this.f20963b = uVar;
        this.f20964c = g0Var;
        this.f20966e = nVar.i(new C0342a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    public List<k0> a(c cVar) {
        List<k0> m;
        l.f(cVar, "fqName");
        m = t.m(this.f20966e.invoke(cVar));
        return m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    public void b(c cVar, Collection<k0> collection) {
        l.f(cVar, "fqName");
        l.f(collection, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.a.a(collection, this.f20966e.invoke(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    public boolean c(c cVar) {
        m d2;
        l.f(cVar, "fqName");
        if (this.f20966e.h(cVar)) {
            d2 = (k0) this.f20966e.invoke(cVar);
        } else {
            d2 = d(cVar);
        }
        return d2 == null;
    }

    protected abstract p d(c cVar);

    protected final k e() {
        k kVar = this.f20965d;
        if (kVar != null) {
            return kVar;
        }
        l.v("components");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final u f() {
        return this.f20963b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final g0 g() {
        return this.f20964c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n h() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(k kVar) {
        l.f(kVar, "<set-?>");
        this.f20965d = kVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    public Collection<c> p(c cVar, Function1<? super f, Boolean> function1) {
        Set d2;
        l.f(cVar, "fqName");
        l.f(function1, "nameFilter");
        d2 = u0.d();
        return d2;
    }
}
