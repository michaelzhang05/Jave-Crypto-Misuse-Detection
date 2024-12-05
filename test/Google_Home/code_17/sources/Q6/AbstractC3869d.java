package q6;

import a6.InterfaceC1668n;

/* renamed from: q6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC3869d {

    /* renamed from: a */
    private static final C3865F f38387a = new C3865F("CLOSED");

    public static final AbstractC3870e b(AbstractC3870e abstractC3870e) {
        while (true) {
            Object f8 = abstractC3870e.f();
            if (f8 == f38387a) {
                return abstractC3870e;
            }
            AbstractC3870e abstractC3870e2 = (AbstractC3870e) f8;
            if (abstractC3870e2 == null) {
                if (abstractC3870e.j()) {
                    return abstractC3870e;
                }
            } else {
                abstractC3870e = abstractC3870e2;
            }
        }
    }

    public static final Object c(AbstractC3862C abstractC3862C, long j8, InterfaceC1668n interfaceC1668n) {
        while (true) {
            if (abstractC3862C.f38361c < j8 || abstractC3862C.h()) {
                Object f8 = abstractC3862C.f();
                if (f8 == f38387a) {
                    return AbstractC3863D.a(f38387a);
                }
                AbstractC3862C abstractC3862C2 = (AbstractC3862C) ((AbstractC3870e) f8);
                if (abstractC3862C2 == null) {
                    abstractC3862C2 = (AbstractC3862C) interfaceC1668n.invoke(Long.valueOf(abstractC3862C.f38361c + 1), abstractC3862C);
                    if (abstractC3862C.l(abstractC3862C2)) {
                        if (abstractC3862C.h()) {
                            abstractC3862C.k();
                        }
                    }
                }
                abstractC3862C = abstractC3862C2;
            } else {
                return AbstractC3863D.a(abstractC3862C);
            }
        }
    }
}
