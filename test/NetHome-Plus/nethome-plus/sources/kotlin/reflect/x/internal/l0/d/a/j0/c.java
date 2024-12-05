package kotlin.reflect.x.internal.l0.d.a.j0;

import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.d.a.a0;
import kotlin.reflect.x.internal.l0.d.a.l0.g;
import kotlin.reflect.x.internal.l0.d.a.l0.l.e;
import kotlin.reflect.x.internal.l0.d.a.n0.a;
import kotlin.reflect.x.internal.l0.d.a.n0.d;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.s;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final f f19922b;

    /* renamed from: c, reason: collision with root package name */
    private static final f f19923c;

    /* renamed from: d, reason: collision with root package name */
    private static final f f19924d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<kotlin.reflect.x.internal.l0.f.c, kotlin.reflect.x.internal.l0.f.c> f19925e;

    static {
        Map<kotlin.reflect.x.internal.l0.f.c, kotlin.reflect.x.internal.l0.f.c> l;
        f r = f.r("message");
        l.e(r, "identifier(\"message\")");
        f19922b = r;
        f r2 = f.r("allowedTargets");
        l.e(r2, "identifier(\"allowedTargets\")");
        f19923c = r2;
        f r3 = f.r("value");
        l.e(r3, "identifier(\"value\")");
        f19924d = r3;
        l = o0.l(s.a(k.a.H, a0.f19835d), s.a(k.a.L, a0.f19837f), s.a(k.a.P, a0.f19840i));
        f19925e = l;
    }

    private c() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n1.c f(c cVar, a aVar, g gVar, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return cVar.e(aVar, gVar, z);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.n1.c a(kotlin.reflect.x.internal.l0.f.c cVar, d dVar, g gVar) {
        a e2;
        l.f(cVar, "kotlinName");
        l.f(dVar, "annotationOwner");
        l.f(gVar, "c");
        if (l.a(cVar, k.a.y)) {
            kotlin.reflect.x.internal.l0.f.c cVar2 = a0.f19839h;
            l.e(cVar2, "DEPRECATED_ANNOTATION");
            a e3 = dVar.e(cVar2);
            if (e3 != null || dVar.l()) {
                return new e(e3, gVar);
            }
        }
        kotlin.reflect.x.internal.l0.f.c cVar3 = f19925e.get(cVar);
        if (cVar3 == null || (e2 = dVar.e(cVar3)) == null) {
            return null;
        }
        return f(a, e2, gVar, false, 4, null);
    }

    public final f b() {
        return f19922b;
    }

    public final f c() {
        return f19924d;
    }

    public final f d() {
        return f19923c;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.n1.c e(a aVar, g gVar, boolean z) {
        l.f(aVar, "annotation");
        l.f(gVar, "c");
        b c2 = aVar.c();
        if (l.a(c2, b.m(a0.f19835d))) {
            return new i(aVar, gVar);
        }
        if (l.a(c2, b.m(a0.f19837f))) {
            return new h(aVar, gVar);
        }
        if (l.a(c2, b.m(a0.f19840i))) {
            return new b(gVar, aVar, k.a.P);
        }
        if (l.a(c2, b.m(a0.f19839h))) {
            return null;
        }
        return new e(gVar, aVar, z);
    }
}
