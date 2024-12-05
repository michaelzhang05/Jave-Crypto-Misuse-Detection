package kotlin.reflect.x.internal.l0.b.q;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.collections.t0;
import kotlin.collections.u0;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.i.t.a;

/* compiled from: JavaToKotlinClassMapper.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public static /* synthetic */ e f(d dVar, c cVar, h hVar, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, hVar, num);
    }

    public final e a(e eVar) {
        l.f(eVar, "mutable");
        c o = c.a.o(kotlin.reflect.x.internal.l0.i.d.m(eVar));
        if (o != null) {
            e o2 = a.f(eVar).o(o);
            l.e(o2, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o2;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a mutable collection");
    }

    public final e b(e eVar) {
        l.f(eVar, "readOnly");
        c p = c.a.p(kotlin.reflect.x.internal.l0.i.d.m(eVar));
        if (p != null) {
            e o = a.f(eVar).o(p);
            l.e(o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public final boolean c(e eVar) {
        l.f(eVar, "mutable");
        return c.a.k(kotlin.reflect.x.internal.l0.i.d.m(eVar));
    }

    public final boolean d(e eVar) {
        l.f(eVar, "readOnly");
        return c.a.l(kotlin.reflect.x.internal.l0.i.d.m(eVar));
    }

    public final e e(c cVar, h hVar, Integer num) {
        l.f(cVar, "fqName");
        l.f(hVar, "builtIns");
        b m = (num == null || !l.a(cVar, c.a.h())) ? c.a.m(cVar) : k.a(num.intValue());
        if (m != null) {
            return hVar.o(m.b());
        }
        return null;
    }

    public final Collection<e> g(c cVar, h hVar) {
        List l;
        Set c2;
        Set d2;
        l.f(cVar, "fqName");
        l.f(hVar, "builtIns");
        e f2 = f(this, cVar, hVar, null, 4, null);
        if (f2 == null) {
            d2 = u0.d();
            return d2;
        }
        c p = c.a.p(a.i(f2));
        if (p == null) {
            c2 = t0.c(f2);
            return c2;
        }
        e o = hVar.o(p);
        l.e(o, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        l = t.l(f2, o);
        return l;
    }
}
