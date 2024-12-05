package kotlin.reflect.x.internal.l0.d.b;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.collections.t0;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.x.internal.l0.d.b.c0.a;
import kotlin.reflect.x.internal.l0.e.a0.b.e;
import kotlin.reflect.x.internal.l0.e.a0.b.i;
import kotlin.reflect.x.internal.l0.e.c;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.j.b.k;

/* compiled from: DeserializedDescriptorResolver.kt */
/* loaded from: classes2.dex */
public final class g {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Set<a.EnumC0304a> f20296b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<a.EnumC0304a> f20297c;

    /* renamed from: d, reason: collision with root package name */
    private static final e f20298d;

    /* renamed from: e, reason: collision with root package name */
    private static final e f20299e;

    /* renamed from: f, reason: collision with root package name */
    private static final e f20300f;

    /* renamed from: g, reason: collision with root package name */
    public k f20301g;

    /* compiled from: DeserializedDescriptorResolver.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final e a() {
            return g.f20300f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeserializedDescriptorResolver.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function0<Collection<? extends f>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f20302f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<f> invoke() {
            List i2;
            i2 = t.i();
            return i2;
        }
    }

    static {
        Set<a.EnumC0304a> c2;
        Set<a.EnumC0304a> g2;
        c2 = t0.c(a.EnumC0304a.CLASS);
        f20296b = c2;
        g2 = u0.g(a.EnumC0304a.FILE_FACADE, a.EnumC0304a.MULTIFILE_CLASS_PART);
        f20297c = g2;
        f20298d = new e(1, 1, 2);
        f20299e = new e(1, 1, 11);
        f20300f = new e(1, 1, 13);
    }

    private final kotlin.reflect.x.internal.l0.j.b.g0.e c(q qVar) {
        return d().g().b() ? kotlin.reflect.x.internal.l0.j.b.g0.e.STABLE : qVar.a().j() ? kotlin.reflect.x.internal.l0.j.b.g0.e.FIR_UNSTABLE : qVar.a().k() ? kotlin.reflect.x.internal.l0.j.b.g0.e.IR_UNSTABLE : kotlin.reflect.x.internal.l0.j.b.g0.e.STABLE;
    }

    private final kotlin.reflect.x.internal.l0.j.b.t<e> e(q qVar) {
        if (f() || qVar.a().d().h()) {
            return null;
        }
        return new kotlin.reflect.x.internal.l0.j.b.t<>(qVar.a().d(), e.f20398h, qVar.getLocation(), qVar.c());
    }

    private final boolean f() {
        return d().g().d();
    }

    private final boolean g(q qVar) {
        return !d().g().c() && qVar.a().i() && l.a(qVar.a().d(), f20299e);
    }

    private final boolean h(q qVar) {
        return (d().g().e() && (qVar.a().i() || l.a(qVar.a().d(), f20298d))) || g(qVar);
    }

    private final String[] j(q qVar, Set<? extends a.EnumC0304a> set) {
        kotlin.reflect.x.internal.l0.d.b.c0.a a2 = qVar.a();
        String[] a3 = a2.a();
        if (a3 == null) {
            a3 = a2.b();
        }
        if (a3 == null || !set.contains(a2.c())) {
            return null;
        }
        return a3;
    }

    public final h b(k0 k0Var, q qVar) {
        String[] g2;
        Pair<kotlin.reflect.x.internal.l0.e.a0.b.f, kotlin.reflect.x.internal.l0.e.l> pair;
        l.f(k0Var, "descriptor");
        l.f(qVar, "kotlinClass");
        String[] j2 = j(qVar, f20297c);
        if (j2 == null || (g2 = qVar.a().g()) == null) {
            return null;
        }
        try {
            try {
                pair = i.m(j2, g2);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from " + qVar.getLocation(), e2);
            }
        } catch (Throwable th) {
            if (f() || qVar.a().d().h()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        kotlin.reflect.x.internal.l0.e.a0.b.f a2 = pair.a();
        kotlin.reflect.x.internal.l0.e.l b2 = pair.b();
        k kVar = new k(qVar, b2, a2, e(qVar), h(qVar), c(qVar));
        return new kotlin.reflect.x.internal.l0.j.b.g0.i(k0Var, b2, a2, qVar.a().d(), kVar, d(), "scope for " + kVar + " in " + k0Var, b.f20302f);
    }

    public final k d() {
        k kVar = this.f20301g;
        if (kVar != null) {
            return kVar;
        }
        l.v("components");
        return null;
    }

    public final kotlin.reflect.x.internal.l0.j.b.g i(q qVar) {
        String[] g2;
        Pair<kotlin.reflect.x.internal.l0.e.a0.b.f, c> pair;
        l.f(qVar, "kotlinClass");
        String[] j2 = j(qVar, f20296b);
        if (j2 == null || (g2 = qVar.a().g()) == null) {
            return null;
        }
        try {
            try {
                pair = i.i(j2, g2);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from " + qVar.getLocation(), e2);
            }
        } catch (Throwable th) {
            if (f() || qVar.a().d().h()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new kotlin.reflect.x.internal.l0.j.b.g(pair.a(), pair.b(), qVar.a().d(), new s(qVar, e(qVar), h(qVar), c(qVar)));
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.e k(q qVar) {
        l.f(qVar, "kotlinClass");
        kotlin.reflect.x.internal.l0.j.b.g i2 = i(qVar);
        if (i2 == null) {
            return null;
        }
        return d().f().d(qVar.c(), i2);
    }

    public final void l(e eVar) {
        l.f(eVar, "components");
        m(eVar.a());
    }

    public final void m(k kVar) {
        l.f(kVar, "<set-?>");
        this.f20301g = kVar;
    }
}
