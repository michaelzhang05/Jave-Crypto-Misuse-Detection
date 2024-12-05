package kotlin.reflect.x.internal.l0.b;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.c.b.d;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.s0;

/* compiled from: ReflectionTypes.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    private final j0 f19690c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f19691d;

    /* renamed from: e, reason: collision with root package name */
    private final a f19692e;

    /* renamed from: f, reason: collision with root package name */
    private final a f19693f;

    /* renamed from: g, reason: collision with root package name */
    private final a f19694g;

    /* renamed from: h, reason: collision with root package name */
    private final a f19695h;

    /* renamed from: i, reason: collision with root package name */
    private final a f19696i;

    /* renamed from: j, reason: collision with root package name */
    private final a f19697j;

    /* renamed from: k, reason: collision with root package name */
    private final a f19698k;
    private final a l;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f19689b = {b0.g(new v(b0.b(j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), b0.g(new v(b0.b(j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), b0.g(new v(b0.b(j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), b0.g(new v(b0.b(j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), b0.g(new v(b0.b(j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), b0.g(new v(b0.b(j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), b0.g(new v(b0.b(j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), b0.g(new v(b0.b(j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    public static final b a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReflectionTypes.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private final int a;

        public a(int i2) {
            this.a = i2;
        }

        public final e a(j jVar, KProperty<?> kProperty) {
            l.f(jVar, "types");
            l.f(kProperty, "property");
            return jVar.b(kotlin.reflect.x.internal.l0.m.u.a.a(kProperty.getM()), this.a);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final e0 a(g0 g0Var) {
            List e2;
            l.f(g0Var, "module");
            e a = x.a(g0Var, k.a.s0);
            if (a == null) {
                return null;
            }
            a1 h2 = a1.f21185g.h();
            List<e1> parameters = a.g().getParameters();
            l.e(parameters, "kPropertyClass.typeConstructor.parameters");
            Object n0 = r.n0(parameters);
            l.e(n0, "kPropertyClass.typeConstructor.parameters.single()");
            e2 = s.e(new s0((e1) n0));
            return f0.g(h2, a, e2);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<h> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f19699f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g0 g0Var) {
            super(0);
            this.f19699f = g0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return this.f19699f.N(k.o).q();
        }
    }

    public j(g0 g0Var, j0 j0Var) {
        Lazy a2;
        l.f(g0Var, "module");
        l.f(j0Var, "notFoundClasses");
        this.f19690c = j0Var;
        a2 = i.a(LazyThreadSafetyMode.PUBLICATION, new c(g0Var));
        this.f19691d = a2;
        this.f19692e = new a(1);
        this.f19693f = new a(1);
        this.f19694g = new a(1);
        this.f19695h = new a(2);
        this.f19696i = new a(3);
        this.f19697j = new a(1);
        this.f19698k = new a(2);
        this.l = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e b(String str, int i2) {
        List<Integer> e2;
        f r = f.r(str);
        l.e(r, "identifier(className)");
        kotlin.reflect.jvm.internal.impl.descriptors.h f2 = d().f(r, d.FROM_REFLECTION);
        e eVar = f2 instanceof e ? (e) f2 : null;
        if (eVar != null) {
            return eVar;
        }
        j0 j0Var = this.f19690c;
        kotlin.reflect.x.internal.l0.f.b bVar = new kotlin.reflect.x.internal.l0.f.b(k.o, r);
        e2 = s.e(Integer.valueOf(i2));
        return j0Var.d(bVar, e2);
    }

    private final h d() {
        return (h) this.f19691d.getValue();
    }

    public final e c() {
        return this.f19692e.a(this, f19689b[0]);
    }
}
