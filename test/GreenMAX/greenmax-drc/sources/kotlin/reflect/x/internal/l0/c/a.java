package kotlin.reflect.x.internal.l0.c;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.c.b.c;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.d;

/* compiled from: utils.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final void a(c cVar, b bVar, e eVar, f fVar) {
        kotlin.reflect.x.internal.l0.c.b.a location;
        l.f(cVar, "<this>");
        l.f(bVar, "from");
        l.f(eVar, "scopeOwner");
        l.f(fVar, "name");
        if (cVar == c.a.a || (location = bVar.getLocation()) == null) {
            return;
        }
        kotlin.reflect.x.internal.l0.c.b.e position = cVar.a() ? location.getPosition() : kotlin.reflect.x.internal.l0.c.b.e.f19822f.a();
        String a = location.a();
        String b2 = d.m(eVar).b();
        l.e(b2, "getFqName(scopeOwner).asString()");
        kotlin.reflect.x.internal.l0.c.b.f fVar2 = kotlin.reflect.x.internal.l0.c.b.f.CLASSIFIER;
        String f2 = fVar.f();
        l.e(f2, "name.asString()");
        cVar.b(a, position, b2, fVar2, f2);
    }

    public static final void b(c cVar, b bVar, k0 k0Var, f fVar) {
        l.f(cVar, "<this>");
        l.f(bVar, "from");
        l.f(k0Var, "scopeOwner");
        l.f(fVar, "name");
        String b2 = k0Var.d().b();
        l.e(b2, "scopeOwner.fqName.asString()");
        String f2 = fVar.f();
        l.e(f2, "name.asString()");
        c(cVar, bVar, b2, f2);
    }

    public static final void c(c cVar, b bVar, String str, String str2) {
        kotlin.reflect.x.internal.l0.c.b.a location;
        l.f(cVar, "<this>");
        l.f(bVar, "from");
        l.f(str, "packageFqName");
        l.f(str2, "name");
        if (cVar == c.a.a || (location = bVar.getLocation()) == null) {
            return;
        }
        cVar.b(location.a(), cVar.a() ? location.getPosition() : kotlin.reflect.x.internal.l0.c.b.e.f19822f.a(), str, kotlin.reflect.x.internal.l0.c.b.f.PACKAGE, str2);
    }
}
