package q6;

import O5.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import l6.AbstractC3343G;
import l6.AbstractC3359h0;
import l6.InterfaceC3390x0;
import l6.X0;
import l6.c1;

/* renamed from: q6.k */
/* loaded from: classes5.dex */
public abstract class AbstractC3876k {

    /* renamed from: a */
    private static final C3865F f38398a = new C3865F("UNDEFINED");

    /* renamed from: b */
    public static final C3865F f38399b = new C3865F("REUSABLE_CLAIMED");

    public static final void b(S5.d dVar, Object obj, Function1 function1) {
        c1 c1Var;
        if (dVar instanceof C3875j) {
            C3875j c3875j = (C3875j) dVar;
            Object b8 = AbstractC3343G.b(obj, function1);
            if (c3875j.f38394d.isDispatchNeeded(c3875j.getContext())) {
                c3875j.f38396f = b8;
                c3875j.f34591c = 1;
                c3875j.f38394d.dispatch(c3875j.getContext(), c3875j);
                return;
            }
            AbstractC3359h0 b9 = X0.f34587a.b();
            if (b9.L()) {
                c3875j.f38396f = b8;
                c3875j.f34591c = 1;
                b9.H(c3875j);
                return;
            }
            b9.J(true);
            try {
                InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) c3875j.getContext().get(InterfaceC3390x0.f34661n0);
                if (interfaceC3390x0 != null && !interfaceC3390x0.isActive()) {
                    CancellationException o8 = interfaceC3390x0.o();
                    c3875j.c(b8, o8);
                    s.a aVar = O5.s.f8302b;
                    c3875j.resumeWith(O5.s.b(O5.t.a(o8)));
                } else {
                    S5.d dVar2 = c3875j.f38395e;
                    Object obj2 = c3875j.f38397g;
                    S5.g context = dVar2.getContext();
                    Object c8 = J.c(context, obj2);
                    if (c8 != J.f38367a) {
                        c1Var = l6.H.g(dVar2, context, c8);
                    } else {
                        c1Var = null;
                    }
                    try {
                        c3875j.f38395e.resumeWith(obj);
                        O5.I i8 = O5.I.f8278a;
                    } finally {
                        if (c1Var == null || c1Var.N0()) {
                            J.a(context, c8);
                        }
                    }
                }
                do {
                } while (b9.O());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static /* synthetic */ void c(S5.d dVar, Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        b(dVar, obj, function1);
    }

    public static final boolean d(C3875j c3875j) {
        O5.I i8 = O5.I.f8278a;
        AbstractC3359h0 b8 = X0.f34587a.b();
        if (b8.M()) {
            return false;
        }
        if (b8.L()) {
            c3875j.f38396f = i8;
            c3875j.f34591c = 1;
            b8.H(c3875j);
            return true;
        }
        b8.J(true);
        try {
            c3875j.run();
            do {
            } while (b8.O());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
