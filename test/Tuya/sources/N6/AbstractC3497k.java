package n6;

import L5.s;
import i6.AbstractC2808G;
import i6.AbstractC2824h0;
import i6.InterfaceC2855x0;
import i6.X0;
import i6.c1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* renamed from: n6.k */
/* loaded from: classes5.dex */
public abstract class AbstractC3497k {

    /* renamed from: a */
    private static final C3486F f36270a = new C3486F("UNDEFINED");

    /* renamed from: b */
    public static final C3486F f36271b = new C3486F("REUSABLE_CLAIMED");

    public static final void b(P5.d dVar, Object obj, Function1 function1) {
        c1 c1Var;
        if (dVar instanceof C3496j) {
            C3496j c3496j = (C3496j) dVar;
            Object c8 = AbstractC2808G.c(obj, function1);
            if (c3496j.f36266d.isDispatchNeeded(c3496j.getContext())) {
                c3496j.f36268f = c8;
                c3496j.f31739c = 1;
                c3496j.f36266d.dispatch(c3496j.getContext(), c3496j);
                return;
            }
            AbstractC2824h0 b8 = X0.f31735a.b();
            if (b8.L()) {
                c3496j.f36268f = c8;
                c3496j.f31739c = 1;
                b8.H(c3496j);
                return;
            }
            b8.J(true);
            try {
                InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) c3496j.getContext().get(InterfaceC2855x0.f31809n0);
                if (interfaceC2855x0 != null && !interfaceC2855x0.isActive()) {
                    CancellationException m8 = interfaceC2855x0.m();
                    c3496j.c(c8, m8);
                    s.a aVar = L5.s.f6511b;
                    c3496j.resumeWith(L5.s.b(L5.t.a(m8)));
                } else {
                    P5.d dVar2 = c3496j.f36267e;
                    Object obj2 = c3496j.f36269g;
                    P5.g context = dVar2.getContext();
                    Object c9 = J.c(context, obj2);
                    if (c9 != J.f36239a) {
                        c1Var = i6.H.g(dVar2, context, c9);
                    } else {
                        c1Var = null;
                    }
                    try {
                        c3496j.f36267e.resumeWith(obj);
                        L5.I i8 = L5.I.f6487a;
                    } finally {
                        if (c1Var == null || c1Var.O0()) {
                            J.a(context, c9);
                        }
                    }
                }
                do {
                } while (b8.O());
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

    public static /* synthetic */ void c(P5.d dVar, Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        b(dVar, obj, function1);
    }

    public static final boolean d(C3496j c3496j) {
        L5.I i8 = L5.I.f6487a;
        AbstractC2824h0 b8 = X0.f31735a.b();
        if (b8.M()) {
            return false;
        }
        if (b8.L()) {
            c3496j.f36268f = i8;
            c3496j.f31739c = 1;
            b8.H(c3496j);
            return true;
        }
        b8.J(true);
        try {
            c3496j.run();
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
