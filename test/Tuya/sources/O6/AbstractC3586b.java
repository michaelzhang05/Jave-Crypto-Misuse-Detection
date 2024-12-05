package o6;

import L5.s;
import L5.t;
import P5.d;
import P5.g;
import X5.n;
import i6.C2804C;
import i6.G0;
import i6.Y0;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Z;
import n6.C3482B;
import n6.J;

/* renamed from: o6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3586b {
    public static final void a(n nVar, Object obj, d dVar) {
        d a8 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c8 = J.c(context, null);
            try {
                Object invoke = ((n) Z.d(nVar, 2)).invoke(obj, a8);
                if (invoke != Q5.b.e()) {
                    a8.resumeWith(s.b(invoke));
                }
            } finally {
                J.a(context, c8);
            }
        } catch (Throwable th) {
            s.a aVar = s.f6511b;
            a8.resumeWith(s.b(t.a(th)));
        }
    }

    public static final Object b(C3482B c3482b, Object obj, n nVar) {
        Object c2804c;
        try {
            c2804c = ((n) Z.d(nVar, 2)).invoke(obj, c3482b);
        } catch (Throwable th) {
            c2804c = new C2804C(th, false, 2, null);
        }
        if (c2804c == Q5.b.e()) {
            return Q5.b.e();
        }
        Object n02 = c3482b.n0(c2804c);
        if (n02 == G0.f31701b) {
            return Q5.b.e();
        }
        if (!(n02 instanceof C2804C)) {
            return G0.h(n02);
        }
        throw ((C2804C) n02).f31678a;
    }

    public static final Object c(C3482B c3482b, Object obj, n nVar) {
        Object c2804c;
        try {
            c2804c = ((n) Z.d(nVar, 2)).invoke(obj, c3482b);
        } catch (Throwable th) {
            c2804c = new C2804C(th, false, 2, null);
        }
        if (c2804c == Q5.b.e()) {
            return Q5.b.e();
        }
        Object n02 = c3482b.n0(c2804c);
        if (n02 == G0.f31701b) {
            return Q5.b.e();
        }
        if (n02 instanceof C2804C) {
            Throwable th2 = ((C2804C) n02).f31678a;
            if (th2 instanceof Y0) {
                if (((Y0) th2).f31738a == c3482b) {
                    if (c2804c instanceof C2804C) {
                        throw ((C2804C) c2804c).f31678a;
                    }
                } else {
                    throw th2;
                }
            } else {
                throw th2;
            }
        } else {
            c2804c = G0.h(n02);
        }
        return c2804c;
    }
}
