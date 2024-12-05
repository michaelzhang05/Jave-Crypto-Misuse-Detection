package kotlin.reflect.x.internal.l0.b.q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.t0;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.h;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes2.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.o1.b {

    /* renamed from: d, reason: collision with root package name */
    private static final f f19766d;

    /* renamed from: e, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.b f19767e;

    /* renamed from: f, reason: collision with root package name */
    private final g0 f19768f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1<g0, m> f19769g;

    /* renamed from: h, reason: collision with root package name */
    private final i f19770h;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f19764b = {b0.g(new v(b0.b(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final b a = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.c f19765c = k.r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<g0, kotlin.reflect.x.internal.l0.b.b> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f19771f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.b.b invoke(g0 g0Var) {
            l.f(g0Var, "module");
            List<k0> I = g0Var.N(e.f19765c).I();
            ArrayList arrayList = new ArrayList();
            for (Object obj : I) {
                if (obj instanceof kotlin.reflect.x.internal.l0.b.b) {
                    arrayList.add(obj);
                }
            }
            return (kotlin.reflect.x.internal.l0.b.b) r.R(arrayList);
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final kotlin.reflect.x.internal.l0.f.b a() {
            return e.f19767e;
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<h> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f19773g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f19773g = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            List e2;
            Set<d> d2;
            m mVar = (m) e.this.f19769g.invoke(e.this.f19768f);
            f fVar = e.f19766d;
            d0 d0Var = d0.ABSTRACT;
            kotlin.reflect.jvm.internal.impl.descriptors.f fVar2 = kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE;
            e2 = s.e(e.this.f19768f.o().i());
            h hVar = new h(mVar, fVar, d0Var, fVar2, e2, z0.a, false, this.f19773g);
            kotlin.reflect.x.internal.l0.b.q.a aVar = new kotlin.reflect.x.internal.l0.b.q.a(this.f19773g, hVar);
            d2 = u0.d();
            hVar.L0(aVar, d2, null);
            return hVar;
        }
    }

    static {
        kotlin.reflect.x.internal.l0.f.d dVar = k.a.f19712d;
        f i2 = dVar.i();
        l.e(i2, "cloneable.shortName()");
        f19766d = i2;
        kotlin.reflect.x.internal.l0.f.b m = kotlin.reflect.x.internal.l0.f.b.m(dVar.l());
        l.e(m, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f19767e = m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(n nVar, g0 g0Var, Function1<? super g0, ? extends m> function1) {
        l.f(nVar, "storageManager");
        l.f(g0Var, "moduleDescriptor");
        l.f(function1, "computeContainingDeclaration");
        this.f19768f = g0Var;
        this.f19769g = function1;
        this.f19770h = nVar.d(new c(nVar));
    }

    private final h i() {
        return (h) kotlin.reflect.x.internal.l0.k.m.a(this.f19770h, this, f19764b[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.b
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(kotlin.reflect.x.internal.l0.f.c cVar) {
        Set d2;
        Set c2;
        l.f(cVar, "packageFqName");
        if (l.a(cVar, f19765c)) {
            c2 = t0.c(i());
            return c2;
        }
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.b
    public boolean b(kotlin.reflect.x.internal.l0.f.c cVar, f fVar) {
        l.f(cVar, "packageFqName");
        l.f(fVar, "name");
        return l.a(fVar, f19766d) && l.a(cVar, f19765c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.b
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(kotlin.reflect.x.internal.l0.f.b bVar) {
        l.f(bVar, "classId");
        if (l.a(bVar, f19767e)) {
            return i();
        }
        return null;
    }

    public /* synthetic */ e(n nVar, g0 g0Var, Function1 function1, int i2, g gVar) {
        this(nVar, g0Var, (i2 & 4) != 0 ? a.f19771f : function1);
    }
}
