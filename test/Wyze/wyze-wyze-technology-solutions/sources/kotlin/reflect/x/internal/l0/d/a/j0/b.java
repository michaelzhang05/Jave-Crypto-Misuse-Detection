package kotlin.reflect.x.internal.l0.d.a.j0;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.d.a.k0.g;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.m;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public class b implements c, g {
    static final /* synthetic */ KProperty<Object>[] a = {b0.g(new v(b0.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.c f19915b;

    /* renamed from: c, reason: collision with root package name */
    private final z0 f19916c;

    /* renamed from: d, reason: collision with root package name */
    private final i f19917d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.d.a.n0.b f19918e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19919f;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<m0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.d.a.l0.g f19920f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f19921g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, b bVar) {
            super(0);
            this.f19920f = gVar;
            this.f19921g = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            m0 s = this.f19920f.d().o().o(this.f19921g.d()).s();
            l.e(s, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return s;
        }
    }

    public b(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, kotlin.reflect.x.internal.l0.d.a.n0.a aVar, kotlin.reflect.x.internal.l0.f.c cVar) {
        z0 z0Var;
        Collection<kotlin.reflect.x.internal.l0.d.a.n0.b> w;
        l.f(gVar, "c");
        l.f(cVar, "fqName");
        this.f19915b = cVar;
        if (aVar == null || (z0Var = gVar.a().t().a(aVar)) == null) {
            z0Var = z0.a;
            l.e(z0Var, "NO_SOURCE");
        }
        this.f19916c = z0Var;
        this.f19917d = gVar.e().d(new a(gVar, this));
        this.f19918e = (aVar == null || (w = aVar.w()) == null) ? null : (kotlin.reflect.x.internal.l0.d.a.n0.b) r.S(w);
        this.f19919f = aVar != null && aVar.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public Map<f, kotlin.reflect.x.internal.l0.i.r.g<?>> a() {
        Map<f, kotlin.reflect.x.internal.l0.i.r.g<?>> i2;
        i2 = o0.i();
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlin.reflect.x.internal.l0.d.a.n0.b b() {
        return this.f19918e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m0 getType() {
        return (m0) m.a(this.f19917d, this, a[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public kotlin.reflect.x.internal.l0.f.c d() {
        return this.f19915b;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.k0.g
    public boolean f() {
        return this.f19919f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.c
    public z0 t() {
        return this.f19916c;
    }
}
