package m6;

import kotlin.jvm.internal.Z;
import l6.InterfaceC3359g;
import n6.J;

/* loaded from: classes5.dex */
public abstract class f {
    public static final /* synthetic */ InterfaceC3359g a(InterfaceC3359g interfaceC3359g, P5.g gVar) {
        return d(interfaceC3359g, gVar);
    }

    public static final Object b(P5.g gVar, Object obj, Object obj2, X5.n nVar, P5.d dVar) {
        Object c8 = J.c(gVar, obj2);
        try {
            Object invoke = ((X5.n) Z.d(nVar, 2)).invoke(obj, new x(dVar, gVar));
            J.a(gVar, c8);
            if (invoke == Q5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            J.a(gVar, c8);
            throw th;
        }
    }

    public static /* synthetic */ Object c(P5.g gVar, Object obj, Object obj2, X5.n nVar, P5.d dVar, int i8, Object obj3) {
        if ((i8 & 4) != 0) {
            obj2 = J.b(gVar);
        }
        return b(gVar, obj, obj2, nVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3359g d(InterfaceC3359g interfaceC3359g, P5.g gVar) {
        boolean z8;
        if (interfaceC3359g instanceof w) {
            z8 = true;
        } else {
            z8 = interfaceC3359g instanceof r;
        }
        if (!z8) {
            return new z(interfaceC3359g, gVar);
        }
        return interfaceC3359g;
    }
}
