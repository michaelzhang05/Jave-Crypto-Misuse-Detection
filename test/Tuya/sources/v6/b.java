package v6;

import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;
import x6.m0;

/* loaded from: classes5.dex */
public abstract class b {
    public static final InterfaceC2643c a(f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f38890b;
        }
        if (fVar instanceof m0) {
            return a(((m0) fVar).j());
        }
        return null;
    }

    public static final f b(A6.b bVar, f descriptor) {
        t6.b c8;
        AbstractC3159y.i(bVar, "<this>");
        AbstractC3159y.i(descriptor, "descriptor");
        InterfaceC2643c a8 = a(descriptor);
        if (a8 == null || (c8 = A6.b.c(bVar, a8, null, 2, null)) == null) {
            return null;
        }
        return c8.a();
    }

    public static final f c(f fVar, InterfaceC2643c context) {
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(context, "context");
        return new c(fVar, context);
    }
}
