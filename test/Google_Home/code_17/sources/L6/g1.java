package l6;

import q6.AbstractC3876k;
import q6.C3875j;

/* loaded from: classes5.dex */
public abstract class g1 {
    public static final Object a(S5.d dVar) {
        C3875j c3875j;
        Object obj;
        S5.g context = dVar.getContext();
        B0.j(context);
        S5.d c8 = T5.b.c(dVar);
        if (c8 instanceof C3875j) {
            c3875j = (C3875j) c8;
        } else {
            c3875j = null;
        }
        if (c3875j == null) {
            obj = O5.I.f8278a;
        } else {
            if (c3875j.f38394d.isDispatchNeeded(context)) {
                c3875j.o(context, O5.I.f8278a);
            } else {
                f1 f1Var = new f1();
                S5.g plus = context.plus(f1Var);
                O5.I i8 = O5.I.f8278a;
                c3875j.o(plus, i8);
                if (f1Var.f34622a) {
                    if (AbstractC3876k.d(c3875j)) {
                        obj = T5.b.e();
                    } else {
                        obj = i8;
                    }
                }
            }
            obj = T5.b.e();
        }
        if (obj == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (obj == T5.b.e()) {
            return obj;
        }
        return O5.I.f8278a;
    }
}
