package kotlin.reflect.x.internal.l0.d.a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.d;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.t1.u;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f19884f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "it");
            return Boolean.valueOf(i.a.b(kotlin.reflect.x.internal.l0.i.t.a.o(bVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f19885f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "it");
            return Boolean.valueOf(e.n.j((y0) bVar));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f19886f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "it");
            return Boolean.valueOf(h.f0(bVar) && f.m(bVar) != null);
        }
    }

    public static final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l.f(bVar, "<this>");
        return d(bVar) != null;
    }

    public static final String b(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.b o;
        f i2;
        l.f(bVar, "callableMemberDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.b c2 = c(bVar);
        if (c2 == null || (o = kotlin.reflect.x.internal.l0.i.t.a.o(c2)) == null) {
            return null;
        }
        if (o instanceof t0) {
            return i.a.a(o);
        }
        if (!(o instanceof y0) || (i2 = e.n.i((y0) o)) == null) {
            return null;
        }
        return i2.f();
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.b c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (h.f0(bVar)) {
            return d(bVar);
        }
        return null;
    }

    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.b> T d(T t) {
        l.f(t, "<this>");
        if (!h0.a.g().contains(t.getName()) && !g.a.d().contains(kotlin.reflect.x.internal.l0.i.t.a.o(t).getName())) {
            return null;
        }
        if (t instanceof t0 ? true : t instanceof s0) {
            return (T) kotlin.reflect.x.internal.l0.i.t.a.c(t, false, a.f19884f, 1, null);
        }
        if (t instanceof y0) {
            return (T) kotlin.reflect.x.internal.l0.i.t.a.c(t, false, b.f19885f, 1, null);
        }
        return null;
    }

    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.b> T e(T t) {
        l.f(t, "<this>");
        T t2 = (T) d(t);
        if (t2 != null) {
            return t2;
        }
        f fVar = f.n;
        f name = t.getName();
        l.e(name, "name");
        if (fVar.l(name)) {
            return (T) kotlin.reflect.x.internal.l0.i.t.a.c(t, false, c.f19886f, 1, null);
        }
        return null;
    }

    public static final boolean f(e eVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l.f(eVar, "<this>");
        l.f(aVar, "specialCallableDescriptor");
        m b2 = aVar.b();
        l.d(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        m0 s = ((e) b2).s();
        l.e(s, "specialCallableDescripto…ssDescriptor).defaultType");
        e s2 = d.s(eVar);
        while (true) {
            if (s2 == null) {
                return false;
            }
            if (!(s2 instanceof kotlin.reflect.x.internal.l0.d.a.k0.c)) {
                if (u.b(s2.s(), s) != null) {
                    return !h.f0(s2);
                }
            }
            s2 = d.s(s2);
        }
    }

    public static final boolean g(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l.f(bVar, "<this>");
        return kotlin.reflect.x.internal.l0.i.t.a.o(bVar).b() instanceof kotlin.reflect.x.internal.l0.d.a.k0.c;
    }

    public static final boolean h(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l.f(bVar, "<this>");
        return g(bVar) || h.f0(bVar);
    }
}
