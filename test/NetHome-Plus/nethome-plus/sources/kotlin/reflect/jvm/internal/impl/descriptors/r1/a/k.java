package kotlin.reflect.jvm.internal.impl.descriptors.r1.a;

import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.d.b.e;
import kotlin.u;

/* compiled from: RuntimeModuleData.kt */
/* loaded from: classes2.dex */
public final class k {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.j.b.k f21815b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.r1.a.a f21816c;

    /* compiled from: RuntimeModuleData.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            kotlin.jvm.internal.l.f(classLoader, "classLoader");
            g gVar = new g(classLoader);
            e.a aVar = kotlin.reflect.x.internal.l0.d.b.e.a;
            ClassLoader classLoader2 = u.class.getClassLoader();
            kotlin.jvm.internal.l.e(classLoader2, "Unit::class.java.classLoader");
            e.a.C0309a a = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f21814b, l.a);
            return new k(a.a().a(), new kotlin.reflect.jvm.internal.impl.descriptors.r1.a.a(a.b(), gVar), null);
        }
    }

    private k(kotlin.reflect.x.internal.l0.j.b.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.r1.a.a aVar) {
        this.f21815b = kVar;
        this.f21816c = aVar;
    }

    public /* synthetic */ k(kotlin.reflect.x.internal.l0.j.b.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.r1.a.a aVar, kotlin.jvm.internal.g gVar) {
        this(kVar, aVar);
    }

    public final kotlin.reflect.x.internal.l0.j.b.k a() {
        return this.f21815b;
    }

    public final g0 b() {
        return this.f21815b.p();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.r1.a.a c() {
        return this.f21816c;
    }
}
