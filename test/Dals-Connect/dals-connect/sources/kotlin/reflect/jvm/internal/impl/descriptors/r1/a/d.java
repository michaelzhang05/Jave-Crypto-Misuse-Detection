package kotlin.reflect.jvm.internal.impl.descriptors.r1.a;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.w;
import kotlin.reflect.x.internal.l0.d.a.o;
import kotlin.text.u;

/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes2.dex */
public final class d implements o {
    private final ClassLoader a;

    public d(ClassLoader classLoader) {
        kotlin.jvm.internal.l.f(classLoader, "classLoader");
        this.a = classLoader;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o
    public kotlin.reflect.x.internal.l0.d.a.n0.g a(o.b bVar) {
        String v;
        kotlin.jvm.internal.l.f(bVar, "request");
        kotlin.reflect.x.internal.l0.f.b a = bVar.a();
        kotlin.reflect.x.internal.l0.f.c h2 = a.h();
        kotlin.jvm.internal.l.e(h2, "classId.packageFqName");
        String b2 = a.i().b();
        kotlin.jvm.internal.l.e(b2, "classId.relativeClassName.asString()");
        v = u.v(b2, '.', '$', false, 4, null);
        if (!h2.d()) {
            v = h2.b() + '.' + v;
        }
        Class<?> a2 = e.a(this.a, v);
        if (a2 != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l(a2);
        }
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o
    public Set<String> b(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "packageFqName");
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o
    public kotlin.reflect.x.internal.l0.d.a.n0.u c(kotlin.reflect.x.internal.l0.f.c cVar, boolean z) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        return new w(cVar);
    }
}
