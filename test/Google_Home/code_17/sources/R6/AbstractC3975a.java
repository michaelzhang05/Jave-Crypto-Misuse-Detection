package r6;

import O5.I;
import O5.s;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import q6.AbstractC3876k;

/* renamed from: r6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC3975a {
    private static final void a(d dVar, Throwable th) {
        s.a aVar = s.f8302b;
        dVar.resumeWith(s.b(t.a(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) {
        try {
            d c8 = T5.b.c(dVar);
            s.a aVar = s.f8302b;
            AbstractC3876k.c(c8, s.b(I.f8278a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(InterfaceC1668n interfaceC1668n, Object obj, d dVar, Function1 function1) {
        try {
            d c8 = T5.b.c(T5.b.a(interfaceC1668n, obj, dVar));
            s.a aVar = s.f8302b;
            AbstractC3876k.b(c8, s.b(I.f8278a), function1);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(InterfaceC1668n interfaceC1668n, Object obj, d dVar, Function1 function1, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            function1 = null;
        }
        c(interfaceC1668n, obj, dVar, function1);
    }
}
