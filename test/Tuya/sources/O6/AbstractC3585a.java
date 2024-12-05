package o6;

import L5.I;
import L5.s;
import L5.t;
import P5.d;
import X5.n;
import kotlin.jvm.functions.Function1;
import n6.AbstractC3497k;

/* renamed from: o6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC3585a {
    private static final void a(d dVar, Throwable th) {
        s.a aVar = s.f6511b;
        dVar.resumeWith(s.b(t.a(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) {
        try {
            d c8 = Q5.b.c(dVar);
            s.a aVar = s.f6511b;
            AbstractC3497k.c(c8, s.b(I.f6487a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(n nVar, Object obj, d dVar, Function1 function1) {
        try {
            d c8 = Q5.b.c(Q5.b.a(nVar, obj, dVar));
            s.a aVar = s.f6511b;
            AbstractC3497k.b(c8, s.b(I.f6487a), function1);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(n nVar, Object obj, d dVar, Function1 function1, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            function1 = null;
        }
        c(nVar, obj, dVar, function1);
    }
}
