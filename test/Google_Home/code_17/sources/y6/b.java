package y6;

import A6.m0;
import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class b {
    public static final InterfaceC2963c a(f fVar) {
        AbstractC3255y.i(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f41021b;
        }
        if (fVar instanceof m0) {
            return a(((m0) fVar).j());
        }
        return null;
    }

    public static final f b(D6.b bVar, f descriptor) {
        w6.b c8;
        AbstractC3255y.i(bVar, "<this>");
        AbstractC3255y.i(descriptor, "descriptor");
        InterfaceC2963c a8 = a(descriptor);
        if (a8 == null || (c8 = D6.b.c(bVar, a8, null, 2, null)) == null) {
            return null;
        }
        return c8.a();
    }

    public static final f c(f fVar, InterfaceC2963c context) {
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(context, "context");
        return new c(fVar, context);
    }
}
