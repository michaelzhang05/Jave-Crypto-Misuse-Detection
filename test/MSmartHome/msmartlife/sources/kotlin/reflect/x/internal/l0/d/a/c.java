package kotlin.reflect.x.internal.l0.d.a;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.reflect.x.internal.l0.d.a.o0.h;
import kotlin.reflect.x.internal.l0.d.a.o0.i;
import kotlin.s;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes2.dex */
public final class c {
    private static final kotlin.reflect.x.internal.l0.f.c a = new kotlin.reflect.x.internal.l0.f.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.c f19859b = new kotlin.reflect.x.internal.l0.f.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.c f19860c = new kotlin.reflect.x.internal.l0.f.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d, reason: collision with root package name */
    private static final kotlin.reflect.x.internal.l0.f.c f19861d = new kotlin.reflect.x.internal.l0.f.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e, reason: collision with root package name */
    private static final List<b> f19862e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<kotlin.reflect.x.internal.l0.f.c, q> f19863f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<kotlin.reflect.x.internal.l0.f.c, q> f19864g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<kotlin.reflect.x.internal.l0.f.c> f19865h;

    static {
        List<b> l;
        Map<kotlin.reflect.x.internal.l0.f.c, q> f2;
        List e2;
        List e3;
        Map l2;
        Map<kotlin.reflect.x.internal.l0.f.c, q> n;
        Set<kotlin.reflect.x.internal.l0.f.c> g2;
        b bVar = b.VALUE_PARAMETER;
        l = t.l(b.FIELD, b.METHOD_RETURN_TYPE, bVar, b.TYPE_PARAMETER_BOUNDS, b.TYPE_USE);
        f19862e = l;
        kotlin.reflect.x.internal.l0.f.c i2 = b0.i();
        h hVar = h.NOT_NULL;
        f2 = n0.f(s.a(i2, new q(new i(hVar, false, 2, null), l, false)));
        f19863f = f2;
        kotlin.reflect.x.internal.l0.f.c cVar = new kotlin.reflect.x.internal.l0.f.c("javax.annotation.ParametersAreNullableByDefault");
        i iVar = new i(h.NULLABLE, false, 2, null);
        e2 = kotlin.collections.s.e(bVar);
        kotlin.reflect.x.internal.l0.f.c cVar2 = new kotlin.reflect.x.internal.l0.f.c("javax.annotation.ParametersAreNonnullByDefault");
        i iVar2 = new i(hVar, false, 2, null);
        e3 = kotlin.collections.s.e(bVar);
        l2 = o0.l(s.a(cVar, new q(iVar, e2, false, 4, null)), s.a(cVar2, new q(iVar2, e3, false, 4, null)));
        n = o0.n(l2, f2);
        f19864g = n;
        g2 = u0.g(b0.f(), b0.e());
        f19865h = g2;
    }

    public static final Map<kotlin.reflect.x.internal.l0.f.c, q> a() {
        return f19864g;
    }

    public static final Set<kotlin.reflect.x.internal.l0.f.c> b() {
        return f19865h;
    }

    public static final Map<kotlin.reflect.x.internal.l0.f.c, q> c() {
        return f19863f;
    }

    public static final kotlin.reflect.x.internal.l0.f.c d() {
        return f19861d;
    }

    public static final kotlin.reflect.x.internal.l0.f.c e() {
        return f19860c;
    }

    public static final kotlin.reflect.x.internal.l0.f.c f() {
        return f19859b;
    }

    public static final kotlin.reflect.x.internal.l0.f.c g() {
        return a;
    }
}
