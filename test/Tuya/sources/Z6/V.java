package z6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.j;
import v6.k;
import y6.AbstractC3999a;

/* loaded from: classes5.dex */
public abstract class V {
    public static final v6.f a(v6.f fVar, A6.b module) {
        v6.f a8;
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(module, "module");
        if (AbstractC3159y.d(fVar.getKind(), j.a.f38924a)) {
            v6.f b8 = v6.b.b(module, fVar);
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

    public static final U b(AbstractC3999a abstractC3999a, v6.f desc) {
        AbstractC3159y.i(abstractC3999a, "<this>");
        AbstractC3159y.i(desc, "desc");
        v6.j kind = desc.getKind();
        if (kind instanceof v6.d) {
            return U.f40542f;
        }
        if (AbstractC3159y.d(kind, k.b.f38927a)) {
            return U.f40540d;
        }
        if (AbstractC3159y.d(kind, k.c.f38928a)) {
            v6.f a8 = a(desc.h(0), abstractC3999a.e());
            v6.j kind2 = a8.getKind();
            if (!(kind2 instanceof v6.e) && !AbstractC3159y.d(kind2, j.b.f38925a)) {
                if (abstractC3999a.d().b()) {
                    return U.f40540d;
                }
                throw AbstractC4031B.c(a8);
            }
            return U.f40541e;
        }
        return U.f40539c;
    }
}
