package p6;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.Z;
import o6.InterfaceC3707g;
import q6.J;

/* loaded from: classes5.dex */
public abstract class f {
    public static final /* synthetic */ InterfaceC3707g a(InterfaceC3707g interfaceC3707g, S5.g gVar) {
        return d(interfaceC3707g, gVar);
    }

    public static final Object b(S5.g gVar, Object obj, Object obj2, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        Object c8 = J.c(gVar, obj2);
        try {
            Object invoke = ((InterfaceC1668n) Z.d(interfaceC1668n, 2)).invoke(obj, new x(dVar, gVar));
            J.a(gVar, c8);
            if (invoke == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            J.a(gVar, c8);
            throw th;
        }
    }

    public static /* synthetic */ Object c(S5.g gVar, Object obj, Object obj2, InterfaceC1668n interfaceC1668n, S5.d dVar, int i8, Object obj3) {
        if ((i8 & 4) != 0) {
            obj2 = J.b(gVar);
        }
        return b(gVar, obj, obj2, interfaceC1668n, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3707g d(InterfaceC3707g interfaceC3707g, S5.g gVar) {
        boolean z8;
        if (interfaceC3707g instanceof w) {
            z8 = true;
        } else {
            z8 = interfaceC3707g instanceof r;
        }
        if (!z8) {
            return new z(interfaceC3707g, gVar);
        }
        return interfaceC3707g;
    }
}
