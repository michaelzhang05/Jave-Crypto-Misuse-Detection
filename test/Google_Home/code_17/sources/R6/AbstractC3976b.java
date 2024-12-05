package r6;

import O5.s;
import O5.t;
import S5.d;
import S5.g;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Z;
import l6.C3339C;
import l6.G0;
import l6.Y0;
import q6.C3861B;
import q6.J;

/* renamed from: r6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3976b {
    public static final void a(InterfaceC1668n interfaceC1668n, Object obj, d dVar) {
        d a8 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c8 = J.c(context, null);
            try {
                Object invoke = ((InterfaceC1668n) Z.d(interfaceC1668n, 2)).invoke(obj, a8);
                if (invoke != T5.b.e()) {
                    a8.resumeWith(s.b(invoke));
                }
            } finally {
                J.a(context, c8);
            }
        } catch (Throwable th) {
            s.a aVar = s.f8302b;
            a8.resumeWith(s.b(t.a(th)));
        }
    }

    public static final Object b(C3861B c3861b, Object obj, InterfaceC1668n interfaceC1668n) {
        Object c3339c;
        try {
            c3339c = ((InterfaceC1668n) Z.d(interfaceC1668n, 2)).invoke(obj, c3861b);
        } catch (Throwable th) {
            c3339c = new C3339C(th, false, 2, null);
        }
        if (c3339c == T5.b.e()) {
            return T5.b.e();
        }
        Object m02 = c3861b.m0(c3339c);
        if (m02 == G0.f34553b) {
            return T5.b.e();
        }
        if (!(m02 instanceof C3339C)) {
            return G0.h(m02);
        }
        throw ((C3339C) m02).f34530a;
    }

    public static final Object c(C3861B c3861b, Object obj, InterfaceC1668n interfaceC1668n) {
        Object c3339c;
        try {
            c3339c = ((InterfaceC1668n) Z.d(interfaceC1668n, 2)).invoke(obj, c3861b);
        } catch (Throwable th) {
            c3339c = new C3339C(th, false, 2, null);
        }
        if (c3339c == T5.b.e()) {
            return T5.b.e();
        }
        Object m02 = c3861b.m0(c3339c);
        if (m02 == G0.f34553b) {
            return T5.b.e();
        }
        if (m02 instanceof C3339C) {
            Throwable th2 = ((C3339C) m02).f34530a;
            if (th2 instanceof Y0) {
                if (((Y0) th2).f34590a == c3861b) {
                    if (c3339c instanceof C3339C) {
                        throw ((C3339C) c3339c).f34530a;
                    }
                } else {
                    throw th2;
                }
            } else {
                throw th2;
            }
        } else {
            c3339c = G0.h(m02);
        }
        return c3339c;
    }
}
