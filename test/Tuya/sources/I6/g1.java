package i6;

import n6.AbstractC3497k;
import n6.C3496j;

/* loaded from: classes5.dex */
public abstract class g1 {
    public static final Object a(P5.d dVar) {
        C3496j c3496j;
        Object obj;
        P5.g context = dVar.getContext();
        B0.j(context);
        P5.d c8 = Q5.b.c(dVar);
        if (c8 instanceof C3496j) {
            c3496j = (C3496j) c8;
        } else {
            c3496j = null;
        }
        if (c3496j == null) {
            obj = L5.I.f6487a;
        } else {
            if (c3496j.f36266d.isDispatchNeeded(context)) {
                c3496j.m(context, L5.I.f6487a);
            } else {
                f1 f1Var = new f1();
                P5.g plus = context.plus(f1Var);
                L5.I i8 = L5.I.f6487a;
                c3496j.m(plus, i8);
                if (f1Var.f31770a) {
                    if (AbstractC3497k.d(c3496j)) {
                        obj = Q5.b.e();
                    } else {
                        obj = i8;
                    }
                }
            }
            obj = Q5.b.e();
        }
        if (obj == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (obj == Q5.b.e()) {
            return obj;
        }
        return L5.I.f6487a;
    }
}
