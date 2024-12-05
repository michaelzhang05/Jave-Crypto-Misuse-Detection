package C6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.j;
import y6.k;

/* loaded from: classes5.dex */
public abstract class V {
    public static final y6.f a(y6.f fVar, D6.b module) {
        y6.f a8;
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(module, "module");
        if (AbstractC3255y.d(fVar.getKind(), j.a.f41055a)) {
            y6.f b8 = y6.b.b(module, fVar);
            if (b8 != null && (a8 = a(b8, module)) != null) {
                return a8;
            }
            return fVar;
        }
        if (fVar.isInline()) {
            return a(fVar.h(0), module);
        }
        return fVar;
    }

    public static final U b(B6.a aVar, y6.f desc) {
        AbstractC3255y.i(aVar, "<this>");
        AbstractC3255y.i(desc, "desc");
        y6.j kind = desc.getKind();
        if (kind instanceof y6.d) {
            return U.f1660f;
        }
        if (AbstractC3255y.d(kind, k.b.f41058a)) {
            return U.f1658d;
        }
        if (AbstractC3255y.d(kind, k.c.f41059a)) {
            y6.f a8 = a(desc.h(0), aVar.e());
            y6.j kind2 = a8.getKind();
            if (!(kind2 instanceof y6.e) && !AbstractC3255y.d(kind2, j.b.f41056a)) {
                if (aVar.d().b()) {
                    return U.f1658d;
                }
                throw B.c(a8);
            }
            return U.f1659e;
        }
        return U.f1657c;
    }
}
